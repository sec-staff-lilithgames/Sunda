package e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.l f53634e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(kv.l lVar) {
        super(3);
        this.f53634e = lVar;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final e1.v invoke(e1.v composed, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(1495908050);
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        if (objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = Integer.valueOf(u.f53627e.generateSemanticsId());
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        u uVar = new u(((Number) objRememberedValue).intValue(), false, true, this.f53634e);
        wVar.endReplaceableGroup();
        return uVar;
    }
}
