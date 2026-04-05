package l6;

import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class y extends k6.a {

    /* renamed from: a, reason: collision with root package name */
    public final JsReplyProxyBoundaryInterface f72511a;

    public y(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f72511a = jsReplyProxyBoundaryInterface;
    }

    public static y forInvocationHandler(InvocationHandler invocationHandler) {
        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) rw.a.castToSuppLibClass(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (y) jsReplyProxyBoundaryInterface.getOrCreatePeer(new com.vungle.ads.internal.session.a(jsReplyProxyBoundaryInterface, 2));
    }

    @Override // k6.a
    public void postMessage(String str) {
        if (!t0.A.isSupportedByWebView()) {
            throw t0.getUnsupportedOperationException();
        }
        this.f72511a.postMessage(str);
    }

    @Override // k6.a
    public void postMessage(byte[] bArr) {
        Objects.requireNonNull(bArr, "ArrayBuffer must be non-null");
        if (t0.f72495q.isSupportedByWebView()) {
            this.f72511a.postMessageWithPayload(rw.a.createInvocationHandlerFor(new m0(bArr)));
            return;
        }
        throw t0.getUnsupportedOperationException();
    }
}
