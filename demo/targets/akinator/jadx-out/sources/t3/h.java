package t3;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h {
    public static p getLocales(Configuration configuration) {
        return p.wrap(configuration.getLocales());
    }

    public static void setLocales(Configuration configuration, p pVar) {
        configuration.setLocales((LocaleList) pVar.unwrap());
    }
}
