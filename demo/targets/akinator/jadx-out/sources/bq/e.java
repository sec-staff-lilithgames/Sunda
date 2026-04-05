package bq;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import br.h0;
import br.p1;
import br.z;
import cr.q;
import ir.n;
import ir.o;
import ir.t;
import ir.x;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.e0;
import xq.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final h f9733a;

    /* renamed from: b, reason: collision with root package name */
    public final cq.e f9734b;

    /* renamed from: c, reason: collision with root package name */
    public f f9735c;

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f9736d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements cq.f {
        public a() {
        }

        @Override // cq.f, aq.a
        public void onAdAppeared(cq.e adView) {
            e0.checkNotNullParameter(adView, "adView");
            e.access$notifyAdAppeared(e.this);
        }

        @Override // cq.f, aq.a
        public void onAdClicked(cq.e adView) {
            e0.checkNotNullParameter(adView, "adView");
            e.access$notifyAdClicked(e.this);
        }

        @Override // cq.f, aq.a
        public void onAdDisappeared(cq.e adView) {
            e0.checkNotNullParameter(adView, "adView");
            e.access$notifyAdDisappeared(e.this);
        }

        @Override // cq.f, aq.a
        public void onAdExpired(cq.e adView) {
            e0.checkNotNullParameter(adView, "adView");
            e.access$notifyAdExpired(e.this);
        }

        @Override // cq.f, aq.a
        public void onAdFailToLoad(cq.e adView, h0 error) {
            e0.checkNotNullParameter(adView, "adView");
            e0.checkNotNullParameter(error, "error");
            e.access$notifyAdFailToLoad(e.this, error);
        }

        @Override // cq.f, aq.a
        public void onAdFailToShow(cq.e adView, h0 error) {
            e0.checkNotNullParameter(adView, "adView");
            e0.checkNotNullParameter(error, "error");
            e.this.notifyAdFailToShow(error);
        }

        @Override // cq.f, aq.a
        public void onAdFinished(cq.e adView) {
            e0.checkNotNullParameter(adView, "adView");
            e.this.processAdClosed();
        }

        @Override // cq.f, aq.a
        public void onAdLoaded(cq.e adView) {
            e0.checkNotNullParameter(adView, "adView");
            e.access$notifyAdLoaded(e.this);
        }

        @Override // cq.f, aq.a
        public void onAdShown(cq.e adView) {
            e0.checkNotNullParameter(adView, "adView");
            e.access$notifyAdShown(e.this);
        }

        @Override // cq.f, aq.a
        public void onBrokenCreativeEvent(cq.e adView, z brokenCreativeEvent) {
            e0.checkNotNullParameter(adView, "adView");
            e0.checkNotNullParameter(brokenCreativeEvent, "brokenCreativeEvent");
            e.access$notifyBrokenCreativeEvent(e.this, brokenCreativeEvent);
        }

        @Override // cq.f, aq.a
        public void onOpenPrivacySheet(cq.e adView, p1 privacySheetParams) {
            e0.checkNotNullParameter(adView, "adView");
            e0.checkNotNullParameter(privacySheetParams, "privacySheetParams");
            e.access$notifyPrivacySheetOpen(e.this, privacySheetParams);
        }
    }

    public e(Context context, br.d adParams) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(adParams, "adParams");
        this.f9733a = new h("FullScreenAd");
        Context applicationContext = context.getApplicationContext();
        e0.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f9734b = new cq.e(applicationContext, adParams);
    }

    public static final void access$notifyAdAppeared(e eVar) {
        if (eVar.f9733a.b(true)) {
            n.onUiThread(new b(eVar, 3));
        }
    }

    public static final void access$notifyAdClicked(e eVar) {
        eVar.f9733a.e();
        n.onUiThread(new b(eVar, 0));
    }

    public static final void access$notifyAdDisappeared(e eVar) {
        if (eVar.f9733a.b(false)) {
            n.onUiThread(new b(eVar, 6));
        }
    }

    public static final void access$notifyAdExpired(e eVar) {
        if (eVar.f9733a.k()) {
            n.onUiThread(new b(eVar, 4));
        }
    }

    public static final void access$notifyAdFailToLoad(e eVar, h0 h0Var) {
        if (eVar.f9733a.a(false)) {
            n.onUiThread(new d(eVar, h0Var, 0));
        }
    }

    public static final void access$notifyAdLoaded(e eVar) {
        if (eVar.f9733a.a(true)) {
            n.onUiThread(new b(eVar, 2));
        }
    }

    public static final void access$notifyAdShown(e eVar) {
        if (eVar.f9733a.i()) {
            n.onUiThread(new b(eVar, 1));
        }
    }

    public static final void access$notifyBrokenCreativeEvent(e eVar, z zVar) {
        if (eVar.f9733a.h()) {
            return;
        }
        n.onUiThread(new c(1, eVar, zVar));
    }

    public static final void access$notifyPrivacySheetOpen(e eVar, p1 p1Var) {
        eVar.getClass();
        n.onUiThread(new c(0, eVar, p1Var));
    }

    public final void attachActivity(Activity activity) {
        e0.checkNotNullParameter(activity, "activity");
        this.f9736d = new WeakReference(activity);
    }

    public final void destroy() {
        this.f9733a.a();
        this.f9734b.destroy();
        o.finishActivityWithoutAnimationSafely(getAttachedActivity());
        detachActivity();
    }

    public final void detachActivity() {
        WeakReference weakReference = this.f9736d;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f9736d = null;
    }

    public final Activity getAttachedActivity() {
        WeakReference weakReference = this.f9736d;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public final f getFullScreenAdListener() {
        return this.f9735c;
    }

    public final boolean isFinished() {
        return this.f9733a.g();
    }

    public final boolean isLoaded() {
        return this.f9733a.b();
    }

    public final void load() {
        if (this.f9733a.c()) {
            a aVar = new a();
            cq.e eVar = this.f9734b;
            eVar.setAdViewListener(aVar);
            eVar.load();
        }
    }

    public final void notifyAdFailToShow(h0 error) {
        e0.checkNotNullParameter(error, "error");
        n.onUiThread(new d(this, error, 1));
    }

    public final void processAdClosed() {
        o.finishActivityWithoutAnimationSafely(getAttachedActivity());
        detachActivity();
        h hVar = this.f9733a;
        if (hVar.b(false)) {
            n.onUiThread(new b(this, 6));
        }
        if (hVar.j()) {
            n.onUiThread(new b(this, 5));
        }
    }

    public final void setFullScreenAdListener(f fVar) {
        this.f9735c = fVar;
    }

    public final void setWatermark(Drawable drawable) {
        this.f9734b.setWatermark(drawable);
    }

    public final void show(Context context) {
        e0.checkNotNullParameter(context, "context");
        if (isLoaded()) {
            bq.a.startActivity(this, context);
        } else {
            notifyAdFailToShow(new h0("FullScreenAd not loaded"));
        }
    }

    public final void showInActivity(Activity activity) {
        e0.checkNotNullParameter(activity, "activity");
        attachActivity(activity);
        cq.e eVar = this.f9734b;
        q.setupActivityOrientation(activity, eVar.getRequiredOrientation());
        o.applyFullscreenActivity$default(activity, false, 1, null);
        x.removeFromParent(eVar);
        q.applyInsets(activity, eVar, false);
        activity.setContentView(eVar, t.createMatchParentParams());
    }
}
