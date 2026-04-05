package io.odeeo.sdk;

import io.odeeo.sdk.AdUnitBase;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class AdUnitBase$EventType$INTERNAL_REWARD_GRANTED$sendCustomEvent$1$1 extends f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdUnitBase.EventType.INTERNAL_REWARD_GRANTED f67953a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f67954b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdUnitBase f67955c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdUnitBase$EventType$INTERNAL_REWARD_GRANTED$sendCustomEvent$1$1(AdUnitBase.EventType.INTERNAL_REWARD_GRANTED internal_reward_granted, int i10, AdUnitBase adUnitBase) {
        super(1);
        this.f67953a = internal_reward_granted;
        this.f67954b = i10;
        this.f67955c = adUnitBase;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((io.odeeo.internal.o1.c) obj);
        return x0.f87415a;
    }

    public final void invoke(io.odeeo.internal.o1.c sendInternalEvent) {
        e0.checkNotNullParameter(sendInternalEvent, "$this$sendInternalEvent");
        sendInternalEvent.setEventId(this.f67953a.getValue());
        sendInternalEvent.setEventCode(Integer.valueOf(this.f67954b));
        sendInternalEvent.setDeviceVolume(Float.valueOf(this.f67955c.f67920b.getDeviceVolumePercent()));
        sendInternalEvent.setCallbackUrl(this.f67955c.f67919a.getAdInfo().getRewardGrantedCallbackUrl());
        sendInternalEvent.setRewardAmount(Float.valueOf(this.f67955c.f67921c.getRewardedData$odeeoSdk_release().getAmount()));
        sendInternalEvent.setRewardType(this.f67955c.f67921c.getRewardedData$odeeoSdk_release().getType().getValue());
        sendInternalEvent.setTimeToReward(Integer.valueOf(this.f67955c.f67919a.getTimeToRewardInSeconds(this.f67955c.d())));
        sendInternalEvent.setPayload(this.f67955c.f67919a.getAdInfo().getTrackingEventPayload$odeeoSdk_release());
        sendInternalEvent.setAudibilityEnforced(io.odeeo.internal.o1.d.f65173a.map(this.f67954b, this.f67955c.f67920b.isAudibilityCurrentlyEnforced$odeeoSdk_release(), this.f67955c.f67936r));
    }
}
