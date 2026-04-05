package bf;

import java.util.Arrays;
import java.util.Random;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class e1 implements f1 {

    /* renamed from: a, reason: collision with root package name */
    public final Random f9226a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f9227b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f9228c;

    public e1(int i10) {
        this(i10, new Random());
    }

    @Override // bf.f1
    public f1 cloneAndClear() {
        return new e1(0, new Random(this.f9226a.nextLong()));
    }

    @Override // bf.f1
    public f1 cloneAndInsert(int i10, int i11) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i11];
        int[] iArr3 = new int[i11];
        int i12 = 0;
        while (true) {
            iArr = this.f9227b;
            random = this.f9226a;
            if (i12 >= i11) {
                break;
            }
            iArr2[i12] = random.nextInt(iArr.length + 1);
            int i13 = i12 + 1;
            int iNextInt = random.nextInt(i13);
            iArr3[i12] = iArr3[iNextInt];
            iArr3[iNextInt] = i12 + i10;
            i12 = i13;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i11];
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < iArr.length + i11; i16++) {
            if (i14 >= i11 || i15 != iArr2[i14]) {
                int i17 = i15 + 1;
                int i18 = iArr[i15];
                iArr4[i16] = i18;
                if (i18 >= i10) {
                    iArr4[i16] = i18 + i11;
                }
                i15 = i17;
            } else {
                iArr4[i16] = iArr3[i14];
                i14++;
            }
        }
        return new e1(iArr4, new Random(random.nextLong()));
    }

    @Override // bf.f1
    public f1 cloneAndRemove(int i10, int i11) {
        int i12 = i11 - i10;
        int[] iArr = this.f9227b;
        int[] iArr2 = new int[iArr.length - i12];
        int i13 = 0;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            if (i15 < i10 || i15 >= i11) {
                int i16 = i14 - i13;
                if (i15 >= i10) {
                    i15 -= i12;
                }
                iArr2[i16] = i15;
            } else {
                i13++;
            }
        }
        return new e1(iArr2, new Random(this.f9226a.nextLong()));
    }

    @Override // bf.f1
    public int getFirstIndex() {
        int[] iArr = this.f9227b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    @Override // bf.f1
    public int getLastIndex() {
        int[] iArr = this.f9227b;
        if (iArr.length > 0) {
            return iArr[iArr.length - 1];
        }
        return -1;
    }

    @Override // bf.f1
    public int getLength() {
        return this.f9227b.length;
    }

    @Override // bf.f1
    public int getNextIndex(int i10) {
        int i11 = this.f9228c[i10] + 1;
        int[] iArr = this.f9227b;
        if (i11 < iArr.length) {
            return iArr[i11];
        }
        return -1;
    }

    @Override // bf.f1
    public int getPreviousIndex(int i10) {
        int i11 = this.f9228c[i10] - 1;
        if (i11 >= 0) {
            return this.f9227b[i11];
        }
        return -1;
    }

    public e1(int i10, long j10) {
        this(i10, new Random(j10));
    }

    public e1(int[] iArr, long j10) {
        this(Arrays.copyOf(iArr, iArr.length), new Random(j10));
    }

    public e1(int[] iArr, Random random) {
        this.f9227b = iArr;
        this.f9226a = random;
        this.f9228c = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f9228c[iArr[i10]] = i10;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e1(int i10, Random random) {
        int[] iArr = new int[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = i11 + 1;
            int iNextInt = random.nextInt(i12);
            iArr[i11] = iArr[iNextInt];
            iArr[iNextInt] = i11;
            i11 = i12;
        }
        this(iArr, random);
    }
}
