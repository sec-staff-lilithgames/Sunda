package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.ClientInfoOuterClass;
import kotlin.jvm.internal.f0;
import kv.a;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidMediationRepository$mediationProvider$1 extends f0 implements a {
    final /* synthetic */ AndroidMediationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidMediationRepository$mediationProvider$1(AndroidMediationRepository androidMediationRepository) {
        super(0);
        this.this$0 = androidMediationRepository;
    }

    @Override // kv.a
    public final ClientInfoOuterClass.MediationProvider invoke() {
        String name = this.this$0.getName();
        if (name != null) {
            ClientInfoOuterClass.MediationProvider mediationProvider = k0.startsWith$default(name, "AppLovinSdk_", false, 2, null) ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX : k0.equals(name, "AdMob", true) ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_ADMOB : k0.equals(name, "MAX", true) ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX : k0.equals(name, "ironSource", true) ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_LEVELPLAY : ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM;
            if (mediationProvider != null) {
                return mediationProvider;
            }
        }
        return ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_UNSPECIFIED;
    }
}
