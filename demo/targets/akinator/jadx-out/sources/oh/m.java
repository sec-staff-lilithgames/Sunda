package oh;

import com.inmobi.commons.core.configs.AdConfig;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class m {

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f79397b = "0123456789abcdef".toCharArray();

    public static int a(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        if (c10 >= 'a' && c10 <= 'f') {
            return c10 - 'W';
        }
        throw new IllegalArgumentException("Illegal hexadecimal character: " + c10);
    }

    public static m fromBytes(byte[] bArr) {
        p1.checkArgument(bArr.length >= 1, "A HashCode must contain at least 1 byte.");
        return new j((byte[]) bArr.clone());
    }

    public static m fromInt(int i10) {
        return new k(i10);
    }

    public static m fromLong(long j10) {
        return new l(j10);
    }

    public static m fromString(String str) {
        p1.checkArgument(str.length() >= 2, "input string (%s) must have at least 2 characters", str);
        p1.checkArgument(str.length() % 2 == 0, "input string (%s) must have an even number of characters", str);
        byte[] bArr = new byte[str.length() / 2];
        for (int i10 = 0; i10 < str.length(); i10 += 2) {
            bArr[i10 / 2] = (byte) ((a(str.charAt(i10)) << 4) + a(str.charAt(i10 + 1)));
        }
        return new j(bArr);
    }

    public abstract byte[] asBytes();

    public abstract int asInt();

    public abstract long asLong();

    public abstract boolean b(m mVar);

    public abstract int bits();

    public byte[] c() {
        return asBytes();
    }

    public abstract void d(int i10, int i11, byte[] bArr);

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return bits() == mVar.bits() && b(mVar);
    }

    public final int hashCode() {
        if (bits() >= 32) {
            return asInt();
        }
        byte[] bArrC = c();
        int i10 = bArrC[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        for (int i11 = 1; i11 < bArrC.length; i11++) {
            i10 |= (bArrC[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << (i11 * 8);
        }
        return i10;
    }

    public abstract long padToLong();

    public final String toString() {
        byte[] bArrC = c();
        StringBuilder sb2 = new StringBuilder(bArrC.length * 2);
        for (byte b10 : bArrC) {
            char[] cArr = f79397b;
            sb2.append(cArr[(b10 >> 4) & 15]);
            sb2.append(cArr[b10 & 15]);
        }
        return sb2.toString();
    }

    public int writeBytesTo(byte[] bArr, int i10, int i11) {
        int iMin = Math.min(i11, bits() / 8);
        p1.checkPositionIndexes(i10, i10 + iMin, bArr.length);
        d(i10, iMin, bArr);
        return iMin;
    }
}
