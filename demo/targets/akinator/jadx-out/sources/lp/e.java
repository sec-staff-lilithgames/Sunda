package lp;

import android.graphics.Color;
import android.text.TextUtils;
import e3.g;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.b0;
import rh.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f73589a;

    /* renamed from: b, reason: collision with root package name */
    public final int f73590b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f73591c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f73592d;

    /* renamed from: e, reason: collision with root package name */
    public final float f73593e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f73594f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f73595g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f73596h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f73597i;

    /* renamed from: j, reason: collision with root package name */
    public final int f73598j;

    public e(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f73589a = str;
        this.f73590b = i10;
        this.f73591c = num;
        this.f73592d = num2;
        this.f73593e = f10;
        this.f73594f = z10;
        this.f73595g = z11;
        this.f73596h = z12;
        this.f73597i = z13;
        this.f73598j = i11;
    }

    public static int a(String str) throws NumberFormatException {
        boolean z10;
        try {
            int i10 = Integer.parseInt(str.trim());
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z10 = true;
                    break;
                default:
                    z10 = false;
                    break;
            }
            if (z10) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        g.A("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) throws NumberFormatException {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            b0.w("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    public static e fromStyleLine(String str, c cVar) throws NumberFormatException {
        e eVar;
        int i10;
        io.bidmachine.media3.common.util.a.checkArgument(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i11 = cVar.f73582k;
        if (length != i11) {
            b0.w("SsaStyle", a1.formatInvariant("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i11), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[cVar.f73572a].trim();
            int i12 = cVar.f73573b;
            int i13 = -1;
            int iA = i12 != -1 ? a(strArrSplit[i12].trim()) : -1;
            int i14 = cVar.f73574c;
            Integer color = i14 != -1 ? parseColor(strArrSplit[i14].trim()) : null;
            int i15 = cVar.f73575d;
            Integer color2 = i15 != -1 ? parseColor(strArrSplit[i15].trim()) : null;
            int i16 = cVar.f73576e;
            float f10 = -3.4028235E38f;
            if (i16 != -1) {
                String strTrim2 = strArrSplit[i16].trim();
                try {
                    f10 = Float.parseFloat(strTrim2);
                    eVar = null;
                } catch (NumberFormatException e10) {
                    eVar = null;
                    try {
                        b0.w("SsaStyle", "Failed to parse font size: '" + strTrim2 + "'", e10);
                    } catch (RuntimeException e11) {
                        e = e11;
                        b0.w("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e);
                        return eVar;
                    }
                }
            } else {
                eVar = null;
            }
            int i17 = cVar.f73577f;
            boolean z10 = i17 != -1 && b(strArrSplit[i17].trim());
            int i18 = cVar.f73578g;
            boolean z11 = i18 != -1 && b(strArrSplit[i18].trim());
            int i19 = cVar.f73579h;
            boolean z12 = i19 != -1 && b(strArrSplit[i19].trim());
            int i20 = cVar.f73580i;
            boolean z13 = i20 != -1 && b(strArrSplit[i20].trim());
            int i21 = cVar.f73581j;
            if (i21 != -1) {
                String strTrim3 = strArrSplit[i21].trim();
                try {
                    i10 = Integer.parseInt(strTrim3.trim());
                } catch (NumberFormatException unused) {
                }
                if (i10 == 1 || i10 == 3) {
                    i13 = i10;
                } else {
                    b0.w("SsaStyle", "Ignoring unknown BorderStyle: " + strTrim3);
                }
            }
            return new e(strTrim, iA, color, color2, f10, z10, z11, z12, z13, i13);
        } catch (RuntimeException e12) {
            e = e12;
            eVar = null;
        }
    }

    public static Integer parseColor(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            io.bidmachine.media3.common.util.a.checkArgument(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(w.checkedCast(((j10 >> 24) & 255) ^ 255), w.checkedCast(j10 & 255), w.checkedCast((j10 >> 8) & 255), w.checkedCast((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            b0.w("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }
}
