package l6;

import android.webkit.CookieManager;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final WebkitToCompatConverterBoundaryInterface f72455a;

    public e1(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f72455a = webkitToCompatConverterBoundaryInterface;
    }

    public v convertCookieManager(CookieManager cookieManager) {
        return new v((WebViewCookieManagerBoundaryInterface) rw.a.castToSuppLibClass(WebViewCookieManagerBoundaryInterface.class, this.f72455a.convertCookieManager(cookieManager)));
    }

    public InvocationHandler convertSafeBrowsingResponse(SafeBrowsingResponse safeBrowsingResponse) {
        return this.f72455a.convertSafeBrowsingResponse(safeBrowsingResponse);
    }

    public InvocationHandler convertServiceWorkerSettings(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return this.f72455a.convertServiceWorkerSettings(serviceWorkerWebSettings);
    }

    public q0 convertSettings(WebSettings webSettings) {
        return new q0((WebSettingsBoundaryInterface) rw.a.castToSuppLibClass(WebSettingsBoundaryInterface.class, this.f72455a.convertSettings(webSettings)));
    }

    public InvocationHandler convertWebMessagePort(WebMessagePort webMessagePort) {
        return this.f72455a.convertWebMessagePort(webMessagePort);
    }

    public InvocationHandler convertWebResourceError(WebResourceError webResourceError) {
        return this.f72455a.convertWebResourceError(webResourceError);
    }

    public p0 convertWebResourceRequest(WebResourceRequest webResourceRequest) {
        return new p0((WebResourceRequestBoundaryInterface) rw.a.castToSuppLibClass(WebResourceRequestBoundaryInterface.class, this.f72455a.convertWebResourceRequest(webResourceRequest)));
    }

    public SafeBrowsingResponse convertSafeBrowsingResponse(InvocationHandler invocationHandler) {
        return (SafeBrowsingResponse) this.f72455a.convertSafeBrowsingResponse(invocationHandler);
    }

    public ServiceWorkerWebSettings convertServiceWorkerSettings(InvocationHandler invocationHandler) {
        return (ServiceWorkerWebSettings) this.f72455a.convertServiceWorkerSettings(invocationHandler);
    }

    public WebMessagePort convertWebMessagePort(InvocationHandler invocationHandler) {
        return (WebMessagePort) this.f72455a.convertWebMessagePort(invocationHandler);
    }

    public WebResourceError convertWebResourceError(InvocationHandler invocationHandler) {
        return (WebResourceError) this.f72455a.convertWebResourceError(invocationHandler);
    }
}
