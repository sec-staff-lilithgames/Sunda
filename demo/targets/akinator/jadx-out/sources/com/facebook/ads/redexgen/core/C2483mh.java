package com.facebook.ads.redexgen.core;

import com.google.errorprone.annotations.DoNotMock;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

@DoNotMock
/* renamed from: com.facebook.ads.redexgen.X.mh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2483mh<K, V> {
    public static String[] A05 = {"Ik8goa9HXdjUedq8cEoRj", "yNhTKiocZ7rjCehz8OJ2i", "DkakVx1e11xcRXvmRC6v1TtF6afSopEP", "UtLKeYkY3MHutveLBbt6ViX4Ghxq7RLm", "uRXlO9IyqWrK3A2ygB5qFTtsXpO2Awm7", "zlj3Be3Z9w6linslu0iq2TGTNfwrs1VP", "5qPNzLkadTBG9NaQBiFovEuvvje4vKUT", "NGIyMpNx726S6ss9PVDsEc5y9iMjD192"};
    public int A00;
    public C2482mg A01;

    @CheckForNull
    public Comparator<? super V> A02;
    public boolean A03;
    public Object[] A04;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mh != com.google.common.collect.ImmutableMap$Builder<K, V> */
    public C2483mh() {
        this(4);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mh != com.google.common.collect.ImmutableMap$Builder<K, V> */
    public C2483mh(int initialCapacity) {
        this.A04 = new Object[initialCapacity * 2];
        this.A00 = 0;
        this.A03 = false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mh != com.google.common.collect.ImmutableMap$Builder<K, V> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mj != com.google.common.collect.ImmutableMap<K, V> */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.facebook.ads.redexgen.core.AbstractC2485mj<K, V> A00(boolean r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L6
            com.facebook.ads.redexgen.X.mg r0 = r6.A01
            if (r0 != 0) goto L9f
        L6:
            int r4 = r6.A00
            java.util.Comparator<? super V> r0 = r6.A02
            r5 = 1
            if (r0 != 0) goto L3b
            java.lang.Object[] r3 = r6.A04
        Lf:
            r6.A03 = r5
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2483mh.A05
            r0 = 7
            r1 = r2[r0]
            r0 = 6
            r2 = r2[r0]
            r0 = 3
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L99
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2483mh.A05
            java.lang.String r1 = "XM2Ql5x9fz20ei3IvXWTiqpzWNcACmEW"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "FilAMF5uGkzgcjBUcpllGZjqGija48a5"
            r0 = 5
            r2[r0] = r1
            com.facebook.ads.redexgen.X.AL r0 = com.facebook.ads.redexgen.core.AL.A00(r4, r3, r6)
            if (r7 == 0) goto L3a
            com.facebook.ads.redexgen.X.mg r1 = r6.A01
            if (r1 != 0) goto L92
        L3a:
            return r0
        L3b:
            boolean r0 = r6.A03
            if (r0 == 0) goto L4b
            java.lang.Object[] r1 = r6.A04
            int r0 = r6.A00
            int r0 = r0 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            r6.A04 = r0
        L4b:
            java.lang.Object[] r3 = r6.A04
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2483mh.A05
            r0 = 7
            r1 = r2[r0]
            r0 = 6
            r2 = r2[r0]
            r0 = 3
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L83
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2483mh.A05
            java.lang.String r1 = "tX3gZScD6fAOC4rORBvWPUmZGErHeLSO"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "jrBtMl0wusQaFHx7PyJGdvme9jU6DfCL"
            r0 = 6
            r2[r0] = r1
            if (r7 != 0) goto L7d
        L6e:
            int r0 = r6.A00
            java.lang.Object[] r3 = r6.A03(r3, r0)
            int r1 = r3.length
            java.lang.Object[] r0 = r6.A04
            int r0 = r0.length
            if (r1 >= r0) goto L7d
            int r0 = r3.length
            int r4 = r0 >>> 1
        L7d:
            java.util.Comparator<? super V> r0 = r6.A02
            A02(r3, r4, r0)
            goto Lf
        L83:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2483mh.A05
            java.lang.String r1 = "PSlulOu9AYbjP6HRhL598"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "W85FiMbgjq5wBNzVkCx7e"
            r0 = 0
            r2[r0] = r1
            if (r7 != 0) goto L7d
            goto L6e
        L92:
            com.facebook.ads.redexgen.X.mg r0 = r6.A01
            java.lang.IllegalArgumentException r0 = r0.A02()
            throw r0
        L99:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L9f:
            com.facebook.ads.redexgen.X.mg r0 = r6.A01
            java.lang.IllegalArgumentException r0 = r0.A02()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2483mh.A00(boolean):com.facebook.ads.redexgen.X.AL");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mh != com.google.common.collect.ImmutableMap$Builder<K, V> */
    private void A01(int minCapacity) {
        if (minCapacity * 2 > this.A04.length) {
            this.A04 = Arrays.copyOf(this.A04, AbstractC2475mZ.A03(this.A04.length, minCapacity * 2));
            this.A03 = false;
        }
    }

    public static <V> void A02(Object[] alternatingKeysAndValues, int size, Comparator<? super V> valueComparator) {
        Map.Entry[] entryArr = new Map.Entry[size];
        for (int i10 = 0; i10 < size; i10++) {
            Object key = Objects.requireNonNull(alternatingKeysAndValues[i10 * 2]);
            entryArr[i10] = new AbstractMap.SimpleImmutableEntry(key, Objects.requireNonNull(alternatingKeysAndValues[(i10 * 2) + 1]));
        }
        Arrays.sort(entryArr, 0, size, AbstractC2593oV.A04(valueComparator).A05(AbstractC2562nz.A04()));
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = i11 * 2;
            alternatingKeysAndValues[i12] = entryArr[i11].getKey();
            int i13 = (i11 * 2) + 1;
            alternatingKeysAndValues[i13] = entryArr[i11].getValue();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mh != com.google.common.collect.ImmutableMap$Builder<K, V> */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object[] A03(java.lang.Object[] r9, int r10) {
        /*
            r8 = this;
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.BitSet r3 = new java.util.BitSet
            r3.<init>()
            int r1 = r10 + (-1)
        Lc:
            if (r1 < 0) goto L22
            int r0 = r1 * 2
            r0 = r9[r0]
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            boolean r0 = r2.add(r0)
            if (r0 != 0) goto L1f
            r3.set(r1)
        L1f:
            int r1 = r1 + (-1)
            goto Lc
        L22:
            boolean r4 = r3.isEmpty()
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2483mh.A05
            r0 = 1
            r1 = r2[r0]
            r0 = 0
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L3e
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3e:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2483mh.A05
            java.lang.String r1 = "c6MJ0uR9bSKZ7TJmqu2Hw"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "RsQ7tLk4pv8rflhmUKtuV"
            r0 = 0
            r2[r0] = r1
            if (r4 == 0) goto L4d
            return r9
        L4d:
            int r0 = r3.cardinality()
            int r0 = r10 - r0
            int r0 = r0 * 2
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r5 = 0
            r7 = 0
        L59:
            int r6 = r10 * 2
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2483mh.A05
            r0 = 7
            r1 = r2[r0]
            r0 = 6
            r2 = r2[r0]
            r0 = 3
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto La0
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2483mh.A05
            java.lang.String r1 = "KtRosFhRShMS8OmqJ5rxyo1E8ullyHpz"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "EZy12p44B0vHf3sXUsOAjtCOpwah16Ul"
            r0 = 5
            r2[r0] = r1
            if (r5 >= r6) goto La3
        L7c:
            int r0 = r5 >>> 1
            boolean r0 = r3.get(r0)
            if (r0 == 0) goto L87
            int r5 = r5 + 2
            goto L59
        L87:
            int r2 = r7 + 1
            int r1 = r5 + 1
            r0 = r9[r5]
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            r4[r7] = r0
            int r7 = r2 + 1
            int r5 = r1 + 1
            r0 = r9[r1]
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            r4[r2] = r0
            goto L59
        La0:
            if (r5 >= r6) goto La3
            goto L7c
        La3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2483mh.A03(java.lang.Object[], int):java.lang.Object[]");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mh != com.google.common.collect.ImmutableMap$Builder<K, V> */
    public C2483mh<K, V> A04(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        if (entries instanceof Collection) {
            A01(this.A00 + ((Collection) entries).size());
        }
        for (Map.Entry<? extends K, ? extends V> entry : entries) {
            String[] strArr = A05;
            if (strArr[1].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[3] = "rS0In8hcQgouYJTkMI0NVISmFAAYCd82";
            strArr2[5] = "9F24JphxFR6iDhplWUuRUXCsXlHokznU";
            A06(entry);
        }
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mh != com.google.common.collect.ImmutableMap$Builder<K, V> */
    public C2483mh<K, V> A05(K key, V value) {
        A01(this.A00 + 1);
        AbstractC2426ll.A03(key, value);
        this.A04[this.A00 * 2] = key;
        this.A04[(this.A00 * 2) + 1] = value;
        this.A00++;
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mh != com.google.common.collect.ImmutableMap$Builder<K, V> */
    public C2483mh<K, V> A06(Map.Entry<? extends K, ? extends V> entry) {
        return A05(entry.getKey(), entry.getValue());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mh != com.google.common.collect.ImmutableMap$Builder<K, V> */
    public AbstractC2485mj<K, V> A07() {
        return A08();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mh != com.google.common.collect.ImmutableMap$Builder<K, V> */
    public AbstractC2485mj<K, V> A08() {
        return A00(true);
    }
}
