package u1;

import a2.a3;
import a2.g5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o1 extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object[] f87651e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kv.p f87652f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(Object[] objArr, kv.p pVar) {
        super(3);
        this.f87651e = objArr;
        this.f87652f = pVar;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final e1.v invoke(e1.v composed, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(664422852);
        s2.e eVar = (s2.e) wVar.consume(a3.getLocalDensity());
        g5 g5Var = (g5) wVar.consume(a3.getLocalViewConfiguration());
        wVar.startReplaceableGroup(1157296644);
        boolean zChanged = wVar.changed(eVar);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = new g1(g5Var, eVar);
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        g1 g1Var = (g1) objRememberedValue;
        kotlin.jvm.internal.f1 f1Var = new kotlin.jvm.internal.f1(2);
        f1Var.add(g1Var);
        f1Var.addSpread(this.f87651e);
        p0.k1.LaunchedEffect(f1Var.toArray(new Object[f1Var.size()]), (kv.p) new n1(g1Var, this.f87652f, null), wVar, 8);
        wVar.endReplaceableGroup();
        return g1Var;
    }
}
