package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ao, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1083Ao<E> extends AbstractC2475mZ<E> {
    public static byte[] A03;
    public static String[] A04 = {"emqP2Ifv15ruA3vfOBddLKXSQAhVBBiZ", "hrMd7lJ1e8dj2uYkEp7ZkSLs2D8yKDzP", "R1glWPF1KbPaEDQGu2GwL6vWIpfQR0VI", "T12dHmfXBitdOytN2RtspbU6Ik8qeuAk", "0tCJd3vKXz4Euq7T8InIHSFr9bbtNXIu", "Q", "MwChlhzfsoxh", "7ToYkJZV1iSpkxWyqnmjBpfIK3KeTcwM"};
    public int A00;
    public boolean A01;
    public Object[] A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A04[3].charAt(25) != 'k') {
                throw new RuntimeException();
            }
            A04[4] = "sNiI9gS6nHnAzu4lGjYMdK7Ee3tNN7Ch";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 87);
            i13++;
        }
    }

    public static void A01() {
        A03 = new byte[]{-6, -1, -6, 5, -6, -14, -3, -44, -14, 1, -14, -12, -6, 5, 10};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ao != com.google.common.collect.ImmutableCollection$ArrayBasedBuilder<E> */
    public AbstractC1083Ao(int initialCapacity) {
        AbstractC2426ll.A00(initialCapacity, A00(0, 15, 58));
        this.A02 = new Object[initialCapacity];
        this.A00 = 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ao != com.google.common.collect.ImmutableCollection$ArrayBasedBuilder<E> */
    private void A02(int minCapacity) {
        if (this.A02.length < minCapacity) {
            this.A02 = Arrays.copyOf(this.A02, AbstractC2475mZ.A03(this.A02.length, minCapacity));
            this.A01 = false;
        } else {
            if (!this.A01) {
                return;
            }
            this.A02 = (Object[]) this.A02.clone();
            this.A01 = false;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ao != com.google.common.collect.ImmutableCollection$ArrayBasedBuilder<E> */
    public AbstractC1083Ao<E> A03(E element) {
        AbstractC2279jA.A04(element);
        A02(this.A00 + 1);
        Object[] objArr = this.A02;
        int i10 = this.A00;
        this.A00 = i10 + 1;
        objArr[i10] = element;
        return this;
    }
}
