package eg;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final float f54364a;

    /* renamed from: b, reason: collision with root package name */
    public final int f54365b;

    /* renamed from: d, reason: collision with root package name */
    public j f54367d;

    /* renamed from: e, reason: collision with root package name */
    public j f54368e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f54366c = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public int f54369f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f54370g = -1;

    /* renamed from: h, reason: collision with root package name */
    public float f54371h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f54372i = -1;

    public i(float f10, int i10) {
        this.f54364a = f10;
        this.f54365b = i10;
    }

    public i addAnchorKeyline(float f10, float f11, float f12) {
        return addKeyline(f10, f11, f12, false, true);
    }

    public i addKeyline(float f10, float f11, float f12, boolean z10) {
        return addKeyline(f10, f11, f12, z10, false);
    }

    public i addKeylineRange(float f10, float f11, float f12, int i10) {
        return addKeylineRange(f10, f11, f12, i10, false);
    }

    public k build() {
        if (this.f54367d == null) {
            throw new IllegalStateException("There must be a keyline marked as focal.");
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f54366c;
            if (i10 >= arrayList2.size()) {
                return new k(arrayList, this.f54369f, this.f54370g, this.f54365b, this.f54364a);
            }
            j jVar = (j) arrayList2.get(i10);
            float f10 = this.f54367d.f54374b;
            float f11 = this.f54369f;
            float f12 = this.f54364a;
            arrayList.add(new j((f10 - (f11 * f12)) + (i10 * f12), jVar.f54374b, jVar.f54375c, jVar.f54376d, jVar.f54377e, jVar.f54378f, jVar.f54379g, jVar.f54380h));
            i10++;
        }
    }

    public i addKeyline(float f10, float f11, float f12) {
        return addKeyline(f10, f11, f12, false);
    }

    public i addKeylineRange(float f10, float f11, float f12, int i10, boolean z10) {
        if (i10 > 0 && f12 > 0.0f) {
            for (int i11 = 0; i11 < i10; i11++) {
                addKeyline((i11 * f12) + f10, f11, f12, z10);
            }
        }
        return this;
    }

    public i addKeyline(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14, float f15) {
        if (f12 <= 0.0f) {
            return this;
        }
        ArrayList arrayList = this.f54366c;
        if (z11) {
            if (!z10) {
                int i10 = this.f54372i;
                if (i10 != -1 && i10 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f54372i = arrayList.size();
            } else {
                throw new IllegalArgumentException("Anchor keylines cannot be focal.");
            }
        }
        j jVar = new j(Float.MIN_VALUE, f10, f11, f12, z11, f13, f14, f15);
        if (z10) {
            if (this.f54367d == null) {
                this.f54367d = jVar;
                this.f54369f = arrayList.size();
            }
            if (this.f54370g != -1 && arrayList.size() - this.f54370g > 1) {
                throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
            }
            if (f12 == this.f54367d.f54376d) {
                this.f54368e = jVar;
                this.f54370g = arrayList.size();
            } else {
                throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
            }
        } else {
            if (this.f54367d == null && f12 < this.f54371h) {
                throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
            }
            if (this.f54368e != null && f12 > this.f54371h) {
                throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
            }
        }
        this.f54371h = f12;
        arrayList.add(jVar);
        return this;
    }

    public i addKeyline(float f10, float f11, float f12, boolean z10, boolean z11, float f13) {
        return addKeyline(f10, f11, f12, z10, z11, f13, 0.0f, 0.0f);
    }

    public i addKeyline(float f10, float f11, float f12, boolean z10, boolean z11) {
        float fAbs;
        float f13 = f12 / 2.0f;
        float f14 = f10 - f13;
        float f15 = f13 + f10;
        int i10 = this.f54365b;
        if (f15 > i10) {
            fAbs = Math.abs(f15 - Math.max(f15 - f12, i10));
        } else {
            fAbs = 0.0f;
            if (f14 < 0.0f) {
                fAbs = Math.abs(f14 - Math.min(f14 + f12, 0.0f));
            }
        }
        return addKeyline(f10, f11, f12, z10, z11, fAbs);
    }
}
