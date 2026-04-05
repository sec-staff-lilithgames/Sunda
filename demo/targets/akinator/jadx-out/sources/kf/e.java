package kf;

import android.graphics.Color;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.n1;
import e3.g;
import rh.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f70926a;

    /* renamed from: b, reason: collision with root package name */
    public final int f70927b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f70928c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f70929d;

    /* renamed from: e, reason: collision with root package name */
    public final float f70930e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f70931f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f70932g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f70933h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f70934i;

    /* renamed from: j, reason: collision with root package name */
    public final int f70935j;

    public e(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f70926a = str;
        this.f70927b = i10;
        this.f70928c = num;
        this.f70929d = num2;
        this.f70930e = f10;
        this.f70931f = z10;
        this.f70932g = z11;
        this.f70933h = z12;
        this.f70934i = z13;
        this.f70935j = i11;
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
        g.w("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) throws NumberFormatException {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            f0.w("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    public static e fromStyleLine(String str, c cVar) {
        e eVar;
        int i10;
        com.google.android.exoplayer2.util.a.checkArgument(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i11 = cVar.f70919k;
        if (length != i11) {
            f0.w("SsaStyle", n1.formatInvariant("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i11), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[cVar.f70909a].trim();
            int i12 = cVar.f70910b;
            int i13 = -1;
            int iA = i12 != -1 ? a(strArrSplit[i12].trim()) : -1;
            int i14 = cVar.f70911c;
            Integer color = i14 != -1 ? parseColor(strArrSplit[i14].trim()) : null;
            int i15 = cVar.f70912d;
            Integer color2 = i15 != -1 ? parseColor(strArrSplit[i15].trim()) : null;
            int i16 = cVar.f70913e;
            float f10 = -3.4028235E38f;
            if (i16 != -1) {
                String strTrim2 = strArrSplit[i16].trim();
                try {
                    f10 = Float.parseFloat(strTrim2);
                    eVar = null;
                } catch (NumberFormatException e10) {
                    eVar = null;
                    try {
                        f0.w("SsaStyle", "Failed to parse font size: '" + strTrim2 + "'", e10);
                    } catch (RuntimeException e11) {
                        e = e11;
                        f0.w("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e);
                        return eVar;
                    }
                }
            } else {
                eVar = null;
            }
            int i17 = cVar.f70914f;
            boolean z10 = i17 != -1 && b(strArrSplit[i17].trim());
            int i18 = cVar.f70915g;
            boolean z11 = i18 != -1 && b(strArrSplit[i18].trim());
            int i19 = cVar.f70916h;
            boolean z12 = i19 != -1 && b(strArrSplit[i19].trim());
            int i20 = cVar.f70917i;
            boolean z13 = i20 != -1 && b(strArrSplit[i20].trim());
            int i21 = cVar.f70918j;
            if (i21 != -1) {
                String strTrim3 = strArrSplit[i21].trim();
                try {
                    i10 = Integer.parseInt(strTrim3.trim());
                } catch (NumberFormatException unused) {
                }
                if (i10 == 1 || i10 == 3) {
                    i13 = i10;
                } else {
                    f0.w("SsaStyle", "Ignoring unknown BorderStyle: " + strTrim3);
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
            com.google.android.exoplayer2.util.a.checkArgument(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(w.checkedCast(((j10 >> 24) & 255) ^ 255), w.checkedCast(j10 & 255), w.checkedCast((j10 >> 8) & 255), w.checkedCast((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            f0.w("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }
}
