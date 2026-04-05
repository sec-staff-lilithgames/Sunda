package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.NativeAdLayoutApi;

/* renamed from: com.facebook.ads.redexgen.X.fg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2080fg extends R8 implements NativeAdLayoutApi {
    public View A02;
    public NativeAdLayout A03;
    public int A01 = 0;
    public int A00 = 0;
    public boolean A05 = false;
    public boolean A04 = false;

    public final void A02() {
        XP.A0R(this.A03);
        this.A03.removeView(this.A02);
        this.A02 = null;
    }

    public final void A03(AbstractC1684Yd abstractC1684Yd) {
        this.A02 = abstractC1684Yd;
        abstractC1684Yd.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        XP.A0R(this.A03);
        this.A03.addView(this.A02);
    }

    public final boolean A04() {
        return this.A04;
    }

    public final boolean A05() {
        return this.A05;
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.NativeAdLayoutApi
    public final void initialize(NativeAdLayout nativeAdLayout) {
        this.A03 = nativeAdLayout;
    }

    @Override // com.facebook.ads.redexgen.core.R8, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.A00 > 0 && this.A03.getMeasuredWidth() > this.A00) {
            setMeasuredDimension(this.A00, this.A03.getMeasuredHeight());
        } else {
            if (this.A03.getMeasuredWidth() >= this.A01) {
                return;
            }
            setMeasuredDimension(this.A01, this.A03.getMeasuredHeight());
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdLayoutApi
    public final void setMaxWidth(int i10) {
        this.A00 = i10;
        this.A04 = true;
    }

    @Override // com.facebook.ads.internal.api.NativeAdLayoutApi
    public final void setMinWidth(int i10) {
        this.A01 = i10;
        this.A05 = true;
    }
}
