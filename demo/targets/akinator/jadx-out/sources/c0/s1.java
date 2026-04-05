package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.b1 f11603e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f11604f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f11605g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f11606h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kv.l f11607i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(kotlin.jvm.internal.b1 b1Var, float f10, g gVar, p pVar, kv.l lVar) {
        super(1);
        this.f11603e = b1Var;
        this.f11604f = f10;
        this.f11605g = gVar;
        this.f11606h = pVar;
        this.f11607i = lVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return tu.x0.f87415a;
    }

    public final void invoke(long j10) {
        Object obj = this.f11603e.f71816b;
        kotlin.jvm.internal.e0.checkNotNull(obj);
        x1.b((m) obj, j10, this.f11604f, this.f11605g, this.f11606h, this.f11607i);
    }
}
