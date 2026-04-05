package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r1 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h1.o0 f51587e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f51588f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(h1.o0 o0Var, p0.j2 j2Var) {
        super(0);
        this.f51587e = o0Var;
        this.f51588f = j2Var;
    }

    @Override // kv.a
    public final Boolean invoke() {
        this.f51587e.requestFocus();
        return Boolean.valueOf(((Boolean) this.f51588f.getValue()).booleanValue());
    }
}
