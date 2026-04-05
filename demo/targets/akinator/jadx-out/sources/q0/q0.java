package q0;

import java.util.Collection;
import java.util.List;
import p0.v4;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q0 implements p0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f82366b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v4 f82367c;

    public q0(p0 p0Var, v4 v4Var) {
        this.f82366b = p0Var;
        this.f82367c = v4Var;
    }

    @Override // q0.p0
    public List<d1.c> buildStackTrace(Integer num) {
        List<d1.c> listBuildStackTrace = this.f82366b.buildStackTrace(null);
        v4 v4Var = this.f82367c;
        int parent = v4Var.getParent();
        return parent < 0 ? listBuildStackTrace : y0.plus((Collection) d1.b.buildTrace(v4Var, num, parent, Integer.valueOf(v4Var.parent(parent))), (Iterable) listBuildStackTrace);
    }
}
