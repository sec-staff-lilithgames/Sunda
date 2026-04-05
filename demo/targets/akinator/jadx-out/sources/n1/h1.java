package n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h1 extends kotlin.jvm.internal.f0 implements kv.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f75438e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(c cVar) {
        super(4);
        this.f75438e = cVar;
    }

    @Override // kv.r
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue(), (p0.w) obj3, ((Number) obj4).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(float f10, float f11, p0.w wVar, int i10) {
        if ((i10 & 11) == 2 && wVar.getSkipping()) {
            wVar.skipToGroupEnd();
        } else {
            i1.RenderVectorGroup(this.f75438e.getRoot(), null, wVar, 0, 2);
        }
    }
}
