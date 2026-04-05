package o3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.List;
import z.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final t f77439a;

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f77440b;

    /* renamed from: c, reason: collision with root package name */
    public static Paint f77441c;

    static {
        d6.a.beginSection("TypefaceCompat static init");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            f77439a = new o();
        } else if (i10 >= 29) {
            f77439a = new n();
        } else if (i10 >= 28) {
            f77439a = new m();
        } else if (i10 >= 26) {
            f77439a = new l();
        } else if (k.isUsable()) {
            f77439a = new k();
        } else {
            f77439a = new j();
        }
        f77440b = new b0(16);
        f77441c = null;
        d6.a.endSection();
    }

    public static String a(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static void clearCache() {
        f77440b.evictAll();
    }

    public static Typeface create(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface createFromFontInfo(Context context, CancellationSignal cancellationSignal, u3.o[] oVarArr, int i10) {
        d6.a.beginSection("TypefaceCompat.createFromFontInfo");
        try {
            return f77439a.createFromFontInfo(context, cancellationSignal, oVarArr, i10);
        } finally {
            d6.a.endSection();
        }
    }

    public static Typeface createFromFontInfoWithFallback(Context context, CancellationSignal cancellationSignal, List<u3.o[]> list, int i10) {
        d6.a.beginSection("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f77439a.createFromFontInfoWithFallback(context, cancellationSignal, list, i10);
        } finally {
            d6.a.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fb, code lost:
    
        r3 = r8.build();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface createFromResourcesFamilyXml(android.content.Context r15, n3.e r16, android.content.res.Resources r17, int r18, java.lang.String r19, int r20, int r21, n3.n r22, android.os.Handler r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.i.createFromResourcesFamilyXml(android.content.Context, n3.e, android.content.res.Resources, int, java.lang.String, int, int, n3.n, android.os.Handler, boolean):android.graphics.Typeface");
    }

    public static Typeface createFromResourcesFontFile(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface typefaceCreateFromResourcesFontFile = f77439a.createFromResourcesFontFile(context, resources, i10, str, i12);
        if (typefaceCreateFromResourcesFontFile != null) {
            f77440b.put(a(resources, i10, str, i11, i12), typefaceCreateFromResourcesFontFile);
        }
        return typefaceCreateFromResourcesFontFile;
    }

    public static Typeface findFromCache(Resources resources, int i10, String str, int i11, int i12) {
        return (Typeface) f77440b.get(a(resources, i10, str, i11, i12));
    }

    public static Typeface getSystemFontFamily(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font guessPrimaryFont(Typeface typeface) {
        if (f77441c == null) {
            f77441c = new Paint();
        }
        f77441c.setTextSize(10.0f);
        f77441c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f77441c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }

    @Deprecated
    public static Typeface findFromCache(Resources resources, int i10, int i11) {
        return findFromCache(resources, i10, null, 0, i11);
    }

    public static Typeface create(Context context, Typeface typeface, int i10, boolean z10) {
        if (context != null) {
            w3.i.checkArgumentInRange(i10, 1, 1000, "weight");
            if (typeface == null) {
                typeface = Typeface.DEFAULT;
            }
            return f77439a.b(context, typeface, i10, z10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @Deprecated
    public static Typeface createFromResourcesFontFile(Context context, Resources resources, int i10, String str, int i11) {
        return createFromResourcesFontFile(context, resources, i10, str, 0, i11);
    }

    @Deprecated
    public static Typeface createFromResourcesFamilyXml(Context context, n3.e eVar, Resources resources, int i10, int i11, n3.n nVar, Handler handler, boolean z10) {
        return createFromResourcesFamilyXml(context, eVar, resources, i10, null, 0, i11, nVar, handler, z10);
    }
}
