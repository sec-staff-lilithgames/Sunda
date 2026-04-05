package ao;

import com.google.android.exoplayer2.q2;
import io.odeeo.internal.b.l0;
import io.odeeo.internal.c.b;
import io.odeeo.internal.q0.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class o0 implements io.bidmachine.media3.common.util.k, o.a, io.bidmachine.media3.common.util.w, com.google.android.exoplayer2.util.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7766b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7767c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7768e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7769f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f7770g;

    public /* synthetic */ o0(int i10, int i11, Object obj, Object obj2, Object obj3) {
        this.f7766b = i11;
        this.f7768e = obj;
        this.f7767c = i10;
        this.f7769f = obj2;
        this.f7770g = obj3;
    }

    @Override // io.bidmachine.media3.common.util.k, com.google.android.exoplayer2.util.h
    public void accept(Object obj) {
        r0 r0Var = (r0) this.f7768e;
        ((s0) obj).onLoadStarted(r0Var.f7805a, r0Var.f7806b, (b0) this.f7769f, (g0) this.f7770g, this.f7767c);
    }

    @Override // io.odeeo.internal.q0.o.a
    public void invoke(Object obj) {
        switch (this.f7766b) {
            case 1:
                io.odeeo.internal.c.a.a((b.a) this.f7768e, this.f7767c, (l0.f) this.f7769f, (l0.f) this.f7770g, (io.odeeo.internal.c.b) obj);
                break;
            case 2:
                on.b bVar = (on.b) this.f7768e;
                b0 b0Var = (b0) this.f7769f;
                g0 g0Var = (g0) this.f7770g;
                on.c0 c0Var = (on.c0) ((on.d) obj);
                c0Var.onLoadStarted(bVar, b0Var, g0Var);
                c0Var.onLoadStarted(bVar, b0Var, g0Var, this.f7767c);
                break;
            case 3:
                on.b bVar2 = (on.b) this.f7768e;
                gn.h1 h1Var = (gn.h1) this.f7769f;
                gn.h1 h1Var2 = (gn.h1) this.f7770g;
                on.c0 c0Var2 = (on.c0) ((on.d) obj);
                int i10 = this.f7767c;
                c0Var2.onPositionDiscontinuity(bVar2, i10);
                c0Var2.onPositionDiscontinuity(bVar2, h1Var, h1Var2, i10);
                break;
            default:
                zd.b bVar3 = (zd.b) this.f7768e;
                q2 q2Var = (q2) this.f7769f;
                q2 q2Var2 = (q2) this.f7770g;
                zd.z zVar = (zd.z) ((zd.d) obj);
                int i11 = this.f7767c;
                zVar.onPositionDiscontinuity(bVar3, i11);
                zVar.onPositionDiscontinuity(bVar3, q2Var, q2Var2, i11);
                break;
        }
    }

    public /* synthetic */ o0(Object obj, b0 b0Var, g0 g0Var, int i10, int i11) {
        this.f7766b = i11;
        this.f7768e = obj;
        this.f7769f = b0Var;
        this.f7770g = g0Var;
        this.f7767c = i10;
    }
}
