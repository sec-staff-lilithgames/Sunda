package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k2 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z1 f11516e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements p0.g1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z1 f11517a;

        public a(z1 z1Var) {
            this.f11517a = z1Var;
        }

        @Override // p0.g1
        public void dispose() {
            this.f11517a.onTransitionEnd$animation_core_release();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(z1 z1Var) {
        super(1);
        this.f11516e = z1Var;
    }

    @Override // kv.l
    public final p0.g1 invoke(p0.h1 DisposableEffect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new a(this.f11516e);
    }
}
