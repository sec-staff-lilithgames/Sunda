package com.ironsource;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class J1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f34684a;

    /* JADX WARN: Multi-variable type inference failed */
    public J1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Map<String, String> a() {
        return this.f34684a;
    }

    public final Map<String, String> b() {
        return this.f34684a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J1) && kotlin.jvm.internal.e0.areEqual(this.f34684a, ((J1) obj).f34684a);
    }

    public int hashCode() {
        return this.f34684a.hashCode();
    }

    public String toString() {
        return "ApplicationExternalSettings(mediationTypes=" + this.f34684a + ")";
    }

    public J1(Map<String, String> mediationTypes) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mediationTypes, "mediationTypes");
        this.f34684a = mediationTypes;
    }

    public final J1 a(Map<String, String> mediationTypes) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mediationTypes, "mediationTypes");
        return new J1(mediationTypes);
    }

    public /* synthetic */ J1(Map map, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? uu.p1.emptyMap() : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ J1 a(J1 j12, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = j12.f34684a;
        }
        return j12.a(map);
    }
}
