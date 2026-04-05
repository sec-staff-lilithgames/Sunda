package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.ff, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2079ff extends AbstractC1440Oo {
    public static String[] A02 = {"mOKLXDYLG6rjJ8Uhc3dA94WggTy9aTCY", "BGa58WlKg30brm3iaXDpmKRreNqQx6sP", "OEIW0kNKyti99uOllTeGQwyl2xTRs9Rh", "66ZfANP52P8mfwFN1T5txUDlKbhE7PV5", "bDC5rvyouDOgyvzMPOhXiUUV9GXsFm8X", "OYxAj3HMhtWdnmP8KTtjhXT1I6nqQa9s", "h9E4hr1XPZf2wtmTKQKy9uKgM46lwlc6", "41TCzlsMJFbrsVbgrjJGy8KkwVmNtDJ0"};
    public List<NativeAd> A00 = new ArrayList();
    public final /* synthetic */ RL A01;

    public C2079ff(RL rl2) {
        this.A01 = rl2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1440Oo
    public final int A01() {
        return this.A00.size();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1440Oo
    public final int A02(Object obj) {
        int index = this.A00.indexOf(obj);
        if (index >= 0) {
            return index;
        }
        return -2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1440Oo
    public final Object A04(ViewGroup viewGroup, int i10) {
        View adView;
        if (this.A01.A01 != null) {
            adView = this.A01.A01.createView(this.A00.get(i10), i10);
        } else {
            adView = this.A01.A02 != null ? NativeAdView.render(this.A01.A06, this.A00.get(i10), this.A01.A02, this.A01.A03) : NativeAdView.render(this.A01.A06, this.A00.get(i10), this.A01.A03);
        }
        viewGroup.addView(adView);
        return adView;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1440Oo
    public final void A07(ViewGroup viewGroup, int i10, Object obj) {
        if (i10 < this.A00.size()) {
            RL rl2 = this.A01;
            if (A02[4].charAt(30) == 'x') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "v77RhDbNLQhSOdbZwI5GIdcCxuAqz5PX";
            strArr[7] = "TxIZGVGrDJLkO7AUrnSGEi4CFfNom122";
            if (rl2.A01 != null) {
                this.A01.A01.destroyView(this.A00.get(i10), (View) obj);
            } else {
                this.A00.get(i10).unregisterView();
            }
        }
        viewGroup.removeView((View) obj);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1440Oo
    public final boolean A08(View view, Object obj) {
        return view == obj;
    }

    public final void A09() {
        this.A00.clear();
        int iMin = Math.min(this.A01.A00, this.A01.A04.getUniqueNativeAdCount());
        for (int i10 = 0; i10 < iMin; i10++) {
            NativeAd ad2 = this.A01.A04.nextNativeAd();
            C1480Qc.A0L(ad2.getInternalNativeAd()).A1d(true);
            this.A00.add(ad2);
        }
        A05();
    }
}
