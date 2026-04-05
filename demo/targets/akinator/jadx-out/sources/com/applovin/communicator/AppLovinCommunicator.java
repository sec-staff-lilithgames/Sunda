package com.applovin.communicator;

import android.content.Context;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.d5;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class AppLovinCommunicator {

    /* renamed from: e, reason: collision with root package name */
    private static AppLovinCommunicator f13380e;

    /* renamed from: f, reason: collision with root package name */
    private static final Object f13381f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f13382g = 0;

    /* renamed from: a, reason: collision with root package name */
    private k f13383a;

    /* renamed from: b, reason: collision with root package name */
    private o f13384b;

    /* renamed from: c, reason: collision with root package name */
    private final d5 f13385c = new d5();

    /* renamed from: d, reason: collision with root package name */
    private final MessagingServiceImpl f13386d = new MessagingServiceImpl();

    public static AppLovinCommunicator getInstance() {
        return getInstance(k.o());
    }

    public void a(k kVar) {
        this.f13383a = kVar;
        this.f13384b = kVar.O();
        a("Attached SDK instance: " + kVar + APSSharedUtil.TRUNCATE_SEPARATOR);
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.f13386d;
    }

    public boolean hasSubscriber(String str) {
        return this.f13385c.a(str);
    }

    public boolean respondsToTopic(String str) {
        return this.f13383a.u().a(str);
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public String toString() {
        return "AppLovinCommunicator{sdk=" + this.f13383a + AbstractJsonLexerKt.END_OBJ;
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    @Deprecated
    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (f13381f) {
            try {
                if (f13380e == null) {
                    f13380e = new AppLovinCommunicator();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f13380e;
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            if (this.f13385c.a(appLovinCommunicatorSubscriber, str)) {
                this.f13386d.maybeSendStickyMessages(str);
            } else {
                a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + str);
            }
        }
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + str);
            this.f13385c.b(appLovinCommunicatorSubscriber, str);
        }
    }

    private void a(String str) {
        if (this.f13384b == null || !o.a()) {
            return;
        }
        this.f13384b.a("AppLovinCommunicator", str);
    }
}
