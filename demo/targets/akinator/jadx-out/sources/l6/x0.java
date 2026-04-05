package l6;

import android.net.Uri;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final WebViewProviderBoundaryInterface f72510a;

    public x0(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f72510a = webViewProviderBoundaryInterface;
    }

    public d0 addDocumentStartJavaScript(String str, String[] strArr) {
        return d0.toScriptHandler(this.f72510a.addDocumentStartJavaScript(str, strArr));
    }

    public void addWebMessageListener(String str, String[] strArr, k6.u uVar) {
        this.f72510a.addWebMessageListener(str, strArr, rw.a.createInvocationHandlerFor(new l0(uVar)));
    }

    public k6.m[] createWebMessageChannel() {
        InvocationHandler[] invocationHandlerArrCreateWebMessageChannel = this.f72510a.createWebMessageChannel();
        k6.m[] mVarArr = new k6.m[invocationHandlerArrCreateWebMessageChannel.length];
        for (int i10 = 0; i10 < invocationHandlerArrCreateWebMessageChannel.length; i10++) {
            mVarArr[i10] = new n0(invocationHandlerArrCreateWebMessageChannel[i10]);
        }
        return mVarArr;
    }

    public k6.b getProfile() {
        return new a0((ProfileBoundaryInterface) rw.a.castToSuppLibClass(ProfileBoundaryInterface.class, this.f72510a.getProfile()));
    }

    public WebChromeClient getWebChromeClient() {
        return this.f72510a.getWebChromeClient();
    }

    public WebViewClient getWebViewClient() {
        return this.f72510a.getWebViewClient();
    }

    public k6.y getWebViewRenderProcess() {
        return d1.forInvocationHandler(this.f72510a.getWebViewRenderer());
    }

    public k6.z getWebViewRenderProcessClient() {
        InvocationHandler webViewRendererClient = this.f72510a.getWebViewRendererClient();
        if (webViewRendererClient == null) {
            return null;
        }
        return ((b1) rw.a.getDelegateFromInvocationHandler(webViewRendererClient)).getWebViewRenderProcessClient();
    }

    public void insertVisualStateCallback(long j10, k6.t tVar) {
        this.f72510a.insertVisualStateCallback(j10, rw.a.createInvocationHandlerFor(new i0(tVar)));
    }

    public boolean isAudioMuted() {
        return this.f72510a.isAudioMuted();
    }

    public void postWebMessage(k6.l lVar, Uri uri) {
        this.f72510a.postMessageToMainFrame(rw.a.createInvocationHandlerFor(new j0(lVar)), uri);
    }

    public void removeWebMessageListener(String str) {
        this.f72510a.removeWebMessageListener(str);
    }

    public void setAudioMuted(boolean z10) {
        this.f72510a.setAudioMuted(z10);
    }

    public void setProfileWithName(String str) {
        this.f72510a.setProfile(str);
    }

    public void setWebViewRenderProcessClient(Executor executor, k6.z zVar) {
        this.f72510a.setWebViewRendererClient(zVar != null ? rw.a.createInvocationHandlerFor(new b1(executor, zVar)) : null);
    }
}
