package s4;

import android.util.SparseArray;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public int f85375a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f85376b;

    /* renamed from: c, reason: collision with root package name */
    public n0 f85377c;

    /* renamed from: d, reason: collision with root package name */
    public n0 f85378d;

    /* renamed from: e, reason: collision with root package name */
    public int f85379e;

    /* renamed from: f, reason: collision with root package name */
    public int f85380f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f85381g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f85382h;

    public d0(n0 n0Var, boolean z10, int[] iArr) {
        this.f85376b = n0Var;
        this.f85377c = n0Var;
        this.f85381g = z10;
        this.f85382h = iArr;
    }

    public final int a(int i10) {
        SparseArray sparseArray = this.f85377c.f85426a;
        n0 n0Var = sparseArray == null ? null : (n0) sparseArray.get(i10);
        int i11 = 1;
        int i12 = 2;
        if (this.f85375a == 2) {
            if (n0Var != null) {
                this.f85377c = n0Var;
                this.f85380f++;
            } else if (i10 == 65038) {
                b();
            } else if (i10 != 65039) {
                n0 n0Var2 = this.f85377c;
                if (n0Var2.f85427b != null) {
                    i12 = 3;
                    if (this.f85380f != 1) {
                        this.f85378d = n0Var2;
                        b();
                    } else if (c()) {
                        this.f85378d = this.f85377c;
                        b();
                    } else {
                        b();
                    }
                } else {
                    b();
                }
            }
            i11 = i12;
        } else if (n0Var == null) {
            b();
        } else {
            this.f85375a = 2;
            this.f85377c = n0Var;
            this.f85380f = 1;
            i11 = i12;
        }
        this.f85379e = i10;
        return i11;
    }

    public final void b() {
        this.f85375a = 1;
        this.f85377c = this.f85376b;
        this.f85380f = 0;
    }

    public final boolean c() {
        int[] iArr;
        if (this.f85377c.f85427b.isDefaultEmoji() || this.f85379e == 65039) {
            return true;
        }
        return this.f85381g && ((iArr = this.f85382h) == null || Arrays.binarySearch(iArr, this.f85377c.f85427b.getCodepointAt(0)) < 0);
    }
}
