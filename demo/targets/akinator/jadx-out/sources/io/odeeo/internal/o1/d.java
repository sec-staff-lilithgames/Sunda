package io.odeeo.internal.o1;

import io.odeeo.sdk.AdUnitBase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.e0;
import uu.c2;
import uu.q0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f65173a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final Set<AdUnitBase.EventType> f65174b;

    /* renamed from: c, reason: collision with root package name */
    public static final Set<String> f65175c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set<Integer> f65176d;

    static {
        Set<AdUnitBase.EventType> of2 = c2.setOf((Object[]) new AdUnitBase.EventType[]{AdUnitBase.EventType.INTERNAL_AUDIBLE_IMPRESSION, AdUnitBase.EventType.INTERNAL_VOLUME_CHANGE, AdUnitBase.EventType.INTERNAL_CURRENT_VOLUME_LEVEL});
        f65174b = of2;
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(of2, 10));
        Iterator<T> it = of2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AdUnitBase.EventType) it.next()).getValue());
        }
        f65175c = y0.toSet(arrayList);
        f65176d = c2.setOf((Object[]) new Integer[]{Integer.valueOf(io.odeeo.sdk.h.f68097s.getCode()), Integer.valueOf(io.odeeo.sdk.h.f68089k.getCode()), Integer.valueOf(io.odeeo.sdk.h.f68098t.getCode())});
    }

    public final Boolean map(io.odeeo.sdk.h event, boolean z10, boolean z11) {
        e0.checkNotNullParameter(event, "event");
        if (!z11 && f65174b.contains(event.getEventType())) {
            return Boolean.valueOf(z10);
        }
        return null;
    }

    public final Boolean map(String event, boolean z10, boolean z11) {
        e0.checkNotNullParameter(event, "event");
        if (!z11 && f65175c.contains(event)) {
            return Boolean.valueOf(z10);
        }
        return null;
    }

    public final Boolean map(int i10, boolean z10, boolean z11) {
        if (!z11 && f65176d.contains(Integer.valueOf(i10))) {
            return Boolean.valueOf(z10);
        }
        return null;
    }
}
