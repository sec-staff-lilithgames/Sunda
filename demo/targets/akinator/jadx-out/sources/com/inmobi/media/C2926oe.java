package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.TelemetryConfig;
import com.moloco.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.oe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2926oe implements Fa, Xb, P2 {

    /* renamed from: a, reason: collision with root package name */
    public static final C2926oe f33217a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f33218b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f33219c;

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f33220d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile TelemetryConfig f33221e;

    /* renamed from: f, reason: collision with root package name */
    public static C3102z4 f33222f;

    /* renamed from: g, reason: collision with root package name */
    public static volatile Ae f33223g;

    /* renamed from: h, reason: collision with root package name */
    public static final C2909ne f33224h;

    /* renamed from: i, reason: collision with root package name */
    public static C3061we f33225i;

    static {
        C2926oe c2926oe = new C2926oe();
        f33217a = c2926oe;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("oe", "getSimpleName(...)");
        f33218b = "oe";
        List listMutableListOf = uu.p0.mutableListOf("AdLoadCalled", "AdLoadDroppedAtSDK", "AdLoadSuccessful", "AdLoadFailed", "ServerFill", "ServerNoFill", "ServerError", "AssetDownloaded", "AdShowCalled", "AdShowSuccessful", "AdShowFailed", "AdGetSignalsCalled", "AdGetSignalsSucceeded", "AdGetSignalsFailed", "UnifiedIdNetworkCallRequested", "UnifiedIdNetworkResponseFailure", "FetchApiInvoked", "FetchCallbackFailure", "AdImpressionSuccessful", "RenderSuccess", "ParseSuccess", "PageStarted", "WebViewLoadFinished", "FireAdReady", "WebViewLoadCalled", "FireAdFailed", "ResourceCacheMiss", "ResourceCacheHit", "ResourceDiskCacheFileMissing", "ResourceDiskCacheFileEvicted", "LowAvailableSpaceForCache", "WebViewRenderProcessGoneEvent", "clickStartCalled", "landingsStartSuccess", "landingsStartFailed", "browserOpenFailed", "landingsPageStarted", "landingsCompleteSuccess", "landingsCompleteFailed", "ImmersiveNotSupported", "AdNotReady", "IAPFetchFailed", "BillingClientConnectionError", "BillingClientNotCompatible", "PingFailed", "PingStarted", "PingSuccess", "CompanionWebViewLoadCalled", "CompanionWebViewLoadFailed", "CompanionFireAdReady", "CompanionFireAdFailed", "CompanionWebViewPageStarted", "CompanionWebViewLoadFinished", "AttachedToWindow");
        f33219c = listMutableListOf;
        f33220d = new AtomicBoolean(false);
        LinkedHashMap linkedHashMap = Q2.f32149a;
        Config configA = O2.a("telemetry", C2925od.b(), c2926oe);
        kotlin.jvm.internal.e0.checkNotNull(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.TelemetryConfig");
        f33221e = (TelemetryConfig) configA;
        TelemetryConfig telemetryConfig = f33221e;
        f33223g = new Ae(new C2976re(telemetryConfig.getEnabled(), telemetryConfig.getAssetConfig().isImageEnabled(), telemetryConfig.getAssetConfig().isGifEnabled(), telemetryConfig.getAssetConfig().isVideoEnabled(), telemetryConfig.isGeneralEventsDisabled(), telemetryConfig.getPriorityEventsList(), telemetryConfig.getSamplingFactor()), uu.y0.toList(listMutableListOf));
        f33224h = C2909ne.f33164a;
    }

    public static final void b(String eventType, Map keyValueMap, EnumC2993se telemetryEventType) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.e0.checkNotNullParameter(keyValueMap, "keyValueMap");
        kotlin.jvm.internal.e0.checkNotNullParameter(telemetryEventType, "telemetryEventType");
        C2925od.a(new io.bidmachine.media3.exoplayer.b1(eventType, 26, keyValueMap, telemetryEventType));
    }

    public static final void c() {
        if (f33220d.getAndSet(true)) {
            return;
        }
        C2926oe c2926oe = f33217a;
        if (V1.a(AbstractC2807hd.e(), null, null, 63) > 0) {
            c2926oe.b();
        }
        C2925od.f().a(new int[]{2, 1, 150, 152, 151}, f33224h);
        f33225i = new C3061we(f33221e);
    }

    @Override // com.inmobi.media.P2
    public final void a(Config config) {
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        if (config instanceof TelemetryConfig) {
            TelemetryConfig telemetryConfig = (TelemetryConfig) config;
            f33221e = telemetryConfig;
            f33223g = new Ae(new C2976re(telemetryConfig.getEnabled(), telemetryConfig.getAssetConfig().isImageEnabled(), telemetryConfig.getAssetConfig().isGifEnabled(), telemetryConfig.getAssetConfig().isVideoEnabled(), telemetryConfig.isGeneralEventsDisabled(), telemetryConfig.getPriorityEventsList(), telemetryConfig.getSamplingFactor()), uu.y0.toList(f33219c));
            C3061we c3061we = f33225i;
            if (c3061we != null) {
                kotlin.jvm.internal.e0.checkNotNullParameter(telemetryConfig, "telemetryConfig");
                c3061we.f33550a = telemetryConfig;
            }
        }
    }

    public final void b() {
        if (f33220d.get()) {
            C3051w4 eventConfig = f33221e.getEventConfig();
            eventConfig.f33531k = f33221e.getTelemetryUrl();
            C3102z4 c3102z4 = f33222f;
            if (c3102z4 == null) {
                f33222f = new C3102z4(AbstractC2807hd.e(), this, eventConfig, this);
            } else {
                kotlin.jvm.internal.e0.checkNotNullParameter(eventConfig, "eventConfig");
                c3102z4.f33694i = eventConfig;
            }
            C3102z4 c3102z42 = f33222f;
            if (c3102z42 != null) {
                C3051w4 c3051w4 = c3102z42.f33694i;
                if (c3102z42.f33691f.get() || c3051w4 == null) {
                    return;
                }
                c3102z42.a(c3051w4.f33523c, true);
            }
        }
    }

    public static final void c(String eventType, Map keyValueMap, EnumC2993se telemetryEventType) {
        String str;
        kotlin.jvm.internal.e0.checkNotNullParameter(eventType, "$eventType");
        kotlin.jvm.internal.e0.checkNotNullParameter(keyValueMap, "$keyValueMap");
        kotlin.jvm.internal.e0.checkNotNullParameter(telemetryEventType, "$telemetryEventType");
        Objects.toString(keyValueMap);
        Objects.toString(telemetryEventType);
        try {
            if (f33223g == null) {
                return;
            }
            C2926oe c2926oe = f33217a;
            if (a(eventType, keyValueMap, telemetryEventType)) {
                return;
            }
            Ae ae2 = f33223g;
            if (ae2 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("mTelemetryValidator");
                ae2 = null;
            }
            int iA = ae2.a(telemetryEventType, eventType);
            if (iA != 0) {
                if (iA != 1) {
                    return;
                }
                if (keyValueMap.get("samplingRate") == null) {
                    keyValueMap.put("samplingRate", 100);
                }
            } else if (keyValueMap.get("samplingRate") == null) {
                keyValueMap.put("samplingRate", Integer.valueOf(mv.d.roundToInt((1 - f33221e.getSamplingFactor()) * 100)));
            }
            int iOrdinal = telemetryEventType.ordinal();
            if (iOrdinal == 0) {
                str = "sdk";
            } else {
                if (iOrdinal != 1) {
                    throw new tu.t();
                }
                str = "template";
            }
            C3044ve c3044ve = new C3044ve(eventType, null, str);
            keyValueMap.put("eventType", c3044ve.f32425a);
            String string = UUID.randomUUID().toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
            keyValueMap.put("eventId", string);
            keyValueMap.put("isTemplateEvent", Boolean.valueOf(telemetryEventType == EnumC2993se.f33374b));
            String payload = new JSONObject(keyValueMap).toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(payload, "toString(...)");
            kotlin.jvm.internal.e0.checkNotNullParameter(payload, "payload");
            c3044ve.f32428d = payload;
            int iA2 = (V1.a(AbstractC2807hd.e(), null, null, 63) + 1) - f33221e.getMaxEventsToPersist();
            if (iA2 > 0) {
                AbstractC2807hd.e().a(iA2);
                int iA3 = AbstractC3010te.a() + iA2;
                if (iA3 != -1) {
                    AbstractC3010te.f33403b = iA3;
                    I6 i62 = AbstractC3010te.f33402a;
                    if (i62 != null) {
                        I6.a(i62, "count", iA3, false, 4, (Object) null);
                    }
                }
            }
            AbstractC2807hd.e().a(c3044ve);
            c2926oe.b();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.lang.String r5, java.util.Map r6, com.inmobi.media.EnumC2993se r7) {
        /*
            com.inmobi.media.Ae r0 = com.inmobi.media.C2926oe.f33223g
            if (r0 != 0) goto La
            java.lang.String r0 = "mTelemetryValidator"
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r0)
            r0 = 0
        La:
            r0.getClass()
            java.lang.String r1 = "telemetryEventType"
            kotlin.jvm.internal.e0.checkNotNullParameter(r7, r1)
            java.lang.String r1 = "keyValueMap"
            kotlin.jvm.internal.e0.checkNotNullParameter(r6, r1)
            java.lang.String r2 = "eventType"
            kotlin.jvm.internal.e0.checkNotNullParameter(r5, r2)
            com.inmobi.media.re r3 = r0.f31633a
            boolean r3 = r3.f33325a
            r4 = 1
            if (r3 != 0) goto L25
            goto L9d
        L25:
            int r7 = r7.ordinal()
            if (r7 == 0) goto L35
            if (r7 != r4) goto L2f
            goto L9f
        L2f:
            tu.t r5 = new tu.t
            r5.<init>()
            throw r5
        L35:
            com.inmobi.media.id r7 = r0.f31634b
            r7.getClass()
            kotlin.jvm.internal.e0.checkNotNullParameter(r6, r1)
            kotlin.jvm.internal.e0.checkNotNullParameter(r5, r2)
            com.inmobi.media.re r0 = r7.f32932a
            boolean r1 = r0.f33329e
            if (r1 == 0) goto L4f
            java.util.List r0 = r0.f33330f
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L4f
            goto L9d
        L4f:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L9f
            java.lang.String r0 = "AssetDownloaded"
            boolean r5 = kotlin.jvm.internal.e0.areEqual(r5, r0)
            if (r5 == 0) goto L9f
            java.lang.String r5 = "assetType"
            boolean r0 = r6.containsKey(r5)
            if (r0 == 0) goto L9f
            java.lang.Object r0 = r6.get(r5)
            java.lang.String r1 = "image"
            boolean r0 = kotlin.jvm.internal.e0.areEqual(r1, r0)
            if (r0 == 0) goto L78
            com.inmobi.media.re r0 = r7.f32932a
            boolean r0 = r0.f33326b
            if (r0 != 0) goto L78
            goto L9d
        L78:
            java.lang.Object r0 = r6.get(r5)
            java.lang.String r1 = "gif"
            boolean r0 = kotlin.jvm.internal.e0.areEqual(r1, r0)
            if (r0 == 0) goto L8b
            com.inmobi.media.re r0 = r7.f32932a
            boolean r0 = r0.f33327c
            if (r0 != 0) goto L8b
            goto L9d
        L8b:
            java.lang.Object r5 = r6.get(r5)
            java.lang.String r6 = "video"
            boolean r5 = kotlin.jvm.internal.e0.areEqual(r6, r5)
            if (r5 == 0) goto L9f
            com.inmobi.media.re r5 = r7.f32932a
            boolean r5 = r5.f33328d
            if (r5 != 0) goto L9f
        L9d:
            r5 = 0
            goto La0
        L9f:
            r5 = r4
        La0:
            r5 = r5 ^ r4
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2926oe.a(java.lang.String, java.util.Map, com.inmobi.media.se):boolean");
    }

    @Override // com.inmobi.media.Fa
    public final C3085y4 a() throws JSONException {
        int iA;
        String string;
        if (R3.f32183a.w() == 1) {
            iA = f33221e.getWifiConfig().a();
        } else {
            iA = f33221e.getMobileConfig().a();
        }
        List<C3044ve> mutableList = uu.y0.toMutableList((Collection) AbstractC2807hd.e().b(iA));
        if (!a("DatabaseMaxLimitReachedV2", uu.p1.emptyMap(), EnumC2993se.f33373a) && mutableList.size() < iA && AbstractC3010te.a() > 0) {
            int iA2 = AbstractC3010te.a();
            C3044ve c3044ve = new C3044ve("DatabaseMaxLimitReachedV2", null, "sdk");
            String string2 = UUID.randomUUID().toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string2, "toString(...)");
            HashMap mapHashMapOf = uu.p1.hashMapOf(tu.e0.to("eventId", string2), tu.e0.to("eventType", "DatabaseMaxLimitReachedV2"), tu.e0.to("samplingRate", 100), tu.e0.to("isTemplateEvent", Boolean.FALSE), tu.e0.to("eventLostCount", Integer.valueOf(iA2)));
            kotlin.jvm.internal.e0.checkNotNull(mapHashMapOf, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            String payload = new JSONObject(mapHashMapOf).toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(payload, "toString(...)");
            kotlin.jvm.internal.e0.checkNotNullParameter(payload, "payload");
            c3044ve.f32428d = payload;
            AbstractC3010te.f33404c = Integer.valueOf(c3044ve.f32427c);
            mutableList.add(c3044ve);
        }
        if (mutableList.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = mutableList.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((C3044ve) it.next()).f32427c));
        }
        try {
            String strB = C2925od.b();
            if (strB == null) {
                strB = "";
            }
            Map mapMutableMapOf = uu.p1.mutableMapOf(tu.e0.to("im-accid", strB), tu.e0.to("version", BuildConfig.SDK_VERSION_NAME), tu.e0.to("mk-version", C2942pd.a()), tu.e0.to("u-appbid", C2778g1.f32855a), tu.e0.to("tp", C2942pd.d()));
            String strF = C2942pd.f();
            if (strF != null) {
                mapMutableMapOf.put("tp-v", strF);
            }
            kotlin.jvm.internal.e0.checkNotNull(mapMutableMapOf, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            JSONObject jSONObject = new JSONObject(mapMutableMapOf);
            JSONArray jSONArray = new JSONArray();
            for (C3044ve c3044ve2 : mutableList) {
                if (sv.n0.trim(c3044ve2.a()).toString().length() > 0) {
                    JSONObject jSONObject2 = new JSONObject(c3044ve2.a());
                    jSONObject2.put("dts", c3044ve2.f32426b);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("payload", jSONArray);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = null;
        }
        if (string != null) {
            return new C3085y4(arrayList, string);
        }
        return null;
    }
}
