package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i0 extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.a f73758e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kv.l f73759f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(kv.a aVar, kv.l lVar) {
        super(3);
        this.f73758e = aVar;
        this.f73759f = lVar;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final e1.v invoke(e1.v composed, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(759876635);
        e1.v vVar = (e1.v) this.f73759f.invoke(new h0(n0.access$rememberAnimatedMagnifierPosition(this.f73758e, wVar, 0)));
        wVar.endReplaceableGroup();
        return vVar;
    }
}
