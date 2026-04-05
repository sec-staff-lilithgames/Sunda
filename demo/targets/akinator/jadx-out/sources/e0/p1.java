package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p1 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c2 f53239e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(c2 c2Var) {
        super(2);
        this.f53239e = c2Var;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((p0.w) obj, ((Number) obj2).intValue());
    }

    public final o2 invoke(p0.w wVar, int i10) {
        wVar.startReplaceableGroup(830271906);
        wVar.startReplaceableGroup(1157296644);
        c2 c2Var = this.f53239e;
        boolean zChanged = wVar.changed(c2Var);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = new k2(c2Var);
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        k2 k2Var = (k2) objRememberedValue;
        wVar.endReplaceableGroup();
        return k2Var;
    }
}
