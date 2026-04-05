package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c0 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f0.q f51330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f51331f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f51332g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(f0.q qVar, p0.j2 j2Var, int i10) {
        super(2);
        this.f51330e = qVar;
        this.f51331f = j2Var;
        this.f51332g = i10;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        k0.PressedInteractionSourceDisposableEffect(this.f51330e, this.f51331f, wVar, this.f51332g | 1);
    }
}
