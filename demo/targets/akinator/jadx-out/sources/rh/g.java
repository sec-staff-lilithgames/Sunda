package rh;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.inmobi.commons.core.configs.AdConfig;
import j1.o2;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class g {
    public static int a(char[] cArr, char c10, int i10, int i11) {
        while (i10 < i11) {
            if (cArr[i10] == c10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static List<Character> asList(char... cArr) {
        return cArr.length == 0 ? Collections.EMPTY_LIST : new e(cArr, 0, cArr.length);
    }

    public static char checkedCast(long j10) {
        char c10 = (char) j10;
        p1.checkArgument(((long) c10) == j10, "Out of range: %s", j10);
        return c10;
    }

    public static int compare(char c10, char c11) {
        return Character.compare(c10, c11);
    }

    public static char[] concat(char[]... cArr) {
        long length = 0;
        for (char[] cArr2 : cArr) {
            length += cArr2.length;
        }
        int i10 = (int) length;
        p1.checkArgument(length == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int", length);
        char[] cArr3 = new char[i10];
        int length2 = 0;
        for (char[] cArr4 : cArr) {
            System.arraycopy(cArr4, 0, cArr3, length2, cArr4.length);
            length2 += cArr4.length;
        }
        return cArr3;
    }

    public static char constrainToRange(char c10, char c11, char c12) {
        p1.checkArgument(c11 <= c12, "min (%s) must be less than or equal to max (%s)", c11, c12);
        return c10 < c11 ? c11 : c10 < c12 ? c10 : c12;
    }

    public static boolean contains(char[] cArr, char c10) {
        for (char c11 : cArr) {
            if (c11 == c10) {
                return true;
            }
        }
        return false;
    }

    public static char[] ensureCapacity(char[] cArr, int i10, int i11) {
        p1.checkArgument(i10 >= 0, "Invalid minLength: %s", i10);
        p1.checkArgument(i11 >= 0, "Invalid padding: %s", i11);
        return cArr.length < i10 ? Arrays.copyOf(cArr, i10 + i11) : cArr;
    }

    public static char fromByteArray(byte[] bArr) {
        p1.checkArgument(bArr.length >= 2, "array too small: %s < %s", bArr.length, 2);
        return fromBytes(bArr[0], bArr[1]);
    }

    public static char fromBytes(byte b10, byte b11) {
        return (char) ((b10 << 8) | (b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
    }

    public static int indexOf(char[] cArr, char c10) {
        return a(cArr, c10, 0, cArr.length);
    }

    public static String join(String str, char... cArr) {
        p1.checkNotNull(str);
        int length = cArr.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(o2.b(length, 1, str.length(), length));
        sb2.append(cArr[0]);
        for (int i10 = 1; i10 < length; i10++) {
            sb2.append(str);
            sb2.append(cArr[i10]);
        }
        return sb2.toString();
    }

    public static int lastIndexOf(char[] cArr, char c10) {
        for (int length = cArr.length - 1; length >= 0; length--) {
            if (cArr[length] == c10) {
                return length;
            }
        }
        return -1;
    }

    public static Comparator<char[]> lexicographicalComparator() {
        return f.f84361b;
    }

    public static char max(char... cArr) {
        p1.checkArgument(cArr.length > 0);
        char c10 = cArr[0];
        for (int i10 = 1; i10 < cArr.length; i10++) {
            char c11 = cArr[i10];
            if (c11 > c10) {
                c10 = c11;
            }
        }
        return c10;
    }

    public static char min(char... cArr) {
        p1.checkArgument(cArr.length > 0);
        char c10 = cArr[0];
        for (int i10 = 1; i10 < cArr.length; i10++) {
            char c11 = cArr[i10];
            if (c11 < c10) {
                c10 = c11;
            }
        }
        return c10;
    }

    public static void reverse(char[] cArr) {
        p1.checkNotNull(cArr);
        reverse(cArr, 0, cArr.length);
    }

    public static void rotate(char[] cArr, int i10) {
        rotate(cArr, i10, 0, cArr.length);
    }

    public static char saturatedCast(long j10) {
        if (j10 > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            return (char) 65535;
        }
        if (j10 < 0) {
            return (char) 0;
        }
        return (char) j10;
    }

    public static void sortDescending(char[] cArr) {
        p1.checkNotNull(cArr);
        sortDescending(cArr, 0, cArr.length);
    }

    public static char[] toArray(Collection<Character> collection) {
        if (collection instanceof e) {
            e eVar = (e) collection;
            return Arrays.copyOfRange(eVar.f84358b, eVar.f84359c, eVar.f84360e);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = ((Character) p1.checkNotNull(array[i10])).charValue();
        }
        return cArr;
    }

    public static byte[] toByteArray(char c10) {
        return new byte[]{(byte) (c10 >> '\b'), (byte) c10};
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int indexOf(char[] r5, char[] r6) {
        /*
            java.lang.String r0 = "array"
            mh.p1.checkNotNull(r5, r0)
            java.lang.String r0 = "target"
            mh.p1.checkNotNull(r6, r0)
            int r0 = r6.length
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0 = r1
        L10:
            int r2 = r5.length
            int r3 = r6.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L2a
            r2 = r1
        L18:
            int r3 = r6.length
            if (r2 >= r3) goto L29
            int r3 = r0 + r2
            char r3 = r5[r3]
            char r4 = r6[r2]
            if (r3 == r4) goto L26
            int r0 = r0 + 1
            goto L10
        L26:
            int r2 = r2 + 1
            goto L18
        L29:
            return r0
        L2a:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rh.g.indexOf(char[], char[]):int");
    }

    public static void rotate(char[] cArr, int i10, int i11, int i12) {
        p1.checkNotNull(cArr);
        p1.checkPositionIndexes(i11, i12, cArr.length);
        if (cArr.length <= 1) {
            return;
        }
        int i13 = i12 - i11;
        int i14 = (-i10) % i13;
        if (i14 < 0) {
            i14 += i13;
        }
        int i15 = i14 + i11;
        if (i15 == i11) {
            return;
        }
        reverse(cArr, i11, i15);
        reverse(cArr, i15, i12);
        reverse(cArr, i11, i12);
    }

    public static void reverse(char[] cArr, int i10, int i11) {
        p1.checkNotNull(cArr);
        p1.checkPositionIndexes(i10, i11, cArr.length);
        for (int i12 = i11 - 1; i10 < i12; i12--) {
            char c10 = cArr[i10];
            cArr[i10] = cArr[i12];
            cArr[i12] = c10;
            i10++;
        }
    }

    public static void sortDescending(char[] cArr, int i10, int i11) {
        p1.checkNotNull(cArr);
        p1.checkPositionIndexes(i10, i11, cArr.length);
        Arrays.sort(cArr, i10, i11);
        reverse(cArr, i10, i11);
    }

    public static int hashCode(char c10) {
        return c10;
    }
}
