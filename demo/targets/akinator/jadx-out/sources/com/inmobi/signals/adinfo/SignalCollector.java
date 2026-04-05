package com.inmobi.signals.adinfo;

import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.inmobi.media.C3060wd;
import com.inmobi.media.C3077xd;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.e0;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class SignalCollector {
    public static final C3060wd Companion = new C3060wd();
    private static final String TAG = "SignalCollector";
    private final AppLovinCommunicator communicator;
    private AppLovinCommunicatorSubscriber communicatorSubscriber;
    private final List<String> listOfTopics;

    public SignalCollector(List<String> listOfTopics) {
        e0.checkNotNullParameter(listOfTopics, "listOfTopics");
        this.listOfTopics = listOfTopics;
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance();
        e0.checkNotNullExpressionValue(appLovinCommunicator, "getInstance(...)");
        this.communicator = appLovinCommunicator;
    }

    private final AppLovinCommunicatorSubscriber createSubscriber(p pVar) {
        return new C3077xd(pVar);
    }

    public final List<String> getListOfTopics() {
        return this.listOfTopics;
    }

    public final void setupAppLovinCommunicator(p onEvent) {
        e0.checkNotNullParameter(onEvent, "onEvent");
        try {
            AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriberCreateSubscriber = createSubscriber(onEvent);
            this.communicatorSubscriber = appLovinCommunicatorSubscriberCreateSubscriber;
            this.communicator.subscribe(appLovinCommunicatorSubscriberCreateSubscriber, this.listOfTopics);
            Objects.toString(this.listOfTopics);
        } catch (Error | Exception unused) {
        }
    }
}
