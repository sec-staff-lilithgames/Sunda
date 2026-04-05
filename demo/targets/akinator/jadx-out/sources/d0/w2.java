package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w2 extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s2 f51654e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f0.o f51655f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(s2 s2Var, f0.o oVar) {
        super(3);
        this.f51654e = s2Var;
        this.f51655f = oVar;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final e1.v invoke(e1.v composed, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(-353972293);
        s2 s2Var = this.f51654e;
        if (s2Var == null) {
            s2Var = q3.f51575a;
        }
        t2 t2VarRememberUpdatedInstance = s2Var.rememberUpdatedInstance(this.f51655f, wVar, 0);
        wVar.startReplaceableGroup(1157296644);
        boolean zChanged = wVar.changed(t2VarRememberUpdatedInstance);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = new x2(t2VarRememberUpdatedInstance);
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        x2 x2Var = (x2) objRememberedValue;
        wVar.endReplaceableGroup();
        return x2Var;
    }
}
