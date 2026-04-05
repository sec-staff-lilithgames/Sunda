package u2;

import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.l f87708e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e1.v f87709f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kv.l f87710g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f87711h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87712i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(kv.l lVar, e1.v vVar, kv.l lVar2, int i10, int i11) {
        super(2);
        this.f87708e = lVar;
        this.f87709f = vVar;
        this.f87710g = lVar2;
        this.f87711h = i10;
        this.f87712i = i11;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        q.AndroidView(this.f87708e, this.f87709f, this.f87710g, wVar, this.f87711h | 1, this.f87712i);
    }
}
