package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class C9 extends AbstractC3371o3<I0> implements InterstitialAdListener {
    public C9(InterfaceC3482ud interfaceC3482ud, C3312l0 c3312l0, BaseAdAdapter<?, AdapterAdInteractionListener> baseAdAdapter, C3352n2 c3352n2, I0 i02) {
        super(interfaceC3482ud, c3312l0, baseAdAdapter, new C3134b1(c3312l0.g(), c3312l0.g().getInterstitialSettings(), IronSource.a.f37252c), c3352n2, i02);
    }
}
