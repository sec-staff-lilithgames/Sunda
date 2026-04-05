package l6;

import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class b1 implements WebViewRendererClientBoundaryInterface {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f72443e = {"WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"};

    /* renamed from: b, reason: collision with root package name */
    public final Executor f72444b;

    /* renamed from: c, reason: collision with root package name */
    public final k6.z f72445c;

    public b1(Executor executor, k6.z zVar) {
        this.f72444b = executor;
        this.f72445c = zVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return f72443e;
    }

    public k6.z getWebViewRenderProcessClient() {
        return this.f72445c;
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererResponsive(WebView webView, InvocationHandler invocationHandler) {
        d1 d1VarForInvocationHandler = d1.forInvocationHandler(invocationHandler);
        k6.z zVar = this.f72445c;
        Executor executor = this.f72444b;
        if (executor == null) {
            zVar.onRenderProcessResponsive(webView, d1VarForInvocationHandler);
        } else {
            executor.execute(new a1(zVar, webView, d1VarForInvocationHandler, 0));
        }
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererUnresponsive(WebView webView, InvocationHandler invocationHandler) {
        d1 d1VarForInvocationHandler = d1.forInvocationHandler(invocationHandler);
        k6.z zVar = this.f72445c;
        Executor executor = this.f72444b;
        if (executor == null) {
            zVar.onRenderProcessUnresponsive(webView, d1VarForInvocationHandler);
        } else {
            executor.execute(new a1(zVar, webView, d1VarForInvocationHandler, 1));
        }
    }
}
