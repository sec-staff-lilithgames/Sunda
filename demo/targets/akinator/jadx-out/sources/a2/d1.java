package a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e3 f3491e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements p0.g1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e3 f3492a;

        public a(e3 e3Var) {
            this.f3492a = e3Var;
        }

        @Override // p0.g1
        public void dispose() {
            this.f3492a.dispose();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(e3 e3Var) {
        super(1);
        this.f3491e = e3Var;
    }

    @Override // kv.l
    public final p0.g1 invoke(p0.h1 DisposableEffect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new a(this.f3491e);
    }
}
