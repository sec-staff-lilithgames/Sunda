package a3;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f3960a = new int[10];

    /* renamed from: b, reason: collision with root package name */
    public int[] f3961b = new int[10];

    /* renamed from: c, reason: collision with root package name */
    public int f3962c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int[] f3963d = new int[10];

    /* renamed from: e, reason: collision with root package name */
    public float[] f3964e = new float[10];

    /* renamed from: f, reason: collision with root package name */
    public int f3965f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int[] f3966g = new int[5];

    /* renamed from: h, reason: collision with root package name */
    public String[] f3967h = new String[5];

    /* renamed from: i, reason: collision with root package name */
    public int f3968i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int[] f3969j = new int[4];

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f3970k = new boolean[4];

    /* renamed from: l, reason: collision with root package name */
    public int f3971l = 0;

    public void add(int i10, int i11) {
        int i12 = this.f3962c;
        int[] iArr = this.f3960a;
        if (i12 >= iArr.length) {
            this.f3960a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f3961b;
            this.f3961b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f3960a;
        int i13 = this.f3962c;
        iArr3[i13] = i10;
        int[] iArr4 = this.f3961b;
        this.f3962c = i13 + 1;
        iArr4[i13] = i11;
    }

    public void addIfNotNull(int i10, String str) {
        if (str != null) {
            add(i10, str);
        }
    }

    public void applyDelta(i0 i0Var) {
        for (int i10 = 0; i10 < this.f3962c; i10++) {
            i0Var.setValue(this.f3960a[i10], this.f3961b[i10]);
        }
        for (int i11 = 0; i11 < this.f3965f; i11++) {
            i0Var.setValue(this.f3963d[i11], this.f3964e[i11]);
        }
        for (int i12 = 0; i12 < this.f3968i; i12++) {
            i0Var.setValue(this.f3966g[i12], this.f3967h[i12]);
        }
        for (int i13 = 0; i13 < this.f3971l; i13++) {
            i0Var.setValue(this.f3969j[i13], this.f3970k[i13]);
        }
    }

    public void clear() {
        this.f3971l = 0;
        this.f3968i = 0;
        this.f3965f = 0;
        this.f3962c = 0;
    }

    public int getInteger(int i10) {
        for (int i11 = 0; i11 < this.f3962c; i11++) {
            if (this.f3960a[i11] == i10) {
                return this.f3961b[i11];
            }
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TypedBundle{mCountInt=");
        sb2.append(this.f3962c);
        sb2.append(", mCountFloat=");
        sb2.append(this.f3965f);
        sb2.append(", mCountString=");
        sb2.append(this.f3968i);
        sb2.append(", mCountBoolean=");
        return e3.g.m(sb2, this.f3971l, AbstractJsonLexerKt.END_OBJ);
    }

    public void add(int i10, float f10) {
        int i11 = this.f3965f;
        int[] iArr = this.f3963d;
        if (i11 >= iArr.length) {
            this.f3963d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f3964e;
            this.f3964e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f3963d;
        int i12 = this.f3965f;
        iArr2[i12] = i10;
        float[] fArr2 = this.f3964e;
        this.f3965f = i12 + 1;
        fArr2[i12] = f10;
    }

    public void applyDelta(d0 d0Var) {
        for (int i10 = 0; i10 < this.f3962c; i10++) {
            d0Var.add(this.f3960a[i10], this.f3961b[i10]);
        }
        for (int i11 = 0; i11 < this.f3965f; i11++) {
            d0Var.add(this.f3963d[i11], this.f3964e[i11]);
        }
        for (int i12 = 0; i12 < this.f3968i; i12++) {
            d0Var.add(this.f3966g[i12], this.f3967h[i12]);
        }
        for (int i13 = 0; i13 < this.f3971l; i13++) {
            d0Var.add(this.f3969j[i13], this.f3970k[i13]);
        }
    }

    public void add(int i10, String str) {
        int i11 = this.f3968i;
        int[] iArr = this.f3966g;
        if (i11 >= iArr.length) {
            this.f3966g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f3967h;
            this.f3967h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f3966g;
        int i12 = this.f3968i;
        iArr2[i12] = i10;
        String[] strArr2 = this.f3967h;
        this.f3968i = i12 + 1;
        strArr2[i12] = str;
    }

    public void add(int i10, boolean z10) {
        int i11 = this.f3971l;
        int[] iArr = this.f3969j;
        if (i11 >= iArr.length) {
            this.f3969j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f3970k;
            this.f3970k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f3969j;
        int i12 = this.f3971l;
        iArr2[i12] = i10;
        boolean[] zArr2 = this.f3970k;
        this.f3971l = i12 + 1;
        zArr2[i12] = z10;
    }
}
