package com.github.webservice.stub

import com.google.common.reflect.TypeToken
import ratpack.handling.Context
import ratpack.http.TypedData
import ratpack.parse.Parse
import ratpack.parse.ParserSupport

class XmlParserSupport extends ParserSupport<XmlParserOpts> {

    private static final TypeToken<SOAPAction> XML_TYPE = TypeToken.of(SOAPAction.class)

    @Override
    def <T> T parse(Context context, TypedData requestBody, Parse<T, XmlParserOpts> parse) throws Exception {
        // TODO
        if(parse.getType().equals(XML_TYPE)) {
            def text = new XmlParser().parseText(requestBody.getText())

        }
        return null
    }
}
