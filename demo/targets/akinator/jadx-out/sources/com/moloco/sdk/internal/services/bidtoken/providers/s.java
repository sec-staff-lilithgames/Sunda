package com.moloco.sdk.internal.services.bidtoken.providers;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f46923a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f46924b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f46925c;

    public s() {
        this(null, null, null, 7, null);
    }

    public final Boolean a() {
        return this.f46923a;
    }

    public final Long b() {
        return this.f46924b;
    }

    public final Long c() {
        return this.f46925c;
    }

    public final Boolean d() {
        return this.f46923a;
    }

    public final Long e() {
        return this.f46924b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return e0.areEqual(this.f46923a, sVar.f46923a) && e0.areEqual(this.f46924b, sVar.f46924b) && e0.areEqual(this.f46925c, sVar.f46925c);
    }

    public final Long f() {
        return this.f46925c;
    }

    public int hashCode() {
        Boolean bool = this.f46923a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l9 = this.f46924b;
        int iHashCode2 = (iHashCode + (l9 == null ? 0 : l9.hashCode())) * 31;
        Long l10 = this.f46925c;
        return iHashCode2 + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return "MemoryInfoSignal(lowMemory=" + this.f46923a + ", threshold=" + this.f46924b + ", totalMem=" + this.f46925c + ')';
    }

    public s(Boolean bool, Long l9, Long l10) {
        this.f46923a = bool;
        this.f46924b = l9;
        this.f46925c = l10;
    }

    public final s a(Boolean bool, Long l9, Long l10) {
        return new s(bool, l9, l10);
    }

    public static /* synthetic */ s a(s sVar, Boolean bool, Long l9, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = sVar.f46923a;
        }
        if ((i10 & 2) != 0) {
            l9 = sVar.f46924b;
        }
        if ((i10 & 4) != 0) {
            l10 = sVar.f46925c;
        }
        return sVar.a(bool, l9, l10);
    }

    public /* synthetic */ s(Boolean bool, Long l9, Long l10, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : l9, (i10 & 4) != 0 ? null : l10);
    }
}
