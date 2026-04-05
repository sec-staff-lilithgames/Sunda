package v2;

import p0.g1;
import p0.h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0 f88884e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kv.a f88885f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f0 f88886g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f88887h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s2.x f88888i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements g1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0 f88889a;

        public a(a0 a0Var) {
            this.f88889a = a0Var;
        }

        @Override // p0.g1
        public void dispose() {
            a0 a0Var = this.f88889a;
            a0Var.disposeComposition();
            a0Var.dismiss();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a0 a0Var, kv.a aVar, f0 f0Var, String str, s2.x xVar) {
        super(1);
        this.f88884e = a0Var;
        this.f88885f = aVar;
        this.f88886g = f0Var;
        this.f88887h = str;
        this.f88888i = xVar;
    }

    @Override // kv.l
    public final g1 invoke(h1 DisposableEffect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        a0 a0Var = this.f88884e;
        a0Var.show();
        a0Var.updateParameters(this.f88885f, this.f88886g, this.f88887h, this.f88888i);
        return new a(a0Var);
    }
}
