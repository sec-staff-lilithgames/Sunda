package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final z0.a f80218a;

    static {
        new f(null);
    }

    public /* synthetic */ g(z0.a aVar) {
        this.f80218a = aVar;
    }

    /* renamed from: access$pack-impl, reason: not valid java name */
    public static final int m5806access$packimpl(z0.a aVar, int i10, int i11) {
        return ((i10 & 15) << 27) | (134217727 & i11);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ g m5807boximpl(z0.a aVar) {
        return new g(aVar);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static z0.a m5808constructorimpl() {
        return new z0.a(0);
    }

    /* renamed from: decrementCount-impl, reason: not valid java name */
    public static final void m5809decrementCountimpl(z0.a aVar, int i10) {
        int i11;
        do {
            i11 = aVar.get();
        } while (!aVar.compareAndSet(i11, ((i11 >>> 27) & 15) == i10 ? i11 - 1 : i11));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5810equalsimpl(z0.a aVar, Object obj) {
        return (obj instanceof g) && kotlin.jvm.internal.e0.areEqual(aVar, ((g) obj).m5817unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5811equalsimpl0(z0.a aVar, z0.a aVar2) {
        return kotlin.jvm.internal.e0.areEqual(aVar, aVar2);
    }

    /* renamed from: hasAwaiters-impl, reason: not valid java name */
    public static final boolean m5812hasAwaitersimpl(z0.a aVar) {
        return (aVar.get() & 134217727) > 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5813hashCodeimpl(z0.a aVar) {
        return aVar.hashCode();
    }

    /* renamed from: incrementCountAndGetVersion-impl, reason: not valid java name */
    public static final int m5814incrementCountAndGetVersionimpl(z0.a aVar, kv.a aVar2) {
        int i10;
        int i11;
        do {
            i10 = aVar.get();
            i11 = i10 + 1;
        } while (!aVar.compareAndSet(i10, i11));
        if ((134217727 & i11) == 1) {
            aVar2.invoke();
        }
        return (i11 >>> 27) & 15;
    }

    /* renamed from: incrementVersionAndResetCount-impl, reason: not valid java name */
    public static final void m5815incrementVersionAndResetCountimpl(z0.a aVar) {
        int i10;
        do {
            i10 = aVar.get();
        } while (!aVar.compareAndSet(i10, m5806access$packimpl(aVar, ((i10 >>> 27) & 15) + 1, 0)));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5816toStringimpl(z0.a aVar) {
        int i10 = aVar.get();
        StringBuilder sb2 = new StringBuilder("AtomicAwaitersCount(version = ");
        sb2.append((i10 >>> 27) & 15);
        sb2.append(", count = ");
        return e3.g.m(sb2, i10 & 134217727, ')');
    }

    public boolean equals(Object obj) {
        return m5810equalsimpl(this.f80218a, obj);
    }

    public int hashCode() {
        return m5813hashCodeimpl(this.f80218a);
    }

    public String toString() {
        return m5816toStringimpl(this.f80218a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ z0.a m5817unboximpl() {
        return this.f80218a;
    }
}
