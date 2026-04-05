package com.applovin.impl;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenImmersiveActivity;
import com.applovin.impl.adview.a;
import com.applovin.impl.adview.e;
import com.applovin.impl.b6;
import com.applovin.impl.h0;
import com.applovin.impl.o0;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.i;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class v1 implements AppLovinBroadcastManager.Receiver, a.b {
    protected int A;
    protected boolean B;
    private ContentObserver C;
    private Float D;
    protected AppLovinAdClickListener E;
    protected AppLovinAdDisplayListener F;
    protected AppLovinAdVideoPlaybackListener G;
    protected d7 H;
    protected d7 I;
    protected boolean J;
    private final h0 K;
    private boolean L;

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.b f15831a;

    /* renamed from: b, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f15832b;

    /* renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.o f15833c;

    /* renamed from: d, reason: collision with root package name */
    protected Activity f15834d;

    /* renamed from: e, reason: collision with root package name */
    private final int f15835e;

    /* renamed from: f, reason: collision with root package name */
    private final Handler f15836f;

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.b f15837g;

    /* renamed from: h, reason: collision with root package name */
    private final i.a f15838h;

    /* renamed from: i, reason: collision with root package name */
    protected AppLovinAdView f15839i;

    /* renamed from: j, reason: collision with root package name */
    protected com.applovin.impl.adview.k f15840j;

    /* renamed from: k, reason: collision with root package name */
    protected final com.applovin.impl.adview.g f15841k;

    /* renamed from: l, reason: collision with root package name */
    protected final com.applovin.impl.adview.g f15842l;

    /* renamed from: m, reason: collision with root package name */
    protected final long f15843m;

    /* renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f15844n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f15845o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f15846p;

    /* renamed from: q, reason: collision with root package name */
    protected long f15847q;

    /* renamed from: r, reason: collision with root package name */
    protected long f15848r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f15849s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f15850t;

    /* renamed from: u, reason: collision with root package name */
    protected int f15851u;

    /* renamed from: v, reason: collision with root package name */
    protected boolean f15852v;

    /* renamed from: w, reason: collision with root package name */
    private int f15853w;

    /* renamed from: x, reason: collision with root package name */
    private final ArrayList f15854x;

    /* renamed from: y, reason: collision with root package name */
    protected int f15855y;

    /* renamed from: z, reason: collision with root package name */
    protected int f15856z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements AppLovinAdDisplayListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.o oVar = v1.this.f15833c;
            if (com.applovin.impl.sdk.o.a()) {
                v1.this.f15833c.a("AppLovinFullscreenActivity", "Web content rendered");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.o oVar = v1.this.f15833c;
            if (com.applovin.impl.sdk.o.a()) {
                v1.this.f15833c.a("AppLovinFullscreenActivity", "Closing from WebView");
            }
            v1.this.a("web_view");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements i.a {
        public b() {
        }

        @Override // com.applovin.impl.sdk.i.a
        public void a(int i10) {
            v1 v1Var = v1.this;
            if (v1Var.A != com.applovin.impl.sdk.i.f15436h) {
                v1Var.B = true;
            }
            com.applovin.impl.adview.b bVarF = v1Var.f15839i.getController().f();
            if (bVarF == null) {
                com.applovin.impl.sdk.o oVar = v1.this.f15833c;
                if (com.applovin.impl.sdk.o.a()) {
                    v1.this.f15833c.k("AppLovinFullscreenActivity", "Unable to handle ringer mode change: no valid web view.");
                }
            } else if (com.applovin.impl.sdk.i.a(i10) && !com.applovin.impl.sdk.i.a(v1.this.A)) {
                bVarF.a("javascript:al_muteSwitchOn();");
            } else if (i10 == 2) {
                bVarF.a("javascript:al_muteSwitchOff();");
            }
            v1.this.A = i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends com.applovin.impl.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f15859a;

        public c(com.applovin.impl.sdk.k kVar) {
            this.f15859a = kVar;
        }

        private boolean a(Activity activity) {
            return activity.getClass().getName().equals(k7.a(activity.getApplicationContext(), "AppLovinFullscreenActivity", this.f15859a));
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (!v1.this.y() && a(activity)) {
                v1.this.c();
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (v1.this.y() && a(activity)) {
                v1.this.c();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d extends ContentObserver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f15861a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Handler handler, com.applovin.impl.sdk.k kVar) {
            super(handler);
            this.f15861a = kVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            Float fB = this.f15861a.q().b();
            if (fB == null || v1.this.D == null || fB.equals(v1.this.D)) {
                return;
            }
            String str = fB.floatValue() > v1.this.D.floatValue() ? "volume_up" : "volume_down";
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putDouble(jSONObject, "volume", fB.floatValue());
            v1.this.e("javascript:al_onVolumeChangedEvent('" + str + "'," + jSONObject + ");");
            v1.this.D = fB;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e extends com.applovin.impl.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q4 f15863a;

        public e(q4 q4Var) {
            this.f15863a = q4Var;
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (activity instanceof AppLovinFullscreenActivity) {
                this.f15863a.b(null);
                v1.this.f15832b.e().b(this);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface g {
        void a(v1 v1Var);

        void a(String str, Throwable th2);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class h implements AppLovinAdClickListener, View.OnClickListener {
        private h() {
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.o oVar = v1.this.f15833c;
            if (com.applovin.impl.sdk.o.a()) {
                v1.this.f15833c.a("AppLovinFullscreenActivity", "Clicking through graphic");
            }
            q2.a(v1.this.E, appLovinAd);
            v1.this.f15856z++;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            v1 v1Var = v1.this;
            if (view != v1Var.f15841k || !((Boolean) v1Var.f15832b.a(v4.V1)).booleanValue()) {
                com.applovin.impl.sdk.o oVar = v1.this.f15833c;
                if (com.applovin.impl.sdk.o.a()) {
                    v1.this.f15833c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                    return;
                }
                return;
            }
            v1.e(v1.this);
            if (v1.this.f15831a.b1()) {
                v1.this.e("javascript:al_onCloseButtonTapped(" + v1.this.f15853w + "," + v1.this.f15855y + "," + v1.this.f15856z + ");");
            }
            List listP = v1.this.f15831a.P();
            com.applovin.impl.sdk.o oVar2 = v1.this.f15833c;
            if (com.applovin.impl.sdk.o.a()) {
                v1.this.f15833c.a("AppLovinFullscreenActivity", "Handling close button tap " + v1.this.f15853w + " with multi close delay: " + listP);
            }
            if (listP == null || listP.size() <= v1.this.f15853w) {
                v1.this.a("native_close_button");
                return;
            }
            v1.this.f15854x.add(Long.valueOf(SystemClock.elapsedRealtime() - v1.this.f15847q));
            List listN = v1.this.f15831a.N();
            if (listN != null && listN.size() > v1.this.f15853w) {
                v1 v1Var2 = v1.this;
                v1Var2.f15841k.a((e.a) listN.get(v1Var2.f15853w));
            }
            com.applovin.impl.sdk.o oVar3 = v1.this.f15833c;
            if (com.applovin.impl.sdk.o.a()) {
                v1.this.f15833c.a("AppLovinFullscreenActivity", "Scheduling next close button with delay: " + listP.get(v1.this.f15853w));
            }
            v1.this.f15841k.setVisibility(8);
            v1 v1Var3 = v1.this;
            v1Var3.a(v1Var3.f15841k, ((Integer) listP.get(v1Var3.f15853w)).intValue(), new m9(this, 2));
        }

        public /* synthetic */ h(v1 v1Var, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            v1.this.f15847q = SystemClock.elapsedRealtime();
        }
    }

    public v1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f15836f = handler;
        this.f15843m = SystemClock.elapsedRealtime();
        this.f15844n = new AtomicBoolean();
        this.f15845o = new AtomicBoolean();
        this.f15847q = -1L;
        this.f15853w = 0;
        this.f15854x = new ArrayList();
        this.f15855y = 0;
        this.f15856z = 0;
        this.A = com.applovin.impl.sdk.i.f15436h;
        this.L = false;
        this.f15831a = bVar;
        this.f15832b = kVar;
        this.f15833c = kVar.O();
        this.f15834d = activity;
        this.f15835e = bVar.b0();
        this.E = appLovinAdClickListener;
        this.F = appLovinAdDisplayListener;
        this.G = appLovinAdVideoPlaybackListener;
        this.K = new h0(kVar);
        h hVar = new h(this, null);
        if (((Boolean) kVar.a(v4.f15970l2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
        }
        if (((Boolean) kVar.a(v4.f16018r2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.al_onPoststitialShow_evaluation_error"));
        }
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_shown"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_hidden"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_failure"));
        t1 t1Var = new t1(kVar.z0(), AppLovinAdSize.INTERSTITIAL, activity);
        this.f15839i = t1Var;
        t1Var.setAdClickListener(hVar);
        this.f15839i.setAdDisplayListener(new a());
        bVar.h().putString("ad_view_address", b8.a(this.f15839i));
        this.f15839i.getController().a(this);
        b2 b2Var = new b2(map, kVar);
        if (b2Var.c()) {
            this.f15840j = new com.applovin.impl.adview.k(b2Var, activity);
        }
        kVar.k().trackImpression(bVar);
        List listP = bVar.P();
        if (bVar.s() >= 0 || listP != null) {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.q(), activity);
            this.f15841k = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(hVar);
        } else {
            this.f15841k = null;
        }
        com.applovin.impl.adview.g gVar2 = new com.applovin.impl.adview.g(e.a.WHITE_ON_TRANSPARENT, activity);
        this.f15842l = gVar2;
        gVar2.setOnClickListener(new a9(this, 2));
        if (bVar.i1()) {
            this.f15838h = new b();
        } else {
            this.f15838h = null;
        }
        this.f15837g = new c(kVar);
        if (bVar.e1()) {
            this.D = kVar.q().b();
            this.C = new d(handler, kVar);
            activity.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI.buildUpon().appendPath("volume_music_speaker").build(), false, this.C);
        }
    }

    private void A() {
        if (this.f15838h != null) {
            this.f15832b.q().a(this.f15838h);
        }
        if (this.f15837g != null) {
            this.f15832b.e().a(this.f15837g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y() {
        return a() >= 0;
    }

    public abstract void a(ViewGroup viewGroup);

    public abstract void b(long j10);

    public abstract void l();

    public void o() {
        com.applovin.impl.adview.b bVarF;
        if (this.f15839i == null || !this.f15831a.D0() || (bVarF = this.f15839i.getController().f()) == null) {
            return;
        }
        this.K.a(bVarF, new f());
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        switch (action) {
            case "com.applovin.al_onPoststitialShow_evaluation_error":
                d();
                break;
            case "com.applovin.custom_intent_launch_failure":
            case "com.applovin.custom_intent_launch_success":
                a(action, map);
                break;
            case "com.applovin.external_redirect_success":
            case "com.applovin.external_redirect_failure":
                c(action, map);
                break;
            case "com.applovin.custom_tabs_failure":
            case "com.applovin.custom_tabs_hidden":
            case "com.applovin.custom_tabs_shown":
                b(action, map);
                break;
            case "com.applovin.render_process_gone":
                if (!this.f15850t) {
                    e();
                    break;
                }
                break;
            case "com.applovin.preload_success":
            case "com.applovin.preload_failure":
                d(action, map);
                break;
        }
    }

    public void p() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f15833c.d("AppLovinFullscreenActivity", "onBackPressed()");
        }
        if (this.L) {
            a("back_button");
        }
        if (this.f15831a.b1()) {
            e("javascript:onBackPressed();");
        }
    }

    public void q() {
        AppLovinAdView appLovinAdView = this.f15839i;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            this.f15839i.destroy();
            this.f15839i = null;
            if ((parent instanceof ViewGroup) && h()) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        l();
        k();
        this.E = null;
        this.F = null;
        this.G = null;
        this.f15834d = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public void r() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f15833c.d("AppLovinFullscreenActivity", "onPause()");
        }
        d("javascript:al_onAppPaused();");
        m();
    }

    public void s() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f15833c.d("AppLovinFullscreenActivity", "onResume()");
        }
        d("javascript:al_onAppResumed();");
        n();
    }

    public void t() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f15833c.d("AppLovinFullscreenActivity", "onStop()");
        }
    }

    public abstract void u();

    public abstract void v();

    public void w() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f15833c.d("AppLovinFullscreenActivity", "Setting ad fully watched");
        }
        this.J = true;
    }

    public boolean x() {
        return this.f15846p;
    }

    public abstract void z();

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (!y()) {
            f("app_relaunch");
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f15833c.d("AppLovinFullscreenActivity", "App relaunch detected with launcher activity. Will attempt to re-show the ad");
        }
        this.f15846p = true;
        long jF = this.f15831a.f();
        if (jF < 0) {
            return;
        }
        a(new ja(this, 0), jF);
    }

    public static /* synthetic */ int e(v1 v1Var) {
        int i10 = v1Var.f15853w;
        v1Var.f15853w = i10 + 1;
        return i10;
    }

    private void f(String str) {
        if (this.f15845o.get()) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new la(this, str, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        if (this.f15831a.b0() <= this.f15835e && !com.applovin.impl.d.d(this.f15834d)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f15833c.d("AppLovinFullscreenActivity", "Ad reshow timed out. Will attempt to bring existing ad activity to front.");
            }
            this.f15846p = false;
            long jC = this.f15831a.c();
            if (jC > 0) {
                a(jC).a(q4.f15128h, new q9(this, 5));
            } else {
                f("app_relaunch_reshow_timed_out");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        if (this.f15831a.L0().getAndSet(true)) {
            return;
        }
        this.f15832b.r0().a((g5) new k6(this.f15831a, this.f15832b), b6.b.OTHER);
    }

    public void b(boolean z10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f15833c.d("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z10);
        }
        d("javascript:al_onWindowFocusChanged( " + z10 + " );");
        d7 d7Var = this.I;
        if (d7Var != null) {
            if (z10) {
                d7Var.e();
            } else {
                d7Var.d();
            }
        }
    }

    public boolean g() {
        return AppLovinAdType.INCENTIVIZED == this.f15831a.getType();
    }

    public boolean h() {
        return this.f15834d instanceof AppLovinFullscreenActivity;
    }

    public void k() {
        if (!this.f15846p && this.f15845o.compareAndSet(false, true)) {
            q2.b(this.F, this.f15831a);
            this.f15832b.I().b(this.f15831a);
            HashMap map = new HashMap();
            com.applovin.impl.sdk.ad.b bVar = this.f15831a;
            if (bVar != null) {
                CollectionUtils.putStringIfValid("source", bVar.F(), map);
                CollectionUtils.putStringIfValid("details", e2.b(this.f15831a), map);
            }
            this.f15832b.g().a(c2.f13737t, this.f15831a, map);
        }
    }

    public void m() {
        d7 d7Var = this.H;
        if (d7Var != null) {
            d7Var.d();
        }
    }

    public void n() {
        d7 d7Var = this.H;
        if (d7Var != null) {
            d7Var.e();
        }
    }

    public void d(boolean z10) {
        this.f15846p = z10;
    }

    public void e(String str) {
        a(str, 0L);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f implements h0.c {
        public f() {
        }

        @Override // com.applovin.impl.h0.c
        public void a(int i10, int i11) {
            Map mapA = e2.a((AppLovinAdImpl) v1.this.f15831a);
            mapA.putAll(e2.a(v1.this.f15831a));
            mapA.put("details", "detection_count=" + i10 + ",total_checks=" + i11);
            v1.this.f15832b.E().d(c2.f13746x0, mapA);
        }

        @Override // com.applovin.impl.h0.c
        public void a(int i10, int i11, int i12) {
            Map mapA = e2.a((AppLovinAdImpl) v1.this.f15831a);
            mapA.putAll(e2.a(v1.this.f15831a));
            mapA.put("details", "detections_to_report=" + i10 + ",detection_count=" + i11 + ",total_checks=" + i12);
            v1.this.f15832b.E().d(c2.f13748y0, mapA);
            if (((Boolean) v1.this.f15832b.a(v4.f15926f6)).booleanValue()) {
                v1.this.w();
            }
            if (((Boolean) v1.this.f15832b.a(v4.P0)).booleanValue()) {
                v1.this.f15832b.H().c(v1.this.f15831a, com.applovin.impl.sdk.k.o());
            }
            if (((Boolean) v1.this.f15832b.a(v4.f15892b6)).booleanValue()) {
                v1.this.a("black_view_auto_dismiss");
                return;
            }
            v1 v1Var = v1.this;
            v1Var.L = ((Boolean) v1Var.f15832b.a(v4.f15901c6)).booleanValue();
            if (((Boolean) v1.this.f15832b.a(v4.f15910d6)).booleanValue()) {
                v1.this.z();
            }
        }
    }

    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, Map map, com.applovin.impl.sdk.k kVar, Activity activity, g gVar) {
        v1 y1Var;
        if (bVar instanceof l7) {
            try {
                y1Var = new y1(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th2) {
                gVar.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + kVar + " and throwable: " + th2.getMessage(), th2);
                return;
            }
        } else if (bVar.hasVideoUrl()) {
            try {
                y1Var = new z1(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th3) {
                gVar.a("Failed to create FullscreenVideoAdPresenter with sdk: " + kVar + " and throwable: " + th3.getMessage(), th3);
                return;
            }
        } else {
            try {
                y1Var = new w1(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th4) {
                gVar.a("Failed to create FullscreenGraphicAdPresenter with sdk: " + kVar + " and throwable: " + th4.getMessage(), th4);
                return;
            }
        }
        y1Var.A();
        gVar.a(y1Var);
    }

    public void d(String str) {
        if (this.f15831a.H0()) {
            a(str, 0L);
        }
    }

    public void e() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f15833c.d("AppLovinFullscreenActivity", "Handling render process crash");
        }
        this.f15850t = true;
    }

    public boolean f() {
        return this.f15849s;
    }

    public void d() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f15833c.d("AppLovinFullscreenActivity", "Handling al_onPoststitialShow evaluation error");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        com.applovin.impl.adview.b bVarF;
        AppLovinAdView appLovinAdView = this.f15839i;
        if (appLovinAdView == null || (bVarF = appLovinAdView.getController().f()) == null) {
            return;
        }
        bVarF.a(str);
    }

    private void d(String str, Map map) {
        e(l8.d(str, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        com.applovin.impl.sdk.o.h("AppLovinFullscreenActivity", "Dismissing on-screen ad due to " + str);
        try {
            a(str);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("AppLovinFullscreenActivity", "Failed to dismiss ad.", th2);
            try {
                k();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(com.applovin.impl.adview.g gVar, Runnable runnable) {
        b8.a(gVar, 400L, new ka(gVar, runnable, 2));
    }

    public int b() {
        int iU = this.f15831a.u();
        return (iU <= 0 && ((Boolean) this.f15832b.a(v4.f15954j2)).booleanValue()) ? this.f15851u + 1 : iU;
    }

    public void c(boolean z10) {
        a(z10, ((Long) this.f15832b.a(v4.f15962k2)).longValue());
        if (!this.f15831a.C0()) {
            q2.a(this.F, this.f15831a);
        }
        this.f15832b.I().a(this.f15831a);
        if (!this.f15831a.C0() && (this.f15831a.hasVideoUrl() || g())) {
            q2.a(this.G, this.f15831a);
        }
        new k4(this.f15834d).a(this.f15831a);
        this.f15831a.setHasShown(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a("backup_close_button");
    }

    private void b(String str, Map map) {
        e(l8.b(str, map));
    }

    public long a() {
        com.applovin.impl.sdk.ad.b bVar = this.f15831a;
        if (bVar == null) {
            return -1L;
        }
        return bVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10, Void r22, Void r32) {
        if (z10) {
            return;
        }
        f("app_relaunch_bring_to_front_failed");
    }

    private q4 a(long j10) {
        q4 q4Var = new q4("bringAdActivityToFront");
        e eVar = new e(q4Var);
        this.f15832b.e().a(eVar);
        Intent intent = new Intent(this.f15834d, (Class<?>) (this.f15831a.X0() ? AppLovinFullscreenImmersiveActivity.class : AppLovinFullscreenActivity.class));
        intent.setFlags(131072);
        this.f15834d.startActivity(intent);
        a(new androidx.browser.customtabs.g(this, 23, eVar, q4Var), j10);
        return q4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(com.applovin.impl.adview.g gVar, Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new ka(gVar, runnable, 1));
    }

    public void c(long j10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f15833c.a("AppLovinFullscreenActivity", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j10) + " seconds...");
        }
        this.H = d7.a(j10, this.f15832b, new ja(this, 1));
    }

    private void c(String str, Map map) {
        e(l8.c(str, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.b bVar, q4 q4Var) {
        this.f15832b.e().b(bVar);
        if (q4Var.c()) {
            return;
        }
        q4Var.a((Object) null);
    }

    public boolean a(boolean z10) {
        List listA = k7.a(z10, this.f15831a, this.f15832b, this.f15834d);
        if (listA.isEmpty()) {
            return false;
        }
        String str = "Missing ad resources: " + listA;
        Map mapA = e2.a((AppLovinAdImpl) this.f15831a);
        if (((Boolean) this.f15832b.a(v4.H5)).booleanValue()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f15833c.b("AppLovinFullscreenActivity", "Dismissing ad due to missing resources: " + listA);
            }
            if (((Boolean) this.f15832b.a(v4.K5)).booleanValue()) {
                AppLovinAdDisplayListener appLovinAdDisplayListener = this.F;
                if (appLovinAdDisplayListener instanceof k2) {
                    q2.a(appLovinAdDisplayListener, "Missing ad resources");
                }
            } else {
                m2.a(this.f15831a, this.F, "Missing ad resources", (Throwable) null, (AppLovinFullscreenActivity) null);
            }
            a("missing_ad_resources");
            a(str, "Failing ad display", mapA);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "missingCachedAdResources");
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            this.f15832b.g().a(c2.f13735s, this.f15831a, mapHashMap);
            return ((Boolean) this.f15832b.a(v4.J5)).booleanValue();
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f15833c.b("AppLovinFullscreenActivity", "Streaming ad due to missing ad resources: " + listA);
        }
        this.f15831a.Q0();
        a(str, "Streaming ad", mapA);
        return false;
    }

    public void a(o0.a aVar, o0.a aVar2, o0.a aVar3) {
        if (((Boolean) this.f15832b.a(v4.B4)).booleanValue()) {
            HashMap map = new HashMap();
            map.put("orientation", k7.b(this.f15834d));
            if (aVar != null) {
                map.put("display_cutout_insets", aVar.e());
            }
            if (aVar2 != null) {
                map.put("status_bar_insets", aVar2.e());
            }
            if (aVar3 != null) {
                map.put("nav_bar_insets", aVar3.e());
            }
            e(l8.a(map));
        }
    }

    public void a(String str) {
        this.f15849s = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f15843m;
        if (com.applovin.impl.sdk.o.a()) {
            this.f15833c.d("AppLovinFullscreenActivity", "Dismissing ad after " + TimeUnit.MILLISECONDS.toSeconds(jElapsedRealtime) + " seconds from source: " + str);
        }
        com.applovin.impl.sdk.ad.b bVar = this.f15831a;
        if (bVar != null) {
            bVar.getAdEventTracker().f();
        }
        this.f15836f.removeCallbacksAndMessages(null);
        a("javascript:al_onPoststitialDismiss();", this.f15831a != null ? r0.G() : 0L);
        if (((Boolean) this.f15832b.a(v4.D6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar2 = this.f15831a;
            if (bVar2 != null) {
                bVar2.a(str);
            }
            l();
        }
        k();
        this.K.b();
        if (this.f15838h != null) {
            this.f15832b.q().b(this.f15838h);
        }
        if (this.f15837g != null) {
            this.f15832b.e().b(this.f15837g);
        }
        if (this.C != null) {
            this.f15834d.getContentResolver().unregisterContentObserver(this.C);
            this.C = null;
        }
        if (h()) {
            this.f15834d.finish();
            return;
        }
        this.f15832b.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f15832b.O().a("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
        }
        q();
    }

    public void a(Configuration configuration) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f15833c.d("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
        }
    }

    public void a(int i10, KeyEvent keyEvent) {
        if (this.f15833c == null || !com.applovin.impl.sdk.o.a()) {
            return;
        }
        this.f15833c.d("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i10 + ", " + keyEvent);
    }

    public void a(String str, long j10) {
        if (j10 < 0 || !StringUtils.isValidString(str)) {
            return;
        }
        a(new la(this, str, 0), j10);
    }

    public void a(com.applovin.impl.adview.g gVar, long j10, Runnable runnable) {
        if (j10 >= ((Long) this.f15832b.a(v4.U1)).longValue()) {
            return;
        }
        this.I = d7.a(TimeUnit.SECONDS.toMillis(j10), this.f15832b, new ka(gVar, runnable, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.adview.g gVar, Runnable runnable) {
        gVar.bringToFront();
        runnable.run();
    }

    public void a(int i10, boolean z10, boolean z11, long j10) {
        if (!this.f15846p && this.f15844n.compareAndSet(false, true)) {
            if (this.f15831a.hasVideoUrl() || g()) {
                q2.a(this.G, this.f15831a, i10, z11);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f15843m;
            this.f15832b.k().trackVideoEnd(this.f15831a, TimeUnit.MILLISECONDS.toSeconds(jElapsedRealtime), i10, z10);
            long jElapsedRealtime2 = this.f15847q != -1 ? SystemClock.elapsedRealtime() - this.f15847q : -1L;
            this.f15832b.k().trackFullScreenAdClosed(this.f15831a, jElapsedRealtime2, this.f15854x, j10, this.B, this.A);
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVar = this.f15833c;
                StringBuilder sb2 = new StringBuilder("Video ad ended at percent: ");
                sb2.append(i10);
                sb2.append("%, elapsedTime: ");
                sb2.append(jElapsedRealtime);
                b0.e2.A(sb2, "ms, skipTimeMillis: ", j10, "ms, closeTimeMillis: ");
                oVar.a("AppLovinFullscreenActivity", a.b.g(jElapsedRealtime2, "ms", sb2));
            }
        }
    }

    private void a(String str, String str2, Map map) {
        HashMap map2 = new HashMap(map);
        CollectionUtils.putStringIfValid("error_message", str, map2);
        CollectionUtils.putStringIfValid("details", str2, map2);
        this.f15832b.E().a(c2.f13750z0, "missingCachedAdResources", map2);
    }

    @Override // com.applovin.impl.adview.a.b
    public void a(com.applovin.impl.adview.a aVar) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f15833c.a("AppLovinFullscreenActivity", "Fully watched from ad web view...");
        }
        this.J = true;
    }

    public void a(boolean z10, long j10) {
        if (this.f15831a.T0()) {
            a(z10 ? "javascript:al_mute();" : "javascript:al_unmute();", j10);
        }
    }

    private void a(String str, Map map) {
        e(l8.a(str, map));
    }

    public void a(Runnable runnable, long j10) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j10, this.f15836f);
    }
}
