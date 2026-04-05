package io.odeeo.internal.d1;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import io.odeeo.sdk.domain.PlacementId;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f63676a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static final Map<PlacementId, io.odeeo.internal.e1.c> f63677b = new LinkedHashMap();

    public final io.odeeo.internal.e1.c a() {
        io.odeeo.internal.b2.a.d("No placement config found for this placementId - using default config", new Object[0]);
        return new io.odeeo.internal.e1.c(null, null, null, null, 0, null, null, null, 0.0d, null, 0, false, 0, false, 0L, null, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
    }

    /* renamed from: addPlacementConfig-3Jeh2E8, reason: not valid java name */
    public final void m4587addPlacementConfig3Jeh2E8(String placementId, io.odeeo.internal.e1.c placementConfig) {
        e0.checkNotNullParameter(placementId, "placementId");
        e0.checkNotNullParameter(placementConfig, "placementConfig");
        f63677b.put(PlacementId.m4630boximpl(placementId), placementConfig);
    }

    /* renamed from: getPlacementConfig-00XPtyU, reason: not valid java name */
    public final io.odeeo.internal.e1.c m4588getPlacementConfig00XPtyU(String placementId) {
        e0.checkNotNullParameter(placementId, "placementId");
        io.odeeo.internal.e1.c cVar = f63677b.get(PlacementId.m4630boximpl(placementId));
        return cVar == null ? a() : cVar;
    }
}
