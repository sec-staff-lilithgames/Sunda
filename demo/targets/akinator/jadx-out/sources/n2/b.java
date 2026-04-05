package n2;

import android.os.LocaleList;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b implements g {
    @Override // n2.g
    public List<f> getCurrent() {
        LocaleList localeList = LocaleList.getDefault();
        e0.checkNotNullExpressionValue(localeList, "getDefault()");
        ArrayList arrayList = new ArrayList();
        int size = localeList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Locale locale = localeList.get(i10);
            e0.checkNotNullExpressionValue(locale, "localeList[i]");
            arrayList.add(new a(locale));
        }
        return arrayList;
    }

    @Override // n2.g
    public f parseLanguageTag(String languageTag) {
        e0.checkNotNullParameter(languageTag, "languageTag");
        Locale localeForLanguageTag = Locale.forLanguageTag(languageTag);
        e0.checkNotNullExpressionValue(localeForLanguageTag, "forLanguageTag(languageTag)");
        return new a(localeForLanguageTag);
    }
}
