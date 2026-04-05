package b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h2 implements x1.o0 {
    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    @Override // x1.o0
    public final int maxIntrinsicHeight(x1.z zVar, x1.y measurable, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurable, "measurable");
        return measurable.maxIntrinsicHeight(i10);
    }

    @Override // x1.o0
    public final int maxIntrinsicWidth(x1.z zVar, x1.y measurable, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurable, "measurable");
        return measurable.maxIntrinsicWidth(i10);
    }

    @Override // x1.o0
    /* renamed from: measure-3p2s80s */
    public abstract /* synthetic */ x1.y0 mo74measure3p2s80s(x1.a1 a1Var, x1.w0 w0Var, long j10);

    @Override // x1.o0
    public final int minIntrinsicHeight(x1.z zVar, x1.y measurable, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurable, "measurable");
        return measurable.minIntrinsicHeight(i10);
    }

    @Override // x1.o0
    public final int minIntrinsicWidth(x1.z zVar, x1.y measurable, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurable, "measurable");
        return measurable.minIntrinsicWidth(i10);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }
}
