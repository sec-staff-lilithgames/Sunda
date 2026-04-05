package com.inmobi.media;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class N8 {

    /* renamed from: a, reason: collision with root package name */
    public final AdConfig f32051a;

    /* renamed from: b, reason: collision with root package name */
    public final C2734d8 f32052b;

    /* renamed from: c, reason: collision with root package name */
    public final C3106z8 f32053c;

    /* renamed from: d, reason: collision with root package name */
    public final G8 f32054d;

    /* renamed from: e, reason: collision with root package name */
    public final F8 f32055e;

    /* renamed from: f, reason: collision with root package name */
    public final F5 f32056f;

    /* renamed from: g, reason: collision with root package name */
    public final String f32057g;

    /* renamed from: h, reason: collision with root package name */
    public final Handler f32058h;

    /* renamed from: i, reason: collision with root package name */
    public final WeakReference f32059i;

    /* renamed from: j, reason: collision with root package name */
    public V8 f32060j;

    /* renamed from: k, reason: collision with root package name */
    public int f32061k;

    /* renamed from: l, reason: collision with root package name */
    public final C2727d1 f32062l;

    /* renamed from: m, reason: collision with root package name */
    public final N9 f32063m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f32064n;

    /* renamed from: o, reason: collision with root package name */
    public GestureDetectorOnGestureListenerC3093yc f32065o;

    /* renamed from: p, reason: collision with root package name */
    public H8 f32066p;

    public N8(Context context, AdConfig adConfig, C2734d8 nativeAdContainer, C3106z8 dataModel, G8 viewEventListener, F8 clickEventListener, H8 timerFinishListener, F5 f52) {
        N9 n9;
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(adConfig, "adConfig");
        kotlin.jvm.internal.e0.checkNotNullParameter(nativeAdContainer, "nativeAdContainer");
        kotlin.jvm.internal.e0.checkNotNullParameter(dataModel, "dataModel");
        kotlin.jvm.internal.e0.checkNotNullParameter(viewEventListener, "viewEventListener");
        kotlin.jvm.internal.e0.checkNotNullParameter(clickEventListener, "clickEventListener");
        kotlin.jvm.internal.e0.checkNotNullParameter(timerFinishListener, "timerFinishListener");
        this.f32051a = adConfig;
        this.f32052b = nativeAdContainer;
        this.f32053c = dataModel;
        this.f32054d = viewEventListener;
        this.f32055e = clickEventListener;
        this.f32056f = f52;
        this.f32057g = "N8";
        this.f32058h = new Handler(Looper.getMainLooper());
        this.f32059i = new WeakReference(context);
        this.f32062l = new C2727d1();
        HashMap map = N9.f32067c;
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        WeakReference weakReference = N9.f32068d;
        N9 n92 = weakReference != null ? (N9) weakReference.get() : null;
        if (n92 == null) {
            synchronized (N9.class) {
                try {
                    WeakReference weakReference2 = N9.f32068d;
                    if (weakReference2 == null || (n9 = (N9) weakReference2.get()) == null) {
                        n9 = new N9(context);
                        N9.f32068d = new WeakReference(n9);
                    }
                    kotlin.jvm.internal.e0.checkNotNull(n9);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            n92 = n9;
        }
        this.f32063m = n92;
        this.f32066p = timerFinishListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.ViewGroup a(android.view.ViewGroup r4, com.inmobi.media.C2970r8 r5) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.e0.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "root"
            kotlin.jvm.internal.e0.checkNotNullParameter(r5, r0)
            java.lang.ref.WeakReference r0 = r3.f32059i
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 == 0) goto L23
            com.inmobi.media.N9 r1 = r3.f32063m
            com.inmobi.commons.core.configs.AdConfig r2 = r3.f32051a
            android.view.View r0 = r1.a(r0, r5, r2)
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L23
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L24
        L23:
            r0 = 0
        L24:
            if (r0 != 0) goto L27
            return r0
        L27:
            java.util.HashMap r1 = com.inmobi.media.N9.f32067c
            android.view.ViewGroup$LayoutParams r4 = com.inmobi.media.C3073x9.a(r5, r4)
            r0.setLayoutParams(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.N8.a(android.view.ViewGroup, com.inmobi.media.r8):android.view.ViewGroup");
    }

    public final void b(View view, C2903n8 c2903n8) {
        if (c2903n8.f33141f) {
            view.setOnClickListener(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.f(8, this, c2903n8));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x012f, code lost:
    
        if (kotlin.jvm.internal.e0.areEqual("UNKNOWN", r0.f32129y) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013e, code lost:
    
        if (r11.f33140e == null) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03a3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015a  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.ViewGroup b(android.view.ViewGroup r22, com.inmobi.media.C2970r8 r23) throws java.io.IOException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.N8.b(android.view.ViewGroup, com.inmobi.media.r8):android.view.ViewGroup");
    }

    public final T8 a(T8 t82, ViewGroup parent, GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc) {
        kotlin.jvm.internal.e0.checkNotNullParameter(parent, "parent");
        this.f32065o = gestureDetectorOnGestureListenerC3093yc;
        T8 t8A = a(t82, parent);
        this.f32058h.post(new io.bidmachine.media3.exoplayer.b1(this, 19, t8A, parent));
        return t8A;
    }

    public static final void a(N8 this$0, T8 container, ViewGroup parent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(parent, "$parent");
        if (this$0.f32064n) {
            return;
        }
        C2970r8 root = this$0.f32053c.f33704e;
        if (container == null || root == null) {
            return;
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(container, "container");
        kotlin.jvm.internal.e0.checkNotNullParameter(parent, "parent");
        kotlin.jvm.internal.e0.checkNotNullParameter(root, "root");
        this$0.b((ViewGroup) container, root);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.inmobi.media.T8 a(com.inmobi.media.T8 r5, android.view.ViewGroup r6) {
        /*
            r4 = this;
            com.inmobi.media.z8 r0 = r4.f32053c
            com.inmobi.media.r8 r0 = r0.f33704e
            if (r5 != 0) goto L23
            java.lang.ref.WeakReference r1 = r4.f32059i
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            if (r1 == 0) goto L21
            if (r0 == 0) goto L21
            com.inmobi.media.N9 r2 = r4.f32063m
            com.inmobi.commons.core.configs.AdConfig r3 = r4.f32051a
            android.view.View r1 = r2.a(r1, r0, r3)
            boolean r2 = r1 instanceof com.inmobi.media.T8
            if (r2 == 0) goto L21
            com.inmobi.media.T8 r1 = (com.inmobi.media.T8) r1
            goto L24
        L21:
            r1 = 0
            goto L24
        L23:
            r1 = r5
        L24:
            if (r1 == 0) goto L61
            if (r5 == 0) goto L61
            android.view.ViewParent r5 = r1.getParent()
            boolean r2 = r5 instanceof android.view.ViewGroup
            if (r2 == 0) goto L35
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r5.removeView(r1)
        L35:
            com.inmobi.media.N9 r5 = r4.f32063m
            r5.getClass()
            java.lang.String r2 = "viewGroup"
            kotlin.jvm.internal.e0.checkNotNullParameter(r1, r2)
            int r2 = r1.getChildCount()
            int r2 = r2 + (-1)
        L45:
            r3 = -1
            if (r3 >= r2) goto L58
            android.view.View r3 = r1.getChildAt(r2)
            r1.removeViewAt(r2)
            kotlin.jvm.internal.e0.checkNotNull(r3)
            r5.a(r3)
            int r2 = r2 + (-1)
            goto L45
        L58:
            if (r0 == 0) goto L61
            java.util.HashMap r5 = com.inmobi.media.N9.f32067c
            com.inmobi.media.o8 r5 = r0.f33139d
            com.inmobi.media.C3073x9.a(r1, r5)
        L61:
            if (r0 == 0) goto L70
            com.inmobi.media.N9 r5 = r4.f32063m
            com.inmobi.media.o8 r2 = r0.f33139d
            android.graphics.Point r2 = r2.f33181a
            int r2 = r2.x
            r5.getClass()
            com.inmobi.media.N9.f32071g = r2
        L70:
            if (r1 == 0) goto L7d
            if (r0 == 0) goto L7d
            java.util.HashMap r5 = com.inmobi.media.N9.f32067c
            android.view.ViewGroup$LayoutParams r5 = com.inmobi.media.C3073x9.a(r0, r6)
            r1.setLayoutParams(r5)
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.N8.a(com.inmobi.media.T8, android.view.ViewGroup):com.inmobi.media.T8");
    }

    public final void a(View view, C2903n8 nativeAsset) {
        C2727d1 c2727d1 = this.f32062l;
        c2727d1.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(nativeAsset, "nativeAsset");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        try {
            HashMap map = N9.f32067c;
            float fA = C3073x9.a(nativeAsset.f33139d.f33183c.x);
            float fA2 = C3073x9.a(nativeAsset.f33139d.f33184d.x);
            if (fA != fA2) {
                arrayList.add(C2727d1.a(C2727d1.a(view, fA, fA2), nativeAsset));
            }
            float fA3 = C3073x9.a(nativeAsset.f33139d.f33183c.y);
            float fA4 = C3073x9.a(nativeAsset.f33139d.f33184d.y);
            if (fA3 != fA4) {
                arrayList.add(C2727d1.a(C2727d1.b(view, fA3, fA4), nativeAsset));
            }
            float fA5 = C3073x9.a(nativeAsset.f33139d.f33181a.x);
            float fA6 = C3073x9.a(nativeAsset.f33139d.f33182b.x);
            if (fA5 != fA6) {
                view.setPivotX(0.0f);
                view.setPivotY(0.0f);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", fA6 / fA5);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(...)");
                arrayList.add(C2727d1.a(objectAnimatorOfFloat, nativeAsset));
            }
            float fA7 = C3073x9.a(nativeAsset.f33139d.f33181a.y);
            float fA8 = C3073x9.a(nativeAsset.f33139d.f33182b.y);
            if (fA7 != fA8) {
                view.setPivotX(0.0f);
                view.setPivotY(0.0f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", fA8 / fA7);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(objectAnimatorOfFloat2, "ofFloat(...)");
                arrayList.add(C2727d1.a(objectAnimatorOfFloat2, nativeAsset));
            }
        } catch (Exception unused) {
            String TAG = c2727d1.f32728a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        kotlin.jvm.internal.e0.checkNotNullParameter("creativeView", "eventType");
        Iterator it = nativeAsset.f33154s.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (kotlin.jvm.internal.e0.areEqual("creativeView", ((C2752e9) it.next()).f32815b)) {
                z10 = true;
                break;
            }
        }
        if (arrayList != null || z10) {
            view.addOnAttachStateChangeListener(new I8(this, arrayList, nativeAsset));
        }
    }

    public static final void a(WeakReference childViewRef) {
        kotlin.jvm.internal.e0.checkNotNullParameter(childViewRef, "$childViewRef");
        View view = (View) childViewRef.get();
        if (view != null) {
            view.setVisibility(4);
        }
    }

    public static final void a(N8 this$0, C2903n8 asset, View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(asset, "$asset");
        F8 f82 = this$0.f32055e;
        kotlin.jvm.internal.e0.checkNotNull(view);
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
        H8 h82 = f82.f31791a;
        if (h82.f31842a) {
            return;
        }
        h82.f31843b.a(view, asset);
        f82.f31791a.f31843b.a(asset, false);
    }

    public static final void b(WeakReference childViewRef) {
        kotlin.jvm.internal.e0.checkNotNullParameter(childViewRef, "$childViewRef");
        View view = (View) childViewRef.get();
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
