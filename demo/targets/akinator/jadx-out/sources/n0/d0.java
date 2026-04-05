package n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d0 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m1.e f75009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f75010f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e1.v f75011g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f75012h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f75013i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f75014j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(m1.e eVar, String str, e1.v vVar, long j10, int i10, int i11) {
        super(2);
        this.f75009e = eVar;
        this.f75010f = str;
        this.f75011g = vVar;
        this.f75012h = j10;
        this.f75013i = i10;
        this.f75014j = i11;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        f0.m5655Iconww6aTOc(this.f75009e, this.f75010f, this.f75011g, this.f75012h, wVar, this.f75013i | 1, this.f75014j);
    }
}
