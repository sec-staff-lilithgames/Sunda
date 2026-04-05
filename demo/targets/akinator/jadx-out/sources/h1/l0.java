package h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f58577e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(s sVar) {
        super(0);
        this.f58577e = sVar;
    }

    @Override // kv.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m4141invoke();
        return tu.x0.f87415a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4141invoke() {
        s sVar = this.f58577e;
        m0 focusPropertiesModifier = sVar.getFocusPropertiesModifier();
        if (focusPropertiesModifier != null) {
            focusPropertiesModifier.calculateProperties(sVar.getFocusProperties());
        }
    }
}
