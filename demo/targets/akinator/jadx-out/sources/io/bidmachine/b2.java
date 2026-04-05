package io.bidmachine;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b2 implements up.e {

    /* renamed from: a, reason: collision with root package name */
    public final up.d f60319a;

    public b2(up.d dVar) {
        this.f60319a = dVar;
    }

    @Override // up.e
    public String getHttpAgent(Context context) {
        if (((f4) this.f60319a).canSendDeviceInfo()) {
            return UserAgentManager.getUserAgent(context);
        }
        return null;
    }

    @Override // up.e
    public String getIfa(Context context) {
        return d0.a(context, !((f4) this.f60319a).canSendIfa());
    }

    @Override // up.e
    public boolean isLimitAdTrackingEnabled() {
        AdvertisingDataManager$AdvertisingData advertisingDataManager$AdvertisingData = d0.f60333d;
        return advertisingDataManager$AdvertisingData != null && advertisingDataManager$AdvertisingData.isLimitAdTrackingEnabled();
    }
}
