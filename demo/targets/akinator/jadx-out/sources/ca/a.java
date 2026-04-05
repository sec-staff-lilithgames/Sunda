package ca;

import lb.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a {
    public static String getAbtestIdSondageKey() {
        return "sondage_id_" + b1.sharedInstance().getApplicationLanguage();
    }

    public static String getAbtestUrlSondageKey() {
        return "sondage_url_" + b1.sharedInstance().getApplicationLanguage();
    }
}
