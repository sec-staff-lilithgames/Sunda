package l6;

import android.net.Uri;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class l0 implements WebMessageListenerBoundaryInterface {

    /* renamed from: b, reason: collision with root package name */
    public final k6.u f72467b;

    public l0(k6.u uVar) {
        this.f72467b = uVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z10, InvocationHandler invocationHandler2) {
        k6.l lVarWebMessageCompatFromBoundaryInterface = j0.webMessageCompatFromBoundaryInterface((WebMessageBoundaryInterface) rw.a.castToSuppLibClass(WebMessageBoundaryInterface.class, invocationHandler));
        if (lVarWebMessageCompatFromBoundaryInterface != null) {
            this.f72467b.onPostMessage(webView, lVarWebMessageCompatFromBoundaryInterface, uri, z10, y.forInvocationHandler(invocationHandler2));
        }
    }
}
