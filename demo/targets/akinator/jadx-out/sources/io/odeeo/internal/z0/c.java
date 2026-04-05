package io.odeeo.internal.z0;

import io.odeeo.sdk.domain.PlacementId;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f67790a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static Map<PlacementId, b> f67791b = new LinkedHashMap();

    /* renamed from: build-00XPtyU, reason: not valid java name */
    public final b m4617build00XPtyU(String placementId) {
        e0.checkNotNullParameter(placementId, "placementId");
        if (!f67791b.containsKey(PlacementId.m4630boximpl(placementId))) {
            f67791b.put(PlacementId.m4630boximpl(placementId), new b());
        }
        b bVar = f67791b.get(PlacementId.m4630boximpl(placementId));
        e0.checkNotNull(bVar);
        return bVar;
    }
}
