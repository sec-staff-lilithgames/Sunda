package com.inmobi.media;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.f2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2762f2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f32830a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32831b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f32832c;

    public C2762f2(int i10, int i11, String str) {
        str = (i11 & 2) != 0 ? null : str;
        this.f32830a = i10;
        this.f32831b = str;
        this.f32832c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2762f2)) {
            return false;
        }
        C2762f2 c2762f2 = (C2762f2) obj;
        return this.f32830a == c2762f2.f32830a && kotlin.jvm.internal.e0.areEqual(this.f32831b, c2762f2.f32831b) && kotlin.jvm.internal.e0.areEqual(this.f32832c, c2762f2.f32832c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f32830a) * 31;
        String str = this.f32831b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.f32832c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BusEvent(eventId=");
        sb2.append(this.f32830a);
        sb2.append(", eventMessage=");
        sb2.append(this.f32831b);
        sb2.append(", eventData=");
        return j1.o2.q(sb2, this.f32832c, ')');
    }

    public C2762f2(int i10, String str, Map map) {
        this.f32830a = i10;
        this.f32831b = str;
        this.f32832c = map;
    }
}
