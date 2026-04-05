package vv;

import com.ironsource.C3191e4;
import java.io.Serializable;
import java.util.Comparator;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.l;
import sv.k0;
import tu.f;
import tu.i0;
import tu.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements Comparable, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final a f89658e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final b f89659f = new b(0, 0);

    /* renamed from: b, reason: collision with root package name */
    public final long f89660b;

    /* renamed from: c, reason: collision with root package name */
    public final long f89661c;

    public /* synthetic */ b(long j10, long j11, u uVar) {
        this(j10, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f89660b == bVar.f89660b && this.f89661c == bVar.f89661c;
    }

    public final long getLeastSignificantBits() {
        return this.f89661c;
    }

    public final long getMostSignificantBits() {
        return this.f89660b;
    }

    public int hashCode() {
        return Long.hashCode(this.f89660b ^ this.f89661c);
    }

    public final byte[] toByteArray() {
        byte[] bArr = new byte[16];
        c.setLongAt(bArr, 0, this.f89660b);
        c.setLongAt(bArr, 8, this.f89661c);
        return bArr;
    }

    public final String toHexDashString() {
        byte[] bArr = new byte[36];
        c.formatBytesInto(this.f89660b, bArr, 0, 0, 4);
        bArr[8] = 45;
        c.formatBytesInto(this.f89660b, bArr, 9, 4, 6);
        bArr[13] = 45;
        c.formatBytesInto(this.f89660b, bArr, 14, 6, 8);
        bArr[18] = 45;
        c.formatBytesInto(this.f89661c, bArr, 19, 0, 2);
        bArr[23] = 45;
        c.formatBytesInto(this.f89661c, bArr, 24, 2, 8);
        return k0.decodeToString(bArr);
    }

    public final String toHexString() {
        byte[] bArr = new byte[32];
        c.formatBytesInto(this.f89660b, bArr, 0, 0, 8);
        c.formatBytesInto(this.f89661c, bArr, 16, 0, 8);
        return k0.decodeToString(bArr);
    }

    public String toString() {
        return toHexDashString();
    }

    /* renamed from: toUByteArray-TcUX1vc, reason: not valid java name */
    public final byte[] m7561toUByteArrayTcUX1vc() {
        return i0.m7040constructorimpl(toByteArray());
    }

    public b(long j10, long j11) {
        this.f89660b = j10;
        this.f89661c = j11;
    }

    @Override // java.lang.Comparable
    public int compareTo(b other) {
        e0.checkNotNullParameter(other, "other");
        long j10 = other.f89660b;
        long j11 = this.f89660b;
        if (j11 != j10) {
            return Long.compare(o0.m7081constructorimpl(j11) ^ Long.MIN_VALUE, o0.m7081constructorimpl(other.f89660b) ^ Long.MIN_VALUE);
        }
        return Long.compare(o0.m7081constructorimpl(this.f89661c) ^ Long.MIN_VALUE, o0.m7081constructorimpl(other.f89661c) ^ Long.MIN_VALUE);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final b fromByteArray(byte[] byteArray) {
            e0.checkNotNullParameter(byteArray, "byteArray");
            if (byteArray.length == 16) {
                return fromLongs(c.getLongAt(byteArray, 0), c.getLongAt(byteArray, 8));
            }
            throw new IllegalArgumentException(("Expected exactly 16 bytes, but was " + uu.k0.joinToString$default(byteArray, (CharSequence) null, (CharSequence) C3191e4.i.f36529d, (CharSequence) C3191e4.i.f36531e, 32, (CharSequence) null, (l) null, 49, (Object) null) + " of size " + byteArray.length).toString());
        }

        public final b fromLongs(long j10, long j11) {
            return (j10 == 0 && j11 == 0) ? getNIL() : new b(j10, j11, null);
        }

        /* renamed from: fromUByteArray-GBYM_sE, reason: not valid java name */
        public final b m7562fromUByteArrayGBYM_sE(byte[] ubyteArray) {
            e0.checkNotNullParameter(ubyteArray, "ubyteArray");
            return fromByteArray(ubyteArray);
        }

        /* renamed from: fromULongs-eb3DHEI, reason: not valid java name */
        public final b m7563fromULongseb3DHEI(long j10, long j11) {
            return fromLongs(j10, j11);
        }

        public final Comparator<b> getLEXICAL_ORDER() {
            return xu.d.naturalOrder();
        }

        public final b getNIL() {
            return b.f89659f;
        }

        public final b parse(String uuidString) {
            e0.checkNotNullParameter(uuidString, "uuidString");
            int length = uuidString.length();
            if (length == 32) {
                return c.uuidParseHex(uuidString);
            }
            if (length == 36) {
                return c.uuidParseHexDash(uuidString);
            }
            throw new IllegalArgumentException("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"" + d.access$truncateForErrorMessage(uuidString, 64) + "\" of length " + uuidString.length());
        }

        public final b parseHex(String hexString) {
            e0.checkNotNullParameter(hexString, "hexString");
            if (hexString.length() == 32) {
                return c.uuidParseHex(hexString);
            }
            throw new IllegalArgumentException(("Expected a 32-char hexadecimal string, but was \"" + d.access$truncateForErrorMessage(hexString, 64) + "\" of length " + hexString.length()).toString());
        }

        public final b parseHexDash(String hexDashString) {
            e0.checkNotNullParameter(hexDashString, "hexDashString");
            if (hexDashString.length() == 36) {
                return c.uuidParseHexDash(hexDashString);
            }
            throw new IllegalArgumentException(("Expected a 36-char string in the standard hex-and-dash UUID format, but was \"" + d.access$truncateForErrorMessage(hexDashString, 64) + "\" of length " + hexDashString.length()).toString());
        }

        public final b random() {
            return c.secureRandomUuid();
        }

        @f
        public static /* synthetic */ void getLEXICAL_ORDER$annotations() {
        }
    }

    public static /* synthetic */ void getLeastSignificantBits$annotations() {
    }

    public static /* synthetic */ void getMostSignificantBits$annotations() {
    }
}
