package n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z0 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c1 f75546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f75547f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f75548g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f75549h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kv.r f75550i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f75551j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(c1 c1Var, String str, float f10, float f11, kv.r rVar, int i10) {
        super(2);
        this.f75546e = c1Var;
        this.f75547f = str;
        this.f75548g = f10;
        this.f75549h = f11;
        this.f75550i = rVar;
        this.f75551j = i10;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        this.f75546e.RenderVector$ui_release(this.f75547f, this.f75548g, this.f75549h, this.f75550i, wVar, this.f75551j | 1);
    }
}
