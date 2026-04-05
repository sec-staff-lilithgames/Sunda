package qf;

import j1.o2;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class z0 {

    /* renamed from: h, reason: collision with root package name */
    public static final ni.a f83099h = new ni.a(15);

    /* renamed from: i, reason: collision with root package name */
    public static final ni.a f83100i = new ni.a(16);

    /* renamed from: a, reason: collision with root package name */
    public final int f83101a;

    /* renamed from: e, reason: collision with root package name */
    public int f83105e;

    /* renamed from: f, reason: collision with root package name */
    public int f83106f;

    /* renamed from: g, reason: collision with root package name */
    public int f83107g;

    /* renamed from: c, reason: collision with root package name */
    public final y0[] f83103c = new y0[5];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f83102b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public int f83104d = -1;

    public z0(int i10) {
        this.f83101a = i10;
    }

    public void addSample(int i10, float f10) {
        y0 y0Var;
        int i11 = this.f83104d;
        ArrayList arrayList = this.f83102b;
        if (i11 != 1) {
            Collections.sort(arrayList, f83099h);
            this.f83104d = 1;
        }
        int i12 = this.f83107g;
        y0[] y0VarArr = this.f83103c;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f83107g = i13;
            y0Var = y0VarArr[i13];
        } else {
            y0Var = new y0();
        }
        int i14 = this.f83105e;
        this.f83105e = i14 + 1;
        y0Var.f83072a = i14;
        y0Var.f83073b = i10;
        y0Var.f83074c = f10;
        arrayList.add(y0Var);
        this.f83106f += i10;
        while (true) {
            int i15 = this.f83106f;
            int i16 = this.f83101a;
            if (i15 <= i16) {
                return;
            }
            int i17 = i15 - i16;
            y0 y0Var2 = (y0) arrayList.get(0);
            int i18 = y0Var2.f83073b;
            if (i18 <= i17) {
                this.f83106f -= i18;
                arrayList.remove(0);
                int i19 = this.f83107g;
                if (i19 < 5) {
                    this.f83107g = i19 + 1;
                    y0VarArr[i19] = y0Var2;
                }
            } else {
                y0Var2.f83073b = i18 - i17;
                this.f83106f -= i17;
            }
        }
    }

    public float getPercentile(float f10) {
        int i10 = this.f83104d;
        ArrayList arrayList = this.f83102b;
        if (i10 != 0) {
            Collections.sort(arrayList, f83100i);
            this.f83104d = 0;
        }
        float f11 = f10 * this.f83106f;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            y0 y0Var = (y0) arrayList.get(i12);
            i11 += y0Var.f83073b;
            if (i11 >= f11) {
                return y0Var.f83074c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((y0) o2.e(1, arrayList)).f83074c;
    }

    public void reset() {
        this.f83102b.clear();
        this.f83104d = -1;
        this.f83105e = 0;
        this.f83106f = 0;
    }
}
