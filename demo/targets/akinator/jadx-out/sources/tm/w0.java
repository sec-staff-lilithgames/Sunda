package tm;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Base64;
import com.amazon.device.ads.MraidExpandCommand;
import com.amazon.device.ads.MraidResizeCommand;
import com.amazon.device.ads.MraidUseCustomCloseCommand;
import com.ironsource.C3191e4;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.Locale;
import java.util.Map;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f87140a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f87141b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f87142c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f87143d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f87144e;

    /* renamed from: f, reason: collision with root package name */
    public x f87145f;

    public w0(Context context, t0 t0Var) {
        this.f87140a = t0Var;
        s0 s0Var = new s0(context);
        this.f87141b = s0Var;
        s0Var.setWebViewClient(new v0(this));
        s0Var.setListener(new u0(this));
        this.f87143d = false;
        this.f87144e = false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(String str, Map map) {
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1886160473:
                if (str.equals("playVideo")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1700226527:
                if (str.equals("openPrivacySheet")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1289167206:
                if (str.equals(MraidExpandCommand.NAME)) {
                    c10 = 2;
                    break;
                }
                break;
            case -1097519099:
                if (str.equals(C3191e4.h.f36505r)) {
                    c10 = 3;
                    break;
                }
                break;
            case -1041060124:
                if (str.equals("noFill")) {
                    c10 = 4;
                    break;
                }
                break;
            case -934437708:
                if (str.equals(MraidResizeCommand.NAME)) {
                    c10 = 5;
                    break;
                }
                break;
            case -733616544:
                if (str.equals("createCalendarEvent")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3417674:
                if (str.equals("open")) {
                    c10 = 7;
                    break;
                }
                break;
            case 94756344:
                if (str.equals("close")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 133423073:
                if (str.equals(MRAIDPresenter.SET_ORIENTATION_PROPERTIES)) {
                    c10 = '\t';
                    break;
                }
                break;
            case 459238621:
                if (str.equals("storePicture")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1614272768:
                if (str.equals(MraidUseCustomCloseCommand.NAME)) {
                    c10 = 11;
                    break;
                }
                break;
        }
        t0 t0Var = this.f87140a;
        switch (c10) {
            case 0:
                ((k) t0Var).onPlayVideo((String) map.get("url"));
                break;
            case 1:
                String str2 = (String) map.get("data");
                if (TextUtils.isEmpty(str2)) {
                    t.e("MraidWebViewController", "data is null or empty", new Object[0]);
                    break;
                } else {
                    try {
                        ((k) t0Var).onOpenPrivacySheet(new String(Base64.decode(str2, 2)));
                        break;
                    } catch (Throwable unused) {
                        t.e("MraidWebViewController", "data must be base64 encoded json", new Object[0]);
                        return;
                    }
                }
            case 2:
                t.d("MraidWebViewController", "mraid.expand is not supported", new Object[0]);
                break;
            case 3:
                ((k) t0Var).onLoaded();
                break;
            case 4:
                ((k) t0Var).onError(qm.b.noFIll("Fired noFill event from mraid.js"));
                break;
            case 5:
                t.d("MraidWebViewController", "mraid.resize is not supported", new Object[0]);
                break;
            case 6:
                ((k) t0Var).onCalendarEvent((String) map.get("eventJSON"));
                break;
            case 7:
                String str3 = (String) map.get("url");
                if (!TextUtils.isEmpty(str3)) {
                    c(str3);
                    break;
                } else {
                    t.e("MraidWebViewController", "url is null or empty", new Object[0]);
                    break;
                }
            case '\b':
                ((k) t0Var).onClose();
                break;
            case '\t':
                x xVar = new x(Boolean.parseBoolean((String) map.get("allowOrientationChange")), x.forceOrientationFromString((String) map.get("forceOrientation")));
                this.f87145f = xVar;
                ((k) t0Var).onOrientation(xVar);
                break;
            case '\n':
                ((k) t0Var).onStorePicture((String) map.get("url"));
                break;
            case 11:
                boolean z10 = Boolean.parseBoolean((String) map.get(MraidUseCustomCloseCommand.NAME));
                if (this.f87143d != z10) {
                    this.f87143d = z10;
                    t0Var.onUseCustomClose(z10);
                    break;
                }
                break;
        }
    }

    public void applyClick(int i10, int i11) {
        b(o2.i(i10, i11, "(function click(x, y) {var ev = new MouseEvent('click', {    'view': window,    'bubbles': true,    'cancelable': true,    'screenX': x,    'screenY': y});var el = document.elementFromPoint(x, y);if (el !== null) {      el.dispatchEvent(ev); }})(", ", ", ")"));
    }

    public void applyLogLevel(um.c0 c0Var) {
        if (c0Var == um.c0.debug) {
            b("mraid.logLevel = mraid.LogLevelEnum.DEBUG;");
            return;
        }
        if (c0Var == um.c0.info) {
            b("mraid.logLevel = mraid.LogLevelEnum.INFO;");
            return;
        }
        if (c0Var == um.c0.warning) {
            b("mraid.logLevel = mraid.LogLevelEnum.WARNING;");
        } else if (c0Var == um.c0.error) {
            b("mraid.logLevel = mraid.LogLevelEnum.ERROR;");
        } else if (c0Var == um.c0.none) {
            b("mraid.logLevel = mraid.LogLevelEnum.NONE;");
        }
    }

    public void applyPlacement(y yVar) {
        b("mraid.setPlacementType('" + yVar.toString().toLowerCase(Locale.US) + "');");
    }

    public void applyScreenMetrics(a0 a0Var) {
        Rect rect = a0Var.f86975c;
        Rect rect2 = a0Var.f86977e;
        StringBuilder sb2 = new StringBuilder("mraid.setScreenSize(");
        sb2.append(rect.width());
        sb2.append(",");
        sb2.append(rect.height());
        sb2.append(");mraid.setMaxSize(");
        sb2.append(rect2.width());
        sb2.append(",");
        sb2.append(rect2.height());
        sb2.append(");mraid.setCurrentPosition(");
        Rect rect3 = a0Var.f86979g;
        sb2.append(um.h0.stringifyRect(rect3));
        sb2.append(");mraid.setDefaultPosition(");
        sb2.append(um.h0.stringifyRect(a0Var.f86981i));
        sb2.append(");mraid.fireSizeChangeEvent(");
        sb2.append(um.h0.stringifySize(rect3));
        sb2.append(");");
        b(sb2.toString());
    }

    public void applyState(n0 n0Var) {
        b("mraid.fireStateChangeEvent('" + n0Var.toJsString() + "');");
    }

    public void applySupportedServices(v vVar) {
        b("mraid.setSupports(mraid.SUPPORTED_FEATURES.CALENDAR, " + vVar.isCalendarFeatureAvailable() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.INLINEVIDEO, " + vVar.isInlineVideoFeatureAvailable() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.SMS, " + vVar.isSmsFeatureAvailable() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.STOREPICTURE, " + vVar.isStorePictureFeatureAvailable() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.TEL, " + vVar.isTelFeatureAvailable() + ");");
    }

    public void applyViewable(boolean z10) {
        b("mraid.fireViewableChangeEvent(" + z10 + ");");
    }

    public final void b(String str) {
        this.f87141b.injectJs(str);
    }

    public final void c(String str) {
        s0 s0Var = this.f87141b;
        if (!s0Var.wasClicked()) {
            t.d("MraidWebViewController", "Can't open url because webView wasn't clicked", new Object[0]);
        } else {
            ((k) this.f87140a).onOpen(str);
            s0Var.resetClicked();
        }
    }

    public void destroy() {
        s0 webView = getWebView();
        um.h0.removeFromParent(webView);
        webView.destroy();
    }

    public x getLastOrientationProperties() {
        return this.f87145f;
    }

    public s0 getWebView() {
        return this.f87141b;
    }

    public boolean isReceivedJsError() {
        return this.f87144e;
    }

    public boolean isUseCustomClose() {
        return this.f87143d;
    }

    public boolean isViewable() {
        return this.f87141b.isViewable();
    }

    public void load(String str) {
        this.f87142c = false;
        getWebView().loadUrl(str);
    }

    public void notifyReady() {
        b("mraid.fireReadyEvent();");
    }

    public void reset() {
        getWebView().reset();
    }

    public void load(String str, String str2, String str3, String str4) {
        this.f87142c = false;
        getWebView().loadDataWithBaseURL(str, str2, str3, str4, null);
    }
}
