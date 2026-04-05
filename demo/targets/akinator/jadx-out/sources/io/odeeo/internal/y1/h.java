package io.odeeo.internal.y1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class h extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final int f67578a;

    /* renamed from: b, reason: collision with root package name */
    public final String f67579b;

    /* renamed from: c, reason: collision with root package name */
    public final transient r<?> f67580c;

    public h(r<?> rVar) {
        super(a(rVar));
        this.f67578a = rVar.code();
        this.f67579b = rVar.message();
        this.f67580c = rVar;
    }

    public static String a(r<?> rVar) {
        w.a(rVar, "response == null");
        return "HTTP " + rVar.code() + " " + rVar.message();
    }

    public int code() {
        return this.f67578a;
    }

    public String message() {
        return this.f67579b;
    }

    public r<?> response() {
        return this.f67580c;
    }
}
