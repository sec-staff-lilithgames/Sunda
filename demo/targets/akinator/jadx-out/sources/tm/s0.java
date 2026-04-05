package tm;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.ironsource.C3191e4;
import o9.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class s0 extends WebView {

    /* renamed from: i, reason: collision with root package name */
    public static final r0 f87123i = new r0();

    /* renamed from: b, reason: collision with root package name */
    public final c1 f87124b;

    /* renamed from: c, reason: collision with root package name */
    public final um.m0 f87125c;

    /* renamed from: e, reason: collision with root package name */
    public p0 f87126e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f87127f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f87128g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f87129h;

    public s0(Context context) {
        super(context);
        this.f87127f = false;
        this.f87128g = false;
        this.f87129h = false;
        setScrollContainer(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setScrollBarStyle(33554432);
        setFocusableInTouchMode(false);
        this.f87124b = new c1(context);
        setOnTouchListener(new q0(this));
        setWebChromeClient(f87123i);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setBackgroundColor(0);
        this.f87125c = new um.m0(context, this, new b3(this, 16));
    }

    public final void a() {
        boolean z10 = !this.f87128g && this.f87125c.isVisible();
        if (z10 != this.f87127f) {
            this.f87127f = z10;
            p0 p0Var = this.f87126e;
            if (p0Var != null) {
                ((u0) p0Var).onViewableChanged(z10);
            }
        }
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f87129h = true;
        try {
            reset();
            removeAllViews();
            this.f87125c.release();
            super.destroy();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void injectJs(String str) {
        if (isDestroyed()) {
            t.d("MraidWebView", "can't evaluating js: WebView is destroyed", new Object[0]);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            t.d("MraidWebView", "can't evaluating js: js is empty", new Object[0]);
            return;
        }
        try {
            t.d("MraidWebView", "evaluating js: %s", str);
            evaluateJavascript(str, new o0());
        } catch (Throwable th2) {
            t.e("MraidWebView", th2.getMessage(), new Object[0]);
            t.d("MraidWebView", "loading url: %s", str);
            loadUrl("javascript:" + str);
        }
    }

    public boolean isDestroyed() {
        return this.f87129h;
    }

    public boolean isViewable() {
        return this.f87127f;
    }

    public void onPageFinished() {
        this.f87125c.start();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            t.d("MraidWebView", C3191e4.h.f36512u0, new Object[0]);
            try {
                onResume();
            } catch (Throwable th2) {
                t.e("MraidWebView", th2);
            }
            this.f87128g = false;
            a();
            return;
        }
        t.d("MraidWebView", C3191e4.h.f36510t0, new Object[0]);
        try {
            onPause();
        } catch (Throwable th3) {
            t.e("MraidWebView", th3);
        }
        this.f87128g = true;
        a();
    }

    @Override // android.view.View
    public final boolean overScrollBy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        return false;
    }

    public void reset() {
        stopLoading();
        loadUrl("");
        t.d("MraidWebView", C3191e4.h.f36510t0, new Object[0]);
        try {
            onPause();
        } catch (Throwable th2) {
            t.e("MraidWebView", th2);
        }
        this.f87128g = true;
        a();
    }

    public void resetClicked() {
        this.f87124b.resetClick();
    }

    public void setListener(p0 p0Var) {
        this.f87126e = p0Var;
    }

    public boolean wasClicked() {
        return this.f87124b.isClicked();
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }
}
