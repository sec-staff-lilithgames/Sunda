package com.fyber.inneractive.sdk.measurement;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.Omid;
import com.iab.omid.library.fyber.adsession.Partner;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f24002a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f24003b;

    public d(e eVar, Context context) {
        this.f24003b = eVar;
        this.f24002a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Omid.activate(this.f24002a);
            this.f24003b.f24008e = Partner.createPartner("Fyber", InneractiveAdManager.getVersion());
            e.a(this.f24003b, this.f24002a);
            IAlog.a("OMID SDK was activated - version %s", Omid.getVersion());
            IAlog.d("OMID SDK was activated - version %s", Omid.getVersion());
        } catch (Throwable th2) {
            IAlog.a("Failed starting omsdk with exception %s", th2.getLocalizedMessage());
            this.f24003b.getClass();
            z.a(th2.getClass().getSimpleName(), "OpenMeasurementMeasurer - " + th2.getMessage(), null, null);
        }
    }
}
