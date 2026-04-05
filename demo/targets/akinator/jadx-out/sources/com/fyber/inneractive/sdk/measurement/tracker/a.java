package com.fyber.inneractive.sdk.measurement.tracker;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.m;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.CreativeType;
import com.iab.omid.library.fyber.adsession.ImpressionType;
import com.iab.omid.library.fyber.adsession.Owner;
import com.iab.omid.library.fyber.adsession.Partner;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends e {
    public a(Partner partner, m mVar) {
        super(partner, mVar);
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.e
    public final void a(m mVar) {
        super.a(mVar);
        try {
            AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(this.f24029a);
            this.f24030b = adEventsCreateAdEvents;
            adEventsCreateAdEvents.loaded();
        } catch (Throwable unused) {
        }
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.e
    public final AdSessionConfiguration b() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.UNSPECIFIED, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.e
    public final void c() {
        AdEvents adEvents;
        if (this.f24031c || this.f24029a == null || (adEvents = this.f24030b) == null) {
            return;
        }
        this.f24031c = true;
        try {
            adEvents.impressionOccurred();
        } catch (Throwable unused) {
        }
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.e
    public final void a() {
        IAlog.f("%s Unsupported functionality for non video MRAID ads", IAlog.a(this));
    }
}
