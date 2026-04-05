package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i1.j f51576e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.b1 f51577f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f51578g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j1.n0 f51579h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(i1.j jVar, kotlin.jvm.internal.b1 b1Var, long j10, j1.n0 n0Var) {
        super(1);
        this.f51576e = jVar;
        this.f51577f = b1Var;
        this.f51578g = j10;
        this.f51579h = n0Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((l1.e) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(l1.e onDrawWithContent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.drawContent();
        i1.j jVar = this.f51576e;
        float left = jVar.getLeft();
        float top = jVar.getTop();
        ((l1.c) ((l1.b) onDrawWithContent.getDrawContext()).getTransform()).translate(left, top);
        l1.i.m5400drawImageAZ2fEMs$default(onDrawWithContent, (j1.y0) this.f51577f.f71816b, 0L, this.f51578g, 0L, 0L, 0.0f, null, this.f51579h, 0, 0, 890, null);
        ((l1.c) ((l1.b) onDrawWithContent.getDrawContext()).getTransform()).translate(-left, -top);
    }
}
