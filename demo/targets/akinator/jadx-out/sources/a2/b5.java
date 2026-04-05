package a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b5 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f3461e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c5 f3462f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d5 f3463g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(b bVar, c5 c5Var, d5 d5Var) {
        super(0);
        this.f3461e = bVar;
        this.f3462f = c5Var;
        this.f3463g = d5Var;
    }

    @Override // kv.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m9invoke();
        return tu.x0.f87415a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m9invoke() {
        c5 c5Var = this.f3462f;
        b bVar = this.f3461e;
        bVar.removeOnAttachStateChangeListener(c5Var);
        g4.a.removePoolingContainerListener(bVar, this.f3463g);
    }
}
