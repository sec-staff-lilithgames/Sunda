package l6;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class z0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final WebViewProviderFactoryBoundaryInterface f72512a;

    public z0(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f72512a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // l6.y0
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) rw.a.castToSuppLibClass(WebViewProviderBoundaryInterface.class, this.f72512a.createWebView(webView));
    }

    @Override // l6.y0
    public DropDataContentProviderBoundaryInterface getDropDataProvider() {
        return (DropDataContentProviderBoundaryInterface) rw.a.castToSuppLibClass(DropDataContentProviderBoundaryInterface.class, this.f72512a.getDropDataProvider());
    }

    @Override // l6.y0
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) rw.a.castToSuppLibClass(ProfileStoreBoundaryInterface.class, this.f72512a.getProfileStore());
    }

    @Override // l6.y0
    public ProxyControllerBoundaryInterface getProxyController() {
        return (ProxyControllerBoundaryInterface) rw.a.castToSuppLibClass(ProxyControllerBoundaryInterface.class, this.f72512a.getProxyController());
    }

    @Override // l6.y0
    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        return (ServiceWorkerControllerBoundaryInterface) rw.a.castToSuppLibClass(ServiceWorkerControllerBoundaryInterface.class, this.f72512a.getServiceWorkerController());
    }

    @Override // l6.y0
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) rw.a.castToSuppLibClass(StaticsBoundaryInterface.class, this.f72512a.getStatics());
    }

    @Override // l6.y0
    public TracingControllerBoundaryInterface getTracingController() {
        return (TracingControllerBoundaryInterface) rw.a.castToSuppLibClass(TracingControllerBoundaryInterface.class, this.f72512a.getTracingController());
    }

    @Override // l6.y0
    public String[] getWebViewFeatures() {
        return this.f72512a.getSupportedFeatures();
    }

    @Override // l6.y0
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) rw.a.castToSuppLibClass(WebkitToCompatConverterBoundaryInterface.class, this.f72512a.getWebkitToCompatConverter());
    }
}
