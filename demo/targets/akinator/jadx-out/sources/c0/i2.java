package c0;

import c0.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i2 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z1 f11505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z1.a f11506f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements p0.g1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z1 f11507a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ z1.a f11508b;

        public a(z1 z1Var, z1.a aVar) {
            this.f11507a = z1Var;
            this.f11508b = aVar;
        }

        @Override // p0.g1
        public void dispose() {
            this.f11507a.removeAnimation$animation_core_release((c0.z1.a) this.f11508b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(z1 z1Var, z1.a aVar) {
        super(1);
        this.f11505e = z1Var;
        this.f11506f = aVar;
    }

    @Override // kv.l
    public final p0.g1 invoke(p0.h1 DisposableEffect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new a(this.f11505e, this.f11506f);
    }
}
