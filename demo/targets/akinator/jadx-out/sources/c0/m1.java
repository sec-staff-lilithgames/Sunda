package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.p f11538e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n2 f11539f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(kv.p pVar, n2 n2Var) {
        super(1);
        this.f11538e = pVar;
        this.f11539f = n2Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((m) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(m animate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animate, "$this$animate");
        this.f11538e.invoke(animate.getValue(), this.f11539f.getConvertFromVector().invoke(animate.getVelocityVector()));
    }
}
