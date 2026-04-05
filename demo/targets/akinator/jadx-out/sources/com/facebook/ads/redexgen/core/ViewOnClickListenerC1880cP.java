package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.cP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1880cP implements View.OnClickListener {
    public static String[] A01 = {"oF0UQSO2UkB0Fs6pC959r9dzDMlb", "cSj6PPi", "9MOBOvfZoPMufYmvf8w", "3DUooxDMnkOJWQGgSnbPARGlSWVzZXnv", "xtRq8IID5uSiAOfe9JKkWOxw4I", "dgOA0KJAxphsFM42TDGlvfhDF1ut8VW0", "Hk9WFArlgjOkwb9sMy", "wD"};
    public final /* synthetic */ C4K A00;

    public ViewOnClickListenerC1880cP(C4K c4k) {
        this.A00 = c4k;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0O instanceof C7P) {
                if (!this.A00.A0B) {
                    this.A00.A0V.ABr();
                    this.A00.A0C = true;
                    this.A00.A0l(((C7P) this.A00.A0O).A0M().toString());
                    long jA0n = ((AbstractC1264Hr) this.A00).A06.A0n();
                    if (A01[1].length() != 7) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A01;
                    strArr[5] = "6Dfgyk2EWniD4mtjwsck8hBHMm74mFyH";
                    strArr[3] = "XIgrh0tmG1tVXTW5TWFgdcEwNBgdKHOC";
                    if (jA0n >= 0) {
                        this.A00.A0M.postDelayed(this.A00.A0h, ((AbstractC1264Hr) this.A00).A06.A0n());
                    }
                }
                this.A00.A0p(this.A00.A0B ? false : true);
            }
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
