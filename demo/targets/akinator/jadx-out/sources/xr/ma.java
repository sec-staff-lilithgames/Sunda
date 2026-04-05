package xr;

import wr.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class ma {

    /* renamed from: a, reason: collision with root package name */
    public final b3.e f92794a;

    /* renamed from: b, reason: collision with root package name */
    public wr.f0 f92795b;

    /* renamed from: c, reason: collision with root package name */
    public final ha f92796c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f92797d = false;

    public ma(b3.e eVar, wr.f0 f0Var, ha haVar) {
        this.f92794a = eVar;
        this.f92795b = f0Var;
        this.f92796c = haVar;
    }

    public static void a(ma maVar, wr.f0 f0Var) {
        maVar.f92795b = f0Var;
        if (f0Var == wr.f0.f90913c || f0Var == wr.f0.f90914e) {
            maVar.f92797d = true;
        } else if (f0Var == wr.f0.f90915f) {
            maVar.f92797d = false;
        }
    }

    public wr.f0 getState() {
        return this.f92795b;
    }

    public b3.e getSubchannel() {
        return this.f92794a;
    }

    public boolean isCompletedConnectivityAttempt() {
        return this.f92797d;
    }
}
