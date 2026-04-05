package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1.v f51683e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f51684f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kv.l f51685g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f51686h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(e1.v vVar, String str, kv.l lVar, int i10) {
        super(2);
        this.f51683e = vVar;
        this.f51684f = str;
        this.f51685g = lVar;
        this.f51686h = i10;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        a0.Canvas(this.f51683e, this.f51684f, this.f51685g, wVar, this.f51686h | 1);
    }
}
