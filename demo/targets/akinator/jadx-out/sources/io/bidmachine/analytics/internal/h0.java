package io.bidmachine.analytics.internal;

import java.util.UUID;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f60038a;

    /* renamed from: b, reason: collision with root package name */
    private final String f60039b;

    /* renamed from: c, reason: collision with root package name */
    private final long f60040c;

    /* renamed from: d, reason: collision with root package name */
    private final String f60041d;

    /* renamed from: e, reason: collision with root package name */
    private final a f60042e;

    /* renamed from: f, reason: collision with root package name */
    private final q0 f60043f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f60044g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f60045a;

        /* renamed from: b, reason: collision with root package name */
        private final String f60046b;

        public a(String str, String str2) {
            this.f60045a = str;
            this.f60046b = str2;
        }

        public final String a() {
            return this.f60046b;
        }

        public final String b() {
            return this.f60045a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.e0.areEqual(this.f60045a, aVar.f60045a) && kotlin.jvm.internal.e0.areEqual(this.f60046b, aVar.f60046b);
        }

        public int hashCode() {
            return this.f60046b.hashCode() + (this.f60045a.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Rule(tag=");
            sb2.append(this.f60045a);
            sb2.append(", path=");
            return o2.q(sb2, this.f60046b, ')');
        }
    }

    public h0(String str, String str2, long j10, String str3, a aVar, q0 q0Var, boolean z10) {
        this.f60038a = str;
        this.f60039b = str2;
        this.f60040c = j10;
        this.f60041d = str3;
        this.f60042e = aVar;
        this.f60043f = q0Var;
        this.f60044g = z10;
    }

    public final h0 a(String str, String str2, long j10, String str3, a aVar, q0 q0Var, boolean z10) {
        return new h0(str, str2, j10, str3, aVar, q0Var, z10);
    }

    public final q0 b() {
        return this.f60043f;
    }

    public final String c() {
        return this.f60038a;
    }

    public final String d() {
        return this.f60039b;
    }

    public final a e() {
        return this.f60042e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f60038a, h0Var.f60038a) && kotlin.jvm.internal.e0.areEqual(this.f60039b, h0Var.f60039b) && this.f60040c == h0Var.f60040c && kotlin.jvm.internal.e0.areEqual(this.f60041d, h0Var.f60041d) && kotlin.jvm.internal.e0.areEqual(this.f60042e, h0Var.f60042e) && kotlin.jvm.internal.e0.areEqual(this.f60043f, h0Var.f60043f) && this.f60044g == h0Var.f60044g;
    }

    public final long f() {
        return this.f60040c;
    }

    public final boolean g() {
        return this.f60044g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = (this.f60042e.hashCode() + o2.e(o2.d(o2.e(this.f60038a.hashCode() * 31, 31, this.f60039b), 31, this.f60040c), 31, this.f60041d)) * 31;
        q0 q0Var = this.f60043f;
        int iHashCode2 = (iHashCode + (q0Var == null ? 0 : q0Var.hashCode())) * 31;
        boolean z10 = this.f60044g;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return iHashCode2 + i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ReaderRecord(id=");
        sb2.append(this.f60038a);
        sb2.append(", name=");
        sb2.append(this.f60039b);
        sb2.append(", timestamp=");
        sb2.append(this.f60040c);
        sb2.append(", dataHash=");
        sb2.append(this.f60041d);
        sb2.append(", rule=");
        sb2.append(this.f60042e);
        sb2.append(", error=");
        sb2.append(this.f60043f);
        sb2.append(", isDirty=");
        return a.b.p(sb2, this.f60044g, ')');
    }

    public static /* synthetic */ h0 a(h0 h0Var, String str, String str2, long j10, String str3, a aVar, q0 q0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = h0Var.f60038a;
        }
        if ((i10 & 2) != 0) {
            str2 = h0Var.f60039b;
        }
        if ((i10 & 4) != 0) {
            j10 = h0Var.f60040c;
        }
        if ((i10 & 8) != 0) {
            str3 = h0Var.f60041d;
        }
        if ((i10 & 16) != 0) {
            aVar = h0Var.f60042e;
        }
        if ((i10 & 32) != 0) {
            q0Var = h0Var.f60043f;
        }
        if ((i10 & 64) != 0) {
            z10 = h0Var.f60044g;
        }
        long j11 = j10;
        return h0Var.a(str, str2, j11, str3, aVar, q0Var, z10);
    }

    public final String a() {
        return this.f60041d;
    }

    public /* synthetic */ h0(String str, String str2, long j10, String str3, a aVar, q0 q0Var, boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? UUID.randomUUID().toString() : str, str2, (i10 & 4) != 0 ? System.currentTimeMillis() : j10, str3, aVar, (i10 & 32) != 0 ? null : q0Var, (i10 & 64) != 0 ? true : z10);
    }
}
