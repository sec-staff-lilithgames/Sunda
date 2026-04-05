package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Db {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC3359n9 f34194a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34195b;

    /* renamed from: c, reason: collision with root package name */
    private final long f34196c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f34197d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f34198e;

    public Db(EnumC3359n9 instanceType, String adSourceNameForEvents, long j10, boolean z10, boolean z11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instanceType, "instanceType");
        kotlin.jvm.internal.e0.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        this.f34194a = instanceType;
        this.f34195b = adSourceNameForEvents;
        this.f34196c = j10;
        this.f34197d = z10;
        this.f34198e = z11;
    }

    public final EnumC3359n9 a() {
        return this.f34194a;
    }

    public final String b() {
        return this.f34195b;
    }

    public final long c() {
        return this.f34196c;
    }

    public final boolean d() {
        return this.f34197d;
    }

    public final boolean e() {
        return this.f34198e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Db)) {
            return false;
        }
        Db db2 = (Db) obj;
        return this.f34194a == db2.f34194a && kotlin.jvm.internal.e0.areEqual(this.f34195b, db2.f34195b) && this.f34196c == db2.f34196c && this.f34197d == db2.f34197d && this.f34198e == db2.f34198e;
    }

    public final String f() {
        return this.f34195b;
    }

    public final EnumC3359n9 g() {
        return this.f34194a;
    }

    public final long h() {
        return this.f34196c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iD = p0.o2.d(p0.o2.e(this.f34194a.hashCode() * 31, 31, this.f34195b), 31, this.f34196c);
        boolean z10 = this.f34197d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iD + i10) * 31;
        boolean z11 = this.f34198e;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final boolean i() {
        return this.f34198e;
    }

    public final boolean j() {
        return this.f34197d;
    }

    public String toString() {
        return "LoadTaskConfig(instanceType=" + this.f34194a + ", adSourceNameForEvents=" + this.f34195b + ", loadTimeoutInMills=" + this.f34196c + ", isOneFlow=" + this.f34197d + ", isMultipleAdObjects=" + this.f34198e + ")";
    }

    public final Db a(EnumC3359n9 instanceType, String adSourceNameForEvents, long j10, boolean z10, boolean z11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instanceType, "instanceType");
        kotlin.jvm.internal.e0.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        return new Db(instanceType, adSourceNameForEvents, j10, z10, z11);
    }

    public static /* synthetic */ Db a(Db db2, EnumC3359n9 enumC3359n9, String str, long j10, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC3359n9 = db2.f34194a;
        }
        if ((i10 & 2) != 0) {
            str = db2.f34195b;
        }
        if ((i10 & 4) != 0) {
            j10 = db2.f34196c;
        }
        if ((i10 & 8) != 0) {
            z10 = db2.f34197d;
        }
        if ((i10 & 16) != 0) {
            z11 = db2.f34198e;
        }
        long j11 = j10;
        return db2.a(enumC3359n9, str, j11, z10, z11);
    }

    public /* synthetic */ Db(EnumC3359n9 enumC3359n9, String str, long j10, boolean z10, boolean z11, int i10, kotlin.jvm.internal.u uVar) {
        this(enumC3359n9, str, j10, z10, (i10 & 16) != 0 ? true : z11);
    }
}
