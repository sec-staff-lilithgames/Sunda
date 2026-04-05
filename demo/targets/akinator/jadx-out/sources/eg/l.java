package eg;

import j1.o2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final k f54387a;

    /* renamed from: b, reason: collision with root package name */
    public final List f54388b;

    /* renamed from: c, reason: collision with root package name */
    public final List f54389c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f54390d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f54391e;

    /* renamed from: f, reason: collision with root package name */
    public final float f54392f;

    /* renamed from: g, reason: collision with root package name */
    public final float f54393g;

    public l(k kVar, ArrayList arrayList, ArrayList arrayList2) {
        this.f54387a = kVar;
        this.f54388b = Collections.unmodifiableList(arrayList);
        this.f54389c = Collections.unmodifiableList(arrayList2);
        float f10 = ((k) o2.e(1, arrayList)).b().f54373a - kVar.b().f54373a;
        this.f54392f = f10;
        float f11 = kVar.d().f54373a - ((k) o2.e(1, arrayList2)).d().f54373a;
        this.f54393g = f11;
        this.f54390d = c(f10, arrayList, true);
        this.f54391e = c(f11, arrayList2, false);
    }

    public static float[] c(float f10, ArrayList arrayList, boolean z10) {
        int size = arrayList.size();
        float[] fArr = new float[size];
        int i10 = 1;
        while (i10 < size) {
            int i11 = i10 - 1;
            k kVar = (k) arrayList.get(i11);
            k kVar2 = (k) arrayList.get(i10);
            fArr[i10] = i10 == size + (-1) ? 1.0f : fArr[i11] + ((z10 ? kVar2.b().f54373a - kVar.b().f54373a : kVar.d().f54373a - kVar2.d().f54373a) / f10);
            i10++;
        }
        return fArr;
    }

    public static k d(k kVar, int i10, int i11, float f10, int i12, int i13, int i14) {
        ArrayList arrayList = new ArrayList(kVar.f54383c);
        arrayList.add(i11, (j) arrayList.remove(i10));
        i iVar = new i(kVar.f54381a, i14);
        int i15 = 0;
        while (i15 < arrayList.size()) {
            j jVar = (j) arrayList.get(i15);
            float f11 = jVar.f54376d;
            iVar.addKeyline((f11 / 2.0f) + f10, jVar.f54375c, f11, i15 >= i12 && i15 <= i13, jVar.f54377e, jVar.f54378f);
            f10 += jVar.f54376d;
            i15++;
        }
        return iVar.build();
    }

    public static k e(k kVar, float f10, int i10, boolean z10, float f11) {
        int i11;
        int i12;
        boolean z11 = true;
        if (b3.h.c(1) != 0) {
            ArrayList arrayList = new ArrayList(kVar.f54383c);
            i iVar = new i(kVar.f54381a, i10);
            int size = z10 ? 0 : arrayList.size() - 1;
            int i13 = 0;
            while (i13 < arrayList.size()) {
                j jVar = (j) arrayList.get(i13);
                boolean z12 = jVar.f54377e;
                float f12 = jVar.f54374b;
                if (z12 && i13 == size) {
                    iVar.addKeyline(f12, jVar.f54375c, jVar.f54376d, false, true, jVar.f54378f);
                    i12 = i13;
                } else {
                    float f13 = z10 ? f12 + f10 : f12 - f10;
                    float f14 = z10 ? f10 : 0.0f;
                    float f15 = z10 ? 0.0f : f10;
                    boolean z13 = (i13 < kVar.f54384d || i13 > kVar.f54385e) ? false : z11;
                    float f16 = f13;
                    float f17 = jVar.f54375c;
                    float f18 = jVar.f54376d;
                    i12 = i13;
                    iVar.addKeyline(f16, f17, f18, z13, z12, Math.abs(z10 ? Math.max(0.0f, ((f18 / 2.0f) + f16) - i10) : Math.min(0.0f, f16 - (f18 / 2.0f))), f14, f15);
                }
                i13 = i12 + 1;
                z11 = true;
            }
            return iVar.build();
        }
        ArrayList arrayList2 = new ArrayList(kVar.f54383c);
        float f19 = kVar.f54381a;
        i iVar2 = new i(f19, i10);
        Iterator it = kVar.f54383c.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            if (((j) it.next()).f54377e) {
                i14++;
            }
        }
        float size2 = f10 / (r1.size() - i14);
        int i15 = 0;
        float f20 = z10 ? f10 : 0.0f;
        while (i15 < arrayList2.size()) {
            j jVar2 = (j) arrayList2.get(i15);
            if (jVar2.f54377e) {
                iVar2.addKeyline(jVar2.f54374b, jVar2.f54375c, jVar2.f54376d, false, true, jVar2.f54378f);
                i11 = i15;
            } else {
                boolean z14 = i15 >= kVar.f54384d && i15 <= kVar.f54385e;
                float f21 = jVar2.f54376d - size2;
                float childMaskPercentage = h.getChildMaskPercentage(f21, f19, f11);
                float f22 = (f21 / 2.0f) + f20;
                float fAbs = Math.abs(f22 - jVar2.f54374b);
                float f23 = jVar2.f54378f;
                i11 = i15;
                float f24 = z10 ? fAbs : 0.0f;
                if (z10) {
                    fAbs = 0.0f;
                }
                iVar2.addKeyline(f22, childMaskPercentage, f21, z14, false, f23, f24, fAbs);
                f20 += f21;
            }
            i15 = i11 + 1;
        }
        return iVar2.build();
    }

    public final k a() {
        return (k) p0.o2.g(1, this.f54389c);
    }

    public final k b() {
        return (k) p0.o2.g(1, this.f54388b);
    }

    public k getShiftedState(float f10, float f11, float f12) {
        float fLerp;
        List list;
        float[] fArr;
        float[] fArr2;
        float f13 = this.f54392f;
        float f14 = f11 + f13;
        float f15 = this.f54393g;
        float f16 = f12 - f15;
        float f17 = b().a().f54379g;
        float f18 = a().a().f54380h;
        if (f13 == f17) {
            f14 += f17;
        }
        if (f15 == f18) {
            f16 -= f18;
        }
        if (f10 < f14) {
            fLerp = vf.a.lerp(1.0f, 0.0f, f11, f14, f10);
            list = this.f54388b;
            fArr = this.f54390d;
        } else {
            if (f10 <= f16) {
                return this.f54387a;
            }
            fLerp = vf.a.lerp(0.0f, 1.0f, f16, f12, f10);
            list = this.f54389c;
            fArr = this.f54391e;
        }
        int size = list.size();
        float f19 = fArr[0];
        int i10 = 1;
        while (true) {
            if (i10 >= size) {
                fArr2 = new float[]{0.0f, 0.0f, 0.0f};
                break;
            }
            float f20 = fArr[i10];
            if (fLerp <= f20) {
                fArr2 = new float[]{vf.a.lerp(0.0f, 1.0f, f19, f20, fLerp), i10 - 1, i10};
                break;
            }
            i10++;
            f19 = f20;
        }
        k kVar = (k) list.get((int) fArr2[1]);
        k kVar2 = (k) list.get((int) fArr2[2]);
        float f21 = fArr2[0];
        float f22 = kVar.f54381a;
        List list2 = kVar.f54383c;
        if (f22 != kVar2.f54381a) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List list3 = kVar2.f54383c;
        if (list2.size() != list3.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list2.size(); i11++) {
            j jVar = (j) list2.get(i11);
            j jVar2 = (j) list3.get(i11);
            arrayList.add(new j(vf.a.lerp(jVar.f54373a, jVar2.f54373a, f21), vf.a.lerp(jVar.f54374b, jVar2.f54374b, f21), vf.a.lerp(jVar.f54375c, jVar2.f54375c, f21), vf.a.lerp(jVar.f54376d, jVar2.f54376d, f21), false, 0.0f, 0.0f, 0.0f));
        }
        return new k(arrayList, vf.a.lerp(kVar.f54384d, kVar2.f54384d, f21), vf.a.lerp(kVar.f54385e, kVar2.f54385e, f21), kVar.f54386f, kVar.f54381a);
    }
}
