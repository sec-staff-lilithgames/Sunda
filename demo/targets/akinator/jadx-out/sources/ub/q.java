package ub;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class q extends xb.c {
    public q(String str) {
        this(null, str, null, null);
    }

    @Override // xb.c, ub.x, java.lang.Throwable
    public String getMessage() {
        return super.getMessage();
    }

    @Override // xb.c
    public ic.g0 getRequestPayload() {
        return super.getRequestPayload();
    }

    @Override // xb.c
    public String getRequestPayloadAsString() {
        return super.getRequestPayloadAsString();
    }

    public q(u uVar, String str, p pVar) {
        this(uVar, str, pVar, null);
    }

    @Override // xb.c, ub.x, ub.h
    public u getProcessor() {
        return super.getProcessor();
    }

    @Override // xb.c
    public q withParser(u uVar) {
        this.f91894c = uVar;
        return this;
    }

    @Override // xb.c
    public q withRequestPayload(ic.g0 g0Var) {
        this.f91895e = g0Var;
        return this;
    }

    public q(u uVar, String str, p pVar, Throwable th2) {
        super(uVar, str, pVar, th2);
    }

    @Deprecated
    public q(String str, p pVar) {
        this(null, str, pVar, null);
    }

    @Deprecated
    public q(String str, p pVar, Throwable th2) {
        this(null, str, pVar, th2);
    }

    public q(u uVar, String str) {
        this(uVar, str, uVar == null ? null : uVar.currentLocation(), null);
    }

    public q(u uVar, String str, Throwable th2) {
        this(uVar, str, uVar == null ? null : uVar.currentLocation(), th2);
    }
}
