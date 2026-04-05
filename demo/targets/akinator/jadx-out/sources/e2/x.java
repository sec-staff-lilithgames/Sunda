package e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f53635e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kv.l f53636f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(boolean z10, kv.l lVar) {
        super(3);
        this.f53635e = z10;
        this.f53636f = lVar;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final e1.v invoke(e1.v composed, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(-140499264);
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        if (objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = Integer.valueOf(u.f53627e.generateSemanticsId());
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        u uVar = new u(((Number) objRememberedValue).intValue(), this.f53635e, false, this.f53636f);
        wVar.endReplaceableGroup();
        return uVar;
    }
}
