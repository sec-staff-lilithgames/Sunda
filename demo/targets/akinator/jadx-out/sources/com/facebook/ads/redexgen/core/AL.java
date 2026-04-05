package com.facebook.ads.redexgen.core;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network.dex */
public final class AL<K, V> extends AbstractC2485mj<K, V> {
    public static String[] A03 = {"BLd", "8EKeVjTJIU6MDNPM6ZTo", "HWbOsw9VtzWta1ewMSd8SFleZB3uycJV", "4g", "oHZcZe8PYtJP7zuLK1jInYJjmOVWCxEe", "hqSXyAZ2zuGNDHd4PkKakj6NBzhfvhom", "1gwnz8jAk7EqAxYvZHDnpar6edM6d04", "wfrdBhaNwCqY"};
    public static final AbstractC2485mj<Object, Object> A04 = new AL(null, new Object[0], 0);
    public static final long serialVersionUID = 0;
    public final transient Object[] A00;
    public final transient int A01;

    @CheckForNull
    public final transient Object A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <K, V> AL<K, V> A00(int n9, Object[] alternatingKeysAndValues, C2483mh<K, V> builder) {
        Object obj;
        if (n9 == 0) {
            return (AL) A04;
        }
        if (n9 == 1) {
            AbstractC2426ll.A03(Objects.requireNonNull(alternatingKeysAndValues[0]), Objects.requireNonNull(alternatingKeysAndValues[1]));
            return new AL<>(null, alternatingKeysAndValues, 1);
        }
        AbstractC2279jA.A01(n9, alternatingKeysAndValues.length >> 1);
        Object objA02 = A02(alternatingKeysAndValues, n9, AbstractC1080Al.A03(n9), 0);
        if (objA02 instanceof Object[]) {
            Object[] objArr = (Object[]) objA02;
            C2482mg c2482mg = (C2482mg) objArr[2];
            if (builder == null) {
                throw c2482mg.A02();
            }
            builder.A01 = c2482mg;
            obj = objArr[0];
            n9 = ((Integer) objArr[1]).intValue();
            alternatingKeysAndValues = Arrays.copyOf(alternatingKeysAndValues, n9 * 2);
        } else {
            obj = objA02;
        }
        return new AL<>(obj, alternatingKeysAndValues, n9);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AL != com.google.common.collect.RegularImmutableMap<K, V> */
    public AL(@CheckForNull Object hashTable, Object[] alternatingKeysAndValues, int size) {
        this.A02 = hashTable;
        this.A00 = alternatingKeysAndValues;
        this.A01 = size;
    }

    @CheckForNull
    public static Object A01(@CheckForNull Object hashTableObject, @CheckForNull Object[] alternatingKeysAndValues, int size, int keyOffset, Object key) {
        int keyIndex;
        if (key == null) {
            return null;
        }
        if (size == 1) {
            if (!Objects.requireNonNull(alternatingKeysAndValues[keyOffset]).equals(key)) {
                return null;
            }
            Object obj = alternatingKeysAndValues[keyOffset ^ 1];
            if (A03[3].length() == 2) {
                String[] strArr = A03;
                strArr[4] = "QVSrtcZKARogVSSTsDMErisHHhx3s08I";
                strArr[2] = "AM5zanCyyloF9oZfJSoNtkvSUtakyhf1";
                return Objects.requireNonNull(obj);
            }
        } else {
            if (hashTableObject == null) {
                return null;
            }
            if (hashTableObject instanceof byte[]) {
                String[] strArr2 = A03;
                if (strArr2[4].charAt(30) != strArr2[2].charAt(30)) {
                    String[] strArr3 = A03;
                    strArr3[0] = "33E";
                    strArr3[7] = "0IVWz8DDpNA7";
                    byte[] bArr = (byte[]) hashTableObject;
                    int mask = bArr.length - 1;
                    int iA00 = AbstractC2470mU.A00(key.hashCode());
                    while (true) {
                        int i10 = iA00 & mask;
                        int i11 = bArr[i10];
                        String[] strArr4 = A03;
                        if (strArr4[0].length() == strArr4[7].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr5 = A03;
                        strArr5[4] = "Av4xGd01JYXCpVUXSFBX5Q3qG21nzo21";
                        strArr5[2] = "UuPO1t2w2j7pNt6wRWMrea5HC47YMJTH";
                        keyIndex = i11 & 255;
                        if (keyIndex == 255) {
                            return null;
                        }
                        boolean zEquals = key.equals(alternatingKeysAndValues[keyIndex]);
                        String[] strArr6 = A03;
                        if (strArr6[0].length() != strArr6[7].length()) {
                            A03[6] = "uEfKnUldtWRHisqrfIDf4ni9PGEoRP0";
                            if (zEquals) {
                                break;
                            }
                            iA00 = i10 + 1;
                        } else {
                            A03[1] = "rg32th7lbb1pJpYlIRnh";
                            if (zEquals) {
                                break;
                            }
                            iA00 = i10 + 1;
                        }
                    }
                    Object obj2 = alternatingKeysAndValues[keyIndex ^ 1];
                    if (A03[1].length() != 20) {
                        return obj2;
                    }
                    A03[1] = "OPXdJDLfRI5AGRwdD0N1";
                    return obj2;
                }
            } else if (hashTableObject instanceof short[]) {
                short[] sArr = (short[]) hashTableObject;
                int mask2 = sArr.length - 1;
                int iA002 = AbstractC2470mU.A00(key.hashCode());
                while (true) {
                    int i12 = iA002 & mask2;
                    int h10 = sArr[i12] & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                    if (h10 == 65535) {
                        return null;
                    }
                    if (key.equals(alternatingKeysAndValues[h10])) {
                        return alternatingKeysAndValues[h10 ^ 1];
                    }
                    iA002 = i12 + 1;
                }
            } else {
                int[] iArr = (int[]) hashTableObject;
                int mask3 = iArr.length - 1;
                int iA003 = AbstractC2470mU.A00(key.hashCode());
                while (true) {
                    int i13 = iA003 & mask3;
                    int h11 = iArr[i13];
                    if (h11 == -1) {
                        return null;
                    }
                    if (key.equals(alternatingKeysAndValues[h11])) {
                        return alternatingKeysAndValues[h11 ^ 1];
                    }
                    iA003 = i13 + 1;
                }
            }
        }
        throw new RuntimeException();
    }

    @CheckForNull
    public static Object A02(Object[] alternatingKeysAndValues, int n9, int tableSize, int keyOffset) {
        if (n9 == 1) {
            AbstractC2426ll.A03(Objects.requireNonNull(alternatingKeysAndValues[keyOffset]), Objects.requireNonNull(alternatingKeysAndValues[keyOffset ^ 1]));
            return null;
        }
        int h10 = tableSize - 1;
        C2482mg c2482mg = null;
        int i10 = -1;
        if (tableSize > 128) {
            if (tableSize <= 32768) {
                short[] hashTable = new short[tableSize];
                Arrays.fill(hashTable, (short) -1);
                int keyIndex = 0;
                for (int i11 = 0; i11 < n9; i11++) {
                    int i12 = (i11 * 2) + keyOffset;
                    int h11 = (keyIndex * 2) + keyOffset;
                    Object value = Objects.requireNonNull(alternatingKeysAndValues[i12]);
                    Object objRequireNonNull = Objects.requireNonNull(alternatingKeysAndValues[i12 ^ 1]);
                    AbstractC2426ll.A03(value, objRequireNonNull);
                    int iA00 = AbstractC2470mU.A00(value.hashCode());
                    while (true) {
                        int i13 = iA00 & h10;
                        int i14 = hashTable[i13] & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                        if (i14 == 65535) {
                            hashTable[i13] = (short) h11;
                            if (keyIndex < i11) {
                                alternatingKeysAndValues[h11] = value;
                                alternatingKeysAndValues[h11 ^ 1] = objRequireNonNull;
                            }
                            keyIndex++;
                        } else {
                            boolean zEquals = value.equals(alternatingKeysAndValues[i14]);
                            if (A03[5].charAt(16) != 'P') {
                                throw new RuntimeException();
                            }
                            A03[5] = "XeR3XdSVagosh0VhP9e0zQ2n8NaTx8OB";
                            if (zEquals) {
                                c2482mg = new C2482mg(value, objRequireNonNull, Objects.requireNonNull(alternatingKeysAndValues[i14 ^ 1]));
                                alternatingKeysAndValues[i14 ^ 1] = objRequireNonNull;
                                break;
                            }
                            iA00 = i13 + 1;
                        }
                    }
                }
                return keyIndex == n9 ? hashTable : new Object[]{hashTable, Integer.valueOf(keyIndex), c2482mg};
            }
            int[] hashTable2 = new int[tableSize];
            Arrays.fill(hashTable2, -1);
            int i15 = 0;
            int i16 = 0;
            while (i16 < n9) {
                int i17 = (i16 * 2) + keyOffset;
                int i18 = (i15 * 2) + keyOffset;
                Object objRequireNonNull2 = Objects.requireNonNull(alternatingKeysAndValues[i17]);
                Object objRequireNonNull3 = Objects.requireNonNull(alternatingKeysAndValues[i17 ^ 1]);
                AbstractC2426ll.A03(objRequireNonNull2, objRequireNonNull3);
                int outKeyIndex = AbstractC2470mU.A00(objRequireNonNull2.hashCode());
                while (true) {
                    int outKeyIndex2 = outKeyIndex & h10;
                    int i19 = hashTable2[outKeyIndex2];
                    if (i19 == i10) {
                        hashTable2[outKeyIndex2] = i18;
                        if (i15 < i16) {
                            alternatingKeysAndValues[i18] = objRequireNonNull2;
                            alternatingKeysAndValues[i18 ^ 1] = objRequireNonNull3;
                        }
                        i15++;
                    } else {
                        if (objRequireNonNull2.equals(alternatingKeysAndValues[i19])) {
                            c2482mg = new C2482mg(objRequireNonNull2, objRequireNonNull3, Objects.requireNonNull(alternatingKeysAndValues[i19 ^ 1]));
                            alternatingKeysAndValues[i19 ^ 1] = objRequireNonNull3;
                            break;
                        }
                        outKeyIndex = outKeyIndex2 + 1;
                        i10 = -1;
                    }
                }
                i16++;
                i10 = -1;
            }
            return i15 == n9 ? hashTable2 : new Object[]{hashTable2, Integer.valueOf(i15), c2482mg};
        }
        byte[] bArr = new byte[tableSize];
        Arrays.fill(bArr, (byte) -1);
        int i20 = 0;
        for (int i21 = 0; i21 < n9; i21++) {
            int i22 = (i21 * 2) + keyOffset;
            int i23 = (i20 * 2) + keyOffset;
            Object objRequireNonNull4 = Objects.requireNonNull(alternatingKeysAndValues[i22]);
            Object objRequireNonNull5 = Objects.requireNonNull(alternatingKeysAndValues[i22 ^ 1]);
            AbstractC2426ll.A03(objRequireNonNull4, objRequireNonNull5);
            int keyIndex2 = AbstractC2470mU.A00(objRequireNonNull4.hashCode());
            while (true) {
                int keyIndex3 = keyIndex2 & h10;
                int previousKeyIndex = bArr[keyIndex3] & 255;
                if (previousKeyIndex == 255) {
                    bArr[keyIndex3] = (byte) i23;
                    if (i20 < i21) {
                        alternatingKeysAndValues[i23] = objRequireNonNull4;
                        alternatingKeysAndValues[i23 ^ 1] = objRequireNonNull5;
                    }
                    i20++;
                } else {
                    if (objRequireNonNull4.equals(alternatingKeysAndValues[previousKeyIndex])) {
                        c2482mg = new C2482mg(objRequireNonNull4, objRequireNonNull5, Objects.requireNonNull(alternatingKeysAndValues[previousKeyIndex ^ 1]));
                        alternatingKeysAndValues[previousKeyIndex ^ 1] = objRequireNonNull5;
                        break;
                    }
                    keyIndex2 = keyIndex3 + 1;
                }
            }
        }
        return i20 == n9 ? bArr : new Object[]{bArr, Integer.valueOf(i20), c2482mg};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AL != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2485mj
    public final AbstractC2476ma<V> A0A() {
        return new C1X(this.A00, 1, this.A01);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AL != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2485mj
    public final AbstractC1080Al<Map.Entry<K, V>> A0D() {
        return new C1Z(this, this.A00, 0, this.A01);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AL != com.google.common.collect.RegularImmutableMap<K, V> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<K> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2485mj
    public final AbstractC1080Al<K> A0E() {
        final C1X c1x = new C1X(this.A00, 0, this.A01);
        return new AbstractC1080Al<K>(this, c1x) { // from class: com.facebook.ads.redexgen.X.1Y
            public final transient AbstractC1081Am<K> A00;
            public final transient AbstractC2485mj<K, ?> A01;

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1Y != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<K> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mj != com.google.common.collect.ImmutableMap<K, ?> */
            {
                this.A01 = this;
                this.A00 = c1x;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1Y != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // com.facebook.ads.redexgen.core.AbstractC2476ma
            public final int A0I(Object[] dst, int offset) {
                return A0J().A0I(dst, offset);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1Y != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // com.facebook.ads.redexgen.core.AbstractC1080Al, com.facebook.ads.redexgen.core.AbstractC2476ma
            public final AbstractC1081Am<K> A0J() {
                return this.A00;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1Y != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // com.facebook.ads.redexgen.core.AbstractC2476ma
            public final boolean A0K() {
                return true;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1Y != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            /* renamed from: A0N */
            public final AbstractC2648pg<K> iterator() {
                return A0J().iterator();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1Y != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // com.facebook.ads.redexgen.core.AbstractC2476ma, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(@CheckForNull Object object) {
                return this.A01.get(object) != null;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1Y != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return this.A01.size();
            }
        };
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AL != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2485mj
    public final boolean A0F() {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AL != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2485mj, java.util.Map
    @CheckForNull
    public final V get(@CheckForNull Object obj) {
        V v10 = (V) A01(this.A02, this.A00, this.A01, 0, obj);
        if (v10 == null) {
            return null;
        }
        return v10;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AL != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // java.util.Map
    public final int size() {
        return this.A01;
    }
}
