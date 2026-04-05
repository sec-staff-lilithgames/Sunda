package com.mbridge.msdk.click;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class h extends AppletSchemeCallBack {

    /* renamed from: a, reason: collision with root package name */
    private final NativeListener.NativeTrackingListener f39703a;

    /* renamed from: b, reason: collision with root package name */
    private final CampaignEx f39704b;

    /* renamed from: c, reason: collision with root package name */
    private final AppletsModel f39705c;

    /* renamed from: d, reason: collision with root package name */
    private final a f39706d;

    public h(NativeListener.NativeTrackingListener nativeTrackingListener, CampaignEx campaignEx, AppletsModel appletsModel, a aVar) {
        this.f39703a = nativeTrackingListener;
        this.f39704b = campaignEx;
        this.f39705c = appletsModel;
        this.f39706d = aVar;
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    public void onRequestFailed(int i10, String str, String str2) {
        CampaignEx campaignEx = this.f39704b;
        if (campaignEx == null || this.f39705c == null) {
            return;
        }
        try {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f39703a;
            if (nativeTrackingListener != null) {
                try {
                    nativeTrackingListener.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        p0.b("DefaultAppletSchemeCallBack", e10.getMessage());
                    }
                }
            }
            this.f39705c.setUserClick(false);
            this.f39705c.setRequestingFinish();
            this.f39704b.setClickURL(str2);
            a aVar = this.f39706d;
            if (aVar != null) {
                try {
                    aVar.a(this.f39704b);
                } catch (Exception e11) {
                    if (MBridgeConstans.DEBUG) {
                        p0.b("DefaultAppletSchemeCallBack", e11.getMessage());
                    }
                }
            }
        } catch (Exception e12) {
            if (MBridgeConstans.DEBUG) {
                p0.b("DefaultAppletSchemeCallBack", e12.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    public void onRequestSuccess(String str) {
        CampaignEx campaignEx = this.f39704b;
        if (campaignEx == null || this.f39705c == null) {
            return;
        }
        try {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f39703a;
            if (nativeTrackingListener != null) {
                try {
                    nativeTrackingListener.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        p0.b("DefaultAppletSchemeCallBack", e10.getMessage());
                    }
                }
            }
            this.f39705c.setUserClick(false);
            this.f39705c.setRequestingFinish();
            this.f39704b.setDeepLinkUrl(str);
            a aVar = this.f39706d;
            if (aVar != null) {
                try {
                    aVar.a(this.f39704b);
                } catch (Exception e11) {
                    if (MBridgeConstans.DEBUG) {
                        p0.b("DefaultAppletSchemeCallBack", e11.getMessage());
                    }
                }
            }
        } catch (Exception e12) {
            if (MBridgeConstans.DEBUG) {
                p0.b("DefaultAppletSchemeCallBack", e12.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    public void onRequestStart() {
    }
}
