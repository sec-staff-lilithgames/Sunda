package com.vungle.ads.internal;

import com.vungle.ads.SdkNotInitialized;
import kotlin.jvm.internal.f0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class VungleInitializer$init$1$1 extends f0 implements kv.a {
    final /* synthetic */ VungleInitializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VungleInitializer$init$1$1(VungleInitializer vungleInitializer) {
        super(0);
        this.this$0 = vungleInitializer;
    }

    @Override // kv.a
    public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
        m3596invoke();
        return x0.f87415a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m3596invoke() throws Throwable {
        this.this$0.onInitError(new SdkNotInitialized("Network permissions not granted").logError$vungle_ads_release());
    }
}
