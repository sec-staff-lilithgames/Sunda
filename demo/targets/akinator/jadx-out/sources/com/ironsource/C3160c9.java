package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.c9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3160c9 {

    /* renamed from: a, reason: collision with root package name */
    private final String f36135a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36136b;

    /* renamed from: c, reason: collision with root package name */
    private V f36137c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f36138d;

    /* renamed from: e, reason: collision with root package name */
    private String f36139e;

    /* renamed from: f, reason: collision with root package name */
    private String f36140f;

    public C3160c9(String appKey, String userId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(appKey, "appKey");
        kotlin.jvm.internal.e0.checkNotNullParameter(userId, "userId");
        this.f36135a = appKey;
        this.f36136b = userId;
    }

    public final String a() {
        return this.f36135a;
    }

    public final String b() {
        return this.f36136b;
    }

    public final boolean c() {
        return this.f36138d;
    }

    public final String d() {
        return this.f36135a;
    }

    public final V e() {
        return this.f36137c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3160c9)) {
            return false;
        }
        C3160c9 c3160c9 = (C3160c9) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f36135a, c3160c9.f36135a) && kotlin.jvm.internal.e0.areEqual(this.f36136b, c3160c9.f36136b);
    }

    public final String f() {
        return this.f36140f;
    }

    public final String g() {
        return this.f36139e;
    }

    public final String h() {
        return this.f36136b;
    }

    public int hashCode() {
        return this.f36136b.hashCode() + (this.f36135a.hashCode() * 31);
    }

    public String toString() {
        return e3.g.l("InitConfig(appKey=", this.f36135a, ", userId=", this.f36136b, ")");
    }

    public final C3160c9 a(String appKey, String userId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(appKey, "appKey");
        kotlin.jvm.internal.e0.checkNotNullParameter(userId, "userId");
        return new C3160c9(appKey, userId);
    }

    public final void b(String str) {
        this.f36139e = str;
    }

    public static /* synthetic */ C3160c9 a(C3160c9 c3160c9, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c3160c9.f36135a;
        }
        if ((i10 & 2) != 0) {
            str2 = c3160c9.f36136b;
        }
        return c3160c9.a(str, str2);
    }

    public final void a(V v10) {
        this.f36137c = v10;
    }

    public final void a(boolean z10) {
        this.f36138d = z10;
    }

    public final void a(String str) {
        this.f36140f = str;
    }

    public final <T> T a(Lb<C3160c9, T> mapper) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
