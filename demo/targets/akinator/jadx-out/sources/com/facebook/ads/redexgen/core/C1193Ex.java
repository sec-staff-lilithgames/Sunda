package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ex, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1193Ex extends AbstractC2009eW {
    public final /* synthetic */ US A00;
    public final /* synthetic */ XH A01;
    public final /* synthetic */ C1904cn A02;
    public final /* synthetic */ C1191Ev A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C1193Ex(C1191Ev c1191Ev, String str, C1904cn c1904cn, US us, Map map, XH xh2) {
        this.A03 = c1191Ev;
        this.A04 = str;
        this.A02 = c1904cn;
        this.A00 = us;
        this.A05 = map;
        this.A01 = xh2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2009eW
    public final void A03() {
        if (!this.A03.A02.A0Z() && !TextUtils.isEmpty(this.A04) && !this.A03.A08.get(this.A02.A02())) {
            this.A00.AB5(this.A04, new C1722Zp(this.A05).A03(this.A03.A03).A02(this.A01).A05());
            N3.A07(this.A03.A00, this.A03.A09);
            this.A03.A08.put(this.A02.A02(), true);
        }
    }
}
