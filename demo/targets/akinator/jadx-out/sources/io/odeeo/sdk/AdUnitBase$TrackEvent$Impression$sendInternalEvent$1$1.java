package io.odeeo.sdk;

import io.odeeo.sdk.AdUnitBase;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class AdUnitBase$TrackEvent$Impression$sendInternalEvent$1$1 extends f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdUnitBase.TrackEvent.Impression f67964a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f67965b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdUnitBase f67966c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdUnitBase$TrackEvent$Impression$sendInternalEvent$1$1(AdUnitBase.TrackEvent.Impression impression, String str, AdUnitBase adUnitBase) {
        super(1);
        this.f67964a = impression;
        this.f67965b = str;
        this.f67966c = adUnitBase;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((io.odeeo.internal.o1.c) obj);
        return x0.f87415a;
    }

    public final void invoke(io.odeeo.internal.o1.c sendInternalEvent) {
        e0.checkNotNullParameter(sendInternalEvent, "$this$sendInternalEvent");
        sendInternalEvent.setEventId(this.f67964a.getValue());
        sendInternalEvent.setAdUnitSize(this.f67965b);
        sendInternalEvent.setDeviceVolume(Float.valueOf(this.f67966c.f67920b.getDeviceVolumePercent()));
        sendInternalEvent.setPayload(this.f67966c.f67919a.getAdInfo().getTrackingEventPayload$odeeoSdk_release());
    }
}
