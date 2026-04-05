package com.inmobi.media;

import android.app.Activity;
import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.g0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2777g0 implements P2 {

    /* renamed from: a, reason: collision with root package name */
    public static ScheduledExecutorService f32850a;

    /* renamed from: b, reason: collision with root package name */
    public static ExecutorService f32851b;

    /* renamed from: c, reason: collision with root package name */
    public static final tu.o f32852c;

    /* renamed from: d, reason: collision with root package name */
    public static C2743e0 f32853d;

    /* renamed from: e, reason: collision with root package name */
    public static AdConfig f32854e;

    static {
        C2777g0 c2777g0 = new C2777g0();
        f32852c = tu.q.lazy(C2760f0.f32827a);
        LinkedHashMap linkedHashMap = Q2.f32149a;
        Config configA = O2.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, C2925od.b(), c2777g0);
        kotlin.jvm.internal.e0.checkNotNull(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig");
        f32854e = (AdConfig) configA;
    }

    public static void a(long j10, C2725d execute) {
        kotlin.jvm.internal.e0.checkNotNullParameter(execute, "execute");
        ScheduledExecutorService scheduledExecutorService = f32850a;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(5, new Q5("AdQualityComponent-aqHandler"));
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(...)");
            f32850a = scheduledExecutorServiceNewScheduledThreadPool;
        }
        ScheduledExecutorService scheduledExecutorService2 = f32850a;
        if (scheduledExecutorService2 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("aqHandlerExecutor");
            scheduledExecutorService2 = null;
        }
        scheduledExecutorService2.schedule(new a2.d0(6, execute), j10, TimeUnit.MILLISECONDS);
    }

    public static final void b(kv.a tmp0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public static void a(C2708c execute) {
        kotlin.jvm.internal.e0.checkNotNullParameter(execute, "execute");
        ExecutorService executorService = f32851b;
        if (executorService == null || executorService.isShutdown()) {
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new Q5("AdQualityComponent-aqBeacon"));
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
            f32851b = executorServiceNewSingleThreadExecutor;
        }
        ExecutorService executorService2 = f32851b;
        if (executorService2 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("aqBeaconExecutor");
            executorService2 = null;
        }
        executorService2.submit(new a2.d0(7, execute));
    }

    public static final void a(kv.a tmp0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    @Override // com.inmobi.media.P2
    public final void a(Config config) {
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        if (config instanceof AdConfig) {
            AdConfig adConfig = (AdConfig) config;
            f32854e = adConfig;
            C2743e0 c2743e0 = f32853d;
            if (c2743e0 != null) {
                kotlin.jvm.internal.e0.checkNotNullParameter(adConfig, "adConfig");
                c2743e0.f32789a = adConfig;
                if (!c2743e0.f32790b.get()) {
                    if (adConfig.getAdQuality().getEnabled()) {
                        c2743e0.a();
                        return;
                    }
                    return;
                }
                if (!c2743e0.f32790b.get() || adConfig.getAdQuality().getEnabled()) {
                    return;
                }
                kotlin.jvm.internal.e0.checkNotNullParameter("AdQualityBeaconExecutor", "tag");
                kotlin.jvm.internal.e0.checkNotNullParameter("kill switch encountered. shut down.", PglCryptUtils.KEY_MESSAGE);
                Log.i("AdQualityBeaconExecutor", "kill switch encountered. shut down.");
                c2743e0.f32790b.set(false);
                ExecutorService executorService = f32851b;
                if (executorService != null) {
                    executorService.shutdown();
                    try {
                        try {
                            executorService.shutdownNow();
                        } catch (InterruptedException unused) {
                            executorService.shutdownNow();
                            Thread.currentThread().interrupt();
                        }
                    } catch (Exception e10) {
                        kotlin.jvm.internal.e0.checkNotNullParameter("AdQualityComponent", "tag");
                        kotlin.jvm.internal.e0.checkNotNullParameter("shutdown fail", PglCryptUtils.KEY_MESSAGE);
                        Log.e("AdQualityComponent", "shutdown fail", e10);
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    public static void a(Activity activity, GestureDetectorOnGestureListenerC3093yc renderView, String beaconUrl, boolean z10, JSONObject extras, C2738dc listener) {
        C2738dc listener2;
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        kotlin.jvm.internal.e0.checkNotNullParameter(beaconUrl, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(extras, "extras");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        C2929p0 adQualityManager = renderView.getAdQualityManager();
        adQualityManager.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.e0.checkNotNullParameter(beaconUrl, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(extras, "extras");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        C2743e0 c2743e0 = null;
        if (extras.length() > 0 && beaconUrl.length() > 0) {
            adQualityManager.f33242j = beaconUrl;
            adQualityManager.f33243k = extras;
            adQualityManager.a("report ad starting");
            if (z10) {
                adQualityManager.a("report ad capture");
                listener2 = listener;
                adQualityManager.a(activity, 0L, true, listener2);
            } else {
                listener2 = listener;
                adQualityManager.a("report ad report");
                adQualityManager.a(new AdQualityResult("", null, beaconUrl, extras.toString()), false);
            }
        } else {
            listener2 = listener;
            listener2.f32786a.c("window.mraidview.broadcastEvent('AdReportFailed')");
            adQualityManager.a((Exception) null, "Incorrect parameters for reporting. url - " + beaconUrl + " , extras - " + extras);
        }
        C2743e0 c2743e02 = f32853d;
        if (c2743e02 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("executor");
        } else {
            c2743e0 = c2743e02;
        }
        c2743e0.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(beaconUrl, "beaconUrl");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener2, "listener");
        c2743e0.f32792d.put(beaconUrl, new WeakReference(listener2));
        String creativeID = renderView.getCreativeID();
        if (creativeID.length() > 0) {
            tu.o oVar = f32852c;
            if (((CopyOnWriteArrayList) oVar.getValue()).size() < f32854e.getAdReport().getCridls()) {
                ((CopyOnWriteArrayList) oVar.getValue()).add(creativeID);
            }
        }
    }

    public static void a(GestureDetectorOnGestureListenerC3093yc view, GestureDetectorOnGestureListenerC3093yc renderView, String beaconUrl, boolean z10, JSONObject extras, C2738dc listener) {
        C2738dc listener2;
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "adView");
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        kotlin.jvm.internal.e0.checkNotNullParameter(beaconUrl, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(extras, "extras");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        C2929p0 adQualityManager = renderView.getAdQualityManager();
        adQualityManager.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(beaconUrl, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(extras, "extras");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        C2743e0 c2743e0 = null;
        if (extras.length() > 0 && beaconUrl.length() > 0) {
            adQualityManager.f33242j = beaconUrl;
            adQualityManager.f33243k = extras;
            if (z10) {
                listener2 = listener;
                adQualityManager.a(view, 0L, true, listener2);
            } else {
                listener2 = listener;
                adQualityManager.a(new AdQualityResult("", null, beaconUrl, extras.toString()), false);
            }
        } else {
            listener2 = listener;
            listener2.f32786a.c("window.mraidview.broadcastEvent('AdReportFailed')");
            adQualityManager.a((Exception) null, "Incorrect parameters for reporting. url - " + beaconUrl + " , extras - " + extras);
        }
        C2743e0 c2743e02 = f32853d;
        if (c2743e02 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("executor");
        } else {
            c2743e0 = c2743e02;
        }
        c2743e0.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(beaconUrl, "beaconUrl");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener2, "listener");
        c2743e0.f32792d.put(beaconUrl, new WeakReference(listener2));
        String creativeID = renderView.getCreativeID();
        if (creativeID.length() > 0) {
            tu.o oVar = f32852c;
            if (((CopyOnWriteArrayList) oVar.getValue()).size() < f32854e.getAdReport().getCridls()) {
                ((CopyOnWriteArrayList) oVar.getValue()).add(creativeID);
            }
        }
    }
}
