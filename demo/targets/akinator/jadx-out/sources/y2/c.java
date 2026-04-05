package y2;

import j1.o2;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f93953a;

    /* renamed from: b, reason: collision with root package name */
    public final int f93954b;

    /* renamed from: c, reason: collision with root package name */
    public int f93955c;

    /* renamed from: d, reason: collision with root package name */
    public float f93956d;

    /* renamed from: e, reason: collision with root package name */
    public String f93957e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f93958f;

    public c(c cVar) {
        this.f93955c = Integer.MIN_VALUE;
        this.f93956d = Float.NaN;
        this.f93957e = null;
        this.f93953a = cVar.f93953a;
        this.f93954b = cVar.f93954b;
        this.f93955c = cVar.f93955c;
        this.f93956d = cVar.f93956d;
        this.f93957e = cVar.f93957e;
        this.f93958f = cVar.f93958f;
    }

    public static int a(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    public static String colorString(int i10) {
        return "#" + i.b(i10, new StringBuilder("00000000")).substring(r2.length() - 8);
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

    public static int rgbaTocColor(float f10, float f11, float f12, float f13) {
        int iA = a((int) (f10 * 255.0f));
        int iA2 = a((int) (f11 * 255.0f));
        return (iA << 16) | (a((int) (f13 * 255.0f)) << 24) | (iA2 << 8) | a((int) (f12 * 255.0f));
    }

    public void applyToWidget(h hVar) {
        String str = this.f93953a;
        int i10 = this.f93954b;
        switch (i10) {
            case 900:
            case EVENT_TYPE_EXTENDED_AD_UNIT_LOADED_VALUE:
            case EVENT_TYPE_EXTENDED_AD_UNIT_INVALIDATED_VALUE:
                hVar.setCustomAttribute(str, i10, this.f93955c);
                break;
            case EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE:
            case EVENT_TYPE_EXTENDED_AD_UNIT_EXPIRED_VALUE:
                hVar.setCustomAttribute(str, i10, this.f93956d);
                break;
            case EVENT_TYPE_EXTENDED_AD_UNIT_FINISHED_VALUE:
                hVar.setCustomAttribute(str, i10, this.f93957e);
                break;
            case EVENT_TYPE_EXTENDED_WATERFALL_FINISHED_VALUE:
                hVar.setCustomAttribute(str, i10, this.f93958f);
                break;
        }
    }

    public c copy() {
        return new c(this);
    }

    public boolean diff(c cVar) {
        if (cVar != null) {
            int i10 = cVar.f93954b;
            int i11 = this.f93954b;
            if (i11 == i10) {
                switch (i11) {
                    case 900:
                    case EVENT_TYPE_EXTENDED_AD_UNIT_INVALIDATED_VALUE:
                        if (this.f93955c == cVar.f93955c) {
                            return true;
                        }
                        break;
                    case EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE:
                        return this.f93956d == cVar.f93956d;
                    case EVENT_TYPE_EXTENDED_AD_UNIT_LOADED_VALUE:
                        return this.f93955c == cVar.f93955c;
                    case EVENT_TYPE_EXTENDED_AD_UNIT_FINISHED_VALUE:
                        return this.f93955c == cVar.f93955c;
                    case EVENT_TYPE_EXTENDED_WATERFALL_FINISHED_VALUE:
                        return this.f93958f == cVar.f93958f;
                    case EVENT_TYPE_EXTENDED_AD_UNIT_EXPIRED_VALUE:
                        return this.f93956d == cVar.f93956d;
                    default:
                        return false;
                }
            }
        }
        return false;
    }

    public boolean getBooleanValue() {
        return this.f93958f;
    }

    public int getColorValue() {
        return this.f93955c;
    }

    public float getFloatValue() {
        return this.f93956d;
    }

    public int getIntegerValue() {
        return this.f93955c;
    }

    public int getInterpolatedColor(float[] fArr) {
        return (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    public String getName() {
        return this.f93953a;
    }

    public String getStringValue() {
        return this.f93957e;
    }

    public int getType() {
        return this.f93954b;
    }

    public float getValueToInterpolate() {
        switch (this.f93954b) {
            case 900:
                return this.f93955c;
            case EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE:
                return this.f93956d;
            case EVENT_TYPE_EXTENDED_AD_UNIT_LOADED_VALUE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case EVENT_TYPE_EXTENDED_AD_UNIT_FINISHED_VALUE:
                throw new RuntimeException("Cannot interpolate String");
            case EVENT_TYPE_EXTENDED_WATERFALL_FINISHED_VALUE:
                return this.f93958f ? 1.0f : 0.0f;
            case EVENT_TYPE_EXTENDED_AD_UNIT_EXPIRED_VALUE:
                return this.f93956d;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        switch (this.f93954b) {
            case 900:
                fArr[0] = this.f93955c;
                return;
            case EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE:
                fArr[0] = this.f93956d;
                return;
            case EVENT_TYPE_EXTENDED_AD_UNIT_LOADED_VALUE:
                int i10 = (this.f93955c >> 24) & 255;
                float fPow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i10 / 255.0f;
                return;
            case EVENT_TYPE_EXTENDED_AD_UNIT_FINISHED_VALUE:
                throw new RuntimeException("Cannot interpolate String");
            case EVENT_TYPE_EXTENDED_WATERFALL_FINISHED_VALUE:
                fArr[0] = this.f93958f ? 1.0f : 0.0f;
                return;
            case EVENT_TYPE_EXTENDED_AD_UNIT_EXPIRED_VALUE:
                fArr[0] = this.f93956d;
                return;
            default:
                return;
        }
    }

    public boolean isContinuous() {
        int i10 = this.f93954b;
        return (i10 == 903 || i10 == 904 || i10 == 906) ? false : true;
    }

    public int numberOfInterpolatedValues() {
        return this.f93954b != 902 ? 1 : 4;
    }

    public void setBooleanValue(boolean z10) {
        this.f93958f = z10;
    }

    public void setFloatValue(float f10) {
        this.f93956d = f10;
    }

    public void setIntValue(int i10) {
        this.f93955c = i10;
    }

    public void setInterpolatedValue(h hVar, float[] fArr) {
        String str = this.f93953a;
        int i10 = this.f93954b;
        switch (i10) {
            case 900:
                hVar.setCustomAttribute(str, i10, (int) fArr[0]);
                return;
            case EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE:
            case EVENT_TYPE_EXTENDED_AD_UNIT_EXPIRED_VALUE:
                hVar.setCustomAttribute(str, i10, fArr[0]);
                return;
            case EVENT_TYPE_EXTENDED_AD_UNIT_LOADED_VALUE:
                hVar.setCustomAttribute(str, i10, (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)));
                return;
            case EVENT_TYPE_EXTENDED_AD_UNIT_FINISHED_VALUE:
            case EVENT_TYPE_EXTENDED_AD_UNIT_INVALIDATED_VALUE:
                throw new RuntimeException("unable to interpolate " + str);
            case EVENT_TYPE_EXTENDED_WATERFALL_FINISHED_VALUE:
                hVar.setCustomAttribute(str, i10, fArr[0] > 0.5f);
                return;
            default:
                return;
        }
    }

    public void setStringValue(String str) {
        this.f93957e = str;
    }

    public void setValue(float[] fArr) {
        switch (this.f93954b) {
            case 900:
            case EVENT_TYPE_EXTENDED_AD_UNIT_INVALIDATED_VALUE:
                this.f93955c = (int) fArr[0];
                return;
            case EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE:
            case EVENT_TYPE_EXTENDED_AD_UNIT_EXPIRED_VALUE:
                this.f93956d = fArr[0];
                return;
            case EVENT_TYPE_EXTENDED_AD_UNIT_LOADED_VALUE:
                this.f93955c = ((Math.round(fArr[3] * 255.0f) & 255) << 24) | ((Math.round(((float) Math.pow(fArr[0], 0.5d)) * 255.0f) & 255) << 16) | ((Math.round(((float) Math.pow(fArr[1], 0.5d)) * 255.0f) & 255) << 8) | (Math.round(((float) Math.pow(fArr[2], 0.5d)) * 255.0f) & 255);
                return;
            case EVENT_TYPE_EXTENDED_AD_UNIT_FINISHED_VALUE:
                throw new RuntimeException("Cannot interpolate String");
            case EVENT_TYPE_EXTENDED_WATERFALL_FINISHED_VALUE:
                this.f93958f = ((double) fArr[0]) > 0.5d;
                return;
            default:
                return;
        }
    }

    public String toString() {
        String strQ = p0.o2.q(new StringBuilder(), this.f93953a, AbstractJsonLexerKt.COLON);
        switch (this.f93954b) {
            case 900:
                StringBuilder sbU = p0.o2.u(strQ);
                sbU.append(this.f93955c);
                return sbU.toString();
            case EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE:
                StringBuilder sbU2 = p0.o2.u(strQ);
                sbU2.append(this.f93956d);
                return sbU2.toString();
            case EVENT_TYPE_EXTENDED_AD_UNIT_LOADED_VALUE:
                StringBuilder sbU3 = p0.o2.u(strQ);
                sbU3.append(colorString(this.f93955c));
                return sbU3.toString();
            case EVENT_TYPE_EXTENDED_AD_UNIT_FINISHED_VALUE:
                StringBuilder sbU4 = p0.o2.u(strQ);
                sbU4.append(this.f93957e);
                return sbU4.toString();
            case EVENT_TYPE_EXTENDED_WATERFALL_FINISHED_VALUE:
                StringBuilder sbU5 = p0.o2.u(strQ);
                sbU5.append(Boolean.valueOf(this.f93958f));
                return sbU5.toString();
            case EVENT_TYPE_EXTENDED_AD_UNIT_EXPIRED_VALUE:
                StringBuilder sbU6 = p0.o2.u(strQ);
                sbU6.append(this.f93956d);
                return sbU6.toString();
            default:
                return o2.l(strQ, "????");
        }
    }

    public c(String str, int i10, String str2) {
        this.f93955c = Integer.MIN_VALUE;
        this.f93956d = Float.NaN;
        this.f93953a = str;
        this.f93954b = i10;
        this.f93957e = str2;
    }

    public void setValue(Object obj) {
        switch (this.f93954b) {
            case 900:
            case EVENT_TYPE_EXTENDED_AD_UNIT_INVALIDATED_VALUE:
                this.f93955c = ((Integer) obj).intValue();
                break;
            case EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE:
                this.f93956d = ((Float) obj).floatValue();
                break;
            case EVENT_TYPE_EXTENDED_AD_UNIT_LOADED_VALUE:
                this.f93955c = ((Integer) obj).intValue();
                break;
            case EVENT_TYPE_EXTENDED_AD_UNIT_FINISHED_VALUE:
                this.f93957e = (String) obj;
                break;
            case EVENT_TYPE_EXTENDED_WATERFALL_FINISHED_VALUE:
                this.f93958f = ((Boolean) obj).booleanValue();
                break;
            case EVENT_TYPE_EXTENDED_AD_UNIT_EXPIRED_VALUE:
                this.f93956d = ((Float) obj).floatValue();
                break;
        }
    }

    public c(String str, int i10, int i11) {
        this.f93955c = Integer.MIN_VALUE;
        this.f93956d = Float.NaN;
        this.f93957e = null;
        this.f93953a = str;
        this.f93954b = i10;
        if (i10 == 901) {
            this.f93956d = i11;
        } else {
            this.f93955c = i11;
        }
    }

    public c(String str, int i10, float f10) {
        this.f93955c = Integer.MIN_VALUE;
        this.f93957e = null;
        this.f93953a = str;
        this.f93954b = i10;
        this.f93956d = f10;
    }

    public c(String str, int i10, boolean z10) {
        this.f93955c = Integer.MIN_VALUE;
        this.f93956d = Float.NaN;
        this.f93957e = null;
        this.f93953a = str;
        this.f93954b = i10;
        this.f93958f = z10;
    }

    public c(String str, int i10) {
        this.f93955c = Integer.MIN_VALUE;
        this.f93956d = Float.NaN;
        this.f93957e = null;
        this.f93953a = str;
        this.f93954b = i10;
    }

    public c(String str, int i10, Object obj) {
        this.f93955c = Integer.MIN_VALUE;
        this.f93956d = Float.NaN;
        this.f93957e = null;
        this.f93953a = str;
        this.f93954b = i10;
        setValue(obj);
    }

    public c(c cVar, Object obj) {
        this.f93955c = Integer.MIN_VALUE;
        this.f93956d = Float.NaN;
        this.f93957e = null;
        this.f93953a = cVar.f93953a;
        this.f93954b = cVar.f93954b;
        setValue(obj);
    }
}
