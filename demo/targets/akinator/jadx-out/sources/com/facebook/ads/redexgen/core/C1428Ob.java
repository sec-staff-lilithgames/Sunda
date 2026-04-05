package com.facebook.ads.redexgen.core;

import com.applovin.shadow.okio.Utf8;
import com.ironsource.G5;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.Ob, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1428Ob<K, V> {
    public static int A03;
    public static int A04;
    public static Object[] A05;
    public static Object[] A06;
    public static byte[] A07;
    public static String[] A08 = {"8z1HmzrTIPy39LL5zlYrlacFIwKg5dSL", "BF3wuf", "SqgiIkCbsFt", "0ewbfDqWIohK", "kTJoDQcQ4hAXz", "5fxnXFw2KP9B", "f0gXGPwWqu0hk91oP6YtPFY8hQ1GOrGw", "wtH1M9"};
    public int[] A01 = OR.A01;
    public Object[] A02 = OR.A03;
    public int A00 = 0;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A07 = new byte[]{44, 112, 108, 109, 119, 36, 73, 101, 116, 45, 34, 46, Utf8.REPLACEMENT_BYTE, 57};
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        if (r4 == r9.A00) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (r10 <= 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        java.lang.System.arraycopy(r2, 0, r9.A01, 0, r10);
        java.lang.System.arraycopy(r1, 0, r9.A02, 0, r10 << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        if (r10 >= r3) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        java.lang.System.arraycopy(r2, r10 + 1, r9.A01, r10, r3 - r10);
        java.lang.System.arraycopy(r1, (r10 + 1) << 1, r9.A02, r10 << 1, (r3 - r10) << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
    
        if (r4 == r9.A00) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ea, code lost:
    
        throw new java.util.ConcurrentModificationException();
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V A0A(int r10) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1428Ob.A0A(int):java.lang.Object");
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1428Ob) {
            C1428Ob c1428Ob = (C1428Ob) obj;
            if (size() != c1428Ob.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.A00; i10++) {
                try {
                    K kA09 = A09(i10);
                    V vA0B = A0B(i10);
                    Object obj2 = c1428Ob.get(kA09);
                    if (vA0B == null) {
                        if (obj2 == null && c1428Ob.containsKey(kA09)) {
                        }
                        return false;
                    }
                    if (!vA0B.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException unused) {
                    return false;
                } catch (NullPointerException unused2) {
                    return false;
                }
            }
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        for (int i11 = 0; i11 < this.A00; i11++) {
            try {
                K kA092 = A09(i11);
                V vA0B2 = A0B(i11);
                Object obj3 = map.get(kA092);
                if (vA0B2 == null) {
                    if (obj3 == null && map.containsKey(kA092)) {
                    }
                    return false;
                }
                if (!vA0B2.equals(obj3)) {
                    return false;
                }
            } catch (ClassCastException unused3) {
                return false;
            } catch (NullPointerException unused4) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final int hashCode() {
        int[] iArr = this.A01;
        Object[] objArr = this.A02;
        int iHashCode = 0;
        int i10 = 0;
        int i11 = 1;
        int i12 = this.A00;
        while (i10 < i12) {
            Object obj = objArr[i11];
            iHashCode += iArr[i10] ^ (obj == null ? 0 : obj.hashCode());
            i10++;
            i11 += 2;
        }
        return iHashCode;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final V put(K k10, V v10) {
        int iHashCode;
        int iA01;
        int i10 = this.A00;
        if (k10 == null) {
            iHashCode = 0;
            iA01 = A00();
        } else {
            iHashCode = k10.hashCode();
            iA01 = A01(k10, iHashCode);
        }
        if (iA01 >= 0) {
            int i11 = (iA01 << 1) + 1;
            V v11 = (V) this.A02[i11];
            this.A02[i11] = v10;
            return v11;
        }
        int i12 = ~iA01;
        if (i10 >= this.A01.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArr = this.A01;
            Object[] objArr = this.A02;
            A05(i13);
            if (i10 != this.A00) {
                throw new ConcurrentModificationException();
            }
            if (this.A01.length > 0) {
                System.arraycopy(iArr, 0, this.A01, 0, iArr.length);
                System.arraycopy(objArr, 0, this.A02, 0, objArr.length);
            }
            A06(iArr, objArr, i10);
        }
        if (i12 < i10) {
            System.arraycopy(this.A01, i12, this.A01, i12 + 1, i10 - i12);
            System.arraycopy(this.A02, i12 << 1, this.A02, (i12 + 1) << 1, (this.A00 - i12) << 1);
        }
        if (i10 == this.A00) {
            int[] iArr2 = this.A01;
            if (A08[2].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[6] = "wNq2gfAl4zWIB1XFoKeYdvHUl0gsJJAY";
            strArr[0] = "ABvHOLLiQ2Gbe1PeIygvGpsQN2lfiJ3N";
            if (i12 < iArr2.length) {
                this.A01[i12] = iHashCode;
                this.A02[i12 << 1] = k10;
                this.A02[(i12 << 1) + 1] = v10;
                this.A00++;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    static {
        A04();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ob != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    private final int A00() {
        int i10 = this.A00;
        if (i10 == 0) {
            return -1;
        }
        int end = A02(this.A01, i10, 0);
        if (end < 0) {
            return end;
        }
        int N = end << 1;
        if (this.A02[N] == null) {
            return end;
        }
        int i11 = end + 1;
        while (i11 < i10) {
            int N2 = this.A01[i11];
            if (N2 != 0) {
                break;
            }
            int N3 = i11 << 1;
            if (this.A02[N3] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = end - 1; i12 >= 0; i12--) {
            int N4 = this.A01[i12];
            if (N4 != 0) {
                break;
            }
            Object[] objArr = this.A02;
            String[] strArr = A08;
            String str = strArr[3];
            String str2 = strArr[5];
            int index = str.length();
            int N5 = str2.length();
            if (index != N5) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "nljZKXIH96LM";
            strArr2[5] = "33MSJmaTT2hK";
            int N6 = i12 << 1;
            if (objArr[N6] == null) {
                return i12;
            }
        }
        int N7 = ~i11;
        return N7;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ob != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    private final int A01(Object obj, int i10) {
        int i11 = this.A00;
        if (i11 == 0) {
            return -1;
        }
        int end = A02(this.A01, i11, i10);
        if (end < 0) {
            return end;
        }
        int N = end << 1;
        if (obj.equals(this.A02[N])) {
            return end;
        }
        int i12 = end + 1;
        while (i12 < i11) {
            int N2 = this.A01[i12];
            if (N2 != i10) {
                break;
            }
            int N3 = i12 << 1;
            if (obj.equals(this.A02[N3])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = end - 1; i13 >= 0; i13--) {
            int[] iArr = this.A01;
            int index = A08[2].length();
            if (index != 11) {
                throw new RuntimeException();
            }
            A08[2] = "0KWp7g9eUEy";
            int N4 = iArr[i13];
            if (N4 != i10) {
                break;
            }
            int N5 = i13 << 1;
            if (obj.equals(this.A02[N5])) {
                return i13;
            }
        }
        int N6 = ~i12;
        return N6;
    }

    public static int A02(int[] iArr, int i10, int i11) {
        try {
            return OR.A02(iArr, i10, i11);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ob != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    private void A05(int i10) {
        if (i10 == 8) {
            synchronized (C2134gb.class) {
                if (A06 != null) {
                    Object[] objArr = A06;
                    this.A02 = objArr;
                    A06 = (Object[]) objArr[0];
                    this.A01 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    A04--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (C2134gb.class) {
                if (A05 != null) {
                    Object[] objArr2 = A05;
                    this.A02 = objArr2;
                    A05 = (Object[]) objArr2[0];
                    this.A01 = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    A03--;
                    return;
                }
            }
        }
        this.A01 = new int[i10];
        this.A02 = new Object[i10 << 1];
    }

    public static void A06(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (C2134gb.class) {
                if (A04 < 10) {
                    objArr[0] = A06;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    A06 = objArr;
                    A04++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C2134gb.class) {
                if (A03 < 10) {
                    objArr[0] = A05;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    A05 = objArr;
                    A03++;
                }
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ob != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final int A07(Object obj) {
        int i10 = this.A00 * 2;
        Object[] objArr = this.A02;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    int N = i11 >> 1;
                    return N;
                }
            }
        } else {
            for (int i12 = 1; i12 < i10; i12 += 2) {
                boolean zEquals = obj.equals(objArr[i12]);
                if (A08[4].length() != 22) {
                    String[] strArr = A08;
                    strArr[3] = "bt44SpsCW8by";
                    strArr[5] = "Iovdsjym1Cx2";
                    if (zEquals) {
                        int i13 = i12 >> 1;
                        String[] strArr2 = A08;
                        String str = strArr2[3];
                        String str2 = strArr2[5];
                        int length = str.length();
                        int N2 = str2.length();
                        if (length == N2) {
                            String[] strArr3 = A08;
                            strArr3[1] = "ZvOUY6";
                            strArr3[7] = "nVlZAl";
                            return i13;
                        }
                    }
                }
                throw new RuntimeException();
            }
        }
        String[] strArr4 = A08;
        String str3 = strArr4[6];
        String str4 = strArr4[0];
        int iCharAt = str3.charAt(31);
        int N3 = str4.charAt(31);
        if (iCharAt != N3) {
            A08[2] = "MKm6k3UubQ6";
            return -1;
        }
        String[] strArr5 = A08;
        strArr5[3] = "2Vghj6DMfX1I";
        strArr5[5] = "igqcF6KEPQ66";
        return -1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ob != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final int A08(Object obj) {
        return obj == null ? A00() : A01(obj, obj.hashCode());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ob != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final K A09(int i10) {
        return (K) this.A02[i10 << 1];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ob != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V A0B(int i10) {
        return (V) this.A02[(i10 << 1) + 1];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ob != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V A0C(int i10, V v10) {
        int i11 = (i10 << 1) + 1;
        V v11 = (V) this.A02[i11];
        this.A02[i11] = v10;
        return v11;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ob != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final void A0D(int i10) {
        int i11 = this.A00;
        int osize = this.A01.length;
        if (osize < i10) {
            int[] iArr = this.A01;
            Object[] objArr = this.A02;
            A05(i10);
            int osize2 = this.A00;
            if (osize2 > 0) {
                System.arraycopy(iArr, 0, this.A01, 0, i11);
                int osize3 = i11 << 1;
                System.arraycopy(objArr, 0, this.A02, 0, osize3);
            }
            A06(iArr, objArr, i11);
        }
        int osize4 = this.A00;
        if (osize4 == i11) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ob != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final void clear() {
        if (this.A00 > 0) {
            int[] iArr = this.A01;
            String[] strArr = A08;
            if (strArr[6].charAt(31) == strArr[0].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[6] = "UNrHeFRST0N9gyLTBJ6FVG6osgOV0jla";
            strArr2[0] = "Uxp69fMHdnF3RanJB6hneAcQQEE567qn";
            Object[] objArr = this.A02;
            int i10 = this.A00;
            int[] ohashes = OR.A01;
            this.A01 = ohashes;
            this.A02 = OR.A03;
            this.A00 = 0;
            A06(iArr, objArr, i10);
        }
        if (this.A00 <= 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ob != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final boolean containsKey(Object obj) {
        return A08(obj) >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ob != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final boolean containsValue(Object obj) {
        return A07(obj) >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ob != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V get(Object obj) {
        int iA08 = A08(obj);
        if (iA08 >= 0) {
            return (V) this.A02[(iA08 << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ob != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final boolean isEmpty() {
        return this.A00 <= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ob != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V remove(Object obj) {
        int index = A08(obj);
        if (index >= 0) {
            return A0A(index);
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ob != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final int size() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ob != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final String toString() {
        if (isEmpty()) {
            return A03(12, 2, 37);
        }
        StringBuilder sb2 = new StringBuilder(this.A00 * 28);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        for (int i10 = 0; i10 < this.A00; i10++) {
            if (i10 > 0) {
                sb2.append(A03(10, 2, 111));
            }
            K kA09 = A09(i10);
            String strA03 = A03(0, 10, 101);
            if (kA09 != this) {
                sb2.append(kA09);
            } else {
                sb2.append(strA03);
            }
            sb2.append(G5.T);
            V vA0B = A0B(i10);
            if (vA0B != this) {
                sb2.append(vA0B);
            } else {
                sb2.append(strA03);
            }
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }
}
