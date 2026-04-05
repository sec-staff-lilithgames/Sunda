package v2;

import p0.g1;
import p0.h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0 f88895e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e0 f88896f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a0 a0Var, e0 e0Var) {
        super(1);
        this.f88895e = a0Var;
        this.f88896f = e0Var;
    }

    @Override // kv.l
    public final g1 invoke(h1 DisposableEffect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        e0 e0Var = this.f88896f;
        a0 a0Var = this.f88895e;
        a0Var.setPositionProvider(e0Var);
        a0Var.updatePosition();
        return new a();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements g1 {
        @Override // p0.g1
        public void dispose() {
        }
    }
}
