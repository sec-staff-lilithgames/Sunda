package com.sfbx.appconsent.core.model.api.proto;

import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.e0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class LocalizedUtils {
    public static final LocalizedUtils INSTANCE = new LocalizedUtils();

    private LocalizedUtils() {
    }

    public final String getNameByAppConsentThemeLocal$appconsent_core_prodXchangeRelease(String appconsentThemeLocal, I18NString names) {
        e0.checkNotNullParameter(appconsentThemeLocal, "appconsentThemeLocal");
        e0.checkNotNullParameter(names, "names");
        return getNameByAppConsentThemeLocal$appconsent_core_prodXchangeRelease(appconsentThemeLocal, names.getValues());
    }

    public final String getNameByAppConsentThemeLocal$appconsent_core_prodXchangeRelease(String appconsentThemeLocal, Map<String, String> names) {
        e0.checkNotNullParameter(appconsentThemeLocal, "appconsentThemeLocal");
        e0.checkNotNullParameter(names, "names");
        String language = Locale.getDefault().getLanguage();
        e0.checkNotNullExpressionValue(language, "getDefault().language");
        Locale locale = Locale.ROOT;
        String lowerCase = language.toLowerCase(locale);
        e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (names.keySet().isEmpty() || names.values().isEmpty()) {
            return "";
        }
        if (names.containsKey(appconsentThemeLocal)) {
            String str = names.get(appconsentThemeLocal);
            return str == null ? "" : str;
        }
        String language2 = Locale.ENGLISH.getLanguage();
        e0.checkNotNullExpressionValue(language2, "ENGLISH.language");
        String lowerCase2 = language2.toLowerCase(locale);
        e0.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (names.containsKey(lowerCase)) {
            String str2 = names.get(lowerCase);
            return str2 == null ? "" : str2;
        }
        if (names.containsKey(lowerCase2)) {
            String str3 = names.get(lowerCase2);
            return str3 == null ? "" : str3;
        }
        try {
            return (String) y0.first(names.values());
        } catch (Exception unused) {
            return "";
        }
    }
}
