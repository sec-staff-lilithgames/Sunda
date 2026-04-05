package com.sfbx.appconsent.core;

import com.sfbx.appconsent.core.model.api.XChangeUserData;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface AppConsentCoreXchange extends AppConsentCoreContract {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static /* synthetic */ void setXChangeUserData$default(AppConsentCoreXchange appConsentCoreXchange, XChangeUserData xChangeUserData, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setXChangeUserData");
            }
            if ((i10 & 1) != 0) {
                xChangeUserData = null;
            }
            appConsentCoreXchange.setXChangeUserData(xChangeUserData);
        }
    }

    void setXChangeUserData(XChangeUserData xChangeUserData);
}
