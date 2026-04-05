package com.applovin.impl;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.b6;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import io.ktor.client.utils.CacheControl;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class j implements AppLovinCommunicatorSubscriber {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f14155a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f14156b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final LinkedHashMap f14157c = new a();

    /* renamed from: d, reason: collision with root package name */
    private final Set f14158d = Collections.synchronizedSet(new HashSet());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends LinkedHashMap {
        public a() {
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > 16;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {
        void onCreativeIdGenerated(String str, String str2);
    }

    public j(com.applovin.impl.sdk.k kVar) {
        this.f14155a = kVar;
        if (c()) {
            AppLovinCommunicator.getInstance(com.applovin.impl.sdk.k.o()).subscribe(this, "safedk_ad_info");
        }
    }

    public void b(b bVar) {
        this.f14158d.remove(bVar);
    }

    public void c(String str) {
        this.f14155a.O();
        if (com.applovin.impl.sdk.o.a()) {
            b0.e2.y("Removing ad info for serve id: ", str, this.f14155a.O(), "AdReviewManager");
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f14156b) {
            this.f14157c.remove(str);
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "j";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle bundle = appLovinCommunicatorMessage.getMessageData().getBundle(CacheControl.PUBLIC);
            if (bundle == null) {
                this.f14155a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14155a.O().k("AdReviewManager", "Received SafeDK ad info without public data");
                    return;
                }
                return;
            }
            Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle(CacheControl.PRIVATE);
            if (bundle2 == null) {
                this.f14155a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14155a.O().k("AdReviewManager", "Received SafeDK ad info without private data");
                    return;
                }
                return;
            }
            if (MaxAdFormat.formatFromString(bundle2.getString("ad_format")) == null) {
                this.f14155a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14155a.O().k("AdReviewManager", "Received SafeDK ad info without ad format");
                    return;
                }
                return;
            }
            String string = bundle2.getString("id");
            if (TextUtils.isEmpty(string)) {
                this.f14155a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14155a.O().k("AdReviewManager", "Received SafeDK ad info without serve id");
                    return;
                }
                return;
            }
            synchronized (this.f14156b) {
                try {
                    this.f14155a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f14155a.O().a("AdReviewManager", "Storing current SafeDK ad info for serve id: " + string + ", public data: " + bundle);
                    }
                    this.f14157c.put(string, bundle);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            String string2 = bundle.getString("ad_review_creative_id");
            this.f14155a.O();
            if (com.applovin.impl.sdk.o.a()) {
                b0.e2.y("Received SafeDK ad info with Ad Review creative id: ", string2, this.f14155a.O(), "AdReviewManager");
            }
            if (!StringUtils.isValidString(string2) || this.f14158d.isEmpty()) {
                return;
            }
            HashSet hashSet = new HashSet(this.f14158d);
            this.f14155a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f14155a.O().a("AdReviewManager", "Notifying listeners: " + this.f14158d);
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                this.f14155a.r0().a((g5) new p6(this.f14155a, "creativeIdGenerated", new al.a(6, this, (b) it.next(), string, string2)), b6.b.OTHER);
            }
        }
    }

    public static String b() {
        return b("getVersion");
    }

    public Bundle a(String str) {
        Bundle bundle;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f14156b) {
            bundle = (Bundle) this.f14157c.get(str);
        }
        this.f14155a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f14155a.O().a("AdReviewManager", "Retrieved ad info (" + bundle + ") for serve id: " + str);
        }
        return bundle;
    }

    private static String b(String str) {
        Class<?> cls;
        try {
            try {
                cls = Class.forName("com.applovin.quality.AppLovinQualityService");
            } catch (Throwable unused) {
                cls = Class.forName("com.safedk.android.SafeDK");
            }
            return (String) cls.getMethod(str, null).invoke(null, null);
        } catch (Throwable unused2) {
            return "";
        }
    }

    public void a(b bVar) {
        this.f14158d.add(bVar);
    }

    public static String a() {
        return b("getSdkKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar, String str, String str2) {
        this.f14155a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f14155a.O().a("AdReviewManager", "Notifying Ad Review creative id generated for listener: " + bVar);
        }
        bVar.onCreativeIdGenerated(str, str2);
    }

    public static boolean c() {
        return StringUtils.isValidString(b());
    }
}
