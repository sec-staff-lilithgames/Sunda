package o3;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class o extends n {
    @Override // o3.n
    public final Font h(u3.o oVar) {
        Font fontGuessPrimaryFont;
        String systemFont = oVar.getSystemFont();
        if (systemFont != null) {
            Typeface typefaceCreate = Typeface.create(systemFont, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                typefaceCreate = null;
            }
            if (typefaceCreate != null && (fontGuessPrimaryFont = i.guessPrimaryFont(typefaceCreate)) != null) {
                if (TextUtils.isEmpty(oVar.getVariationSettings())) {
                    return fontGuessPrimaryFont;
                }
                try {
                    return new Font.Builder(fontGuessPrimaryFont).setFontVariationSettings(oVar.getVariationSettings()).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
