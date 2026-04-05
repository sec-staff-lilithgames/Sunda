package z2;

import a3.h;
import a3.h0;
import a3.x;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class d extends a {

    /* renamed from: d, reason: collision with root package name */
    public int f97489d = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f97490e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f97491f = -1;

    /* renamed from: g, reason: collision with root package name */
    public float f97492g = Float.NaN;

    /* renamed from: h, reason: collision with root package name */
    public float f97493h = Float.NaN;

    /* renamed from: i, reason: collision with root package name */
    public float f97494i = Float.NaN;

    /* renamed from: j, reason: collision with root package name */
    public float f97495j = Float.NaN;

    /* renamed from: k, reason: collision with root package name */
    public float f97496k = Float.NaN;

    /* renamed from: l, reason: collision with root package name */
    public float f97497l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    public int f97498m = 0;

    /* renamed from: n, reason: collision with root package name */
    public float f97499n = Float.NaN;

    /* renamed from: o, reason: collision with root package name */
    public float f97500o = Float.NaN;

    public d() {
        this.f97455b = 2;
    }

    @Override // z2.a
    public a copy(a aVar) {
        super.copy(aVar);
        d dVar = (d) aVar;
        this.f97490e = dVar.f97490e;
        this.f97491f = dVar.f97491f;
        this.f97492g = dVar.f97492g;
        this.f97493h = Float.NaN;
        this.f97494i = dVar.f97494i;
        this.f97495j = dVar.f97495j;
        this.f97496k = dVar.f97496k;
        this.f97497l = dVar.f97497l;
        this.f97499n = dVar.f97499n;
        this.f97500o = dVar.f97500o;
        return this;
    }

    @Override // z2.a, a3.i0
    public int getId(String str) {
        return h0.getId(str);
    }

    public boolean intersects(int i10, int i11, h hVar, h hVar2, float f10, float f11) {
        float fCenterX = hVar.centerX();
        float fCenterY = hVar.centerY();
        float fCenterX2 = hVar2.centerX();
        float fCenterY2 = hVar2.centerY();
        int i12 = this.f97498m;
        if (i12 == 1) {
            float f12 = fCenterX2 - fCenterX;
            float f13 = fCenterY2 - fCenterY;
            float f14 = this.f97494i;
            float f15 = (f12 * f14) + fCenterX;
            float f16 = this.f97495j;
            this.f97499n = ((-f13) * f16) + f15;
            this.f97500o = (f12 * f16) + (f13 * f14) + fCenterY;
        } else if (i12 != 2) {
            float f17 = fCenterX2 - fCenterX;
            float f18 = fCenterY2 - fCenterY;
            float f19 = Float.isNaN(this.f97494i) ? 0.0f : this.f97494i;
            float f20 = Float.isNaN(this.f97497l) ? 0.0f : this.f97497l;
            float f21 = Float.isNaN(this.f97495j) ? 0.0f : this.f97495j;
            this.f97499n = (int) (((Float.isNaN(this.f97496k) ? 0.0f : this.f97496k) * f18) + (f19 * f17) + fCenterX);
            this.f97500o = (int) ((f18 * f21) + (f17 * f20) + fCenterY);
        } else {
            float f22 = this.f97494i;
            float f23 = 0;
            this.f97499n = (i10 * f22) + f23;
            this.f97500o = (i11 * f22) + f23;
        }
        return Math.abs(f10 - this.f97499n) < 20.0f && Math.abs(f11 - this.f97500o) < 20.0f;
    }

    public void positionAttributes(y2.h hVar, h hVar2, h hVar3, float f10, float f11, String[] strArr, float[] fArr) {
        int i10 = this.f97498m;
        if (i10 == 1) {
            float fCenterX = hVar2.centerX();
            float fCenterY = hVar2.centerY();
            float fCenterX2 = hVar3.centerX() - fCenterX;
            float fCenterY2 = hVar3.centerY() - fCenterY;
            float fHypot = (float) Math.hypot(fCenterX2, fCenterY2);
            if (fHypot < 1.0E-4d) {
                System.out.println("distance ~ 0");
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                return;
            }
            float f12 = fCenterX2 / fHypot;
            float f13 = fCenterY2 / fHypot;
            float f14 = f11 - fCenterY;
            float f15 = f10 - fCenterX;
            float f16 = ((f12 * f14) - (f15 * f13)) / fHypot;
            float f17 = ((f13 * f14) + (f12 * f15)) / fHypot;
            String str = strArr[0];
            if (str != null) {
                if ("percentX".equals(str)) {
                    fArr[0] = f17;
                    fArr[1] = f16;
                    return;
                }
                return;
            }
            strArr[0] = "percentX";
            strArr[1] = "percentY";
            fArr[0] = f17;
            fArr[1] = f16;
            return;
        }
        if (i10 != 2) {
            float fCenterX3 = hVar2.centerX();
            float fCenterY3 = hVar2.centerY();
            float fCenterX4 = hVar3.centerX() - fCenterX3;
            float fCenterY4 = hVar3.centerY() - fCenterY3;
            String str2 = strArr[0];
            if (str2 == null) {
                strArr[0] = "percentX";
                fArr[0] = (f10 - fCenterX3) / fCenterX4;
                strArr[1] = "percentY";
                fArr[1] = (f11 - fCenterY3) / fCenterY4;
                return;
            }
            if ("percentX".equals(str2)) {
                fArr[0] = (f10 - fCenterX3) / fCenterX4;
                fArr[1] = (f11 - fCenterY3) / fCenterY4;
                return;
            } else {
                fArr[1] = (f10 - fCenterX3) / fCenterX4;
                fArr[0] = (f11 - fCenterY3) / fCenterY4;
                return;
            }
        }
        hVar2.centerX();
        hVar2.centerY();
        hVar3.centerX();
        hVar3.centerY();
        y2.h parent = hVar.getParent();
        int width = parent.getWidth();
        int height = parent.getHeight();
        String str3 = strArr[0];
        if (str3 == null) {
            strArr[0] = "percentX";
            fArr[0] = f10 / width;
            strArr[1] = "percentY";
            fArr[1] = f11 / height;
            return;
        }
        if ("percentX".equals(str3)) {
            fArr[0] = f10 / width;
            fArr[1] = f11 / height;
        } else {
            fArr[1] = f10 / width;
            fArr[0] = f11 / height;
        }
    }

    @Override // z2.a, a3.i0
    public boolean setValue(int i10, int i11) {
        if (i10 == 100) {
            this.f97454a = i11;
            return true;
        }
        if (i10 == 508) {
            this.f97489d = i11;
            return true;
        }
        if (i10 != 510) {
            return super.setValue(i10, i11);
        }
        this.f97498m = i11;
        return true;
    }

    @Override // z2.a
    public a clone() {
        return new d().copy(this);
    }

    @Override // z2.a, a3.i0
    public boolean setValue(int i10, float f10) {
        switch (i10) {
            case 503:
                this.f97492g = f10;
                return true;
            case 504:
                this.f97493h = f10;
                return true;
            case 505:
                this.f97492g = f10;
                this.f97493h = f10;
                return true;
            case 506:
                this.f97494i = f10;
                return true;
            case 507:
                this.f97495j = f10;
                return true;
            default:
                return super.setValue(i10, f10);
        }
    }

    @Override // z2.a, a3.i0
    public boolean setValue(int i10, String str) {
        if (i10 != 501) {
            return super.setValue(i10, str);
        }
        this.f97490e = str.toString();
        return true;
    }

    @Override // z2.a
    public void addValues(HashMap<String, x> map) {
    }

    @Override // z2.a
    public void getAttributeNames(HashSet<String> hashSet) {
    }
}
