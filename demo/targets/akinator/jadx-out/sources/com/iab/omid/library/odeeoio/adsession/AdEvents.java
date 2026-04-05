package com.iab.omid.library.odeeoio.adsession;

import com.iab.omid.library.odeeoio.adsession.media.VastProperties;
import com.iab.omid.library.odeeoio.d.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class AdEvents {
    private final a adSession;

    private AdEvents(a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession) {
        a aVar = (a) adSession;
        e.a(adSession, "AdSession is null");
        e.d(aVar);
        e.b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        e.b(this.adSession);
        e.f(this.adSession);
        if (!this.adSession.f()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.f()) {
            this.adSession.c();
        }
    }

    public void loaded() {
        e.c(this.adSession);
        e.f(this.adSession);
        this.adSession.d();
    }

    public void loaded(VastProperties vastProperties) {
        e.a(vastProperties, "VastProperties is null");
        e.c(this.adSession);
        e.f(this.adSession);
        this.adSession.a(vastProperties.a());
    }
}
