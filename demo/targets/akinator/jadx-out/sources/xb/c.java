package xb;

import ic.g0;
import ub.p;
import ub.u;
import ub.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class c extends x {

    /* renamed from: c, reason: collision with root package name */
    public transient u f91894c;

    /* renamed from: e, reason: collision with root package name */
    public g0 f91895e;

    public c(u uVar, String str, p pVar, Throwable th2) {
        super(str, pVar, th2);
        this.f91894c = uVar;
    }

    @Override // ub.x, java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (this.f91895e == null) {
            return message;
        }
        StringBuilder sbT = a.b.t(message, "\nRequest payload : ");
        sbT.append(this.f91895e.toString());
        return sbT.toString();
    }

    public g0 getRequestPayload() {
        return this.f91895e;
    }

    public String getRequestPayloadAsString() {
        g0 g0Var = this.f91895e;
        if (g0Var != null) {
            return g0Var.toString();
        }
        return null;
    }

    public abstract c withParser(u uVar);

    public abstract c withRequestPayload(g0 g0Var);

    @Override // ub.x, ub.h
    public u getProcessor() {
        return this.f91894c;
    }
}
