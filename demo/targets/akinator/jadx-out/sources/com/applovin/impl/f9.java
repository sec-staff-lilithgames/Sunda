package com.applovin.impl;

import android.content.Context;
import com.inmobi.media.F5;
import com.ironsource.C3162cb;
import com.unity3d.mediation.LevelPlayAdError;
import io.odeeo.internal.r0.l;
import io.odeeo.sdk.AdUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class f9 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13985b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f13986c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13987e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f13988f;

    public /* synthetic */ f9(Object obj, long j10, Object obj2, int i10) {
        this.f13985b = i10;
        this.f13987e = obj;
        this.f13986c = j10;
        this.f13988f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        switch (this.f13985b) {
            case 0:
                ((g5) this.f13987e).a((Thread) this.f13988f, this.f13986c);
                break;
            case 1:
                C3162cb.a((C3162cb) this.f13987e, this.f13986c, (LevelPlayAdError) this.f13988f);
                break;
            case 2:
                ((l.a) this.f13987e).a(this.f13988f, this.f13986c);
                break;
            case 3:
                ((io.bidmachine.media3.exoplayer.j0) ((io.g0) io.bidmachine.media3.common.util.a1.castNonNull(((io.f0) this.f13987e).f62123b))).onRenderedFirstFrame(this.f13988f, this.f13986c);
                break;
            case 4:
                AdUnit.a((AdUnit) this.f13987e, this.f13986c, (kv.a) this.f13988f);
                break;
            case 5:
                ((com.google.android.exoplayer2.p0) ((sf.w) com.google.android.exoplayer2.util.n1.castNonNull(((sf.v) this.f13987e).f85733b))).onRenderedFirstFrame(this.f13988f, this.f13986c);
                break;
            case 6:
                ExecutorService executorService = (ExecutorService) this.f13987e;
                long j10 = this.f13986c;
                TimeUnit timeUnit = (TimeUnit) this.f13988f;
                executorService.shutdown();
                try {
                    executorService.awaitTermination(j10, timeUnit);
                    break;
                } catch (InterruptedException unused) {
                    return;
                }
            default:
                com.inmobi.media.r.a((F5) this.f13987e, (Context) this.f13988f, this.f13986c);
                break;
        }
    }

    public /* synthetic */ f9(Object obj, Object obj2, long j10, int i10) {
        this.f13985b = i10;
        this.f13987e = obj;
        this.f13988f = obj2;
        this.f13986c = j10;
    }
}
