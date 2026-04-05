package g0;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w3 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x3 f56617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ View f56618f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements p0.g1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3 f56619a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f56620b;

        public a(x3 x3Var, View view) {
            this.f56619a = x3Var;
            this.f56620b = view;
        }

        @Override // p0.g1
        public void dispose() {
            this.f56619a.decrementAccessors(this.f56620b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(x3 x3Var, View view) {
        super(1);
        this.f56617e = x3Var;
        this.f56618f = view;
    }

    @Override // kv.l
    public final p0.g1 invoke(p0.h1 DisposableEffect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        x3 x3Var = this.f56617e;
        View view = this.f56618f;
        x3Var.incrementAccessors(view);
        return new a(x3Var, view);
    }
}
