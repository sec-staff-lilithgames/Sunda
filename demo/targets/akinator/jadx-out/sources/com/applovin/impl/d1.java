package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.applovin.creative.MaxCreativeDebuggerActivity;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.d;
import com.applovin.impl.l1;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class d1 implements l1.a {

    /* renamed from: m, reason: collision with root package name */
    private static WeakReference f13824m;

    /* renamed from: n, reason: collision with root package name */
    private static final AtomicBoolean f13825n = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f13826a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f13827b;

    /* renamed from: e, reason: collision with root package name */
    private final c1 f13830e;

    /* renamed from: g, reason: collision with root package name */
    private l1 f13832g;

    /* renamed from: h, reason: collision with root package name */
    private d7 f13833h;

    /* renamed from: i, reason: collision with root package name */
    private int f13834i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13835j;

    /* renamed from: k, reason: collision with root package name */
    private long f13836k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f13837l;

    /* renamed from: c, reason: collision with root package name */
    private final List f13828c = new ArrayList(10);

    /* renamed from: d, reason: collision with root package name */
    private final Object f13829d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private WeakReference f13831f = new WeakReference(null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends com.applovin.impl.b {
        public a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Started Creative Debugger");
                if (!d1.this.h() || d1.f13824m.get() != activity) {
                    MaxCreativeDebuggerActivity maxCreativeDebuggerActivity = (MaxCreativeDebuggerActivity) activity;
                    WeakReference unused = d1.f13824m = new WeakReference(maxCreativeDebuggerActivity);
                    maxCreativeDebuggerActivity.a(d1.this.f13830e, d1.this.f13826a.e());
                }
                d1.f13825n.set(false);
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Creative Debugger destroyed");
                WeakReference unused = d1.f13824m = null;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements d.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f13839a;

        public b(Object obj) {
            this.f13839a = obj;
        }

        @Override // com.applovin.impl.d.b
        public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
            maxCreativeDebuggerDisplayedAdActivity.a(new p1(this.f13839a, d1.this.f13826a.I().b()), d1.this.f13826a);
            d1.f13825n.set(false);
        }
    }

    public d1(com.applovin.impl.sdk.k kVar) {
        this.f13826a = kVar;
        Context contextO = com.applovin.impl.sdk.k.o();
        this.f13827b = contextO;
        this.f13830e = new c1(contextO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.f13836k);
        if (this.f13836k == 0 || seconds < 10) {
            return;
        }
        this.f13826a.E().a(c2.f13705d, "showingMediationDebuggerFromHoldingCreativeDebuggerButton");
        this.f13826a.Y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.f13834i = 0;
    }

    private void m() {
        this.f13826a.e().a(new a());
    }

    public void k() {
        l1 l1Var = this.f13832g;
        if (l1Var != null) {
            l1Var.b();
        }
    }

    public void l() {
        if (g()) {
            this.f13835j = ((Boolean) this.f13826a.a(v4.f15953j1)).booleanValue();
            if (this.f13832g == null) {
                this.f13832g = new l1(this.f13826a, this);
            }
            this.f13832g.a();
        }
    }

    public void n() {
        ArrayList arrayList;
        if (h() || !f13825n.compareAndSet(false, true)) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Creative Debugger is already showing");
            return;
        }
        Object objA = this.f13826a.I().a();
        if (objA != null) {
            e(objA);
            return;
        }
        synchronized (this.f13829d) {
            arrayList = new ArrayList(this.f13828c);
        }
        this.f13830e.a(arrayList, this.f13826a);
        if (!this.f13837l) {
            m();
            this.f13837l = true;
        }
        com.applovin.impl.sdk.o.g("AppLovinSdk", "Starting Creative Debugger...");
        d.a(this.f13827b, MaxCreativeDebuggerActivity.class);
    }

    private void e(Object obj) {
        com.applovin.impl.sdk.o.g("AppLovinSdk", "Starting Creative Debugger for current fullscreen ad...");
        d.a(this.f13827b, MaxCreativeDebuggerDisplayedAdActivity.class, this.f13826a.e(), new b(obj));
    }

    private Drawable f() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.rgb(5, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 170));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.rgb(2, 98, 127));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        WeakReference weakReference = f13824m;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public boolean g() {
        return ((Boolean) this.f13826a.a(v4.f15945i1)).booleanValue() && this.f13826a.o0().isCreativeDebuggerEnabled();
    }

    private boolean c(Object obj) {
        MaxAdFormat format;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            format = ((com.applovin.impl.sdk.ad.b) obj).getAdZone().d();
        } else {
            format = obj instanceof v2 ? ((v2) obj).getFormat() : null;
        }
        return format != null && format.isFullscreenAd();
    }

    @Override // com.applovin.impl.l1.a
    public void b() {
        if (this.f13834i == 0) {
            this.f13833h = d7.a(TimeUnit.SECONDS.toMillis(3L), this.f13826a, new w8(this, 1));
        }
        int i10 = this.f13834i;
        if (i10 % 2 == 0) {
            this.f13834i = i10 + 1;
        }
    }

    public void d(Object obj) {
        if (g() && obj != null) {
            if (!t3.a(obj) || c(obj)) {
                if (t3.b(obj) && c(obj)) {
                    return;
                }
                synchronized (this.f13829d) {
                    try {
                        this.f13828c.add(0, new p1(obj, System.currentTimeMillis()));
                        if (this.f13828c.size() > 10) {
                            this.f13828c.remove(r6.size() - 1);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (g() && this.f13831f.get() == null && !h()) {
            Activity activityB = this.f13826a.e().b();
            if (activityB == null) {
                this.f13826a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f13826a.O().b("AppLovinSdk", "Failed to display Creative Debugger button");
                }
            } else {
                View viewFindViewById = activityB.findViewById(R.id.content);
                if (viewFindViewById instanceof FrameLayout) {
                    FrameLayout frameLayout = (FrameLayout) viewFindViewById;
                    View viewA = a(frameLayout, activityB);
                    frameLayout.addView(viewA);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(150L);
                    viewA.startAnimation(alphaAnimation);
                    ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
                    x8 x8Var = new x8(this, 0, viewA, frameLayout);
                    viewTreeObserver.addOnGlobalLayoutListener(x8Var);
                    AppLovinSdkUtils.runOnUiThreadDelayed(new y8(this, viewA, frameLayout, viewTreeObserver, x8Var, 0), TimeUnit.SECONDS.toMillis(5L));
                    this.f13831f = new WeakReference(viewA);
                }
            }
        }
    }

    @Override // com.applovin.impl.l1.a
    public void a() {
        int i10 = this.f13834i;
        if (i10 % 2 == 1) {
            this.f13834i = i10 + 1;
        }
        if (this.f13834i / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new w8(this, 0));
            this.f13834i = 0;
            this.f13833h.a();
        }
    }

    private void b(View view, FrameLayout frameLayout) {
        if (this.f13835j) {
            view.setOnTouchListener(null);
            this.f13836k = 0L;
        }
        frameLayout.removeView(view);
        this.f13831f = new WeakReference(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, FrameLayout frameLayout) {
        if (view.getParent() != null || this.f13831f.get() == null) {
            return;
        }
        frameLayout.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, FrameLayout frameLayout, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (this.f13836k > 0 && this.f13835j) {
            view.setVisibility(4);
        } else {
            b(view, frameLayout);
        }
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public String b(Object obj) {
        JSONObject jSONObjectA;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            return ((com.applovin.impl.sdk.ad.b) obj).getOriginalFullResponse().toString();
        }
        if (!(obj instanceof v2)) {
            return null;
        }
        String strE = ((v2) obj).E();
        return (!t3.b(obj) || (jSONObjectA = new k(strE, this.f13826a).a()) == null) ? strE : jSONObjectA.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, android.widget.ImageButton, android.widget.ImageView] */
    private View a(final FrameLayout frameLayout, Activity activity) {
        Button button;
        int iDpToPx = AppLovinSdkUtils.dpToPx(activity, 40);
        int i10 = iDpToPx / 10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPx, iDpToPx, 8388629);
        layoutParams.setMargins(i10, i10, i10, i10);
        try {
            ?? imageButton = new ImageButton(activity);
            imageButton.setImageDrawable(activity.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_white_small));
            imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageButton.setPadding(i10, i10, i10, i10 * 2);
            button = imageButton;
        } catch (Throwable unused) {
            Button button2 = new Button(activity);
            button2.setText("ⓘ");
            button2.setTextColor(-1);
            button2.setAllCaps(false);
            button2.setTextSize(2, 20.0f);
            button2.setPadding(0, 0, 0, 0);
            button = button2;
        }
        button.setLayoutParams(layoutParams);
        button.setBackground(f());
        if (this.f13835j) {
            button.setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.z8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f16384b.a(frameLayout, view, motionEvent);
                }
            });
        } else {
            button.setOnClickListener(new a9(this, 0));
        }
        if (o0.e()) {
            button.setElevation(AppLovinSdkUtils.dpToPx(activity, 5));
        }
        return button;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(FrameLayout frameLayout, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f13836k = SystemClock.elapsedRealtime();
            AppLovinSdkUtils.runOnUiThreadDelayed(new w8(this, 2), TimeUnit.SECONDS.toMillis(10L));
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return true;
        }
        if (view.getVisibility() == 0) {
            this.f13836k = 0L;
            n();
            return true;
        }
        b(view, frameLayout);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.Serializable, java.lang.Object[]] */
    public void a(p1 p1Var, Context context, boolean z10) {
        Object objA = p1Var.a();
        String strA = a(p1Var);
        s2 s2Var = new s2();
        if (z10) {
            s2Var.b("Please describe the issue you had with this ad:\n\n\n\n");
        }
        s2Var.b(strA);
        String strB = this.f13826a.z().b(objA);
        if (strB != null) {
            s2Var.a("\nBid Response:\n");
            s2Var.a(strB);
        }
        Intent intentCreateChooser = Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.SUBJECT", objA instanceof com.applovin.impl.sdk.ad.b ? "AppLovin Ad Report" : "MAX Ad Report").putExtra("android.intent.extra.TEXT", s2Var.toString()).setPackage(null), "Share Ad Report");
        if (z10) {
            try {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:")).putExtra("android.intent.extra.SUBJECT", objA instanceof com.applovin.impl.sdk.ad.b ? "AppLovin Ad Report" : "MAX Ad Report").putExtra("android.intent.extra.TEXT", s2Var.toString()).setPackage("com.google.android.gm");
                String str = this.f13826a.o0().getExtraParameters().get("creative_debugger_email_recipients");
                if (StringUtils.isValidString(str)) {
                    intent.putExtra("android.intent.extra.EMAIL", (Serializable) CollectionUtils.explode(str).toArray());
                }
                context.startActivity(intent);
                return;
            } catch (ActivityNotFoundException unused) {
                context.startActivity(intentCreateChooser);
                return;
            }
        }
        context.startActivity(intentCreateChooser);
    }

    public String a(p1 p1Var) {
        Object objA = p1Var.a();
        s2 s2Var = new s2();
        s2Var.b("Ad Info:\n");
        if (objA instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) objA;
            s2Var.a(AndroidInitializeBoldSDK.MSG_NETWORK, "APPLOVIN").a(bVar).b(bVar);
        } else if (objA instanceof v2) {
            s2Var.a((v2) objA);
        }
        s2Var.a(this.f13826a);
        s2Var.a("Epoch Timestamp (ms)", Long.valueOf(p1Var.b()));
        s2Var.a("\nDebug Info:\n").a("Platform", "fireos".equals(this.f13826a.B().y()) ? "Fire OS" : "Android").a("AppLovin SDK Version", AppLovinSdk.VERSION).a("Plugin Version", this.f13826a.a(v4.I3)).a("App Package Name", this.f13827b.getPackageName()).a("Device", Build.BRAND + " " + Build.MODEL + " (" + Build.DEVICE + ")").a("OS Version", Build.VERSION.RELEASE).a("AppLovin Random Token", this.f13826a.i0()).a("Ad Review Version", j.b()).a(a(objA)).a("User ID", this.f13826a.x0().e() != null ? this.f13826a.x0().e() : "None").a("MD", this.f13826a.a(v4.f16031t));
        return s2Var.toString();
    }

    private Bundle a(Object obj) {
        this.f13826a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f13826a.O().a("CreativeDebuggerService", "Retrieving Ad Review info for ad: " + obj);
        }
        String strA = k7.a(obj);
        Bundle bundleA = this.f13826a.j().a(strA);
        this.f13826a.O();
        if (com.applovin.impl.sdk.o.a()) {
            b0.e2.y("Serve id: ", strA, this.f13826a.O(), "CreativeDebuggerService");
        }
        this.f13826a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f13826a.O().a("CreativeDebuggerService", "Public data: " + bundleA);
        }
        if (bundleA == null) {
            return null;
        }
        for (String str : bundleA.keySet()) {
            Object obj2 = bundleA.get(str);
            bundleA.remove(str);
            BundleUtils.put(StringUtils.toHumanReadableString(str), obj2, bundleA);
        }
        return bundleA;
    }
}
