package k3;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class y {
    public static t3.p getApplicationLocales(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return t3.p.forLanguageTags(n.readLocales(context));
        }
        Object systemService = context.getSystemService("locale");
        return systemService != null ? t3.p.wrap(androidx.browser.customtabs.a.m(systemService)) : t3.p.getEmptyLocaleList();
    }

    public static t3.p getSystemLocales(Context context) {
        t3.p emptyLocaleList = t3.p.getEmptyLocaleList();
        if (Build.VERSION.SDK_INT < 33) {
            return t3.p.forLanguageTags(Resources.getSystem().getConfiguration().getLocales().toLanguageTags());
        }
        Object systemService = context.getSystemService("locale");
        return systemService != null ? t3.p.wrap(androidx.browser.customtabs.a.n(systemService)) : emptyLocaleList;
    }
}
