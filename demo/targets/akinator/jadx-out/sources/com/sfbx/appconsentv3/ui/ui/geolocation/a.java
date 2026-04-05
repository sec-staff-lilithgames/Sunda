package com.sfbx.appconsentv3.ui.ui.geolocation;

import androidx.lifecycle.u1;
import com.sfbx.appconsentv3.ui.AppConsentActivity;
import com.sfbx.appconsentv3.ui.model.Response;
import com.sfbx.appconsentv3.ui.ui.introduction.IntroductionActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class a implements u1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50552b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppConsentActivity f50553c;

    public /* synthetic */ a(AppConsentActivity appConsentActivity, int i10) {
        this.f50552b = i10;
        this.f50553c = appConsentActivity;
    }

    @Override // androidx.lifecycle.u1
    public final void onChanged(Object obj) {
        switch (this.f50552b) {
            case 0:
                GeolocationActivity.mConsentableObserver$lambda$0((GeolocationActivity) this.f50553c, (Response) obj);
                break;
            default:
                IntroductionActivity.acceptRefuseAllObserver$lambda$0((IntroductionActivity) this.f50553c, (Response) obj);
                break;
        }
    }
}
