package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1820bR implements View.OnClickListener {
    public final /* synthetic */ C1291Is A00;

    public ViewOnClickListenerC1820bR(C1291Is c1291Is) {
        this.A00 = c1291Is;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        Uri uriA0M;
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0X != null && (uriA0M = ((C7P) this.A00.A0X).A0M()) != null) {
                if (!this.A00.A0D) {
                    this.A00.A0E = true;
                    this.A00.A0j(uriA0M.toString());
                    if (this.A00.A0c.A0E() != null) {
                        this.A00.A0c.A0E().ABr();
                    }
                    if (this.A00.A0Y.A0n() >= 0) {
                        this.A00.A0S.postDelayed(this.A00.A0d, this.A00.A0Y.A0n());
                    }
                }
                this.A00.A0n(this.A00.A0D ? false : true);
            }
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
