package androidx.appcompat.app;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i0 {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static t3.p b(Configuration configuration) {
        return t3.p.forLanguageTags(configuration.getLocales().toLanguageTags());
    }

    public static void c(Configuration configuration, t3.p pVar) {
        configuration.setLocales(LocaleList.forLanguageTags(pVar.toLanguageTags()));
    }

    public static void setDefaultLocales(t3.p pVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(pVar.toLanguageTags()));
    }
}
