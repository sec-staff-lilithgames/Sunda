package ao;

import ao.f0;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e0 extends y {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f7624h = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final Object f7625f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f7626g;

    public e0(gn.u1 u1Var, Object obj, Object obj2) {
        super(u1Var);
        this.f7625f = obj;
        this.f7626g = obj2;
    }

    public static e0 createWithPlaceholderTimeline(gn.p0 p0Var) {
        return new e0(new f0.a(p0Var), gn.t1.f58165q, f7624h);
    }

    public static e0 createWithRealTimeline(gn.u1 u1Var, Object obj, Object obj2) {
        return new e0(u1Var, obj, obj2);
    }

    public e0 cloneWithUpdatedTimeline(gn.u1 u1Var) {
        return new e0(u1Var, this.f7625f, this.f7626g);
    }

    @Override // ao.y, gn.u1
    public int getIndexOfPeriod(Object obj) {
        Object obj2;
        if (f7624h.equals(obj) && (obj2 = this.f7626g) != null) {
            obj = obj2;
        }
        return this.f7904e.getIndexOfPeriod(obj);
    }

    @Override // ao.y, gn.u1
    public gn.r1 getPeriod(int i10, gn.r1 r1Var, boolean z10) {
        this.f7904e.getPeriod(i10, r1Var, z10);
        if (Objects.equals(r1Var.f58109b, this.f7626g) && z10) {
            r1Var.f58109b = f7624h;
        }
        return r1Var;
    }

    @Override // ao.y, gn.u1
    public Object getUidOfPeriod(int i10) {
        Object uidOfPeriod = this.f7904e.getUidOfPeriod(i10);
        return Objects.equals(uidOfPeriod, this.f7626g) ? f7624h : uidOfPeriod;
    }

    @Override // ao.y, gn.u1
    public gn.t1 getWindow(int i10, gn.t1 t1Var, long j10) {
        this.f7904e.getWindow(i10, t1Var, j10);
        if (Objects.equals(t1Var.f58175a, this.f7625f)) {
            t1Var.f58175a = gn.t1.f58165q;
        }
        return t1Var;
    }
}
