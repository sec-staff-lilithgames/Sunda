package com.inmobi.media;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.app.NotificationCompat;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.TelemetryConfig;
import com.ironsource.C3191e4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.d8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C2734d8 implements InterfaceC3063x, Application.ActivityLifecycleCallbacks {
    public boolean A;
    public int B;
    public C2734d8 C;
    public boolean D;
    public C2903n8 E;
    public String F;
    public Intent G;
    public GestureDetectorOnGestureListenerC3093yc H;
    public GestureDetectorOnGestureListenerC3093yc I;
    public C2734d8 J;
    public byte K;
    public C2717c8 L;
    public final A M;
    public final Z7 N;
    public final V7 O;
    public final C2683a8 P;
    public final U7 Q;
    public LinkedHashMap R;
    public final String S;
    public final Y7 T;

    /* renamed from: a, reason: collision with root package name */
    public final byte f32740a;

    /* renamed from: b, reason: collision with root package name */
    public final C3106z8 f32741b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32742c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f32743d;

    /* renamed from: e, reason: collision with root package name */
    public final long f32744e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f32745f;

    /* renamed from: g, reason: collision with root package name */
    public final String f32746g;

    /* renamed from: h, reason: collision with root package name */
    public final C2780g3 f32747h;

    /* renamed from: i, reason: collision with root package name */
    public final Y6 f32748i;

    /* renamed from: j, reason: collision with root package name */
    public final F5 f32749j;

    /* renamed from: k, reason: collision with root package name */
    public final tu.o f32750k;

    /* renamed from: l, reason: collision with root package name */
    public final C2700b8 f32751l;

    /* renamed from: m, reason: collision with root package name */
    public final String f32752m;

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f32753n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f32754o;

    /* renamed from: p, reason: collision with root package name */
    public AbstractC3045vf f32755p;

    /* renamed from: q, reason: collision with root package name */
    public N8 f32756q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f32757r;

    /* renamed from: s, reason: collision with root package name */
    public final AdConfig f32758s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f32759t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f32760u;

    /* renamed from: v, reason: collision with root package name */
    public C2734d8 f32761v;

    /* renamed from: w, reason: collision with root package name */
    public R0 f32762w;

    /* renamed from: x, reason: collision with root package name */
    public WeakReference f32763x;

    /* renamed from: y, reason: collision with root package name */
    public int f32764y;

    /* renamed from: z, reason: collision with root package name */
    public WeakReference f32765z;

    public C2734d8(Context context, byte b10, C3106z8 mNativeDataModel, String impressionId, Set set, AdConfig adConfig, long j10, boolean z10, String creativeId, C2780g3 c2780g3, Y6 y62, F5 f52) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(mNativeDataModel, "mNativeDataModel");
        kotlin.jvm.internal.e0.checkNotNullParameter(impressionId, "impressionId");
        kotlin.jvm.internal.e0.checkNotNullParameter(adConfig, "adConfig");
        kotlin.jvm.internal.e0.checkNotNullParameter(creativeId, "creativeId");
        this.f32740a = b10;
        this.f32741b = mNativeDataModel;
        this.f32742c = impressionId;
        this.f32743d = set;
        this.f32744e = j10;
        this.f32745f = z10;
        this.f32746g = creativeId;
        this.f32747h = c2780g3;
        this.f32748i = y62;
        this.f32749j = f52;
        this.f32750k = tu.q.lazy(X7.f32491a);
        this.f32751l = new C2700b8(this);
        this.f32752m = "d8";
        this.f32753n = new HashSet();
        this.f32754o = new ArrayList();
        this.f32758s = adConfig;
        this.f32761v = this;
        this.f32763x = new WeakReference(null);
        this.f32764y = -1;
        this.N = new Z7(this);
        this.O = new V7(this);
        this.P = new C2683a8(this);
        this.Q = new U7(this);
        this.f32763x = new WeakReference(context);
        C2925od.a(context, this);
        C2970r8 c2970r8 = mNativeDataModel.f33704e;
        if (c2970r8 != null) {
            c2970r8.f33312y = System.currentTimeMillis();
        }
        this.K = (byte) -1;
        this.M = A.f31609a;
        new Handler(Looper.getMainLooper()).post(new zk.k0(this, 2));
        this.S = "native";
        this.T = new Y7(this);
    }

    public final C2903n8 a(C3106z8 c3106z8, C2903n8 asset) {
        kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
        if (c3106z8 == null) {
            return null;
        }
        String str = asset.f33143h;
        if (str.length() == 0) {
            asset.f33146k = (byte) 0;
            return asset;
        }
        String[] strArr = (String[]) new sv.x("\\|").split(str, 0).toArray(new String[0]);
        if (strArr.length == 1) {
            asset.f33146k = a(strArr[0]);
            return asset;
        }
        C2903n8 c2903n8M = c3106z8.m(strArr[0]);
        if (c2903n8M == null) {
            return a(c3106z8.f33706g, asset);
        }
        if (kotlin.jvm.internal.e0.areEqual(c2903n8M, asset)) {
            return null;
        }
        c2903n8M.f33146k = a(strArr[1]);
        F5 f52 = this.f32749j;
        if (f52 != null) {
            String str2 = this.f32752m;
            ((G5) f52).a(str2, AbstractC2962r0.a(N6.a(str2, "TAG", "Referenced asset ("), c2903n8M.f33137b, ')'));
        }
        return c2903n8M;
    }

    public final C2903n8 b(C3106z8 c3106z8, C2903n8 c2903n8) {
        F5 f52;
        if (c3106z8 == null) {
            return null;
        }
        String str = c2903n8.f33151p;
        String str2 = c2903n8.f33152q;
        C2903n8 c2903n8A = a(c2903n8, c3106z8, str);
        if (c2903n8A == null) {
            c2903n8A = a(c2903n8, c3106z8, str2);
        }
        if (c2903n8A != null && (f52 = this.f32749j) != null) {
            String str3 = this.f32752m;
            ((G5) f52).a(str3, AbstractC2962r0.a(N6.a(str3, "TAG", "Referenced asset ("), c2903n8A.f33137b, ')'));
        }
        return c2903n8A;
    }

    @Override // com.inmobi.media.InterfaceC3063x
    public final boolean c() {
        return this.f32759t;
    }

    public final Context d() {
        Activity activityF = f();
        return activityF != null ? activityF : (Context) this.f32763x.get();
    }

    public final Activity f() {
        WeakReference weakReference = this.f32765z;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public final View g() {
        AbstractC3045vf abstractC3045vf = this.f32755p;
        if (abstractC3045vf != null) {
            return abstractC3045vf.b();
        }
        return null;
    }

    @Override // com.inmobi.media.InterfaceC3063x
    public final AdConfig getAdConfig() {
        return this.f32758s;
    }

    @Override // com.inmobi.media.InterfaceC3063x
    public final String getAdType() {
        return this.S;
    }

    @Override // com.inmobi.media.InterfaceC3063x
    public String getCreativeId() {
        return this.f32746g;
    }

    @Override // com.inmobi.media.InterfaceC3063x
    public final Object getDataModel() {
        return this.f32741b;
    }

    @Override // com.inmobi.media.InterfaceC3063x
    public InterfaceC3046w getFullScreenEventsListener() {
        return this.N;
    }

    @Override // com.inmobi.media.InterfaceC3063x
    public String getImpressionId() {
        return this.f32742c;
    }

    @Override // com.inmobi.media.InterfaceC3063x
    public final String getMarkupType() {
        return "inmobiJson";
    }

    @Override // com.inmobi.media.InterfaceC3063x
    public final byte getPlacementType() {
        return this.f32740a;
    }

    @Override // com.inmobi.media.InterfaceC3063x
    public View getVideoContainerView() {
        return null;
    }

    @Override // com.inmobi.media.InterfaceC3063x
    public AbstractC3062wf getViewableAd() {
        Context contextJ = j();
        if (this.f32755p == null && contextJ != null) {
            F5 f52 = this.f32749j;
            if (f52 != null) {
                String TAG = this.f32752m;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f52).c(TAG, "fireLoadedAndServedBeacons");
            }
            C2970r8 c2970r8 = this.f32741b.f33704e;
            if (c2970r8 != null) {
                HashMap mapA = a(c2970r8);
                a((byte) 1, mapA);
                a((byte) 2, mapA);
            }
            this.f32755p = new S5(contextJ, this, new Af(this, this.H, this.f32749j), this.f32749j);
            Set<Pe> set = this.f32743d;
            if (set != null) {
                for (Pe pe2 : set) {
                    try {
                        if (pe2.f32140a == 3) {
                            F5 f53 = this.f32749j;
                            if (f53 != null) {
                                String TAG2 = this.f32752m;
                                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                                ((G5) f53).a(TAG2, "OMID tracker");
                            }
                            Object obj = pe2.f32141b.get("omidAdSession");
                            C2956qa c2956qa = obj instanceof C2956qa ? (C2956qa) obj : null;
                            AbstractC3045vf abstractC3045vf = this.f32755p;
                            if (c2956qa == null || abstractC3045vf == null) {
                                F5 f54 = this.f32749j;
                                if (f54 != null) {
                                    String TAG3 = this.f32752m;
                                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG3, "TAG");
                                    ((G5) f54).b(TAG3, "Did not find a OMID ad session; the OMID decorator will not be applied.");
                                }
                            } else {
                                this.f32755p = this.K == 0 ? new C3023ua(this, abstractC3045vf, c2956qa, this.f32749j) : new C3040va(this, abstractC3045vf, c2956qa, this.f32749j);
                            }
                        }
                    } catch (Exception e10) {
                        F5 f55 = this.f32749j;
                        if (f55 != null) {
                            String str = this.f32752m;
                            ((G5) f55).b(str, Qf.a(e10, N6.a(str, "TAG", "Exception occurred while creating the Display viewable ad : ")));
                        }
                        Y5 y52 = Y5.f32563a;
                        Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
                    }
                }
            }
        }
        return this.f32755p;
    }

    public final N8 h() {
        AbstractC3045vf abstractC3045vf = this.f32755p;
        H8 h8C = abstractC3045vf != null ? abstractC3045vf.c() : null;
        H8 h82 = h8C != null ? h8C : null;
        if (h82 != null) {
            this.f32756q = h82.f31846e;
        }
        return this.f32756q;
    }

    public Df i() {
        return this.T;
    }

    public final Context j() {
        return (1 == this.f32740a || k()) ? f() : (Context) this.f32763x.get();
    }

    public boolean k() {
        return this.f32740a == 0 && f() != null;
    }

    public void l() {
        AbstractC3045vf abstractC3045vf;
        C2727d1 c2727d1;
        F5 f52 = this.f32749j;
        if (f52 != null) {
            String TAG = this.f32752m;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, C3191e4.h.f36510t0);
        }
        this.f32760u = true;
        C2735d9 c2735d9A = a(g());
        if (c2735d9A != null) {
            c2735d9A.b();
        }
        N8 n8H = h();
        if (n8H != null && (c2727d1 = n8H.f32062l) != null) {
            c2727d1.a();
        }
        Context contextD = d();
        if (contextD == null || (abstractC3045vf = this.f32755p) == null) {
            return;
        }
        abstractC3045vf.a(contextD, (byte) 1);
    }

    public final void m() {
        F5 f52 = this.f32749j;
        if (f52 != null) {
            String TAG = this.f32752m;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "reportFirstPageRendered");
        }
        C2970r8 c2970r8B = this.f32741b.b(0);
        if (this.f32753n.contains(0) || c2970r8B == null || this.f32759t) {
            return;
        }
        this.f32753n.add(0);
        c2970r8B.f33312y = System.currentTimeMillis();
        if (!this.f32757r) {
            this.f32754o.add(c2970r8B);
            return;
        }
        HashMap mapA = a(c2970r8B);
        F5 f53 = this.f32749j;
        if (f53 != null) {
            String TAG2 = this.f32752m;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            ((G5) f53).a(TAG2, "Page-view impression record request");
        }
        c2970r8B.a("page_view", mapA, (V7) null, this.f32749j);
    }

    public boolean n() {
        return false;
    }

    public final void o() {
        new Handler(Looper.getMainLooper()).post(new zk.k0(this, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        F5 f52 = this.f32749j;
        if (f52 != null) {
            String TAG = this.f32752m;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "onActivityDestroyed");
        }
        AbstractC3045vf abstractC3045vf = this.f32755p;
        if (abstractC3045vf != null) {
            abstractC3045vf.a(activity, (byte) 2);
        }
        C2780g3 c2780g3 = this.f32747h;
        if (c2780g3 != null) {
            c2780g3.b();
        }
        Context context = (Context) this.f32763x.get();
        if (context instanceof Activity) {
            ((Activity) context).getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.e0.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        AbstractC3045vf abstractC3045vf;
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        if (kotlin.jvm.internal.e0.areEqual(d(), activity)) {
            F5 f52 = this.f32749j;
            if (f52 != null) {
                String TAG = this.f32752m;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f52).c(TAG, C3191e4.h.f36512u0);
            }
            this.f32760u = false;
            C2735d9 c2735d9A = a(g());
            if (c2735d9A != null) {
                c2735d9A.c();
            }
            p();
            Context contextD = d();
            if (contextD == null || (abstractC3045vf = this.f32755p) == null) {
                return;
            }
            abstractC3045vf.a(contextD, (byte) 0);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        if (kotlin.jvm.internal.e0.areEqual(d(), activity)) {
            l();
        }
    }

    public final void p() {
        C2727d1 c2727d1;
        N8 n8H = h();
        if (n8H == null || (c2727d1 = n8H.f32062l) == null || c2727d1.f32730c) {
            return;
        }
        c2727d1.f32730c = true;
        c2727d1.a(c2727d1.f32729b);
    }

    public final void q() {
        R0 r02;
        F5 f52 = this.f32749j;
        if (f52 != null) {
            String TAG = this.f32752m;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "unlockRewards");
        }
        if (n()) {
            this.A = true;
            HashMap rewards = this.f32741b.f33707h;
            if (rewards == null || (r02 = this.f32762w) == null) {
                return;
            }
            kotlin.jvm.internal.e0.checkNotNullParameter(rewards, "rewards");
            F5 f53 = r02.f32179a.f32321j;
            if (f53 != null) {
                String strE = U0.e();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "<get-TAG>(...)");
                ((G5) f53).a(strE, "onAdRewardsUnlocked");
            }
            if (r02.f32179a.a0()) {
                return;
            }
            H0 h02 = (H0) r02.f32180b.get();
            if (h02 != null) {
                h02.b(new HashMap(rewards));
                return;
            }
            F5 f54 = r02.f32179a.f32321j;
            if (f54 != null) {
                ((G5) f54).b("InMobi", "Listener was garbage collected.Unable to give callback");
            }
        }
    }

    @Override // com.inmobi.media.InterfaceC3063x
    public final void setFullScreenActivityContext(Activity activity) {
        this.f32765z = new WeakReference(activity);
    }

    public static final void d(C2734d8 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.A = true;
        this$0.b((C2903n8) null);
    }

    public void c(C2903n8 asset) {
        C2735d9 c2735d9A;
        ValueAnimator valueAnimator;
        kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
        F5 f52 = this.f32749j;
        if (f52 != null) {
            String TAG = this.f32752m;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "triggerAssetAction");
        }
        byte b10 = asset.f33146k;
        if (b10 == 0 || b10 == 5) {
            return;
        }
        if (b10 == 2) {
            this.A = true;
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.H;
            if (gestureDetectorOnGestureListenerC3093yc != null) {
                F5 f53 = gestureDetectorOnGestureListenerC3093yc.f33628i;
                if (f53 != null) {
                    String TAG2 = GestureDetectorOnGestureListenerC3093yc.f33611b1;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                    ((G5) f53).a(TAG2, "skipToInterActive");
                }
                gestureDetectorOnGestureListenerC3093yc.c("window.imraid.broadcastEvent('skip');");
            }
            C2735d9 c2735d9A2 = a(g());
            if (c2735d9A2 != null) {
                c2735d9A2.b();
            }
            b(asset);
            C2780g3 c2780g3 = this.f32747h;
            if (c2780g3 == null || c2780g3.f32867g.get()) {
                return;
            }
            c2780g3.f32864d.f33004h = 1;
            kotlin.jvm.internal.e0.checkNotNull(c2780g3.f32863c);
            return;
        }
        if (b10 == 3) {
            try {
                GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc2 = this.H;
                if (gestureDetectorOnGestureListenerC3093yc2 != null) {
                    F5 f54 = gestureDetectorOnGestureListenerC3093yc2.f33628i;
                    if (f54 != null) {
                        String TAG3 = GestureDetectorOnGestureListenerC3093yc.f33611b1;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG3, "TAG");
                        ((G5) f54).a(TAG3, "replayToInterActive");
                    }
                    gestureDetectorOnGestureListenerC3093yc2.c("window.imraid.broadcastEvent('replay');");
                }
                View viewG = g();
                if (viewG != null) {
                    ViewParent parent = viewG.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(viewG);
                    }
                }
                C2734d8 c2734d8 = this.f32761v;
                C2734d8 c2734d82 = c2734d8 != null ? c2734d8 : null;
                if (c2734d82 != null && (c2735d9A = a(c2734d82.g())) != null && (valueAnimator = c2735d9A.f32779n) != null && valueAnimator.isRunning()) {
                    valueAnimator.setCurrentPlayTime(c2735d9A.f32771f * 1000);
                    c2735d9A.f32777l = 360 * 1.0f;
                    c2735d9A.invalidate();
                }
                if (!kotlin.jvm.internal.e0.areEqual("VIDEO", asset.f33138c)) {
                    F5 f55 = this.f32749j;
                    if (f55 != null) {
                        String TAG4 = this.f32752m;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG4, "TAG");
                        ((G5) f55).b(TAG4, "Action 3 not valid for asset of type: " + asset.f33138c);
                        return;
                    }
                    return;
                }
                if (c2734d8 instanceof C2853k9) {
                    View videoContainerView = ((C2853k9) c2734d8).getVideoContainerView();
                    C3056w9 c3056w9 = videoContainerView instanceof C3056w9 ? (C3056w9) videoContainerView : null;
                    if (c3056w9 != null) {
                        C3039v9 videoView = c3056w9.getVideoView();
                        Object tag = videoView.getTag();
                        C2887m9 c2887m9 = tag instanceof C2887m9 ? (C2887m9) tag : null;
                        if (c2887m9 != null) {
                            if (c2887m9.c()) {
                                videoView.k();
                            } else {
                                videoView.c();
                            }
                        } else if (1 == this.f32740a) {
                            videoView.k();
                        } else {
                            videoView.c();
                        }
                        if (c2887m9 != null) {
                            a(c2887m9);
                        }
                        videoView.start();
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception e10) {
                F5 f56 = this.f32749j;
                if (f56 != null) {
                    String str = this.f32752m;
                    ((G5) f56).b(str, Qf.a(e10, N6.a(str, "TAG", "Encountered unexpected error in handling replay action on video: ")));
                }
                AbstractC2902n7.a((byte) 2, "InMobi", "SDK encountered unexpected error in replaying video");
                Y5 y52 = Y5.f32563a;
                Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
                return;
            }
        }
        if (b10 == 1) {
            try {
                GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc3 = this.H;
                if (gestureDetectorOnGestureListenerC3093yc3 != null) {
                    F5 f57 = gestureDetectorOnGestureListenerC3093yc3.f33628i;
                    if (f57 != null) {
                        String TAG5 = GestureDetectorOnGestureListenerC3093yc.f33611b1;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG5, "TAG");
                        ((G5) f57).a(TAG5, "closeToInterActive");
                    }
                    gestureDetectorOnGestureListenerC3093yc3.c("window.imraid.broadcastEvent('close');");
                }
                a();
                return;
            } catch (Exception e11) {
                F5 f58 = this.f32749j;
                if (f58 != null) {
                    String str2 = this.f32752m;
                    ((G5) f58).b(str2, Qf.a(e11, N6.a(str2, "TAG", "Encountered unexpected error in handling exit action on video: ")));
                }
                AbstractC2902n7.a((byte) 2, "InMobi", "SDK encountered unexpected error in exiting video");
                Y5 y53 = Y5.f32563a;
                Y5.f32566d.a(C5.a(e11, NotificationCompat.CATEGORY_EVENT));
                return;
            }
        }
        if (b10 != 4) {
            this.A = true;
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc4 = this.H;
            if (gestureDetectorOnGestureListenerC3093yc4 != null) {
                F5 f59 = gestureDetectorOnGestureListenerC3093yc4.f33628i;
                if (f59 != null) {
                    String TAG6 = GestureDetectorOnGestureListenerC3093yc.f33611b1;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG6, "TAG");
                    ((G5) f59).a(TAG6, "skipToInterActive");
                }
                gestureDetectorOnGestureListenerC3093yc4.c("window.imraid.broadcastEvent('skip');");
            }
            C2735d9 c2735d9A3 = a(g());
            if (c2735d9A3 != null) {
                c2735d9A3.b();
            }
            b(asset);
            return;
        }
        try {
            if (this.f32740a == 0) {
                F5 f510 = this.f32749j;
                if (f510 != null) {
                    String TAG7 = this.f32752m;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG7, "TAG");
                    ((G5) f510).c(TAG7, "launchFullscreen");
                }
                C2734d8 c2734d8C = c(this);
                if (c2734d8C == null) {
                    return;
                }
                R0 r02 = c2734d8C.f32762w;
                if (r02 != null) {
                    r02.e();
                }
                A a10 = this.M;
                int iHashCode = hashCode();
                W7 w72 = new W7(this, c2734d8C);
                a10.getClass();
                A.a(iHashCode, w72);
            }
        } catch (Exception e12) {
            F5 f511 = this.f32749j;
            if (f511 != null) {
                String str3 = this.f32752m;
                ((G5) f511).b(str3, Qf.a(e12, N6.a(str3, "TAG", "Encountered unexpected error in handling fullscreen action ")));
            }
            AbstractC2902n7.a((byte) 2, "InMobi", "SDK encountered unexpected error in launching fullscreen ad");
            Y5 y54 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e12, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public void b(View view) {
        R0 r02;
        if (this.f32757r || this.f32759t) {
            return;
        }
        this.f32757r = true;
        C2780g3 c2780g3 = this.f32747h;
        if (c2780g3 != null) {
            c2780g3.a();
        }
        F5 f52 = this.f32749j;
        if (f52 != null) {
            String TAG = this.f32752m;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "A viewable impression is reported on ad view.");
        }
        C2970r8 c2970r8 = this.f32741b.f33704e;
        if (c2970r8 != null) {
            c2970r8.a("Impression", a(c2970r8), this.O, this.f32749j);
        }
        m();
        Iterator it = this.f32754o.iterator();
        while (it.hasNext()) {
            C2903n8 c2903n8 = (C2903n8) it.next();
            HashMap mapA = a(c2903n8);
            F5 f53 = this.f32749j;
            if (f53 != null) {
                String TAG2 = this.f32752m;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                ((G5) f53).a(TAG2, "Page-view impression record request");
            }
            c2903n8.a("page_view", mapA, (V7) null, this.f32749j);
        }
        this.f32754o.clear();
        AbstractC3045vf abstractC3045vf = this.f32755p;
        if (abstractC3045vf != null) {
            abstractC3045vf.a((byte) 0);
        }
        C2734d8 c2734d8C = c(this);
        if (c2734d8C == null || (r02 = c2734d8C.f32762w) == null) {
            return;
        }
        r02.f();
    }

    @Override // com.inmobi.media.InterfaceC3063x
    public final void e() {
    }

    public final void a(Context context) {
        this.f32763x = new WeakReference(context);
        C2925od.a(context, this);
    }

    public static final void a(C2734d8 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        A a10 = this$0.M;
        int iHashCode = this$0.hashCode();
        C2683a8 c2683a8 = this$0.P;
        a10.getClass();
        A.a(iHashCode, c2683a8);
    }

    @Override // com.inmobi.media.InterfaceC3063x
    public final void a(byte b10, Map map) {
        C2970r8 c2970r8;
        if (this.f32759t || b10 == 0 || b10 == 3) {
            return;
        }
        if (b10 == 1) {
            C2970r8 c2970r82 = this.f32741b.f33704e;
            if (c2970r82 != null) {
                F5 f52 = this.f32749j;
                if (f52 != null) {
                    String TAG = this.f32752m;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                    ((G5) f52).a(TAG, "reportAdLoad");
                }
                c2970r82.a("load", (HashMap) map, (V7) null, this.f32749j);
                return;
            }
            return;
        }
        if (b10 != 2 || (c2970r8 = this.f32741b.f33704e) == null) {
            return;
        }
        F5 f53 = this.f32749j;
        if (f53 != null) {
            String TAG2 = this.f32752m;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            ((G5) f53).a(TAG2, "reportAdServed");
        }
        c2970r8.a("client_fill", (HashMap) map, (V7) null, this.f32749j);
    }

    public static final void b(C2734d8 it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "$it");
        A a10 = it.M;
        int iHashCode = it.hashCode();
        C2683a8 c2683a8 = it.P;
        a10.getClass();
        A.a(iHashCode, c2683a8);
    }

    public final void a(View view, C2903n8 asset) {
        String strA;
        R0 r02;
        kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
        if (this.f32759t) {
            return;
        }
        m();
        C2903n8 c2903n8B = b(this.f32741b, asset);
        if (c2903n8B != null) {
            HashMap mapA = a(c2903n8B);
            a(c2903n8B, mapA);
            if (!kotlin.jvm.internal.e0.areEqual(c2903n8B, asset)) {
                a(asset, mapA);
            }
        } else {
            F5 f52 = this.f32749j;
            if (f52 != null) {
                String TAG = this.f32752m;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f52).b(TAG, "Couldn't find an asset reference for this asset click URL");
            }
            a(asset, a(asset));
        }
        C2734d8 c2734d8C = c(this);
        if (c2734d8C == null) {
            return;
        }
        String str = asset.f33151p;
        if (str != null) {
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = kotlin.jvm.internal.e0.compare((int) str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            strA = S7.a(length, 1, str, i10);
        } else {
            strA = null;
        }
        if (D2.a(strA) && (r02 = c2734d8C.f32762w) != null) {
            r02.a();
        }
        C2903n8 c2903n8A = a(this.f32741b, asset);
        if (c2903n8A != null) {
            if (view != null && kotlin.jvm.internal.e0.areEqual("VIDEO", c2903n8A.f33138c) && 5 == c2903n8A.f33146k) {
                view.setVisibility(4);
                asset.f33157v = 4;
            }
            c(c2903n8A);
            return;
        }
        F5 f53 = this.f32749j;
        if (f53 != null) {
            String TAG2 = this.f32752m;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            ((G5) f53).b(TAG2, "Couldn't find an asset reference for this asset action! Ignoring the asset action ...");
        }
    }

    public final void b(C2903n8 c2903n8) {
        AbstractC3062wf viewableAd;
        F5 f52 = this.f32749j;
        if (f52 != null) {
            String TAG = this.f32752m;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "showEndCard");
        }
        C2734d8 c2734d8 = this.J;
        if (c2734d8 != null && g() != null) {
            try {
                View viewG = g();
                ViewGroup viewGroup = viewG instanceof ViewGroup ? (ViewGroup) viewG : null;
                View viewA = (viewGroup == null || (viewableAd = c2734d8.getViewableAd()) == null) ? null : viewableAd.a(null, viewGroup, false);
                if (viewA != null) {
                    if (viewGroup != null) {
                        viewGroup.addView(viewA);
                    }
                    viewA.setClickable(true);
                    c2734d8.p();
                    if (c2903n8 instanceof C2887m9) {
                        InterfaceC3028uf interfaceC3028ufD = ((C2887m9) c2903n8).d();
                        C2859kf c2859kf = interfaceC3028ufD != null ? ((C3011tf) interfaceC3028ufD).f33414j : null;
                        if (c2859kf == null) {
                            return;
                        }
                        c2859kf.f33031g = true;
                        return;
                    }
                    return;
                }
                F5 f53 = this.f32749j;
                if (f53 != null) {
                    String TAG2 = this.f32752m;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                    ((G5) f53).b(TAG2, "Could not inflate the end card. Closing the ad");
                }
                a();
                return;
            } catch (Exception e10) {
                F5 f54 = this.f32749j;
                if (f54 != null) {
                    String TAG3 = this.f32752m;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG3, "TAG");
                    ((G5) f54).a(TAG3, "Failed to show end card Exception", e10);
                }
                a();
                Y5 y52 = Y5.f32563a;
                Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
                return;
            }
        }
        F5 f55 = this.f32749j;
        if (f55 != null) {
            String TAG4 = this.f32752m;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG4, "TAG");
            ((G5) f55).b(TAG4, "End card container is null; end card will not be shown");
        }
        AbstractC2902n7.a((byte) 2, "InMobi", "Failed to show end card");
        a();
    }

    @Override // com.inmobi.media.InterfaceC3063x
    public void b() {
        F5 f52 = this.f32749j;
        if (f52 != null) {
            String TAG = this.f32752m;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "destroyContainer");
        }
        if (this.f32759t) {
            return;
        }
        this.f32759t = true;
        C2780g3 c2780g3 = this.f32747h;
        if (c2780g3 != null) {
            c2780g3.b();
        }
        this.f32764y = -1;
        C2734d8 c2734d8 = this.C;
        if (c2734d8 != null) {
            c2734d8.a();
        }
        this.f32762w = null;
        N8 n8H = h();
        if (n8H != null) {
            C2727d1 c2727d1 = n8H.f32062l;
            Iterator it = c2727d1.f32729b.iterator();
            while (it.hasNext()) {
                ((C2710c1) it.next()).f32697a.cancel();
            }
            c2727d1.f32729b.clear();
            n8H.f32064n = true;
            n8H.f32059i.clear();
            n8H.f32066p = null;
            V8 v82 = n8H.f32060j;
            if (v82 != null) {
                v82.destroy();
            }
            n8H.f32060j = null;
        }
        this.f32756q = null;
        this.f32754o.clear();
        AbstractC3045vf abstractC3045vf = this.f32755p;
        if (abstractC3045vf != null) {
            abstractC3045vf.e();
        }
        AbstractC3045vf abstractC3045vf2 = this.f32755p;
        if (abstractC3045vf2 != null) {
            abstractC3045vf2.a();
        }
        Context context = (Context) this.f32763x.get();
        if (context instanceof Activity) {
            ((Activity) context).getApplication().unregisterActivityLifecycleCallbacks(this);
        }
        this.f32763x.clear();
        WeakReference weakReference = this.f32765z;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.H = null;
        C2734d8 c2734d82 = this.J;
        if (c2734d82 != null) {
            c2734d82.b();
        }
        this.J = null;
        A a10 = this.M;
        int iHashCode = hashCode();
        a10.getClass();
        SparseArray sparseArray = A.f31610b;
        sparseArray.remove(iHashCode);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("A", "TAG");
        sparseArray.size();
    }

    public final C2903n8 a(C2903n8 c2903n8, C3106z8 c3106z8, String str) {
        if (B2.a((Context) this.f32763x.get(), str) || str == null || str.length() == 0) {
            return c2903n8;
        }
        String[] strArr = (String[]) new sv.x("\\|").split(str, 0).toArray(new String[0]);
        C2903n8 c2903n8M = c3106z8.m(strArr[0]);
        if (c2903n8M == null) {
            return b(c3106z8.f33706g, c2903n8);
        }
        if (kotlin.jvm.internal.e0.areEqual(c2903n8M, c2903n8)) {
            return null;
        }
        if (strArr.length <= 2) {
            c2903n8M.f33147l = (byte) 1;
            return c2903n8M;
        }
        c2903n8M.f33147l = AbstractC3055w8.a(strArr[2]);
        return c2903n8M;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte a(java.lang.String r7) {
        /*
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = "US"
            java.lang.String r2 = "this as java.lang.String).toLowerCase(locale)"
            java.lang.String r7 = b0.e2.p(r0, r1, r7, r0, r2)
            int r0 = r7.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
            r4 = r3
        L13:
            if (r3 > r0) goto L38
            if (r4 != 0) goto L19
            r5 = r3
            goto L1a
        L19:
            r5 = r0
        L1a:
            char r5 = r7.charAt(r5)
            r6 = 32
            int r5 = kotlin.jvm.internal.e0.compare(r5, r6)
            if (r5 > 0) goto L28
            r5 = r1
            goto L29
        L28:
            r5 = r2
        L29:
            if (r4 != 0) goto L32
            if (r5 != 0) goto L2f
            r4 = r1
            goto L13
        L2f:
            int r3 = r3 + 1
            goto L13
        L32:
            if (r5 != 0) goto L35
            goto L38
        L35:
            int r0 = r0 + (-1)
            goto L13
        L38:
            java.lang.String r7 = com.inmobi.media.S7.a(r0, r1, r7, r3)
            int r0 = r7.hashCode()
            switch(r0) {
                case -934641255: goto L7e;
                case -934524953: goto L75;
                case 0: goto L6f;
                case 3127582: goto L65;
                case 3443508: goto L5a;
                case 3532159: goto L4f;
                case 110066619: goto L44;
                default: goto L43;
            }
        L43:
            goto L86
        L44:
            java.lang.String r0 = "fullscreen"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L4d
            goto L86
        L4d:
            r7 = 4
            return r7
        L4f:
            java.lang.String r0 = "skip"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L58
            goto L86
        L58:
            r7 = 2
            return r7
        L5a:
            java.lang.String r0 = "play"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L63
            goto L86
        L63:
            r7 = 5
            return r7
        L65:
            java.lang.String r0 = "exit"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L6e
            goto L86
        L6e:
            return r1
        L6f:
            java.lang.String r0 = ""
            r7.equals(r0)
            goto L86
        L75:
            java.lang.String r0 = "replay"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L87
            goto L86
        L7e:
            java.lang.String r0 = "reload"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L87
        L86:
            return r2
        L87:
            r7 = 3
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2734d8.a(java.lang.String):byte");
    }

    public final void a(C2903n8 asset, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
        C3106z8 c3106z8 = this.f32741b;
        if (!c3106z8.f33716q || this.f32759t) {
            return;
        }
        C2903n8 c2903n8B = b(c3106z8, asset);
        if (c2903n8B != null) {
            HashMap mapA = a(c2903n8B);
            String str = asset.f33142g;
            kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
            c2903n8B.f33142g = str;
            String strA = null;
            X6 x62 = ((TelemetryConfig.LandingPageConfig) this.f32750k.getValue()).getNativeEnabled() ? new X6(this.f32748i, P6.a(c2903n8B.f33151p), 0, 12) : null;
            P6.a(L6.f31990d, x62, (Integer) null, 12);
            if (kotlin.jvm.internal.e0.areEqual("VIDEO", c2903n8B.f33138c) || c2903n8B.f33141f) {
                F5 f52 = this.f32749j;
                if (f52 != null) {
                    String TAG = this.f32752m;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                    ((G5) f52).a(TAG, "Asset interaction requested");
                }
                String str2 = c2903n8B.f33142g;
                AbstractC3045vf abstractC3045vf = this.f32755p;
                if (abstractC3045vf != null) {
                    abstractC3045vf.a((byte) 4);
                }
                if (kotlin.jvm.internal.e0.areEqual("NO_ACTION", str2)) {
                    P6.a(L6.f31991e, x62, (Integer) 10, 8);
                    return;
                }
                String str3 = c2903n8B.f33151p;
                if (2 == c2903n8B.f33147l) {
                    kotlin.jvm.internal.e0.checkNotNull(c2903n8B, "null cannot be cast to non-null type com.inmobi.ads.modelsv2.NativeVideoAsset");
                    InterfaceC3028uf interfaceC3028ufD = ((C2887m9) c2903n8B).d();
                    C2859kf c2859kf = interfaceC3028ufD != null ? ((C3011tf) interfaceC3028ufD).f33414j : null;
                    String str4 = c2859kf != null ? c2859kf.f33027c : null;
                    if (str4 != null) {
                        int length = str4.length() - 1;
                        int i10 = 0;
                        boolean z11 = false;
                        while (i10 <= length) {
                            boolean z12 = kotlin.jvm.internal.e0.compare((int) str4.charAt(!z11 ? i10 : length), 32) <= 0;
                            if (z11) {
                                if (!z12) {
                                    break;
                                } else {
                                    length--;
                                }
                            } else if (z12) {
                                i10++;
                            } else {
                                z11 = true;
                            }
                        }
                        strA = S7.a(length, 1, str4, i10);
                    }
                    if (D2.a(strA)) {
                        str3 = str4;
                    }
                }
                if (!B2.a(d(), str3)) {
                    F5 f53 = this.f32749j;
                    if (f53 != null) {
                        String TAG2 = this.f32752m;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                        ((G5) f53).b(TAG2, "Invalid url:" + str3 + " will use fallback");
                    }
                    str3 = c2903n8B.f33152q;
                    if (!B2.a(d(), str3)) {
                        F5 f54 = this.f32749j;
                        if (f54 != null) {
                            String str5 = this.f32752m;
                            ((G5) f54).b(str5, O6.a(str5, "TAG", "Invalid fallback url:", str3));
                        }
                        P6.a(L6.f31991e, x62, (Integer) 3, 8);
                        return;
                    }
                }
                boolean z13 = C2736da.f32781a;
                kotlin.jvm.internal.e0.checkNotNull(str3);
                String strA2 = C2736da.a(str3, mapA);
                C2780g3 c2780g3 = this.f32747h;
                if (c2780g3 != null && !c2780g3.f32867g.get()) {
                    c2780g3.f32864d.f33003g = 1;
                    kotlin.jvm.internal.e0.checkNotNull(c2780g3.f32863c);
                }
                if (this.D && !z10) {
                    C2734d8 c2734d8C = c(this);
                    if (c2734d8C == null) {
                        return;
                    }
                    R0 r02 = c2734d8C.f32762w;
                    if (r02 != null) {
                        if (kotlin.jvm.internal.e0.areEqual("INAPP", str2) && B2.a(strA2)) {
                            r02.e();
                        } else {
                            r02.g();
                        }
                    }
                    this.E = c2903n8B;
                    this.F = strA2;
                    return;
                }
                a(c2903n8B, str2, strA2, x62);
                return;
            }
            return;
        }
        F5 f55 = this.f32749j;
        if (f55 != null) {
            String TAG3 = this.f32752m;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG3, "TAG");
            ((G5) f55).b(TAG3, "Couldn't find an asset reference for this asset click URL");
        }
    }

    public static C2734d8 c(C2734d8 c2734d8) {
        if (c2734d8 == null) {
            return null;
        }
        if (c2734d8.f() != null || kotlin.jvm.internal.e0.areEqual(c2734d8, c2734d8.f32761v)) {
            return c2734d8;
        }
        C2734d8 c2734d82 = c2734d8.f32761v;
        return c(c2734d82 != null ? c2734d82 : null);
    }

    public final void a(C2903n8 c2903n8, HashMap map) {
        F5 f52 = this.f32749j;
        if (f52 != null) {
            String TAG = this.f32752m;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "Click impression record requested");
        }
        if (2 == c2903n8.f33147l) {
            C2887m9 c2887m9 = c2903n8 instanceof C2887m9 ? (C2887m9) c2903n8 : null;
            InterfaceC3028uf interfaceC3028ufD = c2887m9 != null ? c2887m9.d() : null;
            C2859kf c2859kf = interfaceC3028ufD != null ? ((C3011tf) interfaceC3028ufD).f33414j : null;
            if ((c2859kf != null ? c2859kf.f33027c : null) != null && c2903n8.f33151p != null) {
                if (c2859kf.f33030f.isEmpty()) {
                    return;
                }
                Iterator it = c2859kf.a("click").iterator();
                while (it.hasNext()) {
                    C2903n8.a((C2752e9) it.next(), map, (V7) null, this.f32749j);
                }
                return;
            }
            F5 f53 = this.f32749j;
            if (f53 != null) {
                String TAG2 = this.f32752m;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                ((G5) f53).a(TAG2, "reportAdClick");
            }
            c2903n8.a("click", map, (V7) null, this.f32749j);
            return;
        }
        F5 f54 = this.f32749j;
        if (f54 != null) {
            String TAG3 = this.f32752m;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG3, "TAG");
            ((G5) f54).a(TAG3, "reportAdClick");
        }
        c2903n8.a("click", map, (V7) null, this.f32749j);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.HashMap a(com.inmobi.media.C2903n8 r9) {
        /*
            r8 = this;
            java.lang.String r0 = "asset"
            kotlin.jvm.internal.e0.checkNotNullParameter(r9, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 4
            r0.<init>(r1)
            boolean r1 = r8.f32759t
            if (r1 == 0) goto L10
            return r0
        L10:
            java.lang.String r1 = "child"
            kotlin.jvm.internal.e0.checkNotNullParameter(r9, r1)
            boolean r1 = r9 instanceof com.inmobi.media.C2970r8
            r2 = 1
            java.lang.String r3 = "card_scrollable"
            if (r1 == 0) goto L28
            r1 = r9
            com.inmobi.media.r8 r1 = (com.inmobi.media.C2970r8) r1
            java.lang.String r4 = r1.f33137b
            boolean r4 = sv.k0.equals(r3, r4, r2)
            if (r4 == 0) goto L28
            goto L40
        L28:
            com.inmobi.media.r8 r9 = r9.f33153r
            r1 = 0
            if (r9 == 0) goto L2e
            goto L2f
        L2e:
            r9 = r1
        L2f:
            if (r9 == 0) goto L40
            java.lang.String r4 = r9.f33137b
            boolean r4 = sv.k0.equals(r3, r4, r2)
            if (r4 == 0) goto L3b
            r1 = r9
            goto L40
        L3b:
            com.inmobi.media.r8 r9 = r9.f33153r
            if (r9 == 0) goto L2e
            goto L2f
        L40:
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 0
            if (r1 == 0) goto L4f
            long r6 = r1.f33312y
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 == 0) goto L4f
            r2 = r6
        L4f:
            com.inmobi.media.z8 r9 = r8.f32741b
            com.inmobi.media.r8 r9 = r9.f33704e
            if (r9 == 0) goto L57
            long r4 = r9.f33312y
        L57:
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "$LTS"
            r0.put(r1, r9)
            java.lang.String r9 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "$STS"
            r0.put(r1, r9)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "$TS"
            r0.put(r1, r9)
            com.inmobi.media.z8 r9 = r8.f32741b
            java.util.Map r9 = r9.f33719t
            if (r9 != 0) goto L81
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
        L81:
            r0.putAll(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2734d8.a(com.inmobi.media.n8):java.util.HashMap");
    }

    public static C2735d9 a(View view) {
        View viewFindViewWithTag = view != null ? view.findViewWithTag("timerView") : null;
        if (viewFindViewWithTag instanceof C2735d9) {
            return (C2735d9) viewFindViewWithTag;
        }
        return null;
    }

    public final void a(C2887m9 c2887m9) {
        InterfaceC3028uf interfaceC3028ufD = c2887m9.d();
        C2859kf c2859kf = interfaceC3028ufD != null ? ((C3011tf) interfaceC3028ufD).f33414j : null;
        if (c2859kf == null || !c2859kf.f33031g) {
            return;
        }
        F5 f52 = this.f32749j;
        if (f52 != null) {
            String TAG = this.f32752m;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "Invoking close end card trackers.");
        }
        Iterator it = c2859kf.a("closeEndCard").iterator();
        while (it.hasNext()) {
            C2903n8.a((C2752e9) it.next(), a((C2903n8) c2887m9), (V7) null, this.f32749j);
        }
        c2859kf.f33031g = false;
    }

    public final void a() {
        F5 f52 = this.f32749j;
        if (f52 != null) {
            String TAG = this.f32752m;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "dismissCurrentViewContainer");
        }
        if (this.f32759t) {
            return;
        }
        try {
            C2734d8 container = c(this);
            if (container == null) {
                return;
            }
            container.q();
            SparseArray sparseArray = InMobiAdActivity.f31591k;
            kotlin.jvm.internal.e0.checkNotNullParameter(container, "container");
            InMobiAdActivity.f31591k.remove(container.hashCode());
            if (container instanceof C2853k9) {
                View videoContainerView = container.getVideoContainerView();
                C3056w9 c3056w9 = videoContainerView instanceof C3056w9 ? (C3056w9) videoContainerView : null;
                if (c3056w9 != null) {
                    C3039v9 videoView = c3056w9.getVideoView();
                    Object tag = videoView.getTag();
                    if (tag instanceof C2887m9) {
                        HashMap map = ((C2887m9) tag).f33155t;
                        map.put("seekPosition", Integer.valueOf(videoView.getCurrentPosition()));
                        map.put("lastMediaVolume", Integer.valueOf(videoView.getVolume()));
                        C2903n8 c2903n8 = ((C2887m9) tag).f33158w;
                        if (c2903n8 instanceof C2887m9) {
                            ((C2887m9) c2903n8).a((C2887m9) tag);
                        }
                        a((C2887m9) tag);
                    }
                }
            }
            WeakReference weakReference = container.f32765z;
            Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
            if (activity instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity).f31598e = true;
                ((InMobiAdActivity) activity).finish();
                int i10 = this.f32764y;
                if (i10 != -1) {
                    ((InMobiAdActivity) activity).overridePendingTransition(0, i10);
                }
            }
            C2734d8 c2734d8 = this.f32761v;
            if (c2734d8 == null) {
                c2734d8 = null;
            }
            if (c2734d8 != null) {
                c2734d8.C = null;
                new Handler(Looper.getMainLooper()).post(new zk.k0(c2734d8, 1));
            }
        } catch (Exception e10) {
            F5 f53 = this.f32749j;
            if (f53 != null) {
                String str = this.f32752m;
                ((G5) f53).b(str, Qf.a(e10, N6.a(str, "TAG", "Encountered unexpected error in handling exit action on video: ")));
            }
            AbstractC2902n7.a((byte) 2, "InMobi", "SDK encountered unexpected error in exiting video");
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public final void a(C2903n8 asset, String interactionMode, String url, X6 x62) {
        R0 r02;
        kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
        kotlin.jvm.internal.e0.checkNotNullParameter(interactionMode, "interactionMode");
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        F5 f52 = this.f32749j;
        if (f52 != null) {
            String TAG = this.f32752m;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "openUrl");
        }
        boolean zAreEqual = kotlin.jvm.internal.e0.areEqual("EMBEDDED", interactionMode);
        tu.x0 x0Var = tu.x0.f87415a;
        if (zAreEqual) {
            if (x62 != null) {
                x62.f32490g = "IN_CUSTOM";
            }
            Integer numA = a(url, asset, x62);
            if (numA != null) {
                P6.a(L6.f31993g, x62, Integer.valueOf(numA.intValue()), 8);
            } else {
                x0Var = null;
            }
            if (x0Var == null) {
                P6.a(L6.f31992f, x62, (Integer) null, 12);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.e0.areEqual("INAPP", interactionMode)) {
            F5 f53 = this.f32749j;
            if (f53 != null) {
                String TAG2 = this.f32752m;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                ((G5) f53).c(TAG2, "openUrlInCCT");
            }
            Context context = (Context) this.f32763x.get();
            if (context == null) {
                return;
            }
            if (f() == null && (r02 = this.f32762w) != null) {
                r02.e();
            }
            String strA = AbstractC3101z3.a(context);
            try {
                boolean zIsCCTEnabled = this.f32758s.isCCTEnabled();
                if (strA != null && zIsCCTEnabled) {
                    new C2880m2(url, null, context, this.Q, this.f32751l, x62, "NATIVE").a();
                    return;
                }
                F5 f54 = this.f32749j;
                if (f54 != null) {
                    String TAG3 = this.f32752m;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG3, "TAG");
                    ((G5) f54).a(TAG3, "ChromeCustomTab fallback to Embedded");
                }
                if (x62 != null) {
                    x62.f32490g = "IN_CUSTOM";
                }
                Integer numA2 = a(url, asset, x62);
                if (numA2 != null) {
                    P6.a(L6.f31993g, x62, Integer.valueOf(numA2.intValue()), 8);
                } else {
                    x0Var = null;
                }
                if (x0Var == null) {
                    P6.a(L6.f31992f, x62, (Integer) null, 12);
                    return;
                }
                return;
            } catch (Exception e10) {
                try {
                    B2.a(context, url, this.f32751l, "NATIVE");
                    if (x62 != null) {
                        x62.f32490g = "EX_NATIVE";
                    }
                    P6.a(L6.f31992f, x62, (Integer) null, 12);
                } catch (Exception e11) {
                    F5 f55 = this.f32749j;
                    if (f55 != null) {
                        String TAG4 = this.f32752m;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG4, "TAG");
                        ((G5) f55).a(TAG4, "Exception occurred while opening External ", e11);
                    }
                    P6.a(L6.f31993g, x62, (Integer) 9, 8);
                }
                F5 f56 = this.f32749j;
                if (f56 != null) {
                    String TAG5 = this.f32752m;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG5, "TAG");
                    ((G5) f56).a(TAG5, "Fallback to External while opening cct", e10);
                    return;
                }
                return;
            }
        }
        String str = asset.f33152q;
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
        F5 f57 = this.f32749j;
        if (f57 != null) {
            String TAG6 = this.f32752m;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG6, "TAG");
            ((G5) f57).c(TAG6, "openUrlUsingExternalBrowser");
        }
        if (this.f32763x.get() == null) {
            return;
        }
        if (x62 != null) {
            x62.f32490g = "EX_NATIVE";
        }
        String strA2 = B2.a((Context) this.f32763x.get(), this.f32751l, url, str);
        if (strA2 != null) {
            C2734d8 c2734d8C = c(this);
            if (c2734d8C == null) {
                return;
            }
            R0 r03 = c2734d8C.f32762w;
            if (!this.D && r03 != null) {
                r03.g();
            }
            if (kotlin.jvm.internal.e0.areEqual(strA2, str)) {
                asset.a("TRACKER_EVENT_TYPE_FALLBACK_URL", a(asset), (V7) null, this.f32749j);
            }
            P6.a(L6.f31992f, x62, (Integer) null, 12);
            return;
        }
        P6.a(L6.f31993g, x62, (Integer) 6, 8);
    }

    public final Integer a(String url, C2903n8 asset, X6 x62) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
        try {
            Context context = (Context) this.f32763x.get();
            if (context == null) {
                return 7;
            }
            if (B2.a(url)) {
                F5 f52 = this.f32749j;
                if (f52 != null) {
                    String TAG = this.f32752m;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                    ((G5) f52).c(TAG, "openUrlUsingEmbeddedBrowser");
                }
                InMobiAdActivity.f31592l = null;
                C2717c8 c2717c8 = this.L;
                if (c2717c8 == null) {
                    c2717c8 = new C2717c8(this);
                    this.L = c2717c8;
                }
                InMobiAdActivity.f31593m = c2717c8;
                Intent intent = new Intent(context, (Class<?>) InMobiAdActivity.class);
                intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 100);
                intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL", url);
                intent.putExtra("placementId", this.f32744e);
                intent.putExtra("creativeId", getCreativeId());
                intent.putExtra("impressionId", getImpressionId());
                intent.putExtra("allowAutoRedirection", this.f32745f);
                if (x62 != null) {
                    intent.putExtra("lpTelemetryControlInfo", x62);
                }
                if (asset.f33144i) {
                    intent.putExtra("supportLockScreen", true);
                }
                C2925od.f33208a.a(context, intent);
                return null;
            }
            return 10;
        } catch (Exception e10) {
            F5 f53 = this.f32749j;
            if (f53 != null) {
                String TAG2 = this.f32752m;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                ((G5) f53).a(TAG2, "Error while opening Embedded Browser", e10);
            }
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            return 9;
        }
    }
}
