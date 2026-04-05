package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.q4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3406q4 {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f38207a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38208b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f38209c;

    public C3406q4(Throwable throwable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(throwable, "throwable");
        this.f38207a = throwable;
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(stackTrace, "throwable.stackTrace");
        sb2.append(throwable.toString());
        sb2.append(System.lineSeparator());
        boolean z10 = false;
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb2.append(stackTraceElement.toString());
            sb2.append(";" + System.lineSeparator());
            String string = stackTraceElement.toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "elem.toString()");
            String strE = C3422r4.d().e();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "getInstance().keyword");
            if (sv.n0.contains$default((CharSequence) string, (CharSequence) strE, false, 2, (Object) null)) {
                z10 = true;
            }
        }
        Throwable cause = this.f38207a.getCause();
        if (cause != null) {
            sb2.append("--CAUSE");
            sb2.append(System.lineSeparator());
            sb2.append(cause.toString());
            sb2.append(System.lineSeparator());
            StackTraceElement[] stackTrace2 = cause.getStackTrace();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(stackTrace2, "cause.stackTrace");
            for (StackTraceElement stackTraceElement2 : stackTrace2) {
                sb2.append(stackTraceElement2.toString());
                sb2.append(";" + System.lineSeparator());
                String string2 = stackTraceElement2.toString();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(string2, "elem.toString()");
                String strE2 = C3422r4.d().e();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE2, "getInstance().keyword");
                if (sv.n0.contains$default((CharSequence) string2, (CharSequence) strE2, false, 2, (Object) null)) {
                    z10 = true;
                }
            }
        }
        String string3 = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string3, "builder.toString()");
        this.f38208b = string3;
        this.f38209c = z10;
    }

    public final Throwable a() {
        return this.f38207a;
    }

    public final String b() {
        return this.f38208b;
    }

    public final Throwable c() {
        return this.f38207a;
    }

    public final boolean d() {
        return this.f38209c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3406q4) && kotlin.jvm.internal.e0.areEqual(this.f38207a, ((C3406q4) obj).f38207a);
    }

    public int hashCode() {
        return this.f38207a.hashCode();
    }

    public String toString() {
        return "CrashReportWrapper(throwable=" + this.f38207a + ")";
    }

    public final C3406q4 a(Throwable throwable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(throwable, "throwable");
        return new C3406q4(throwable);
    }

    public static /* synthetic */ C3406q4 a(C3406q4 c3406q4, Throwable th2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = c3406q4.f38207a;
        }
        return c3406q4.a(th2);
    }
}
