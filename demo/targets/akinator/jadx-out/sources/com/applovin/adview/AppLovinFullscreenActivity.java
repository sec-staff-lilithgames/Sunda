package com.applovin.adview;

import a2.s;
import af.n;
import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
import android.webkit.WebView;
import android.window.OnBackInvokedCallback;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.b8;
import com.applovin.impl.c2;
import com.applovin.impl.d;
import com.applovin.impl.e;
import com.applovin.impl.e2;
import com.applovin.impl.g;
import com.applovin.impl.g0;
import com.applovin.impl.k7;
import com.applovin.impl.m1;
import com.applovin.impl.m2;
import com.applovin.impl.o0;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v1;
import com.applovin.impl.v4;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.C3191e4;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class AppLovinFullscreenActivity extends Activity implements m1 {

    /* renamed from: h, reason: collision with root package name */
    private static final Set f13360h = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: i, reason: collision with root package name */
    private static final Object f13361i = new Object();
    public static m2 parentInterstitialWrapper;

    /* renamed from: a, reason: collision with root package name */
    private k f13362a;

    /* renamed from: b, reason: collision with root package name */
    private v1 f13363b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f13364c = new AtomicBoolean(true);

    /* renamed from: d, reason: collision with root package name */
    private com.applovin.impl.adview.activity.a f13365d;

    /* renamed from: e, reason: collision with root package name */
    private c f13366e;

    /* renamed from: f, reason: collision with root package name */
    private g0 f13367f;

    /* renamed from: g, reason: collision with root package name */
    private long f13368g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Boolean f13369a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f13370b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.ad.b f13371c;

        public a(Boolean bool, boolean z10, com.applovin.impl.sdk.ad.b bVar) {
            this.f13369a = bool;
            this.f13370b = z10;
            this.f13371c = bVar;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            if (this.f13369a.booleanValue()) {
                AppLovinFullscreenActivity.this.a(windowInsets);
            }
            if (!this.f13370b) {
                Insets insets = windowInsets.getInsets(((Integer) AppLovinFullscreenActivity.this.f13362a.a(v4.f16026s2)).intValue());
                view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
                return windowInsets;
            }
            int iIntValue = ((Integer) AppLovinFullscreenActivity.this.f13362a.a(v4.f16026s2)).intValue();
            Insets insets2 = windowInsets.getInsets(this.f13371c.R0() ? iIntValue & (~WindowInsets.Type.displayCutout()) : iIntValue | WindowInsets.Type.displayCutout());
            view.setPadding(insets2.left, insets2.top, insets2.right, insets2.bottom);
            return windowInsets;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c implements OnBackInvokedCallback {

        /* renamed from: a, reason: collision with root package name */
        private final Runnable f13374a;

        public c(Runnable runnable) {
            this.f13374a = runnable;
        }

        public void onBackInvoked() {
            this.f13374a.run();
        }
    }

    @Override // com.applovin.impl.m1
    public void dismiss(String str) {
        if (o0.k() && this.f13366e != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f13366e);
            this.f13366e = null;
        }
        v1 v1Var = this.f13363b;
        if (v1Var != null) {
            v1Var.a(str);
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v1 v1Var = this.f13363b;
        if (v1Var != null) {
            v1Var.a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && parentInterstitialWrapper == null) {
            o.j("AppLovinFullscreenActivity", "Dismissing ad. Activity was destroyed while in background.");
            dismiss("activity_destroyed_while_in_background");
            return;
        }
        try {
            requestWindowFeature(1);
        } catch (Throwable th2) {
            o.c("AppLovinFullscreenActivity", "Failed to request window feature", th2);
        }
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        View viewFindViewById = findViewById(R.id.content);
        viewFindViewById.setBackgroundColor(-16777216);
        if (TextUtils.isEmpty(getIntent().getStringExtra("com.applovin.interstitial.sdk_key"))) {
            m2 m2Var = parentInterstitialWrapper;
            if (m2Var != null && m2Var.f() != null) {
                m2.a(parentInterstitialWrapper.f(), parentInterstitialWrapper.c(), "Empty SDK key", (Throwable) null, this);
            }
            finish();
            return;
        }
        this.f13362a = AppLovinSdk.getInstance(this).a();
        m2 m2Var2 = parentInterstitialWrapper;
        com.applovin.impl.sdk.ad.b bVarF = m2Var2 != null ? m2Var2.f() : null;
        Boolean bool = (Boolean) this.f13362a.a(v4.B4);
        boolean z10 = bVarF != null && bVarF.X0();
        if (o0.b() && (bool.booleanValue() || z10)) {
            getWindow().setDecorFitsSystemWindows(false);
            viewFindViewById.setOnApplyWindowInsetsListener(new a(bool, z10, bVarF));
            a(bVarF);
        } else {
            viewFindViewById.setFitsSystemWindows(true);
            if (o0.b()) {
                b8.a(viewFindViewById, this.f13362a);
            }
            a(bVarF);
        }
        if (bVarF != null && bVarF.B0()) {
            g.a(bVarF, this, this.f13362a);
        }
        if (o0.k() && ((Boolean) this.f13362a.a(v4.U5)).booleanValue()) {
            this.f13366e = new c(new s(this, 9));
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f13366e);
        }
        a();
        b();
        Integer num = (Integer) this.f13362a.a(v4.f16054v6);
        if (num.intValue() > 0) {
            synchronized (f13361i) {
                Set set = f13360h;
                set.add(this);
                k7.a("AppLovinFullscreenActivity", set.size(), num.intValue(), this.f13362a.E());
            }
        }
        m2 m2Var3 = parentInterstitialWrapper;
        if (m2Var3 != null) {
            v1.a(m2Var3.f(), parentInterstitialWrapper.b(), parentInterstitialWrapper.c(), parentInterstitialWrapper.d(), parentInterstitialWrapper.h(), this.f13362a, this, new b());
            return;
        }
        Intent intent = new Intent(this, (Class<?>) FullscreenAdService.class);
        com.applovin.impl.adview.activity.a aVar = new com.applovin.impl.adview.activity.a(this, this.f13362a);
        this.f13365d = aVar;
        bindService(intent, aVar, 1);
        if (o0.i()) {
            String str = this.f13362a.o0().getExtraParameters().get("disable_set_data_dir_suffix");
            if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
                return;
            }
            try {
                WebView.setDataDirectorySuffix(String.valueOf(Process.myPid()));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        k kVar = this.f13362a;
        if (kVar != null && ((Boolean) kVar.a(v4.f16050v2)).booleanValue()) {
            this.f13362a.q0().b(x4.M);
            this.f13362a.q0().b(x4.O);
            this.f13362a.q0().b(x4.P);
        }
        if (this.f13367f != null) {
            this.f13362a.q0().b(x4.N);
            this.f13367f.a();
            this.f13367f = null;
        }
        com.applovin.impl.adview.activity.a aVar = this.f13365d;
        if (aVar != null) {
            try {
                unbindService(aVar);
            } catch (Throwable unused) {
            }
        }
        v1 v1Var = this.f13363b;
        if (v1Var != null) {
            if (v1Var.f()) {
                this.f13363b.q();
            } else {
                long jA = this.f13363b.a();
                if (jA >= 0) {
                    if (jA == 0) {
                        this.f13363b.d(true);
                    }
                    AppLovinSdkUtils.runOnUiThreadDelayed(new n(17, this, parentInterstitialWrapper), jA);
                } else {
                    a(this.f13363b, false, false);
                }
            }
        }
        parentInterstitialWrapper = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        v1 v1Var = this.f13363b;
        if (v1Var != null) {
            v1Var.a(i10, keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        v1 v1Var = this.f13363b;
        if (v1Var != null) {
            v1Var.r();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        v1 v1Var;
        try {
            super.onResume();
            if (this.f13364c.get() || (v1Var = this.f13363b) == null) {
                return;
            }
            v1Var.s();
        } catch (IllegalArgumentException e10) {
            this.f13362a.O();
            if (o.a()) {
                this.f13362a.O().a("AppLovinFullscreenActivity", "Error was encountered in onResume().", e10);
            }
            this.f13362a.E().a("AppLovinFullscreenActivity", C3191e4.h.f36512u0, e10);
            dismiss("activity_on_resume_error");
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        v1 v1Var = this.f13363b;
        if (v1Var != null) {
            v1Var.t();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        if (this.f13363b != null) {
            if (!this.f13364c.getAndSet(false)) {
                this.f13363b.b(z10);
            }
            if (z10) {
                m2 m2Var = parentInterstitialWrapper;
                a(m2Var != null ? m2Var.f() : null);
            }
        }
        super.onWindowFocusChanged(z10);
    }

    public void setPresenter(v1 v1Var) {
        this.f13363b = v1Var;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements v1.g {
        public b() {
        }

        @Override // com.applovin.impl.v1.g
        public void a(v1 v1Var) {
            AppLovinFullscreenActivity.this.f13363b = v1Var;
            v1Var.v();
        }

        @Override // com.applovin.impl.v1.g
        public void a(String str, Throwable th2) {
            com.applovin.impl.sdk.ad.b bVarF = AppLovinFullscreenActivity.parentInterstitialWrapper.f();
            m2.a(bVarF, AppLovinFullscreenActivity.parentInterstitialWrapper.c(), str, th2, AppLovinFullscreenActivity.this);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "createAppLovinFullscreenActivity");
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            CollectionUtils.putStringIfValid("top_main_method", th2.toString(), mapHashMap);
            AppLovinFullscreenActivity.this.f13362a.g().a(c2.f13735s, bVarF, mapHashMap);
        }
    }

    private void b() {
        k kVar = this.f13362a;
        if (kVar == null || !((Boolean) kVar.a(v4.f16058w2)).booleanValue()) {
            return;
        }
        Long l9 = (Long) this.f13362a.a(v4.f16066x2);
        this.f13367f = g0.a(l9.longValue(), true, this.f13362a, new n(16, this, l9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        v1 v1Var = this.f13363b;
        if (v1Var != null) {
            v1Var.p();
        }
        if (k7.g(getApplicationContext())) {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WindowInsets windowInsets) {
        o0.a aVarA = o0.a(windowInsets, this.f13362a);
        o0.a aVarC = o0.c(windowInsets, this.f13362a);
        o0.a aVarB = o0.b(windowInsets, this.f13362a);
        String strB = k7.b(this);
        o0.a(aVarA, strB);
        o0.c(aVarC, strB);
        o0.b(aVarB, strB);
        v1 v1Var = this.f13363b;
        if (v1Var != null) {
            v1Var.a(aVarA, aVarC, aVarB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(m2 m2Var) {
        boolean zX = this.f13363b.x();
        boolean zI = (m2Var == null || !zX) ? false : m2Var.i();
        if (!zI) {
            this.f13363b.d(false);
        }
        a(this.f13363b, zX, zI);
    }

    private void a(v1 v1Var, boolean z10, boolean z11) {
        v1Var.a("activity_destroyed_by_app_relaunch");
        if (this.f13362a != null) {
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "onDestroyAppLovinFullScreenActivity");
            m2 m2Var = parentInterstitialWrapper;
            com.applovin.impl.sdk.ad.b bVarF = m2Var != null ? m2Var.f() : null;
            mapHashMap.putAll(e2.a((AppLovinAdImpl) bVarF));
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putBoolean(jSONObject, "reshow_attempted", z10);
            JsonUtils.putBoolean(jSONObject, "reshow_success", z11);
            if (bVarF != null) {
                JsonUtils.putInt(jSONObject, "reshow_count", bVarF.b0());
            }
            mapHashMap.put("details", jSONObject.toString());
            this.f13362a.E().d(c2.f13728o0, mapHashMap);
        }
        v1Var.q();
    }

    private void a() {
        m2 m2Var;
        k kVar = this.f13362a;
        if (kVar == null || !((Boolean) kVar.a(v4.f16050v2)).booleanValue() || (m2Var = parentInterstitialWrapper) == null || m2Var.f() == null) {
            return;
        }
        com.applovin.impl.sdk.ad.b bVarF = parentInterstitialWrapper.f();
        List listJ = bVarF.j();
        if (CollectionUtils.isEmpty(listJ)) {
            return;
        }
        e eVar = (e) listJ.get(0);
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_url", eVar.c());
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_backup_url", eVar.a());
        this.f13362a.q0().b(x4.O, jSONObject.toString());
        this.f13362a.q0().b(x4.M, Long.valueOf(System.currentTimeMillis()));
        this.f13362a.q0().b(x4.P, CollectionUtils.toJsonString(e2.a((AppLovinAdImpl) bVarF), "{}"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l9) {
        this.f13368g = l9.longValue() + this.f13368g;
        this.f13362a.q0().b(x4.N, Long.valueOf(this.f13368g));
    }

    private void a(com.applovin.impl.sdk.ad.b bVar) {
        if (o0.b() && bVar != null && bVar.X0()) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
            if (bVar.h1() && bVar.f1()) {
                d.c(this);
                return;
            } else if (bVar.h1()) {
                d.b((Activity) this);
                return;
            } else {
                if (bVar.f1()) {
                    d.a((Activity) this);
                    return;
                }
                return;
            }
        }
        getWindow().setFlags(1024, 1024);
        d.c(this);
    }
}
