package com.ironsource;

import com.ironsource.U0;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.r3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3421r3<Listener extends U0> extends AbstractC3371o3<Listener> implements AdapterAdRewardListener {

    /* renamed from: r, reason: collision with root package name */
    private C3317l5 f38270r;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.r3$a */
    public class a extends AbstractRunnableC3273ie {
        public a() {
        }

        @Override // com.ironsource.AbstractRunnableC3273ie
        public void a() {
            C3421r3.this.U();
        }
    }

    public C3421r3(InterfaceC3482ud interfaceC3482ud, C3312l0 c3312l0, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, C3134b1 c3134b1, C3352n2 c3352n2, Listener listener) {
        super(interfaceC3482ud, c3312l0, baseAdAdapter, c3134b1, c3352n2, listener);
    }

    @Override // com.ironsource.AbstractC3371o3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        this.f38270r = new C3317l5();
        super.onAdClosed();
    }

    @Override // com.ironsource.AbstractC3438s3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        this.f38270r = null;
        super.onAdOpened();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        if (u().e()) {
            u().a(new a());
        } else {
            U();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        if (this.f38336g == null) {
            IronLog.INTERNAL.verbose(a("placement is null "));
            D0 d02 = this.f38333d;
            if (d02 != null) {
                d02.f33941j.g("mCurrentPlacement is null state = " + this.f38334e);
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose(a("placement name = " + j()));
        if (this.f38333d != null) {
            HashMap map = new HashMap();
            if (com.ironsource.mediationsdk.r.m().r() != null) {
                for (String str : com.ironsource.mediationsdk.r.m().r().keySet()) {
                    map.put(a.b.k("custom_", str), com.ironsource.mediationsdk.r.m().r().get(str));
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f38333d.f33940i.a(j(), this.f38336g.f(), this.f38336g.e(), jCurrentTimeMillis, IronSourceUtils.a(jCurrentTimeMillis, c()), C3317l5.a(this.f38270r), map, com.ironsource.mediationsdk.r.m().l());
        }
        ((U0) this.f38331b).a((C3421r3<?>) this, this.f38336g);
    }
}
