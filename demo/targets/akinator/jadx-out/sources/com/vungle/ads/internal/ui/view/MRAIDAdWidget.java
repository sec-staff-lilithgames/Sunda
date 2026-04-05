package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.platform.WebViewUtil;
import com.vungle.ads.internal.presenter.WebViewManager;
import com.vungle.ads.internal.ui.view.MRAIDAdWidget;
import com.vungle.ads.internal.util.HandlerScheduler;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.ViewUtility;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.a0;
import tu.x0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class MRAIDAdWidget extends RelativeLayout {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "MRAIDAdWidget";
    private CloseDelegate closeDelegate;
    private final String eventId;
    private OnViewTouchListener onViewTouchListener;
    private OrientationDelegate orientationDelegate;
    private WebView webView;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.RUNTIME)
    public @interface AdStopReason {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final int IS_AD_FINISHED_BY_API = 4;
        public static final int IS_AD_FINISHING = 2;
        public static final int IS_CHANGING_CONFIGURATION = 1;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int IS_AD_FINISHED_BY_API = 4;
            public static final int IS_AD_FINISHING = 2;
            public static final int IS_CHANGING_CONFIGURATION = 1;

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AudioContextWrapper extends ContextWrapper {
        public AudioContextWrapper(Context context) {
            super(context);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String name) {
            e0.checkNotNullParameter(name, "name");
            Object systemService = e0.areEqual("audio", name) ? getApplicationContext().getSystemService(name) : super.getSystemService(name);
            e0.checkNotNullExpressionValue(systemService, "if (AUDIO_SERVICE == nam…rvice(name)\n            }");
            return systemService;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface CloseDelegate {
        void close();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DestroyRunnable implements Runnable {
        private final boolean isMaliBuggy;
        private final MRAIDAdWidget widget;

        public DestroyRunnable(MRAIDAdWidget widget, boolean z10) {
            e0.checkNotNullParameter(widget, "widget");
            this.widget = widget;
            this.isMaliBuggy = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: run$lambda-0, reason: not valid java name */
        public static final void m3666run$lambda0(DestroyRunnable this$0) {
            e0.checkNotNullParameter(this$0, "this$0");
            this$0.run();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: run$lambda-10, reason: not valid java name */
        public static final void m3667run$lambda10(WebView wv2, DestroyRunnable this$0) {
            e0.checkNotNullParameter(wv2, "$wv");
            e0.checkNotNullParameter(this$0, "this$0");
            try {
                wv2.destroy();
                String eventId = this$0.widget.getEventId();
                if (eventId != null) {
                    WebViewManager.INSTANCE.destroyWebView(eventId);
                }
                this$0.widget.webView = null;
            } catch (Throwable th2) {
                Logger.Companion.e(MRAIDAdWidget.TAG, "Destroy webview " + th2.getMessage());
            }
        }

        public final boolean isMaliBuggy() {
            return this.isMaliBuggy;
        }

        @Override // java.lang.Runnable
        public void run() {
            x0 x0Var = x0.f87415a;
            final WebView webView = this.widget.webView;
            if (webView == null) {
                return;
            }
            try {
                if (!e0.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.vungle.ads.internal.ui.view.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            MRAIDAdWidget.DestroyRunnable.m3666run$lambda0(this.f50785b);
                        }
                    });
                    return;
                }
                try {
                    int i10 = z.f87419c;
                    webView.onPause();
                    z.m7131constructorimpl(x0Var);
                } catch (Throwable th2) {
                    int i11 = z.f87419c;
                    z.m7131constructorimpl(a0.createFailure(th2));
                }
                try {
                    webView.stopLoading();
                    z.m7131constructorimpl(x0Var);
                } catch (Throwable th3) {
                    int i12 = z.f87419c;
                    z.m7131constructorimpl(a0.createFailure(th3));
                }
                try {
                    webView.setWebChromeClient(null);
                    z.m7131constructorimpl(x0Var);
                } catch (Throwable th4) {
                    int i13 = z.f87419c;
                    z.m7131constructorimpl(a0.createFailure(th4));
                }
                try {
                    webView.setWebViewClient(new WebViewClient());
                    z.m7131constructorimpl(x0Var);
                } catch (Throwable th5) {
                    int i14 = z.f87419c;
                    z.m7131constructorimpl(a0.createFailure(th5));
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    try {
                        webView.setWebViewRenderProcessClient(null);
                        z.m7131constructorimpl(x0Var);
                    } catch (Throwable th6) {
                        int i15 = z.f87419c;
                        z.m7131constructorimpl(a0.createFailure(th6));
                    }
                }
                webView.setVisibility(8);
                if (this.isMaliBuggy) {
                    webView.setLayerType(1, null);
                }
                try {
                    webView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
                    z.m7131constructorimpl(x0Var);
                } catch (Throwable th7) {
                    int i16 = z.f87419c;
                    z.m7131constructorimpl(a0.createFailure(th7));
                }
                try {
                    webView.clearHistory();
                    z.m7131constructorimpl(x0Var);
                } catch (Throwable th8) {
                    int i17 = z.f87419c;
                    z.m7131constructorimpl(a0.createFailure(th8));
                }
                try {
                    webView.removeAllViews();
                    z.m7131constructorimpl(x0Var);
                } catch (Throwable th9) {
                    int i18 = z.f87419c;
                    z.m7131constructorimpl(a0.createFailure(th9));
                }
                new HandlerScheduler().schedule(new Runnable() { // from class: com.vungle.ads.internal.ui.view.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        MRAIDAdWidget.DestroyRunnable.m3667run$lambda10(webView, this);
                    }
                }, this.isMaliBuggy ? 300L : 100L);
            } catch (Throwable th10) {
                Logger.Companion.e(MRAIDAdWidget.TAG, "Destroy webview: " + th10.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface OnViewTouchListener {
        boolean onTouch(MotionEvent motionEvent);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface OrientationDelegate {
        void setOrientation(int i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MRAIDAdWidget(Context context) throws InstantiationException {
        this(context, null, 2, 0 == true ? 1 : 0);
        e0.checkNotNullParameter(context, "context");
    }

    private final void bindListeners() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.vungle.ads.internal.ui.view.a
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return MRAIDAdWidget.m3665bindListeners$lambda0(this.f50784b, view, motionEvent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindListeners$lambda-0, reason: not valid java name */
    public static final boolean m3665bindListeners$lambda0(MRAIDAdWidget this$0, View view, MotionEvent motionEvent) {
        e0.checkNotNullParameter(this$0, "this$0");
        OnViewTouchListener onViewTouchListener = this$0.onViewTouchListener;
        if (onViewTouchListener != null) {
            return onViewTouchListener.onTouch(motionEvent);
        }
        return false;
    }

    public static /* synthetic */ void destroyWebView$default(MRAIDAdWidget mRAIDAdWidget, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        mRAIDAdWidget.destroyWebView(j10, z10);
    }

    private final void prepare() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.setLayerType(2, null);
            webView.setBackgroundColor(0);
            webView.setVisibility(8);
        }
    }

    public final void close() {
        CloseDelegate closeDelegate = this.closeDelegate;
        if (closeDelegate != null) {
            closeDelegate.close();
        }
    }

    public final void destroyWebView(long j10, boolean z10) {
        x0 x0Var = x0.f87415a;
        try {
            int i10 = z.f87419c;
            ViewParent parent = getParent();
            x0 x0Var2 = null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this);
                x0Var2 = x0Var;
            }
            z.m7131constructorimpl(x0Var2);
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            z.m7131constructorimpl(a0.createFailure(th2));
        }
        try {
            removeAllViews();
            z.m7131constructorimpl(x0Var);
        } catch (Throwable th3) {
            int i12 = z.f87419c;
            z.m7131constructorimpl(a0.createFailure(th3));
        }
        if (j10 <= 0) {
            new DestroyRunnable(this, z10).run();
        } else {
            new HandlerScheduler().schedule(new DestroyRunnable(this, z10), j10);
        }
    }

    public final CloseDelegate getCloseDelegate$vungle_ads_release() {
        return this.closeDelegate;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final OnViewTouchListener getOnViewTouchListener$vungle_ads_release() {
        return this.onViewTouchListener;
    }

    public final OrientationDelegate getOrientationDelegate$vungle_ads_release() {
        return this.orientationDelegate;
    }

    public final String getUrl() {
        WebView webView = this.webView;
        if (webView != null) {
            return webView.getUrl();
        }
        return null;
    }

    public final void linkWebView(WebViewClient vngWebViewClient, AdPayload.WebViewSettings webViewSettings) {
        e0.checkNotNullParameter(vngWebViewClient, "vngWebViewClient");
        WebView webView = this.webView;
        if (webView != null) {
            WebViewUtil.INSTANCE.applyWebSettings(webView, webViewSettings);
            webView.setWebViewClient(vngWebViewClient);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        ViewGroup.LayoutParams layoutParams;
        super.onAttachedToWindow();
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = -1;
            layoutParams2.width = -1;
        }
        WebView webView = this.webView;
        if (webView == null || (layoutParams = webView.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = -1;
        layoutParams.width = -1;
    }

    public final void pauseWeb() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.onPause();
        }
    }

    public final void resumeWeb() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.setVisibility(0);
        }
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.onResume();
        }
    }

    public final void setCloseDelegate(CloseDelegate closeDelegate) {
        e0.checkNotNullParameter(closeDelegate, "closeDelegate");
        this.closeDelegate = closeDelegate;
    }

    public final void setCloseDelegate$vungle_ads_release(CloseDelegate closeDelegate) {
        this.closeDelegate = closeDelegate;
    }

    public final void setOnViewTouchListener(OnViewTouchListener onViewTouchListener) {
        this.onViewTouchListener = onViewTouchListener;
    }

    public final void setOnViewTouchListener$vungle_ads_release(OnViewTouchListener onViewTouchListener) {
        this.onViewTouchListener = onViewTouchListener;
    }

    public final void setOrientation(int i10) {
        OrientationDelegate orientationDelegate = this.orientationDelegate;
        if (orientationDelegate != null) {
            orientationDelegate.setOrientation(i10);
        }
    }

    public final void setOrientationDelegate(OrientationDelegate orientationDelegate) {
        this.orientationDelegate = orientationDelegate;
    }

    public final void setOrientationDelegate$vungle_ads_release(OrientationDelegate orientationDelegate) {
        this.orientationDelegate = orientationDelegate;
    }

    public final void showWebsite(String url) {
        e0.checkNotNullParameter(url, "url");
        Logger.Companion.d(TAG, "loadUrl: " + url);
        WebView webView = this.webView;
        if (webView != null) {
            webView.loadUrl(url);
        }
    }

    public /* synthetic */ MRAIDAdWidget(Context context, String str, int i10, u uVar) throws InstantiationException {
        this(context, (i10 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MRAIDAdWidget(Context context, String str) throws InstantiationException {
        super(context);
        e0.checkNotNullParameter(context, "context");
        this.eventId = str;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(layoutParams);
        WebView webView = ViewUtility.INSTANCE.getWebView(context, str);
        this.webView = webView;
        if (webView != null) {
            webView.setLayoutParams(layoutParams);
        }
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.setTag("VungleWebView");
        }
        addView(this.webView, layoutParams);
        bindListeners();
        prepare();
    }

    public static /* synthetic */ void getCloseDelegate$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getOnViewTouchListener$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getOrientationDelegate$vungle_ads_release$annotations() {
    }
}
