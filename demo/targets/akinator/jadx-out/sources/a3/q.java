package a3;

import com.ironsource.C3191e4;
import java.io.PrintStream;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int[] f4020a;

    /* renamed from: b, reason: collision with root package name */
    public float[][] f4021b;

    /* renamed from: c, reason: collision with root package name */
    public int f4022c;

    public void append(int i10, float[] fArr) {
        float[][] fArr2 = this.f4021b;
        if (fArr2[i10] != null) {
            remove(i10);
        }
        fArr2[i10] = fArr;
        int[] iArr = this.f4020a;
        int i11 = this.f4022c;
        this.f4022c = i11 + 1;
        iArr[i11] = i10;
        Arrays.sort(iArr);
    }

    public void clear() {
        Arrays.fill(this.f4020a, 999);
        Arrays.fill(this.f4021b, (Object) null);
        this.f4022c = 0;
    }

    public void dump() {
        System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.f4020a, this.f4022c)));
        System.out.print("K: [");
        int i10 = 0;
        while (i10 < this.f4022c) {
            PrintStream printStream = System.out;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i10 == 0 ? "" : ", ");
            sb2.append(Arrays.toString(valueAt(i10)));
            printStream.print(sb2.toString());
            i10++;
        }
        System.out.println(C3191e4.i.f36531e);
    }

    public int keyAt(int i10) {
        return this.f4020a[i10];
    }

    public void remove(int i10) {
        this.f4021b[i10] = null;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = this.f4022c;
            if (i11 >= i13) {
                this.f4022c = i13 - 1;
                return;
            }
            int[] iArr = this.f4020a;
            if (i10 == iArr[i11]) {
                iArr[i11] = 999;
                i12++;
            }
            if (i11 != i12) {
                iArr[i11] = iArr[i12];
            }
            i12++;
            i11++;
        }
    }

    public int size() {
        return this.f4022c;
    }

    public float[] valueAt(int i10) {
        return this.f4021b[this.f4020a[i10]];
    }
}
