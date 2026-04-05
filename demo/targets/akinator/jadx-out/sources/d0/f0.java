package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f0 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f51364e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kv.a f51365f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(p0.j2 j2Var, kv.a aVar) {
        super(0);
        this.f51364e = j2Var;
        this.f51365f = aVar;
    }

    @Override // kv.a
    public final Boolean invoke() {
        return Boolean.valueOf(((Boolean) this.f51364e.getValue()).booleanValue() || ((Boolean) this.f51365f.invoke()).booleanValue());
    }
}
