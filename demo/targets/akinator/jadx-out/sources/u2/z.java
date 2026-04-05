package u2;

import p0.g1;
import p0.h1;
import z1.a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a1.h f87777e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f87778f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a2 f87779g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements g1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a1.g f87780a;

        public a(a1.g gVar) {
            this.f87780a = gVar;
        }

        @Override // p0.g1
        public void dispose() {
            ((a1.i) this.f87780a).unregister();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a1.h hVar, String str, a2 a2Var) {
        super(1);
        this.f87777e = hVar;
        this.f87778f = str;
        this.f87779g = a2Var;
    }

    @Override // kv.l
    public final g1 invoke(h1 DisposableEffect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new a(this.f87777e.registerProvider(this.f87778f, new a0(this.f87779g)));
    }
}
