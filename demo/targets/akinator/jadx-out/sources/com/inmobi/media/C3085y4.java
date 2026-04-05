package com.inmobi.media;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.y4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3085y4 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f33597a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33598b;

    public C3085y4(ArrayList eventIDs, String payload) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eventIDs, "eventIDs");
        kotlin.jvm.internal.e0.checkNotNullParameter(payload, "payload");
        this.f33597a = eventIDs;
        this.f33598b = payload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3085y4)) {
            return false;
        }
        C3085y4 c3085y4 = (C3085y4) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f33597a, c3085y4.f33597a) && kotlin.jvm.internal.e0.areEqual(this.f33598b, c3085y4.f33598b);
    }

    public final int hashCode() {
        return p0.o2.e(this.f33597a.hashCode() * 31, 31, this.f33598b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventPayload(eventIDs=");
        sb2.append(this.f33597a);
        sb2.append(", payload=");
        return j1.o2.o(sb2, this.f33598b, ", shouldFlushOnFailure=false)");
    }
}
