package com.amazon.aps.ads.util.adview;

import a2.q;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.ScrollView;
import com.amazon.aps.ads.metrics.ApsMetricsAdListenerAdapterBase;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.aps.ads.util.ApsAdExtensionsKt;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBActivityListener;
import com.amazon.device.ads.DTBAdMRAIDBannerController;
import com.amazon.device.ads.DTBAdMRAIDController;
import com.amazon.device.ads.DTBAdViewDisplayListener;
import com.amazon.device.ads.DTBTimeTrace;
import com.amazon.device.ads.DtbOmSdkSessionManager;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.e0;
import kv.p;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class ApsAdViewBase extends WebView implements ApsAdViewConstants {
    private boolean adViewScrollEnabled;
    protected ApsAdFormat apsAdFormat;
    private String bidId;
    protected int exposurePercent;
    protected ViewTreeObserver.OnGlobalFocusChangeListener focusChangeListener;
    protected ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    private String hostname;
    protected boolean ignoreDetachment;
    private boolean isAdViewVisible;
    protected boolean isFirstDisplay;
    private boolean isVideo;
    private DTBAdMRAIDController mraidHandler;
    private ApsMetricsAdListenerAdapterBase mraidListenerAdapter;
    private DtbOmSdkSessionManager omSdkManager;
    protected ViewTreeObserver.OnScrollChangedListener scrollChangeListener;
    private long startTime;
    protected long timeClicked;
    protected long timePressed;
    private WeakReference<View> viewWeakReference;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.amazon.aps.ads.util.adview.ApsAdViewBase$verifyIsVisible$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends a0 implements p {
        public AnonymousClass1(Object obj) {
            super(2, obj, ApsAdViewBase.class, "notifyViewabilityAndSetIsVisible", "notifyViewabilityAndSetIsVisible(ZZ)V", 0);
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            return x0.f87415a;
        }

        public final void invoke(boolean z10, boolean z11) {
            ((ApsAdViewBase) this.receiver).notifyViewabilityAndSetIsVisible(z10, z11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApsAdViewBase(Context context) {
        super(context);
        e0.checkNotNullParameter(context, "context");
        this.isFirstDisplay = true;
        this.exposurePercent = -1;
        this.adViewScrollEnabled = true;
        CookieManager.getInstance().setAcceptCookie(true);
        this.omSdkManager = DtbOmSdkSessionManager.getNewInstance();
    }

    public static /* synthetic */ void notifyViewabilityAndSetIsVisible$default(ApsAdViewBase apsAdViewBase, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifyViewabilityAndSetIsVisible");
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        apsAdViewBase.notifyViewabilityAndSetIsVisible(z10, z11);
    }

    private final void replaceWithBidderAdView(ApsAdViewBase apsAdViewBase) {
        ViewParent parent = apsAdViewBase.getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        viewGroup.removeView(apsAdViewBase);
        WeakReference<View> weakReference = this.viewWeakReference;
        viewGroup.addView(weakReference != null ? weakReference.get() : null);
    }

    public Rect computeAdViewRect(ScrollView scrollView) {
        return ApsAdViewUtils.Companion.computeAdViewRect(this, scrollView);
    }

    public void computeExposure(boolean z10) {
        ScrollView scrollViewParent = getScrollViewParent();
        if (scrollViewParent != null) {
            computeExposureInScrollView(scrollViewParent, z10);
            return;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i10 = iArr[0];
        Rect rect = new Rect(i10, iArr[1], getWidth() + i10, getHeight() + iArr[1]);
        if (isMraidHandlerInitialized()) {
            computeExposureInRootView(z10);
            onPositionChanged(rect);
        }
    }

    public void computeExposureInRootView(boolean z10) {
        Rect rectComputeRootContainerRectInRootView = computeRootContainerRectInRootView();
        if (rectComputeRootContainerRectInRootView != null) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            int i10 = iArr[0];
            Rect rect = new Rect(i10, iArr[1], getWidth() + i10, getHeight() + iArr[1]);
            float height = getHeight() * getWidth();
            if (!rect.intersect(rectComputeRootContainerRectInRootView)) {
                if (this.exposurePercent != 0 || z10) {
                    this.exposurePercent = 0;
                    rect.top = rect.bottom;
                    onExposureChange(0, rect);
                    return;
                }
                return;
            }
            int i11 = (int) (((((rect.bottom - rect.top) * (rect.right - rect.left)) * 100.0d) / height) + 0.5d);
            if (i11 != this.exposurePercent || z10) {
                this.exposurePercent = i11;
                onExposureChange(i11, rect);
            }
        }
    }

    public int computeExposureInScrollView(Rect adViewRect) {
        e0.checkNotNullParameter(adViewRect, "adViewRect");
        return ApsAdViewUtils.Companion.computeExposureInScrollView(this, adViewRect);
    }

    public Rect computeRootContainerRectInRootView() {
        return ApsAdViewUtils.Companion.computeRootContainerRectInRootView(this);
    }

    public void finalize() {
        try {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.globalLayoutListener);
                viewTreeObserver.removeOnScrollChangedListener(this.scrollChangeListener);
                viewTreeObserver.removeOnGlobalFocusChangeListener(this.focusChangeListener);
            }
        } catch (RuntimeException e10) {
            ApsAdExtensionsKt.logEvent(this, APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute finalize method", e10);
        }
    }

    public final boolean getAdViewScrollEnabled() {
        return this.adViewScrollEnabled;
    }

    public final String getBidId() {
        return this.bidId;
    }

    public final String getHostname() {
        return this.hostname;
    }

    public final DTBAdMRAIDController getMraidHandler() {
        return this.mraidHandler;
    }

    public final ApsMetricsAdListenerAdapterBase getMraidListenerAdapter() {
        return this.mraidListenerAdapter;
    }

    public final DtbOmSdkSessionManager getOmSdkManager() {
        return this.omSdkManager;
    }

    public final ScrollView getScrollViewParent() {
        return ApsAdViewUtils.Companion.getScrollViewParent(this);
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final WeakReference<View> getViewWeakReference() {
        return this.viewWeakReference;
    }

    public final void initLayoutListeners() {
        int i10 = 1;
        this.globalLayoutListener = new a2.p(this, i10);
        this.focusChangeListener = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: com.amazon.aps.ads.util.adview.a
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view, View view2) {
                this.f12504b.verifyIsVisible();
            }
        };
        this.scrollChangeListener = new q(this, i10);
    }

    public void initWebView() {
        ApsAdViewUtils.Companion.initWebView(this);
    }

    public final boolean isAdViewVisible() {
        return this.isAdViewVisible;
    }

    public boolean isMraidHandlerInitialized() {
        return this.mraidHandler != null;
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    public void notifyViewabilityAndSetIsVisible(boolean z10, boolean z11) {
        if (this.isAdViewVisible || z11) {
            if (isMraidHandlerInitialized()) {
                onViewabilityChanged(z10);
            }
            setAdViewVisible(z10);
        }
    }

    public abstract void onAdOpened();

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            WeakReference<View> weakReference = this.viewWeakReference;
            if ((weakReference != null ? weakReference.get() : null) != null) {
                replaceWithBidderAdView(this);
                return;
            }
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(this.globalLayoutListener);
                viewTreeObserver.addOnGlobalFocusChangeListener(this.focusChangeListener);
                viewTreeObserver.addOnScrollChangedListener(this.scrollChangeListener);
            }
            if (isMraidHandlerInitialized()) {
                onAdOpened();
            }
        } catch (RuntimeException e10) {
            ApsAdExtensionsKt.logEvent(this, APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute onAttachedToWindow method", e10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        DtbOmSdkSessionManager dtbOmSdkSessionManager;
        try {
            super.onDetachedFromWindow();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.globalLayoutListener);
                viewTreeObserver.removeOnScrollChangedListener(this.scrollChangeListener);
                viewTreeObserver.removeOnGlobalFocusChangeListener(this.focusChangeListener);
            }
            DTBAdMRAIDController dTBAdMRAIDController = this.mraidHandler;
            if (dTBAdMRAIDController != null && (dTBAdMRAIDController instanceof DTBAdMRAIDBannerController) && (dtbOmSdkSessionManager = this.omSdkManager) != null && dtbOmSdkSessionManager != null) {
                dtbOmSdkSessionManager.stopOmAdSession();
            }
            WeakReference<View> weakReference = this.viewWeakReference;
            if ((weakReference != null ? weakReference.get() : null) == null) {
                this.mraidListenerAdapter = null;
            }
        } catch (RuntimeException e10) {
            ApsAdExtensionsKt.logEvent(this, APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute onDetachedFromWindow method in ApsAdView class", e10);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        e0.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.isFirstDisplay) {
            DTBTimeTrace dTBTimeTrace = DTBTimeTrace.getInstance();
            if (dTBTimeTrace != null && AdRegistration.isTestMode()) {
                dTBTimeTrace.addPhase(DTBTimeTrace.TIMETRACE_AD_DISPLAY_SUCCEEDED);
                dTBTimeTrace.logTrace();
            }
            DTBActivityListener dTBActivityListener = this.mraidHandler;
            if (dTBActivityListener instanceof DTBAdViewDisplayListener) {
                e0.checkNotNull(dTBActivityListener, "null cannot be cast to non-null type com.amazon.device.ads.DTBAdViewDisplayListener");
                ((DTBAdViewDisplayListener) dTBActivityListener).onInitialDisplay();
            }
            this.isFirstDisplay = false;
        }
    }

    public abstract void onExposureChange(int i10, Rect rect);

    public abstract void onPositionChanged(Rect rect);

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        if (this.adViewScrollEnabled) {
            super.onScrollChanged(i10, i11, i13, i12);
        } else {
            scrollTo(0, 0);
        }
    }

    public abstract void onViewabilityChanged(boolean z10);

    public final void setAdViewScrollEnabled(boolean z10) {
        this.adViewScrollEnabled = z10;
        setVerticalScrollBarEnabled(z10);
        setHorizontalScrollBarEnabled(z10);
    }

    public final void setAdViewVisible(boolean z10) {
        this.isAdViewVisible = z10;
        if (z10) {
            return;
        }
        this.exposurePercent = -1;
        if (isMraidHandlerInitialized()) {
            onExposureChange(0, new Rect(0, 0, 0, 0));
        }
    }

    public final void setBidId(String str) {
        this.bidId = str;
        ApsMetricsAdListenerAdapterBase apsMetricsAdListenerAdapterBase = this.mraidListenerAdapter;
        if (apsMetricsAdListenerAdapterBase != null) {
            apsMetricsAdListenerAdapterBase.setBidId(str);
        }
    }

    public abstract void setCurrentPositionProperty();

    public final void setHostname(String str) {
        this.hostname = str;
    }

    public final void setMraidHandler(DTBAdMRAIDController dTBAdMRAIDController) {
        this.mraidHandler = dTBAdMRAIDController;
    }

    public final void setMraidListenerAdapter(ApsMetricsAdListenerAdapterBase apsMetricsAdListenerAdapterBase) {
        this.mraidListenerAdapter = apsMetricsAdListenerAdapterBase;
    }

    public void setScrollEnabled(boolean z10) {
        setAdViewScrollEnabled(z10);
        setVerticalScrollBarEnabled(z10);
        setHorizontalScrollBarEnabled(z10);
    }

    public final void setStartTime(long j10) {
        this.startTime = j10;
    }

    public final void setVideo(boolean z10) {
        this.isVideo = z10;
    }

    public final void setViewWeakReference(WeakReference<View> weakReference) {
        this.viewWeakReference = weakReference;
    }

    public void verifyIsVisible() {
        ApsAdExtensionsKt.d(this, "method verifyIsVisible called: " + this.isAdViewVisible);
        ApsAdViewUtils.Companion.verifyIsVisible(this, this.isAdViewVisible, new AnonymousClass1(this));
        if (this.isAdViewVisible) {
            computeExposure(false);
        }
    }

    public void computeExposureInScrollView(ScrollView scrollView, boolean z10) {
        Rect rectComputeAdViewRect = computeAdViewRect(scrollView);
        if (rectComputeAdViewRect != null) {
            int iComputeExposureInScrollView = computeExposureInScrollView(rectComputeAdViewRect);
            if (iComputeExposureInScrollView != this.exposurePercent || z10) {
                this.exposurePercent = iComputeExposureInScrollView;
                onExposureChange(iComputeExposureInScrollView, rectComputeAdViewRect);
                setCurrentPositionProperty();
            }
        }
    }

    public void cleanup() {
    }
}
