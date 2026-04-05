package com.inmobi.media;

import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.inmobi.adquality.models.AdQualityResult;
import hr.kNq.ikJMrW;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.d0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2726d0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2743e0 f32726a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdQualityResult f32727b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2726d0(C2743e0 c2743e0, AdQualityResult adQualityResult) {
        super(1);
        this.f32726a = c2743e0;
        this.f32727b = adQualityResult;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        C2738dc c2738dc;
        C2738dc c2738dc2;
        String str = ikJMrW.faKd;
        S9 s92 = (S9) obj;
        if (EnumC3017u4.f33421d.equals(s92)) {
            kotlin.jvm.internal.e0.checkNotNullParameter("AdQualityBeaconExecutor", "tag");
            kotlin.jvm.internal.e0.checkNotNullParameter("no network... skipping cleanup", PglCryptUtils.KEY_MESSAGE);
            Log.i("AdQualityBeaconExecutor", "no network... skipping cleanup");
        } else {
            kotlin.jvm.internal.e0.checkNotNullParameter("AdQualityBeaconExecutor", "tag");
            kotlin.jvm.internal.e0.checkNotNullParameter("beacon hit completed... cleaning up", PglCryptUtils.KEY_MESSAGE);
            Log.i("AdQualityBeaconExecutor", "beacon hit completed... cleaning up");
            if (s92 == null) {
                WeakReference weakReference = (WeakReference) this.f32726a.f32792d.get(this.f32727b.getBeaconUrl());
                if (weakReference != null && (c2738dc2 = (C2738dc) weakReference.get()) != null) {
                    c2738dc2.f32786a.c("window.mraidview.broadcastEvent('AdReportSuccess')");
                }
            } else {
                WeakReference weakReference2 = (WeakReference) this.f32726a.f32792d.get(this.f32727b.getBeaconUrl());
                if (weakReference2 != null && (c2738dc = (C2738dc) weakReference2.get()) != null) {
                    c2738dc.f32786a.c("window.mraidview.broadcastEvent('AdReportFailed')");
                }
            }
            C2743e0 c2743e0 = this.f32726a;
            AdQualityResult result = this.f32727b;
            c2743e0.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter(result, "result");
            try {
                ScheduledExecutorService scheduledExecutorService = C2777g0.f32850a;
                C2794h0 c2794h0 = (C2794h0) AbstractC2807hd.f32899a.getValue();
                c2794h0.getClass();
                kotlin.jvm.internal.e0.checkNotNullParameter(result, "result");
                Log.i(str, "de-queueing");
                c2794h0.a("image_location=?", new String[]{result.getImageLocation()});
                if (c2794h0.f32891b != null) {
                    Log.i(str, "sending callback - dequeue");
                }
                if (result.getImageLocation().length() == 0) {
                    kotlin.jvm.internal.e0.checkNotNullParameter("AdQualityBeaconExecutor", "tag");
                    kotlin.jvm.internal.e0.checkNotNullParameter("no image to clear. clean up done.", PglCryptUtils.KEY_MESSAGE);
                    Log.i("AdQualityBeaconExecutor", "no image to clear. clean up done.");
                } else {
                    File file = new File(result.getImageLocation());
                    kotlin.jvm.internal.e0.checkNotNullParameter("AdQualityBeaconExecutor", "tag");
                    kotlin.jvm.internal.e0.checkNotNullParameter("deleting file", PglCryptUtils.KEY_MESSAGE);
                    Log.i("AdQualityBeaconExecutor", "deleting file");
                    String message = "delete file result - " + file.delete();
                    kotlin.jvm.internal.e0.checkNotNullParameter("AdQualityBeaconExecutor", "tag");
                    kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
                    Log.i("AdQualityBeaconExecutor", message);
                }
            } catch (Exception e10) {
                kotlin.jvm.internal.e0.checkNotNullParameter("AdQualityBeaconExecutor", "tag");
                kotlin.jvm.internal.e0.checkNotNullParameter("exception while cleanup", PglCryptUtils.KEY_MESSAGE);
                Log.e("AdQualityBeaconExecutor", "exception while cleanup", e10);
            }
        }
        return tu.x0.f87415a;
    }
}
