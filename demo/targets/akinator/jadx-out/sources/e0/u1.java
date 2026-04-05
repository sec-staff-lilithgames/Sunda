package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f53323e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f0.q f53324f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements p0.g1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p0.j2 f53325a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f0.q f53326b;

        public a(p0.j2 j2Var, f0.q qVar) {
            this.f53325a = j2Var;
            this.f53326b = qVar;
        }

        @Override // p0.g1
        public void dispose() {
            p0.j2 j2Var = this.f53325a;
            f0.b bVar = (f0.b) j2Var.getValue();
            if (bVar != null) {
                f0.q qVar = this.f53326b;
                if (qVar != null) {
                    qVar.tryEmit(new f0.a(bVar));
                }
                j2Var.setValue(null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(p0.j2 j2Var, f0.q qVar) {
        super(1);
        this.f53323e = j2Var;
        this.f53324f = qVar;
    }

    @Override // kv.l
    public final p0.g1 invoke(p0.h1 DisposableEffect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new a(this.f53323e, this.f53324f);
    }
}
