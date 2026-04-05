package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3080y {

    /* renamed from: a, reason: collision with root package name */
    public final AdEvents f33589a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaEvents f33590b;

    public C3080y(AdSession adSession, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adSession, "adSession");
        if (!kotlin.jvm.internal.e0.areEqual(str, "native_video_ad")) {
            this.f33589a = AdEvents.createAdEvents(adSession);
        } else {
            this.f33590b = MediaEvents.createMediaEvents(adSession);
            this.f33589a = AdEvents.createAdEvents(adSession);
        }
    }
}
