/**
    Copyright 2014-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.

    Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with the License. A copy of the License is located at

        http://aws.amazon.com/apache2.0/

    or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */
package com.amazon.asksdk.helloworld;

import com.amazon.speech.json.SpeechletRequestEnvelope;
import com.amazon.speech.speechlet.IntentRequest;
import com.amazon.speech.speechlet.LaunchRequest;
import com.amazon.speech.speechlet.SessionEndedRequest;
import com.amazon.speech.speechlet.SessionStartedRequest;
import com.amazon.speech.speechlet.SpeechletResponse;
import com.amazon.speech.speechlet.SpeechletV2;

/**
 * This sample shows how to create a simple speechlet for handling speechlet requests.
 */
public class ProxySpeechlet implements SpeechletV2 {

    private SpeechletV2 realSpeechlet;

    ProxySpeechlet() {
        this.realSpeechlet = ApplicationContextProvider.getApplicationcontext().getBean(SpeechletV2.class);
    }

    @Override
    public void onSessionStarted(SpeechletRequestEnvelope<SessionStartedRequest> speechletRequestEnvelope) {
        realSpeechlet.onSessionStarted(speechletRequestEnvelope);
    }

    @Override
    public SpeechletResponse onLaunch(SpeechletRequestEnvelope<LaunchRequest> speechletRequestEnvelope) {
        return realSpeechlet.onLaunch(speechletRequestEnvelope);
    }

    @Override
    public SpeechletResponse onIntent(SpeechletRequestEnvelope<IntentRequest> speechletRequestEnvelope) {
        return realSpeechlet.onIntent(speechletRequestEnvelope);
    }

    @Override
    public void onSessionEnded(SpeechletRequestEnvelope<SessionEndedRequest> speechletRequestEnvelope) {
        realSpeechlet.onSessionEnded(speechletRequestEnvelope);
    }
}
