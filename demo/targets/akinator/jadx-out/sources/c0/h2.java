package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h2 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z1 f11484e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z1 f11485f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements p0.g1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z1 f11486a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ z1 f11487b;

        public a(z1 z1Var, z1 z1Var2) {
            this.f11486a = z1Var;
            this.f11487b = z1Var2;
        }

        @Override // p0.g1
        public void dispose() {
            this.f11486a.removeTransition$animation_core_release(this.f11487b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(z1 z1Var, z1 z1Var2) {
        super(1);
        this.f11484e = z1Var;
        this.f11485f = z1Var2;
    }

    @Override // kv.l
    public final p0.g1 invoke(p0.h1 DisposableEffect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        z1 z1Var = this.f11484e;
        z1 z1Var2 = this.f11485f;
        z1Var.addTransition$animation_core_release(z1Var2);
        return new a(z1Var, z1Var2);
    }
}
