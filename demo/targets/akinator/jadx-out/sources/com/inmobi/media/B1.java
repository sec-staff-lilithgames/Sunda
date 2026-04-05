package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.C3191e4;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class B1 extends O1 {
    public final D1 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1(Context context, C2675a0 placement, H0 h02) {
        super(context, placement, h02);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(placement, "placement");
        this.U = new D1();
    }

    @Override // com.inmobi.media.O1
    public final boolean E0() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            String strE = U0.e();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "<get-TAG>(...)");
            ((G5) f52).c(strE, "canProceedToLoad");
        }
        if (g0()) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                String strE2 = U0.e();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE2, "<get-TAG>(...)");
                ((G5) f53).b(strE2, "Some of the dependency libraries for Banner not found");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return false;
        }
        if (1 == R() || 2 == R()) {
            String strE3 = U0.e();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE3, "<get-TAG>(...)");
            AbstractC2902n7.a((byte) 1, strE3, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            F5 f54 = this.f32321j;
            if (f54 != null) {
                String strE4 = U0.e();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE4, "<get-TAG>(...)");
                ((G5) f54).b(strE4, "ad load in progress. ignore load");
            }
            a((short) 53);
            return false;
        }
        if (7 == R()) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 15);
            AbstractC2902n7.a((byte) 1, "InMobi", Ve.f32401j + J().l());
            F5 f55 = this.f32321j;
            if (f55 != null) {
                String strE5 = U0.e();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE5, "<get-TAG>(...)");
                ((G5) f55).b(strE5, "Ad is active. ignore load");
            }
            return false;
        }
        if (R() == 4) {
            if (!X()) {
                F5 f56 = this.f32321j;
                if (f56 != null) {
                    String strE6 = U0.e();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE6, "<get-TAG>(...)");
                    ((G5) f56).c(strE6, "signalCanShowForStateReady");
                }
                F5 f57 = this.f32321j;
                if (f57 != null) {
                    String strE7 = U0.e();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE7, "<get-TAG>(...)");
                    ((G5) f57).a(strE7, "An ad is ready with the ad unit. Signaling ad load success ...");
                }
                H0 h0R = r();
                if (h0R == null) {
                    AbstractC2902n7.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                    F5 f58 = this.f32321j;
                    if (f58 != null) {
                        String strE8 = U0.e();
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE8, "<get-TAG>(...)");
                        ((G5) f58).b(strE8, "listener is null. load show callback missed");
                    }
                } else {
                    F5 f59 = this.f32321j;
                    if (f59 != null) {
                        String strE9 = U0.e();
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE9, "<get-TAG>(...)");
                        ((G5) f59).a(strE9, "callback - onLoadSuccess");
                    }
                    f(h0R);
                }
                return false;
            }
            F5 f510 = this.f32321j;
            if (f510 != null) {
                String strE10 = U0.e();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE10, "<get-TAG>(...)");
                ((G5) f510).b(strE10, "ad is expired, clearing");
            }
            g();
        }
        f0();
        return true;
    }

    @Override // com.inmobi.media.O1, com.inmobi.media.Ac
    public final void a(F1 audioStatusInternal) {
        kotlin.jvm.internal.e0.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        H0 h0R = r();
        if (h0R != null) {
            h0R.a(audioStatusInternal);
        }
        D1 d12 = this.U;
        d12.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        if (!d12.f31729a && audioStatusInternal == F1.f31764e) {
            d12.f31729a = true;
            C3069x5 c3069x5 = C3069x5.f33562c;
            c3069x5.f32338a = System.currentTimeMillis();
            c3069x5.f32339b++;
        }
    }

    public final void d(short s10) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            String strE = U0.e();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "<get-TAG>(...)");
            ((G5) f52).c(strE, "onShowFailure");
        }
        H0 h0R = r();
        if (h0R == null) {
            AbstractC2902n7.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
            F5 f53 = this.f32321j;
            if (f53 != null) {
                String strE2 = U0.e();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE2, "<get-TAG>(...)");
                ((G5) f53).b(strE2, "listener is null. show fail callback missed. ");
            }
        } else {
            F5 f54 = this.f32321j;
            if (f54 != null) {
                String strE3 = U0.e();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE3, "<get-TAG>(...)");
                ((G5) f54).b(strE3, "callback - onAdShowFailed");
            }
            h0R.d();
        }
        if (s10 != 0) {
            F5 f55 = this.f32321j;
            if (f55 != null) {
                String strE4 = U0.e();
                ((G5) f55).b(strE4, AbstractC2803h9.a(strE4, "<get-TAG>(...)", "show failed - ", s10));
            }
            c(s10);
        }
    }

    @Override // com.inmobi.media.O1, com.inmobi.media.U0, com.inmobi.media.Ac
    public final void j(GestureDetectorOnGestureListenerC3093yc renderView) {
        H0 h0R;
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            String strE = U0.e();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "<get-TAG>(...)");
            ((G5) f52).c(strE, "onRenderViewVisible");
        }
        if (R() == 4 && (h0R = r()) != null) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                String strE2 = U0.e();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE2, "<get-TAG>(...)");
                ((G5) f53).a(strE2, "callback - onAdDisplayed");
            }
            d(h0R);
        }
        super.j(renderView);
    }

    @Override // com.inmobi.media.O1, com.inmobi.media.U0
    public final String q() {
        return "audio";
    }

    @Override // com.inmobi.media.O1, com.inmobi.media.Ac
    public final void a(boolean z10) {
        Context contextD = C2925od.d();
        if (contextD == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = I6.f31865b;
        I6 i6A = H6.a(contextD, "audio_pref_file");
        kotlin.jvm.internal.e0.checkNotNullParameter("user_mute_count", C3191e4.h.W);
        int i10 = i6A.f31866a.getInt("user_mute_count", 0);
        I6.a(i6A, "user_mute_count", z10 ? Math.max(0, i10 - 1) : i10 + 1, false, 4, (Object) null);
    }
}
