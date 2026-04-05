package vm;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import io.bidmachine.iab.vast.activity.VastView;
import um.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VastView f89316a;

    public m(VastView vastView) {
        this.f89316a = vastView;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        webView.setBackgroundColor(0);
        webView.setLayerType(1, null);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        int i10 = VastView.f60422k0;
        VastView vastView = this.f89316a;
        FrameLayout frameLayout = vastView.f60447q;
        if (frameLayout == null) {
            return true;
        }
        h0.removeFromParent(frameLayout);
        vastView.f60447q = null;
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest.hasGesture()) {
            this.f89316a.P.add(webView);
        }
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) throws IllegalStateException {
        VastView vastView = this.f89316a;
        if (!vastView.P.contains(webView)) {
            return true;
        }
        io.bidmachine.iab.vast.e.d(vastView.f60424b, "banner clicked", new Object[0]);
        VastView.f(vastView, vastView.f60448r, str);
        return true;
    }
}
