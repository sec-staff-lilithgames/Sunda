package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f51602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j1.b0 f51603f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f51604g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f51605h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f51606i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f51607j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f51608k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l1.n f51609l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z10, j1.b0 b0Var, long j10, float f10, float f11, long j11, long j12, l1.n nVar) {
        super(1);
        this.f51602e = z10;
        this.f51603f = b0Var;
        this.f51604g = j10;
        this.f51605h = f10;
        this.f51606i = f11;
        this.f51607j = j11;
        this.f51608k = j12;
        this.f51609l = nVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((l1.e) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(l1.e onDrawWithContent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.drawContent();
        if (this.f51602e) {
            l1.i.m5412drawRoundRectZuiqVtQ$default(onDrawWithContent, this.f51603f, 0L, 0L, this.f51604g, 0.0f, null, null, 0, 246, null);
            return;
        }
        long j10 = this.f51604g;
        float fM4156getXimpl = i1.b.m4156getXimpl(j10);
        float f10 = this.f51605h;
        if (fM4156getXimpl >= f10) {
            l1.i.m5412drawRoundRectZuiqVtQ$default(onDrawWithContent, this.f51603f, this.f51607j, this.f51608k, o.a(j10, f10), 0.0f, this.f51609l, null, 0, 208, null);
            return;
        }
        float fM4252getWidthimpl = i1.o.m4252getWidthimpl(onDrawWithContent.mo5314getSizeNHjbRc());
        float f11 = this.f51606i;
        float f12 = fM4252getWidthimpl - f11;
        float fM4249getHeightimpl = i1.o.m4249getHeightimpl(onDrawWithContent.mo5314getSizeNHjbRc()) - f11;
        int iM4777getDifferencertfAjoo = j1.k0.f68900b.m4777getDifferencertfAjoo();
        l1.b bVar = (l1.b) onDrawWithContent.getDrawContext();
        long jMo5320getSizeNHjbRc = bVar.mo5320getSizeNHjbRc();
        bVar.getCanvas().save();
        l1.c cVar = (l1.c) bVar.getTransform();
        float f13 = this.f51606i;
        cVar.mo5323clipRectN_I0leg(f13, f13, f12, fM4249getHeightimpl, iM4777getDifferencertfAjoo);
        l1.i.m5412drawRoundRectZuiqVtQ$default(onDrawWithContent, this.f51603f, 0L, 0L, this.f51604g, 0.0f, null, null, 0, 246, null);
        bVar.getCanvas().restore();
        bVar.mo5321setSizeuvyYCjk(jMo5320getSizeNHjbRc);
    }
}
