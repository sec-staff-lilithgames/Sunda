package x1;

import p0.a6;
import p0.q4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m0 extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1.v f91383e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(e1.v vVar) {
        super(3);
        this.f91383e = vVar;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        m7835invokeDeg8D_g(((q4) obj).m5837unboximpl(), (p0.w) obj2, ((Number) obj3).intValue());
        return tu.x0.f87415a;
    }

    /* renamed from: invoke-Deg8D_g, reason: not valid java name */
    public final void m7835invokeDeg8D_g(p0.w wVar, p0.w wVar2, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(wVar, "$this$null");
        e1.v vVarMaterialize = e1.o.materialize(wVar2, this.f91383e);
        wVar.startReplaceableGroup(509942095);
        a6.m5787setimpl(a6.m5780constructorimpl(wVar), vVarMaterialize, z1.g.Z8.getSetModifier());
        wVar.endReplaceableGroup();
    }
}
