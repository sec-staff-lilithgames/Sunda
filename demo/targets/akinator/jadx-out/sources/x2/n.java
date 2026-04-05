package x2;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class n implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public boolean f91517b;

    /* renamed from: c, reason: collision with root package name */
    public String f91518c;

    /* renamed from: e, reason: collision with root package name */
    public int f91519e;

    /* renamed from: f, reason: collision with root package name */
    public int f91520f;

    /* renamed from: g, reason: collision with root package name */
    public int f91521g;

    /* renamed from: h, reason: collision with root package name */
    public float f91522h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f91523i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f91524j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f91525k;

    /* renamed from: l, reason: collision with root package name */
    public m f91526l;

    /* renamed from: m, reason: collision with root package name */
    public c[] f91527m;

    /* renamed from: n, reason: collision with root package name */
    public int f91528n;

    /* renamed from: o, reason: collision with root package name */
    public int f91529o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f91530p;

    /* renamed from: q, reason: collision with root package name */
    public int f91531q;

    /* renamed from: r, reason: collision with root package name */
    public float f91532r;

    public n(String str, m mVar) {
        this.f91519e = -1;
        this.f91520f = -1;
        this.f91521g = 0;
        this.f91523i = false;
        this.f91524j = new float[9];
        this.f91525k = new float[9];
        this.f91527m = new c[16];
        this.f91528n = 0;
        this.f91529o = 0;
        this.f91530p = false;
        this.f91531q = -1;
        this.f91532r = 0.0f;
        this.f91518c = str;
        this.f91526l = mVar;
    }

    public final void addToRow(c cVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f91528n;
            if (i10 >= i11) {
                c[] cVarArr = this.f91527m;
                if (i11 >= cVarArr.length) {
                    this.f91527m = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
                }
                c[] cVarArr2 = this.f91527m;
                int i12 = this.f91528n;
                cVarArr2[i12] = cVar;
                this.f91528n = i12 + 1;
                return;
            }
            if (this.f91527m[i10] == cVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    public String getName() {
        return this.f91518c;
    }

    public final void removeFromRow(c cVar) {
        int i10 = this.f91528n;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f91527m[i11] == cVar) {
                while (i11 < i10 - 1) {
                    c[] cVarArr = this.f91527m;
                    int i12 = i11 + 1;
                    cVarArr[i11] = cVarArr[i12];
                    i11 = i12;
                }
                this.f91528n--;
                return;
            }
            i11++;
        }
    }

    public void reset() {
        this.f91518c = null;
        this.f91526l = m.f91515f;
        this.f91521g = 0;
        this.f91519e = -1;
        this.f91520f = -1;
        this.f91522h = 0.0f;
        this.f91523i = false;
        this.f91530p = false;
        this.f91531q = -1;
        this.f91532r = 0.0f;
        int i10 = this.f91528n;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f91527m[i11] = null;
        }
        this.f91528n = 0;
        this.f91529o = 0;
        this.f91517b = false;
        Arrays.fill(this.f91525k, 0.0f);
    }

    public void setFinalValue(f fVar, float f10) {
        this.f91522h = f10;
        this.f91523i = true;
        this.f91530p = false;
        this.f91531q = -1;
        this.f91532r = 0.0f;
        int i10 = this.f91528n;
        this.f91520f = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f91527m[i11].updateFromFinalVariable(fVar, this, false);
        }
        this.f91528n = 0;
    }

    public void setName(String str) {
        this.f91518c = str;
    }

    public void setSynonym(f fVar, n nVar, float f10) {
        this.f91530p = true;
        this.f91531q = nVar.f91519e;
        this.f91532r = f10;
        int i10 = this.f91528n;
        this.f91520f = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f91527m[i11].updateFromSynonymVariable(fVar, this, false);
        }
        this.f91528n = 0;
        fVar.displayReadableRows();
    }

    public void setType(m mVar, String str) {
        this.f91526l = mVar;
    }

    public String toString() {
        if (this.f91518c != null) {
            return "" + this.f91518c;
        }
        return "" + this.f91519e;
    }

    public final void updateReferencesWithNewDefinition(f fVar, c cVar) {
        int i10 = this.f91528n;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f91527m[i11].updateFromRow(fVar, cVar, false);
        }
        this.f91528n = 0;
    }

    @Override // java.lang.Comparable
    public int compareTo(n nVar) {
        return this.f91519e - nVar.f91519e;
    }

    public n(m mVar, String str) {
        this.f91519e = -1;
        this.f91520f = -1;
        this.f91521g = 0;
        this.f91523i = false;
        this.f91524j = new float[9];
        this.f91525k = new float[9];
        this.f91527m = new c[16];
        this.f91528n = 0;
        this.f91529o = 0;
        this.f91530p = false;
        this.f91531q = -1;
        this.f91532r = 0.0f;
        this.f91526l = mVar;
    }
}
