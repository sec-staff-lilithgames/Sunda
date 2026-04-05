package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f73667e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f73668f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kv.p f73669g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f73670h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j10, n nVar, kv.p pVar, int i10) {
        super(2);
        this.f73667e = j10;
        this.f73668f = nVar;
        this.f73669g = pVar;
        this.f73670h = i10;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        i.m5533HandlePopupULxng0E(this.f73667e, this.f73668f, this.f73669g, wVar, this.f73670h | 1);
    }
}
