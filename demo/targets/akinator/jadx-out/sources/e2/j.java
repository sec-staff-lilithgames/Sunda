package e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i1.j f53535e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i1.j jVar) {
        super(1);
        this.f53535e = jVar;
    }

    @Override // kv.l
    public final Boolean invoke(z1.b0 it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        z1.u0 u0VarFindWrapperToGetBounds = v0.findWrapperToGetBounds(it);
        return Boolean.valueOf(u0VarFindWrapperToGetBounds.isAttached() && !kotlin.jvm.internal.e0.areEqual(this.f53535e, x1.e0.boundsInRoot(u0VarFindWrapperToGetBounds)));
    }
}
