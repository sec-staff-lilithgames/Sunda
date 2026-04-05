package c0;

import c0.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j2 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z1 f11511e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z1.c f11512f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements p0.g1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z1 f11513a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ z1.c f11514b;

        public a(z1 z1Var, z1.c cVar) {
            this.f11513a = z1Var;
            this.f11514b = cVar;
        }

        @Override // p0.g1
        public void dispose() {
            this.f11513a.removeAnimation$animation_core_release((c0.z1.c) this.f11514b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(z1 z1Var, z1.c cVar) {
        super(1);
        this.f11511e = z1Var;
        this.f11512f = cVar;
    }

    @Override // kv.l
    public final p0.g1 invoke(p0.h1 DisposableEffect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        z1 z1Var = this.f11511e;
        z1.c cVar = this.f11512f;
        z1Var.addAnimation$animation_core_release(cVar);
        return new a(z1Var, cVar);
    }
}
