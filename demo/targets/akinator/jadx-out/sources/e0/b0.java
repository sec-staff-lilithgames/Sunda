package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.a1 f52974e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(kotlin.jvm.internal.a1 a1Var) {
        super(2);
        this.f52974e = a1Var;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m3746invokeUv8p0NA((u1.c0) obj, ((i1.h) obj2).m4195unboximpl());
        return tu.x0.f87415a;
    }

    /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
    public final void m3746invokeUv8p0NA(u1.c0 change, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(change, "change");
        change.consume();
        this.f52974e.f71813b = j10;
    }
}
