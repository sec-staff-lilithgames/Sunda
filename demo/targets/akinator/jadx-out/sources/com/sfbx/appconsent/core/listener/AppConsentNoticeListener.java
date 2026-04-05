package com.sfbx.appconsent.core.listener;

import com.sfbx.appconsent.core.AppConsentError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface AppConsentNoticeListener {
    void onConsentGiven();

    void onError(AppConsentError appConsentError);
}
