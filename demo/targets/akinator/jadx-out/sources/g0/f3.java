package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f3 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1.b f56422e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(e1.b bVar) {
        super(2);
        this.f56422e = bVar;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return s2.q.m6921boximpl(m3882invoke5SAbXVA(((s2.v) obj).m6976unboximpl(), (s2.x) obj2));
    }

    /* renamed from: invoke-5SAbXVA, reason: not valid java name */
    public final long m3882invoke5SAbXVA(long j10, s2.x layoutDirection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        return s2.r.IntOffset(this.f56422e.align(0, s2.v.m6972getWidthimpl(j10), layoutDirection), 0);
    }
}
