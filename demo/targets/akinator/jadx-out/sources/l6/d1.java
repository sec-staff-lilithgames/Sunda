package l6;

import android.webkit.WebViewRenderProcess;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class d1 extends k6.y {

    /* renamed from: c, reason: collision with root package name */
    public static final WeakHashMap f72450c = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final WebViewRendererBoundaryInterface f72451a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f72452b;

    public d1(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        this.f72451a = webViewRendererBoundaryInterface;
    }

    public static d1 forFrameworkObject(WebViewRenderProcess webViewRenderProcess) {
        WeakHashMap weakHashMap = f72450c;
        d1 d1Var = (d1) weakHashMap.get(webViewRenderProcess);
        if (d1Var != null) {
            return d1Var;
        }
        d1 d1Var2 = new d1(webViewRenderProcess);
        weakHashMap.put(webViewRenderProcess, d1Var2);
        return d1Var2;
    }

    public static d1 forInvocationHandler(InvocationHandler invocationHandler) {
        WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) rw.a.castToSuppLibClass(WebViewRendererBoundaryInterface.class, invocationHandler);
        return (d1) webViewRendererBoundaryInterface.getOrCreatePeer(new com.vungle.ads.internal.session.a(webViewRendererBoundaryInterface, 3));
    }

    @Override // k6.y
    public boolean terminate() {
        h hVar = t0.f72502x;
        if (hVar.isSupportedByFramework()) {
            WebViewRenderProcess webViewRenderProcess = (WebViewRenderProcess) this.f72452b.get();
            return webViewRenderProcess != null && s.terminate(webViewRenderProcess);
        }
        if (hVar.isSupportedByWebView()) {
            return this.f72451a.terminate();
        }
        throw t0.getUnsupportedOperationException();
    }

    public d1(WebViewRenderProcess webViewRenderProcess) {
        this.f72452b = new WeakReference(webViewRenderProcess);
    }
}
