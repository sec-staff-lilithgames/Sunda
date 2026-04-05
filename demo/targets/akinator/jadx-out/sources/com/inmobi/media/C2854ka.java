package com.inmobi.media;

import com.inmobi.commons.core.configs.SignalsConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.ka, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2854ka {

    /* renamed from: a, reason: collision with root package name */
    public final String f33017a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33018b;

    /* renamed from: c, reason: collision with root package name */
    public final SignalsConfig.NovatiqConfig f33019c;

    public C2854ka(String hyperId, String spHost, SignalsConfig.NovatiqConfig novatiqConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(hyperId, "hyperId");
        kotlin.jvm.internal.e0.checkNotNullParameter("i6i", "sspId");
        kotlin.jvm.internal.e0.checkNotNullParameter(spHost, "spHost");
        kotlin.jvm.internal.e0.checkNotNullParameter("inmobi", "pubId");
        kotlin.jvm.internal.e0.checkNotNullParameter(novatiqConfig, "novatiqConfig");
        this.f33017a = hyperId;
        this.f33018b = spHost;
        this.f33019c = novatiqConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2854ka)) {
            return false;
        }
        C2854ka c2854ka = (C2854ka) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f33017a, c2854ka.f33017a) && kotlin.jvm.internal.e0.areEqual("i6i", "i6i") && kotlin.jvm.internal.e0.areEqual(this.f33018b, c2854ka.f33018b) && kotlin.jvm.internal.e0.areEqual("inmobi", "inmobi") && kotlin.jvm.internal.e0.areEqual(this.f33019c, c2854ka.f33019c);
    }

    public final int hashCode() {
        return this.f33019c.hashCode() + ((((this.f33018b.hashCode() + (((this.f33017a.hashCode() * 31) + 102684) * 31)) * 31) - 1183962098) * 31);
    }

    public final String toString() {
        return "NovatiqData(hyperId=" + this.f33017a + ", sspId=i6i, spHost=" + this.f33018b + ", pubId=inmobi, novatiqConfig=" + this.f33019c + ')';
    }
}
