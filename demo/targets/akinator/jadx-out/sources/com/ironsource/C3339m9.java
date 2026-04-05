package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.m9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3339m9 {

    /* renamed from: a, reason: collision with root package name */
    private final String f37213a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37214b;

    /* renamed from: c, reason: collision with root package name */
    private final String f37215c;

    public C3339m9() {
        this(null, 0, null, 7, null);
    }

    public final String a() {
        return this.f37213a;
    }

    public final int b() {
        return this.f37214b;
    }

    public final String c() {
        return this.f37215c;
    }

    public final String d() {
        return this.f37215c;
    }

    public final String e() {
        return this.f37213a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3339m9)) {
            return false;
        }
        C3339m9 c3339m9 = (C3339m9) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f37213a, c3339m9.f37213a) && this.f37214b == c3339m9.f37214b && kotlin.jvm.internal.e0.areEqual(this.f37215c, c3339m9.f37215c);
    }

    public final int f() {
        return this.f37214b;
    }

    public int hashCode() {
        int iD = e3.g.d(this.f37214b, this.f37213a.hashCode() * 31, 31);
        String str = this.f37215c;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f37213a;
        int i10 = this.f37214b;
        return j1.o2.o(a.b.r(i10, "InstanceInformation(instanceId=", str, ", instanceType=", ", dynamicDemandSourceId="), this.f37215c, ")");
    }

    public C3339m9(String instanceId, int i10, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instanceId, "instanceId");
        this.f37213a = instanceId;
        this.f37214b = i10;
        this.f37215c = str;
    }

    public final C3339m9 a(String instanceId, int i10, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instanceId, "instanceId");
        return new C3339m9(instanceId, i10, str);
    }

    public static /* synthetic */ C3339m9 a(C3339m9 c3339m9, String str, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = c3339m9.f37213a;
        }
        if ((i11 & 2) != 0) {
            i10 = c3339m9.f37214b;
        }
        if ((i11 & 4) != 0) {
            str2 = c3339m9.f37215c;
        }
        return c3339m9.a(str, i10, str2);
    }

    public /* synthetic */ C3339m9(String str, int i10, String str2, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? "" : str2);
    }
}
