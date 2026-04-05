package io.bidmachine.analytics.internal;

import java.util.Map;
import java.util.UUID;
import p0.o2;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class Q {

    /* renamed from: g, reason: collision with root package name */
    public static final a f59932g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f59933a;

    /* renamed from: b, reason: collision with root package name */
    private final String f59934b;

    /* renamed from: c, reason: collision with root package name */
    private final String f59935c;

    /* renamed from: d, reason: collision with root package name */
    private final long f59936d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f59937e;

    /* renamed from: f, reason: collision with root package name */
    private final q0 f59938f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private a() {
        }
    }

    public Q(String str, String str2, String str3, long j10, Map map, q0 q0Var) {
        this.f59933a = str;
        this.f59934b = str2;
        this.f59935c = str3;
        this.f59936d = j10;
        this.f59937e = map;
        this.f59938f = q0Var;
    }

    public final Q a(String str, String str2, String str3, long j10, Map map, q0 q0Var) {
        return new Q(str, str2, str3, j10, map, q0Var);
    }

    public final q0 b() {
        return this.f59938f;
    }

    public final String c() {
        return this.f59933a;
    }

    public final String d() {
        return this.f59934b;
    }

    public final String e() {
        return this.f59935c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q10 = (Q) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f59933a, q10.f59933a) && kotlin.jvm.internal.e0.areEqual(this.f59934b, q10.f59934b) && kotlin.jvm.internal.e0.areEqual(this.f59935c, q10.f59935c) && this.f59936d == q10.f59936d && kotlin.jvm.internal.e0.areEqual(this.f59937e, q10.f59937e) && kotlin.jvm.internal.e0.areEqual(this.f59938f, q10.f59938f);
    }

    public final long f() {
        return this.f59936d;
    }

    public int hashCode() {
        int iF = o2.f(this.f59937e, o2.d(o2.e(o2.e(this.f59933a.hashCode() * 31, 31, this.f59934b), 31, this.f59935c), 31, this.f59936d), 31);
        q0 q0Var = this.f59938f;
        return iF + (q0Var == null ? 0 : q0Var.hashCode());
    }

    public String toString() {
        return "MonitorRecord(id=" + this.f59933a + ", name=" + this.f59934b + ", sessionId=" + this.f59935c + ", timestamp=" + this.f59936d + ", data=" + this.f59937e + ", error=" + this.f59938f + ')';
    }

    public static /* synthetic */ Q a(Q q10, String str, String str2, String str3, long j10, Map map, q0 q0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = q10.f59933a;
        }
        if ((i10 & 2) != 0) {
            str2 = q10.f59934b;
        }
        if ((i10 & 4) != 0) {
            str3 = q10.f59935c;
        }
        if ((i10 & 8) != 0) {
            j10 = q10.f59936d;
        }
        if ((i10 & 16) != 0) {
            map = q10.f59937e;
        }
        if ((i10 & 32) != 0) {
            q0Var = q10.f59938f;
        }
        long j11 = j10;
        String str4 = str3;
        return q10.a(str, str2, str4, j11, map, q0Var);
    }

    public final Map a() {
        return this.f59937e;
    }

    public /* synthetic */ Q(String str, String str2, String str3, long j10, Map map, q0 q0Var, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? UUID.randomUUID().toString() : str, str2, str3, (i10 & 8) != 0 ? System.currentTimeMillis() : j10, (i10 & 16) != 0 ? p1.emptyMap() : map, (i10 & 32) != 0 ? null : q0Var);
    }
}
