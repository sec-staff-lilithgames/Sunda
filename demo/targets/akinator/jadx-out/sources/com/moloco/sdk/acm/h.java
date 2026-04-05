package com.moloco.sdk.acm;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f45612a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f45613b;

    /* JADX WARN: Multi-variable type inference failed */
    public h() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ h copy$default(h hVar, String str, Long l9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = hVar.f45612a;
        }
        if ((i10 & 2) != 0) {
            l9 = hVar.f45613b;
        }
        return hVar.copy(str, l9);
    }

    public final String component1() {
        return this.f45612a;
    }

    public final Long component2() {
        return this.f45613b;
    }

    public final h copy(String str, Long l9) {
        return new h(str, l9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return e0.areEqual(this.f45612a, hVar.f45612a) && e0.areEqual(this.f45613b, hVar.f45613b);
    }

    public final String getPostAnalyticsUrl() {
        return this.f45612a;
    }

    public final Long getRequestPeriodSeconds() {
        return this.f45613b;
    }

    public int hashCode() {
        String str = this.f45612a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l9 = this.f45613b;
        return iHashCode + (l9 != null ? l9.hashCode() : 0);
    }

    public String toString() {
        return "UpdateConfig(postAnalyticsUrl=" + this.f45612a + ", requestPeriodSeconds=" + this.f45613b + ')';
    }

    public h(String str, Long l9) {
        this.f45612a = str;
        this.f45613b = l9;
    }

    public /* synthetic */ h(String str, Long l9, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : l9);
    }
}
