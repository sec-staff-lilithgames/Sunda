package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class We implements TV {
    public final /* synthetic */ String[] A00;

    public We(String[] strArr) {
        this.A00 = strArr;
    }

    @Override // com.facebook.ads.redexgen.core.TV
    public final boolean A32(String str) {
        for (String str2 : this.A00) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }
}
