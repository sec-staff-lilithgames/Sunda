package com.amazon.aps.ads.util.adview;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ScrollView;
import com.amazon.aps.ads.Aps;
import com.amazon.aps.ads.util.ApsAdExtensionsKt;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdUtil;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ApsAdViewUtils {
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final Rect computeAdViewRect(WebView webView, ScrollView scrollView) {
            e0.checkNotNullParameter(webView, "webView");
            Activity activity = DTBAdUtil.getActivity(webView);
            if (activity == null) {
                return null;
            }
            View viewFindViewById = activity.findViewById(R.id.content);
            ViewGroup viewGroup = viewFindViewById instanceof ViewGroup ? (ViewGroup) viewFindViewById : null;
            if (viewGroup == null) {
                return null;
            }
            int[] iArr = new int[2];
            viewGroup.getLocationInWindow(iArr);
            int i10 = iArr[0];
            Rect rect = new Rect(i10, iArr[1], viewGroup.getWidth() + i10, viewGroup.getHeight() + iArr[1]);
            int[] iArr2 = new int[2];
            webView.getLocationInWindow(iArr2);
            int i11 = iArr2[0];
            Rect rect2 = new Rect(i11, iArr2[1], webView.getWidth() + i11, webView.getHeight() + iArr2[1]);
            if (scrollView == null) {
                rect2.intersect(rect);
                return rect2;
            }
            int[] iArr3 = new int[2];
            scrollView.getLocationInWindow(iArr3);
            int i12 = iArr3[0];
            Rect rect3 = new Rect(i12, iArr3[1], scrollView.getWidth() + i12, scrollView.getHeight() + iArr3[1]);
            rect3.intersect(rect);
            rect2.intersect(rect3);
            return rect2;
        }

        public final int computeExposureInScrollView(WebView webView, Rect adViewRect) {
            e0.checkNotNullParameter(webView, "webView");
            e0.checkNotNullParameter(adViewRect, "adViewRect");
            float height = webView.getHeight() * webView.getWidth();
            float f10 = (adViewRect.bottom - adViewRect.top) * (adViewRect.right - adViewRect.left);
            if (height == 0.0f) {
                return 0;
            }
            return (int) ((100 * f10) / height);
        }

        public final Rect computeRootContainerRectInRootView(WebView webView) {
            e0.checkNotNullParameter(webView, "webView");
            Object parent = webView.getParent();
            View view = parent instanceof View ? (View) parent : null;
            Activity activity = view != null ? DTBAdUtil.getActivity(view) : DTBAdUtil.getActivity(webView);
            if (activity == null) {
                return null;
            }
            View viewFindViewById = activity.findViewById(R.id.content);
            ViewGroup viewGroup = viewFindViewById instanceof ViewGroup ? (ViewGroup) viewFindViewById : null;
            if (viewGroup == null) {
                return null;
            }
            int[] iArr = new int[2];
            viewGroup.getLocationInWindow(iArr);
            int i10 = iArr[0];
            return new Rect(i10, iArr[1], viewGroup.getWidth() + i10, viewGroup.getHeight() + iArr[1]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.webkit.WebView, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v7 */
        public final ScrollView getScrollViewParent(WebView webView) {
            e0.checkNotNullParameter(webView, "webView");
            do {
                ViewParent parent = webView.getParent();
                webView = parent instanceof ViewGroup ? (ViewGroup) parent : 0;
                if (webView == 0) {
                    return null;
                }
            } while (!(webView instanceof ScrollView));
            return (ScrollView) webView;
        }

        public final void initWebView(WebView webView) {
            e0.checkNotNullParameter(webView, "webView");
            WebSettings settings = webView.getSettings();
            if (settings != null) {
                WebView.setWebContentsDebuggingEnabled(Aps.isTestingMode());
                settings.setJavaScriptEnabled(true);
                settings.setAllowContentAccess(true);
                settings.setDomStorageEnabled(true);
                settings.setCacheMode(-1);
                settings.setAllowFileAccess(false);
                settings.setLoadsImagesAutomatically(true);
                settings.setMediaPlaybackRequiresUserGesture(false);
                settings.setBlockNetworkImage(false);
            }
        }

        public final void verifyIsVisible(ApsAdViewBase webView, boolean z10, p notifyViewabilityAndSetIsVisible) {
            ViewGroup viewGroup;
            e0.checkNotNullParameter(webView, "webView");
            e0.checkNotNullParameter(notifyViewabilityAndSetIsVisible, "notifyViewabilityAndSetIsVisible");
            if (webView.getParent() == null || webView.getVisibility() != 0) {
                Boolean bool = Boolean.FALSE;
                notifyViewabilityAndSetIsVisible.invoke(bool, bool);
                return;
            }
            Activity currentActivity = AdRegistration.getCurrentActivity();
            if (currentActivity == null) {
                Boolean bool2 = Boolean.FALSE;
                notifyViewabilityAndSetIsVisible.invoke(bool2, bool2);
                return;
            }
            try {
                viewGroup = (ViewGroup) currentActivity.findViewById(R.id.content);
            } catch (RuntimeException e10) {
                ApsAdExtensionsKt.logEvent(this, APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to get content view", e10);
                viewGroup = null;
            }
            if (viewGroup == null) {
                Boolean bool3 = Boolean.FALSE;
                notifyViewabilityAndSetIsVisible.invoke(bool3, bool3);
                return;
            }
            int[] iArr = new int[2];
            viewGroup.getLocationInWindow(iArr);
            int i10 = iArr[0];
            Rect rect = new Rect(i10, iArr[1], viewGroup.getWidth() + i10, viewGroup.getHeight() + iArr[1]);
            int[] iArr2 = new int[2];
            webView.getLocationInWindow(iArr2);
            int i11 = iArr2[0];
            Rect rect2 = new Rect(i11, iArr2[1], webView.getWidth() + i11, webView.getHeight() + iArr2[1]);
            if (!rect.contains(rect2) && !Rect.intersects(rect, rect2)) {
                Boolean bool4 = Boolean.FALSE;
                notifyViewabilityAndSetIsVisible.invoke(bool4, bool4);
                return;
            }
            ScrollView scrollViewParent = webView.getScrollViewParent();
            if (scrollViewParent == null) {
                notifyViewabilityAndSetIsVisible.invoke(Boolean.TRUE, Boolean.valueOf(!z10));
                return;
            }
            int[] iArr3 = new int[2];
            scrollViewParent.getLocationInWindow(iArr3);
            int i12 = iArr3[0];
            Rect rect3 = new Rect(i12, iArr3[1], scrollViewParent.getWidth() + i12, scrollViewParent.getHeight() + iArr3[1]);
            if (!Rect.intersects(rect2, rect3)) {
                notifyViewabilityAndSetIsVisible.invoke(Boolean.FALSE, Boolean.TRUE);
                ApsAdExtensionsKt.d(this, "SET MRAID Visible false because of scroll ");
            } else {
                if (!Rect.intersects(rect2, rect3) || z10) {
                    return;
                }
                notifyViewabilityAndSetIsVisible.invoke(Boolean.TRUE, Boolean.valueOf(!z10));
                ApsAdExtensionsKt.d(this, "SET MRAID Visible true because of scroll ");
            }
        }

        private Companion() {
        }
    }

    private ApsAdViewUtils() {
    }

    public static final Rect computeAdViewRect(WebView webView, ScrollView scrollView) {
        return Companion.computeAdViewRect(webView, scrollView);
    }

    public static final int computeExposureInScrollView(WebView webView, Rect rect) {
        return Companion.computeExposureInScrollView(webView, rect);
    }

    public static final ScrollView getScrollViewParent(WebView webView) {
        return Companion.getScrollViewParent(webView);
    }

    public static final void initWebView(WebView webView) {
        Companion.initWebView(webView);
    }

    public static final void verifyIsVisible(ApsAdViewBase apsAdViewBase, boolean z10, p pVar) {
        Companion.verifyIsVisible(apsAdViewBase, z10, pVar);
    }
}
