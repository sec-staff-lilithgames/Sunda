package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d2 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z1 f11436e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11437f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11438g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(z1 z1Var, Object obj, int i10) {
        super(2);
        this.f11436e = z1Var;
        this.f11437f = obj;
        this.f11438g = i10;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        this.f11436e.animateTo$animation_core_release(this.f11437f, wVar, this.f11438g | 1);
    }
}
