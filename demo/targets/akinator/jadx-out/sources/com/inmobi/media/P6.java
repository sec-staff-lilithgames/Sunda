package com.inmobi.media;

import android.os.SystemClock;
import com.amazon.aps.ads.util.adview.ApsAdWebViewSupportClient;
import com.amazon.device.ads.DTBMetricReport;
import com.amazon.device.ads.DtbConstants;
import com.inmobi.commons.core.configs.TelemetryConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class P6 {
    public static void a(L6 funnelState, X6 x62, Integer num, kv.p pVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(funnelState, "funnelState");
        if (x62 == null || funnelState.f32000c <= x62.f32489f) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("plType", x62.f32484a.f32569c);
        linkedHashMap.put("impressionId", x62.f32484a.f32568b);
        linkedHashMap.put("plId", Long.valueOf(x62.f32484a.f32567a));
        linkedHashMap.put("adType", x62.f32484a.f32570d);
        linkedHashMap.put("markupType", x62.f32484a.f32571e);
        linkedHashMap.put("creativeType", x62.f32484a.f32572f);
        linkedHashMap.put("metadataBlob", x62.f32484a.f32573g);
        linkedHashMap.put("isRewarded", Boolean.valueOf(x62.f32484a.f32574h));
        String str = x62.f32490g;
        if (str == null) {
            str = x62.f32484a.f32575i;
        }
        linkedHashMap.put("trigger", str);
        linkedHashMap.put("urlType", x62.f32485b);
        if (num != null) {
            linkedHashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, num);
        }
        long j10 = x62.f32487d;
        if (j10 != 0) {
            ScheduledExecutorService scheduledExecutorService = AbstractC2809hf.f32906a;
            linkedHashMap.put(DTBMetricReport.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j10));
        }
        x62.f32489f = funnelState.f32000c;
        ((ScheduledThreadPoolExecutor) F4.f31770b.getValue()).submit(new zk.n(6, linkedHashMap, funnelState));
        if (x62.f32486c > ((TelemetryConfig.LandingPageConfig) x62.f32488e.getValue()).getMaxFunnelsToTrackPerAd() || pVar == null) {
            return;
        }
        String str2 = funnelState.f31999b;
        String str3 = x62.f32490g;
        if (str3 == null) {
            str3 = x62.f32484a.f32575i;
        }
        pVar.invoke(str2, uu.p1.mapOf(tu.e0.to("$OPENMODE", str3), tu.e0.to("$URLTYPE", x62.f32485b)));
    }

    public static String a(String str) {
        return (str == null || str.length() == 0 || !sv.n0.contains$default((CharSequence) str, (CharSequence) "://", false, 2, (Object) null)) ? "invalid" : sv.k0.startsWith(str, "inmobideeplink://", true) ? "inmobideeplink" : sv.k0.startsWith(str, "inmobinativebrowser://", true) ? "inmobinativebrowser" : sv.k0.startsWith(str, DtbConstants.HTTPS, true) ? HttpRequest.DEFAULT_SCHEME : sv.k0.startsWith(str, DtbConstants.HTTP, true) ? "http" : sv.k0.startsWith(str, "market://", true) ? ApsAdWebViewSupportClient.MARKET_SCHEME : "deeplink";
    }

    public static /* synthetic */ void a(L6 l62, X6 x62, Integer num, int i10) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        a(l62, x62, num, (kv.p) null);
    }

    public static final void a(Map keyValueMap, L6 funnelState) {
        kotlin.jvm.internal.e0.checkNotNullParameter(keyValueMap, "$keyValueMap");
        kotlin.jvm.internal.e0.checkNotNullParameter(funnelState, "$funnelState");
        keyValueMap.put("networkType", R3.x());
        String str = funnelState.f31998a;
        C2926oe c2926oe = C2926oe.f33217a;
        C2926oe.b(str, keyValueMap, EnumC2993se.f33373a);
    }
}
