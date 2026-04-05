package a3;

import com.ironsource.C3191e4;
import java.io.PrintStream;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f4014a = new int[101];

    /* renamed from: b, reason: collision with root package name */
    public final y2.b[] f4015b = new y2.b[101];

    /* renamed from: c, reason: collision with root package name */
    public int f4016c;

    public o() {
        clear();
    }

    public void append(int i10, y2.b bVar) {
        y2.b[] bVarArr = this.f4015b;
        if (bVarArr[i10] != null) {
            remove(i10);
        }
        bVarArr[i10] = bVar;
        int i11 = this.f4016c;
        this.f4016c = i11 + 1;
        int[] iArr = this.f4014a;
        iArr[i11] = i10;
        Arrays.sort(iArr);
    }

    public void clear() {
        Arrays.fill(this.f4014a, 999);
        Arrays.fill(this.f4015b, (Object) null);
        this.f4016c = 0;
    }

    public void dump() {
        System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.f4014a, this.f4016c)));
        System.out.print("K: [");
        int i10 = 0;
        while (i10 < this.f4016c) {
            PrintStream printStream = System.out;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i10 == 0 ? "" : ", ");
            sb2.append(valueAt(i10));
            printStream.print(sb2.toString());
            i10++;
        }
        System.out.println(C3191e4.i.f36531e);
    }

    public int keyAt(int i10) {
        return this.f4014a[i10];
    }

    public void remove(int i10) {
        this.f4015b[i10] = null;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = this.f4016c;
            if (i11 >= i13) {
                this.f4016c = i13 - 1;
                return;
            }
            int[] iArr = this.f4014a;
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
        return this.f4016c;
    }

    public y2.b valueAt(int i10) {
        return this.f4015b[this.f4014a[i10]];
    }
}
