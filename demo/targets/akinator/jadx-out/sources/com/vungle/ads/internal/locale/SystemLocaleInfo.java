package com.vungle.ads.internal.locale;

import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class SystemLocaleInfo implements LocaleInfo {
    @Override // com.vungle.ads.internal.locale.LocaleInfo
    public String getLanguage() {
        String language = Locale.getDefault().getLanguage();
        e0.checkNotNullExpressionValue(language, "getDefault().language");
        return language;
    }

    @Override // com.vungle.ads.internal.locale.LocaleInfo
    public String getTimeZoneId() {
        String id2 = TimeZone.getDefault().getID();
        e0.checkNotNullExpressionValue(id2, "getDefault().id");
        return id2;
    }
}
