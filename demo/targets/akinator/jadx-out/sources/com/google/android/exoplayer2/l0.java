package com.google.android.exoplayer2;

import io.odeeo.internal.b.l0;
import io.odeeo.internal.c.b;
import io.odeeo.internal.q0.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class l0 implements com.google.android.exoplayer2.util.a0, io.bidmachine.media3.common.util.w, o.a, wd.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27622b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27623c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f27624e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f27625f;

    public /* synthetic */ l0(int i10, Object obj, Object obj2, int i11) {
        this.f27622b = i11;
        this.f27623c = i10;
        this.f27624e = obj;
        this.f27625f = obj2;
    }

    @Override // wd.b
    public Object execute() {
        ud.h hVar = (ud.h) this.f27624e;
        hVar.f88430d.schedule((md.d0) this.f27625f, this.f27623c + 1);
        return null;
    }

    @Override // com.google.android.exoplayer2.util.a0
    public void invoke(Object obj) {
        int i10 = this.f27622b;
        int i11 = this.f27623c;
        Object obj2 = this.f27625f;
        Object obj3 = this.f27624e;
        switch (i10) {
            case 0:
                p2 p2Var = (p2) obj;
                int i12 = r0.f27961y0;
                p2Var.onPositionDiscontinuity(i11);
                p2Var.onPositionDiscontinuity((q2) obj3, (q2) obj2, i11);
                break;
            case 1:
                gn.g1 g1Var = (gn.g1) obj;
                int i13 = io.bidmachine.media3.exoplayer.l0.A0;
                g1Var.onPositionDiscontinuity(i11);
                g1Var.onPositionDiscontinuity((gn.h1) obj3, (gn.h1) obj2, i11);
                break;
            case 2:
                io.odeeo.internal.b.p.a(i11, (l0.f) obj3, (l0.f) obj2, (l0.c) obj);
                break;
            case 3:
                ((io.odeeo.internal.c.b) obj).onMediaItemTransition((b.a) obj3, (io.odeeo.internal.b.z) obj2, i11);
                break;
            case 4:
                ((on.c0) ((on.d) obj)).onMediaItemTransition((on.b) obj3, (gn.p0) obj2, i11);
                break;
            default:
                ((zd.z) ((zd.d) obj)).onMediaItemTransition((zd.b) obj3, (u1) obj2, i11);
                break;
        }
    }

    public /* synthetic */ l0(Object obj, Object obj2, int i10, int i11) {
        this.f27622b = i11;
        this.f27624e = obj;
        this.f27625f = obj2;
        this.f27623c = i10;
    }
}
