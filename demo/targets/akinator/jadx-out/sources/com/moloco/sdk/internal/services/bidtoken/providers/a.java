package com.moloco.sdk.internal.services.bidtoken.providers;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f46873a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f46874b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f46875c;

    /* renamed from: d, reason: collision with root package name */
    public final Float f46876d;

    public a() {
        this(null, null, null, null, 15, null);
    }

    public final Boolean a() {
        return this.f46873a;
    }

    public final Boolean b() {
        return this.f46874b;
    }

    public final Boolean c() {
        return this.f46875c;
    }

    public final Float d() {
        return this.f46876d;
    }

    public final Boolean e() {
        return this.f46873a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return e0.areEqual(this.f46873a, aVar.f46873a) && e0.areEqual(this.f46874b, aVar.f46874b) && e0.areEqual(this.f46875c, aVar.f46875c) && e0.areEqual((Object) this.f46876d, (Object) aVar.f46876d);
    }

    public final Boolean f() {
        return this.f46874b;
    }

    public final Float g() {
        return this.f46876d;
    }

    public final Boolean h() {
        return this.f46875c;
    }

    public int hashCode() {
        Boolean bool = this.f46873a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f46874b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f46875c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Float f10 = this.f46876d;
        return iHashCode3 + (f10 != null ? f10.hashCode() : 0);
    }

    public String toString() {
        return "AccessibilitySignal(accessibilityCaptioningEnabled=" + this.f46873a + ", accessibilityLargePointerIcon=" + this.f46874b + ", reduceBrightColorsActivated=" + this.f46875c + ", fontScale=" + this.f46876d + ')';
    }

    public a(Boolean bool, Boolean bool2, Boolean bool3, Float f10) {
        this.f46873a = bool;
        this.f46874b = bool2;
        this.f46875c = bool3;
        this.f46876d = f10;
    }

    public final a a(Boolean bool, Boolean bool2, Boolean bool3, Float f10) {
        return new a(bool, bool2, bool3, f10);
    }

    public static /* synthetic */ a a(a aVar, Boolean bool, Boolean bool2, Boolean bool3, Float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = aVar.f46873a;
        }
        if ((i10 & 2) != 0) {
            bool2 = aVar.f46874b;
        }
        if ((i10 & 4) != 0) {
            bool3 = aVar.f46875c;
        }
        if ((i10 & 8) != 0) {
            f10 = aVar.f46876d;
        }
        return aVar.a(bool, bool2, bool3, f10);
    }

    public /* synthetic */ a(Boolean bool, Boolean bool2, Boolean bool3, Float f10, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : bool2, (i10 & 4) != 0 ? null : bool3, (i10 & 8) != 0 ? null : f10);
    }
}
