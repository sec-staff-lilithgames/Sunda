package io.odeeo.sdk;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.amazon.device.ads.DtbConstants;
import com.ironsource.G5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import io.odeeo.internal.w1.c;
import io.odeeo.sdk.AdUnit;
import io.odeeo.sdk.advertisement.data.AdInfo;
import j1.o2;
import java.net.URI;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import sv.k0;
import sv.n0;
import tu.a0;
import tu.x0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l extends FrameLayout {

    /* renamed from: r, reason: collision with root package name */
    public static final a f68125r = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public io.odeeo.internal.w1.l f68126a;

    /* renamed from: b, reason: collision with root package name */
    public io.odeeo.internal.w1.k f68127b;

    /* renamed from: c, reason: collision with root package name */
    public final l f68128c;

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineScope f68129d;

    /* renamed from: e, reason: collision with root package name */
    public final float f68130e;

    /* renamed from: f, reason: collision with root package name */
    public b f68131f;

    /* renamed from: g, reason: collision with root package name */
    public int f68132g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f68133h;

    /* renamed from: i, reason: collision with root package name */
    public int f68134i;

    /* renamed from: j, reason: collision with root package name */
    public int f68135j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout.LayoutParams f68136k;

    /* renamed from: l, reason: collision with root package name */
    public c f68137l;

    /* renamed from: m, reason: collision with root package name */
    public io.odeeo.internal.w1.g f68138m;

    /* renamed from: n, reason: collision with root package name */
    public int f68139n;

    /* renamed from: o, reason: collision with root package name */
    public int f68140o;

    /* renamed from: p, reason: collision with root package name */
    public int f68141p;

    /* renamed from: q, reason: collision with root package name */
    public AdInfo f68142q;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.sdk.l$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0703a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f68143a;

            static {
                int[] iArr = new int[AdUnit.PlacementType.values().length];
                iArr[AdUnit.PlacementType.AudioIconAd.ordinal()] = 1;
                iArr[AdUnit.PlacementType.RewardedAudioIconAd.ordinal()] = 2;
                iArr[AdUnit.PlacementType.AudioBannerAd.ordinal()] = 3;
                iArr[AdUnit.PlacementType.RewardedAudioBannerAd.ordinal()] = 4;
                f68143a = iArr;
            }
        }

        public a() {
        }

        public final String debugErrorToStr(int i10) {
            if (i10 == 0) {
                return "No error";
            }
            if (i10 == 8001) {
                return "Unknown host";
            }
            if (i10 == 8006) {
                return "Load called after released";
            }
            if (i10 == 8054) {
                return "Network not available";
            }
            if (i10 == 8003) {
                return "Unknown";
            }
            if (i10 == 8004) {
                return "No ad inventory";
            }
            switch (i10) {
                case AdUnit.ERROR_STOPPED_MANUALLY /* 8010 */:
                    return "No ads";
                case AdUnit.ERROR_PAUSE_EXPIRED /* 8011 */:
                    return "No ad with right size";
                case AdUnit.ERROR_STOPPED_CLOSEBTN /* 8012 */:
                    return "Ad size not set";
                case 8013:
                    return AndroidInitializeBoldSDK.MSG_TIMEOUT;
                default:
                    return "Unknown error";
            }
        }

        public final int getLineBarHeight$odeeoSdk_release(AdUnit.PlacementType placementType) {
            e0.checkNotNullParameter(placementType, "<this>");
            int i10 = C0703a.f68143a[placementType.ordinal()];
            if (i10 == 1 || i10 == 2) {
                return 48;
            }
            if (i10 == 3 || i10 == 4) {
                return 33;
            }
            throw new tu.t();
        }

        public final int getLineBarLinesNumber$odeeoSdk_release(AdUnit.PlacementType placementType) {
            e0.checkNotNullParameter(placementType, "<this>");
            int i10 = C0703a.f68143a[placementType.ordinal()];
            if (i10 == 1 || i10 == 2) {
                return 3;
            }
            if (i10 == 3 || i10 == 4) {
                return 7;
            }
            throw new tu.t();
        }

        public final int getLineBarWidth$odeeoSdk_release(AdUnit.PlacementType placementType) {
            e0.checkNotNullParameter(placementType, "<this>");
            int i10 = C0703a.f68143a[placementType.ordinal()];
            if (i10 == 1 || i10 == 2) {
                return 48;
            }
            if (i10 == 3 || i10 == 4) {
                return 88;
            }
            throw new tu.t();
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {
        void onViewCleared(l lVar);

        void onViewClicked(l lVar);

        void onViewError(l lVar, int i10);

        void onViewLoaded(l lVar);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends WebViewClient implements View.OnTouchListener {

        /* renamed from: a, reason: collision with root package name */
        public String f68144a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f68145b;

        /* renamed from: c, reason: collision with root package name */
        public float f68146c;

        /* renamed from: d, reason: collision with root package name */
        public float f68147d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l f68148e;

        public c(l this$0) {
            e0.checkNotNullParameter(this$0, "this$0");
            this.f68148e = this$0;
            io.odeeo.internal.w1.l lVar = this$0.f68126a;
            if (lVar == null) {
                return;
            }
            lVar.setOnTouchListener(this);
        }

        public final void SetClickURL(String str) {
            this.f68144a = str;
        }

        public final int a(int i10) {
            if (i10 != -8) {
                return i10 != -2 ? -1 : 8001;
            }
            return -8;
        }

        public final void clearAd() {
            loadAd(AndroidWebViewClient.BLANK_PAGE);
        }

        public final boolean getMWebViewClicked$odeeoSdk_release() {
            return this.f68145b;
        }

        public final boolean isMovedTooFar$odeeoSdk_release(float f10, float f11) {
            return Math.abs(f10 - f11) > 5.0f;
        }

        public final void loadAd(String url) {
            e0.checkNotNullParameter(url, "url");
            if (this.f68148e.f68126a == null) {
                this.f68148e.a(AdUnit.ERROR_LOAD_AFTER_RELEASE);
                return;
            }
            this.f68145b = false;
            io.odeeo.internal.v1.k kVar = io.odeeo.internal.v1.k.f67283a;
            String strO = o2.o(w0.i.f(kVar.densityPixelsToPixels(this.f68148e.f68130e, this.f68148e.getAdWidth()), kVar.densityPixelsToPixels(this.f68148e.f68130e, this.f68148e.getAdHeight()), "<html><head><meta name='viewport' content='width=", ", height=", "'/></head><body style=\"margin: 0px;\"><img id=\"resizeImage\" src=\""), url, "\" height=100% width=100% border=0px alt=\"\" align=\"center\" /></body></html>");
            io.odeeo.internal.w1.l lVar = this.f68148e.f68126a;
            e0.checkNotNull(lVar);
            lVar.loadData(strO, "text/html; charset=UTF-8", null);
        }

        public final void loadHTML(String str) {
            if (this.f68148e.f68126a == null) {
                this.f68148e.a(AdUnit.ERROR_LOAD_AFTER_RELEASE);
                return;
            }
            io.odeeo.internal.b2.a.d("Loading ad html ", new Object[0]);
            this.f68145b = false;
            io.odeeo.internal.w1.l lVar = this.f68148e.f68126a;
            e0.checkNotNull(lVar);
            e0.checkNotNull(str);
            lVar.loadDataWithBaseURL(null, str, "text/html", C.UTF8_NAME, null);
        }

        @Override // android.webkit.WebViewClient
        public synchronized void onPageFinished(WebView webView, String str) {
            try {
                e0.checkNotNullParameter(webView, "webView");
                boolean z10 = true;
                boolean z11 = str == null || str.length() == 0 || e0.areEqual(str, AndroidWebViewClient.BLANK_PAGE);
                String companionHtml$odeeoSdk_release = this.f68148e.getAdInfo().getCompanionHtml$odeeoSdk_release();
                if (companionHtml$odeeoSdk_release != null && companionHtml$odeeoSdk_release.length() != 0) {
                    z10 = false;
                }
                if (z11 && z10) {
                    this.f68148e.hideWebView$odeeoSdk_release();
                    this.f68148e.b();
                } else {
                    this.f68148e.showWebView$odeeoSdk_release();
                    this.f68148e.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // android.webkit.WebViewClient
        public synchronized void onReceivedError(WebView webView, int i10, String description, String failingUrl) {
            e0.checkNotNullParameter(webView, "webView");
            e0.checkNotNullParameter(description, "description");
            e0.checkNotNullParameter(failingUrl, "failingUrl");
            io.odeeo.internal.b2.a.w("Ad error: " + failingUrl + " Description:" + description, new Object[0]);
            this.f68148e.hideWebView$odeeoSdk_release();
            this.f68148e.a(a(i10));
            clearAd();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View webView, MotionEvent event) {
            String str;
            e0.checkNotNullParameter(webView, "webView");
            e0.checkNotNullParameter(event, "event");
            int action = event.getAction();
            if (action == 0) {
                this.f68145b = true;
                this.f68146c = event.getRawX();
                this.f68147d = event.getRawY();
                return false;
            }
            if (action == 1) {
                if (this.f68145b && (str = this.f68144a) != null) {
                    this.f68148e.onAdClicked$odeeoSdk_release(str);
                }
                this.f68148e.performClick();
                return false;
            }
            if (action != 2) {
                return true;
            }
            if (isMovedTooFar$odeeoSdk_release(this.f68146c, event.getRawX())) {
                this.f68145b = false;
            }
            if (isMovedTooFar$odeeoSdk_release(this.f68147d, event.getRawY())) {
                this.f68145b = false;
            }
            return false;
        }

        public final void setMWebViewClicked$odeeoSdk_release(boolean z10) {
            this.f68145b = z10;
        }

        @Override // android.webkit.WebViewClient
        public synchronized boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            boolean z10;
            e0.checkNotNullParameter(view, "view");
            e0.checkNotNullParameter(event, "event");
            z10 = true;
            if (event.getKeyCode() == 23) {
                this.f68145b = true;
                z10 = false;
            }
            return z10;
        }

        @Override // android.webkit.WebViewClient
        public synchronized boolean shouldOverrideUrlLoading(WebView webView, String url) {
            boolean z10;
            e0.checkNotNullParameter(webView, "webView");
            e0.checkNotNullParameter(url, "url");
            if (this.f68145b) {
                this.f68148e.onAdClicked$odeeoSdk_release(url);
                z10 = true;
            } else {
                z10 = false;
            }
            return z10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d extends c {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ l f68149f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(l this$0) {
            super(this$0);
            e0.checkNotNullParameter(this$0, "this$0");
            this.f68149f = this$0;
        }

        @Override // android.webkit.WebViewClient
        public synchronized WebResourceResponse shouldInterceptRequest(WebView webView, String url) {
            e0.checkNotNullParameter(webView, "webView");
            e0.checkNotNullParameter(url, "url");
            if (getMWebViewClicked$odeeoSdk_release()) {
                this.f68149f.onAdClicked$odeeoSdk_release(url);
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends d {

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ kv.a f68151h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(kv.a aVar) {
            super(l.this);
            this.f68151h = aVar;
        }

        @Override // io.odeeo.sdk.l.c, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            e0.checkNotNullParameter(webView, "webView");
            super.onPageFinished(webView, str);
            this.f68151h.invoke();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.OdeeoWebView$createWebViewIfNeeded$2", f = "OdeeoWebView.kt", i = {}, l = {329}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        public int f68152a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f68154c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ kv.a f68155d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, kv.a aVar, zu.d<? super f> dVar) {
            super(2, dVar);
            this.f68154c = str;
            this.f68155d = aVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return l.this.new f(this.f68154c, this.f68155d, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f68152a;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                l lVar = l.this;
                String str = this.f68154c;
                this.f68152a = 1;
                obj = lVar.loadImage$odeeoSdk_release(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                l lVar2 = l.this;
                kv.a aVar = this.f68155d;
                io.odeeo.internal.w1.k kVar = lVar2.f68127b;
                if (kVar != null) {
                    kVar.setImageBitmap(bitmap);
                }
                io.odeeo.internal.w1.k kVar2 = lVar2.f68127b;
                if (kVar2 != null) {
                    kVar2.setVisibility(0);
                }
                aVar.invoke();
            }
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((f) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.OdeeoWebView$loadImage$2", f = "OdeeoWebView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        public int f68156a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f68157b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, zu.d<? super g> dVar) {
            super(2, dVar);
            this.f68157b = str;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new g(this.f68157b, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            if (this.f68156a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return io.odeeo.internal.v1.q.f67287a.loadImage$odeeoSdk_release(URI.create(this.f68157b).toURL());
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Bitmap> dVar) {
            return ((g) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        this(context, null, 0, null, null, 30, null);
        e0.checkNotNullParameter(context, "context");
    }

    public static final void a(l this$0) {
        e0.checkNotNullParameter(this$0, "this$0");
        io.odeeo.internal.w1.l lVar = this$0.f68126a;
        if (lVar != null) {
            lVar.onPause();
        }
        this$0.f68138m.pause$odeeoSdk_release();
    }

    public static final void b(l this$0) {
        e0.checkNotNullParameter(this$0, "this$0");
        io.odeeo.internal.w1.l lVar = this$0.f68126a;
        if (lVar != null) {
            lVar.onResume();
        }
        this$0.f68138m.resume$odeeoSdk_release();
    }

    public static final void c(l this$0) {
        e0.checkNotNullParameter(this$0, "this$0");
        CoroutineScopeKt.cancel$default(this$0.f68129d, null, 1, null);
        this$0.f68133h = true;
        io.odeeo.internal.w1.l lVar = this$0.f68126a;
        if (lVar != null) {
            this$0.removeView(lVar);
            lVar.destroy();
            this$0.f68126a = null;
        }
        View view = this$0.f68127b;
        if (view == null) {
            return;
        }
        this$0.removeView(view);
        this$0.f68127b = null;
    }

    public static /* synthetic */ boolean isHtmlAd$odeeoSdk_release$default(l lVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = lVar.f68142q.getCompanionHtml$odeeoSdk_release();
        }
        return lVar.isHtmlAd$odeeoSdk_release(str);
    }

    public static /* synthetic */ void setAdSize$default(l lVar, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = 0;
        }
        lVar.setAdSize(i10, i11, i12);
    }

    public static /* synthetic */ void showAd$odeeoSdk_release$default(l lVar, AdInfo adInfo, int i10, int i11, AdUnit.PlacementType placementType, int i12, kv.a aVar, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            i12 = 0;
        }
        lVar.showAd$odeeoSdk_release(adInfo, i10, i11, placementType, i12, aVar);
    }

    public final void clearAd() {
        io.odeeo.internal.b2.a.i("clearAd", new Object[0]);
        if (this.f68133h) {
            return;
        }
        hideWebView$odeeoSdk_release();
        this.f68132g = 0;
        a();
    }

    public final void clearWithDefaultColor$odeeoSdk_release() {
        io.odeeo.internal.w1.l lVar = this.f68126a;
        if (lVar != null) {
            lVar.loadData("<HTML><BODY></BODY></HTML>", "text/html", G5.N);
        }
        io.odeeo.internal.w1.l lVar2 = this.f68126a;
        if (lVar2 != null) {
            lVar2.setBackgroundColor(0);
        }
        io.odeeo.internal.w1.l lVar3 = this.f68126a;
        if (lVar3 != null) {
            lVar3.setBackground(getGradient$odeeoSdk_release());
        }
        io.odeeo.internal.w1.k kVar = this.f68127b;
        if (kVar == null) {
            return;
        }
        kVar.setBackgroundColor(0);
    }

    public final int getAdHeight() {
        return this.f68135j;
    }

    public final AdInfo getAdInfo() {
        return this.f68142q;
    }

    public final int getAdWidth() {
        return this.f68134i;
    }

    public final io.odeeo.internal.w1.g getAudioOnlyVisualizer$odeeoSdk_release() {
        return this.f68138m;
    }

    public final GradientDrawable getGradient$odeeoSdk_release() {
        return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{this.f68140o, this.f68141p});
    }

    public final b getListener() {
        return this.f68131f;
    }

    public final void hideWebView$odeeoSdk_release() {
        io.odeeo.internal.w1.l lVar = this.f68126a;
        if (lVar != null) {
            lVar.setVisibility(8);
        }
        io.odeeo.internal.w1.k kVar = this.f68127b;
        if (kVar == null) {
            return;
        }
        kVar.setVisibility(8);
    }

    public final boolean isAdHasCompanionUrl$odeeoSdk_release() {
        String companionUrl$odeeoSdk_release = this.f68142q.getCompanionUrl$odeeoSdk_release();
        return !(companionUrl$odeeoSdk_release == null || companionUrl$odeeoSdk_release.length() == 0);
    }

    public final boolean isAdLoaded() {
        io.odeeo.internal.w1.l lVar = this.f68126a;
        if (lVar != null && lVar.getVisibility() == 0) {
            return true;
        }
        io.odeeo.internal.w1.k kVar = this.f68127b;
        return kVar != null && kVar.getVisibility() == 0;
    }

    public final boolean isAnimationByExtension(String log) {
        e0.checkNotNullParameter(log, "log");
        List listListOf = p0.listOf((Object[]) new String[]{".gif", ".mp4", ".webm", ".apng", ".swf", ".flv", ".mov", ".avi", ".wmv", ".mkv", ".webp"});
        String strA = a(log);
        if ((listListOf instanceof Collection) && listListOf.isEmpty()) {
            return false;
        }
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            if (k0.endsWith(strA, (String) it.next(), true)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isHtmlAd$odeeoSdk_release(String str) {
        if (str != null) {
            Locale locale = Locale.getDefault();
            e0.checkNotNullExpressionValue(locale, "getDefault()");
            String lowerCase = str.toLowerCase(locale);
            e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (lowerCase != null && n0.contains$default((CharSequence) lowerCase, (CharSequence) "<html", false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    public final void launchBrowser$odeeoSdk_release(String externalUrl) {
        e0.checkNotNullParameter(externalUrl, "externalUrl");
        if (externalUrl.length() == 0) {
            return;
        }
        io.odeeo.internal.b2.a.d(e0.stringPlus("Launching external ad: ", externalUrl), new Object[0]);
        try {
            if (!k0.startsWith$default(externalUrl, DtbConstants.HTTPS, false, 2, null) && !k0.startsWith$default(externalUrl, DtbConstants.HTTP, false, 2, null)) {
                externalUrl = e0.stringPlus(DtbConstants.HTTP, externalUrl);
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(externalUrl));
            intent.setFlags(268468224);
            getContext().startActivity(intent);
        } catch (ActivityNotFoundException e10) {
            io.odeeo.internal.b2.a.w(e0.stringPlus("ClickThroughURL Issue: ", e10.getMessage()), new Object[0]);
        }
    }

    public final Object loadImage$odeeoSdk_release(String str, zu.d<? super Bitmap> dVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new g(str, null), dVar);
    }

    public final synchronized void onAdClicked$odeeoSdk_release(String externalUrl) {
        e0.checkNotNullParameter(externalUrl, "externalUrl");
        io.odeeo.internal.b2.a.d(e0.stringPlus("onAdClicked externalUrl: ", externalUrl), new Object[0]);
        b bVar = this.f68131f;
        if (bVar != null) {
            bVar.onViewClicked(this.f68128c);
        }
        launchBrowser$odeeoSdk_release(externalUrl);
    }

    public final void onPause() {
        new Handler(Looper.getMainLooper()).post(new t(this, 0));
    }

    public final void onResume() {
        new Handler(Looper.getMainLooper()).post(new t(this, 1));
    }

    public final void release() {
        new Handler(Looper.getMainLooper()).post(new t(this, 2));
    }

    public final void setAdInfo(AdInfo adInfo) {
        e0.checkNotNullParameter(adInfo, "<set-?>");
        this.f68142q = adInfo;
    }

    public final void setAdSize(int i10, int i11, int i12) {
        if (this.f68134i == i10 && this.f68135j == i11) {
            return;
        }
        this.f68134i = i10;
        this.f68135j = i11;
        this.f68136k = new FrameLayout.LayoutParams(-1, -1, 17);
        int iDensityPixelsToPixels = io.odeeo.internal.v1.k.f67283a.densityPixelsToPixels(this.f68130e, i12);
        setPadding(iDensityPixelsToPixels, iDensityPixelsToPixels, iDensityPixelsToPixels, iDensityPixelsToPixels);
    }

    public final void setAudioOnlyVisualizer$odeeoSdk_release(io.odeeo.internal.w1.g gVar) {
        e0.checkNotNullParameter(gVar, "<set-?>");
        this.f68138m = gVar;
    }

    public final void setAudioOnlyVisualizerColor(int i10) {
        this.f68139n = i10;
    }

    public final void setGradientBackgroundColor(int i10, int i11) {
        this.f68140o = i10;
        this.f68141p = i11;
    }

    public final void setListener(b bVar) {
        this.f68131f = bVar;
    }

    public final void setWebViewCornerRadius(int i10) {
        io.odeeo.internal.w1.l lVar = this.f68126a;
        if (lVar != null) {
            lVar.setRadius(i10);
        }
        io.odeeo.internal.w1.k kVar = this.f68127b;
        if (kVar == null) {
            return;
        }
        kVar.setRadius(i10);
    }

    public final void showAd$odeeoSdk_release(AdInfo ad2, int i10, int i11, AdUnit.PlacementType placementType, int i12, kv.a onPageLoaded) {
        String onClickTroughEvent$odeeoSdk_release;
        c cVar;
        e0.checkNotNullParameter(ad2, "ad");
        e0.checkNotNullParameter(placementType, "placementType");
        e0.checkNotNullParameter(onPageLoaded, "onPageLoaded");
        io.odeeo.internal.v1.m.f67284a.checkNotNull(ad2);
        this.f68142q = ad2;
        setAdSize(i10, i11, i12);
        String companionUrl$odeeoSdk_release = this.f68142q.getCompanionUrl$odeeoSdk_release();
        if (companionUrl$odeeoSdk_release == null || companionUrl$odeeoSdk_release.length() == 0) {
            b(this.f68142q.getCompanionHtml$odeeoSdk_release(), placementType, onPageLoaded);
        } else {
            c(companionUrl$odeeoSdk_release, placementType, onPageLoaded);
        }
        io.odeeo.internal.w1.l lVar = this.f68126a;
        if (lVar != null) {
            e0.checkNotNull(lVar);
            lVar.setLayoutParams(this.f68136k);
            if (companionUrl$odeeoSdk_release == null || (onClickTroughEvent$odeeoSdk_release = this.f68142q.getOnClickTroughEvent$odeeoSdk_release()) == null || onClickTroughEvent$odeeoSdk_release.length() == 0 || (cVar = this.f68137l) == null) {
                return;
            }
            cVar.SetClickURL(onClickTroughEvent$odeeoSdk_release);
        }
    }

    public final void showWebView$odeeoSdk_release() {
        io.odeeo.internal.w1.l lVar = this.f68126a;
        if (lVar != null) {
            lVar.setVisibility(0);
        }
        io.odeeo.internal.w1.k kVar = this.f68127b;
        if (kVar == null) {
            return;
        }
        kVar.setVisibility(0);
    }

    public final void timerTick() {
        if (this.f68138m.getVisibility() == 0) {
            this.f68138m.invalidate();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, null, 28, null);
        e0.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, null, null, 24, null);
        e0.checkNotNullParameter(context, "context");
    }

    public final void a(int i10) {
        a();
        if (this.f68132g != 0 || i10 == 0) {
            return;
        }
        String strStringPlus = e0.stringPlus("Error: ", f68125r.debugErrorToStr(i10));
        if (i10 == 8011) {
            StringBuilder sbT = a.b.t(strStringPlus, " (");
            sbT.append(this.f68134i);
            sbT.append('x');
            sbT.append(this.f68135j);
            strStringPlus = e0.stringPlus(sbT.toString(), ")");
        }
        io.odeeo.internal.b2.a.w(strStringPlus, new Object[0]);
        this.f68132g = i10;
        b bVar = this.f68131f;
        if (bVar != null) {
            e0.checkNotNull(bVar);
            bVar.onViewError(this, i10);
        }
    }

    public final void b() {
        b bVar;
        if (this.f68132g != 0 || (bVar = this.f68131f) == null) {
            return;
        }
        bVar.onViewCleared(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(Context context, AttributeSet attributeSet, int i10, io.odeeo.internal.w1.l lVar) {
        this(context, attributeSet, i10, lVar, null, 16, null);
        e0.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ l(Context context, AttributeSet attributeSet, int i10, io.odeeo.internal.w1.l lVar, io.odeeo.internal.w1.k kVar, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? null : lVar, (i11 & 16) != 0 ? null : kVar);
    }

    public final void b(String str, AdUnit.PlacementType placementType, kv.a aVar) {
        io.odeeo.internal.b2.a.d("loadHTML html: " + ((Object) str) + " placementType: " + placementType, new Object[0]);
        a(null, placementType, aVar);
        if (this.f68137l != null) {
            boolean zIsHtmlAd$odeeoSdk_release = isHtmlAd$odeeoSdk_release(str);
            this.f68138m.setVisibility(zIsHtmlAd$odeeoSdk_release ? 8 : 0);
            if (!zIsHtmlAd$odeeoSdk_release) {
                clearWithDefaultColor$odeeoSdk_release();
                return;
            }
            c cVar = this.f68137l;
            if (cVar == null) {
                return;
            }
            cVar.loadHTML(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(Context context, AttributeSet attributeSet, int i10, io.odeeo.internal.w1.l lVar, io.odeeo.internal.w1.k kVar) {
        super(context, attributeSet, i10);
        e0.checkNotNullParameter(context, "context");
        this.f68126a = lVar;
        this.f68127b = kVar;
        this.f68128c = this;
        this.f68129d = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(OdeeoSDK.INSTANCE.getODEEO_MAIN_THREAD_DISPATCHER$odeeoSdk_release()));
        this.f68130e = io.odeeo.internal.v1.k.f67283a.getDeviceDensityPixelScale(context);
        this.f68138m = new io.odeeo.internal.w1.g(context);
        this.f68139n = -1;
        c.a aVar = io.odeeo.internal.w1.c.f67352p;
        this.f68140o = aVar.getCOLOR_DEFAULT_FROM$odeeoSdk_release();
        this.f68141p = aVar.getCOLOR_DEFAULT_TO$odeeoSdk_release();
        this.f68142q = new AdInfo(null, 1, 0 == true ? 1 : 0);
    }

    public final void c() {
        b bVar;
        if (this.f68132g != 0 || (bVar = this.f68131f) == null) {
            return;
        }
        bVar.onViewLoaded(this);
    }

    public final void c(String str, AdUnit.PlacementType placementType, kv.a aVar) {
        a(str, placementType, aVar);
        c cVar = this.f68137l;
        if (cVar == null) {
            return;
        }
        cVar.loadAd(str);
    }

    public final void a() {
        c cVar = this.f68137l;
        if (cVar == null) {
            b();
        } else {
            cVar.clearAd();
        }
    }

    public final void a(String str, AdUnit.PlacementType placementType, kv.a aVar) {
        if (str != null && !isAnimationByExtension(str)) {
            if (this.f68127b == null) {
                Context context = getContext();
                e0.checkNotNullExpressionValue(context, "context");
                io.odeeo.internal.w1.k kVar = new io.odeeo.internal.w1.k(context, null, 0, 6, null);
                this.f68127b = kVar;
                e0.checkNotNull(kVar);
                kVar.setFocusable(false);
                io.odeeo.internal.w1.k kVar2 = this.f68127b;
                e0.checkNotNull(kVar2);
                kVar2.setVisibility(8);
                io.odeeo.internal.w1.k kVar3 = this.f68127b;
                e0.checkNotNull(kVar3);
                kVar3.setScaleType(ImageView.ScaleType.FIT_XY);
                BuildersKt__Builders_commonKt.launch$default(this.f68129d, null, null, new f(str, aVar, null), 3, null);
                io.odeeo.internal.w1.k kVar4 = this.f68127b;
                e0.checkNotNull(kVar4);
                kVar4.setOnClickListener(new com.applovin.mediation.nativeAds.a(this, 26));
                addView(this.f68127b, this.f68136k);
            }
            io.odeeo.internal.w1.k kVar5 = this.f68127b;
            e0.checkNotNull(kVar5);
            kVar5.setVisibility(0);
        } else {
            if (this.f68126a == null) {
                Context context2 = getContext();
                e0.checkNotNullExpressionValue(context2, "context");
                io.odeeo.internal.w1.l lVar = new io.odeeo.internal.w1.l(context2);
                this.f68126a = lVar;
                e0.checkNotNull(lVar);
                lVar.setFocusable(false);
                io.odeeo.internal.w1.l lVar2 = this.f68126a;
                e0.checkNotNull(lVar2);
                lVar2.setHorizontalScrollBarEnabled(false);
                io.odeeo.internal.w1.l lVar3 = this.f68126a;
                e0.checkNotNull(lVar3);
                lVar3.setOverScrollMode(2);
                io.odeeo.internal.w1.l lVar4 = this.f68126a;
                e0.checkNotNull(lVar4);
                lVar4.setScrollBarStyle(33554432);
                io.odeeo.internal.w1.l lVar5 = this.f68126a;
                e0.checkNotNull(lVar5);
                lVar5.setVerticalScrollBarEnabled(false);
                io.odeeo.internal.w1.l lVar6 = this.f68126a;
                e0.checkNotNull(lVar6);
                lVar6.setVisibility(8);
                io.odeeo.internal.w1.l lVar7 = this.f68126a;
                e0.checkNotNull(lVar7);
                lVar7.getSettings().setUseWideViewPort(true);
                io.odeeo.internal.w1.l lVar8 = this.f68126a;
                e0.checkNotNull(lVar8);
                lVar8.getSettings().setLoadWithOverviewMode(true);
                io.odeeo.internal.w1.l lVar9 = this.f68126a;
                e0.checkNotNull(lVar9);
                lVar9.setLayerType(1, null);
                this.f68137l = new e(aVar);
                io.odeeo.internal.w1.l lVar10 = this.f68126a;
                e0.checkNotNull(lVar10);
                c cVar = this.f68137l;
                if (cVar != null) {
                    lVar10.setWebViewClient(cVar);
                    io.odeeo.internal.w1.l lVar11 = this.f68126a;
                    e0.checkNotNull(lVar11);
                    WebSettings settings = lVar11.getSettings();
                    e0.checkNotNullExpressionValue(settings, "webView!!.settings");
                    settings.setJavaScriptEnabled(true);
                    settings.setSupportZoom(false);
                    settings.setDisplayZoomControls(false);
                    addView(this.f68126a, this.f68136k);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type io.odeeo.sdk.OdeeoWebView.WebClient");
                }
            }
            io.odeeo.internal.w1.l lVar12 = this.f68126a;
            e0.checkNotNull(lVar12);
            lVar12.setVisibility(0);
        }
        this.f68138m.setColor(this.f68139n);
        a aVar2 = f68125r;
        int lineBarWidth$odeeoSdk_release = aVar2.getLineBarWidth$odeeoSdk_release(placementType);
        Context context3 = getContext();
        e0.checkNotNullExpressionValue(context3, "context");
        int iDpToPx = io.odeeo.internal.v1.l.dpToPx(lineBarWidth$odeeoSdk_release, context3);
        int lineBarHeight$odeeoSdk_release = aVar2.getLineBarHeight$odeeoSdk_release(placementType);
        Context context4 = getContext();
        e0.checkNotNullExpressionValue(context4, "context");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPx, io.odeeo.internal.v1.l.dpToPx(lineBarHeight$odeeoSdk_release, context4), 17);
        this.f68138m.setVisibility(8);
        addView(this.f68138m, layoutParams);
    }

    public static final void a(l this$0, View view) {
        e0.checkNotNullParameter(this$0, "this$0");
        String onClickTroughEvent$odeeoSdk_release = this$0.f68142q.getOnClickTroughEvent$odeeoSdk_release();
        if (onClickTroughEvent$odeeoSdk_release == null) {
            return;
        }
        this$0.onAdClicked$odeeoSdk_release(onClickTroughEvent$odeeoSdk_release);
    }

    public final String a(String str) {
        return n0.substringBefore$default(str, "?", (String) null, 2, (Object) null);
    }
}
