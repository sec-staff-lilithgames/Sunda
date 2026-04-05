package com.sfbx.appconsentv3.ui.core;

import com.sfbx.appconsent.core.ui.AppConsentContract;
import com.sfbx.appconsentv3.ui.AppConsentTheme;
import com.sfbx.appconsentv3.ui.listener.OnPresentGeolocationNoticeListener;
import com.sfbx.appconsentv3.ui.listener.OnPresentNoticeListener;
import java.util.Map;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface FullAppConsentContract extends AppConsentContract {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static /* synthetic */ void firstLaunch$default(FullAppConsentContract fullAppConsentContract, String str, boolean z10, boolean z11, boolean z12, boolean z13, AppConsentTheme appConsentTheme, a aVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: firstLaunch");
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            if ((i10 & 8) != 0) {
                z12 = false;
            }
            if ((i10 & 16) != 0) {
                z13 = false;
            }
            if ((i10 & 32) != 0) {
                appConsentTheme = null;
            }
            fullAppConsentContract.firstLaunch(str, z10, z11, z12, z13, appConsentTheme, aVar);
        }
    }

    void firstLaunch(String str, boolean z10, boolean z11, boolean z12, boolean z13, AppConsentTheme appConsentTheme, a aVar);

    Map<String, String> getExternalIds();

    void presentGeolocationNotice(boolean z10);

    void presentNotice(boolean z10);

    void setExternalIds(Map<String, String> map);

    void setPresenterGeolocationNoticeListener(OnPresentGeolocationNoticeListener onPresentGeolocationNoticeListener);

    void setPresenterNoticeListener(OnPresentNoticeListener onPresentNoticeListener);
}
