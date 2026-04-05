package e0;

import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m3 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v5 f53186e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(v5 v5Var) {
        super(0);
        this.f53186e = v5Var;
    }

    @Override // kv.a
    public final Boolean invoke() {
        return Boolean.valueOf(((z3) this.f53186e.getValue()).shouldScrollImmediately());
    }
}
