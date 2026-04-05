package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f51535e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f0.q f51536f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements p0.g1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p0.j2 f51537a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f0.q f51538b;

        public a(p0.j2 j2Var, f0.q qVar) {
            this.f51537a = j2Var;
            this.f51538b = qVar;
        }

        @Override // p0.g1
        public void dispose() {
            p0.j2 j2Var = this.f51537a;
            f0.d dVar = (f0.d) j2Var.getValue();
            if (dVar != null) {
                f0.e eVar = new f0.e(dVar);
                f0.q qVar = this.f51538b;
                if (qVar != null) {
                    qVar.tryEmit(eVar);
                }
                j2Var.setValue(null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(p0.j2 j2Var, f0.q qVar) {
        super(1);
        this.f51535e = j2Var;
        this.f51536f = qVar;
    }

    @Override // kv.l
    public final p0.g1 invoke(p0.h1 DisposableEffect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new a(this.f51535e, this.f51536f);
    }
}
