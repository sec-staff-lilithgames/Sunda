package com.inmobi.media;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiAudio;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class G1 extends Ve {

    /* renamed from: o, reason: collision with root package name */
    public B1 f31807o;

    /* renamed from: p, reason: collision with root package name */
    public B1 f31808p;

    /* renamed from: q, reason: collision with root package name */
    public B1 f31809q;

    /* renamed from: r, reason: collision with root package name */
    public B1 f31810r;

    public G1(InMobiAudio.a callbacks) {
        kotlin.jvm.internal.e0.checkNotNullParameter(callbacks, "callbacks");
        b(callbacks);
    }

    @Override // com.inmobi.media.Ve
    public final void a(byte[] bArr, PublisherCallbacks callbacks) {
        kotlin.jvm.internal.e0.checkNotNullParameter(callbacks, "callbacks");
    }

    @Override // com.inmobi.media.Ve, com.inmobi.media.H0
    public final void b(AdMetaInfo info) {
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        F5 f5P = p();
        if (f5P != null) {
            String str = H1.f31832a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((G5) f5P).c(str, "onAdFetchSuccess " + this);
        }
        B1 b12 = this.f31810r;
        if ((b12 != null ? b12.m() : null) == null) {
            F5 f5P2 = p();
            if (f5P2 != null) {
                String str2 = H1.f31832a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((G5) f5P2).b(str2, "adObject is null, fetch failed");
            }
            a((U0) null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            return;
        }
        F5 f5P3 = p();
        if (f5P3 != null) {
            String str3 = H1.f31832a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((G5) f5P3).a(str3, "Ad fetch successful, calling loadIntoView()");
        }
        super.b(info);
        s().post(new zk.m(this, info, 0));
    }

    @Override // com.inmobi.media.Ve, com.inmobi.media.H0
    public final void c(AdMetaInfo info) {
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        F5 f5P = p();
        if (f5P != null) {
            String str = H1.f31832a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((G5) f5P).c(str, "onAdLoadSucceeded " + this);
        }
        super.c(info);
        a((byte) 0);
        F5 f5P2 = p();
        if (f5P2 != null) {
            String str2 = H1.f31832a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f5P2).d(str2, "AdManager state - CREATED");
        }
        F5 f5P3 = p();
        if (f5P3 != null) {
            String str3 = H1.f31832a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((G5) f5P3).a(str3, "Ad load successful, providing callback");
        }
        s().post(new zk.m(this, info, 1));
    }

    @Override // com.inmobi.media.H0
    public final void d() {
        F5 f5P = p();
        if (f5P != null) {
            String str = H1.f31832a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((G5) f5P).a(str, "onAdShowFailed " + this);
        }
        s().post(new zg.h(this, 4));
    }

    @Override // com.inmobi.media.Ve
    public final U0 j() {
        F5 f5P = p();
        if (f5P != null) {
            String str = H1.f31832a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((G5) f5P).c(str, "shouldUseForegroundUnit " + this);
        }
        B1 b12 = this.f31809q;
        Byte bValueOf = b12 != null ? Byte.valueOf(b12.R()) : null;
        F5 f5P2 = p();
        if (f5P2 != null) {
            String str2 = H1.f31832a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f5P2).d(str2, "State - " + bValueOf);
        }
        return ((bValueOf == null || bValueOf.byteValue() != 4) && (bValueOf == null || bValueOf.byteValue() != 7) && (bValueOf == null || bValueOf.byteValue() != 6)) ? this.f31810r : this.f31809q;
    }

    @Override // com.inmobi.media.Ve
    public final void w() {
        F5 f5P = p();
        if (f5P != null) {
            String str = H1.f31832a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((G5) f5P).a(str, "submitAdLoadCalled " + this);
        }
        B1 b12 = this.f31810r;
        if (b12 != null) {
            b12.u0();
        }
    }

    public final void x() {
        F5 f5P = p();
        if (f5P != null) {
            String str = H1.f31832a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((G5) f5P).c(str, "registerLifeCycleCallbacks " + this);
        }
        B1 b12 = this.f31807o;
        if (b12 != null) {
            b12.I0();
        }
        B1 b13 = this.f31808p;
        if (b13 != null) {
            b13.I0();
        }
    }

    public final void y() {
        F5 f5P = p();
        if (f5P != null) {
            String str = H1.f31832a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((G5) f5P).a(str, "loadIntoView " + this);
        }
        B1 b12 = this.f31810r;
        if (b12 == null) {
            throw new IllegalStateException(Ve.f32404m);
        }
        if (a("InMobi", b12.J().toString())) {
            a((byte) 8);
            F5 f5P2 = p();
            if (f5P2 != null) {
                String str2 = H1.f31832a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((G5) f5P2).d(str2, "AdManager state - LOADING_INTO_VIEW");
            }
            b12.k0();
        }
    }

    public static final void a(G1 this$0, AdMetaInfo info) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "$info");
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdFetchSuccessful(info);
        }
    }

    @Override // com.inmobi.media.Ve, com.inmobi.media.H0
    public final void a(U0 u02, InMobiAdRequestStatus status) {
        kotlin.jvm.internal.e0.checkNotNullParameter(status, "status");
        F5 f5P = p();
        if (f5P != null) {
            String str = H1.f31832a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((G5) f5P).b(str, com.ironsource.Mf.f34994b);
        }
        F5 f5P2 = p();
        if (f5P2 != null) {
            ((G5) f5P2).a();
        }
    }

    public static final void a(G1 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        F5 f5P = this$0.p();
        if (f5P != null) {
            String str = H1.f31832a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((G5) f5P).a(str, "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdDisplayFailed();
        }
        F5 f5P2 = this$0.p();
        if (f5P2 != null) {
            ((G5) f5P2).a();
        }
    }

    @Override // com.inmobi.media.Ve, com.inmobi.media.H0
    public final void a(AdMetaInfo info) {
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        F5 f5P = p();
        if (f5P != null) {
            String str = H1.f31832a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((G5) f5P).a(str, "onAdDisplayed");
        }
        super.a(info);
        U0 u0J = j();
        if (u0J != null) {
            u0J.y0();
        }
    }

    public static final void b(G1 this$0, AdMetaInfo info) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "$info");
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdLoadSucceeded(info);
        }
    }

    @Override // com.inmobi.media.Ve, com.inmobi.media.H0
    public final void b() {
        F5 f5P = p();
        if (f5P != null) {
            String str = H1.f31832a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((G5) f5P).a(str, "onAdDismissed " + this);
        }
        a((byte) 0);
        F5 f5P2 = p();
        if (f5P2 != null) {
            String str2 = H1.f31832a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f5P2).d(str2, "AdManager state - CREATED");
        }
        F5 f5P3 = p();
        if (f5P3 != null) {
            ((G5) f5P3).a();
        }
        super.b();
    }

    public final void a(InMobiAudio audio) {
        kotlin.jvm.internal.e0.checkNotNullParameter(audio, "audio");
        F5 f5P = p();
        if (f5P != null) {
            String str = H1.f31832a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((G5) f5P).a(str, "show called");
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                a((RelativeLayout) audio);
            } else {
                s().post(new zk.n(0, this, audio));
            }
        } catch (Exception e10) {
            B1 b12 = this.f31810r;
            if (b12 != null) {
                b12.d((short) 26);
            }
            String str2 = H1.f31832a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            AbstractC2902n7.a((byte) 1, str2, "Unable to show ad; SDK encountered an unexpected error");
            F5 f5P2 = p();
            if (f5P2 != null) {
                ((G5) f5P2).b(str2, Qf.a(e10, N6.a(str2, "access$getTAG$p(...)", "Show failed with unexpected error: ")));
            }
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public final void b(String adSize) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adSize, "adSize");
        F5 f5P = p();
        if (f5P != null) {
            String str = H1.f31832a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((G5) f5P).a(str, "load 1 " + this);
        }
        B1 b12 = this.f31810r;
        if (b12 != null && a("InMobi", b12.J().toString(), l()) && b12.e((byte) 1)) {
            a((byte) 1);
            F5 f5P2 = p();
            if (f5P2 != null) {
                String str2 = H1.f31832a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((G5) f5P2).d(str2, "AdManager state - LOADING");
            }
            d(null);
            b12.e(adSize);
            b12.e(false);
        }
    }

    public static final void a(G1 this$0, RelativeLayout audio) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(audio, "$audio");
        this$0.a(audio);
    }

    public final void a(RelativeLayout relativeLayout) {
        InterfaceC3063x interfaceC3063xK;
        C2675a0 c2675a0J;
        F5 f5P = p();
        if (f5P != null) {
            String str = H1.f31832a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((G5) f5P).a(str, "showAudioAd");
        }
        B1 b12 = this.f31809q;
        if (b12 != null ? b12.F0() : false) {
            String str2 = H1.f31832a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            AbstractC2902n7.a((byte) 1, str2, "An ad is currently being viewed by the user. Please wait for the user to close the ad before showing another ad.");
            F5 f5P2 = p();
            if (f5P2 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((G5) f5P2).b(str2, "ad is active");
            }
            B1 b13 = this.f31810r;
            if (b13 != null) {
                b13.d((short) 15);
                return;
            }
            return;
        }
        B1 b14 = this.f31810r;
        if (b14 != null) {
            F5 f52 = b14.f32321j;
            if (f52 != null) {
                String strE = U0.e();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "<get-TAG>(...)");
                ((G5) f52).c(strE, "canProceedToShow");
            }
            if (b14.X()) {
                String strE2 = U0.e();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE2, "<get-TAG>(...)");
                AbstractC2902n7.a((byte) 1, strE2, "Ad Show has failed because current ad is expired. Please call load() again.");
                F5 f53 = b14.f32321j;
                if (f53 != null) {
                    String strE3 = U0.e();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE3, "<get-TAG>(...)");
                    ((G5) f53).b(strE3, "ad is expired");
                }
                F5 f54 = b14.f32321j;
                if (f54 != null) {
                    String strE4 = U0.e();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE4, "<get-TAG>(...)");
                    ((G5) f54).d(strE4, "AdUnit " + b14 + " state - CREATED");
                }
                b14.d((byte) 0);
                b14.d((short) 2153);
                return;
            }
            byte bR = b14.R();
            if (bR == 1 || bR == 2) {
                AbstractC2902n7.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
                F5 f55 = b14.f32321j;
                if (f55 != null) {
                    String strE5 = U0.e();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE5, "<get-TAG>(...)");
                    ((G5) f55).b(strE5, "ad is not ready");
                }
                F5 f56 = b14.f32321j;
                if (f56 != null) {
                    String strE6 = U0.e();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE6, "<get-TAG>(...)");
                    ((G5) f56).a(strE6, "callback - onShowFailure");
                }
                b14.d((short) 2152);
                return;
            }
            if (bR == 3) {
                AbstractC2902n7.a((byte) 1, "InMobi", "Ad Load has Failed. Please call load() again.");
                b14.d((short) 0);
                F5 f57 = b14.f32321j;
                if (f57 != null) {
                    String strE7 = U0.e();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE7, "<get-TAG>(...)");
                    ((G5) f57).a(strE7, "callback - onShowFailure");
                }
                F5 f58 = b14.f32321j;
                if (f58 != null) {
                    String strE8 = U0.e();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE8, "<get-TAG>(...)");
                    ((G5) f58).b(strE8, "ad is failed");
                    return;
                }
                return;
            }
            if (bR == 8) {
                AbstractC2902n7.a((byte) 1, "InMobi", "Ad Load has Failed. Please call load() again.");
                b14.d((short) 0);
                F5 f59 = b14.f32321j;
                if (f59 != null) {
                    String strE9 = U0.e();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE9, "<get-TAG>(...)");
                    ((G5) f59).a(strE9, "callback - onShowFailure");
                }
                F5 f510 = b14.f32321j;
                if (f510 != null) {
                    String strE10 = U0.e();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE10, "<get-TAG>(...)");
                    ((G5) f510).b(strE10, "ad is unloaded");
                    return;
                }
                return;
            }
            if (bR == 0) {
                AbstractC2902n7.a((byte) 1, "InMobi", "Ad Show has Failed. Please call load() before calling show().");
                b14.d((short) 0);
                F5 f511 = b14.f32321j;
                if (f511 != null) {
                    String strE11 = U0.e();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE11, "<get-TAG>(...)");
                    ((G5) f511).a(strE11, "callback - onShowFailure");
                }
                F5 f512 = b14.f32321j;
                if (f512 != null) {
                    String strE12 = U0.e();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE12, "<get-TAG>(...)");
                    ((G5) f512).b(strE12, "show called before load");
                    return;
                }
                return;
            }
            F5 f5P3 = p();
            if (f5P3 != null) {
                String str3 = H1.f31832a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((G5) f5P3).a(str3, "swapAdUnits " + this);
            }
            B1 b15 = this.f31809q;
            if (kotlin.jvm.internal.e0.areEqual(b15, this.f31807o)) {
                this.f31809q = this.f31808p;
                this.f31810r = this.f31807o;
            } else if (kotlin.jvm.internal.e0.areEqual(b15, this.f31808p) || b15 == null) {
                this.f31809q = this.f31807o;
                this.f31810r = this.f31808p;
            }
            F5 f5P4 = p();
            if (f5P4 != null) {
                String str4 = H1.f31832a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((G5) f5P4).a(str4, "displayAd " + this);
            }
            B1 b16 = this.f31809q;
            if (b16 == null || (interfaceC3063xK = b16.k()) == null) {
                return;
            }
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = (GestureDetectorOnGestureListenerC3093yc) interfaceC3063xK;
            AbstractC3062wf viewableAd = gestureDetectorOnGestureListenerC3093yc.getViewableAd();
            B1 b17 = this.f31809q;
            if (b17 != null && (c2675a0J = b17.J()) != null && c2675a0J.p()) {
                gestureDetectorOnGestureListenerC3093yc.e();
            }
            ViewParent parent = gestureDetectorOnGestureListenerC3093yc.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            View viewD = viewableAd.d();
            viewableAd.a((Map) null);
            B1 b18 = this.f31810r;
            if (b18 != null) {
                b18.G0();
            }
            if (viewGroup == null) {
                relativeLayout.addView(viewD, layoutParams);
            } else {
                viewGroup.removeAllViews();
                viewGroup.addView(viewD, layoutParams);
            }
            B1 b19 = this.f31810r;
            if (b19 != null) {
                b19.g();
            }
        }
    }

    @Override // com.inmobi.media.Ve
    public final void a(short s10) {
        F5 f5P = p();
        if (f5P != null) {
            String str = H1.f31832a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((G5) f5P).b(str, "submitAdLoadDroppedAtSDK " + this);
        }
        B1 b12 = this.f31810r;
        if (b12 != null) {
            b12.a(s10);
        }
    }
}
