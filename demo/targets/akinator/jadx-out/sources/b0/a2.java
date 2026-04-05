package b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a2 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c2 f8329e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f8330f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(c2 c2Var, long j10) {
        super(1);
        this.f8329e = c2Var;
        this.f8330f = j10;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return s2.q.m6921boximpl(m72invokeBjo55l4((r0) obj));
    }

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m72invokeBjo55l4(r0 it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        return this.f8329e.m76targetOffsetByStateoFUgxo0(it, this.f8330f);
    }
}
