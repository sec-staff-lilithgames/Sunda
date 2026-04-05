package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h0 extends kotlin.jvm.internal.f0 implements kv.s {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f56439e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(o oVar) {
        super(5);
        this.f56439e = oVar;
    }

    @Override // kv.s
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        invoke(((Number) obj).intValue(), (int[]) obj2, (s2.x) obj3, (s2.e) obj4, (int[]) obj5);
        return tu.x0.f87415a;
    }

    public final void invoke(int i10, int[] size, s2.x xVar, s2.e density, int[] outPosition) {
        kotlin.jvm.internal.e0.checkNotNullParameter(size, "size");
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<anonymous parameter 2>");
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(outPosition, "outPosition");
        this.f56439e.arrange(density, i10, size, outPosition);
    }
}
