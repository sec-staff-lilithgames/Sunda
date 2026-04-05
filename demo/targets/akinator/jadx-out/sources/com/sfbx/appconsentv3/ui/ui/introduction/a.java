package com.sfbx.appconsentv3.ui.ui.introduction;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50554b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IntroductionActivity f50555c;

    public /* synthetic */ a(IntroductionActivity introductionActivity, int i10) {
        this.f50554b = i10;
        this.f50555c = introductionActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f50554b) {
            case 0:
                IntroductionActivity.initSettingImageFromHorizontalConfiguration$lambda$34(this.f50555c, view);
                break;
            case 1:
                IntroductionActivity.initAcceptAllButton$lambda$42(this.f50555c, view);
                break;
            case 2:
                IntroductionActivity.initContinueWithoutAcceptingButton$lambda$21$lambda$20(this.f50555c, view);
                break;
            case 3:
                IntroductionActivity.initContinueWithoutAcceptingButton$lambda$23$lambda$22(this.f50555c, view);
                break;
            case 4:
                IntroductionActivity.initRefuseAllButton$lambda$41(this.f50555c, view);
                break;
            case 5:
                IntroductionActivity.initBannerExampleUsage$lambda$12$lambda$11(this.f50555c, view);
                break;
            case 6:
                IntroductionActivity.initBannerExampleUsage$lambda$14$lambda$13(this.f50555c, view);
                break;
            case 7:
                IntroductionActivity.initButtonsSettingsRight$lambda$45$lambda$44(this.f50555c, view);
                break;
            case 8:
                IntroductionActivity.setSettingButtonValues$lambda$27(this.f50555c, view);
                break;
            default:
                IntroductionActivity.initButtonsSettingBottom$lambda$40$lambda$39(this.f50555c, view);
                break;
        }
    }
}
