package v2;

import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0 f88910e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a0 a0Var) {
        super(1);
        this.f88910e = a0Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((x1.d0) obj);
        return x0.f87415a;
    }

    public final void invoke(x1.d0 childCoordinates) {
        kotlin.jvm.internal.e0.checkNotNullParameter(childCoordinates, "childCoordinates");
        x1.d0 parentLayoutCoordinates = childCoordinates.getParentLayoutCoordinates();
        kotlin.jvm.internal.e0.checkNotNull(parentLayoutCoordinates);
        this.f88910e.updateParentLayoutCoordinates(parentLayoutCoordinates);
    }
}
