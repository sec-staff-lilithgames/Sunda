package a3;

import com.ironsource.C3191e4;
import java.io.PrintStream;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f4017a = new int[101];

    /* renamed from: b, reason: collision with root package name */
    public final y2.c[] f4018b = new y2.c[101];

    /* renamed from: c, reason: collision with root package name */
    public int f4019c;

    public p() {
        clear();
    }

    public void append(int i10, y2.c cVar) {
        y2.c[] cVarArr = this.f4018b;
        if (cVarArr[i10] != null) {
            remove(i10);
        }
        cVarArr[i10] = cVar;
        int i11 = this.f4019c;
        this.f4019c = i11 + 1;
        int[] iArr = this.f4017a;
        iArr[i11] = i10;
        Arrays.sort(iArr);
    }

    public void clear() {
        Arrays.fill(this.f4017a, 999);
        Arrays.fill(this.f4018b, (Object) null);
        this.f4019c = 0;
    }

    public void dump() {
        System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.f4017a, this.f4019c)));
        System.out.print("K: [");
        int i10 = 0;
        while (i10 < this.f4019c) {
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
        return this.f4017a[i10];
    }

    public void remove(int i10) {
        this.f4018b[i10] = null;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = this.f4019c;
            if (i11 >= i13) {
                this.f4019c = i13 - 1;
                return;
            }
            int[] iArr = this.f4017a;
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
        return this.f4019c;
    }

    public y2.c valueAt(int i10) {
        return this.f4018b[this.f4017a[i10]];
    }
}
