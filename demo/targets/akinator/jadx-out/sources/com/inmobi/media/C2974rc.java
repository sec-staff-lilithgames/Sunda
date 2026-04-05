package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import com.inmobi.media.C2974rc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.rc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2974rc extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3093yc f33323a;

    public C2974rc(GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc) {
        this.f33323a = gestureDetectorOnGestureListenerC3093yc;
    }

    public static final boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    public static final void b(JsResult result, DialogInterface dialogInterface, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(result, "$result");
        result.confirm();
    }

    public static final void c(JsResult result, DialogInterface dialogInterface, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(result, "$result");
        result.cancel();
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
        return defaultVideoPoster == null ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : defaultVideoPoster;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage cm2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cm2, "cm");
        String str = cm2.message() + " -- From line " + cm2.lineNumber() + " of " + cm2.sourceId();
        F5 f52 = this.f33323a.f33628i;
        if (f52 == null) {
            return true;
        }
        String str2 = GestureDetectorOnGestureListenerC3093yc.f33611b1;
        ((G5) f52).c(str2, O6.a(str2, "access$getTAG$cp(...)", "Console message:", str));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(origin, "origin");
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        if (this.f33323a.f33644q.get() != null) {
            new AlertDialog.Builder((Context) this.f33323a.f33644q.get()).setTitle("Location Permission").setMessage("Allow location access").setPositiveButton(R.string.ok, new zk.t0(0, callback, origin)).setNegativeButton(R.string.cancel, new zk.t0(1, callback, origin)).create().show();
        }
        super.onGeolocationPermissionsShowPrompt(origin, callback);
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        a();
        super.onHideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView view, String url, String message, JsResult result) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.e0.checkNotNullParameter(result, "result");
        F5 f52 = this.f33323a.f33628i;
        if (f52 != null) {
            String str = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((G5) f52).a(str, "jsAlert called with: " + message + url);
        }
        if (!GestureDetectorOnGestureListenerC3093yc.a(this.f33323a, result)) {
            return true;
        }
        Activity fullScreenActivity = this.f33323a.getFullScreenActivity();
        if (fullScreenActivity != null) {
            new AlertDialog.Builder(fullScreenActivity).setMessage(message).setTitle(url).setPositiveButton(R.string.ok, new zk.s0(result, 2)).setCancelable(false).create().show();
            return true;
        }
        result.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView view, String url, String message, JsResult result) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.e0.checkNotNullParameter(result, "result");
        F5 f52 = this.f33323a.f33628i;
        if (f52 != null) {
            String str = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((G5) f52).a(str, "jsConfirm called with: " + message + url);
        }
        if (!GestureDetectorOnGestureListenerC3093yc.a(this.f33323a, result)) {
            return true;
        }
        if (this.f33323a.getFullScreenActivity() != null) {
            new AlertDialog.Builder(this.f33323a.getFullScreenActivity()).setMessage(message).setPositiveButton(R.string.ok, new zk.s0(result, 0)).setNegativeButton(R.string.cancel, new zk.s0(result, 1)).create().show();
            return true;
        }
        result.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView view, String url, String message, String defaultValue, JsPromptResult result) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.e0.checkNotNullParameter(defaultValue, "defaultValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(result, "result");
        F5 f52 = this.f33323a.f33628i;
        if (f52 != null) {
            String str = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((G5) f52).a(str, "jsPrompt called with: " + message + url);
        }
        if (!GestureDetectorOnGestureListenerC3093yc.a(this.f33323a, result)) {
            return true;
        }
        if (this.f33323a.getFullScreenActivity() != null) {
            return false;
        }
        result.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        F5 f52 = this.f33323a.f33628i;
        if (f52 != null) {
            String str = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            ((G5) f52).c(str, AbstractC2803h9.a(str, "access$getTAG$cp(...)", "webview progress changed - ", i10));
        }
        super.onProgressChanged(webView, i10);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback callback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        if (this.f33323a.f33644q.get() != null) {
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f33323a;
            gestureDetectorOnGestureListenerC3093yc.P = view;
            gestureDetectorOnGestureListenerC3093yc.Q = callback;
            if (view != null) {
                view.setOnTouchListener(new com.applovin.impl.adview.r(4));
            }
            Activity activity = (Activity) this.f33323a.f33644q.get();
            FrameLayout frameLayout = activity != null ? (FrameLayout) activity.findViewById(R.id.content) : null;
            View view2 = this.f33323a.P;
            if (view2 != null) {
                view2.setBackgroundColor(-16777216);
            }
            if (frameLayout != null) {
                frameLayout.addView(this.f33323a.P, new AbsoluteLayout.LayoutParams(-1, -1, 0, 0));
            }
            View view3 = this.f33323a.P;
            if (view3 != null) {
                view3.requestFocus();
            }
            final GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc2 = this.f33323a;
            View view4 = gestureDetectorOnGestureListenerC3093yc2.P;
            View.OnKeyListener onKeyListener = new View.OnKeyListener() { // from class: zk.u0
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view5, int i10, KeyEvent keyEvent) {
                    return C2974rc.a(gestureDetectorOnGestureListenerC3093yc2, this, view5, i10, keyEvent);
                }
            };
            if (view4 != null) {
                view4.setOnKeyListener(onKeyListener);
            }
            if (view4 != null) {
                view4.setFocusable(true);
            }
            if (view4 != null) {
                view4.setFocusableInTouchMode(true);
            }
            if (view4 != null) {
                view4.requestFocus();
            }
        }
    }

    public static final void a(JsResult result, DialogInterface dialogInterface, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(result, "$result");
        result.confirm();
    }

    public static final void b(GeolocationPermissions.Callback callback, String origin, DialogInterface dialogInterface, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "$callback");
        kotlin.jvm.internal.e0.checkNotNullParameter(origin, "$origin");
        callback.invoke(origin, false, false);
    }

    public static final boolean a(GestureDetectorOnGestureListenerC3093yc this$0, C2974rc this$1, View view, int i10, KeyEvent keyEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$1, "this$1");
        if (4 != keyEvent.getKeyCode() || keyEvent.getAction() != 0) {
            return false;
        }
        F5 f52 = this$0.f33628i;
        if (f52 != null) {
            String str = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((G5) f52).a(str, "Back pressed when HTML5 video is playing.");
        }
        this$1.a();
        return true;
    }

    public final void a() {
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f33323a;
        if (gestureDetectorOnGestureListenerC3093yc.P == null) {
            return;
        }
        WebChromeClient.CustomViewCallback customViewCallback = gestureDetectorOnGestureListenerC3093yc.Q;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc2 = this.f33323a;
        gestureDetectorOnGestureListenerC3093yc2.Q = null;
        View view = gestureDetectorOnGestureListenerC3093yc2.P;
        if ((view != null ? view.getParent() : null) != null) {
            View view2 = this.f33323a.P;
            ViewParent parent = view2 != null ? view2.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.f33323a.P);
            }
            this.f33323a.P = null;
        }
    }

    public static final void a(GeolocationPermissions.Callback callback, String origin, DialogInterface dialogInterface, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "$callback");
        kotlin.jvm.internal.e0.checkNotNullParameter(origin, "$origin");
        callback.invoke(origin, true, false);
    }
}
