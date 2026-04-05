package com.mbridge.msdk.scheme.applet;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class AppletSchemeCallBack implements IAppletSchemeCallBack {
    private static final String TAG = "AppletSchemeCallBack";

    @Override // com.mbridge.msdk.scheme.applet.IAppletSchemeCallBack
    public void onAppletSchemeRequestFailed(int i10, String str, String str2) {
        try {
            onRequestFailed(i10, str, str2);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b(TAG, e10.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.IAppletSchemeCallBack
    public void onAppletSchemeRequestStart() {
        try {
            onRequestStart();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b(TAG, e10.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.IAppletSchemeCallBack
    public void onAppletSchemeRequestSuccess(String str) {
        try {
            onRequestSuccess(str);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b(TAG, e10.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.IAppletSchemeCallBack
    public void onNetworkError(int i10, String str, String str2) {
        try {
            onRequestFailed(i10, str, str2);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b(TAG, e10.getMessage());
            }
        }
    }

    public abstract void onRequestFailed(int i10, String str, String str2);

    public abstract void onRequestStart();

    public abstract void onRequestSuccess(String str);
}
