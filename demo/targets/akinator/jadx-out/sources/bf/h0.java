package bf;

import android.util.Pair;
import com.google.android.exoplayer2.f2;
import io.bidmachine.media3.exoplayer.i1;
import io.odeeo.internal.a0.u;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class h0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9258b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9259c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9260e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ IOException f9261f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f9262g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f9263h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f9264i;

    public /* synthetic */ h0(Object obj, Object obj2, Object obj3, Object obj4, IOException iOException, boolean z10, int i10) {
        this.f9258b = i10;
        this.f9263h = obj;
        this.f9264i = obj2;
        this.f9259c = obj3;
        this.f9260e = obj4;
        this.f9261f = iOException;
        this.f9262g = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9258b) {
            case 0:
                i0 i0Var = (i0) this.f9263h;
                ((j0) this.f9264i).onLoadError(i0Var.f9271a, i0Var.f9272b, (t) this.f9259c, (y) this.f9260e, this.f9261f, this.f9262g);
                break;
            case 1:
                f2.a aVar = (f2.a) this.f9263h;
                Pair pair = (Pair) this.f9264i;
                f2.this.f27472h.onLoadError(((Integer) pair.first).intValue(), (d0) pair.second, (t) this.f9259c, (y) this.f9260e, this.f9261f, this.f9262g);
                break;
            case 2:
                ((u.a) this.f9263h).a((io.odeeo.internal.a0.u) this.f9264i, (io.odeeo.internal.a0.n) this.f9259c, (io.odeeo.internal.a0.q) this.f9260e, this.f9261f, this.f9262g);
                break;
            default:
                i1.a aVar2 = (i1.a) this.f9263h;
                Pair pair2 = (Pair) this.f9264i;
                io.bidmachine.media3.exoplayer.i1.this.f61260h.onLoadError(((Integer) pair2.first).intValue(), (ao.k0) pair2.second, (ao.b0) this.f9259c, (ao.g0) this.f9260e, this.f9261f, this.f9262g);
                break;
        }
    }
}
