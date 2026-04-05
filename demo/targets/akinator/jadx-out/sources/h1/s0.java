package h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s0 extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o0 f58609e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(o0 o0Var) {
        super(3);
        this.f58609e = o0Var;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final e1.v invoke(e1.v composed, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(-307396750);
        wVar.startReplaceableGroup(1157296644);
        o0 o0Var = this.f58609e;
        boolean zChanged = wVar.changed(o0Var);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = new t0(o0Var);
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        t0 t0Var = (t0) objRememberedValue;
        wVar.endReplaceableGroup();
        return t0Var;
    }
}
