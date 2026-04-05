package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b3 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1.c f56367e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(e1.c cVar) {
        super(2);
        this.f56367e = cVar;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return s2.q.m6921boximpl(m3845invoke5SAbXVA(((s2.v) obj).m6976unboximpl(), (s2.x) obj2));
    }

    /* renamed from: invoke-5SAbXVA, reason: not valid java name */
    public final long m3845invoke5SAbXVA(long j10, s2.x xVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<anonymous parameter 1>");
        return s2.r.IntOffset(0, this.f56367e.align(0, s2.v.m6971getHeightimpl(j10)));
    }
}
