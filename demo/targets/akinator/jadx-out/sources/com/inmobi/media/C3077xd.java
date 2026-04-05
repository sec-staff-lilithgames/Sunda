package com.inmobi.media;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.xd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3077xd implements AppLovinCommunicatorSubscriber {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kv.p f33581a;

    public C3077xd(kv.p pVar) {
        this.f33581a = pVar;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public final String getCommunicatorId() {
        return "AdInfoInterceptor";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public final void onMessageReceived(AppLovinCommunicatorMessage message) {
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        Objects.toString(message.getData());
        message.getTopic();
        kv.p pVar = this.f33581a;
        Bundle messageData = message.getMessageData();
        String topic = message.getTopic();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(topic, "getTopic(...)");
        pVar.invoke(messageData, topic);
    }
}
