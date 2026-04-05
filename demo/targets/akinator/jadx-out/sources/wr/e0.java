package wr;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f90878b = new e0(new y(), z.f91209a);

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f90879a = new ConcurrentHashMap();

    public e0(d0... d0VarArr) {
        for (d0 d0Var : d0VarArr) {
            this.f90879a.put(d0Var.getMessageEncoding(), d0Var);
        }
    }

    public static e0 getDefaultInstance() {
        return f90878b;
    }

    public static e0 newEmptyInstance() {
        return new e0(new d0[0]);
    }

    public d0 lookupCompressor(String str) {
        return (d0) this.f90879a.get(str);
    }

    public void register(d0 d0Var) {
        String messageEncoding = d0Var.getMessageEncoding();
        mh.p1.checkArgument(!messageEncoding.contains(","), "Comma is currently not allowed in message encoding");
        this.f90879a.put(messageEncoding, d0Var);
    }
}
