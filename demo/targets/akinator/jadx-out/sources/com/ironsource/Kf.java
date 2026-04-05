package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Kf {

    /* renamed from: a, reason: collision with root package name */
    public static final Kf f34769a = new Kf();

    private Kf() {
    }

    public final String a(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        return C1.a(context, c(context));
    }

    public final String b(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        return C1.b(context, c(context));
    }

    public final String c(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        return C1.g(context);
    }

    public final ConcurrentHashMap<String, List<String>> d() {
        ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.putAll(com.ironsource.mediationsdk.c.b().d());
        concurrentHashMap.putAll(C3360na.b().c());
        return concurrentHashMap;
    }

    public final void e() {
        com.ironsource.mediationsdk.r.m().R();
    }

    public final JSONObject a(boolean z10) {
        JSONObject jSONObjectB = IronSourceUtils.b(z10);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObjectB, "getMediationAdditionalData(isDemandOnlyMode)");
        return jSONObjectB;
    }

    public final JSONObject b() throws JSONException {
        JSONObject jSONObjectB = N6.a().b();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObjectB, "getProperties().toJSON()");
        return jSONObjectB;
    }

    public final JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            ConcurrentHashMap<String, AdapterBaseWrapper> networkAdaptersMap = com.ironsource.mediationsdk.c.b().e();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(networkAdaptersMap, "networkAdaptersMap");
            for (Map.Entry<String, AdapterBaseWrapper> entry : networkAdaptersMap.entrySet()) {
                if (entry.getValue().getAdapterBaseInterface() != null) {
                    Kf kf2 = f34769a;
                    String key = entry.getKey();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(key, "entry.key");
                    String strA = kf2.a(key);
                    AdapterBaseInterface adapterBaseInterface = entry.getValue().getAdapterBaseInterface();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(adapterBaseInterface, "entry.value.adapterBaseInterface");
                    String adapterVersion = adapterBaseInterface.getAdapterVersion();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(adapterVersion, "adapterBaseInterface.adapterVersion");
                    jSONObject.putOpt(strA, kf2.a(adapterVersion, adapterBaseInterface.getNetworkSDKVersion()));
                }
            }
            return jSONObject;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            return jSONObject;
        }
    }

    public final void a(InterfaceC3252hb interfaceC3252hb) {
        C3249h8.a().b(interfaceC3252hb);
    }

    public final LevelPlayAdSize b(String str, int i10, int i11) {
        if (str != null && str.length() != 0 && !kotlin.jvm.internal.e0.areEqual(str, com.ironsource.mediationsdk.l.f37559f)) {
            if (kotlin.jvm.internal.e0.areEqual(str, com.ironsource.mediationsdk.l.f37556c)) {
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            }
            return LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(str);
        }
        return LevelPlayAdSize.Companion.createCustomSize(i10, i11);
    }

    public final void a(InterfaceC3446sb interfaceC3446sb) {
        Ed.a().b(interfaceC3446sb);
    }

    public final void a(Fa fa2) {
        C3471u2.a().b(fa2);
    }

    public final int a() {
        return Mb.f34856s.d().i().c();
    }

    public final String a(C3325ld c3325ld) {
        String strC;
        return (c3325ld == null || (strC = c3325ld.c()) == null) ? new String() : strC;
    }

    public final String a(NetworkSettings networkSettings) {
        kotlin.jvm.internal.e0.checkNotNullParameter(networkSettings, "networkSettings");
        String providerDefaultInstance = networkSettings.getProviderDefaultInstance();
        return providerDefaultInstance == null ? new String() : providerDefaultInstance;
    }

    public final void b(String message) {
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        IronLog.INTERNAL.error(message);
    }

    public final boolean a(NetworkSettings networkSettings, IronSource.a adUnit) {
        kotlin.jvm.internal.e0.checkNotNullParameter(networkSettings, "networkSettings");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        return networkSettings.isBidder(adUnit);
    }

    public final ISBannerSize a(String str, int i10, int i11) {
        return new ISBannerSize(str, i10, i11);
    }

    public final com.ironsource.mediationsdk.q a(Activity activity, ISBannerSize size) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.e0.checkNotNullParameter(size, "size");
        com.ironsource.mediationsdk.q qVarB = com.ironsource.mediationsdk.r.m().b(activity, size);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(qVarB, "getInstance().createBanner(activity, size)");
        return qVarB;
    }

    public final void a(D5 event, JSONObject data) {
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
        C3147be.i().a(new C5(event, data));
    }

    private final JSONObject a(String str, String str2) {
        return new JSONObject(uu.p1.mapOf(tu.e0.to(Df.f34206b, str), tu.e0.to("sdkVersion", str2)));
    }

    public final String a(String key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        try {
        } catch (Exception e10) {
            e = e10;
        }
        try {
            if (!sv.n0.contains$default((CharSequence) key, (CharSequence) "-", false, 2, (Object) null)) {
                return !sv.n0.contains$default((CharSequence) key, (CharSequence) "_", false, 2, (Object) null) ? key : (String) uu.y0.first(sv.n0.split$default((CharSequence) key, new String[]{"_"}, false, 0, 6, (Object) null));
            }
            String str = (String) uu.y0.last(sv.n0.split$default((CharSequence) key, new String[]{"-"}, false, 0, 6, (Object) null));
            return !sv.n0.contains$default((CharSequence) str, (CharSequence) "_", false, 2, (Object) null) ? str : (String) uu.y0.first(sv.n0.split$default((CharSequence) str, new String[]{"_"}, false, 0, 6, (Object) null));
        } catch (Exception e11) {
            e = e11;
            Exception exc = e;
            C3422r4.d().a(exc);
            IronLog.INTERNAL.error(exc.getMessage());
            return key;
        }
    }
}
