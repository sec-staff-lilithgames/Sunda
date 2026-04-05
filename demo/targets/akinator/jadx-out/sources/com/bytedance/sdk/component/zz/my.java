package com.bytedance.sdk.component.zz;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.zz.jj;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my extends WebView {

    /* renamed from: cm, reason: collision with root package name */
    private boolean f19097cm;

    /* renamed from: jd, reason: collision with root package name */
    private final HashSet<String> f19098jd;

    /* renamed from: jj, reason: collision with root package name */
    private wqx f19099jj;
    public long jpo;
    private boolean my;
    private boolean wqx;

    public my(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19098jd = new HashSet<>();
        this.jpo = System.currentTimeMillis();
        jpo();
    }

    private void jd() {
        if (this.wqx) {
            return;
        }
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
        setOnClickListener(null);
        setOnTouchListener(null);
        Iterator<String> it = this.f19098jd.iterator();
        while (it.hasNext()) {
            super.removeJavascriptInterface(it.next());
        }
    }

    private void jpo() {
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setDisplayZoomControls(false);
        settings.setBuiltInZoomControls(false);
        settings.setSupportMultipleWindows(false);
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        setWebViewClient(new jj.jpo());
    }

    @Override // android.webkit.WebView
    public void addJavascriptInterface(Object obj, String str) {
        toString();
        if (this.wqx || this.my) {
            return;
        }
        super.addJavascriptInterface(obj, str);
        this.f19098jd.add(str);
    }

    @Override // android.webkit.WebView
    public void clearCache(boolean z10) {
        if (this.wqx || this.my) {
            return;
        }
        super.clearCache(z10);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        toString();
        if (this.wqx) {
            return;
        }
        this.wqx = true;
        jd();
        super.destroy();
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!this.wqx && !this.my) {
            super.evaluateJavascript(str, valueCallback);
        } else if (valueCallback != null) {
            valueCallback.onReceiveValue("");
        }
    }

    @Override // android.webkit.WebView
    public void goBack() {
        if (this.wqx || this.my) {
            return;
        }
        super.goBack();
    }

    @Override // android.webkit.WebView
    public void goBackOrForward(int i10) {
        if (this.wqx || this.my) {
            return;
        }
        super.goBackOrForward(i10);
    }

    @Override // android.webkit.WebView
    public void goForward() {
        if (this.wqx || this.my) {
            return;
        }
        super.goForward();
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (this.wqx || this.my) {
            return;
        }
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (this.wqx || this.my) {
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError unused) {
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        toString();
        if (this.f19097cm) {
            destroy();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.wqx || this.my) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.wqx || this.my) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.webkit.WebView
    public void onPause() {
        if (this.wqx || this.my) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void onResume() {
        if (this.wqx || this.my) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void pauseTimers() {
        if (this.wqx || this.my) {
            return;
        }
        super.pauseTimers();
    }

    @Override // android.webkit.WebView
    public void reload() {
        if (this.wqx || this.my) {
            return;
        }
        super.reload();
    }

    @Override // android.webkit.WebView
    public void removeJavascriptInterface(String str) {
        if (this.wqx || this.my) {
            return;
        }
        super.removeJavascriptInterface(str);
        this.f19098jd.remove(str);
    }

    @Override // android.webkit.WebView
    public void resumeTimers() {
        if (this.wqx || this.my) {
            return;
        }
        super.resumeTimers();
    }

    public void setDestroyOnDetached(boolean z10) {
        this.f19097cm = z10;
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        wqx wqxVar = this.f19099jj;
        if (wqxVar == null) {
            super.setOnTouchListener(onTouchListener);
        } else {
            wqxVar.jpo(onTouchListener);
            super.setOnTouchListener(this.f19099jj);
        }
    }

    public void setRecycler(boolean z10) {
        this.my = z10;
    }

    public void setTouchListenerProxy(wqx wqxVar) {
        this.f19099jj = wqxVar;
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (this.wqx || this.my) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (this.wqx || this.my) {
            return;
        }
        try {
            super.loadUrl(str, map);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError unused) {
        }
    }

    public my(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19098jd = new HashSet<>();
        this.jpo = System.currentTimeMillis();
        jpo();
    }
}
