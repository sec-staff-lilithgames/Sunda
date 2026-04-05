package io.odeeo.internal.a0;

import java.util.Arrays;
import java.util.Random;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface f0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements f0 {

        /* renamed from: a, reason: collision with root package name */
        public final Random f62314a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f62315b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f62316c;

        public a(int i10) {
            this(i10, new Random());
        }

        public static int[] a(int i10, Random random) {
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                int iNextInt = random.nextInt(i12);
                iArr[i11] = iArr[iNextInt];
                iArr[iNextInt] = i11;
                i11 = i12;
            }
            return iArr;
        }

        @Override // io.odeeo.internal.a0.f0
        public f0 cloneAndClear() {
            return new a(0, new Random(this.f62314a.nextLong()));
        }

        @Override // io.odeeo.internal.a0.f0
        public f0 cloneAndInsert(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                iArr[i13] = this.f62314a.nextInt(this.f62315b.length + 1);
                int i14 = i13 + 1;
                int iNextInt = this.f62314a.nextInt(i14);
                iArr2[i13] = iArr2[iNextInt];
                iArr2[iNextInt] = i13 + i10;
                i13 = i14;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f62315b.length + i11];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f62315b;
                if (i12 >= iArr4.length + i11) {
                    return new a(iArr3, new Random(this.f62314a.nextLong()));
                }
                if (i15 >= i11 || i16 != iArr[i15]) {
                    int i17 = i16 + 1;
                    int i18 = iArr4[i16];
                    iArr3[i12] = i18;
                    if (i18 >= i10) {
                        iArr3[i12] = i18 + i11;
                    }
                    i16 = i17;
                } else {
                    iArr3[i12] = iArr2[i15];
                    i15++;
                }
                i12++;
            }
        }

        @Override // io.odeeo.internal.a0.f0
        public f0 cloneAndRemove(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = new int[this.f62315b.length - i12];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f62315b;
                if (i13 >= iArr2.length) {
                    return new a(iArr, new Random(this.f62314a.nextLong()));
                }
                int i15 = iArr2[i13];
                if (i15 < i10 || i15 >= i11) {
                    int i16 = i13 - i14;
                    if (i15 >= i10) {
                        i15 -= i12;
                    }
                    iArr[i16] = i15;
                } else {
                    i14++;
                }
                i13++;
            }
        }

        @Override // io.odeeo.internal.a0.f0
        public int getFirstIndex() {
            int[] iArr = this.f62315b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // io.odeeo.internal.a0.f0
        public int getLastIndex() {
            int[] iArr = this.f62315b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // io.odeeo.internal.a0.f0
        public int getLength() {
            return this.f62315b.length;
        }

        @Override // io.odeeo.internal.a0.f0
        public int getNextIndex(int i10) {
            int i11 = this.f62316c[i10] + 1;
            int[] iArr = this.f62315b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        @Override // io.odeeo.internal.a0.f0
        public int getPreviousIndex(int i10) {
            int i11 = this.f62316c[i10] - 1;
            if (i11 >= 0) {
                return this.f62315b[i11];
            }
            return -1;
        }

        public a(int i10, long j10) {
            this(i10, new Random(j10));
        }

        public a(int[] iArr, long j10) {
            this(Arrays.copyOf(iArr, iArr.length), new Random(j10));
        }

        public a(int i10, Random random) {
            this(a(i10, random), random);
        }

        public a(int[] iArr, Random random) {
            this.f62315b = iArr;
            this.f62314a = random;
            this.f62316c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f62316c[iArr[i10]] = i10;
            }
        }
    }

    f0 cloneAndClear();

    f0 cloneAndInsert(int i10, int i11);

    f0 cloneAndRemove(int i10, int i11);

    int getFirstIndex();

    int getLastIndex();

    int getLength();

    int getNextIndex(int i10);

    int getPreviousIndex(int i10);
}
