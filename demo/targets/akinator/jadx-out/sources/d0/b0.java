package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f51314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f0.q f51315f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements p0.g1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p0.j2 f51316a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f0.q f51317b;

        public a(p0.j2 j2Var, f0.q qVar) {
            this.f51316a = j2Var;
            this.f51317b = qVar;
        }

        @Override // p0.g1
        public void dispose() {
            p0.j2 j2Var = this.f51316a;
            f0.t tVar = (f0.t) j2Var.getValue();
            if (tVar != null) {
                this.f51317b.tryEmit(new f0.s(tVar));
                j2Var.setValue(null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(p0.j2 j2Var, f0.q qVar) {
        super(1);
        this.f51314e = j2Var;
        this.f51315f = qVar;
    }

    @Override // kv.l
    public final p0.g1 invoke(p0.h1 DisposableEffect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new a(this.f51314e, this.f51315f);
    }
}
