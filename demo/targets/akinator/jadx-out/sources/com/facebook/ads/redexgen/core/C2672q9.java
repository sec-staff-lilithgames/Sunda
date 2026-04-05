package com.facebook.ads.redexgen.core;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.q9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2672q9 extends AbstractList<Integer> implements RandomAccess, Serializable {
    public static byte[] A03;
    public static String[] A04 = {"YU1VDkaJfx0npt5ZCy0wfRWqTvB0gzrf", "HnEPzK", "p4nBQ52ikpMWjKifemE03jhF", "yEe4449S5FSBazETcjdBTZewZPLdBAWq", "Xlyhv", "2ScPcgGnYkk5iwJP9xeXeJNhXWw9hNmB", "BfGEj8ajDZOUDr9MhSeGOx8aXIdVpKot", "7ounehwY5pAPt7bmg9fcb1FAHFBm19vl"};
    public static final long serialVersionUID = 0;
    public final int A00;
    public final int A01;
    public final int[] A02;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-87, -99};
    }

    static {
        A03();
    }

    public C2672q9(int[] array) {
        this(array, 0, array.length);
    }

    public C2672q9(int[] array, int start, int end) {
        this.A02 = array;
        this.A01 = start;
        this.A00 = end;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Integer get(int index) {
        AbstractC2279jA.A00(index, size());
        return Integer.valueOf(this.A02[this.A01 + index]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final Integer set(int index, Integer element) {
        AbstractC2279jA.A00(index, size());
        int i10 = this.A02[this.A01 + index];
        int[] iArr = this.A02;
        int i11 = this.A01 + index;
        int oldValue = ((Integer) AbstractC2279jA.A04(element)).intValue();
        iArr[i11] = oldValue;
        return Integer.valueOf(i10);
    }

    public final int[] A04() {
        return Arrays.copyOfRange(this.A02, this.A01, this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@CheckForNull Object target) {
        return (target instanceof Integer) && AD.A05(this.A02, ((Integer) target).intValue(), this.A01, this.A00) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        boolean z10 = object instanceof C2672q9;
        if (A04[2].length() != 24) {
            throw new RuntimeException();
        }
        A04[2] = "hkNtVJfoNZugUfjtOIkeX8Ri";
        if (z10) {
            C2672q9 c2672q9 = (C2672q9) object;
            int size = size();
            if (c2672q9.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int size2 = this.A02[this.A01 + i10];
                if (size2 != c2672q9.A02[c2672q9.A01 + i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(object);
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r3 = this;
            r1 = 1
            int r2 = r3.A01
        L3:
            int r0 = r3.A00
            if (r2 >= r0) goto L15
            int r1 = r1 * 31
            int[] r0 = r3.A02
            r0 = r0[r2]
            int r0 = com.facebook.ads.redexgen.core.AD.A00(r0)
            int r1 = r1 + r0
            int r2 = r2 + 1
            goto L3
        L15:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2672q9.hashCode():int");
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(@CheckForNull Object target) {
        if (target instanceof Integer) {
            int[] iArr = this.A02;
            String[] strArr = A04;
            if (strArr[6].charAt(15) == strArr[5].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[6] = "lB9Ee3UdEb1Lo8jQSlnhxnRY63rogU68";
            strArr2[5] = "23HXI0mrZUyV0MEjy70kUSUiY9qLKHl0";
            int i10 = AD.A05(iArr, ((Integer) target).intValue(), this.A01, this.A00);
            if (i10 >= 0) {
                return i10 - this.A01;
            }
            return -1;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(@CheckForNull Object target) {
        int iA06;
        if ((target instanceof Integer) && (iA06 = AD.A06(this.A02, ((Integer) target).intValue(), this.A01, this.A00)) >= 0) {
            int i10 = this.A01;
            return iA06 - i10;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00 - this.A01;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<Integer> subList(int fromIndex, int toIndex) {
        int size = size();
        AbstractC2279jA.A0B(fromIndex, toIndex, size);
        if (fromIndex == toIndex) {
            return Collections.emptyList();
        }
        return new C2672q9(this.A02, this.A01 + fromIndex, this.A01 + toIndex);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 5);
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST).append(this.A02[this.A01]);
        for (int i10 = this.A01 + 1; i10 < this.A00; i10++) {
            sb2.append(A02(0, 2, 23)).append(this.A02[i10]);
        }
        StringBuilder builder = sb2.append(AbstractJsonLexerKt.END_LIST);
        return builder.toString();
    }
}
