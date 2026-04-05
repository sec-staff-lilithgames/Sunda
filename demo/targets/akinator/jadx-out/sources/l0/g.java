package l0;

import m0.t1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t1 f72088e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(t1 t1Var) {
        super(0);
        this.f72088e = t1Var;
    }

    @Override // kv.a
    public final Long invoke() {
        t1 t1Var = this.f72088e;
        return Long.valueOf(t1Var != null ? t1Var.nextSelectableId() : 0L);
    }
}
