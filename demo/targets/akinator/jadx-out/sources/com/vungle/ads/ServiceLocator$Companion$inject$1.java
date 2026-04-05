package com.vungle.ads;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ServiceLocator$Companion$inject$1 extends f0 implements kv.a {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceLocator$Companion$inject$1(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    @Override // kv.a
    public final T invoke() {
        ServiceLocator companion = ServiceLocator.Companion.getInstance(this.$context);
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return companion.getService(Object.class);
    }
}
