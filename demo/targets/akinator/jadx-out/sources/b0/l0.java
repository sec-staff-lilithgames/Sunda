package b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0.z1 f8419e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(c0.z1 z1Var) {
        super(1);
        this.f8419e = z1Var;
    }

    @Override // kv.l
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(!kotlin.jvm.internal.e0.areEqual(obj, this.f8419e.getTargetState()));
    }
}
