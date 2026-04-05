package com.moloco.sdk.internal.services.bidtoken.providers;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f46888a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f46889b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f46890c;

    public h() {
        this(null, null, null, 7, null);
    }

    public final Integer a() {
        return this.f46888a;
    }

    public final Integer b() {
        return this.f46889b;
    }

    public final Boolean c() {
        return this.f46890c;
    }

    public final Integer d() {
        return this.f46889b;
    }

    public final Integer e() {
        return this.f46888a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return e0.areEqual(this.f46888a, hVar.f46888a) && e0.areEqual(this.f46889b, hVar.f46889b) && e0.areEqual(this.f46890c, hVar.f46890c);
    }

    public final Boolean f() {
        return this.f46890c;
    }

    public int hashCode() {
        Integer num = this.f46888a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f46889b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f46890c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "BatteryInfoSignal(maxBatteryLevel=" + this.f46888a + ", batteryStatus=" + this.f46889b + ", isPowerSaveMode=" + this.f46890c + ')';
    }

    public h(Integer num, Integer num2, Boolean bool) {
        this.f46888a = num;
        this.f46889b = num2;
        this.f46890c = bool;
    }

    public final h a(Integer num, Integer num2, Boolean bool) {
        return new h(num, num2, bool);
    }

    public static /* synthetic */ h a(h hVar, Integer num, Integer num2, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = hVar.f46888a;
        }
        if ((i10 & 2) != 0) {
            num2 = hVar.f46889b;
        }
        if ((i10 & 4) != 0) {
            bool = hVar.f46890c;
        }
        return hVar.a(num, num2, bool);
    }

    public /* synthetic */ h(Integer num, Integer num2, Boolean bool, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : bool);
    }
}
