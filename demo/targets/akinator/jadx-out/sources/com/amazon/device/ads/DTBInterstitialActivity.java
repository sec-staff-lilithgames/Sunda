package com.amazon.device.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.amazon.aps.ads.R;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.iab.omid.library.amazon.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.amazon.internal.gaM.LGqaBRIgfa;
import f0.tv.vYwYqhhvBxO;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DTBInterstitialActivity extends Activity implements DTBMRAIDCloseButtonListener {
    public static final String LOG_TAG = "DTBInterstitialActivity";
    public WeakReference<DTBAdView> adView;
    public int dtbAdInterstitialID;
    public DTBAdInterstitial interstitial;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.amazon.device.ads.DTBInterstitialActivity$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnTouchListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                return false;
            }
            DTBInterstitialActivity dTBInterstitialActivity = DTBInterstitialActivity.this;
            dTBInterstitialActivity.cleanAndFinishAdView(dTBInterstitialActivity.getAdView());
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$useCustomButtonUpdated$0() {
        findViewById(R.id.mraid_close_indicator).setVisibility(getUseCustomClose() ? 4 : 0);
    }

    public void cleanAndFinishAdView(DTBAdView dTBAdView) {
        if (isViewAndControllerNotNull(dTBAdView)) {
            dTBAdView.evaluateJavascript(DTBAdMRAIDController.MRAID_CLOSE, null);
            cleanup();
            finish();
        }
    }

    public void cleanup() {
        DTBAdInterstitial.removeFromCache(this.dtbAdInterstitialID);
        WeakReference<DTBAdView> weakReference = this.adView;
        if (weakReference != null) {
            weakReference.clear();
            this.adView = null;
        }
    }

    public DTBAdView getAdView() {
        WeakReference<DTBAdView> weakReference = this.adView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public boolean getUseCustomClose() {
        if (isViewAndControllerNotNull(getAdView())) {
            return getAdView().getController().useCustomClose;
        }
        String str = LOG_TAG;
        StringBuilder sb2 = new StringBuilder("Failed to get use custom close , due to ");
        sb2.append(this.interstitial);
        DtbLog.info(str, sb2.toString() == null ? "null DTBInterstitial instance" : "null AdView/Controller instance");
        return false;
    }

    public boolean isViewAndControllerNotNull(DTBAdView dTBAdView) {
        return (dTBAdView == null || dTBAdView.getController() == null) ? false : true;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        try {
            if (getUseCustomClose()) {
                return;
            }
            cleanAndFinishAdView(getAdView());
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute onBackPressed method", e10);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        LGqaBRIgfa.tKrGcnPiXNN.invoke(null, this, bundle);
    }

    @Override // android.app.Activity
    public void onDestroy() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        vYwYqhhvBxO.AfoLpJKECCIgfE.invoke(null, this);
    }

    @Override // com.amazon.device.ads.DTBMRAIDCloseButtonListener
    public void useCustomButtonUpdated() {
        new Handler(Looper.getMainLooper()).post(new l(this, 1));
        try {
            if (getUseCustomClose()) {
                return;
            }
            getAdView().getController().getDtbOmSdkSessionManager().addFriendlyObstruction(findViewById(R.id.mraid_close_indicator), FriendlyObstructionPurpose.CLOSE_AD);
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, " OMSDK : Unable to add close icon as friendly obstruction on geometry change", e10);
        }
    }
}
