package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.ne, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3364ne {

    /* renamed from: c, reason: collision with root package name */
    public static final a f37984c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f37985d = 2070;

    /* renamed from: e, reason: collision with root package name */
    public static final int f37986e = 2080;

    /* renamed from: f, reason: collision with root package name */
    public static final int f37987f = 2090;

    /* renamed from: g, reason: collision with root package name */
    public static final int f37988g = 2100;

    /* renamed from: h, reason: collision with root package name */
    public static final int f37989h = 2110;

    /* renamed from: a, reason: collision with root package name */
    private final int f37990a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37991b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.ne$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private a() {
        }
    }

    public C3364ne(int i10, String errorMessage) {
        kotlin.jvm.internal.e0.checkNotNullParameter(errorMessage, "errorMessage");
        this.f37990a = i10;
        this.f37991b = errorMessage;
    }

    public final int a() {
        return this.f37990a;
    }

    public final String b() {
        return this.f37991b;
    }

    public final int c() {
        return this.f37990a;
    }

    public final String d() {
        return this.f37991b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3364ne)) {
            return false;
        }
        C3364ne c3364ne = (C3364ne) obj;
        return this.f37990a == c3364ne.f37990a && kotlin.jvm.internal.e0.areEqual(this.f37991b, c3364ne.f37991b);
    }

    public int hashCode() {
        return this.f37991b.hashCode() + (Integer.hashCode(this.f37990a) * 31);
    }

    public String toString() {
        return "SdkError(errorCode=" + this.f37990a + ", errorMessage=" + this.f37991b + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3364ne(IronSourceError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        int errorCode = error.getErrorCode();
        String errorMessage = error.getErrorMessage();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(errorMessage, "error.errorMessage");
        this(errorCode, errorMessage);
    }

    public final C3364ne a(int i10, String errorMessage) {
        kotlin.jvm.internal.e0.checkNotNullParameter(errorMessage, "errorMessage");
        return new C3364ne(i10, errorMessage);
    }

    public static /* synthetic */ C3364ne a(C3364ne c3364ne, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = c3364ne.f37990a;
        }
        if ((i11 & 2) != 0) {
            str = c3364ne.f37991b;
        }
        return c3364ne.a(i10, str);
    }
}
