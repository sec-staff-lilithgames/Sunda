package com.amazon.aps.ads.activity;

import a1.e;
import af.g;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.amazon.aps.ads.ApsAdView;
import com.amazon.aps.ads.ApsLog;
import com.amazon.aps.ads.R;
import com.amazon.aps.ads.util.ApsAdExtensionsKt;
import com.amazon.aps.ads.util.ApsMraidCloseButtonListener;
import com.amazon.aps.ads.util.ApsMraidHandler;
import com.amazon.aps.ads.util.adview.b;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.device.ads.DTBAdMRAIDController;
import com.amazon.device.ads.DTBAdUtil;
import com.amazon.device.ads.DtbOmSdkSessionManager;
import com.iab.omid.library.amazon.adsession.FriendlyObstructionPurpose;
import f0.tv.vYwYqhhvBxO;
import ha.WYS.xBfdMhmcFlTfnl;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.u;
import l.a;
import tu.o;
import tu.q;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class ApsInterstitialActivity extends Activity implements ApsMraidCloseButtonListener {
    public static final Companion Companion = new Companion(null);
    public static WeakReference<ApsAdView> adViewRefPassed;
    public final String TAG = "ApsInterstitialActivity";
    public WeakReference<ApsAdView> apsAdViewRef;
    public LinearLayout closeIndicatorRegion;
    public final LinearLayout.LayoutParams imageParams;
    public final o imageView$delegate;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final WeakReference<ApsAdView> getAdViewRefPassed() {
            return ApsInterstitialActivity.adViewRefPassed;
        }

        public final void setAdViewRefPassed(WeakReference<ApsAdView> weakReference) {
            ApsInterstitialActivity.adViewRefPassed = weakReference;
        }

        public Companion() {
        }
    }

    public ApsInterstitialActivity() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(DTBAdUtil.sizeToDevicePixels(24), DTBAdUtil.sizeToDevicePixels(24));
        layoutParams.setMargins(DTBAdUtil.sizeToDevicePixels(14), DTBAdUtil.sizeToDevicePixels(14), 0, 0);
        this.imageParams = layoutParams;
        this.imageView$delegate = q.lazy(new e(this, 24));
    }

    private final void attachWebView() {
        ApsLog.d(this.TAG, "Attaching the ApsAdView");
        WeakReference<ApsAdView> weakReference = this.apsAdViewRef;
        ApsAdView apsAdView = weakReference != null ? weakReference.get() : null;
        if (apsAdView != null) {
            apsAdView.setScrollEnabled(false);
            ViewParent parent = apsAdView.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(apsAdView);
            }
        }
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.inter_container);
        if (relativeLayout != null) {
            relativeLayout.addView(apsAdView, -1, -1);
        }
        prepareCloseButtonRegion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clean() {
        WeakReference<ApsAdView> weakReference = this.apsAdViewRef;
        if (weakReference != null) {
            weakReference.clear();
            this.apsAdViewRef = null;
        }
    }

    private final void cleanAndFinishAdView() {
        WeakReference<ApsAdView> weakReference = this.apsAdViewRef;
        ApsAdView apsAdView = weakReference != null ? weakReference.get() : null;
        if (apsAdView != null && apsAdView.getMraidHandler() != null) {
            apsAdView.evaluateJavascript(ApsMraidHandler.Companion.getMRAID_CLOSE(), null);
        }
        clean();
        finish();
    }

    private final ImageView getImageView() {
        return (ImageView) this.imageView$delegate.getValue();
    }

    private final boolean getUseCustomClose() {
        DTBAdMRAIDController mraidHandler;
        try {
            WeakReference<ApsAdView> weakReference = this.apsAdViewRef;
            ApsAdView apsAdView = weakReference != null ? weakReference.get() : null;
            if (apsAdView == null || (mraidHandler = apsAdView.getMraidHandler()) == null) {
                return false;
            }
            return mraidHandler.isUseCustomClose();
        } catch (Exception e10) {
            e10.printStackTrace();
            ApsAdExtensionsKt.e(this, "Error in using the flag isUseCustomClose:" + x0.f87415a);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleApsAdView(ApsAdView apsAdView) {
        if (apsAdView != null) {
            try {
                ApsLog.d(this.TAG, "Received the ApsAdView");
                this.apsAdViewRef = new WeakReference<>(apsAdView);
                adViewRefPassed = null;
                attachWebView();
            } catch (RuntimeException e10) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error rendering the ApsInterstitial activity ApsAdView", e10);
                finish();
            }
        }
    }

    public static final ImageView imageView_delegate$lambda$2(ApsInterstitialActivity apsInterstitialActivity) {
        ImageView imageView = new ImageView(apsInterstitialActivity);
        imageView.setImageDrawable(a.getDrawable(apsInterstitialActivity, R.drawable.mraid_close));
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initActivity() {
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            setContentView(R.layout.aps_interstitial_activity);
            ApsLog.d(this.TAG, "Init window completed");
        } catch (RuntimeException e10) {
            ApsLog.e(this.TAG, "Error in calling the initActivity: " + e10);
        }
    }

    private final void prepareCloseButtonRegion() {
        DTBAdMRAIDController mraidHandler;
        LinearLayout closeIndicatorRegion = getCloseIndicatorRegion();
        if (closeIndicatorRegion != null) {
            WeakReference<ApsAdView> weakReference = this.apsAdViewRef;
            ApsAdView apsAdView = weakReference != null ? weakReference.get() : null;
            if (apsAdView != null && (mraidHandler = apsAdView.getMraidHandler()) != null) {
                mraidHandler.setCustomButtonListener(new g(this, 29));
                DtbOmSdkSessionManager omSdkManager = apsAdView.getOmSdkManager();
                if (omSdkManager != null) {
                    omSdkManager.addFriendlyObstruction(findViewById(R.id.mraid_close_indicator), FriendlyObstructionPurpose.CLOSE_AD);
                }
            }
            closeIndicatorRegion.setVisibility(getUseCustomClose() ? 4 : 0);
            closeIndicatorRegion.bringToFront();
            closeIndicatorRegion.setBackgroundColor(0);
            closeIndicatorRegion.setOrientation(1);
            closeIndicatorRegion.addView(getImageView(), this.imageParams);
            closeIndicatorRegion.setOnTouchListener(new b(this, 3));
        }
    }

    public static final boolean prepareCloseButtonRegion$lambda$12$lambda$11(ApsInterstitialActivity apsInterstitialActivity, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        apsInterstitialActivity.cleanAndFinishAdView();
        return true;
    }

    public static final void useCustomButtonUpdated$lambda$17(ApsInterstitialActivity apsInterstitialActivity) {
        apsInterstitialActivity.findViewById(R.id.mraid_close_indicator).setVisibility(apsInterstitialActivity.getUseCustomClose() ? 4 : 0);
    }

    public final LinearLayout getCloseIndicatorRegion() {
        return (LinearLayout) findViewById(R.id.mraid_close_indicator);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        try {
            if (getUseCustomClose()) {
                return;
            }
            cleanAndFinishAdView();
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute onBackPressed method", e10);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        xBfdMhmcFlTfnl.oxbRr.invoke(null, this, bundle);
    }

    @Override // android.app.Activity
    public void onDestroy() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        vYwYqhhvBxO.zJLD.invoke(null, this);
    }

    public final void setCloseIndicatorRegion(LinearLayout linearLayout) {
        this.closeIndicatorRegion = linearLayout;
    }

    @Override // com.amazon.aps.ads.util.ApsMraidCloseButtonListener
    public void useCustomButtonUpdated() {
        WeakReference<ApsAdView> weakReference;
        ApsAdView apsAdView;
        DTBAdMRAIDController controller;
        DtbOmSdkSessionManager dtbOmSdkSessionManager;
        new Handler(Looper.getMainLooper()).post(new com.unity3d.services.banners.view.a(this, 17));
        try {
            if (getUseCustomClose() || (weakReference = this.apsAdViewRef) == null || (apsAdView = weakReference.get()) == null || (controller = apsAdView.getController()) == null || (dtbOmSdkSessionManager = controller.getDtbOmSdkSessionManager()) == null) {
                return;
            }
            dtbOmSdkSessionManager.addFriendlyObstruction(findViewById(R.id.mraid_close_indicator), FriendlyObstructionPurpose.CLOSE_AD);
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, " OMSDK : Unable to add close icon as friendly obstruction on geometry change", e10);
        }
    }
}
