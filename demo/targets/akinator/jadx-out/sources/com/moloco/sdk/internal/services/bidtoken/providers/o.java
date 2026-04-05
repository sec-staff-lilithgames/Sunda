package com.moloco.sdk.internal.services.bidtoken.providers;

import kotlin.jvm.internal.e0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.h f46907a;

    /* renamed from: b, reason: collision with root package name */
    public final String f46908b;

    /* renamed from: c, reason: collision with root package name */
    public final String f46909c;

    public o() {
        this(null, null, null, 7, null);
    }

    public final com.moloco.sdk.internal.services.h a() {
        return this.f46907a;
    }

    public final String b() {
        return this.f46908b;
    }

    public final String c() {
        return this.f46909c;
    }

    public final String d() {
        return this.f46909c;
    }

    public final String e() {
        return this.f46908b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f46907a == oVar.f46907a && e0.areEqual(this.f46908b, oVar.f46908b) && e0.areEqual(this.f46909c, oVar.f46909c);
    }

    public final com.moloco.sdk.internal.services.h f() {
        return this.f46907a;
    }

    public int hashCode() {
        com.moloco.sdk.internal.services.h hVar = this.f46907a;
        int iHashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
        String str = this.f46908b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f46909c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceSignalInfo(orientation=");
        sb2.append(this.f46907a);
        sb2.append(", locale=");
        sb2.append(this.f46908b);
        sb2.append(", keyboardLocale=");
        return o2.q(sb2, this.f46909c, ')');
    }

    public o(com.moloco.sdk.internal.services.h hVar, String str, String str2) {
        this.f46907a = hVar;
        this.f46908b = str;
        this.f46909c = str2;
    }

    public final o a(com.moloco.sdk.internal.services.h hVar, String str, String str2) {
        return new o(hVar, str, str2);
    }

    public static /* synthetic */ o a(o oVar, com.moloco.sdk.internal.services.h hVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVar = oVar.f46907a;
        }
        if ((i10 & 2) != 0) {
            str = oVar.f46908b;
        }
        if ((i10 & 4) != 0) {
            str2 = oVar.f46909c;
        }
        return oVar.a(hVar, str, str2);
    }

    public /* synthetic */ o(com.moloco.sdk.internal.services.h hVar, String str, String str2, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : hVar, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
    }
}
