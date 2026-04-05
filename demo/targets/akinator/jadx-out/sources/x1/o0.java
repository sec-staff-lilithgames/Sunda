package x1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface o0 extends e1.u {
    @Override // e1.u, e1.v
    /* bridge */ /* synthetic */ default boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // e1.u, e1.v
    /* bridge */ /* synthetic */ default boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    @Override // e1.u, e1.v
    /* bridge */ /* synthetic */ default Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // e1.u, e1.v
    /* bridge */ /* synthetic */ default Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    default int maxIntrinsicHeight(z zVar, y measurable, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurable, "measurable");
        return g1.f91352a.maxHeight$ui_release(this, zVar, measurable, i10);
    }

    default int maxIntrinsicWidth(z zVar, y measurable, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurable, "measurable");
        return g1.f91352a.maxWidth$ui_release(this, zVar, measurable, i10);
    }

    /* renamed from: measure-3p2s80s */
    y0 mo74measure3p2s80s(a1 a1Var, w0 w0Var, long j10);

    default int minIntrinsicHeight(z zVar, y measurable, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurable, "measurable");
        return g1.f91352a.minHeight$ui_release(this, zVar, measurable, i10);
    }

    default int minIntrinsicWidth(z zVar, y measurable, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurable, "measurable");
        return g1.f91352a.minWidth$ui_release(this, zVar, measurable, i10);
    }

    @Override // e1.u, e1.v
    /* bridge */ /* synthetic */ default e1.v then(e1.v vVar) {
        return super.then(vVar);
    }
}
