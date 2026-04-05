package com.inmobi.media;

import android.os.Bundle;
import com.applovin.sdk.AppLovinSdk;
import com.inmobi.commons.core.configs.SignalsConfig;
import com.inmobi.signals.adinfo.SignalCollector;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class R7 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f32206a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public static final SignalsConfig f32207b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f32208c;

    /* renamed from: d, reason: collision with root package name */
    public static final tu.o f32209d;

    /* renamed from: e, reason: collision with root package name */
    public static final tu.o f32210e;

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f32211f;

    /* renamed from: g, reason: collision with root package name */
    public static final Q7 f32212g;

    static {
        LinkedHashMap linkedHashMap = Q2.f32149a;
        SignalsConfig signalsConfig = (SignalsConfig) AbstractC3035v5.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null);
        f32207b = signalsConfig;
        String topic = signalsConfig.getPublisherConfig().getAuto().getTopic();
        if (topic.length() == 0) {
            topic = "max_revenue_events";
        }
        f32208c = topic;
        f32209d = tu.q.lazy(P7.f32127a);
        f32210e = tu.q.lazy(O7.f32092a);
        f32212g = Q7.f32164a;
    }

    public static void a() {
        String str;
        boolean zBooleanValue;
        if (f32207b.getPublisherConfig().getAuto().getEnabled()) {
            Boolean bool = f32211f;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                try {
                    String str2 = AppLovinSdk.VERSION;
                    Object obj = AppLovinSdk.class.getField("VERSION").get(null);
                    str = obj instanceof String ? (String) obj : null;
                } catch (Throwable unused) {
                }
                if (str == null) {
                    str = com.ironsource.Y1.f35726f;
                }
                List<String> incompatibleSdkVer = f32207b.getPublisherConfig().getAuto().getIncompatibleSdkVer();
                Objects.toString(incompatibleSdkVer);
                zBooleanValue = kotlin.jvm.internal.e0.areEqual(str, com.ironsource.Y1.f35726f) || incompatibleSdkVer.contains(str);
                f32211f = Boolean.valueOf(zBooleanValue);
            }
            if (!zBooleanValue && ((Boolean) f32210e.getValue()).booleanValue()) {
                if (!(f32208c.length() == 0) && f32206a.compareAndSet(false, true)) {
                    ((SignalCollector) f32209d.getValue()).setupAppLovinCommunicator(f32212g);
                }
            }
        }
    }

    public static LinkedHashMap a(Bundle data) {
        boolean z10;
        Object obj;
        Object obj2;
        kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
        if (!f32206a.get()) {
            return null;
        }
        SignalsConfig signalsConfig = f32207b;
        if (!signalsConfig.getPublisherConfig().getAuto().getEnabled()) {
            return null;
        }
        Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeys = signalsConfig.getPublisherConfig().getAuto().getAllowedKeys();
        if (allowedKeys.isEmpty()) {
            return null;
        }
        Objects.toString(allowedKeys.keySet());
        Set<String> setKeySet = data.keySet();
        if (setKeySet.isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        kotlin.jvm.internal.e0.checkNotNull(setKeySet);
        if (setKeySet.contains("ad_format") && (obj2 = data.get("ad_format")) != null) {
            linkedHashMap.put("auto_type", obj2);
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z10);
        if (!z10) {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            return null;
        }
        for (Map.Entry<String, SignalsConfig.PublisherConfig.KeyData> entry : allowedKeys.entrySet()) {
            String key = entry.getKey();
            SignalsConfig.PublisherConfig.KeyData value = entry.getValue();
            if (setKeySet.contains(key)) {
                String name = value.getName();
                if (D2.a(name) && (obj = data.get(key)) != null) {
                    linkedHashMap.put(name, obj);
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }
}
