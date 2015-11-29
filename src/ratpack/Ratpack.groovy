import com.github.webservice.stub.SOAPAction
import com.github.webservice.stub.XmlParserSupport
import ratpack.exec.Promise
import ratpack.form.Form
import ratpack.groovy.template.TextTemplateModule

import static ratpack.groovy.Groovy.groovyTemplate
import static ratpack.groovy.Groovy.ratpack

ratpack {

    bindings {
        module TextTemplateModule, { TextTemplateModule.Config config -> config.staticallyCompile = true }
        add(XmlParserSupport, new XmlParserSupport())
    }

    handlers {
        post('getCountryFR') { ctx ->
            def xml = context.parse(SOAPAction.class)
            xml.then { x ->
                println "TODO"
            }
            render groovyTemplate('services/country/GetCountryByCountryCodeResponse.xml')
        }
    }
}