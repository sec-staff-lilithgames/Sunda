package es;

import wr.b3;
import wr.e3;
import wr.f1;
import wr.h3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f55076a;

    /* renamed from: b, reason: collision with root package name */
    public e3 f55077b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f55078c;

    /* renamed from: d, reason: collision with root package name */
    public final i f55079d;

    /* renamed from: e, reason: collision with root package name */
    public final h3 f55080e;

    /* renamed from: f, reason: collision with root package name */
    public wr.f0 f55081f;

    /* renamed from: g, reason: collision with root package name */
    public b3.f f55082g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f55083h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q f55084i;

    public o(q qVar, Object obj, h3 h3Var, Object obj2, b3.f fVar) {
        this(qVar, obj, h3Var, obj2, fVar, null, false);
    }

    public b3.f getCurrentPicker() {
        return this.f55082g;
    }

    public wr.f0 getCurrentState() {
        return this.f55081f;
    }

    public f1 getEag() {
        e3 e3Var = this.f55077b;
        if (e3Var == null || e3Var.getAddresses().isEmpty()) {
            return null;
        }
        return this.f55077b.getAddresses().get(0);
    }

    public Object getKey() {
        return this.f55076a;
    }

    public h3 getPolicyProvider() {
        return this.f55080e;
    }

    public e3 getResolvedAddresses() {
        return this.f55077b;
    }

    public boolean isDeactivated() {
        return this.f55083h;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Address = ");
        sb2.append(this.f55076a);
        sb2.append(", state = ");
        sb2.append(this.f55081f);
        sb2.append(", picker type: ");
        sb2.append(this.f55082g.getClass());
        sb2.append(", lb: ");
        sb2.append(this.f55079d.a().getClass());
        sb2.append(this.f55083h ? ", deactivated" : "");
        return sb2.toString();
    }

    public o(q qVar, Object obj, h3 h3Var, Object obj2, b3.f fVar, e3 e3Var, boolean z10) {
        this.f55084i = qVar;
        this.f55076a = obj;
        this.f55080e = h3Var;
        this.f55083h = z10;
        this.f55082g = fVar;
        this.f55078c = obj2;
        i iVar = new i(new n(this));
        this.f55079d = iVar;
        this.f55081f = z10 ? wr.f0.f90915f : wr.f0.f90912b;
        this.f55077b = e3Var;
        if (z10) {
            return;
        }
        iVar.switchTo(h3Var);
    }
}
