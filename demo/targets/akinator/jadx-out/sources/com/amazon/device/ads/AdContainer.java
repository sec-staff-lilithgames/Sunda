package com.amazon.device.ads;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class AdContainer extends LinearLayout {
    public View adView;
    public int orientation;

    public AdContainer(Context context) {
        super(context);
        setOrientation(1);
        this.orientation = AdRegistration.getContext().getResources().getConfiguration().orientation;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.orientation == AdRegistration.getContext().getResources().getConfiguration().orientation) {
            View view = this.adView;
            if (view instanceof DTBAdView) {
                ((DTBAdView) view).onAdRemoved();
            }
            this.adView = null;
        }
        this.adView = null;
    }

    public void setAdView(View view) {
        this.adView = view;
    }
}
