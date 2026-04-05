package pc;

import jc.o;
import jc.r;
import rc.d0;
import ub.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b extends r {

    /* renamed from: f, reason: collision with root package name */
    public final o f80935f;

    /* renamed from: g, reason: collision with root package name */
    public final transient jc.d f80936g;

    /* renamed from: h, reason: collision with root package name */
    public final transient d0 f80937h;

    public b(u uVar, String str, o oVar) {
        super(uVar, str);
        this.f80935f = oVar;
        this.f80936g = null;
        this.f80937h = null;
    }

    public static b from(u uVar, String str, jc.d dVar, d0 d0Var) {
        return new b(uVar, str, dVar, d0Var);
    }

    public jc.d getBeanDescription() {
        return this.f80936g;
    }

    public d0 getProperty() {
        return this.f80937h;
    }

    public o getType() {
        return this.f80935f;
    }

    public static b from(u uVar, String str, o oVar) {
        return new b(uVar, str, oVar);
    }

    public static b from(ub.o oVar, String str, jc.d dVar, d0 d0Var) {
        return new b(oVar, str, dVar, d0Var);
    }

    public static b from(ub.o oVar, String str, o oVar2) {
        return new b(oVar, str, oVar2);
    }

    public b(ub.o oVar, String str, o oVar2) {
        super(oVar, str);
        this.f80935f = oVar2;
        this.f80936g = null;
        this.f80937h = null;
    }

    public b(u uVar, String str, jc.d dVar, d0 d0Var) {
        super(uVar, str);
        this.f80935f = dVar == null ? null : dVar.getType();
        this.f80936g = dVar;
        this.f80937h = d0Var;
    }

    public b(ub.o oVar, String str, jc.d dVar, d0 d0Var) {
        super(oVar, str);
        this.f80935f = dVar == null ? null : dVar.getType();
        this.f80936g = dVar;
        this.f80937h = d0Var;
    }
}
