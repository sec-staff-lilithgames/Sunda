package com.moloco.sdk.acm.db;

import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f45514a;

    /* renamed from: b, reason: collision with root package name */
    public final String f45515b;

    /* renamed from: c, reason: collision with root package name */
    public final long f45516c;

    /* renamed from: d, reason: collision with root package name */
    public final c f45517d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f45518e;

    /* renamed from: f, reason: collision with root package name */
    public final List f45519f;

    public b(long j10, String name, long j11, c eventType, Long l9, List<String> tags) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(eventType, "eventType");
        e0.checkNotNullParameter(tags, "tags");
        this.f45514a = j10;
        this.f45515b = name;
        this.f45516c = j11;
        this.f45517d = eventType;
        this.f45518e = l9;
        this.f45519f = tags;
    }

    public final long a() {
        return this.f45514a;
    }

    public final String b() {
        return this.f45515b;
    }

    public final long c() {
        return this.f45516c;
    }

    public final c d() {
        return this.f45517d;
    }

    public final Long e() {
        return this.f45518e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f45514a == bVar.f45514a && e0.areEqual(this.f45515b, bVar.f45515b) && this.f45516c == bVar.f45516c && this.f45517d == bVar.f45517d && e0.areEqual(this.f45518e, bVar.f45518e) && e0.areEqual(this.f45519f, bVar.f45519f);
    }

    public final List<String> f() {
        return this.f45519f;
    }

    public final Long g() {
        return this.f45518e;
    }

    public final c h() {
        return this.f45517d;
    }

    public int hashCode() {
        int iHashCode = (this.f45517d.hashCode() + o2.d(o2.e(Long.hashCode(this.f45514a) * 31, 31, this.f45515b), 31, this.f45516c)) * 31;
        Long l9 = this.f45518e;
        return this.f45519f.hashCode() + ((iHashCode + (l9 == null ? 0 : l9.hashCode())) * 31);
    }

    public final long i() {
        return this.f45514a;
    }

    public final String j() {
        return this.f45515b;
    }

    public final List<String> k() {
        return this.f45519f;
    }

    public final long l() {
        return this.f45516c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EventEntity(id=");
        sb2.append(this.f45514a);
        sb2.append(", name=");
        sb2.append(this.f45515b);
        sb2.append(", timestamp=");
        sb2.append(this.f45516c);
        sb2.append(", eventType=");
        sb2.append(this.f45517d);
        sb2.append(", data=");
        sb2.append(this.f45518e);
        sb2.append(", tags=");
        return j1.o2.p(sb2, this.f45519f, ')');
    }

    public final b a(long j10, String name, long j11, c eventType, Long l9, List<String> tags) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(eventType, "eventType");
        e0.checkNotNullParameter(tags, "tags");
        return new b(j10, name, j11, eventType, l9, tags);
    }

    public static /* synthetic */ b a(b bVar, long j10, String str, long j11, c cVar, Long l9, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = bVar.f45514a;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            str = bVar.f45515b;
        }
        String str2 = str;
        if ((i10 & 4) != 0) {
            j11 = bVar.f45516c;
        }
        long j13 = j11;
        if ((i10 & 8) != 0) {
            cVar = bVar.f45517d;
        }
        return bVar.a(j12, str2, j13, cVar, (i10 & 16) != 0 ? bVar.f45518e : l9, (i10 & 32) != 0 ? bVar.f45519f : list);
    }

    public /* synthetic */ b(long j10, String str, long j11, c cVar, Long l9, List list, int i10, u uVar) {
        this((i10 & 1) != 0 ? 0L : j10, str, j11, cVar, (i10 & 16) != 0 ? null : l9, (i10 & 32) != 0 ? p0.emptyList() : list);
    }
}
