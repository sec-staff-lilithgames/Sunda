package v2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0 f88939e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var) {
        super(0);
        this.f88939e = a0Var;
    }

    @Override // kv.a
    public final Boolean invoke() {
        a0 a0Var = this.f88939e;
        return Boolean.valueOf((a0Var.getParentLayoutCoordinates() == null || a0Var.m7427getPopupContentSizebOM6tXw() == null) ? false : true);
    }
}
