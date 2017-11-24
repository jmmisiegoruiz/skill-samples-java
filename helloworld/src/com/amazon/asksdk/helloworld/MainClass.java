package com.amazon.asksdk.helloworld;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.io.IOUtils;

public class MainClass {
    public static void main(String[] args) throws IOException {
        HelloWorldSpeechletRequestStreamHandler handler = new HelloWorldSpeechletRequestStreamHandler();
        String source = "{\n"
                + "  \"session\": {\n"
                + "    \"new\": true,\n"
                + "    \"sessionId\": \"SessionId.5fb45130-adbd-46e9-a7e7-731458ed58e0\",\n"
                + "    \"application\": {\n"
                + "      \"applicationId\": \"amzn1.ask.skill.4423fc0e-f163-4565-8fbb-342555ecfc78\"\n"
                + "    },\n"
                + "    \"attributes\": {},\n"
                + "    \"user\": {\n"
                + "      \"userId\": \"amzn1.ask.account.AGI2JZDANOSATIY27CVKIH3XCKPEDKC4ZI5DIMLBERUGWK3CZUKO6WIITCO3JVXQURGW3YC2LUUJLMIXWGJVVB2VRRCNFM4OY74T7KF55RLX6LBPZC5UXA4FSC5DTY6EBMENIAGTIKCJTIISWLW3NG2NX3ZIDUDU27UASG2R4HU4V5ATAV3CYQWZUGFPQMS4232MJP5OGSEIKXY\"\n"
                + "    }\n"
                + "  },\n"
                + "  \"request\": {\n"
                + "    \"type\": \"IntentRequest\",\n"
                + "    \"requestId\": \"EdwRequestId.1c30674e-04c8-4394-9122-f8ea7ca189b7\",\n"
                + "    \"intent\": {\n"
                + "      \"name\": \"HelloWorldIntent\",\n"
                + "      \"slots\": {}\n"
                + "    },\n"
                + "    \"locale\": \"en-US\",\n"
                + "    \"timestamp\": \"2017-11-22T12:19:22Z\"\n"
                + "  },\n"
                + "  \"context\": {\n"
                + "    \"AudioPlayer\": {\n"
                + "      \"playerActivity\": \"IDLE\"\n"
                + "    },\n"
                + "    \"System\": {\n"
                + "      \"application\": {\n"
                + "        \"applicationId\": \"amzn1.ask.skill.4423fc0e-f163-4565-8fbb-342555ecfc78\"\n"
                + "      },\n"
                + "      \"user\": {\n"
                + "        \"userId\": \"amzn1.ask.account.AGI2JZDANOSATIY27CVKIH3XCKPEDKC4ZI5DIMLBERUGWK3CZUKO6WIITCO3JVXQURGW3YC2LUUJLMIXWGJVVB2VRRCNFM4OY74T7KF55RLX6LBPZC5UXA4FSC5DTY6EBMENIAGTIKCJTIISWLW3NG2NX3ZIDUDU27UASG2R4HU4V5ATAV3CYQWZUGFPQMS4232MJP5OGSEIKXY\"\n"
                + "      },\n"
                + "      \"device\": {\n"
                + "        \"supportedInterfaces\": {}\n"
                + "      }\n"
                + "    }\n"
                + "  },\n"
                + "  \"version\": \"1.0\"\n"
                + "}";
        InputStream in = IOUtils.toInputStream(source, "UTF-8");
        ByteArrayOutputStream o = new ByteArrayOutputStream();
        handler.handleRequest(in, o, null);
        System.out.print(o.toString());
    }
}
