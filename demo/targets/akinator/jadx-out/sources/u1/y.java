package u1;

import a2.a3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f87696e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f87697f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(t tVar, boolean z10) {
        super(3);
        this.f87696e = tVar;
        this.f87697f = z10;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final e1.v invoke(e1.v composed, p0.w wVar, int i10) {
        e1.v vVarPointerInput;
        kotlin.jvm.internal.e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(811087536);
        z zVar = (z) wVar.consume(a3.getLocalPointerIconService());
        if (zVar == null) {
            vVarPointerInput = e1.t.f53496b;
        } else {
            boolean z10 = this.f87697f;
            Boolean boolValueOf = Boolean.valueOf(z10);
            t tVar = this.f87696e;
            vVarPointerInput = i1.pointerInput(composed, tVar, boolValueOf, new x(z10, zVar, tVar, null));
        }
        wVar.endReplaceableGroup();
        return vVarPointerInput;
    }
}
