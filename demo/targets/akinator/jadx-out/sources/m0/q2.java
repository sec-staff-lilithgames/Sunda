package m0;

import p0.o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q2 extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h2 f73814e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(h2 h2Var) {
        super(3);
        this.f73814e = h2Var;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final e1.v invoke(e1.v composed, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(1980580247);
        s2.e eVar = (s2.e) wVar.consume(a2.a3.getLocalDensity());
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        if (objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = o5.mutableStateOf$default(s2.v.m6964boximpl(s2.v.f85360b.m6963getZeroYbymL2g()), null, 2, null);
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        p0.j2 j2Var = (p0.j2) objRememberedValue;
        e1.v vVarAnimatedSelectionMagnifier = n0.animatedSelectionMagnifier(composed, new m2(this.f73814e, j2Var), new p2(eVar, j2Var));
        wVar.endReplaceableGroup();
        return vVarAnimatedSelectionMagnifier;
    }
}
