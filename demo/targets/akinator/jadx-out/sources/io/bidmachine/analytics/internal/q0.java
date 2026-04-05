package io.bidmachine.analytics.internal;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f60254a;

    /* renamed from: b, reason: collision with root package name */
    private final a f60255b;

    /* renamed from: c, reason: collision with root package name */
    private final String f60256c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum a {
        UNKNOWN,
        MONITOR_INVALID,
        MONITOR_NO_CONTENT,
        MONITOR_BAD_CONTENT,
        READER_INVALID,
        READER_NO_CONTENT,
        READER_BAD_CONTENT,
        READER_NO_ACCESS
    }

    public q0(String str, a aVar, String str2) {
        this.f60254a = str;
        this.f60255b = aVar;
        this.f60256c = str2;
    }

    public final String a() {
        return this.f60254a;
    }

    public final String b() {
        return this.f60256c;
    }

    public final a c() {
        return this.f60255b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f60254a, q0Var.f60254a) && this.f60255b == q0Var.f60255b && kotlin.jvm.internal.e0.areEqual(this.f60256c, q0Var.f60256c);
    }

    public int hashCode() {
        return this.f60256c.hashCode() + ((this.f60255b.hashCode() + (this.f60254a.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TrackerError(name=");
        sb2.append(this.f60254a);
        sb2.append(", type=");
        sb2.append(this.f60255b);
        sb2.append(", reason=");
        return o2.q(sb2, this.f60256c, ')');
    }

    public /* synthetic */ q0(String str, a aVar, String str2, int i10, kotlin.jvm.internal.u uVar) {
        this(str, aVar, (i10 & 4) != 0 ? "" : str2);
    }
}
