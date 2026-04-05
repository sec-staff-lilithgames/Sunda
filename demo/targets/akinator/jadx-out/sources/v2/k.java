package v2;

import java.util.List;
import x1.a1;
import x1.w0;
import x1.x0;
import x1.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f88912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s2.x f88913b;

    public k(a0 a0Var, s2.x xVar) {
        this.f88912a = a0Var;
        this.f88913b = xVar;
    }

    @Override // x1.x0
    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(x1.z zVar, List list, int i10) {
        return super.maxIntrinsicHeight(zVar, list, i10);
    }

    @Override // x1.x0
    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(x1.z zVar, List list, int i10) {
        return super.maxIntrinsicWidth(zVar, list, i10);
    }

    @Override // x1.x0
    /* renamed from: measure-3p2s80s */
    public final y0 mo79measure3p2s80s(a1 Layout, List<? extends w0> list, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(Layout, "$this$Layout");
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<anonymous parameter 0>");
        this.f88912a.setParentLayoutDirection(this.f88913b);
        return a1.layout$default(Layout, 0, 0, null, j.f88911e, 4, null);
    }

    @Override // x1.x0
    public /* bridge */ /* synthetic */ int minIntrinsicHeight(x1.z zVar, List list, int i10) {
        return super.minIntrinsicHeight(zVar, list, i10);
    }

    @Override // x1.x0
    public /* bridge */ /* synthetic */ int minIntrinsicWidth(x1.z zVar, List list, int i10) {
        return super.minIntrinsicWidth(zVar, list, i10);
    }
}
