package a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f3852e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(t tVar) {
        super(1);
        this.f3852e = tVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m60invokeiuPiT84(((q1.b) obj).m5971unboximpl());
    }

    /* renamed from: invoke-iuPiT84, reason: not valid java name */
    public final Boolean m60invokeiuPiT84(int i10) {
        q1.a aVar = q1.b.f82390b;
        boolean zM5968equalsimpl0 = q1.b.m5968equalsimpl0(i10, aVar.m5964getTouchaOaMEAU());
        t tVar = this.f3852e;
        return Boolean.valueOf(zM5968equalsimpl0 ? tVar.isInTouchMode() : q1.b.m5968equalsimpl0(i10, aVar.m5963getKeyboardaOaMEAU()) ? tVar.isInTouchMode() ? tVar.requestFocusFromTouch() : true : false);
    }
}
