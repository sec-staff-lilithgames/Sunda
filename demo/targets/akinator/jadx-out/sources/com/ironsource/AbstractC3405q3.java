package com.ironsource;

import com.ironsource.C3421r3;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.logger.IronLog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.q3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC3405q3<Smash extends C3421r3<?>> extends AbstractC3353n3<Smash, AdapterAdRewardListener> implements U0 {
    public AbstractC3405q3(U u10, C3360na c3360na, C3161ca c3161ca) {
        super(u10, c3360na, c3161ca);
    }

    @Override // com.ironsource.U0
    public void a(C3421r3<?> c3421r3, C3325ld c3325ld) {
        IronLog.INTERNAL.verbose(b(c3421r3.k()));
        this.f38100t.b(c3325ld, c3421r3.f());
    }
}
