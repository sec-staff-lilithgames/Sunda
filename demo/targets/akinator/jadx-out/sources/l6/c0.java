package l6;

import android.webkit.SafeBrowsingResponse;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class c0 extends k6.c {

    /* renamed from: a, reason: collision with root package name */
    public SafeBrowsingResponse f72446a;

    /* renamed from: b, reason: collision with root package name */
    public SafeBrowsingResponseBoundaryInterface f72447b;

    public c0(InvocationHandler invocationHandler) {
        this.f72447b = (SafeBrowsingResponseBoundaryInterface) rw.a.castToSuppLibClass(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    public final SafeBrowsingResponseBoundaryInterface a() {
        if (this.f72447b == null) {
            this.f72447b = (SafeBrowsingResponseBoundaryInterface) rw.a.castToSuppLibClass(SafeBrowsingResponseBoundaryInterface.class, w0.getCompatConverter().convertSafeBrowsingResponse(this.f72446a));
        }
        return this.f72447b;
    }

    public final SafeBrowsingResponse b() {
        if (this.f72446a == null) {
            this.f72446a = w0.getCompatConverter().convertSafeBrowsingResponse(Proxy.getInvocationHandler(this.f72447b));
        }
        return this.f72446a;
    }

    @Override // k6.c
    public void backToSafety(boolean z10) {
        f fVar = t0.f72490l;
        if (fVar.isSupportedByFramework()) {
            q.backToSafety(b(), z10);
        } else {
            if (!fVar.isSupportedByWebView()) {
                throw t0.getUnsupportedOperationException();
            }
            a().backToSafety(z10);
        }
    }

    @Override // k6.c
    public void proceed(boolean z10) {
        f fVar = t0.f72491m;
        if (fVar.isSupportedByFramework()) {
            q.proceed(b(), z10);
        } else {
            if (!fVar.isSupportedByWebView()) {
                throw t0.getUnsupportedOperationException();
            }
            a().proceed(z10);
        }
    }

    @Override // k6.c
    public void showInterstitial(boolean z10) {
        f fVar = t0.f72492n;
        if (fVar.isSupportedByFramework()) {
            q.showInterstitial(b(), z10);
        } else {
            if (!fVar.isSupportedByWebView()) {
                throw t0.getUnsupportedOperationException();
            }
            a().showInterstitial(z10);
        }
    }

    public c0(SafeBrowsingResponse safeBrowsingResponse) {
        this.f72446a = safeBrowsingResponse;
    }
}
