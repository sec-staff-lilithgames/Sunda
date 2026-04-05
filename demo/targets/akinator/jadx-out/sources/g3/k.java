package g3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class k extends l {

    /* renamed from: g, reason: collision with root package name */
    public String f57050g;

    /* renamed from: h, reason: collision with root package name */
    public int f57051h;

    /* renamed from: i, reason: collision with root package name */
    public int f57052i;

    /* renamed from: j, reason: collision with root package name */
    public float f57053j;

    /* renamed from: k, reason: collision with root package name */
    public float f57054k;

    /* renamed from: l, reason: collision with root package name */
    public float f57055l;

    /* renamed from: m, reason: collision with root package name */
    public float f57056m;

    /* renamed from: n, reason: collision with root package name */
    public float f57057n;

    /* renamed from: o, reason: collision with root package name */
    public float f57058o;

    /* renamed from: p, reason: collision with root package name */
    public int f57059p;

    /* renamed from: q, reason: collision with root package name */
    public float f57060q;

    /* renamed from: r, reason: collision with root package name */
    public float f57061r;

    public k() {
        this.f57063f = -1;
        this.f57050g = null;
        this.f57051h = -1;
        this.f57052i = 0;
        this.f57053j = Float.NaN;
        this.f57054k = Float.NaN;
        this.f57055l = Float.NaN;
        this.f57056m = Float.NaN;
        this.f57057n = Float.NaN;
        this.f57058o = Float.NaN;
        this.f57059p = 0;
        this.f57060q = Float.NaN;
        this.f57061r = Float.NaN;
        this.f56928d = 2;
    }

    @Override // g3.d
    public d copy(d dVar) {
        super.copy(dVar);
        k kVar = (k) dVar;
        this.f57050g = kVar.f57050g;
        this.f57051h = kVar.f57051h;
        this.f57052i = kVar.f57052i;
        this.f57053j = kVar.f57053j;
        this.f57054k = Float.NaN;
        this.f57055l = kVar.f57055l;
        this.f57056m = kVar.f57056m;
        this.f57057n = kVar.f57057n;
        this.f57058o = kVar.f57058o;
        this.f57060q = kVar.f57060q;
        this.f57061r = kVar.f57061r;
        return this;
    }

    @Override // g3.l
    public boolean intersects(int i10, int i11, RectF rectF, RectF rectF2, float f10, float f11) {
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        float fCenterX2 = rectF2.centerX();
        float fCenterY2 = rectF2.centerY();
        int i12 = this.f57059p;
        if (i12 == 1) {
            float f12 = fCenterX2 - fCenterX;
            float f13 = fCenterY2 - fCenterY;
            float f14 = this.f57055l;
            float f15 = (f12 * f14) + fCenterX;
            float f16 = this.f57056m;
            this.f57060q = ((-f13) * f16) + f15;
            this.f57061r = (f12 * f16) + (f13 * f14) + fCenterY;
        } else if (i12 != 2) {
            float f17 = fCenterX2 - fCenterX;
            float f18 = fCenterY2 - fCenterY;
            float f19 = Float.isNaN(this.f57055l) ? 0.0f : this.f57055l;
            float f20 = Float.isNaN(this.f57058o) ? 0.0f : this.f57058o;
            float f21 = Float.isNaN(this.f57056m) ? 0.0f : this.f57056m;
            this.f57060q = (int) (((Float.isNaN(this.f57057n) ? 0.0f : this.f57057n) * f18) + (f19 * f17) + fCenterX);
            this.f57061r = (int) ((f18 * f21) + (f17 * f20) + fCenterY);
        } else {
            float f22 = this.f57055l;
            float f23 = 0;
            this.f57060q = (i10 * f22) + f23;
            this.f57061r = (i11 * f22) + f23;
        }
        return Math.abs(f10 - this.f57060q) < 20.0f && Math.abs(f11 - this.f57061r) < 20.0f;
    }

    @Override // g3.d
    public void load(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.r.f5550i);
        SparseIntArray sparseIntArray = j.f57030a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            SparseIntArray sparseIntArray2 = j.f57030a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    if (i0.f56980z0) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f56926b);
                        this.f56926b = resourceId;
                        if (resourceId == -1) {
                            this.f56927c = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f56927c = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.f56926b = typedArrayObtainStyledAttributes.getResourceId(index, this.f56926b);
                        break;
                    }
                case 2:
                    this.f56925a = typedArrayObtainStyledAttributes.getInt(index, this.f56925a);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f57050g = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.f57050g = a3.g.f3977c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    this.f57063f = typedArrayObtainStyledAttributes.getInteger(index, this.f57063f);
                    break;
                case 5:
                    this.f57052i = typedArrayObtainStyledAttributes.getInt(index, this.f57052i);
                    break;
                case 6:
                    this.f57055l = typedArrayObtainStyledAttributes.getFloat(index, this.f57055l);
                    break;
                case 7:
                    this.f57056m = typedArrayObtainStyledAttributes.getFloat(index, this.f57056m);
                    break;
                case 8:
                    float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f57054k);
                    this.f57053j = f10;
                    this.f57054k = f10;
                    break;
                case 9:
                    this.f57059p = typedArrayObtainStyledAttributes.getInt(index, this.f57059p);
                    break;
                case 10:
                    this.f57051h = typedArrayObtainStyledAttributes.getInt(index, this.f57051h);
                    break;
                case 11:
                    this.f57053j = typedArrayObtainStyledAttributes.getFloat(index, this.f57053j);
                    break;
                case 12:
                    this.f57054k = typedArrayObtainStyledAttributes.getFloat(index, this.f57054k);
                    break;
                default:
                    Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
        if (this.f56925a == -1) {
            Log.e("KeyPosition", "no frame position");
        }
    }

    @Override // g3.l
    public void positionAttributes(View view, RectF rectF, RectF rectF2, float f10, float f11, String[] strArr, float[] fArr) {
        int i10 = this.f57059p;
        if (i10 == 1) {
            float fCenterX = rectF.centerX();
            float fCenterY = rectF.centerY();
            float fCenterX2 = rectF2.centerX() - fCenterX;
            float fCenterY2 = rectF2.centerY() - fCenterY;
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
        if (i10 == 2) {
            rectF.centerX();
            rectF.centerY();
            rectF2.centerX();
            rectF2.centerY();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            int width = viewGroup.getWidth();
            int height = viewGroup.getHeight();
            String str2 = strArr[0];
            if (str2 == null) {
                strArr[0] = "percentX";
                fArr[0] = f10 / width;
                strArr[1] = "percentY";
                fArr[1] = f11 / height;
                return;
            }
            if ("percentX".equals(str2)) {
                fArr[0] = f10 / width;
                fArr[1] = f11 / height;
                return;
            } else {
                fArr[1] = f10 / width;
                fArr[0] = f11 / height;
                return;
            }
        }
        if (i10 != 3) {
            float fCenterX3 = rectF.centerX();
            float fCenterY3 = rectF.centerY();
            float fCenterX4 = rectF2.centerX() - fCenterX3;
            float fCenterY4 = rectF2.centerY() - fCenterY3;
            String str3 = strArr[0];
            if (str3 == null) {
                strArr[0] = "percentX";
                fArr[0] = (f10 - fCenterX3) / fCenterX4;
                strArr[1] = "percentY";
                fArr[1] = (f11 - fCenterY3) / fCenterY4;
                return;
            }
            if ("percentX".equals(str3)) {
                fArr[0] = (f10 - fCenterX3) / fCenterX4;
                fArr[1] = (f11 - fCenterY3) / fCenterY4;
                return;
            } else {
                fArr[1] = (f10 - fCenterX3) / fCenterX4;
                fArr[0] = (f11 - fCenterY3) / fCenterY4;
                return;
            }
        }
        float fCenterX5 = rectF.centerX();
        float fCenterY5 = rectF.centerY();
        float fCenterX6 = rectF2.centerX();
        float fCenterY6 = rectF2.centerY();
        if (fCenterX5 > fCenterX6) {
            fCenterX6 = fCenterX5;
            fCenterX5 = fCenterX6;
        }
        if (fCenterY5 <= fCenterY6) {
            fCenterY6 = fCenterY5;
            fCenterY5 = fCenterY6;
        }
        float f18 = fCenterX6 - fCenterX5;
        float f19 = fCenterY5 - fCenterY6;
        String str4 = strArr[0];
        if (str4 == null) {
            strArr[0] = "percentX";
            fArr[0] = (f10 - fCenterX5) / f18;
            strArr[1] = "percentY";
            fArr[1] = (f11 - fCenterY6) / f19;
            return;
        }
        if ("percentX".equals(str4)) {
            fArr[0] = (f10 - fCenterX5) / f18;
            fArr[1] = (f11 - fCenterY6) / f19;
        } else {
            fArr[1] = (f10 - fCenterX5) / f18;
            fArr[0] = (f11 - fCenterY6) / f19;
        }
    }

    public void setType(int i10) {
        this.f57059p = i10;
    }

    @Override // g3.d
    public void setValue(String str, Object obj) {
        str.getClass();
        switch (str) {
            case "transitionEasing":
                this.f57050g = obj.toString();
                break;
            case "percentWidth":
                this.f57053j = d.a(obj);
                break;
            case "percentHeight":
                this.f57054k = d.a(obj);
                break;
            case "drawPath":
                this.f57052i = d.b(obj);
                break;
            case "sizePercent":
                float fA = d.a(obj);
                this.f57053j = fA;
                this.f57054k = fA;
                break;
            case "percentX":
                this.f57055l = d.a(obj);
                break;
            case "percentY":
                this.f57056m = d.a(obj);
                break;
        }
    }

    @Override // g3.d
    /* renamed from: clone */
    public d mo4052clone() {
        return new k().copy(this);
    }

    @Override // g3.d
    public void addValues(HashMap<String, f3.q> map) {
    }
}
