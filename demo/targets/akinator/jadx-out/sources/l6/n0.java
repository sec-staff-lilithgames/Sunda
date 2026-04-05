package l6;

import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import k6.m;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class n0 extends k6.m {

    /* renamed from: a, reason: collision with root package name */
    public WebMessagePort f72471a;

    /* renamed from: b, reason: collision with root package name */
    public WebMessagePortBoundaryInterface f72472b;

    public n0(WebMessagePort webMessagePort) {
        this.f72471a = webMessagePort;
    }

    public static WebMessage compatToFrameworkMessage(k6.l lVar) {
        return n.createWebMessage(lVar);
    }

    public static WebMessagePort[] compatToPorts(k6.m[] mVarArr) {
        if (mVarArr == null) {
            return null;
        }
        int length = mVarArr.length;
        WebMessagePort[] webMessagePortArr = new WebMessagePort[length];
        for (int i10 = 0; i10 < length; i10++) {
            webMessagePortArr[i10] = mVarArr[i10].getFrameworkPort();
        }
        return webMessagePortArr;
    }

    public static k6.l frameworkMessageToCompat(WebMessage webMessage) {
        return n.createWebMessageCompat(webMessage);
    }

    public static k6.m[] portsToCompat(WebMessagePort[] webMessagePortArr) {
        if (webMessagePortArr == null) {
            return null;
        }
        k6.m[] mVarArr = new k6.m[webMessagePortArr.length];
        for (int i10 = 0; i10 < webMessagePortArr.length; i10++) {
            mVarArr[i10] = new n0(webMessagePortArr[i10]);
        }
        return mVarArr;
    }

    public final WebMessagePortBoundaryInterface a() {
        if (this.f72472b == null) {
            this.f72472b = (WebMessagePortBoundaryInterface) rw.a.castToSuppLibClass(WebMessagePortBoundaryInterface.class, w0.getCompatConverter().convertWebMessagePort(this.f72471a));
        }
        return this.f72472b;
    }

    public final WebMessagePort b() {
        if (this.f72471a == null) {
            this.f72471a = w0.getCompatConverter().convertWebMessagePort(Proxy.getInvocationHandler(this.f72472b));
        }
        return this.f72471a;
    }

    @Override // k6.m
    public void close() {
        b bVar = t0.f72494p;
        if (bVar.isSupportedByFramework()) {
            n.close(b());
        } else {
            if (!bVar.isSupportedByWebView()) {
                throw t0.getUnsupportedOperationException();
            }
            a().close();
        }
    }

    @Override // k6.m
    public WebMessagePort getFrameworkPort() {
        return b();
    }

    @Override // k6.m
    public InvocationHandler getInvocationHandler() {
        return Proxy.getInvocationHandler(a());
    }

    @Override // k6.m
    public void postMessage(k6.l lVar) {
        b bVar = t0.f72493o;
        if (bVar.isSupportedByFramework() && lVar.getType() == 0) {
            n.postMessage(b(), compatToFrameworkMessage(lVar));
        } else {
            if (!bVar.isSupportedByWebView() || !j0.isMessagePayloadTypeSupportedByWebView(lVar.getType())) {
                throw t0.getUnsupportedOperationException();
            }
            a().postMessage(rw.a.createInvocationHandlerFor(new j0(lVar)));
        }
    }

    @Override // k6.m
    public void setWebMessageCallback(m.a aVar) {
        b bVar = t0.f72496r;
        if (bVar.isSupportedByWebView()) {
            a().setWebMessageCallback(rw.a.createInvocationHandlerFor(new k0(aVar)));
        } else {
            if (!bVar.isSupportedByFramework()) {
                throw t0.getUnsupportedOperationException();
            }
            n.setWebMessageCallback(b(), aVar);
        }
    }

    public n0(InvocationHandler invocationHandler) {
        this.f72472b = (WebMessagePortBoundaryInterface) rw.a.castToSuppLibClass(WebMessagePortBoundaryInterface.class, invocationHandler);
    }

    @Override // k6.m
    public void setWebMessageCallback(Handler handler, m.a aVar) {
        b bVar = t0.f72497s;
        if (bVar.isSupportedByWebView()) {
            a().setWebMessageCallback(rw.a.createInvocationHandlerFor(new k0(aVar)), handler);
        } else {
            if (bVar.isSupportedByFramework()) {
                n.setWebMessageCallback(b(), aVar, handler);
                return;
            }
            throw t0.getUnsupportedOperationException();
        }
    }
}
