package g0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.digidust.elokence.akinator.freemium.R;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class x3 {

    /* renamed from: v, reason: collision with root package name */
    public static final a f56628v = new a(null);

    /* renamed from: w, reason: collision with root package name */
    public static final WeakHashMap f56629w = new WeakHashMap();

    /* renamed from: x, reason: collision with root package name */
    public static boolean f56630x;

    /* renamed from: a, reason: collision with root package name */
    public final c f56631a;

    /* renamed from: b, reason: collision with root package name */
    public final c f56632b;

    /* renamed from: c, reason: collision with root package name */
    public final c f56633c;

    /* renamed from: d, reason: collision with root package name */
    public final c f56634d;

    /* renamed from: e, reason: collision with root package name */
    public final c f56635e;

    /* renamed from: f, reason: collision with root package name */
    public final c f56636f;

    /* renamed from: g, reason: collision with root package name */
    public final c f56637g;

    /* renamed from: h, reason: collision with root package name */
    public final c f56638h;

    /* renamed from: i, reason: collision with root package name */
    public final c f56639i;

    /* renamed from: j, reason: collision with root package name */
    public final s3 f56640j;

    /* renamed from: k, reason: collision with root package name */
    public final v3 f56641k;

    /* renamed from: l, reason: collision with root package name */
    public final v3 f56642l;

    /* renamed from: m, reason: collision with root package name */
    public final v3 f56643m;

    /* renamed from: n, reason: collision with root package name */
    public final s3 f56644n;

    /* renamed from: o, reason: collision with root package name */
    public final s3 f56645o;

    /* renamed from: p, reason: collision with root package name */
    public final s3 f56646p;

    /* renamed from: q, reason: collision with root package name */
    public final s3 f56647q;

    /* renamed from: r, reason: collision with root package name */
    public final s3 f56648r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f56649s;

    /* renamed from: t, reason: collision with root package name */
    public int f56650t;

    /* renamed from: u, reason: collision with root package name */
    public final x0 f56651u;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public static final c access$systemInsets(a aVar, x3.e3 e3Var, int i10, String str) {
            aVar.getClass();
            c cVar = new c(i10, str);
            if (e3Var != null) {
                cVar.update$foundation_layout_release(e3Var, i10);
            }
            return cVar;
        }

        public static final s3 access$valueInsetsIgnoringVisibility(a aVar, x3.e3 e3Var, int i10, String str) {
            o3.c insetsIgnoringVisibility;
            aVar.getClass();
            if (e3Var == null || (insetsIgnoringVisibility = e3Var.getInsetsIgnoringVisibility(i10)) == null) {
                insetsIgnoringVisibility = o3.c.f77431e;
            }
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(insetsIgnoringVisibility, "windowInsets?.getInsetsI…e) ?: AndroidXInsets.NONE");
            return e4.ValueInsets(insetsIgnoringVisibility, str);
        }

        public final x3 current(p0.w wVar, int i10) {
            x3 x3Var;
            wVar.startReplaceableGroup(-1366542614);
            View view = (View) wVar.consume(AndroidCompositionLocals_androidKt.getLocalView());
            synchronized (x3.f56629w) {
                try {
                    WeakHashMap weakHashMap = x3.f56629w;
                    Object x3Var2 = weakHashMap.get(view);
                    if (x3Var2 == null) {
                        x3Var2 = new x3(null, view, null);
                        weakHashMap.put(view, x3Var2);
                    }
                    x3Var = (x3) x3Var2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            p0.k1.DisposableEffect(x3Var, new w3(x3Var, view), wVar, 8);
            wVar.endReplaceableGroup();
            return x3Var;
        }

        public final void setUseTestInsets(boolean z10) {
            x3.f56630x = z10;
        }
    }

    public static /* synthetic */ void update$default(x3 x3Var, x3.e3 e3Var, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        x3Var.update(e3Var, i10);
    }

    public final void decrementAccessors(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        int i10 = this.f56650t - 1;
        this.f56650t = i10;
        if (i10 == 0) {
            x3.z1.setOnApplyWindowInsetsListener(view, null);
            x3.z1.setWindowInsetsAnimationCallback(view, null);
            view.removeOnAttachStateChangeListener(this.f56651u);
        }
    }

    public final c getCaptionBar() {
        return this.f56631a;
    }

    public final s3 getCaptionBarIgnoringVisibility() {
        return this.f56644n;
    }

    public final boolean getConsumes() {
        return this.f56649s;
    }

    public final c getDisplayCutout() {
        return this.f56632b;
    }

    public final c getIme() {
        return this.f56633c;
    }

    public final c getMandatorySystemGestures() {
        return this.f56634d;
    }

    public final c getNavigationBars() {
        return this.f56635e;
    }

    public final s3 getNavigationBarsIgnoringVisibility() {
        return this.f56645o;
    }

    public final v3 getSafeContent() {
        return this.f56643m;
    }

    public final v3 getSafeDrawing() {
        return this.f56641k;
    }

    public final v3 getSafeGestures() {
        return this.f56642l;
    }

    public final c getStatusBars() {
        return this.f56636f;
    }

    public final s3 getStatusBarsIgnoringVisibility() {
        return this.f56646p;
    }

    public final c getSystemBars() {
        return this.f56637g;
    }

    public final s3 getSystemBarsIgnoringVisibility() {
        return this.f56647q;
    }

    public final c getSystemGestures() {
        return this.f56638h;
    }

    public final c getTappableElement() {
        return this.f56639i;
    }

    public final s3 getTappableElementIgnoringVisibility() {
        return this.f56648r;
    }

    public final s3 getWaterfall() {
        return this.f56640j;
    }

    public final void incrementAccessors(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        if (this.f56650t == 0) {
            x0 x0Var = this.f56651u;
            x3.z1.setOnApplyWindowInsetsListener(view, x0Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(x0Var);
            if (Build.VERSION.SDK_INT >= 30) {
                x3.z1.setWindowInsetsAnimationCallback(view, x0Var);
            }
        }
        this.f56650t++;
    }

    public final void update(x3.e3 windowInsets, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(windowInsets, "windowInsets");
        if (f56630x) {
            WindowInsets windowInsets2 = windowInsets.toWindowInsets();
            kotlin.jvm.internal.e0.checkNotNull(windowInsets2);
            windowInsets = x3.e3.toWindowInsetsCompat(windowInsets2);
        }
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(windowInsets, "if (testInsets) {\n      …   windowInsets\n        }");
        this.f56631a.update$foundation_layout_release(windowInsets, i10);
        this.f56633c.update$foundation_layout_release(windowInsets, i10);
        this.f56632b.update$foundation_layout_release(windowInsets, i10);
        this.f56635e.update$foundation_layout_release(windowInsets, i10);
        this.f56636f.update$foundation_layout_release(windowInsets, i10);
        this.f56637g.update$foundation_layout_release(windowInsets, i10);
        this.f56638h.update$foundation_layout_release(windowInsets, i10);
        this.f56639i.update$foundation_layout_release(windowInsets, i10);
        this.f56634d.update$foundation_layout_release(windowInsets, i10);
        if (i10 == 0) {
            o3.c insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(x3.t3.captionBar());
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(insetsIgnoringVisibility, "insets.getInsetsIgnoring…aptionBar()\n            )");
            this.f56644n.setValue$foundation_layout_release(e4.toInsetsValues(insetsIgnoringVisibility));
            o3.c insetsIgnoringVisibility2 = windowInsets.getInsetsIgnoringVisibility(x3.t3.navigationBars());
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(insetsIgnoringVisibility2, "insets.getInsetsIgnoring…ationBars()\n            )");
            this.f56645o.setValue$foundation_layout_release(e4.toInsetsValues(insetsIgnoringVisibility2));
            o3.c insetsIgnoringVisibility3 = windowInsets.getInsetsIgnoringVisibility(x3.t3.statusBars());
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(insetsIgnoringVisibility3, "insets.getInsetsIgnoring…tatusBars()\n            )");
            this.f56646p.setValue$foundation_layout_release(e4.toInsetsValues(insetsIgnoringVisibility3));
            o3.c insetsIgnoringVisibility4 = windowInsets.getInsetsIgnoringVisibility(x3.t3.systemBars());
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(insetsIgnoringVisibility4, "insets.getInsetsIgnoring…ystemBars()\n            )");
            this.f56647q.setValue$foundation_layout_release(e4.toInsetsValues(insetsIgnoringVisibility4));
            o3.c insetsIgnoringVisibility5 = windowInsets.getInsetsIgnoringVisibility(x3.t3.tappableElement());
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(insetsIgnoringVisibility5, "insets.getInsetsIgnoring…leElement()\n            )");
            this.f56648r.setValue$foundation_layout_release(e4.toInsetsValues(insetsIgnoringVisibility5));
            x3.s displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                o3.c waterfallInsets = displayCutout.getWaterfallInsets();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(waterfallInsets, "cutout.waterfallInsets");
                this.f56640j.setValue$foundation_layout_release(e4.toInsetsValues(waterfallInsets));
            }
        }
        b1.m.f8651e.sendApplyNotifications();
    }

    public x3(x3.e3 e3Var, View view, kotlin.jvm.internal.u uVar) {
        View view2;
        Object tag;
        boolean zBooleanValue;
        x3.s displayCutout;
        int iCaptionBar = x3.t3.captionBar();
        a aVar = f56628v;
        this.f56631a = a.access$systemInsets(aVar, e3Var, iCaptionBar, "captionBar");
        c cVarAccess$systemInsets = a.access$systemInsets(aVar, e3Var, x3.t3.displayCutout(), "displayCutout");
        this.f56632b = cVarAccess$systemInsets;
        c cVarAccess$systemInsets2 = a.access$systemInsets(aVar, e3Var, x3.t3.ime(), "ime");
        this.f56633c = cVarAccess$systemInsets2;
        c cVarAccess$systemInsets3 = a.access$systemInsets(aVar, e3Var, x3.t3.mandatorySystemGestures(), "mandatorySystemGestures");
        this.f56634d = cVarAccess$systemInsets3;
        this.f56635e = a.access$systemInsets(aVar, e3Var, x3.t3.navigationBars(), "navigationBars");
        this.f56636f = a.access$systemInsets(aVar, e3Var, x3.t3.statusBars(), "statusBars");
        c cVarAccess$systemInsets4 = a.access$systemInsets(aVar, e3Var, x3.t3.systemBars(), "systemBars");
        this.f56637g = cVarAccess$systemInsets4;
        c cVarAccess$systemInsets5 = a.access$systemInsets(aVar, e3Var, x3.t3.systemGestures(), "systemGestures");
        this.f56638h = cVarAccess$systemInsets5;
        c cVarAccess$systemInsets6 = a.access$systemInsets(aVar, e3Var, x3.t3.tappableElement(), "tappableElement");
        this.f56639i = cVarAccess$systemInsets6;
        o3.c waterfallInsets = (e3Var == null || (displayCutout = e3Var.getDisplayCutout()) == null || (waterfallInsets = displayCutout.getWaterfallInsets()) == null) ? o3.c.f77431e : waterfallInsets;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(waterfallInsets, "insets?.displayCutout?.w…ts ?: AndroidXInsets.NONE");
        s3 s3VarValueInsets = e4.ValueInsets(waterfallInsets, com.ironsource.mediationsdk.d.f37321h);
        this.f56640j = s3VarValueInsets;
        v3 v3VarUnion = y3.union(y3.union(cVarAccess$systemInsets4, cVarAccess$systemInsets2), cVarAccess$systemInsets);
        this.f56641k = v3VarUnion;
        v3 v3VarUnion2 = y3.union(y3.union(y3.union(cVarAccess$systemInsets6, cVarAccess$systemInsets3), cVarAccess$systemInsets5), s3VarValueInsets);
        this.f56642l = v3VarUnion2;
        this.f56643m = y3.union(v3VarUnion, v3VarUnion2);
        this.f56644n = a.access$valueInsetsIgnoringVisibility(aVar, e3Var, x3.t3.captionBar(), "captionBarIgnoringVisibility");
        this.f56645o = a.access$valueInsetsIgnoringVisibility(aVar, e3Var, x3.t3.navigationBars(), "navigationBarsIgnoringVisibility");
        this.f56646p = a.access$valueInsetsIgnoringVisibility(aVar, e3Var, x3.t3.statusBars(), "statusBarsIgnoringVisibility");
        this.f56647q = a.access$valueInsetsIgnoringVisibility(aVar, e3Var, x3.t3.systemBars(), wHkgq.JalBXAafONXZ);
        this.f56648r = a.access$valueInsetsIgnoringVisibility(aVar, e3Var, x3.t3.tappableElement(), "tappableElementIgnoringVisibility");
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            tag = view2.getTag(R.id.consume_window_insets_tag);
        } else {
            tag = null;
        }
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        this.f56649s = zBooleanValue;
        this.f56651u = new x0(this);
    }
}
