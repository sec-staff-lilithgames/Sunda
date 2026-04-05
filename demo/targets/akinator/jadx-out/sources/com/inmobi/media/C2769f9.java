package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.ironsource.C3191e4;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.f9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2769f9 extends Ve {

    /* renamed from: o, reason: collision with root package name */
    private final String f32840o;

    /* renamed from: p, reason: collision with root package name */
    private final String f32841p;

    /* renamed from: q, reason: collision with root package name */
    private C2886m8 f32842q;

    public C2769f9(PublisherCallbacks callbacks) {
        kotlin.jvm.internal.e0.checkNotNullParameter(callbacks, "callbacks");
        this.f32840o = "InMobi";
        this.f32841p = "f9";
        b(callbacks);
    }

    public static /* synthetic */ void a(C2769f9 c2769f9, C2788gb c2788gb, Context context, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            str = "native";
        }
        c2769f9.a(c2788gb, context, z10, str);
    }

    public final String D() {
        InterfaceC3063x interfaceC3063xK;
        C3089y8 c3089y8;
        C3072x8 c3072x8;
        C2886m8 c2886m8 = this.f32842q;
        if (c2886m8 != null && (interfaceC3063xK = c2886m8.k()) != null) {
            Object dataModel = interfaceC3063xK.getDataModel();
            C3106z8 c3106z8 = dataModel instanceof C3106z8 ? (C3106z8) dataModel : null;
            if (c3106z8 != null && (c3089y8 = c3106z8.f33715p) != null && (c3072x8 = c3089y8.f33603b) != null) {
                return c3072x8.f33567a;
            }
        }
        return null;
    }

    public final JSONObject E() {
        InterfaceC3063x interfaceC3063xK;
        C3089y8 c3089y8;
        C2886m8 c2886m8 = this.f32842q;
        if (c2886m8 != null && (interfaceC3063xK = c2886m8.k()) != null) {
            Object dataModel = interfaceC3063xK.getDataModel();
            C3106z8 c3106z8 = dataModel instanceof C3106z8 ? (C3106z8) dataModel : null;
            if (c3106z8 != null && (c3089y8 = c3106z8.f33715p) != null) {
                return c3089y8.f33602a;
            }
        }
        return null;
    }

    public final boolean F() {
        C2886m8 c2886m8 = this.f32842q;
        return c2886m8 != null && c2886m8.R() == 4;
    }

    public final boolean G() {
        InterfaceC3063x interfaceC3063xK;
        C3089y8 c3089y8;
        C3072x8 c3072x8;
        C2886m8 c2886m8 = this.f32842q;
        if (c2886m8 == null || (interfaceC3063xK = c2886m8.k()) == null) {
            return false;
        }
        Object dataModel = interfaceC3063xK.getDataModel();
        C3106z8 c3106z8 = dataModel instanceof C3106z8 ? (C3106z8) dataModel : null;
        if (c3106z8 == null || (c3089y8 = c3106z8.f33715p) == null || (c3072x8 = c3089y8.f33603b) == null) {
            return false;
        }
        return c3072x8.f33573g;
    }

    public boolean H() {
        return this.f32842q != null;
    }

    public final Boolean I() {
        C2886m8 c2886m8 = this.f32842q;
        if (c2886m8 != null) {
            return Boolean.valueOf(c2886m8.k() instanceof C2853k9);
        }
        return null;
    }

    public final void J() {
        C2886m8 c2886m8;
        if (kotlin.jvm.internal.e0.areEqual(u(), Boolean.FALSE)) {
            F5 f5P = p();
            if (f5P != null) {
                ((G5) f5P).b(this.f32840o, "Cannot call load() API after calling load(byte[])");
                return;
            }
            return;
        }
        a(Boolean.TRUE);
        C2886m8 c2886m82 = this.f32842q;
        if (c2886m82 == null || !a(this.f32840o, String.valueOf(c2886m82.J()), l()) || (c2886m8 = this.f32842q) == null || !c2886m8.e((byte) 1)) {
            return;
        }
        F5 f5P2 = p();
        if (f5P2 != null) {
            String TAG = this.f32841p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f5P2).a(TAG, "internal load timer started");
        }
        a((byte) 1);
        C2886m8 c2886m83 = this.f32842q;
        if (c2886m83 != null) {
            c2886m83.d0();
        }
    }

    public final void K() {
        F5 f5P = p();
        if (f5P != null) {
            String TAG = this.f32841p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f5P).a(TAG, "pause called");
        }
        C2886m8 c2886m8 = this.f32842q;
        if (c2886m8 != null) {
            F5 f52 = c2886m8.f32321j;
            if (f52 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                ((G5) f52).c("m8", C3191e4.h.f36510t0);
            }
            if (c2886m8.R() != 4 || (c2886m8.t() instanceof Activity)) {
                return;
            }
            InterfaceC3063x interfaceC3063xK = c2886m8.k();
            C2734d8 c2734d8 = interfaceC3063xK instanceof C2734d8 ? (C2734d8) interfaceC3063xK : null;
            if (c2734d8 != null) {
                c2734d8.l();
            }
        }
    }

    public final void L() {
        F5 f5P = p();
        if (f5P != null) {
            String TAG = this.f32841p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f5P).c(TAG, "reportAdClickAndOpenLandingPage");
        }
        C2886m8 c2886m8 = this.f32842q;
        if (c2886m8 != null) {
            F5 f52 = c2886m8.f32321j;
            if (f52 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                ((G5) f52).c("m8", "reportAdClickAndOpenLandingPage");
            }
            InterfaceC3063x interfaceC3063xK = c2886m8.k();
            if (interfaceC3063xK == null) {
                F5 f53 = c2886m8.f32321j;
                if (f53 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                    ((G5) f53).b("m8", "container is null. ignoring");
                    return;
                }
                return;
            }
            C2734d8 c2734d8 = interfaceC3063xK instanceof C2734d8 ? (C2734d8) interfaceC3063xK : null;
            C3106z8 c3106z8 = c2734d8 != null ? c2734d8.f32741b : null;
            if (c3106z8 != null) {
                C3089y8 c3089y8 = c3106z8.f33715p;
                C2903n8 c2903n8 = c3089y8 != null ? c3089y8.f33604c : null;
                if (c2903n8 != null) {
                    F5 f54 = c2886m8.f32321j;
                    if (f54 != null) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                        ((G5) f54).a("m8", "reporting ad click and opening landing page");
                    }
                    c2734d8.a((View) null, c2903n8);
                    c2734d8.a(c2903n8, true);
                }
            }
        }
    }

    public final void M() {
        AbstractC3045vf abstractC3045vf;
        F5 f5P = p();
        if (f5P != null) {
            String TAG = this.f32841p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f5P).a(TAG, "resume called");
        }
        C2886m8 c2886m8 = this.f32842q;
        if (c2886m8 != null) {
            F5 f52 = c2886m8.f32321j;
            if (f52 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                ((G5) f52).c("m8", C3191e4.h.f36512u0);
            }
            if (c2886m8.R() != 4 || (c2886m8.t() instanceof Activity)) {
                return;
            }
            InterfaceC3063x interfaceC3063xK = c2886m8.k();
            C2734d8 c2734d8 = interfaceC3063xK instanceof C2734d8 ? (C2734d8) interfaceC3063xK : null;
            if (c2734d8 != null) {
                F5 f53 = c2734d8.f32749j;
                if (f53 != null) {
                    String TAG2 = c2734d8.f32752m;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                    ((G5) f53).c(TAG2, C3191e4.h.f36512u0);
                }
                c2734d8.f32760u = false;
                C2735d9 c2735d9A = C2734d8.a(c2734d8.g());
                if (c2735d9A != null) {
                    c2735d9A.c();
                }
                c2734d8.p();
                Context contextD = c2734d8.d();
                if (contextD == null || (abstractC3045vf = c2734d8.f32755p) == null) {
                    return;
                }
                abstractC3045vf.a(contextD, (byte) 0);
            }
        }
    }

    public final void N() {
        F5 f5P = p();
        if (f5P != null) {
            String TAG = this.f32841p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f5P).c(TAG, "takeAction");
        }
        C2886m8 c2886m8 = this.f32842q;
        if (c2886m8 == null) {
            F5 f5P2 = p();
            if (f5P2 != null) {
                String TAG2 = this.f32841p;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                ((G5) f5P2).b(TAG2, "InMobiNative is not initialized. Ignoring takeAction");
                return;
            }
            return;
        }
        C2734d8 c2734d8H = c2886m8.H();
        if (c2734d8H != null) {
            F5 f52 = c2734d8H.f32749j;
            if (f52 != null) {
                String TAG3 = c2734d8H.f32752m;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG3, "TAG");
                ((G5) f52).c(TAG3, "takeAction");
            }
            C2903n8 c2903n8 = c2734d8H.E;
            String str = c2734d8H.F;
            Intent intent = c2734d8H.G;
            Context context = (Context) c2734d8H.f32763x.get();
            if (c2903n8 != null && str != null) {
                c2734d8H.a(c2903n8, c2903n8.f33142g, str, null);
            } else {
                if (intent == null || context == null) {
                    return;
                }
                C2925od.f33208a.a(context, intent);
            }
        }
    }

    @Override // com.inmobi.media.Ve, com.inmobi.media.H0
    public void b(AdMetaInfo info) {
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        F5 f5P = p();
        if (f5P != null) {
            String TAG = this.f32841p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f5P).c(TAG, "onAdFetchSuccess");
        }
        d(info);
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        C2886m8 c2886m8 = this.f32842q;
        if (c2886m8 == null) {
            F5 f5P2 = p();
            if (f5P2 != null) {
                String TAG2 = this.f32841p;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                ((G5) f5P2).b(TAG2, "adunit is null. load failed.");
            }
            a((U0) null, inMobiAdRequestStatus);
            return;
        }
        if (c2886m8.m() == null) {
            F5 f5P3 = p();
            if (f5P3 != null) {
                String TAG3 = this.f32841p;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG3, "TAG");
                ((G5) f5P3).b(TAG3, "adObject is null. load failed");
            }
            a((U0) null, inMobiAdRequestStatus);
            return;
        }
        super.b(info);
        s().post(new zk.n0(this, info, 1));
        if (F()) {
            return;
        }
        F5 f5P4 = p();
        if (f5P4 != null) {
            String TAG4 = this.f32841p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG4, "TAG");
            ((G5) f5P4).a(TAG4, "ad is ready. start ad render");
        }
        C2886m8 c2886m82 = this.f32842q;
        if (c2886m82 != null) {
            c2886m82.k0();
        }
    }

    @Override // com.inmobi.media.Ve, com.inmobi.media.H0
    public void c(AdMetaInfo info) {
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        F5 f5P = p();
        if (f5P != null) {
            String TAG = this.f32841p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f5P).b(TAG, "onAdLoadSucceeded");
        }
        super.c(info);
        a((byte) 2);
        F5 f5P2 = p();
        if (f5P2 != null) {
            String TAG2 = this.f32841p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            ((G5) f5P2).d(TAG2, "AdManager state - LOADED");
        }
        s().post(new zk.n0(this, info, 0));
    }

    @Override // com.inmobi.media.H0
    public void d() {
        F5 f5P = p();
        if (f5P != null) {
            String TAG = this.f32841p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f5P).b(TAG, com.ironsource.Mf.f34997e);
        }
        F5 f5P2 = p();
        if (f5P2 != null) {
            ((G5) f5P2).a();
        }
    }

    @Override // com.inmobi.media.H0
    public void f() {
        s().post(new zk.m0(this, 2));
    }

    @Override // com.inmobi.media.H0
    public void i() {
        s().post(new zk.m0(this, 0));
    }

    @Override // com.inmobi.media.Ve
    public U0 j() {
        return this.f32842q;
    }

    public final String A() {
        InterfaceC3063x interfaceC3063xK;
        C3089y8 c3089y8;
        C3072x8 c3072x8;
        C2886m8 c2886m8 = this.f32842q;
        if (c2886m8 != null && (interfaceC3063xK = c2886m8.k()) != null) {
            Object dataModel = interfaceC3063xK.getDataModel();
            C3106z8 c3106z8 = dataModel instanceof C3106z8 ? (C3106z8) dataModel : null;
            if (c3106z8 != null && (c3089y8 = c3106z8.f33715p) != null && (c3072x8 = c3089y8.f33603b) != null) {
                return c3072x8.f33569c;
            }
        }
        return null;
    }

    public final String B() {
        InterfaceC3063x interfaceC3063xK;
        C3089y8 c3089y8;
        C3072x8 c3072x8;
        C2886m8 c2886m8 = this.f32842q;
        if (c2886m8 != null && (interfaceC3063xK = c2886m8.k()) != null) {
            Object dataModel = interfaceC3063xK.getDataModel();
            C3106z8 c3106z8 = dataModel instanceof C3106z8 ? (C3106z8) dataModel : null;
            if (c3106z8 != null && (c3089y8 = c3106z8.f33715p) != null && (c3072x8 = c3089y8.f33603b) != null) {
                return c3072x8.f33572f;
            }
        }
        return null;
    }

    public final float C() {
        InterfaceC3063x interfaceC3063xK;
        C3089y8 c3089y8;
        C3072x8 c3072x8;
        C2886m8 c2886m8 = this.f32842q;
        if (c2886m8 == null || (interfaceC3063xK = c2886m8.k()) == null) {
            return 0.0f;
        }
        Object dataModel = interfaceC3063xK.getDataModel();
        C3106z8 c3106z8 = dataModel instanceof C3106z8 ? (C3106z8) dataModel : null;
        if (c3106z8 == null || (c3089y8 = c3106z8.f33715p) == null || (c3072x8 = c3089y8.f33603b) == null) {
            return 0.0f;
        }
        return c3072x8.f33571e;
    }

    public final void a(C2788gb pubSettings, Context context, boolean z10, String logType) {
        C2886m8 c2886m8;
        kotlin.jvm.internal.e0.checkNotNullParameter(pubSettings, "pubSettings");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(logType, "logType");
        C2886m8 c2886m82 = this.f32842q;
        if (c2886m82 == null) {
            Y yA = new Y("native").a(pubSettings.f32882a);
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
            this.f32842q = new C2886m8(context, yA.d(context instanceof Activity ? "activity" : "others").c(pubSettings.f32883b).a(pubSettings.f32884c).a(pubSettings.f32885d).e(pubSettings.f32886e).b(pubSettings.f32887f).a(), this);
        } else {
            c2886m82.a(context);
            C2886m8 c2886m83 = this.f32842q;
            if (c2886m83 != null) {
                kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
                c2886m83.c(context instanceof Activity ? "activity" : "others");
            }
        }
        if (z10) {
            w();
        }
        String str = pubSettings.f32886e;
        if (str != null) {
            F5 f5P = p();
            if (f5P != null) {
                ((G5) f5P).a();
            }
            a(Wb.a(logType, str, false));
            F5 f5P2 = p();
            if (f5P2 != null && (c2886m8 = this.f32842q) != null) {
                c2886m8.a(f5P2);
            }
            F5 f5P3 = p();
            if (f5P3 != null) {
                String TAG = this.f32841p;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f5P3).a(TAG, "adding mNativeAdUnit to referenceTracker");
            }
            C2886m8 c2886m84 = this.f32842q;
            kotlin.jvm.internal.e0.checkNotNull(c2886m84);
            Wb.a(c2886m84, p());
        }
        F5 f5P4 = p();
        if (f5P4 != null) {
            String TAG2 = this.f32841p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            ((G5) f5P4).a(TAG2, "load called");
        }
        C2886m8 c2886m85 = this.f32842q;
        if (c2886m85 != null) {
            c2886m85.a(pubSettings.f32884c);
        }
    }

    public final void x() {
        F5 f5P = p();
        if (f5P != null) {
            String TAG = this.f32841p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f5P).a(TAG, "destroy called");
        }
        C2886m8 c2886m8 = this.f32842q;
        if (c2886m8 != null) {
            c2886m8.E0();
        }
        this.f32842q = null;
        F5 f5P2 = p();
        if (f5P2 != null) {
            ((G5) f5P2).a();
        }
    }

    public final String y() {
        InterfaceC3063x interfaceC3063xK;
        C3089y8 c3089y8;
        C3072x8 c3072x8;
        C2886m8 c2886m8 = this.f32842q;
        if (c2886m8 != null && (interfaceC3063xK = c2886m8.k()) != null) {
            Object dataModel = interfaceC3063xK.getDataModel();
            C3106z8 c3106z8 = dataModel instanceof C3106z8 ? (C3106z8) dataModel : null;
            if (c3106z8 != null && (c3089y8 = c3106z8.f33715p) != null && (c3072x8 = c3089y8.f33603b) != null) {
                return c3072x8.f33570d;
            }
        }
        return null;
    }

    public final String z() {
        InterfaceC3063x interfaceC3063xK;
        C3089y8 c3089y8;
        C3072x8 c3072x8;
        C2886m8 c2886m8 = this.f32842q;
        if (c2886m8 != null && (interfaceC3063xK = c2886m8.k()) != null) {
            Object dataModel = interfaceC3063xK.getDataModel();
            C3106z8 c3106z8 = dataModel instanceof C3106z8 ? (C3106z8) dataModel : null;
            if (c3106z8 != null && (c3089y8 = c3106z8.f33715p) != null && (c3072x8 = c3089y8.f33603b) != null) {
                return c3072x8.f33568b;
            }
        }
        return null;
    }

    @Override // com.inmobi.media.H0
    public void c() {
        s().post(new zk.m0(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C2769f9 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        F5 f5P = this$0.p();
        if (f5P != null) {
            String TAG = this$0.f32841p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f5P).a(TAG, "callback - onVideoSkipped");
        }
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onVideoSkipped();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C2769f9 this$0, AdMetaInfo info) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "$info");
        F5 f5P = this$0.p();
        if (f5P != null) {
            String TAG = this$0.f32841p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f5P).a(TAG, "callback - onAdLoadSucceeded");
        }
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdLoadSucceeded(info);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C2769f9 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        F5 f5P = this$0.p();
        if (f5P != null) {
            String TAG = this$0.f32841p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f5P).a(TAG, "callback - onVideoCompleted");
        }
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onVideoCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2769f9 this$0, AdMetaInfo info) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "$info");
        F5 f5P = this$0.p();
        if (f5P != null) {
            String TAG = this$0.f32841p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f5P).a(TAG, "callback - onAdFetchSuccessful");
        }
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdFetchSuccessful(info);
        }
    }

    public final void a(C2788gb pubSettings, Context context) {
        C2769f9 c2769f9;
        kotlin.jvm.internal.e0.checkNotNullParameter(pubSettings, "pubSettings");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        if (this.f32842q == null) {
            c2769f9 = this;
            a(c2769f9, pubSettings, context, false, null, 8, null);
        } else {
            c2769f9 = this;
        }
        F5 f5P = p();
        if (f5P != null) {
            String TAG = c2769f9.f32841p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f5P).c(TAG, "showOnLockScreen");
        }
        C2886m8 c2886m8 = c2769f9.f32842q;
        if (c2886m8 != null) {
            c2886m8.Q = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2769f9 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        F5 f5P = this$0.p();
        if (f5P != null) {
            String TAG = this$0.f32841p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f5P).a(TAG, "callback - onAdImpressed");
        }
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdImpressed();
        }
    }

    @Override // com.inmobi.media.H0
    public void a(boolean z10) {
        s().post(new com.applovin.impl.k9(this, z10, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2769f9 this$0, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        F5 f5P = this$0.p();
        if (f5P != null) {
            String TAG = this$0.f32841p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f5P).a(TAG, "callback -onAudioStateChanged - " + z10);
        }
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAudioStateChanged(z10);
        }
    }
}
