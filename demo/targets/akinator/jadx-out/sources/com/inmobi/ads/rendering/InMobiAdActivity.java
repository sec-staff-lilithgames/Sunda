package com.inmobi.ads.rendering;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.k0;
import com.applovin.shadow.okio.Utf8;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.A3;
import com.inmobi.media.AbstractC2679a4;
import com.inmobi.media.Ac;
import com.inmobi.media.Ba;
import com.inmobi.media.C2687ac;
import com.inmobi.media.C2747e4;
import com.inmobi.media.C2815i4;
import com.inmobi.media.C2899n4;
import com.inmobi.media.C2934p5;
import com.inmobi.media.C2967r5;
import com.inmobi.media.C3001t5;
import com.inmobi.media.D2;
import com.inmobi.media.F5;
import com.inmobi.media.G5;
import com.inmobi.media.GestureDetectorOnGestureListenerC3093yc;
import com.inmobi.media.InterfaceC3046w;
import com.inmobi.media.InterfaceC3063x;
import com.inmobi.media.Q;
import com.inmobi.media.R3;
import com.inmobi.media.cg;
import com.ironsource.C3191e4;
import kotlin.jvm.internal.e0;
import tv.Mu.QpyI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class InMobiAdActivity extends Activity {

    /* renamed from: k, reason: collision with root package name */
    public static final SparseArray f31591k = new SparseArray();

    /* renamed from: l, reason: collision with root package name */
    public static GestureDetectorOnGestureListenerC3093yc f31592l;

    /* renamed from: m, reason: collision with root package name */
    public static Ac f31593m;

    /* renamed from: a, reason: collision with root package name */
    public C2967r5 f31594a;

    /* renamed from: b, reason: collision with root package name */
    public C2934p5 f31595b;

    /* renamed from: c, reason: collision with root package name */
    public GestureDetectorOnGestureListenerC3093yc f31596c;

    /* renamed from: d, reason: collision with root package name */
    public int f31597d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f31598e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31599f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f31600g;

    /* renamed from: h, reason: collision with root package name */
    public F5 f31601h;

    /* renamed from: i, reason: collision with root package name */
    public cg f31602i;

    /* renamed from: j, reason: collision with root package name */
    public OnBackInvokedCallback f31603j;

    public static final void a(InMobiAdActivity this$0) {
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.b();
    }

    public static final boolean b(InMobiAdActivity this$0, View view, MotionEvent motionEvent) {
        C2815i4 c2815i4;
        e0.checkNotNullParameter(this$0, "this$0");
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this$0.f31596c;
        if (gestureDetectorOnGestureListenerC3093yc != null && (c2815i4 = gestureDetectorOnGestureListenerC3093yc.A0) != null) {
            C2815i4.a(c2815i4, 6, true, null, 12);
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc2 = this$0.f31596c;
        if (gestureDetectorOnGestureListenerC3093yc2 != null) {
            gestureDetectorOnGestureListenerC3093yc2.reload();
        }
        return true;
    }

    public static final boolean c(InMobiAdActivity this$0, View view, MotionEvent motionEvent) {
        C2815i4 c2815i4;
        e0.checkNotNullParameter(this$0, "this$0");
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this$0.f31596c;
        if (gestureDetectorOnGestureListenerC3093yc == null || !gestureDetectorOnGestureListenerC3093yc.canGoBack()) {
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc2 = this$0.f31596c;
            if (gestureDetectorOnGestureListenerC3093yc2 != null && (c2815i4 = gestureDetectorOnGestureListenerC3093yc2.A0) != null) {
                C2815i4.a(c2815i4, 5, true, null, 12);
            }
            this$0.f31598e = true;
            this$0.a();
        } else {
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc3 = this$0.f31596c;
            if (gestureDetectorOnGestureListenerC3093yc3 != null) {
                gestureDetectorOnGestureListenerC3093yc3.goBack();
            }
        }
        return true;
    }

    public static final boolean d(InMobiAdActivity this$0, View view, MotionEvent motionEvent) {
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc;
        e0.checkNotNullParameter(this$0, "this$0");
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc2 = this$0.f31596c;
        if (gestureDetectorOnGestureListenerC3093yc2 != null && gestureDetectorOnGestureListenerC3093yc2.canGoForward() && (gestureDetectorOnGestureListenerC3093yc = this$0.f31596c) != null) {
            gestureDetectorOnGestureListenerC3093yc.goForward();
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        e0.checkNotNullParameter(newConfig, "newConfig");
        F5 f52 = this.f31601h;
        if (f52 != null) {
            e0.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((G5) f52).c("InMobiAdActivity", "onConfigChanged");
        }
        super.onConfigurationChanged(newConfig);
        C2967r5 c2967r5 = this.f31594a;
        if (c2967r5 != null) {
            c2967r5.b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x013d, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0192 A[PHI: r13
      0x0192: PHI (r13v5 com.inmobi.commons.core.configs.AdConfig) = (r13v4 com.inmobi.commons.core.configs.AdConfig), (r13v12 com.inmobi.commons.core.configs.AdConfig) binds: [B:56:0x0173, B:58:0x018a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r35) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.ads.rendering.InMobiAdActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10) {
        C2934p5 c2934p5;
        C2967r5 c2967r5;
        F5 f52 = this.f31601h;
        if (f52 != null) {
            e0.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((G5) f52).c("InMobiAdActivity", "multiWindow mode - " + z10);
        }
        super.onMultiWindowModeChanged(z10);
        if (z10 || (c2934p5 = this.f31595b) == null) {
            return;
        }
        InterfaceC3063x interfaceC3063x = c2934p5.f33249b;
        Ba orientationProperties = (interfaceC3063x == null || !(interfaceC3063x instanceof GestureDetectorOnGestureListenerC3093yc)) ? null : ((GestureDetectorOnGestureListenerC3093yc) interfaceC3063x).getOrientationProperties();
        if (orientationProperties == null || (c2967r5 = this.f31594a) == null) {
            return;
        }
        c2967r5.a(orientationProperties);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        e0.checkNotNullParameter(intent, "intent");
        F5 f52 = this.f31601h;
        if (f52 != null) {
            e0.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((G5) f52).c("InMobiAdActivity", "onNewIntent");
        }
        super.onNewIntent(intent);
        this.f31599f = false;
        this.f31596c = null;
        setIntent(intent);
        C2934p5 c2934p5 = this.f31595b;
        if (c2934p5 != null) {
            SparseArray adContainers = f31591k;
            e0.checkNotNullParameter(intent, "intent");
            e0.checkNotNullParameter(adContainers, "adContainers");
            c2934p5.a(intent, adContainers);
            Q q10 = c2934p5.f33250c;
            if (q10 != null) {
                q10.g();
            }
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        C2934p5 c2934p5;
        super.onPause();
        int i10 = this.f31597d;
        if (100 == i10) {
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = f31592l;
            if (gestureDetectorOnGestureListenerC3093yc != null) {
                GestureDetectorOnGestureListenerC3093yc.Z0.getClass();
                gestureDetectorOnGestureListenerC3093yc.a(C2687ac.a("IN_CUSTOM_BROWSER", "onHidden"));
                return;
            }
            return;
        }
        if (102 != i10 || (c2934p5 = this.f31595b) == null || c2934p5.f33252e == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3093yc.Z0.getClass();
        c2934p5.a(C2687ac.a("IN_CUSTOM_EXPAND", "onHidden"));
    }

    @Override // android.app.Activity
    public final void onResume() {
        Q q10;
        InterfaceC3046w fullScreenEventsListener;
        F5 f52 = this.f31601h;
        if (f52 != null) {
            e0.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((G5) f52).c("InMobiAdActivity", C3191e4.h.f36512u0);
        }
        super.onResume();
        if (this.f31598e) {
            return;
        }
        int i10 = this.f31597d;
        if (100 == i10) {
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f31596c;
            if (gestureDetectorOnGestureListenerC3093yc != null && (fullScreenEventsListener = gestureDetectorOnGestureListenerC3093yc.getFullScreenEventsListener()) != null) {
                try {
                    if (!this.f31599f) {
                        this.f31599f = true;
                        fullScreenEventsListener.a(this.f31596c);
                    }
                } catch (Exception unused) {
                }
            }
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc2 = f31592l;
            if (gestureDetectorOnGestureListenerC3093yc2 != null) {
                GestureDetectorOnGestureListenerC3093yc.Z0.getClass();
                gestureDetectorOnGestureListenerC3093yc2.a(C2687ac.a("IN_CUSTOM_BROWSER", "onVisible"));
                return;
            }
            return;
        }
        if (102 == i10) {
            C2934p5 c2934p5 = this.f31595b;
            if (c2934p5 != null && (q10 = c2934p5.f33250c) != null) {
                q10.c();
            }
            C2934p5 c2934p52 = this.f31595b;
            if (c2934p52 == null || c2934p52.f33252e == null) {
                return;
            }
            GestureDetectorOnGestureListenerC3093yc.Z0.getClass();
            c2934p52.a(C2687ac.a("IN_CUSTOM_EXPAND", "onVisible"));
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        C2934p5 c2934p5;
        Window window;
        F5 f52 = this.f31601h;
        if (f52 != null) {
            e0.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((G5) f52).c("InMobiAdActivity", "onStart");
        }
        super.onStart();
        R3 r32 = R3.f32183a;
        if (r32.L()) {
            if (this.f31603j == null) {
                this.f31603j = new k0(this, 5);
            }
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            OnBackInvokedCallback onBackInvokedCallback = this.f31603j;
            if (onBackInvokedCallback == null) {
                e0.throwUninitializedPropertyAccessException("backInvokedCallback");
                onBackInvokedCallback = null;
            }
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, onBackInvokedCallback);
        }
        if (this.f31598e || 102 != this.f31597d || (c2934p5 = this.f31595b) == null) {
            return;
        }
        Q q10 = c2934p5.f33250c;
        if (q10 != null) {
            q10.g();
        }
        InterfaceC3063x interfaceC3063x = c2934p5.f33249b;
        if (interfaceC3063x != null) {
            if ((interfaceC3063x instanceof GestureDetectorOnGestureListenerC3093yc ? ((GestureDetectorOnGestureListenerC3093yc) interfaceC3063x).T0 : false) && !r32.J() && r32.P()) {
                Object obj = c2934p5.f33248a.get();
                InMobiAdActivity inMobiAdActivity = obj instanceof InMobiAdActivity ? (InMobiAdActivity) obj : null;
                if (inMobiAdActivity == null || (window = inMobiAdActivity.getWindow()) == null) {
                    return;
                }
                window.getDecorView().setSystemUiVisibility(5638);
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        C2934p5 c2934p5;
        Q q10;
        F5 f52 = this.f31601h;
        if (f52 != null) {
            e0.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((G5) f52).c("InMobiAdActivity", "onStop");
        }
        super.onStop();
        if (R3.f32183a.L() && this.f31603j != null) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            OnBackInvokedCallback onBackInvokedCallback = this.f31603j;
            if (onBackInvokedCallback == null) {
                e0.throwUninitializedPropertyAccessException("backInvokedCallback");
                onBackInvokedCallback = null;
            }
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
        }
        if (this.f31598e || (c2934p5 = this.f31595b) == null || (q10 = c2934p5.f33250c) == null) {
            return;
        }
        q10.d();
    }

    public final void a(RelativeLayout relativeLayout) {
        float f10 = AbstractC2679a4.d().f32676c;
        LinearLayout linearLayout = new LinearLayout(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (48 * f10));
        linearLayout.setOrientation(0);
        linearLayout.setId(Utf8.REPLACEMENT_CODE_POINT);
        linearLayout.setWeightSum(100.0f);
        linearLayout.setBackgroundResource(R.drawable.bottom_bar);
        linearLayout.setBackgroundColor(-7829368);
        relativeLayout.setBackgroundColor(-7829368);
        layoutParams.addRule(12);
        if (D2.a(this)) {
            cg cgVar = this.f31602i;
            if (cgVar != null) {
                cgVar.a();
            }
            this.f31602i = new cg(this, new C3001t5(layoutParams), this.f31601h);
        }
        relativeLayout.addView(linearLayout, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams2.weight = 25.0f;
        A3 a32 = new A3(this, (byte) 2, this.f31601h);
        final int i10 = 0;
        a32.setOnTouchListener(new View.OnTouchListener(this) { // from class: yk.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InMobiAdActivity f94589c;

            {
                this.f94589c = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i10) {
                    case 0:
                        return InMobiAdActivity.a(this.f94589c, view, motionEvent);
                    case 1:
                        return InMobiAdActivity.b(this.f94589c, view, motionEvent);
                    case 2:
                        return InMobiAdActivity.c(this.f94589c, view, motionEvent);
                    default:
                        return InMobiAdActivity.d(this.f94589c, view, motionEvent);
                }
            }
        });
        linearLayout.addView(a32, layoutParams2);
        A3 a33 = new A3(this, (byte) 3, this.f31601h);
        final int i11 = 1;
        a33.setOnTouchListener(new View.OnTouchListener(this) { // from class: yk.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InMobiAdActivity f94589c;

            {
                this.f94589c = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i11) {
                    case 0:
                        return InMobiAdActivity.a(this.f94589c, view, motionEvent);
                    case 1:
                        return InMobiAdActivity.b(this.f94589c, view, motionEvent);
                    case 2:
                        return InMobiAdActivity.c(this.f94589c, view, motionEvent);
                    default:
                        return InMobiAdActivity.d(this.f94589c, view, motionEvent);
                }
            }
        });
        linearLayout.addView(a33, layoutParams2);
        A3 a34 = new A3(this, (byte) 4, this.f31601h);
        final int i12 = 2;
        a34.setOnTouchListener(new View.OnTouchListener(this) { // from class: yk.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InMobiAdActivity f94589c;

            {
                this.f94589c = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i12) {
                    case 0:
                        return InMobiAdActivity.a(this.f94589c, view, motionEvent);
                    case 1:
                        return InMobiAdActivity.b(this.f94589c, view, motionEvent);
                    case 2:
                        return InMobiAdActivity.c(this.f94589c, view, motionEvent);
                    default:
                        return InMobiAdActivity.d(this.f94589c, view, motionEvent);
                }
            }
        });
        linearLayout.addView(a34, layoutParams2);
        A3 a35 = new A3(this, (byte) 6, this.f31601h);
        final int i13 = 3;
        a35.setOnTouchListener(new View.OnTouchListener(this) { // from class: yk.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InMobiAdActivity f94589c;

            {
                this.f94589c = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i13) {
                    case 0:
                        return InMobiAdActivity.a(this.f94589c, view, motionEvent);
                    case 1:
                        return InMobiAdActivity.b(this.f94589c, view, motionEvent);
                    case 2:
                        return InMobiAdActivity.c(this.f94589c, view, motionEvent);
                    default:
                        return InMobiAdActivity.d(this.f94589c, view, motionEvent);
                }
            }
        });
        linearLayout.addView(a35, layoutParams2);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        C2934p5 c2934p5;
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc;
        C2815i4 c2815i4;
        InterfaceC3046w fullScreenEventsListener;
        F5 f52 = this.f31601h;
        if (f52 != null) {
            e0.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((G5) f52).c("InMobiAdActivity", "onDestroy");
        }
        int i10 = this.f31597d;
        if (100 == i10) {
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc2 = f31592l;
            if (gestureDetectorOnGestureListenerC3093yc2 != null) {
                GestureDetectorOnGestureListenerC3093yc.Z0.getClass();
                gestureDetectorOnGestureListenerC3093yc2.a(C2687ac.a("IN_CUSTOM_BROWSER", "onClose"));
            }
        } else if (102 == i10 && (c2934p5 = this.f31595b) != null && c2934p5.f33252e != null) {
            GestureDetectorOnGestureListenerC3093yc.Z0.getClass();
            c2934p5.a(C2687ac.a(QpyI.swYdhOOhCEiYTbn, "onClose"));
        }
        if (this.f31598e) {
            int i11 = this.f31597d;
            if (100 == i11) {
                GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc3 = this.f31596c;
                if (gestureDetectorOnGestureListenerC3093yc3 != null && (fullScreenEventsListener = gestureDetectorOnGestureListenerC3093yc3.getFullScreenEventsListener()) != null) {
                    try {
                        fullScreenEventsListener.b(this.f31596c);
                        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc4 = this.f31596c;
                        e0.checkNotNull(gestureDetectorOnGestureListenerC3093yc4);
                        gestureDetectorOnGestureListenerC3093yc4.b();
                        C2967r5 c2967r5 = this.f31594a;
                        if (c2967r5 == null) {
                            e0.throwUninitializedPropertyAccessException("orientationHandler");
                            c2967r5 = null;
                        }
                        GestureDetectorOnGestureListenerC3093yc orientationListener = this.f31596c;
                        e0.checkNotNull(orientationListener);
                        c2967r5.getClass();
                        e0.checkNotNullParameter(orientationListener, "orientationListener");
                        c2967r5.f33304b.remove(orientationListener);
                        c2967r5.a();
                        this.f31596c = null;
                    } catch (Exception unused) {
                    }
                }
            } else if (102 == i11) {
                C2934p5 orientationListener2 = this.f31595b;
                if (orientationListener2 != null) {
                    C2967r5 c2967r52 = this.f31594a;
                    if (c2967r52 == null) {
                        e0.throwUninitializedPropertyAccessException("orientationHandler");
                        c2967r52 = null;
                    }
                    c2967r52.getClass();
                    e0.checkNotNullParameter(orientationListener2, "orientationListener");
                    c2967r52.f33304b.remove(orientationListener2);
                    c2967r52.a();
                    Q q10 = orientationListener2.f33250c;
                    if (q10 != null) {
                        q10.b();
                    }
                    RelativeLayout relativeLayout = orientationListener2.f33251d;
                    if (relativeLayout != null) {
                        relativeLayout.removeAllViews();
                    }
                    C2747e4 c2747e4 = orientationListener2.f33252e;
                    if (c2747e4 != null) {
                        C2899n4 c2899n4 = c2747e4.f32802c;
                        if (c2899n4 != null) {
                            c2899n4.destroy();
                        }
                        c2747e4.f32802c = null;
                        c2747e4.f32803d = null;
                        c2747e4.f32804e = null;
                        cg cgVar = c2747e4.f32806g;
                        if (cgVar != null) {
                            cgVar.a();
                        }
                        c2747e4.removeAllViews();
                    }
                    orientationListener2.f33248a.clear();
                    orientationListener2.f33249b = null;
                    orientationListener2.f33250c = null;
                    orientationListener2.f33251d = null;
                    orientationListener2.f33252e = null;
                }
                this.f31595b = null;
            }
        } else {
            int i12 = this.f31597d;
            if (100 != i12 && 102 == i12) {
                C2934p5 orientationListener3 = this.f31595b;
                if (orientationListener3 != null) {
                    C2967r5 c2967r53 = this.f31594a;
                    if (c2967r53 == null) {
                        e0.throwUninitializedPropertyAccessException("orientationHandler");
                        c2967r53 = null;
                    }
                    c2967r53.getClass();
                    e0.checkNotNullParameter(orientationListener3, "orientationListener");
                    c2967r53.f33304b.remove(orientationListener3);
                    c2967r53.a();
                    Q q11 = orientationListener3.f33250c;
                    if (q11 != null) {
                        q11.b();
                    }
                    RelativeLayout relativeLayout2 = orientationListener3.f33251d;
                    if (relativeLayout2 != null) {
                        relativeLayout2.removeAllViews();
                    }
                    C2747e4 c2747e42 = orientationListener3.f33252e;
                    if (c2747e42 != null) {
                        C2899n4 c2899n42 = c2747e42.f32802c;
                        if (c2899n42 != null) {
                            c2899n42.destroy();
                        }
                        c2747e42.f32802c = null;
                        c2747e42.f32803d = null;
                        c2747e42.f32804e = null;
                        cg cgVar2 = c2747e42.f32806g;
                        if (cgVar2 != null) {
                            cgVar2.a();
                        }
                        c2747e42.removeAllViews();
                    }
                    orientationListener3.f33248a.clear();
                    orientationListener3.f33249b = null;
                    orientationListener3.f33250c = null;
                    orientationListener3.f33251d = null;
                    orientationListener3.f33252e = null;
                }
                this.f31595b = null;
            }
            if (100 == this.f31597d && (gestureDetectorOnGestureListenerC3093yc = this.f31596c) != null && (c2815i4 = gestureDetectorOnGestureListenerC3093yc.A0) != null) {
                C2815i4.a(c2815i4, 9, true, null, 12);
            }
        }
        cg cgVar3 = this.f31602i;
        if (cgVar3 != null) {
            cgVar3.a();
        }
        super.onDestroy();
    }

    public final void b() {
        C2815i4 c2815i4;
        Q q10;
        F5 f52 = this.f31601h;
        if (f52 != null) {
            e0.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((G5) f52).c("InMobiAdActivity", "onBackPressed");
        }
        int i10 = this.f31597d;
        if (i10 == 102) {
            F5 f53 = this.f31601h;
            if (f53 != null) {
                e0.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
                ((G5) f53).c("InMobiAdActivity", "back pressed on ad");
            }
            C2934p5 c2934p5 = this.f31595b;
            if (c2934p5 == null || (q10 = c2934p5.f33250c) == null) {
                return;
            }
            q10.a();
            return;
        }
        if (i10 == 100) {
            F5 f54 = this.f31601h;
            if (f54 != null) {
                e0.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
                ((G5) f54).c("InMobiAdActivity", "back pressed in browser");
            }
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f31596c;
            if (gestureDetectorOnGestureListenerC3093yc != null && (c2815i4 = gestureDetectorOnGestureListenerC3093yc.A0) != null) {
                C2815i4.a(c2815i4, 7, true, null, 12);
            }
            this.f31598e = true;
            a();
        }
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10, Configuration newConfig) {
        e0.checkNotNullParameter(newConfig, "newConfig");
        super.onMultiWindowModeChanged(z10, newConfig);
        onMultiWindowModeChanged(z10);
    }

    public static final boolean a(InMobiAdActivity this$0, View view, MotionEvent motionEvent) {
        C2815i4 c2815i4;
        e0.checkNotNullParameter(this$0, "this$0");
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this$0.f31596c;
            if (gestureDetectorOnGestureListenerC3093yc != null && (c2815i4 = gestureDetectorOnGestureListenerC3093yc.A0) != null) {
                C2815i4.a(c2815i4, 5, true, null, 12);
            }
            this$0.f31598e = true;
            this$0.a();
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public final void a() {
        if (isTaskRoot() && R3.Q()) {
            finishAndRemoveTask();
        } else {
            finish();
        }
    }
}
