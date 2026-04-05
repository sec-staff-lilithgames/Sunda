package com.applovin.impl.mediation.ads;

import android.content.Context;
import b0.e2;
import com.applovin.impl.c2;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.q2;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.z2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class MaxRewardedAdImpl extends MaxFullscreenAdImpl {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends MaxFullscreenAdImpl.b implements MaxRewardedAdListener {
        private b() {
            super();
        }

        @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b, com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            MaxRewardedAdImpl.this.a((z2) maxAd, maxError);
            super.onAdDisplayFailed(maxAd, maxError);
        }

        @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b, com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            MaxRewardedAdImpl.this.a((z2) maxAd, (MaxError) null);
            super.onAdHidden(maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            o oVar = MaxRewardedAdImpl.this.logger;
            if (o.a()) {
                MaxRewardedAdImpl maxRewardedAdImpl = MaxRewardedAdImpl.this;
                o oVar2 = maxRewardedAdImpl.logger;
                String str = maxRewardedAdImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxRewardedAdListener.onUserRewarded(ad=");
                sb2.append(maxAd);
                sb2.append(", reward=");
                sb2.append(maxReward);
                sb2.append("), listener=");
                e2.z(sb2, MaxRewardedAdImpl.this.adListener, oVar2, str);
            }
            q2.a(MaxRewardedAdImpl.this.adListener, maxAd, maxReward, true);
        }
    }

    public MaxRewardedAdImpl(String str, MaxAdFormat maxAdFormat, MaxFullscreenAdImpl.a aVar, String str2, k kVar, Context context) {
        super(str, maxAdFormat, aVar, str2, kVar, context);
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl
    public MaxFullscreenAdImpl.b createAdListenerWrapper() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(z2 z2Var, MaxError maxError) {
        if (z2Var.n0().get() || !z2Var.p0().compareAndSet(false, true)) {
            return;
        }
        if (o.a()) {
            this.logger.a(this.tag, "User not rewarded for ad: " + z2Var + " with error: " + maxError);
        }
        this.sdk.P().a(c2.f13716i0, z2Var, maxError);
    }
}
