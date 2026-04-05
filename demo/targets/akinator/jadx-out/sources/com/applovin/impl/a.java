package com.applovin.impl;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final ProgressBar f13388a;

    public a(Context context, int i10, int i11) {
        RelativeLayout.LayoutParams layoutParams;
        super(context);
        setClickable(false);
        ProgressBar progressBar = new ProgressBar(context, null, i11);
        this.f13388a = progressBar;
        progressBar.setIndeterminate(true);
        progressBar.setClickable(false);
        if (i10 == -2 || i10 == -1) {
            layoutParams = new RelativeLayout.LayoutParams(i10, i10);
        } else {
            int iDpToPx = AppLovinSdkUtils.dpToPx(context, i10);
            layoutParams = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        }
        layoutParams.addRule(13);
        progressBar.setLayoutParams(layoutParams);
        addView(progressBar);
    }

    public void a() {
        setVisibility(0);
    }

    public void b() {
        setVisibility(8);
    }

    public void setColor(int i10) {
        this.f13388a.getIndeterminateDrawable().setColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }
}
