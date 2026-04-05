package ei;

import bi.y;
import e6.h0;
import ji.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final sj.b f54406a;

    public i(sj.b bVar) {
        this.f54406a = bVar;
    }

    public void setupListener(u uVar) {
        if (uVar == null) {
            f.getLogger().w("Didn't successfully register with UserMetadata for rollouts listener");
            return;
        }
        new d(uVar);
        ((y) this.f54406a).whenAvailable(new h0(4));
    }
}
