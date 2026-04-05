package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f51283e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(1);
        this.f51283e = bVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m3680invokeozmzZPI(((s2.v) obj).m6976unboximpl());
        return tu.x0.f87415a;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m3680invokeozmzZPI(long j10) {
        long jM6981toSizeozmzZPI = s2.w.m6981toSizeozmzZPI(j10);
        b bVar = this.f51283e;
        boolean zM4248equalsimpl0 = i1.o.m4248equalsimpl0(jM6981toSizeozmzZPI, bVar.f51309n);
        bVar.f51309n = s2.w.m6981toSizeozmzZPI(j10);
        if (!zM4248equalsimpl0) {
            bVar.f51297b.setSize(s2.v.m6972getWidthimpl(j10), s2.v.m6971getHeightimpl(j10));
            bVar.f51298c.setSize(s2.v.m6972getWidthimpl(j10), s2.v.m6971getHeightimpl(j10));
            bVar.f51299d.setSize(s2.v.m6971getHeightimpl(j10), s2.v.m6972getWidthimpl(j10));
            bVar.f51300e.setSize(s2.v.m6971getHeightimpl(j10), s2.v.m6972getWidthimpl(j10));
            bVar.f51302g.setSize(s2.v.m6972getWidthimpl(j10), s2.v.m6971getHeightimpl(j10));
            bVar.f51303h.setSize(s2.v.m6972getWidthimpl(j10), s2.v.m6971getHeightimpl(j10));
            bVar.f51304i.setSize(s2.v.m6971getHeightimpl(j10), s2.v.m6972getWidthimpl(j10));
            bVar.f51305j.setSize(s2.v.m6971getHeightimpl(j10), s2.v.m6972getWidthimpl(j10));
        }
        if (zM4248equalsimpl0) {
            return;
        }
        bVar.e();
        bVar.a();
    }
}
