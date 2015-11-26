import ratpack.groovy.template.TextTemplateModule
import static ratpack.groovy.Groovy.groovyTemplate
import static ratpack.groovy.Groovy.ratpack

ratpack {

    bindings {
        module TextTemplateModule, { TextTemplateModule.Config config -> config.staticallyCompile = true }
    }

    handlers {
        post('getCountryFR') {
            render groovyTemplate('services/country/getCountryByCodeResponse.xml')
        }

    }
}