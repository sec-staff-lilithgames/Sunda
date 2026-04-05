package com.inmobi.media;

import android.net.Network;
import android.os.SystemClock;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.CrashConfig;
import com.unity3d.services.UnityAdsConstants;
import java.net.InetAddress;
import java.util.LinkedHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.t3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2999t3 implements P2 {

    /* renamed from: a, reason: collision with root package name */
    public static AdConfig.CustomNetworkValidation f33379a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile Network f33380b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f33381c;

    /* renamed from: d, reason: collision with root package name */
    public static long f33382d;

    /* renamed from: e, reason: collision with root package name */
    public static long f33383e;

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicBoolean f33384f;

    static {
        C2999t3 c2999t3 = new C2999t3();
        LinkedHashMap linkedHashMap = Q2.f32149a;
        Config configA = O2.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, C2925od.b(), c2999t3);
        kotlin.jvm.internal.e0.checkNotNull(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig");
        f33379a = ((AdConfig) configA).getCustomNwValidation();
        f33381c = true;
        f33384f = new AtomicBoolean(false);
    }

    public static void a(Network network) {
        long nonValidatedExpiry;
        long j10 = f33383e;
        if (j10 != 0) {
            ScheduledExecutorService scheduledExecutorService = AbstractC2809hf.f32906a;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
            AdConfig.CustomNetworkValidation customNetworkValidation = f33379a;
            if (jElapsedRealtime < (customNetworkValidation != null ? customNetworkValidation.getRefreshDebounceTime() : 1000L)) {
                return;
            }
        }
        f33383e = SystemClock.elapsedRealtime();
        if (kotlin.jvm.internal.e0.areEqual(f33380b, network)) {
            long j11 = f33382d;
            ScheduledExecutorService scheduledExecutorService2 = AbstractC2809hf.f32906a;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - j11;
            if (f33381c) {
                AdConfig.CustomNetworkValidation customNetworkValidation2 = f33379a;
                nonValidatedExpiry = customNetworkValidation2 != null ? customNetworkValidation2.getValidatedExpiry() : UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
            } else {
                AdConfig.CustomNetworkValidation customNetworkValidation3 = f33379a;
                nonValidatedExpiry = customNetworkValidation3 != null ? customNetworkValidation3.getNonValidatedExpiry() : CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
            }
            if (jElapsedRealtime2 <= nonValidatedExpiry) {
                return;
            }
        }
        if (f33384f.compareAndSet(false, true)) {
            ((ScheduledThreadPoolExecutor) F4.f31771c.getValue()).execute(new zg.h(network, 19));
        }
    }

    public static final void b(Network network) {
        AdConfig.CustomNetworkValidation customNetworkValidation;
        String urlDomain;
        kotlin.jvm.internal.e0.checkNotNullParameter(network, "$network");
        try {
            try {
                customNetworkValidation = f33379a;
            } finally {
                f33384f.set(false);
            }
        } catch (Exception unused) {
        }
        boolean z10 = (customNetworkValidation == null || (urlDomain = customNetworkValidation.getUrlDomain()) == null) ? false : !kotlin.jvm.internal.e0.areEqual(InetAddress.getByName(urlDomain).toString(), "");
        try {
            f33381c = z10;
            f33380b = network;
            f33382d = SystemClock.elapsedRealtime();
        } catch (Exception e10) {
            Y5 y52 = Y5.f32563a;
            C2796h2 event = new C2796h2(e10);
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            Y5.f32566d.a(event);
        }
    }

    @Override // com.inmobi.media.P2
    public final void a(Config config) {
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        if (config instanceof AdConfig) {
            f33379a = ((AdConfig) config).getCustomNwValidation();
        }
    }
}
