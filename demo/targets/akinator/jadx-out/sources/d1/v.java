package d1;

import p0.q1;
import p0.r4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v extends a {

    /* renamed from: b, reason: collision with root package name */
    public final r4 f51714b;

    public v(r4 r4Var) {
        this.f51714b = r4Var;
    }

    @Override // d1.a
    public int groupKeyOf(p0.b bVar) {
        r4 r4Var = this.f51714b;
        return r4Var.groupKey(r4Var.getTable$runtime().anchorIndex(bVar));
    }

    @Override // d1.a
    public q1 sourceInformationOf(p0.b bVar) {
        r4 r4Var = this.f51714b;
        return r4Var.getTable$runtime().sourceInformationOf(r4Var.getTable$runtime().anchorIndex(bVar));
    }
}
