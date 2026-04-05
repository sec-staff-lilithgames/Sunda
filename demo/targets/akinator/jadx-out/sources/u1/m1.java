package u1;

import a2.a3;
import a2.g5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m1 extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f87637e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f87638f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kv.p f87639g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(Object obj, Object obj2, kv.p pVar) {
        super(3);
        this.f87637e = obj;
        this.f87638f = obj2;
        this.f87639g = pVar;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final e1.v invoke(e1.v composed, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(1175567217);
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
        p0.k1.LaunchedEffect(g1Var, this.f87637e, this.f87638f, new l1(g1Var, this.f87639g, null), wVar, 576);
        wVar.endReplaceableGroup();
        return g1Var;
    }
}
