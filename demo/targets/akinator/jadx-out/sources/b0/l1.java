package b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.l f8420e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(kv.l lVar) {
        super(1);
        this.f8420e = lVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return s2.q.m6921boximpl(m93invokemHKZG7I(((s2.v) obj).m6976unboximpl()));
    }

    /* renamed from: invoke-mHKZG7I, reason: not valid java name */
    public final long m93invokemHKZG7I(long j10) {
        return s2.r.IntOffset(((Number) this.f8420e.invoke(Integer.valueOf(s2.v.m6972getWidthimpl(j10)))).intValue(), 0);
    }
}
