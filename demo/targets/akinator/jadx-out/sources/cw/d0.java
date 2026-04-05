package cw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f51140a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f51141b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f51142c;

    public d0(e0 plan, e0 e0Var, Throwable th2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(plan, "plan");
        this.f51140a = plan;
        this.f51141b = e0Var;
        this.f51142c = th2;
    }

    public static /* synthetic */ d0 copy$default(d0 d0Var, e0 e0Var, e0 e0Var2, Throwable th2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            e0Var = d0Var.f51140a;
        }
        if ((i10 & 2) != 0) {
            e0Var2 = d0Var.f51141b;
        }
        if ((i10 & 4) != 0) {
            th2 = d0Var.f51142c;
        }
        return d0Var.copy(e0Var, e0Var2, th2);
    }

    public final e0 component1() {
        return this.f51140a;
    }

    public final e0 component2() {
        return this.f51141b;
    }

    public final Throwable component3() {
        return this.f51142c;
    }

    public final d0 copy(e0 plan, e0 e0Var, Throwable th2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(plan, "plan");
        return new d0(plan, e0Var, th2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f51140a, d0Var.f51140a) && kotlin.jvm.internal.e0.areEqual(this.f51141b, d0Var.f51141b) && kotlin.jvm.internal.e0.areEqual(this.f51142c, d0Var.f51142c);
    }

    public final e0 getNextPlan() {
        return this.f51141b;
    }

    public final e0 getPlan() {
        return this.f51140a;
    }

    public final Throwable getThrowable() {
        return this.f51142c;
    }

    public int hashCode() {
        int iHashCode = this.f51140a.hashCode() * 31;
        e0 e0Var = this.f51141b;
        int iHashCode2 = (iHashCode + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        Throwable th2 = this.f51142c;
        return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
    }

    public final boolean isSuccess() {
        return this.f51141b == null && this.f51142c == null;
    }

    public String toString() {
        return "ConnectResult(plan=" + this.f51140a + ", nextPlan=" + this.f51141b + ", throwable=" + this.f51142c + ')';
    }

    public /* synthetic */ d0(e0 e0Var, e0 e0Var2, Throwable th2, int i10, kotlin.jvm.internal.u uVar) {
        this(e0Var, (i10 & 2) != 0 ? null : e0Var2, (i10 & 4) != 0 ? null : th2);
    }
}
