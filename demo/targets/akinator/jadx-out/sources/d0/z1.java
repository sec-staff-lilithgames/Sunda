package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q1.c f51693e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(q1.c cVar) {
        super(1);
        this.f51693e = cVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((h1.h0) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(h1.h0 focusProperties) {
        kotlin.jvm.internal.e0.checkNotNullParameter(focusProperties, "$this$focusProperties");
        focusProperties.setCanFocus(!q1.b.m5968equalsimpl0(this.f51693e.mo5972getInputModeaOaMEAU(), q1.b.f82390b.m5964getTouchaOaMEAU()));
    }
}
