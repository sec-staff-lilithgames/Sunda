package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class r extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private ViewGroup f15165a;

    /* renamed from: b, reason: collision with root package name */
    private AppLovinSdkUtils.Size f15166b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f15167c;

    /* renamed from: d, reason: collision with root package name */
    private RelativeLayout f15168d;

    public r(ViewGroup viewGroup, AppLovinSdkUtils.Size size, Activity activity) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        this.f15165a = viewGroup;
        this.f15166b = size;
        this.f15167c = activity;
        requestWindowFeature(1);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f15168d.removeView(this.f15165a);
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15165a.setLayoutParams(b0.e2.e(AppLovinSdkUtils.dpToPx(this.f15167c, this.f15166b.getWidth()), AppLovinSdkUtils.dpToPx(this.f15167c, this.f15166b.getHeight()), 13));
        int iDpToPx = AppLovinSdkUtils.dpToPx(this.f15167c, 60);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        ImageButton imageButton = new ImageButton(this.f15167c);
        imageButton.setLayoutParams(layoutParams);
        imageButton.setImageDrawable(this.f15167c.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground(null);
        final int i10 = 0;
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.ha

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ r f14092c;

            {
                this.f14092c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f14092c.a(view);
                        break;
                    default:
                        this.f14092c.b(view);
                        break;
                }
            }
        });
        RelativeLayout relativeLayout = new RelativeLayout(this.f15167c);
        this.f15168d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f15168d.setBackgroundColor(Integer.MIN_VALUE);
        this.f15168d.addView(imageButton);
        this.f15168d.addView(this.f15165a);
        final int i11 = 1;
        this.f15168d.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.ha

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ r f14092c;

            {
                this.f14092c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f14092c.a(view);
                        break;
                    default:
                        this.f14092c.b(view);
                        break;
                }
            }
        });
        setContentView(this.f15168d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        dismiss();
    }
}
