package l6;

import android.webkit.WebResourceError;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class o0 extends k6.n {

    /* renamed from: a, reason: collision with root package name */
    public WebResourceError f72473a;

    /* renamed from: b, reason: collision with root package name */
    public WebResourceErrorBoundaryInterface f72474b;

    public o0(InvocationHandler invocationHandler) {
        this.f72474b = (WebResourceErrorBoundaryInterface) rw.a.castToSuppLibClass(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    @Override // k6.n
    public CharSequence getDescription() {
        b bVar = t0.f72488j;
        if (bVar.isSupportedByFramework()) {
            if (this.f72473a == null) {
                this.f72473a = w0.getCompatConverter().convertWebResourceError(Proxy.getInvocationHandler(this.f72474b));
            }
            return n.getDescription(this.f72473a);
        }
        if (!bVar.isSupportedByWebView()) {
            throw t0.getUnsupportedOperationException();
        }
        if (this.f72474b == null) {
            this.f72474b = (WebResourceErrorBoundaryInterface) rw.a.castToSuppLibClass(WebResourceErrorBoundaryInterface.class, w0.getCompatConverter().convertWebResourceError(this.f72473a));
        }
        return this.f72474b.getDescription();
    }

    @Override // k6.n
    public int getErrorCode() {
        b bVar = t0.f72489k;
        if (bVar.isSupportedByFramework()) {
            if (this.f72473a == null) {
                this.f72473a = w0.getCompatConverter().convertWebResourceError(Proxy.getInvocationHandler(this.f72474b));
            }
            return n.getErrorCode(this.f72473a);
        }
        if (!bVar.isSupportedByWebView()) {
            throw t0.getUnsupportedOperationException();
        }
        if (this.f72474b == null) {
            this.f72474b = (WebResourceErrorBoundaryInterface) rw.a.castToSuppLibClass(WebResourceErrorBoundaryInterface.class, w0.getCompatConverter().convertWebResourceError(this.f72473a));
        }
        return this.f72474b.getErrorCode();
    }

    public o0(WebResourceError webResourceError) {
        this.f72473a = webResourceError;
    }
}
