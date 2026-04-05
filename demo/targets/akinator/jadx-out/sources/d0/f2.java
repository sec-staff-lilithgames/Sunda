package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f2 extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.l f51369e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(kv.l lVar) {
        super(3);
        this.f51369e = lVar;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final e1.v invoke(e1.v composed, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(1176407768);
        wVar.startReplaceableGroup(1157296644);
        kv.l lVar = this.f51369e;
        boolean zChanged = wVar.changed(lVar);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = new h2(lVar);
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        h2 h2Var = (h2) objRememberedValue;
        wVar.endReplaceableGroup();
        return h2Var;
    }
}
