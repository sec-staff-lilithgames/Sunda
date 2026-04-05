package k7;

import xv.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public final v0 f70658b;

    public f(v0 v0Var) {
        super("HTTP " + v0Var.code() + ": " + v0Var.message());
        this.f70658b = v0Var;
    }

    public final v0 getResponse() {
        return this.f70658b;
    }
}
