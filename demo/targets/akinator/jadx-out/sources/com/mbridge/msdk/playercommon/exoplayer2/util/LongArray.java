package com.mbridge.msdk.playercommon.exoplayer2.util;

import java.util.Arrays;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class LongArray {
    private static final int DEFAULT_INITIAL_CAPACITY = 32;
    private int size;
    private long[] values;

    public LongArray() {
        this(32);
    }

    public void add(long j10) {
        int i10 = this.size;
        long[] jArr = this.values;
        if (i10 == jArr.length) {
            this.values = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.values;
        int i11 = this.size;
        this.size = i11 + 1;
        jArr2[i11] = j10;
    }

    public long get(int i10) {
        if (i10 >= 0 && i10 < this.size) {
            return this.values[i10];
        }
        StringBuilder sbT = o2.t(i10, "Invalid index ", ", size is ");
        sbT.append(this.size);
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    public int size() {
        return this.size;
    }

    public long[] toArray() {
        return Arrays.copyOf(this.values, this.size);
    }

    public LongArray(int i10) {
        this.values = new long[i10];
    }
}
