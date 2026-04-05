package ic;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p extends x {

    /* renamed from: e, reason: collision with root package name */
    public static final p f59521e = new p(-1);

    public static p construct(int i10) {
        if (i10 > 0) {
            return new p(i10);
        }
        throw new IllegalArgumentException(a.b.e(i10, "capacity must be > 0, was: "));
    }

    @Override // ic.x, ic.c0, ic.f0
    public /* bridge */ /* synthetic */ e0 acquireAndLinkPooled() {
        return super.acquireAndLinkPooled();
    }

    @Override // ic.c0
    public b createPooled() {
        return new b();
    }
}
