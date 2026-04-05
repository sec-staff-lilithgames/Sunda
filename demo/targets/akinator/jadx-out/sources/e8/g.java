package e8;

import j1.o2;
import t3.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f53924a = new String[5];

    /* renamed from: b, reason: collision with root package name */
    public final long[] f53925b = new long[5];

    /* renamed from: c, reason: collision with root package name */
    public int f53926c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f53927d = 0;

    public void beginSection(String str) {
        int i10 = this.f53926c;
        if (i10 == 5) {
            this.f53927d++;
            return;
        }
        this.f53924a[i10] = str;
        this.f53925b[i10] = System.nanoTime();
        u.beginSection(str);
        this.f53926c++;
    }

    public float endSection(String str) {
        int i10 = this.f53927d;
        if (i10 > 0) {
            this.f53927d = i10 - 1;
            return 0.0f;
        }
        int i11 = this.f53926c - 1;
        this.f53926c = i11;
        if (i11 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        String[] strArr = this.f53924a;
        if (!str.equals(strArr[i11])) {
            throw new IllegalStateException(o2.o(e3.g.o("Unbalanced trace call ", str, ". Expected "), strArr[this.f53926c], "."));
        }
        u.endSection();
        return (System.nanoTime() - this.f53925b[this.f53926c]) / 1000000.0f;
    }
}
