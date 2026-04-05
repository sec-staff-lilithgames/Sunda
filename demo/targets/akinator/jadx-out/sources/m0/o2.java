package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o2 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s2.e f73805e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f73806f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(s2.e eVar, p0.j2 j2Var) {
        super(1);
        this.f73805e = eVar;
        this.f73806f = j2Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m5550invokeEaSLcWc(((s2.o) obj).m6919unboximpl());
        return tu.x0.f87415a;
    }

    /* renamed from: invoke-EaSLcWc, reason: not valid java name */
    public final void m5550invokeEaSLcWc(long j10) {
        float fM6911getWidthD9Ej5fM = s2.o.m6911getWidthD9Ej5fM(j10);
        s2.e eVar = this.f73805e;
        this.f73806f.setValue(s2.v.m6964boximpl(s2.w.IntSize(eVar.mo3419roundToPx0680j_4(fM6911getWidthD9Ej5fM), eVar.mo3419roundToPx0680j_4(s2.o.m6909getHeightD9Ej5fM(j10)))));
    }
}
