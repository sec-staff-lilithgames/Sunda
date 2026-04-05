package com.applovin.impl;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    private final Map f16316a;

    /* renamed from: b, reason: collision with root package name */
    private final List f16317b;

    public z(Map map, List list) {
        this.f16316a = map;
        this.f16317b = list;
    }

    public boolean a(Object obj) {
        return obj instanceof z;
    }

    public List b() {
        return this.f16317b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (!zVar.a(this)) {
            return false;
        }
        Map mapA = a();
        Map mapA2 = zVar.a();
        if (mapA != null ? !mapA.equals(mapA2) : mapA2 != null) {
            return false;
        }
        List listB = b();
        List listB2 = zVar.b();
        return listB != null ? listB.equals(listB2) : listB2 == null;
    }

    public int hashCode() {
        Map mapA = a();
        int iHashCode = mapA == null ? 43 : mapA.hashCode();
        List listB = b();
        return ((iHashCode + 59) * 59) + (listB != null ? listB.hashCode() : 43);
    }

    public String toString() {
        return "AppAdsTxt(domainEntries=" + a() + ", invalidEntries=" + b() + ")";
    }

    public Map a() {
        return this.f16316a;
    }
}
