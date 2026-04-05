package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ironsource.A8;
import com.ironsource.B7;
import com.ironsource.C3191e4;
import com.ironsource.C3219fe;
import com.ironsource.C3293k;
import com.ironsource.C3311l;
import com.ironsource.C3410q8;
import com.ironsource.C3422r4;
import com.ironsource.C3488v2;
import com.ironsource.C3494v8;
import com.ironsource.G5;
import com.ironsource.Mb;
import com.ironsource.Ng;
import com.ironsource.Q9;
import com.ironsource.Sc;
import com.ironsource.Z0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.og;
import com.ironsource.sdk.controller.v;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import io.ktor.util.cio.ByteBufferPoolKt;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class ControllerActivity extends Activity implements Sc, og {

    /* renamed from: n, reason: collision with root package name */
    private static final String f38386n = "ControllerActivity";

    /* renamed from: o, reason: collision with root package name */
    private static final int f38387o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static String f38388p = "removeWebViewContainerView | mContainer is null";

    /* renamed from: q, reason: collision with root package name */
    private static String f38389q = "removeWebViewContainerView | view is null";

    /* renamed from: a, reason: collision with root package name */
    private String f38390a;

    /* renamed from: b, reason: collision with root package name */
    private v f38391b;

    /* renamed from: c, reason: collision with root package name */
    private RelativeLayout f38392c;

    /* renamed from: d, reason: collision with root package name */
    private FrameLayout f38393d;

    /* renamed from: e, reason: collision with root package name */
    private B7 f38394e;

    /* renamed from: g, reason: collision with root package name */
    private String f38396g;

    /* renamed from: k, reason: collision with root package name */
    private Z0 f38400k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f38401l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f38402m;
    public int currentRequestedRotation = -1;

    /* renamed from: f, reason: collision with root package name */
    private boolean f38395f = false;

    /* renamed from: h, reason: collision with root package name */
    private Handler f38397h = new Handler();

    /* renamed from: i, reason: collision with root package name */
    private final Runnable f38398i = new a();

    /* renamed from: j, reason: collision with root package name */
    final RelativeLayout.LayoutParams f38399j = new RelativeLayout.LayoutParams(-1, -1);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(ControllerActivity.this.f38395f));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements View.OnSystemUiVisibilityChangeListener {
        public b() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i10) {
            if ((i10 & ByteBufferPoolKt.DEFAULT_BUFFER_SIZE) == 0) {
                ControllerActivity controllerActivity = ControllerActivity.this;
                controllerActivity.f38397h.removeCallbacks(controllerActivity.f38398i);
                ControllerActivity controllerActivity2 = ControllerActivity.this;
                controllerActivity2.f38397h.postDelayed(controllerActivity2.f38398i, 500L);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().addFlags(128);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().clearFlags(128);
        }
    }

    private boolean d() {
        return this.f38390a == null;
    }

    private void e() {
        runOnUiThread(new c());
    }

    private void f() throws Exception {
        ViewGroup viewGroup;
        try {
            if (this.f38392c == null) {
                throw new Exception(f38388p);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f38393d.getParent();
            View viewA = a(viewGroup2);
            if (viewA == null) {
                throw new Exception(f38389q);
            }
            if (isFinishing() && (viewGroup = (ViewGroup) viewA.getParent()) != null) {
                viewGroup.removeView(viewA);
            }
            viewGroup2.removeView(this.f38393d);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            A8.a(C3219fe.f36716s, new C3494v8().a(G5.A, e10.getMessage()).a());
            Logger.i(f38386n, "removeWebViewContainerView fail " + e10.getMessage());
        }
    }

    private void g() {
        int iK = this.f38394e.K(this);
        String str = f38386n;
        Logger.i(str, "setInitiateLandscapeOrientation");
        if (iK == 0) {
            Logger.i(str, "ROTATION_0");
            setRequestedOrientation(0);
            return;
        }
        if (iK == 2) {
            Logger.i(str, "ROTATION_180");
            setRequestedOrientation(8);
        } else if (iK == 3) {
            Logger.i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(8);
        } else if (iK != 1) {
            Logger.i(str, "No Rotation");
        } else {
            Logger.i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(0);
        }
    }

    private void h() {
        int iK = this.f38394e.K(this);
        String str = f38386n;
        Logger.i(str, "setInitiatePortraitOrientation");
        if (iK == 0) {
            Logger.i(str, "ROTATION_0");
            setRequestedOrientation(1);
            return;
        }
        if (iK == 2) {
            Logger.i(str, "ROTATION_180");
            setRequestedOrientation(9);
        } else if (iK == 1) {
            Logger.i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(1);
        } else if (iK != 3) {
            Logger.i(str, "No Rotation");
        } else {
            Logger.i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(1);
        }
    }

    @Override // com.ironsource.Sc
    public boolean onBackButtonPressed() {
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        Logger.i(f38386n, "onBackPressed");
        if (C3488v2.a().a(this)) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.ironsource.Sc
    public void onCloseRequested() {
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f38394e = Mb.U().i();
        try {
            new C3311l(this).a();
            new C3293k(this).a();
            v vVar = (v) Q9.b((Context) this).a().k();
            this.f38391b = vVar;
            vVar.r().setId(1);
            this.f38391b.a((Sc) this);
            this.f38391b.a((og) this);
            Intent intent = getIntent();
            this.f38396g = intent.getStringExtra(C3191e4.h.f36495m);
            this.f38395f = intent.getBooleanExtra(C3191e4.h.f36513v, false);
            this.f38390a = intent.getStringExtra("adViewId");
            this.f38401l = false;
            this.f38402m = intent.getBooleanExtra(C3191e4.h.f36522z0, false);
            if (this.f38395f) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new b());
                runOnUiThread(this.f38398i);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f38392c = relativeLayout;
            setContentView(relativeLayout, this.f38399j);
            this.f38393d = a(this.f38390a);
            if (this.f38392c.findViewById(1) == null && this.f38393d.getParent() != null) {
                finish();
            }
            c();
            this.f38392c.addView(this.f38393d, this.f38399j);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() throws Exception {
        super.onDestroy();
        String str = f38386n;
        Logger.i(str, "onDestroy");
        f();
        if (this.f38401l) {
            return;
        }
        Logger.i(str, "onDestroy | destroyedFromBackground");
        b();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4 && this.f38391b.x()) {
            this.f38391b.w();
            return true;
        }
        if (this.f38395f && (i10 == 25 || i10 == 24)) {
            this.f38397h.removeCallbacks(this.f38398i);
            this.f38397h.postDelayed(this.f38398i, 500L);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // com.ironsource.Sc
    public void onOrientationChanged(String str, int i10) {
        a(str, i10);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        Logger.i(f38386n, "onPause, isFinishing=" + isFinishing());
        t.a(this);
        v vVar = this.f38391b;
        if (vVar != null) {
            vVar.a((Context) this);
            if (!this.f38402m) {
                this.f38391b.A();
            }
            this.f38391b.a(false, C3191e4.h.Z);
            this.f38391b.g(this.f38396g, C3191e4.h.f36510t0);
        }
        if (isFinishing()) {
            this.f38401l = true;
            b();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Logger.i(f38386n, C3191e4.h.f36512u0);
        v vVar = this.f38391b;
        if (vVar != null) {
            vVar.b(this);
            if (!this.f38402m) {
                this.f38391b.E();
            }
            this.f38391b.a(true, C3191e4.h.Z);
            this.f38391b.g(this.f38396g, C3191e4.h.f36512u0);
        }
        t.b(this);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        Logger.i(f38386n, "onStart");
        v vVar = this.f38391b;
        if (vVar != null) {
            vVar.g(this.f38396g, "onStart");
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        Logger.i(f38386n, "onStop");
        v vVar = this.f38391b;
        if (vVar != null) {
            vVar.g(this.f38396g, "onStop");
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Logger.i(f38386n, "onUserLeaveHint");
        v vVar = this.f38391b;
        if (vVar != null) {
            vVar.g(this.f38396g, "onUserLeaveHint");
        }
    }

    @Override // com.ironsource.og
    public void onVideoEnded() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.og
    public void onVideoPaused() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.og
    public void onVideoResumed() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.og
    public void onVideoStarted() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.og
    public void onVideoStopped() {
        toggleKeepScreen(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (this.f38395f && z10) {
            runOnUiThread(this.f38398i);
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i10) {
        if (this.currentRequestedRotation != i10) {
            String str = f38386n;
            StringBuilder sbT = o2.t(i10, "Rotation: Req = ", " Curr = ");
            sbT.append(this.currentRequestedRotation);
            Logger.i(str, sbT.toString());
            this.currentRequestedRotation = i10;
            super.setRequestedOrientation(i10);
        }
    }

    public void toggleKeepScreen(boolean z10) {
        if (z10) {
            e();
        } else {
            a();
        }
    }

    private FrameLayout a(String str) {
        return !b(str) ? this.f38391b.r() : Ng.a(getApplicationContext(), C3410q8.a().a(str).getPresentingView());
    }

    private boolean b(String str) {
        return (TextUtils.isEmpty(str) || str.equals(Integer.toString(1))) ? false : true;
    }

    private void c() {
        Intent intent = getIntent();
        a(intent.getStringExtra(C3191e4.h.A), intent.getIntExtra(C3191e4.h.B, 0));
    }

    private void b() {
        String str = f38386n;
        Logger.i(str, "clearWebviewController");
        v vVar = this.f38391b;
        if (vVar == null) {
            Logger.i(str, "clearWebviewController, null");
            return;
        }
        vVar.a(v.u.Gone);
        this.f38391b.B();
        this.f38391b.C();
        this.f38391b.g(this.f38396g, "onDestroy");
    }

    private void a(String str, int i10) {
        if (str != null) {
            if ("landscape".equalsIgnoreCase(str)) {
                g();
                return;
            }
            if ("portrait".equalsIgnoreCase(str)) {
                h();
                return;
            }
            if (C3191e4.h.G.equalsIgnoreCase(str)) {
                if (this.f38394e.w(this)) {
                    setRequestedOrientation(1);
                }
            } else if (getRequestedOrientation() == -1) {
                setRequestedOrientation(4);
            }
        }
    }

    private View a(ViewGroup viewGroup) {
        if (d()) {
            return viewGroup.findViewById(1);
        }
        return C3410q8.a().a(this.f38390a).getPresentingView();
    }

    private void a() {
        runOnUiThread(new d());
    }
}
