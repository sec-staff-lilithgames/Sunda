package e0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q3 extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m2 f53264e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f53265f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f0.q f53266g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d2 f53267h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d0.u3 f53268i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f53269j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(m2 m2Var, boolean z10, f0.q qVar, d2 d2Var, d0.u3 u3Var, boolean z11) {
        super(3);
        this.f53264e = m2Var;
        this.f53265f = z10;
        this.f53266g = qVar;
        this.f53267h = d2Var;
        this.f53268i = u3Var;
        this.f53269j = z11;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final e1.v invoke(e1.v composed, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(-629830927);
        wVar.startReplaceableGroup(773894976);
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        p0.v vVar = p0.v.f80515a;
        if (objRememberedValue == vVar.getEmpty()) {
            p0.s0 s0Var = new p0.s0(p0.k1.createCompositionCoroutineScope(zu.n.f98854b, wVar));
            wVar.updateRememberedValue(s0Var);
            objRememberedValue = s0Var;
        }
        wVar.endReplaceableGroup();
        CoroutineScope coroutineScope = ((p0.s0) objRememberedValue).getCoroutineScope();
        wVar.endReplaceableGroup();
        boolean z10 = this.f53265f;
        Boolean boolValueOf = Boolean.valueOf(z10);
        m2 m2Var = this.f53264e;
        Object[] objArr = {coroutineScope, m2Var, null, boolValueOf};
        wVar.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i11 = 0; i11 < 4; i11++) {
            zChanged |= wVar.changed(objArr[i11]);
        }
        Object objRememberedValue2 = wVar.rememberedValue();
        if (zChanged || objRememberedValue2 == vVar.getEmpty()) {
            objRememberedValue2 = new e(coroutineScope, m2Var, null, z10);
            wVar.updateRememberedValue(objRememberedValue2);
        }
        wVar.endReplaceableGroup();
        e1.v vVar2 = e1.t.f53496b;
        e1.v vVarAccess$pointerScrollable = p3.access$pointerScrollable(d0.n1.focusGroup(vVar2).then(((e) objRememberedValue2).getModifier()), this.f53266g, this.f53264e, this.f53265f, null, this.f53267h, this.f53268i, this.f53269j, wVar, 0);
        if (this.f53269j) {
            vVar2 = l2.f53159b;
        }
        e1.v vVarThen = vVarAccess$pointerScrollable.then(vVar2);
        wVar.endReplaceableGroup();
        return vVarThen;
    }
}
