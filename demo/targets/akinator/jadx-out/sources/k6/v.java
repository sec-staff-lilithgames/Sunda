package k6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import l6.c1;
import l6.d1;
import l6.j0;
import l6.n0;
import l6.t0;
import l6.w0;
import l6.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f70630a = Uri.parse("*");

    /* renamed from: b, reason: collision with root package name */
    public static final Uri f70631b = Uri.parse("");

    public static void a(WebView webView) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, null);
                return;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        }
        Looper webViewLooper = l6.r.getWebViewLooper(webView);
        if (webViewLooper == Looper.myLooper()) {
            return;
        }
        throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + webViewLooper + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
    }

    public static d addDocumentStartJavaScript(WebView webView, String str, Set<String> set) {
        if (t0.B.isSupportedByWebView()) {
            return c(webView).addDocumentStartJavaScript(str, (String[]) set.toArray(new String[0]));
        }
        throw t0.getUnsupportedOperationException();
    }

    public static void addWebMessageListener(WebView webView, String str, Set<String> set, u uVar) {
        if (!t0.A.isSupportedByWebView()) {
            throw t0.getUnsupportedOperationException();
        }
        c(webView).addWebMessageListener(str, (String[]) set.toArray(new String[0]), uVar);
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static x0 c(WebView webView) {
        return new x0(w0.getFactory().createWebView(webView));
    }

    public static m[] createWebMessageChannel(WebView webView) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        l6.b bVar = t0.f72497s;
        if (bVar.isSupportedByFramework()) {
            return n0.portsToCompat(l6.n.createWebMessageChannel(webView));
        }
        if (!bVar.isSupportedByWebView()) {
            throw t0.getUnsupportedOperationException();
        }
        a(webView);
        return c(webView).createWebMessageChannel();
    }

    public static PackageInfo getCurrentLoadedWebViewPackage() {
        if (Build.VERSION.SDK_INT >= 26) {
            return l6.p.getCurrentWebViewPackage();
        }
        try {
            return b();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static PackageInfo getCurrentWebViewPackage(Context context) {
        PackageInfo currentLoadedWebViewPackage = getCurrentLoadedWebViewPackage();
        if (currentLoadedWebViewPackage != null) {
            return currentLoadedWebViewPackage;
        }
        try {
            String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
            if (str != null) {
                return context.getPackageManager().getPackageInfo(str, 0);
            }
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return null;
    }

    public static b getProfile(WebView webView) {
        if (t0.E.isSupportedByWebView()) {
            return c(webView).getProfile();
        }
        throw t0.getUnsupportedOperationException();
    }

    public static Uri getSafeBrowsingPrivacyPolicyUrl() {
        l6.f fVar = t0.f72483e;
        if (fVar.isSupportedByFramework()) {
            return l6.q.getSafeBrowsingPrivacyPolicyUrl();
        }
        if (fVar.isSupportedByWebView()) {
            return w0.getFactory().getStatics().getSafeBrowsingPrivacyPolicyUrl();
        }
        throw t0.getUnsupportedOperationException();
    }

    public static String getVariationsHeader() {
        if (t0.C.isSupportedByWebView()) {
            return w0.getFactory().getStatics().getVariationsHeader();
        }
        throw t0.getUnsupportedOperationException();
    }

    public static WebChromeClient getWebChromeClient(WebView webView) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        l6.e eVar = t0.f72500v;
        if (eVar.isSupportedByFramework()) {
            return l6.p.getWebChromeClient(webView);
        }
        if (!eVar.isSupportedByWebView()) {
            throw t0.getUnsupportedOperationException();
        }
        a(webView);
        return c(webView).getWebChromeClient();
    }

    public static WebViewClient getWebViewClient(WebView webView) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        l6.e eVar = t0.f72499u;
        if (eVar.isSupportedByFramework()) {
            return l6.p.getWebViewClient(webView);
        }
        if (!eVar.isSupportedByWebView()) {
            throw t0.getUnsupportedOperationException();
        }
        a(webView);
        return c(webView).getWebViewClient();
    }

    public static y getWebViewRenderProcess(WebView webView) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        l6.h hVar = t0.f72501w;
        if (hVar.isSupportedByFramework()) {
            WebViewRenderProcess webViewRenderProcess = l6.s.getWebViewRenderProcess(webView);
            if (webViewRenderProcess != null) {
                return d1.forFrameworkObject(webViewRenderProcess);
            }
            return null;
        }
        if (!hVar.isSupportedByWebView()) {
            throw t0.getUnsupportedOperationException();
        }
        a(webView);
        return c(webView).getWebViewRenderProcess();
    }

    public static z getWebViewRenderProcessClient(WebView webView) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        l6.h hVar = t0.f72503y;
        if (!hVar.isSupportedByFramework()) {
            if (!hVar.isSupportedByWebView()) {
                throw t0.getUnsupportedOperationException();
            }
            a(webView);
            return c(webView).getWebViewRenderProcessClient();
        }
        WebViewRenderProcessClient webViewRenderProcessClient = l6.s.getWebViewRenderProcessClient(webView);
        if (webViewRenderProcessClient == null || !(webViewRenderProcessClient instanceof c1)) {
            return null;
        }
        return ((c1) webViewRenderProcessClient).getFrameworkRenderProcessClient();
    }

    public static boolean isAudioMuted(WebView webView) {
        if (t0.F.isSupportedByWebView()) {
            return c(webView).isAudioMuted();
        }
        throw t0.getUnsupportedOperationException();
    }

    public static boolean isMultiProcessEnabled() {
        if (t0.f72504z.isSupportedByWebView()) {
            return w0.getFactory().getStatics().isMultiProcessEnabled();
        }
        throw t0.getUnsupportedOperationException();
    }

    public static void postVisualStateCallback(WebView webView, long j10, t tVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        l6.b bVar = t0.f72479a;
        if (bVar.isSupportedByFramework()) {
            l6.n.postVisualStateCallback(webView, j10, tVar);
        } else {
            if (!bVar.isSupportedByWebView()) {
                throw t0.getUnsupportedOperationException();
            }
            a(webView);
            c(webView).insertVisualStateCallback(j10, tVar);
        }
    }

    public static void postWebMessage(WebView webView, l lVar, Uri uri) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (f70630a.equals(uri)) {
            uri = f70631b;
        }
        l6.b bVar = t0.f72498t;
        if (bVar.isSupportedByFramework() && lVar.getType() == 0) {
            l6.n.postWebMessage(webView, n0.compatToFrameworkMessage(lVar), uri);
        } else {
            if (!bVar.isSupportedByWebView() || !j0.isMessagePayloadTypeSupportedByWebView(lVar.getType())) {
                throw t0.getUnsupportedOperationException();
            }
            a(webView);
            c(webView).postWebMessage(lVar, uri);
        }
    }

    public static void removeWebMessageListener(WebView webView, String str) {
        if (!t0.A.isSupportedByWebView()) {
            throw t0.getUnsupportedOperationException();
        }
        c(webView).removeWebMessageListener(str);
    }

    public static void setAudioMuted(WebView webView, boolean z10) {
        if (!t0.F.isSupportedByWebView()) {
            throw t0.getUnsupportedOperationException();
        }
        c(webView).setAudioMuted(z10);
    }

    public static void setProfile(WebView webView, String str) {
        if (!t0.E.isSupportedByWebView()) {
            throw t0.getUnsupportedOperationException();
        }
        c(webView).setProfileWithName(str);
    }

    public static void setSafeBrowsingAllowlist(Set<String> set, ValueCallback<Boolean> valueCallback) {
        l6.f fVar = t0.f72482d;
        l6.f fVar2 = t0.f72481c;
        if (fVar.isSupportedByWebView()) {
            w0.getFactory().getStatics().setSafeBrowsingAllowlist(set, valueCallback);
            return;
        }
        ArrayList arrayList = new ArrayList(set);
        if (fVar2.isSupportedByFramework()) {
            l6.q.setSafeBrowsingWhitelist(arrayList, valueCallback);
        } else {
            if (!fVar2.isSupportedByWebView()) {
                throw t0.getUnsupportedOperationException();
            }
            w0.getFactory().getStatics().setSafeBrowsingWhitelist(arrayList, valueCallback);
        }
    }

    @Deprecated
    public static void setSafeBrowsingWhitelist(List<String> list, ValueCallback<Boolean> valueCallback) {
        setSafeBrowsingAllowlist(new HashSet(list), valueCallback);
    }

    public static void setWebViewRenderProcessClient(WebView webView, Executor executor, z zVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        l6.h hVar = t0.f72503y;
        if (hVar.isSupportedByFramework()) {
            l6.s.setWebViewRenderProcessClient(webView, executor, zVar);
        } else {
            if (!hVar.isSupportedByWebView()) {
                throw t0.getUnsupportedOperationException();
            }
            a(webView);
            c(webView).setWebViewRenderProcessClient(executor, zVar);
        }
    }

    public static void startSafeBrowsing(Context context, ValueCallback<Boolean> valueCallback) {
        l6.f fVar = t0.f72480b;
        if (fVar.isSupportedByFramework()) {
            l6.q.startSafeBrowsing(context, valueCallback);
        } else {
            if (!fVar.isSupportedByWebView()) {
                throw t0.getUnsupportedOperationException();
            }
            w0.getFactory().getStatics().initSafeBrowsing(context, valueCallback);
        }
    }

    public static void setWebViewRenderProcessClient(WebView webView, z zVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        l6.h hVar = t0.f72503y;
        if (hVar.isSupportedByFramework()) {
            l6.s.setWebViewRenderProcessClient(webView, zVar);
        } else {
            if (hVar.isSupportedByWebView()) {
                a(webView);
                c(webView).setWebViewRenderProcessClient(null, zVar);
                return;
            }
            throw t0.getUnsupportedOperationException();
        }
    }
}
