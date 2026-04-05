package com.moloco.sdk.internal.services.bidtoken.providers;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Long f46881a;

    public d(Long l9) {
        this.f46881a = l9;
    }

    public final Long a() {
        return this.f46881a;
    }

    public final Long b() {
        return this.f46881a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && e0.areEqual(this.f46881a, ((d) obj).f46881a);
    }

    public int hashCode() {
        Long l9 = this.f46881a;
        if (l9 == null) {
            return 0;
        }
        return l9.hashCode();
    }

    public String toString() {
        return "AppDirInfo(appDirSize=" + this.f46881a + ')';
    }

    public final d a(Long l9) {
        return new d(l9);
    }

    public static /* synthetic */ d a(d dVar, Long l9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l9 = dVar.f46881a;
        }
        return dVar.a(l9);
    }
}
