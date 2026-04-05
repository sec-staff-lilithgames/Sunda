package o3;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class n extends t {
    public static Font f(FontFamily fontFamily, int i10) {
        FontStyle fontStyle = new FontStyle((i10 & 1) != 0 ? IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED : 400, (i10 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int i11 = i(fontStyle, font.getStyle());
        for (int i12 = 1; i12 < fontFamily.getSize(); i12++) {
            Font font2 = fontFamily.getFont(i12);
            int i13 = i(fontStyle, font2.getStyle());
            if (i13 < i11) {
                font = font2;
                i11 = i13;
            }
        }
        return font;
    }

    public static int i(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // o3.t
    public final Typeface a(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // o3.t
    public final Typeface b(Context context, Typeface typeface, int i10, boolean z10) {
        return Typeface.create(typeface, i10, z10);
    }

    @Override // o3.t
    public Typeface createFromFontFamilyFilesResourceEntry(Context context, n3.f fVar, Resources resources, int i10) throws IOException {
        try {
            FontFamily.Builder builder = null;
            for (n3.g gVar : fVar.getEntries()) {
                try {
                    Font fontBuild = new Font.Builder(resources, gVar.getResourceId()).setWeight(gVar.getWeight()).setSlant(gVar.isItalic() ? 1 : 0).setTtcIndex(gVar.getTtcIndex()).setFontVariationSettings(gVar.getVariationSettings()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(f(fontFamilyBuild, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // o3.t
    public Typeface createFromFontInfo(Context context, CancellationSignal cancellationSignal, u3.o[] oVarArr, int i10) {
        try {
            FontFamily fontFamilyG = g(cancellationSignal, oVarArr, context.getContentResolver());
            if (fontFamilyG == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyG).setStyle(f(fontFamilyG, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // o3.t
    public Typeface createFromFontInfoWithFallback(Context context, CancellationSignal cancellationSignal, List<u3.o[]> list, int i10) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyG = g(cancellationSignal, list.get(0), contentResolver);
            if (fontFamilyG == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyG);
            for (int i11 = 1; i11 < list.size(); i11++) {
                FontFamily fontFamilyG2 = g(cancellationSignal, list.get(i11), contentResolver);
                if (fontFamilyG2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyG2);
                }
            }
            return customFallbackBuilder.setStyle(f(fontFamilyG, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // o3.t
    public Typeface createFromResourcesFontFile(Context context, Resources resources, int i10, String str, int i11) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // o3.t
    public final u3.o d(int i10, u3.o[] oVarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final FontFamily g(CancellationSignal cancellationSignal, u3.o[] oVarArr, ContentResolver contentResolver) throws IOException {
        Font fontBuild;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (u3.o oVar : oVarArr) {
            if (oVar.isSystemFont()) {
                fontBuild = h(oVar);
            } else {
                try {
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(oVar.getUri(), "r", cancellationSignal);
                } catch (IOException e10) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    fontBuild = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(oVar.getWeight()).setSlant(oVar.isItalic() ? 1 : 0).setTtcIndex(oVar.getTtcIndex());
                        if (!TextUtils.isEmpty(oVar.getVariationSettings())) {
                            ttcIndex.setFontVariationSettings(oVar.getVariationSettings());
                        }
                        fontBuild = ttcIndex.build();
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font h(u3.o oVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
