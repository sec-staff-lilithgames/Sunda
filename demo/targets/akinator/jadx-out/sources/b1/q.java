package b1;

import b0.e2;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f8667a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f8668b = v.snapshotIdArrayWithCapacity(16);

    /* renamed from: c, reason: collision with root package name */
    public int[] f8669c = new int[16];

    /* renamed from: d, reason: collision with root package name */
    public int[] f8670d;

    /* renamed from: e, reason: collision with root package name */
    public int f8671e;

    public q() {
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        this.f8670d = iArr;
    }

    public static /* synthetic */ long lowestOrDefault$default(q qVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        return qVar.lowestOrDefault(j10);
    }

    public final void a(int i10, int i11) {
        long[] jArr = this.f8668b;
        int[] iArr = this.f8669c;
        int[] iArr2 = this.f8670d;
        long j10 = jArr[i10];
        jArr[i10] = jArr[i11];
        jArr[i11] = j10;
        int i12 = iArr[i10];
        int i13 = iArr[i11];
        iArr[i10] = i13;
        iArr[i11] = i12;
        iArr2[i13] = i10;
        iArr2[i12] = i11;
    }

    public final int add(long j10) {
        int i10 = this.f8667a + 1;
        int length = this.f8668b.length;
        if (i10 > length) {
            int i11 = length * 2;
            long[] jArrSnapshotIdArrayWithCapacity = v.snapshotIdArrayWithCapacity(i11);
            int[] iArr = new int[i11];
            uu.f0.copyInto$default(this.f8668b, jArrSnapshotIdArrayWithCapacity, 0, 0, 0, 12, (Object) null);
            uu.f0.copyInto$default(this.f8669c, iArr, 0, 0, 0, 14, (Object) null);
            this.f8668b = jArrSnapshotIdArrayWithCapacity;
            this.f8669c = iArr;
        }
        int i12 = this.f8667a;
        this.f8667a = i12 + 1;
        int length2 = this.f8670d.length;
        if (this.f8671e >= length2) {
            int i13 = length2 * 2;
            int[] iArr2 = new int[i13];
            int i14 = 0;
            while (i14 < i13) {
                int i15 = i14 + 1;
                iArr2[i14] = i15;
                i14 = i15;
            }
            uu.f0.copyInto$default(this.f8670d, iArr2, 0, 0, 0, 14, (Object) null);
            this.f8670d = iArr2;
        }
        int i16 = this.f8671e;
        int[] iArr3 = this.f8670d;
        this.f8671e = iArr3[i16];
        long[] jArr = this.f8668b;
        jArr[i12] = j10;
        this.f8669c[i12] = i16;
        iArr3[i16] = i12;
        while (i12 > 0) {
            int i17 = ((i12 + 1) >> 1) - 1;
            if (kotlin.jvm.internal.e0.compare(jArr[i17], j10) <= 0) {
                break;
            }
            a(i17, i12);
            i12 = i17;
        }
        return i16;
    }

    public final int getSize() {
        return this.f8667a;
    }

    public final long lowestOrDefault(long j10) {
        return this.f8667a > 0 ? this.f8668b[0] : j10;
    }

    public final void remove(int i10) {
        int i11 = this.f8670d[i10];
        a(i11, this.f8667a - 1);
        this.f8667a--;
        long[] jArr = this.f8668b;
        long j10 = jArr[i11];
        int i12 = i11;
        while (i12 > 0) {
            int i13 = ((i12 + 1) >> 1) - 1;
            if (kotlin.jvm.internal.e0.compare(jArr[i13], j10) <= 0) {
                break;
            }
            a(i13, i12);
            i12 = i13;
        }
        long[] jArr2 = this.f8668b;
        int i14 = this.f8667a >> 1;
        while (i11 < i14) {
            int i15 = (i11 + 1) << 1;
            int i16 = i15 - 1;
            if (i15 < this.f8667a && kotlin.jvm.internal.e0.compare(jArr2[i15], jArr2[i16]) < 0) {
                if (kotlin.jvm.internal.e0.compare(jArr2[i15], jArr2[i11]) >= 0) {
                    break;
                }
                a(i15, i11);
                i11 = i15;
            } else {
                if (kotlin.jvm.internal.e0.compare(jArr2[i16], jArr2[i11]) >= 0) {
                    break;
                }
                a(i16, i11);
                i11 = i16;
            }
        }
        this.f8670d[i10] = this.f8671e;
        this.f8671e = i10;
    }

    public final void validate() {
        int i10 = this.f8667a;
        int i11 = 1;
        while (i11 < i10) {
            int i12 = i11 + 1;
            long[] jArr = this.f8668b;
            if (kotlin.jvm.internal.e0.compare(jArr[(i12 >> 1) - 1], jArr[i11]) > 0) {
                throw new IllegalStateException(("Index " + i11 + " is out of place").toString());
            }
            i11 = i12;
        }
    }

    public final void validateHandle(int i10, long j10) {
        int i11 = this.f8670d[i10];
        if (this.f8669c[i11] != i10) {
            throw new IllegalStateException(("Index for handle " + i10 + " is corrupted").toString());
        }
        if (this.f8668b[i11] == j10) {
            return;
        }
        StringBuilder sbT = o2.t(i10, "Value for handle ", " was ");
        sbT.append(this.f8668b[i11]);
        throw new IllegalStateException(e2.i(j10, " but was supposed to be ", sbT).toString());
    }
}
