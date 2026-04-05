package l6;

import android.webkit.ServiceWorkerWebSettings;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Set;
import org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class e0 extends k6.f {

    /* renamed from: a, reason: collision with root package name */
    public ServiceWorkerWebSettings f72453a;

    /* renamed from: b, reason: collision with root package name */
    public ServiceWorkerWebSettingsBoundaryInterface f72454b;

    public e0(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        this.f72453a = serviceWorkerWebSettings;
    }

    public final ServiceWorkerWebSettingsBoundaryInterface a() {
        if (this.f72454b == null) {
            this.f72454b = (ServiceWorkerWebSettingsBoundaryInterface) rw.a.castToSuppLibClass(ServiceWorkerWebSettingsBoundaryInterface.class, w0.getCompatConverter().convertServiceWorkerSettings(this.f72453a));
        }
        return this.f72454b;
    }

    public final ServiceWorkerWebSettings b() {
        if (this.f72453a == null) {
            this.f72453a = w0.getCompatConverter().convertServiceWorkerSettings(Proxy.getInvocationHandler(this.f72454b));
        }
        return this.f72453a;
    }

    @Override // k6.f
    public boolean getAllowContentAccess() {
        c cVar = t0.f72485g;
        if (cVar.isSupportedByFramework()) {
            return o.getAllowContentAccess(b());
        }
        if (cVar.isSupportedByWebView()) {
            return a().getAllowContentAccess();
        }
        throw t0.getUnsupportedOperationException();
    }

    @Override // k6.f
    public boolean getAllowFileAccess() {
        c cVar = t0.f72486h;
        if (cVar.isSupportedByFramework()) {
            return o.getAllowFileAccess(b());
        }
        if (cVar.isSupportedByWebView()) {
            return a().getAllowFileAccess();
        }
        throw t0.getUnsupportedOperationException();
    }

    @Override // k6.f
    public boolean getBlockNetworkLoads() {
        c cVar = t0.f72487i;
        if (cVar.isSupportedByFramework()) {
            return o.getBlockNetworkLoads(b());
        }
        if (cVar.isSupportedByWebView()) {
            return a().getBlockNetworkLoads();
        }
        throw t0.getUnsupportedOperationException();
    }

    @Override // k6.f
    public int getCacheMode() {
        c cVar = t0.f72484f;
        if (cVar.isSupportedByFramework()) {
            return o.getCacheMode(b());
        }
        if (cVar.isSupportedByWebView()) {
            return a().getCacheMode();
        }
        throw t0.getUnsupportedOperationException();
    }

    @Override // k6.f
    public Set<String> getRequestedWithHeaderOriginAllowList() {
        if (t0.D.isSupportedByWebView()) {
            return a().getRequestedWithHeaderOriginAllowList();
        }
        throw t0.getUnsupportedOperationException();
    }

    @Override // k6.f
    public void setAllowContentAccess(boolean z10) {
        c cVar = t0.f72485g;
        if (cVar.isSupportedByFramework()) {
            o.setAllowContentAccess(b(), z10);
        } else {
            if (!cVar.isSupportedByWebView()) {
                throw t0.getUnsupportedOperationException();
            }
            a().setAllowContentAccess(z10);
        }
    }

    @Override // k6.f
    public void setAllowFileAccess(boolean z10) {
        c cVar = t0.f72486h;
        if (cVar.isSupportedByFramework()) {
            o.setAllowFileAccess(b(), z10);
        } else {
            if (!cVar.isSupportedByWebView()) {
                throw t0.getUnsupportedOperationException();
            }
            a().setAllowFileAccess(z10);
        }
    }

    @Override // k6.f
    public void setBlockNetworkLoads(boolean z10) {
        c cVar = t0.f72487i;
        if (cVar.isSupportedByFramework()) {
            o.setBlockNetworkLoads(b(), z10);
        } else {
            if (!cVar.isSupportedByWebView()) {
                throw t0.getUnsupportedOperationException();
            }
            a().setBlockNetworkLoads(z10);
        }
    }

    @Override // k6.f
    public void setCacheMode(int i10) {
        c cVar = t0.f72484f;
        if (cVar.isSupportedByFramework()) {
            o.setCacheMode(b(), i10);
        } else {
            if (!cVar.isSupportedByWebView()) {
                throw t0.getUnsupportedOperationException();
            }
            a().setCacheMode(i10);
        }
    }

    @Override // k6.f
    public void setRequestedWithHeaderOriginAllowList(Set<String> set) {
        if (!t0.D.isSupportedByWebView()) {
            throw t0.getUnsupportedOperationException();
        }
        a().setRequestedWithHeaderOriginAllowList(set);
    }

    public e0(InvocationHandler invocationHandler) {
        this.f72454b = (ServiceWorkerWebSettingsBoundaryInterface) rw.a.castToSuppLibClass(ServiceWorkerWebSettingsBoundaryInterface.class, invocationHandler);
    }
}
