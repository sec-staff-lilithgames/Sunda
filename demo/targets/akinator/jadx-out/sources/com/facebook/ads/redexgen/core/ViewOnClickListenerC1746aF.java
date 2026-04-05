package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.aF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1746aF implements View.OnClickListener {
    public final /* synthetic */ C1749aI A00;

    public ViewOnClickListenerC1746aF(C1749aI c1749aI) {
        this.A00 = c1749aI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A05.AE7();
            if (this.A00.A00 != null) {
                XP.A0J(this.A00.A00);
            }
            Iterator it = this.A00.A07.iterator();
            while (it.hasNext()) {
                XP.A0L((View) it.next(), 0);
            }
            XP.A0H(this.A00);
            if (this.A00.A06 == null) {
                return;
            }
            XP.A0L(this.A00.A06, 0);
            this.A00.A06.A0h(EnumC1953db.A02, 14);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
