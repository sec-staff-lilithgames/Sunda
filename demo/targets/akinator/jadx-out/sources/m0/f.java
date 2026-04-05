package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f73703e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r2.k f73704f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f73705g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j1.y0 f73706h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j1.n0 f73707i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z10, r2.k kVar, boolean z11, j1.y0 y0Var, j1.n0 n0Var) {
        super(1);
        this.f73703e = z10;
        this.f73704f = kVar;
        this.f73705g = z11;
        this.f73706h = y0Var;
        this.f73707i = n0Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((l1.e) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(l1.e onDrawWithContent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.drawContent();
        if (!i.access$isLeft(this.f73703e, this.f73704f, this.f73705g)) {
            l1.i.m5401drawImagegbVJVH8$default(onDrawWithContent, this.f73706h, 0L, 0.0f, null, this.f73707i, 0, 46, null);
            return;
        }
        long jMo5313getCenterF1C5BW0 = onDrawWithContent.mo5313getCenterF1C5BW0();
        l1.b bVar = (l1.b) onDrawWithContent.getDrawContext();
        long jMo5320getSizeNHjbRc = bVar.mo5320getSizeNHjbRc();
        bVar.getCanvas().save();
        ((l1.c) bVar.getTransform()).mo5327scale0AR0LA0(-1.0f, 1.0f, jMo5313getCenterF1C5BW0);
        l1.i.m5401drawImagegbVJVH8$default(onDrawWithContent, this.f73706h, 0L, 0.0f, null, this.f73707i, 0, 46, null);
        bVar.getCanvas().restore();
        bVar.mo5321setSizeuvyYCjk(jMo5320getSizeNHjbRc);
    }
}
