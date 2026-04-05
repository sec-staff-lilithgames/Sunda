package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f11510a;

    public /* synthetic */ j1(long j10) {
        this.f11510a = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ j1 m159boximpl(long j10) {
        return new j1(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m160constructorimpl(int i10, int i11) {
        return i10 * i11;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ long m161constructorimpl$default(int i10, int i11, int i12, kotlin.jvm.internal.u uVar) {
        if ((i12 & 2) != 0) {
            i11 = l1.f11521b.m169getDelayEo1U57Q();
        }
        return m160constructorimpl(i10, i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m162equalsimpl(long j10, Object obj) {
        return (obj instanceof j1) && j10 == ((j1) obj).m168unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m163equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getOffsetMillis-impl, reason: not valid java name */
    public static final int m164getOffsetMillisimpl(long j10) {
        return Math.abs((int) j10);
    }

    /* renamed from: getOffsetType-Eo1U57Q, reason: not valid java name */
    public static final int m165getOffsetTypeEo1U57Q(long j10) {
        boolean z10 = j10 > 0;
        if (z10) {
            return l1.f11521b.m170getFastForwardEo1U57Q();
        }
        if (z10) {
            throw new tu.t();
        }
        return l1.f11521b.m169getDelayEo1U57Q();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m166hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m167toStringimpl(long j10) {
        return "StartOffset(value=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return m162equalsimpl(this.f11510a, obj);
    }

    public int hashCode() {
        return m166hashCodeimpl(this.f11510a);
    }

    public String toString() {
        return m167toStringimpl(this.f11510a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m168unboximpl() {
        return this.f11510a;
    }
}
