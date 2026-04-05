package l6;

import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.WebStorage;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a0 implements k6.b {

    /* renamed from: a, reason: collision with root package name */
    public final ProfileBoundaryInterface f72436a;

    public a0(ProfileBoundaryInterface profileBoundaryInterface) {
        this.f72436a = profileBoundaryInterface;
    }

    @Override // k6.b
    public CookieManager getCookieManager() throws IllegalStateException {
        if (t0.E.isSupportedByWebView()) {
            return this.f72436a.getCookieManager();
        }
        throw t0.getUnsupportedOperationException();
    }

    @Override // k6.b
    public GeolocationPermissions getGeolocationPermissions() throws IllegalStateException {
        if (t0.E.isSupportedByWebView()) {
            return this.f72436a.getGeoLocationPermissions();
        }
        throw t0.getUnsupportedOperationException();
    }

    @Override // k6.b
    public String getName() {
        if (t0.E.isSupportedByWebView()) {
            return this.f72436a.getName();
        }
        throw t0.getUnsupportedOperationException();
    }

    @Override // k6.b
    public ServiceWorkerController getServiceWorkerController() throws IllegalStateException {
        if (t0.E.isSupportedByWebView()) {
            return this.f72436a.getServiceWorkerController();
        }
        throw t0.getUnsupportedOperationException();
    }

    @Override // k6.b
    public WebStorage getWebStorage() throws IllegalStateException {
        if (t0.E.isSupportedByWebView()) {
            return this.f72436a.getWebStorage();
        }
        throw t0.getUnsupportedOperationException();
    }
}
