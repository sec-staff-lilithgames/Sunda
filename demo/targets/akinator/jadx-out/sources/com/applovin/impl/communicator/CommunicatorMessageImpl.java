package com.applovin.impl.communicator;

import a.b;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class CommunicatorMessageImpl extends Intent {

    /* renamed from: a, reason: collision with root package name */
    private final String f13798a;
    protected final Bundle data;
    protected final WeakReference<AppLovinCommunicatorPublisher> publisherRef;
    protected boolean sticky;

    public CommunicatorMessageImpl(Bundle bundle, String str, AppLovinCommunicatorPublisher appLovinCommunicatorPublisher) {
        super(str);
        this.f13798a = UUID.randomUUID().toString();
        this.publisherRef = new WeakReference<>(appLovinCommunicatorPublisher);
        this.data = bundle;
    }

    public static AppLovinCommunicatorMessage create(Bundle bundle, String str, AppLovinCommunicatorPublisher appLovinCommunicatorPublisher) {
        return create(bundle, str, appLovinCommunicatorPublisher, false);
    }

    public abstract Bundle getMessageData();

    public abstract String getPublisherId();

    public abstract String getTopic();

    public String getUniqueId() {
        return this.f13798a;
    }

    @Override // android.content.Intent
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AppLovinCommunicatorMessage{publisherId=");
        sb2.append(getPublisherId());
        sb2.append(", topic=");
        sb2.append(getTopic());
        sb2.append("', uniqueId='");
        sb2.append(this.f13798a);
        sb2.append("', data=");
        sb2.append(this.data);
        sb2.append(", sticky=");
        return b.p(sb2, this.sticky, AbstractJsonLexerKt.END_OBJ);
    }

    public static AppLovinCommunicatorMessage create(Bundle bundle, String str, AppLovinCommunicatorPublisher appLovinCommunicatorPublisher, boolean z10) {
        AppLovinCommunicatorMessage appLovinCommunicatorMessage = new AppLovinCommunicatorMessage(bundle, str, appLovinCommunicatorPublisher);
        appLovinCommunicatorMessage.sticky = z10;
        return appLovinCommunicatorMessage;
    }
}
