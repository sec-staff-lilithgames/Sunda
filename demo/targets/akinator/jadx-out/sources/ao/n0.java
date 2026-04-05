package ao;

import io.odeeo.internal.c.b;
import io.odeeo.internal.q0.o;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class n0 implements io.bidmachine.media3.common.util.k, o.a, io.bidmachine.media3.common.util.w, com.google.android.exoplayer2.util.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7731b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IOException f7732c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f7733e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7734f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f7735g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f7736h;

    public /* synthetic */ n0(Object obj, Object obj2, Object obj3, IOException iOException, boolean z10, int i10) {
        this.f7731b = i10;
        this.f7734f = obj;
        this.f7735g = obj2;
        this.f7736h = obj3;
        this.f7732c = iOException;
        this.f7733e = z10;
    }

    @Override // io.bidmachine.media3.common.util.k, com.google.android.exoplayer2.util.h
    public void accept(Object obj) {
        r0 r0Var = (r0) this.f7734f;
        ((s0) obj).onLoadError(r0Var.f7805a, r0Var.f7806b, (b0) this.f7735g, (g0) this.f7736h, this.f7732c, this.f7733e);
    }

    @Override // io.odeeo.internal.q0.o.a
    public void invoke(Object obj) {
        switch (this.f7731b) {
            case 1:
                ((io.odeeo.internal.c.b) obj).onLoadError((b.a) this.f7734f, (io.odeeo.internal.a0.n) this.f7735g, (io.odeeo.internal.a0.q) this.f7736h, this.f7732c, this.f7733e);
                break;
            case 2:
                ((on.c0) ((on.d) obj)).onLoadError((on.b) this.f7734f, (b0) this.f7735g, (g0) this.f7736h, this.f7732c, this.f7733e);
                break;
            default:
                ((zd.z) ((zd.d) obj)).onLoadError((zd.b) this.f7734f, (bf.t) this.f7735g, (bf.y) this.f7736h, this.f7732c, this.f7733e);
                break;
        }
    }
}
