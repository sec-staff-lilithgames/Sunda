package io.odeeo.internal.t0;

import io.odeeo.internal.t0.d;
import java.util.BitSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y extends d.v {

    /* renamed from: b, reason: collision with root package name */
    public final char[] f66470b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f66471c;

    /* renamed from: d, reason: collision with root package name */
    public final long f66472d;

    public y(char[] cArr, long j10, boolean z10, String str) {
        super(str);
        this.f66470b = cArr;
        this.f66472d = j10;
        this.f66471c = z10;
    }

    public static int b(int i10) {
        if (i10 == 1) {
            return 2;
        }
        int iHighestOneBit = Integer.highestOneBit(i10 - 1) << 1;
        while (iHighestOneBit * 0.5d < i10) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static int c(int i10) {
        return Integer.rotateLeft(i10 * (-862048943), 15) * 461845907;
    }

    public final boolean a(int i10) {
        return 1 == ((this.f66472d >> i10) & 1);
    }

    @Override // io.odeeo.internal.t0.d
    public boolean matches(char c10) {
        if (c10 == 0) {
            return this.f66471c;
        }
        if (!a((int) c10)) {
            return false;
        }
        int length = this.f66470b.length - 1;
        int iC = c(c10) & length;
        int i10 = iC;
        do {
            char c11 = this.f66470b[i10];
            if (c11 == 0) {
                return false;
            }
            if (c11 == c10) {
                return true;
            }
            i10 = (i10 + 1) & length;
        } while (i10 != iC);
        return false;
    }

    public static d a(BitSet bitSet, String str) {
        int i10;
        int iCardinality = bitSet.cardinality();
        boolean z10 = bitSet.get(0);
        int iB = b(iCardinality);
        char[] cArr = new char[iB];
        int i11 = iB - 1;
        int iNextSetBit = bitSet.nextSetBit(0);
        long j10 = 0;
        while (iNextSetBit != -1) {
            long j11 = (1 << iNextSetBit) | j10;
            int iC = c(iNextSetBit);
            while (true) {
                i10 = iC & i11;
                if (cArr[i10] == 0) {
                    break;
                }
                iC = i10 + 1;
            }
            cArr[i10] = (char) iNextSetBit;
            iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1);
            j10 = j11;
        }
        return new y(cArr, j10, z10, str);
    }

    @Override // io.odeeo.internal.t0.d
    public void a(BitSet bitSet) {
        if (this.f66471c) {
            bitSet.set(0);
        }
        for (char c10 : this.f66470b) {
            if (c10 != 0) {
                bitSet.set(c10);
            }
        }
    }
}
