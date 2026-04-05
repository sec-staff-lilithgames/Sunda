package com.inmobi.media;

import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.c0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2709c0 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2743e0 f32696a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2709c0(C2743e0 c2743e0) {
        super(0);
        this.f32696a = c2743e0;
    }

    @Override // kv.a
    public final Object invoke() {
        C2743e0 c2743e0 = this.f32696a;
        c2743e0.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter("AdQualityBeaconExecutor", "tag");
        kotlin.jvm.internal.e0.checkNotNullParameter("beacon handler execute", PglCryptUtils.KEY_MESSAGE);
        Log.i("AdQualityBeaconExecutor", "beacon handler execute");
        c2743e0.f32790b.set(true);
        ScheduledExecutorService scheduledExecutorService = C2777g0.f32850a;
        tu.o oVar = AbstractC2807hd.f32899a;
        int iA = V1.a((C2794h0) oVar.getValue(), null, null, 63);
        C2794h0 c2794h0 = (C2794h0) oVar.getValue();
        c2794h0.getClass();
        Log.i("AdQualityDao", "peek");
        List<AdQualityResult> listA = V1.a(c2794h0, null, null, null, null, null, Integer.valueOf(iA), 31);
        if (listA.isEmpty()) {
            listA = uu.p0.emptyList();
        }
        for (AdQualityResult adQualityResult : listA) {
            if (adQualityResult != null) {
                AdConfig adConfig = c2743e0.f32789a;
                E6 e62 = new E6(adQualityResult, new Te(adConfig.getIncludeIdParams()), adConfig.getAdQuality());
                C2726d0 onBeaconHit = new C2726d0(c2743e0, adQualityResult);
                kotlin.jvm.internal.e0.checkNotNullParameter(onBeaconHit, "onBeaconHit");
                kotlin.jvm.internal.e0.checkNotNullParameter("JsonBeaconRequest", "tag");
                kotlin.jvm.internal.e0.checkNotNullParameter("hitBeacon", PglCryptUtils.KEY_MESSAGE);
                Log.i("JsonBeaconRequest", "hitBeacon");
                e62.f();
                Nc retryPolicy = new Nc(e62.f31744z.getMaxRetries(), e62.f31744z.getRetryInterval());
                kotlin.jvm.internal.e0.checkNotNullParameter(retryPolicy, "retryPolicy");
                e62.f32514w = retryPolicy;
                e62.a(new D6(onBeaconHit));
            }
        }
        c2743e0.f32791c.set(true);
        return tu.x0.f87415a;
    }
}
