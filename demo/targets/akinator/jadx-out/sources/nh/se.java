package nh;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class se extends re {

    /* renamed from: i, reason: collision with root package name */
    public transient long[] f76642i;

    /* renamed from: j, reason: collision with root package name */
    public transient int f76643j;

    /* renamed from: k, reason: collision with root package name */
    public transient int f76644k;

    @Override // nh.re
    public final int b() {
        int i10 = this.f76643j;
        if (i10 == -2) {
            return -1;
        }
        return i10;
    }

    @Override // nh.re
    public void clear() {
        super.clear();
        this.f76643j = -2;
        this.f76644k = -2;
    }

    @Override // nh.re
    public final void f(int i10) {
        super.f(i10);
        this.f76643j = -2;
        this.f76644k = -2;
        long[] jArr = new long[i10];
        this.f76642i = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // nh.re
    public final void g(int i10, int i11, int i12, Object obj) {
        super.g(i10, i11, i12, obj);
        n(this.f76644k, i10);
        n(i10, -2);
    }

    @Override // nh.re
    public final void h(int i10) {
        int i11 = this.f76606c - 1;
        long j10 = this.f76642i[i10];
        n((int) (j10 >>> 32), (int) j10);
        if (i10 < i11) {
            n((int) (this.f76642i[i11] >>> 32), i10);
            n(i10, (int) this.f76642i[i11]);
        }
        super.h(i10);
    }

    @Override // nh.re
    public final int i(int i10) {
        int i11 = (int) this.f76642i[i10];
        if (i11 == -2) {
            return -1;
        }
        return i11;
    }

    @Override // nh.re
    public final void l(int i10) {
        super.l(i10);
        long[] jArr = this.f76642i;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
        this.f76642i = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, i10, -1L);
    }

    public final void n(int i10, int i11) {
        if (i10 == -2) {
            this.f76643j = i11;
        } else {
            long[] jArr = this.f76642i;
            jArr[i10] = (jArr[i10] & (-4294967296L)) | (i11 & 4294967295L);
        }
        if (i11 == -2) {
            this.f76644k = i10;
        } else {
            long[] jArr2 = this.f76642i;
            jArr2[i11] = (4294967295L & jArr2[i11]) | (i10 << 32);
        }
    }
}
