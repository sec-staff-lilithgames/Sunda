package yr;

import xr.ff;
import xr.gf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y implements gf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f95120a;

    public y(d0 d0Var) {
        this.f95120a = d0Var;
    }

    @Override // xr.gf
    public ff.b read() {
        ff.b bVar;
        synchronized (this.f95120a.f94859k) {
            bVar = new ff.b(this.f95120a.f94858j == null ? -1L : r1.windowUpdate(null, 0), (long) (this.f95120a.f94854f * 0.5f));
        }
        return bVar;
    }
}
