package br;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f9867b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f9868a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final h0 create(Throwable throwable) {
            kotlin.jvm.internal.e0.checkNotNullParameter(throwable, "throwable");
            String message = throwable.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            return new h0(message);
        }
    }

    public h0(String message) {
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        this.f9868a = message;
    }

    public static final h0 create(Throwable th2) {
        return f9867b.create(th2);
    }

    public final String getMessage() {
        return this.f9868a;
    }

    public String toString() {
        return this.f9868a;
    }
}
