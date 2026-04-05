package go;

import j1.o2;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class e0 {

    /* renamed from: h, reason: collision with root package name */
    public static final af.i f58308h = new af.i(20);

    /* renamed from: i, reason: collision with root package name */
    public static final af.i f58309i = new af.i(21);

    /* renamed from: a, reason: collision with root package name */
    public final int f58310a;

    /* renamed from: e, reason: collision with root package name */
    public int f58314e;

    /* renamed from: f, reason: collision with root package name */
    public int f58315f;

    /* renamed from: g, reason: collision with root package name */
    public int f58316g;

    /* renamed from: c, reason: collision with root package name */
    public final d0[] f58312c = new d0[5];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f58311b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public int f58313d = -1;

    public e0(int i10) {
        this.f58310a = i10;
    }

    public void addSample(int i10, float f10) {
        d0 d0Var;
        int i11 = this.f58313d;
        ArrayList arrayList = this.f58311b;
        if (i11 != 1) {
            Collections.sort(arrayList, f58308h);
            this.f58313d = 1;
        }
        int i12 = this.f58316g;
        d0[] d0VarArr = this.f58312c;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f58316g = i13;
            d0Var = d0VarArr[i13];
        } else {
            d0Var = new d0();
        }
        int i14 = this.f58314e;
        this.f58314e = i14 + 1;
        d0Var.f58305a = i14;
        d0Var.f58306b = i10;
        d0Var.f58307c = f10;
        arrayList.add(d0Var);
        this.f58315f += i10;
        while (true) {
            int i15 = this.f58315f;
            int i16 = this.f58310a;
            if (i15 <= i16) {
                return;
            }
            int i17 = i15 - i16;
            d0 d0Var2 = (d0) arrayList.get(0);
            int i18 = d0Var2.f58306b;
            if (i18 <= i17) {
                this.f58315f -= i18;
                arrayList.remove(0);
                int i19 = this.f58316g;
                if (i19 < 5) {
                    this.f58316g = i19 + 1;
                    d0VarArr[i19] = d0Var2;
                }
            } else {
                d0Var2.f58306b = i18 - i17;
                this.f58315f -= i17;
            }
        }
    }

    public float getPercentile(float f10) {
        int i10 = this.f58313d;
        ArrayList arrayList = this.f58311b;
        if (i10 != 0) {
            Collections.sort(arrayList, f58309i);
            this.f58313d = 0;
        }
        float f11 = f10 * this.f58315f;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            d0 d0Var = (d0) arrayList.get(i12);
            i11 += d0Var.f58306b;
            if (i11 >= f11) {
                return d0Var.f58307c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((d0) o2.e(1, arrayList)).f58307c;
    }

    public void reset() {
        this.f58311b.clear();
        this.f58313d = -1;
        this.f58314e = 0;
        this.f58315f = 0;
    }
}
