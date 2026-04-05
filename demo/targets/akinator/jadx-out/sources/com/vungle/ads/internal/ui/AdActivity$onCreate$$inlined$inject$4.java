package com.vungle.ads.internal.ui;

import android.content.Context;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.omsdk.OMTracker;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AdActivity$onCreate$$inlined$inject$4 extends f0 implements kv.a {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdActivity$onCreate$$inlined$inject$4(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.omsdk.OMTracker$Factory, java.lang.Object] */
    @Override // kv.a
    public final OMTracker.Factory invoke() {
        return ServiceLocator.Companion.getInstance(this.$context).getService(OMTracker.Factory.class);
    }
}
