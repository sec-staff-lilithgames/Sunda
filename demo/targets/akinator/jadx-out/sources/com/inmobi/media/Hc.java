package com.inmobi.media;

import android.os.SystemClock;
import com.amazon.device.ads.DTBMetricReport;
import com.inmobi.commons.core.configs.TelemetryConfig;
import com.unity3d.ads.BuildConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Hc {

    /* renamed from: a, reason: collision with root package name */
    public final Bc f31847a;

    /* renamed from: b, reason: collision with root package name */
    public long f31848b;

    /* renamed from: c, reason: collision with root package name */
    public long f31849c;

    /* renamed from: d, reason: collision with root package name */
    public int f31850d;

    /* renamed from: e, reason: collision with root package name */
    public int f31851e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f31852f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f31853g;

    /* renamed from: h, reason: collision with root package name */
    public long f31854h;

    public Hc(Bc renderViewMetaData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderViewMetaData, "renderViewMetaData");
        this.f31847a = renderViewMetaData;
        LinkedHashMap linkedHashMap = Q2.f32149a;
        TelemetryConfig telemetryConfig = (TelemetryConfig) AbstractC3035v5.a("telemetry", "null cannot be cast to non-null type com.inmobi.commons.core.configs.TelemetryConfig", null);
        Gc gc2 = renderViewMetaData.f31687k;
        this.f31852f = new AtomicInteger(gc2 != null ? gc2.f31827a : telemetryConfig.getMaxTemplateEvents());
        this.f31853g = new AtomicBoolean(false);
    }

    public final Map a() {
        String str = this.f31847a.f31688l;
        if (str == null) {
            str = "";
        }
        Map mapMutableMapOf = uu.p1.mutableMapOf(tu.e0.to("trigger", str), tu.e0.to("plType", String.valueOf(this.f31847a.f31677a.m())), tu.e0.to("plId", String.valueOf(this.f31847a.f31677a.l())), tu.e0.to("adType", String.valueOf(this.f31847a.f31677a.b())), tu.e0.to("markupType", this.f31847a.f31678b), tu.e0.to("networkType", R3.x()), tu.e0.to("retryCount", String.valueOf(this.f31847a.f31681e)), tu.e0.to("creativeType", this.f31847a.f31682f), tu.e0.to("adPosition", String.valueOf(this.f31847a.f31685i)), tu.e0.to("isRewarded", String.valueOf(this.f31847a.f31684h)), tu.e0.to("impressionId", this.f31847a.f31679c));
        if (this.f31847a.f31680d.length() > 0) {
            mapMutableMapOf.put("metadataBlob", this.f31847a.f31680d);
        }
        return mapMutableMapOf;
    }

    public final void b() {
        String strA = a("WebViewLoadCalled");
        this.f31849c = SystemClock.elapsedRealtime();
        Map mapA = a();
        if (kotlin.jvm.internal.e0.areEqual(strA, "CompanionWebViewLoadCalled")) {
            long j10 = this.f31848b;
            ScheduledExecutorService scheduledExecutorService = AbstractC2809hf.f32906a;
            mapA.put(DTBMetricReport.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j10));
        } else {
            V0 v02 = this.f31847a.f31686j;
            if (v02 != null) {
                long j11 = v02.f32381a.f32417c;
                ScheduledExecutorService scheduledExecutorService2 = AbstractC2809hf.f32906a;
                mapA.put(DTBMetricReport.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j11));
            }
        }
        mapA.put("creativeId", this.f31847a.f31683g);
        C2926oe c2926oe = C2926oe.f33217a;
        C2926oe.b(strA, mapA, EnumC2993se.f33373a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final String a(String str) {
        if (!kotlin.jvm.internal.e0.areEqual(this.f31847a.f31688l, BuildConfig.FLAVOR)) {
            switch (str.hashCode()) {
                case -1395724590:
                    if (str.equals("PageStarted")) {
                        return "CompanionWebViewPageStarted";
                    }
                    break;
                case -81019210:
                    if (str.equals("FireAdFailed")) {
                        return "CompanionFireAdFailed";
                    }
                    break;
                case 147127306:
                    if (str.equals("FireAdReady")) {
                        return "CompanionFireAdReady";
                    }
                    break;
                case 260281564:
                    if (str.equals("WebViewLoadCalled")) {
                        return "CompanionWebViewLoadCalled";
                    }
                    break;
                case 520950289:
                    if (str.equals("WebViewLoadFinished")) {
                        return "CompanionWebViewLoadFinished";
                    }
                    break;
                case 570988141:
                    if (str.equals("RenderProcessResponsive")) {
                        return "RenderProcessResponsive";
                    }
                    break;
                case 1001819046:
                    if (str.equals("RenderProcessUnResponsive")) {
                        return "CompanionRenderProcessUnResponsive";
                    }
                    break;
            }
        }
        return str;
    }
}
