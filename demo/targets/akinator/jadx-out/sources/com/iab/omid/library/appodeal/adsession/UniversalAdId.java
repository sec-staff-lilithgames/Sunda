package com.iab.omid.library.appodeal.adsession;

import com.iab.omid.library.appodeal.utils.g;
import w0.i;

/* loaded from: classes7.dex */
public final class UniversalAdId {
    private final String idRegistry;
    private final String universalAdIdValue;

    private UniversalAdId(String str, String str2) {
        this.universalAdIdValue = str;
        this.idRegistry = str2;
    }

    public static UniversalAdId createUniversalAdId(String str, String str2) {
        g.a(str, "UniversalADID is null or empty");
        g.a(str2, "UniversalADID registry is null or empty");
        return new UniversalAdId(str, str2);
    }

    public String toString() {
        return i.d(this.universalAdIdValue, "; ", this.idRegistry);
    }
}
