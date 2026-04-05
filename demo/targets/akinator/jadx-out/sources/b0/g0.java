package b0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g0 extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.p f8373e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c0.j0 f8374f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(c0.j0 j0Var, kv.p pVar) {
        super(3);
        this.f8373e = pVar;
        this.f8374f = j0Var;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final e1.v invoke(e1.v composed, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(-843180607);
        wVar.startReplaceableGroup(773894976);
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        p0.v vVar = p0.v.f80515a;
        if (objRememberedValue == vVar.getEmpty()) {
            Object s0Var = new p0.s0(p0.k1.createCompositionCoroutineScope(zu.n.f98854b, wVar));
            wVar.updateRememberedValue(s0Var);
            objRememberedValue = s0Var;
        }
        wVar.endReplaceableGroup();
        CoroutineScope coroutineScope = ((p0.s0) objRememberedValue).getCoroutineScope();
        wVar.endReplaceableGroup();
        wVar.startReplaceableGroup(1157296644);
        boolean zChanged = wVar.changed(coroutineScope);
        Object objRememberedValue2 = wVar.rememberedValue();
        if (zChanged || objRememberedValue2 == vVar.getEmpty()) {
            objRememberedValue2 = new j2(this.f8374f, coroutineScope);
            wVar.updateRememberedValue(objRememberedValue2);
        }
        wVar.endReplaceableGroup();
        j2 j2Var = (j2) objRememberedValue2;
        j2Var.setListener(this.f8373e);
        e1.v vVarThen = g1.e.clipToBounds(composed).then(j2Var);
        wVar.endReplaceableGroup();
        return vVarThen;
    }
}
