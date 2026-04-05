package d1;

import p0.q1;
import p0.v4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z extends a {

    /* renamed from: b, reason: collision with root package name */
    public final v4 f51725b;

    public z(v4 v4Var) {
        this.f51725b = v4Var;
    }

    @Override // d1.a
    public int groupKeyOf(p0.b bVar) {
        v4 v4Var = this.f51725b;
        return v4Var.groupKey(v4Var.anchorIndex(bVar));
    }

    @Override // d1.a
    public q1 sourceInformationOf(p0.b bVar) {
        v4 v4Var = this.f51725b;
        return v4Var.sourceInformationOf$runtime(v4Var.anchorIndex(bVar));
    }
}
