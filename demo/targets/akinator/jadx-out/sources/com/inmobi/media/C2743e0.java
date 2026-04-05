package com.inmobi.media;

import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.e0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2743e0 {

    /* renamed from: a, reason: collision with root package name */
    public AdConfig f32789a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f32790b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f32791c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f32792d;

    public C2743e0(AdConfig adConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adConfig, "adConfig");
        this.f32789a = adConfig;
        this.f32790b = new AtomicBoolean(false);
        this.f32791c = new AtomicBoolean(false);
        this.f32792d = new HashMap();
        kotlin.jvm.internal.e0.checkNotNullParameter("AdQualityBeaconExecutor", "tag");
        kotlin.jvm.internal.e0.checkNotNullParameter("adding listener to dao", PglCryptUtils.KEY_MESSAGE);
        Log.i("AdQualityBeaconExecutor", "adding listener to dao");
        C2925od.a(new zg.h(this, 12));
    }

    public static final void a(C2743e0 queueUpdateListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(queueUpdateListener, "this$0");
        ScheduledExecutorService scheduledExecutorService = C2777g0.f32850a;
        C2794h0 c2794h0 = (C2794h0) AbstractC2807hd.f32899a.getValue();
        c2794h0.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(queueUpdateListener, "queueUpdateListener");
        c2794h0.f32891b = queueUpdateListener;
    }

    public final void a() {
        if (this.f32790b.get()) {
            kotlin.jvm.internal.e0.checkNotNullParameter("AdQualityBeaconExecutor", "tag");
            kotlin.jvm.internal.e0.checkNotNullParameter("executor already started. ignore.", PglCryptUtils.KEY_MESSAGE);
            Log.i("AdQualityBeaconExecutor", "executor already started. ignore.");
        } else {
            if (!this.f32789a.getAdQuality().getEnabled()) {
                kotlin.jvm.internal.e0.checkNotNullParameter("AdQualityBeaconExecutor", "tag");
                kotlin.jvm.internal.e0.checkNotNullParameter("kill switch encountered. skip", PglCryptUtils.KEY_MESSAGE);
                Log.i("AdQualityBeaconExecutor", "kill switch encountered. skip");
                return;
            }
            kotlin.jvm.internal.e0.checkNotNullParameter("AdQualityBeaconExecutor", "tag");
            kotlin.jvm.internal.e0.checkNotNullParameter("beacon executor starting", PglCryptUtils.KEY_MESSAGE);
            Log.i("AdQualityBeaconExecutor", "beacon executor starting");
            C2709c0 execute = new C2709c0(this);
            kotlin.jvm.internal.e0.checkNotNullParameter(execute, "execute");
            ScheduledExecutorService scheduledExecutorService = C2777g0.f32850a;
            C2777g0.a(new C2708c(execute));
        }
    }
}
