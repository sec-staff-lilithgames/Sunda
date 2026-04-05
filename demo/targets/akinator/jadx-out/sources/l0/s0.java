package l0;

import g2.x1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s0 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0 f72168e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(x0 x0Var) {
        super(0);
        this.f72168e = x0Var;
    }

    @Override // kv.a
    public final x1 invoke() {
        return this.f72168e.getState().getLayoutResult();
    }
}
