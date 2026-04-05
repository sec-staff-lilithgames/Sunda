package io.odeeo.internal.p0;

import j1.o2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class z {

    /* renamed from: h, reason: collision with root package name */
    public static final Comparator<b> f65773h = new af.i(1);

    /* renamed from: i, reason: collision with root package name */
    public static final Comparator<b> f65774i = new af.i(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f65775a;

    /* renamed from: e, reason: collision with root package name */
    public int f65779e;

    /* renamed from: f, reason: collision with root package name */
    public int f65780f;

    /* renamed from: g, reason: collision with root package name */
    public int f65781g;

    /* renamed from: c, reason: collision with root package name */
    public final b[] f65777c = new b[5];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f65776b = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public int f65778d = -1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f65782a;

        /* renamed from: b, reason: collision with root package name */
        public int f65783b;

        /* renamed from: c, reason: collision with root package name */
        public float f65784c;

        public b() {
        }
    }

    public z(int i10) {
        this.f65775a = i10;
    }

    public static /* synthetic */ int a(b bVar, b bVar2) {
        return bVar.f65782a - bVar2.f65782a;
    }

    public void addSample(int i10, float f10) {
        b bVar;
        a();
        int i11 = this.f65781g;
        if (i11 > 0) {
            b[] bVarArr = this.f65777c;
            int i12 = i11 - 1;
            this.f65781g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b();
        }
        int i13 = this.f65779e;
        this.f65779e = i13 + 1;
        bVar.f65782a = i13;
        bVar.f65783b = i10;
        bVar.f65784c = f10;
        this.f65776b.add(bVar);
        this.f65780f += i10;
        while (true) {
            int i14 = this.f65780f;
            int i15 = this.f65775a;
            if (i14 <= i15) {
                return;
            }
            int i16 = i14 - i15;
            b bVar2 = this.f65776b.get(0);
            int i17 = bVar2.f65783b;
            if (i17 <= i16) {
                this.f65780f -= i17;
                this.f65776b.remove(0);
                int i18 = this.f65781g;
                if (i18 < 5) {
                    b[] bVarArr2 = this.f65777c;
                    this.f65781g = i18 + 1;
                    bVarArr2[i18] = bVar2;
                }
            } else {
                bVar2.f65783b = i17 - i16;
                this.f65780f -= i16;
            }
        }
    }

    public float getPercentile(float f10) {
        b();
        float f11 = f10 * this.f65780f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f65776b.size(); i11++) {
            b bVar = this.f65776b.get(i11);
            i10 += bVar.f65783b;
            if (i10 >= f11) {
                return bVar.f65784c;
            }
        }
        if (this.f65776b.isEmpty()) {
            return Float.NaN;
        }
        return ((b) o2.e(1, this.f65776b)).f65784c;
    }

    public void reset() {
        this.f65776b.clear();
        this.f65778d = -1;
        this.f65779e = 0;
        this.f65780f = 0;
    }

    public final void a() {
        if (this.f65778d != 1) {
            Collections.sort(this.f65776b, f65773h);
            this.f65778d = 1;
        }
    }

    public final void b() {
        if (this.f65778d != 0) {
            Collections.sort(this.f65776b, f65774i);
            this.f65778d = 0;
        }
    }
}
