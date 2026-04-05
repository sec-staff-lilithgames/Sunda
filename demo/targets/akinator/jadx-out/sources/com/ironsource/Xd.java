package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class Xd extends C3421r3<U0> implements RewardedVideoAdListener {
    public Xd(InterfaceC3482ud interfaceC3482ud, C3312l0 c3312l0, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, C3352n2 c3352n2, U0 u02) {
        super(interfaceC3482ud, c3312l0, baseAdAdapter, new C3134b1(c3312l0.g(), c3312l0.g().getRewardedVideoSettings(), IronSource.a.REWARDED_VIDEO), c3352n2, u02);
    }
}
