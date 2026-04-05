package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1.c f56580e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(e1.c cVar) {
        super(2);
        this.f56580e = cVar;
    }

    public final Integer invoke(int i10, s2.x xVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<anonymous parameter 1>");
        return Integer.valueOf(this.f56580e.align(0, i10));
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (s2.x) obj2);
    }
}
