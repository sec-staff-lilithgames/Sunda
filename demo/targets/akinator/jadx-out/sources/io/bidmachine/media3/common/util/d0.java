package io.bidmachine.media3.common.util;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public int f60703a;

    /* renamed from: b, reason: collision with root package name */
    public int f60704b;

    /* renamed from: c, reason: collision with root package name */
    public int f60705c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f60706d;

    /* renamed from: e, reason: collision with root package name */
    public int f60707e;

    public d0() {
        this(16);
    }

    public void add(long j10) {
        int i10 = this.f60705c;
        long[] jArr = this.f60706d;
        if (i10 == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i11 = this.f60703a;
            int i12 = length2 - i11;
            System.arraycopy(jArr, i11, jArr2, 0, i12);
            System.arraycopy(this.f60706d, 0, jArr2, i12, i11);
            this.f60703a = 0;
            this.f60704b = this.f60705c - 1;
            this.f60706d = jArr2;
            this.f60707e = length - 1;
        }
        int i13 = (this.f60704b + 1) & this.f60707e;
        this.f60704b = i13;
        this.f60706d[i13] = j10;
        this.f60705c++;
    }

    public void clear() {
        this.f60703a = 0;
        this.f60704b = -1;
        this.f60705c = 0;
    }

    public long element() {
        if (this.f60705c != 0) {
            return this.f60706d[this.f60703a];
        }
        throw new NoSuchElementException();
    }

    public boolean isEmpty() {
        return this.f60705c == 0;
    }

    public long remove() {
        int i10 = this.f60705c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f60706d;
        int i11 = this.f60703a;
        long j10 = jArr[i11];
        this.f60703a = this.f60707e & (i11 + 1);
        this.f60705c = i10 - 1;
        return j10;
    }

    public int size() {
        return this.f60705c;
    }

    public d0(int i10) {
        a.checkArgument(i10 >= 0 && i10 <= 1073741824);
        i10 = i10 == 0 ? 1 : i10;
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f60703a = 0;
        this.f60704b = -1;
        this.f60705c = 0;
        long[] jArr = new long[i10];
        this.f60706d = jArr;
        this.f60707e = jArr.length - 1;
    }
}
