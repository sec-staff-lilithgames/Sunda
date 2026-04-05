package com.vungle.ads.internal.presenter;

import com.vungle.ads.internal.util.HandlerScheduler;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class MRAIDPresenter$scheduler$2 extends f0 implements kv.a {
    public static final MRAIDPresenter$scheduler$2 INSTANCE = new MRAIDPresenter$scheduler$2();

    public MRAIDPresenter$scheduler$2() {
        super(0);
    }

    @Override // kv.a
    public final HandlerScheduler invoke() {
        return new HandlerScheduler();
    }
}
