package com.applovin.impl.adview;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.o0;
import com.unity3d.ads.adplayer.AndroidWebViewClient;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class AppLovinWebViewBase extends WebView {
    public AppLovinWebViewBase(Context context) {
        super(context);
    }

    public void applySettings(com.applovin.impl.sdk.ad.b bVar) {
        Boolean boolM;
        loadUrl(AndroidWebViewClient.BLANK_PAGE);
        int iW0 = bVar.w0();
        if (iW0 >= 0) {
            setLayerType(iW0, null);
        }
        getSettings().setMediaPlaybackRequiresUserGesture(bVar.M());
        if (bVar.P0()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        m mVarX0 = bVar.x0();
        if (mVarX0 != null) {
            WebSettings settings = getSettings();
            WebSettings.PluginState pluginStateB = mVarX0.b();
            if (pluginStateB != null) {
                settings.setPluginState(pluginStateB);
            }
            Boolean boolE = mVarX0.e();
            if (boolE != null) {
                settings.setAllowFileAccess(boolE.booleanValue());
            }
            Boolean boolI = mVarX0.i();
            if (boolI != null) {
                settings.setLoadWithOverviewMode(boolI.booleanValue());
            }
            Boolean boolQ = mVarX0.q();
            if (boolQ != null) {
                settings.setUseWideViewPort(boolQ.booleanValue());
            }
            Boolean boolD = mVarX0.d();
            if (boolD != null) {
                settings.setAllowContentAccess(boolD.booleanValue());
            }
            Boolean boolP = mVarX0.p();
            if (boolP != null) {
                settings.setBuiltInZoomControls(boolP.booleanValue());
            }
            Boolean boolH = mVarX0.h();
            if (boolH != null) {
                settings.setDisplayZoomControls(boolH.booleanValue());
            }
            Boolean boolL = mVarX0.l();
            if (boolL != null) {
                settings.setSaveFormData(boolL.booleanValue());
            }
            Boolean boolC = mVarX0.c();
            if (boolC != null) {
                settings.setGeolocationEnabled(boolC.booleanValue());
            }
            Boolean boolJ = mVarX0.j();
            if (boolJ != null) {
                settings.setNeedInitialFocus(boolJ.booleanValue());
            }
            Boolean boolF = mVarX0.f();
            if (boolF != null) {
                settings.setAllowFileAccessFromFileURLs(boolF.booleanValue());
            }
            Boolean boolG = mVarX0.g();
            if (boolG != null) {
                settings.setAllowUniversalAccessFromFileURLs(boolG.booleanValue());
            }
            Boolean boolO = mVarX0.o();
            if (boolO != null) {
                settings.setLoadsImagesAutomatically(boolO.booleanValue());
            }
            Boolean boolN = mVarX0.n();
            if (boolN != null) {
                settings.setBlockNetworkImage(boolN.booleanValue());
            }
            if (o0.e()) {
                Integer numA = mVarX0.a();
                if (numA != null) {
                    settings.setMixedContentMode(numA.intValue());
                }
                if (o0.f()) {
                    Boolean boolK = mVarX0.k();
                    if (boolK != null) {
                        settings.setOffscreenPreRaster(boolK.booleanValue());
                    }
                    if (!o0.k() || (boolM = mVarX0.m()) == null) {
                        return;
                    }
                    settings.setAlgorithmicDarkeningAllowed(boolM.booleanValue());
                }
            }
        }
    }
}
