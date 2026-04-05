package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j2 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f51418e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f0.q f51419f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements p0.g1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p0.j2 f51420a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f0.q f51421b;

        public a(p0.j2 j2Var, f0.q qVar) {
            this.f51420a = j2Var;
            this.f51421b = qVar;
        }

        @Override // p0.g1
        public void dispose() {
            r2.access$invoke$tryEmitExit(this.f51420a, this.f51421b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(p0.j2 j2Var, f0.q qVar) {
        super(1);
        this.f51418e = j2Var;
        this.f51419f = qVar;
    }

    @Override // kv.l
    public final p0.g1 invoke(p0.h1 DisposableEffect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new a(this.f51418e, this.f51419f);
    }
}
