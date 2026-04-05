package n2;

import java.util.Locale;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f75553a;

    public a(Locale javaLocale) {
        e0.checkNotNullParameter(javaLocale, "javaLocale");
        this.f75553a = javaLocale;
    }

    public final Locale getJavaLocale() {
        return this.f75553a;
    }

    @Override // n2.f
    public String getLanguage() {
        String language = this.f75553a.getLanguage();
        e0.checkNotNullExpressionValue(language, "javaLocale.language");
        return language;
    }

    @Override // n2.f
    public String getRegion() {
        String country = this.f75553a.getCountry();
        e0.checkNotNullExpressionValue(country, "javaLocale.country");
        return country;
    }

    @Override // n2.f
    public String getScript() {
        String script = this.f75553a.getScript();
        e0.checkNotNullExpressionValue(script, "javaLocale.script");
        return script;
    }

    @Override // n2.f
    public String toLanguageTag() {
        String languageTag = this.f75553a.toLanguageTag();
        e0.checkNotNullExpressionValue(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }
}
