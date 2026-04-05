package com.moloco.sdk.internal.services.bidtoken.providers;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f46928a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f46929b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f46930c;

    /* renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.a f46931d;

    public u() {
        this(null, null, null, null, 15, null);
    }

    public final Integer a() {
        return this.f46928a;
    }

    public final Integer b() {
        return this.f46929b;
    }

    public final Boolean c() {
        return this.f46930c;
    }

    public final com.moloco.sdk.internal.services.a d() {
        return this.f46931d;
    }

    public final Integer e() {
        return this.f46928a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return e0.areEqual(this.f46928a, uVar.f46928a) && e0.areEqual(this.f46929b, uVar.f46929b) && e0.areEqual(this.f46930c, uVar.f46930c) && e0.areEqual(this.f46931d, uVar.f46931d);
    }

    public final Integer f() {
        return this.f46929b;
    }

    public final Boolean g() {
        return this.f46930c;
    }

    public final com.moloco.sdk.internal.services.a h() {
        return this.f46931d;
    }

    public int hashCode() {
        Integer num = this.f46928a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f46929b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f46930c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        com.moloco.sdk.internal.services.a aVar = this.f46931d;
        return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkInfoSignal(mobileCountryCode=" + this.f46928a + ", mobileNetworkCode=" + this.f46929b + ", networkRestricted=" + this.f46930c + ", networkType=" + this.f46931d + ')';
    }

    public u(Integer num, Integer num2, Boolean bool, com.moloco.sdk.internal.services.a aVar) {
        this.f46928a = num;
        this.f46929b = num2;
        this.f46930c = bool;
        this.f46931d = aVar;
    }

    public final u a(Integer num, Integer num2, Boolean bool, com.moloco.sdk.internal.services.a aVar) {
        return new u(num, num2, bool, aVar);
    }

    public static /* synthetic */ u a(u uVar, Integer num, Integer num2, Boolean bool, com.moloco.sdk.internal.services.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = uVar.f46928a;
        }
        if ((i10 & 2) != 0) {
            num2 = uVar.f46929b;
        }
        if ((i10 & 4) != 0) {
            bool = uVar.f46930c;
        }
        if ((i10 & 8) != 0) {
            aVar = uVar.f46931d;
        }
        return uVar.a(num, num2, bool, aVar);
    }

    public /* synthetic */ u(Integer num, Integer num2, Boolean bool, com.moloco.sdk.internal.services.a aVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : bool, (i10 & 8) != 0 ? null : aVar);
    }
}
