package y2;

import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f93947a;

    /* renamed from: b, reason: collision with root package name */
    public final a f93948b;

    /* renamed from: c, reason: collision with root package name */
    public int f93949c;

    /* renamed from: d, reason: collision with root package name */
    public float f93950d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f93951e;

    /* renamed from: f, reason: collision with root package name */
    public int f93952f;

    public b(String str, a aVar) {
        this.f93947a = str;
        this.f93948b = aVar;
    }

    public static int hsvToRgb(float f10, float f11, float f12) {
        float f13 = f10 * 6.0f;
        int i10 = (int) f13;
        float f14 = f13 - i10;
        float f15 = f12 * 255.0f;
        int iA = (int) o2.a(1.0f, f11, f15, 0.5f);
        int i11 = (int) (((1.0f - (f14 * f11)) * f15) + 0.5f);
        int i12 = (int) (((1.0f - ((1.0f - f14) * f11)) * f15) + 0.5f);
        int i13 = (int) (f15 + 0.5f);
        if (i10 == 0) {
            return ((i13 << 16) + (i12 << 8) + iA) | (-16777216);
        }
        if (i10 == 1) {
            return ((i11 << 16) + (i13 << 8) + iA) | (-16777216);
        }
        if (i10 == 2) {
            return ((iA << 16) + (i13 << 8) + i12) | (-16777216);
        }
        if (i10 == 3) {
            return ((iA << 16) + (i11 << 8) + i13) | (-16777216);
        }
        if (i10 == 4) {
            return ((i12 << 16) + (iA << 8) + i13) | (-16777216);
        }
        if (i10 != 5) {
            return 0;
        }
        return ((i13 << 16) + (iA << 8) + i11) | (-16777216);
    }

    public boolean diff(b bVar) {
        if (bVar != null) {
            a aVar = bVar.f93948b;
            a aVar2 = this.f93948b;
            if (aVar2 == aVar) {
                switch (aVar2.ordinal()) {
                    case 0:
                    case 7:
                        if (this.f93949c == bVar.f93949c) {
                            return true;
                        }
                        break;
                    case 1:
                        return this.f93950d == bVar.f93950d;
                    case 2:
                    case 3:
                        return this.f93952f == bVar.f93952f;
                    case 4:
                        return this.f93949c == bVar.f93949c;
                    case 5:
                        return this.f93951e == bVar.f93951e;
                    case 6:
                        return this.f93950d == bVar.f93950d;
                    default:
                        return false;
                }
            }
        }
        return false;
    }

    public a getType() {
        return this.f93948b;
    }

    public float getValueToInterpolate() {
        switch (this.f93948b.ordinal()) {
            case 0:
                return this.f93949c;
            case 1:
                return this.f93950d;
            case 2:
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
                throw new RuntimeException("Cannot interpolate String");
            case 5:
                return this.f93951e ? 1.0f : 0.0f;
            case 6:
                return this.f93950d;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        switch (this.f93948b.ordinal()) {
            case 0:
                fArr[0] = this.f93949c;
                return;
            case 1:
                fArr[0] = this.f93950d;
                return;
            case 2:
            case 3:
                int i10 = (this.f93952f >> 24) & 255;
                float fPow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i10 / 255.0f;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                fArr[0] = this.f93951e ? 1.0f : 0.0f;
                return;
            case 6:
                fArr[0] = this.f93950d;
                return;
            default:
                return;
        }
    }

    public boolean isContinuous() {
        int iOrdinal = this.f93948b.ordinal();
        return (iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 7) ? false : true;
    }

    public int numberOfInterpolatedValues() {
        int iOrdinal = this.f93948b.ordinal();
        return (iOrdinal == 2 || iOrdinal == 3) ? 4 : 1;
    }

    public void setColorValue(int i10) {
        this.f93952f = i10;
    }

    public void setFloatValue(float f10) {
        this.f93950d = f10;
    }

    public void setIntValue(int i10) {
        this.f93949c = i10;
    }

    public void setValue(float[] fArr) {
        switch (this.f93948b.ordinal()) {
            case 0:
            case 7:
                this.f93949c = (int) fArr[0];
                return;
            case 1:
                this.f93950d = fArr[0];
                return;
            case 2:
            case 3:
                int iHsvToRgb = hsvToRgb(fArr[0], fArr[1], fArr[2]);
                this.f93952f = iHsvToRgb;
                int i10 = (int) (fArr[3] * 255.0f);
                int i11 = (i10 & (~(i10 >> 31))) - 255;
                this.f93952f = (((i11 & (i11 >> 31)) + 255) << 24) | (iHsvToRgb & 16777215);
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                this.f93951e = ((double) fArr[0]) > 0.5d;
                return;
            case 6:
                this.f93950d = fArr[0];
                return;
            default:
                return;
        }
    }

    public b(String str, a aVar, Object obj, boolean z10) {
        this.f93947a = str;
        this.f93948b = aVar;
        setValue(obj);
    }

    public b(b bVar, Object obj) {
        this.f93947a = bVar.f93947a;
        this.f93948b = bVar.f93948b;
        setValue(obj);
    }

    public void setValue(Object obj) {
        switch (this.f93948b.ordinal()) {
            case 0:
            case 7:
                this.f93949c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f93950d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f93952f = ((Integer) obj).intValue();
                break;
            case 4:
                break;
            case 5:
                this.f93951e = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f93950d = ((Float) obj).floatValue();
                break;
        }
    }

    public void setStringValue(String str) {
    }
}
