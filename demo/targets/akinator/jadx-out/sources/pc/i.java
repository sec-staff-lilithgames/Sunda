package pc;

import jc.o;
import jc.r;
import ub.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i extends r {

    /* renamed from: f, reason: collision with root package name */
    public final o f80947f;

    public i(u uVar, String str, o oVar, Throwable th2) {
        super(uVar, str, th2);
        this.f80947f = oVar;
    }

    public static i from(u uVar, String str, o oVar) {
        return new i(uVar, str, oVar);
    }

    public o getType() {
        return this.f80947f;
    }

    public static i from(u uVar, String str, o oVar, Throwable th2) {
        return new i(uVar, str, oVar, th2);
    }

    public i(u uVar, String str, o oVar) {
        super(uVar, str);
        this.f80947f = oVar;
    }
}
