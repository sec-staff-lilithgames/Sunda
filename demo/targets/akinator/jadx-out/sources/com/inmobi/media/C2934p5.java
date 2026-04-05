package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.lang.ref.WeakReference;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.p5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2934p5 implements Ca {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f33248a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC3063x f33249b;

    /* renamed from: c, reason: collision with root package name */
    public Q f33250c;

    /* renamed from: d, reason: collision with root package name */
    public RelativeLayout f33251d;

    /* renamed from: e, reason: collision with root package name */
    public C2747e4 f33252e;

    /* renamed from: f, reason: collision with root package name */
    public EnumC3108za f33253f;

    /* renamed from: g, reason: collision with root package name */
    public float f33254g;

    /* renamed from: h, reason: collision with root package name */
    public F5 f33255h;

    /* renamed from: i, reason: collision with root package name */
    public final C2917o5 f33256i;

    /* renamed from: j, reason: collision with root package name */
    public final C2900n5 f33257j;

    public C2934p5(InMobiAdActivity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        this.f33248a = new WeakReference(activity);
        this.f33253f = Aa.a(AbstractC2679a4.g());
        this.f33254g = 1.0f;
        this.f33256i = new C2917o5(this);
        this.f33257j = new C2900n5(this);
    }

    public final void a(Intent intent, SparseArray adContainers) {
        C2747e4 c2747e4;
        Window window;
        kotlin.jvm.internal.e0.checkNotNullParameter(intent, "intent");
        kotlin.jvm.internal.e0.checkNotNullParameter(adContainers, "adContainers");
        if (!intent.hasExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX")) {
            b();
            return;
        }
        InterfaceC3063x interfaceC3063x = (InterfaceC3063x) adContainers.get(intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", -1));
        if (interfaceC3063x == null) {
            b();
            return;
        }
        int intExtra = intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", 0);
        if (intExtra == 0) {
            InterfaceC3046w fullScreenEventsListener = interfaceC3063x.getFullScreenEventsListener();
            if (fullScreenEventsListener != null) {
                fullScreenEventsListener.a();
            }
            b();
            return;
        }
        if (intent.getBooleanExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", false) && (this.f33248a.get() instanceof InMobiAdActivity)) {
            Object obj = this.f33248a.get();
            kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
            if (!((InMobiAdActivity) obj).f31600g) {
                Object obj2 = this.f33248a.get();
                kotlin.jvm.internal.e0.checkNotNull(obj2, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
                ((InMobiAdActivity) obj2).f31600g = true;
                if (!(interfaceC3063x instanceof GestureDetectorOnGestureListenerC3093yc) ? false : ((GestureDetectorOnGestureListenerC3093yc) interfaceC3063x).T0) {
                    F5 f52 = this.f33255h;
                    if (f52 != null) {
                        ((G5) f52).a("InMobiActivityViewHandler", "showInImmersiveMode");
                    }
                    Object obj3 = this.f33248a.get();
                    InMobiAdActivity inMobiAdActivity = obj3 instanceof InMobiAdActivity ? (InMobiAdActivity) obj3 : null;
                    if (inMobiAdActivity != null && (window = inMobiAdActivity.getWindow()) != null) {
                        R3 r32 = R3.f32183a;
                        if (r32.J()) {
                            WindowManager.LayoutParams attributes = window.getAttributes();
                            attributes.layoutInDisplayCutoutMode = 3;
                            window.setAttributes(attributes);
                            x3.r2.setDecorFitsSystemWindows(window, false);
                        } else if (r32.H()) {
                            WindowManager.LayoutParams attributes2 = window.getAttributes();
                            attributes2.layoutInDisplayCutoutMode = 1;
                            window.setAttributes(attributes2);
                            x3.r2.setDecorFitsSystemWindows(window, false);
                        }
                        if (r32.J()) {
                            x3.d4 insetsController = x3.r2.getInsetsController(window, window.getDecorView());
                            if (insetsController != null) {
                                insetsController.setSystemBarsBehavior(2);
                            }
                            if (insetsController != null) {
                                insetsController.hide(x3.t3.systemBars());
                            }
                            if (insetsController != null) {
                                insetsController.hide(x3.t3.displayCutout());
                            }
                        } else if (r32.P()) {
                            window.getDecorView().setSystemUiVisibility(5638);
                        }
                    }
                } else {
                    Activity activity = (Activity) this.f33248a.get();
                    if (activity != null) {
                        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "<this>");
                        try {
                            activity.requestWindowFeature(1);
                            activity.getWindow().setFlags(1024, 1024);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        if ((200 == intExtra && !kotlin.jvm.internal.e0.areEqual("html", interfaceC3063x.getMarkupType())) || ((202 == intExtra && !kotlin.jvm.internal.e0.areEqual("htmlUrl", interfaceC3063x.getMarkupType())) || (201 == intExtra && !kotlin.jvm.internal.e0.areEqual("inmobiJson", interfaceC3063x.getMarkupType())))) {
            InterfaceC3046w fullScreenEventsListener2 = interfaceC3063x.getFullScreenEventsListener();
            if (fullScreenEventsListener2 != null) {
                fullScreenEventsListener2.a();
            }
            b();
            return;
        }
        try {
            this.f33249b = interfaceC3063x;
            interfaceC3063x.setFullScreenActivityContext((Activity) this.f33248a.get());
            a();
            Activity activity2 = (Activity) this.f33248a.get();
            if (activity2 != null) {
                RelativeLayout relativeLayout = new RelativeLayout(activity2);
                relativeLayout.setId(65534);
                this.f33251d = relativeLayout;
            }
            a(interfaceC3063x);
            Q q10 = this.f33250c;
            if (q10 != null) {
                q10.f();
            }
            Activity activity3 = (Activity) this.f33248a.get();
            if (activity3 != null) {
                FrameLayout frameLayout = (FrameLayout) activity3.findViewById(R.id.content);
                RelativeLayout relativeLayout2 = frameLayout != null ? (RelativeLayout) frameLayout.findViewById(65519) : null;
                RelativeLayout relativeLayout3 = this.f33251d;
                if (relativeLayout3 != null && relativeLayout2 != null) {
                    RelativeLayout relativeLayout4 = (RelativeLayout) relativeLayout2.findViewById(65534);
                    if (relativeLayout4 != null) {
                        relativeLayout2.removeView(relativeLayout4);
                    }
                    relativeLayout2.addView(relativeLayout3);
                    Q q11 = this.f33250c;
                    if (q11 != null) {
                        q11.e();
                    }
                }
            }
            if (interfaceC3063x instanceof GestureDetectorOnGestureListenerC3093yc) {
                ((GestureDetectorOnGestureListenerC3093yc) interfaceC3063x).setEmbeddedBrowserJsCallbacks(this.f33257j);
            }
            if ((interfaceC3063x instanceof GestureDetectorOnGestureListenerC3093yc) && (c2747e4 = this.f33252e) != null) {
                c2747e4.setUserLeftApplicationListener(((GestureDetectorOnGestureListenerC3093yc) interfaceC3063x).getListener());
            }
        } catch (Exception e10) {
            interfaceC3063x.setFullScreenActivityContext(null);
            InterfaceC3046w fullScreenEventsListener3 = interfaceC3063x.getFullScreenEventsListener();
            if (fullScreenEventsListener3 != null) {
                fullScreenEventsListener3.a();
            }
            b();
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public final void b() {
        Activity activity = (Activity) this.f33248a.get();
        if (activity instanceof InMobiAdActivity) {
            ((InMobiAdActivity) activity).a();
        }
    }

    public final void c() {
        C2696b4 c2696b4D;
        if (this.f33252e == null) {
            return;
        }
        InterfaceC3063x interfaceC3063x = this.f33249b;
        if (interfaceC3063x == null) {
            c2696b4D = AbstractC2679a4.d();
        } else {
            if (!(!(interfaceC3063x instanceof GestureDetectorOnGestureListenerC3093yc) ? false : ((GestureDetectorOnGestureListenerC3093yc) interfaceC3063x).T0)) {
                Activity activity = (Activity) this.f33248a.get();
                if (activity != null) {
                    kotlin.jvm.internal.e0.checkNotNull(activity);
                    if (D2.a(activity)) {
                    }
                }
                c2696b4D = AbstractC2679a4.d();
            }
            c2696b4D = AbstractC2679a4.h();
        }
        float f10 = c2696b4D.f32674a;
        float f11 = c2696b4D.f32676c;
        float f12 = f10 * f11;
        float f13 = c2696b4D.f32675b * f11;
        if (Aa.b(this.f33253f)) {
            a(mv.d.roundToInt((1 - this.f33254g) * f12), -1);
        } else {
            a(-1, mv.d.roundToInt((1 - this.f33254g) * f13));
        }
    }

    public final void d() {
        try {
            C2747e4 c2747e4 = this.f33252e;
            if (c2747e4 != null) {
                ViewParent parent = c2747e4.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(c2747e4);
                }
                ViewParent parent2 = c2747e4.getParent();
                ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                if (viewGroup2 != null) {
                    viewGroup2.post(new zg.h(c2747e4, 17));
                }
            }
            C2747e4 c2747e42 = this.f33252e;
            if (c2747e42 != null) {
                C2899n4 c2899n4 = c2747e42.f32802c;
                if (c2899n4 != null) {
                    c2899n4.destroy();
                }
                c2747e42.f32802c = null;
                c2747e42.f32803d = null;
                c2747e42.f32804e = null;
                cg cgVar = c2747e42.f32806g;
                if (cgVar != null) {
                    cgVar.a();
                }
                c2747e42.removeAllViews();
            }
            this.f33252e = null;
            GestureDetectorOnGestureListenerC3093yc.Z0.getClass();
            a(C2687ac.a("IN_CUSTOM_EXPAND", "onClose"));
        } catch (Exception unused) {
        }
    }

    public final void a() {
        Activity activity = (Activity) this.f33248a.get();
        if (activity == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(R.id.content);
        if ((frameLayout != null ? (RelativeLayout) frameLayout.findViewById(65519) : null) != null) {
            return;
        }
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        relativeLayout.setId(65519);
        relativeLayout.setBackgroundColor(0);
        frameLayout.removeAllViews();
        frameLayout.addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        r1 = new com.inmobi.media.C2697b5(r4.f33248a, r5, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.inmobi.media.InterfaceC3063x r5) {
        /*
            r4 = this;
            java.lang.ref.WeakReference r0 = r4.f33248a
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 != 0) goto Lb
            goto Lf
        Lb:
            android.widget.RelativeLayout r0 = r4.f33251d
            if (r0 != 0) goto L10
        Lf:
            return
        L10:
            java.lang.String r1 = r5.getMarkupType()
            int r2 = r1.hashCode()
            r3 = -1084172778(0xffffffffbf60d616, float:-0.8782667)
            if (r2 == r3) goto L40
            r3 = 3213227(0x3107ab, float:4.50269E-39)
            if (r2 == r3) goto L30
            r3 = 1236050372(0x49aca1c4, float:1414200.5)
            if (r2 != r3) goto L67
            java.lang.String r2 = "htmlUrl"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L67
            goto L38
        L30:
            java.lang.String r2 = "html"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L67
        L38:
            com.inmobi.media.b5 r1 = new com.inmobi.media.b5
            java.lang.ref.WeakReference r2 = r4.f33248a
            r1.<init>(r2, r5, r0)
            goto L4f
        L40:
            java.lang.String r2 = "inmobiJson"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L67
            com.inmobi.media.F6 r1 = new com.inmobi.media.F6
            java.lang.ref.WeakReference r2 = r4.f33248a
            r1.<init>(r2, r5, r0)
        L4f:
            r4.f33250c = r1
            com.inmobi.media.za r0 = r4.f33253f
            r1.a(r0)
            float r0 = r4.f33254g
            r1.f32144c = r0
            boolean r0 = r5 instanceof com.inmobi.media.GestureDetectorOnGestureListenerC3093yc
            if (r0 != 0) goto L60
            r5 = 0
            goto L64
        L60:
            com.inmobi.media.yc r5 = (com.inmobi.media.GestureDetectorOnGestureListenerC3093yc) r5
            boolean r5 = r5.T0
        L64:
            r1.f32145d = r5
            return
        L67:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "InMobiActivityViewHandler: Unknown Markup type"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2934p5.a(com.inmobi.media.x):void");
    }

    public final void a(JSONObject jsonObject) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jsonObject, "jsonObject");
        InterfaceC3063x interfaceC3063x = this.f33249b;
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = interfaceC3063x instanceof GestureDetectorOnGestureListenerC3093yc ? (GestureDetectorOnGestureListenerC3093yc) interfaceC3063x : null;
        if (gestureDetectorOnGestureListenerC3093yc != null) {
            gestureDetectorOnGestureListenerC3093yc.a(jsonObject);
        }
    }

    @Override // com.inmobi.media.Ca
    public final void a(EnumC3108za orientation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
        if (((Activity) this.f33248a.get()) == null) {
            return;
        }
        Q q10 = this.f33250c;
        if (q10 != null) {
            q10.a(orientation);
        }
        EnumC3108za enumC3108za = this.f33253f;
        if (enumC3108za != orientation && Aa.b(enumC3108za) != Aa.b(orientation)) {
            Objects.toString(orientation);
            this.f33253f = orientation;
            Q q11 = this.f33250c;
            if (q11 != null) {
                q11.e();
            }
            c();
            return;
        }
        Objects.toString(orientation);
        this.f33253f = orientation;
    }

    public static final void a(C2934p5 c2934p5) {
        c2934p5.f33254g = 1.0f;
        Q q10 = c2934p5.f33250c;
        if (q10 != null) {
            q10.f32144c = 1.0f;
            q10.e();
        }
        C2747e4 c2747e4 = c2934p5.f33252e;
        if (c2747e4 != null) {
            c2747e4.setLayoutParams(new RelativeLayout.LayoutParams(0, 0));
        }
        c2934p5.d();
    }

    public static final void a(C2747e4 this_run) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this_run, "$this_run");
        this_run.getParent().requestLayout();
    }

    public final void a(int i10, int i11) {
        RelativeLayout.LayoutParams layoutParamsE;
        Activity activity = (Activity) this.f33248a.get();
        if (activity == null) {
            return;
        }
        Aa.b(this.f33253f);
        if (Aa.b(this.f33253f)) {
            layoutParamsE = b0.e2.e(i10, i11, 11);
        } else {
            layoutParamsE = b0.e2.e(i10, i11, 12);
        }
        RelativeLayout relativeLayout = (RelativeLayout) ((FrameLayout) activity.findViewById(R.id.content)).findViewById(65519);
        kotlin.jvm.internal.e0.checkNotNull(relativeLayout);
        if (((RelativeLayout) relativeLayout.findViewById(65518)) != null) {
            C2747e4 c2747e4 = this.f33252e;
            if (c2747e4 == null) {
                return;
            }
            c2747e4.setLayoutParams(layoutParamsE);
            return;
        }
        C2747e4 c2747e42 = this.f33252e;
        if (c2747e42 != null) {
            relativeLayout.addView(c2747e42, layoutParamsE);
        }
    }
}
