package com.moloco.sdk.internal.services;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.moloco.sdk.internal.services.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f47165a;

    public q(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f47165a = context;
    }

    @Override // com.moloco.sdk.internal.services.p
    public o a() {
        Object objM7131constructorimpl;
        try {
            int i10 = tu.z.f87419c;
            objM7131constructorimpl = tu.z.m7131constructorimpl(AdvertisingIdClient.getAdvertisingIdInfo(this.f47165a));
        } catch (Throwable th2) {
            int i11 = tu.z.f87419c;
            objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
        }
        o aVar = null;
        if (tu.z.m7136isFailureimpl(objM7131constructorimpl)) {
            objM7131constructorimpl = null;
        }
        AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) objM7131constructorimpl;
        if (info != null) {
            if (info.isLimitAdTrackingEnabled()) {
                aVar = o.b.f47164a;
            } else {
                String id2 = info.getId();
                if (id2 != null) {
                    aVar = new o.a(id2);
                }
            }
            if (aVar != null) {
                return aVar;
            }
        }
        return o.b.f47164a;
    }
}
