package v3;

import android.icu.util.ULocale;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e {
    public static String maximizeAndGetScript(Locale locale) {
        return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
    }
}
