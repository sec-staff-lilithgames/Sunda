package tu;

import com.inmobi.commons.core.configs.AdConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g0 implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f87381c = new f0(null);

    /* renamed from: b, reason: collision with root package name */
    public final byte f87382b;

    public /* synthetic */ g0(byte b10) {
        this.f87382b = b10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ g0 m7030boximpl(byte b10) {
        return new g0(b10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7032equalsimpl(byte b10, Object obj) {
        return (obj instanceof g0) && b10 == ((g0) obj).m7036unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7033equalsimpl0(byte b10, byte b11) {
        return b10 == b11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7034hashCodeimpl(byte b10) {
        return Byte.hashCode(b10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7035toStringimpl(byte b10) {
        return String.valueOf(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.e0.compare(m7036unboximpl() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, ((g0) obj).m7036unboximpl() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public boolean equals(Object obj) {
        return m7032equalsimpl(this.f87382b, obj);
    }

    public int hashCode() {
        return m7034hashCodeimpl(this.f87382b);
    }

    public String toString() {
        return m7035toStringimpl(this.f87382b);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ byte m7036unboximpl() {
        return this.f87382b;
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte m7031constructorimpl(byte b10) {
        return b10;
    }
}
