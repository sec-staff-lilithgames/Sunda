package com.applovin.impl.privacy.cmp;

import com.applovin.impl.privacy.cmp.a;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements ConsentInformation.OnConsentInfoUpdateFailureListener, UserMessagingPlatform.OnConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f15083b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a.InterfaceC0037a f15084c;

    public /* synthetic */ b(a aVar, a.InterfaceC0037a interfaceC0037a) {
        this.f15083b = aVar;
        this.f15084c = interfaceC0037a;
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
    public void onConsentFormLoadFailure(FormError formError) {
        this.f15083b.a(this.f15084c, formError);
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
    public void onConsentFormLoadSuccess(ConsentForm consentForm) {
        this.f15083b.a(this.f15084c, consentForm);
    }

    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
    public void onConsentInfoUpdateFailure(FormError formError) {
        this.f15083b.b(this.f15084c, formError);
    }
}
