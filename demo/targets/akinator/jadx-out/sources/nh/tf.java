package nh;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class tf extends b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f76669e;

    /* renamed from: f, reason: collision with root package name */
    public Object f76670f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f76671g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f76672h;

    public /* synthetic */ tf(zi ziVar, v2 v2Var, xe xeVar, int i10) {
        this.f76669e = i10;
        this.f76671g = xeVar;
        this.f76672h = ziVar;
        this.f76670f = v2Var;
    }

    @Override // nh.b
    public final Object computeNext() {
        ze zeVar;
        switch (this.f76669e) {
            case 0:
                Iterator it = (Iterator) this.f76671g;
                Iterator it2 = (Iterator) this.f76670f;
                if (it2.hasNext()) {
                    return it2.next();
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!((Set) this.f76672h).contains(next)) {
                        return next;
                    }
                }
                this.f76111b = 3;
                return null;
            case 1:
                xe xeVar = (xe) this.f76671g;
                if (!((zi) this.f76672h).f76835e.f76828c.g((v2) this.f76670f)) {
                    v2 v2Var = (v2) this.f76670f;
                    r2 r2Var = r2.f76594c;
                    if (v2Var != r2Var) {
                        x7 x7Var = (x7) xeVar;
                        if (x7Var.hasNext()) {
                            ze zeVar2 = (ze) x7Var.next();
                            zeVar = new ze((v2) this.f76670f, zeVar2.f76827b);
                            this.f76670f = zeVar2.f76828c;
                        } else {
                            zeVar = new ze((v2) this.f76670f, r2Var);
                            this.f76670f = r2Var;
                        }
                        return ec.immutableEntry(zeVar.f76827b, zeVar);
                    }
                }
                this.f76111b = 3;
                return null;
            case 2:
                ze zeVar3 = ((zi) this.f76672h).f76835e;
                x7 x7Var2 = (x7) this.f76671g;
                v2 v2Var2 = (v2) this.f76670f;
                t2 t2Var = t2.f76651c;
                if (v2Var2 == t2Var) {
                    this.f76111b = 3;
                    return null;
                }
                if (x7Var2.hasNext()) {
                    ze zeVar4 = (ze) x7Var2.next();
                    ze zeVar5 = new ze(zeVar4.f76828c, (v2) this.f76670f);
                    this.f76670f = zeVar4.f76827b;
                    v2 v2Var3 = zeVar3.f76827b;
                    v2 v2Var4 = zeVar5.f76827b;
                    if (v2Var3.g(v2Var4)) {
                        return ec.immutableEntry(v2Var4, zeVar5);
                    }
                } else if (zeVar3.f76827b.g(t2Var)) {
                    ze zeVar6 = new ze(t2Var, (v2) this.f76670f);
                    this.f76670f = t2Var;
                    return ec.immutableEntry(t2Var, zeVar6);
                }
                this.f76111b = 3;
                return null;
            default:
                Iterator it3 = (Iterator) this.f76670f;
                if (!it3.hasNext()) {
                    this.f76111b = 3;
                    return null;
                }
                ze zeVar7 = (ze) it3.next();
                if (((v2) this.f76671g).g(zeVar7.f76827b)) {
                    this.f76111b = 3;
                    return null;
                }
                ze zeVarIntersection = zeVar7.intersection(((cj) this.f76672h).f76162c);
                return ec.immutableEntry(zeVarIntersection.f76827b, zeVarIntersection);
        }
    }

    public tf(cj cjVar, Iterator it, v2 v2Var) {
        this.f76669e = 3;
        this.f76670f = it;
        this.f76671g = v2Var;
        this.f76672h = cjVar;
    }

    public tf(Set set, Set set2) {
        this.f76669e = 0;
        this.f76672h = set;
        this.f76670f = set.iterator();
        this.f76671g = set2.iterator();
    }
}
