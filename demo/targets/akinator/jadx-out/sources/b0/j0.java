package b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j0 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e1.v f8391f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0.j0 f8392g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kv.q f8393h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8394i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8395j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Object obj, e1.v vVar, c0.j0 j0Var, kv.q qVar, int i10, int i11) {
        super(2);
        this.f8390e = obj;
        this.f8391f = vVar;
        this.f8392g = j0Var;
        this.f8393h = qVar;
        this.f8394i = i10;
        this.f8395j = i11;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        q0.Crossfade(this.f8390e, this.f8391f, this.f8392g, this.f8393h, wVar, this.f8394i | 1, this.f8395j);
    }
}
