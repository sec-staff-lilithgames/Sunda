package com.inmobi.media;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.nf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2910nf {

    /* renamed from: d, reason: collision with root package name */
    public static final int f33165d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f33166e;

    /* renamed from: f, reason: collision with root package name */
    public static final ThreadFactoryC2893mf f33167f;

    /* renamed from: g, reason: collision with root package name */
    public static final LinkedBlockingQueue f33168g;

    /* renamed from: h, reason: collision with root package name */
    public static ThreadPoolExecutor f33169h;

    /* renamed from: a, reason: collision with root package name */
    public final CountDownLatch f33170a;

    /* renamed from: b, reason: collision with root package name */
    public final X9 f33171b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f33172c;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f33165d = Math.max(2, Math.min(iAvailableProcessors - 1, 4));
        f33166e = (iAvailableProcessors * 2) + 1;
        f33167f = new ThreadFactoryC2893mf();
        f33168g = new LinkedBlockingQueue(128);
    }

    public C2910nf(C2876lf vastMediaFile, int i10, CountDownLatch countDownLatch) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vastMediaFile, "vastMediaFile");
        X9 x92 = new X9(vastMediaFile.f33060a, null);
        this.f33171b = x92;
        x92.f32511t = false;
        x92.f32512u = false;
        x92.f32515x = false;
        x92.f32507p = i10;
        x92.f32510s = true;
        this.f33172c = new WeakReference(vastMediaFile);
        this.f33170a = countDownLatch;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f33165d, f33166e, 30L, TimeUnit.SECONDS, f33168g, f33167f);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f33169h = threadPoolExecutor;
    }

    public final void a() {
        ThreadPoolExecutor threadPoolExecutor = f33169h;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.execute(new zg.h(this, 16));
        }
    }

    public static final void a(C2910nf this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        try {
            Z9 z9B = this$0.f33171b.b();
            if (!z9B.b()) {
                this$0.a(z9B);
                return;
            }
            CountDownLatch countDownLatch = this$0.f33170a;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        } catch (Exception unused) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("nf", "TAG");
            EnumC3017u4 errorCode = EnumC3017u4.f33422e;
            kotlin.jvm.internal.e0.checkNotNullParameter(errorCode, "errorCode");
            this$0.getClass();
            CountDownLatch countDownLatch2 = this$0.f33170a;
            if (countDownLatch2 != null) {
                countDownLatch2.countDown();
            }
        }
    }

    public final void a(Z9 z92) {
        CountDownLatch countDownLatch;
        try {
            try {
                C2876lf c2876lf = (C2876lf) this.f33172c.get();
                if (c2876lf != null) {
                    c2876lf.f33062c = (z92.f32603e * 1.0d) / ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                }
                countDownLatch = this.f33170a;
                if (countDownLatch == null) {
                    return;
                }
            } catch (Exception e10) {
                Y5 y52 = Y5.f32563a;
                C2796h2 event = new C2796h2(e10);
                kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
                Y5.f32566d.a(event);
                countDownLatch = this.f33170a;
                if (countDownLatch == null) {
                    return;
                }
            }
            countDownLatch.countDown();
        } catch (Throwable th2) {
            CountDownLatch countDownLatch2 = this.f33170a;
            if (countDownLatch2 != null) {
                countDownLatch2.countDown();
            }
            throw th2;
        }
    }
}
