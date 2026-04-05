package tm;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.l1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import cv.BLca.YsiBvdpw;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class g extends FrameLayout {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f87037y = 0;

    /* renamed from: b, reason: collision with root package name */
    public final y f87038b;

    /* renamed from: c, reason: collision with root package name */
    public final String f87039c;

    /* renamed from: e, reason: collision with root package name */
    public final String f87040e;

    /* renamed from: f, reason: collision with root package name */
    public final String f87041f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f87042g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f87043h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f87044i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f87045j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f87046k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f87047l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f87048m;

    /* renamed from: n, reason: collision with root package name */
    public final GestureDetector f87049n;

    /* renamed from: o, reason: collision with root package name */
    public final a0 f87050o;

    /* renamed from: p, reason: collision with root package name */
    public final z0 f87051p;

    /* renamed from: q, reason: collision with root package name */
    public final v f87052q;

    /* renamed from: r, reason: collision with root package name */
    public final l1 f87053r;

    /* renamed from: s, reason: collision with root package name */
    public final zi.d f87054s;

    /* renamed from: t, reason: collision with root package name */
    public final w0 f87055t;

    /* renamed from: u, reason: collision with root package name */
    public final i f87056u;

    /* renamed from: v, reason: collision with root package name */
    public w0 f87057v;

    /* renamed from: w, reason: collision with root package name */
    public n0 f87058w;

    /* renamed from: x, reason: collision with root package name */
    public Runnable f87059x;

    public g(Context context, y yVar, String str, String str2, List<String> list, String str3, i iVar) {
        super(context);
        this.f87054s = new zi.d();
        this.f87038b = yVar;
        this.f87039c = str;
        this.f87041f = str2;
        this.f87040e = str3;
        this.f87056u = iVar;
        this.f87042g = new AtomicBoolean(false);
        this.f87043h = new AtomicBoolean(false);
        this.f87044i = new AtomicBoolean(false);
        this.f87045j = new AtomicBoolean(false);
        this.f87046k = new AtomicBoolean(false);
        this.f87047l = new AtomicBoolean(false);
        this.f87048m = new AtomicBoolean(false);
        this.f87049n = new GestureDetector(context, new h());
        this.f87050o = new a0(context);
        this.f87051p = new z0();
        v vVar = new v(context, list);
        this.f87052q = vVar;
        this.f87053r = new l1(vVar);
        w0 w0Var = new w0(context, new l(this));
        this.f87055t = w0Var;
        addView(w0Var.getWebView(), new FrameLayout.LayoutParams(-1, -1, 17));
        this.f87058w = n0.f87102b;
    }

    private w0 getCurrentMraidWebViewController() {
        w0 w0Var = this.f87057v;
        return w0Var != null ? w0Var : this.f87055t;
    }

    public final void a(int i10, int i11, w0 w0Var, Runnable runnable) {
        if (isRedirectProcessed()) {
            return;
        }
        s0 webView = w0Var.getWebView();
        webView.dispatchTouchEvent(um.h0.obtainMotionEvent(0, i10, i11));
        webView.dispatchTouchEvent(um.h0.obtainMotionEvent(1, i10, i11));
        this.f87059x = runnable;
        postDelayed(runnable, 150L);
    }

    public final void b(View view) {
        Context context = getContext();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        a0 a0Var = this.f87050o;
        Rect rect = a0Var.f86974b;
        if (rect.width() != i10 || rect.height() != i11) {
            rect.set(0, 0, i10, i11);
            a0Var.a(rect, a0Var.f86975c);
        }
        int[] iArr = new int[2];
        View viewObtainRootView = d0.obtainRootView(context, this);
        viewObtainRootView.getLocationOnScreen(iArr);
        a0Var.b(iArr[0], iArr[1], viewObtainRootView.getWidth(), a0Var.f86976d, a0Var.f86977e, viewObtainRootView.getHeight());
        getLocationOnScreen(iArr);
        a0Var.b(iArr[0], iArr[1], getWidth(), a0Var.f86980h, a0Var.f86981i, getHeight());
        view.getLocationOnScreen(iArr);
        a0Var.b(iArr[0], iArr[1], view.getWidth(), a0Var.f86978f, a0Var.f86979g, view.getHeight());
        this.f87055t.applyScreenMetrics(a0Var);
        w0 w0Var = this.f87057v;
        if (w0Var != null) {
            w0Var.applyScreenMetrics(a0Var);
        }
    }

    public final void c(String str, ir.d dVar) {
        boolean zIsStorePictureFeatureAvailable = true;
        this.f87046k.set(true);
        this.f87047l.set(false);
        this.f87048m.set(true);
        removeCallbacks(this.f87059x);
        v vVar = (v) this.f87053r.f7184a;
        if (str != null) {
            if (str.startsWith("sms")) {
                zIsStorePictureFeatureAvailable = vVar.isSmsFeatureAvailable();
            } else if (str.startsWith("tel")) {
                zIsStorePictureFeatureAvailable = vVar.isTelFeatureAvailable();
            } else if (str.startsWith("calendar")) {
                zIsStorePictureFeatureAvailable = vVar.isCalendarFeatureAvailable();
            } else if (str.startsWith("storePicture")) {
                zIsStorePictureFeatureAvailable = vVar.isStorePictureFeatureAvailable();
            }
        }
        if (zIsStorePictureFeatureAvailable) {
            dVar.execute(str);
        }
    }

    public void close() {
        setViewState(n0.f87106g);
    }

    public void closeExpanded() {
        w0 w0Var = this.f87057v;
        if (w0Var != null) {
            w0Var.destroy();
            this.f87057v = null;
        } else {
            addView(this.f87055t.getWebView());
        }
        setViewState(n0.f87103c);
    }

    public void closeResized() {
        addView(this.f87055t.getWebView());
        setViewState(n0.f87103c);
    }

    public void destroy() {
        this.f87051p.cancelLastRequest();
        this.f87055t.destroy();
        w0 w0Var = this.f87057v;
        if (w0Var != null) {
            w0Var.destroy();
        }
    }

    public String getBaseUrl() {
        return this.f87039c;
    }

    public x getLastOrientationProperties() {
        return this.f87055t.getLastOrientationProperties();
    }

    public n0 getMraidViewState() {
        return this.f87058w;
    }

    public WebView getWebView() {
        return this.f87055t.getWebView();
    }

    public void handleRedirect(int i10, int i11, int i12, int i13) {
        w0 currentMraidWebViewController = getCurrentMraidWebViewController();
        if (this.f87047l.compareAndSet(false, true)) {
            this.f87048m.set(false);
            d dVar = new d(this, i10, i11, i12, i13, currentMraidWebViewController);
            Point defaultClickPoint = um.h0.getDefaultClickPoint(i10, i11);
            a(defaultClickPoint.x, defaultClickPoint.y, currentMraidWebViewController, dVar);
        }
    }

    public void handleRedirectScreen(int i10, int i11) {
        Rect rect = this.f87050o.f86975c;
        handleRedirect(rect.width(), rect.height(), i10, i11);
    }

    public void handleRedirectView() {
        s0 webView = getCurrentMraidWebViewController().getWebView();
        handleRedirect(webView.getMeasuredWidth(), webView.getMeasuredHeight(), 17, 17);
    }

    public boolean isInterstitial() {
        return this.f87038b == y.f87151c;
    }

    public boolean isLoaded() {
        return this.f87042g.get();
    }

    public boolean isOpenNotified() {
        return this.f87046k.get();
    }

    public boolean isReceivedJsError() {
        return this.f87055t.isReceivedJsError();
    }

    public boolean isRedirectProcessed() {
        return this.f87048m.get();
    }

    public boolean isUseCustomClose() {
        return this.f87055t.isUseCustomClose();
    }

    public void load(String str) {
        if (str != null) {
            String strL = e3.g.l("<script type='application/javascript'>", d0.c(), "</script>", rm.b.obtainJs(), d0.processRawHtml(str));
            w0 w0Var = this.f87055t;
            w0Var.load(this.f87039c, strL, "text/html", C.UTF8_NAME);
            w0Var.applyLogLevel(t.getLoggingLevel());
            return;
        }
        qm.b bVarNoRequiredArguments = qm.b.noRequiredArguments("Html data are null");
        boolean zIsLoaded = isLoaded();
        i iVar = this.f87056u;
        if (!zIsLoaded) {
            iVar.onMraidAdViewLoadFailed(this, bVarNoRequiredArguments);
        } else if (this.f87044i.get()) {
            iVar.onMraidAdViewShowFailed(this, bVarNoRequiredArguments);
        } else {
            iVar.onMraidAdViewExpired(this, bVarNoRequiredArguments);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f87049n.onTouchEvent(motionEvent)) {
            motionEvent.setAction(3);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setViewState(n0 n0Var) {
        this.f87058w = n0Var;
        this.f87055t.applyState(n0Var);
        w0 w0Var = this.f87057v;
        if (w0Var != null) {
            w0Var.applyState(n0Var);
        }
        if (n0Var != n0.f87106g) {
            updateMetrics(null);
        }
    }

    public void show() {
        if (this.f87044i.compareAndSet(false, true) && isLoaded() && this.f87043h.compareAndSet(false, true)) {
            this.f87055t.notifyReady();
        }
    }

    public void updateMetrics(Runnable runnable) {
        w0 w0Var = this.f87057v;
        s0 webView = w0Var != null ? w0Var.getWebView() : this.f87055t.getWebView();
        this.f87051p.wait(this, webView).start(new e(this, webView, runnable));
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f87060a;

        /* renamed from: b, reason: collision with root package name */
        public final y f87061b;

        /* renamed from: c, reason: collision with root package name */
        public final i f87062c;

        /* renamed from: d, reason: collision with root package name */
        public String f87063d = YsiBvdpw.IqjSlEoZ;

        /* renamed from: e, reason: collision with root package name */
        public List f87064e;

        /* renamed from: f, reason: collision with root package name */
        public String f87065f;

        /* renamed from: g, reason: collision with root package name */
        public String f87066g;

        public g build() {
            return new g(this.f87060a, this.f87061b, this.f87063d, this.f87066g, this.f87064e, this.f87065f, this.f87062c);
        }

        public a setAllowedNativeFeatures(String[] strArr) {
            this.f87064e = strArr != null ? Arrays.asList(strArr) : null;
            return this;
        }

        public a setBaseUrl(String str) {
            this.f87063d = str;
            return this;
        }

        public a setPageFinishedScript(String str) {
            this.f87065f = str;
            return this;
        }

        public a setProductLink(String str) {
            this.f87066g = str;
            return this;
        }

        public a(Context context, y yVar, i iVar) {
            this.f87060a = context;
            this.f87061b = yVar;
            this.f87062c = iVar;
        }

        public a setAllowedNativeFeatures(List<String> list) {
            this.f87064e = list;
            return this;
        }
    }
}
