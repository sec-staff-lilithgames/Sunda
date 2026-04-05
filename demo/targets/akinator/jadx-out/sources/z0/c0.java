package z0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p0.i4;
import p0.j4;
import p0.k3;
import p0.k4;
import p0.u5;
import z.m1;
import z.o1;
import z.p1;
import z.u0;
import z.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c0 implements i4 {

    /* renamed from: a, reason: collision with root package name */
    public Set f97021a;

    /* renamed from: b, reason: collision with root package name */
    public d1.f f97022b;

    /* renamed from: c, reason: collision with root package name */
    public final r0.c f97023c;

    /* renamed from: d, reason: collision with root package name */
    public v0 f97024d;

    /* renamed from: e, reason: collision with root package name */
    public r0.c f97025e;

    /* renamed from: f, reason: collision with root package name */
    public final r0.c f97026f;

    /* renamed from: g, reason: collision with root package name */
    public final r0.c f97027g;

    /* renamed from: h, reason: collision with root package name */
    public v0 f97028h;

    /* renamed from: i, reason: collision with root package name */
    public u0 f97029i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f97030j;

    /* renamed from: k, reason: collision with root package name */
    public o1 f97031k;

    public c0() {
        r0.c cVar = new r0.c(new k4[16], 0);
        this.f97023c = cVar;
        this.f97024d = p1.mutableScatterSetOf();
        this.f97025e = cVar;
        this.f97026f = new r0.c(new Object[16], 0);
        this.f97027g = new r0.c(new kv.a[16], 0);
    }

    public static final boolean a(k4 k4Var, r0.c cVar) {
        Object[] objArr = cVar.f83647b;
        int size = cVar.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            j4 wrapped = ((k4) objArr[i10]).getWrapped();
            if (wrapped instanceof x) {
                r0.c pausedRemembers = ((x) wrapped).getPausedRemembers();
                if (pausedRemembers.remove(k4Var) || a(k4Var, pausedRemembers)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void clear() {
        this.f97021a = null;
        this.f97022b = null;
        r0.c cVar = this.f97023c;
        cVar.clear();
        this.f97024d.clear();
        this.f97025e = cVar;
        this.f97026f.clear();
        this.f97027g.clear();
        this.f97028h = null;
        this.f97029i = null;
        this.f97030j = null;
    }

    @Override // p0.i4
    public void deactivating(p0.q qVar) {
        this.f97026f.add(qVar);
    }

    public final void dispatchAbandons() {
        Set set = this.f97021a;
        if (set == null || set.isEmpty()) {
            return;
        }
        j0 j0Var = j0.f97136a;
        Object objBeginSection = j0Var.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                j4 j4Var = (j4) it.next();
                it.remove();
                j4Var.onAbandoned();
            }
        } finally {
            j0Var.endSection(objBeginSection);
        }
    }

    public final void dispatchOnDeactivateIfNecessary(p0.q qVar) {
        if (this.f97026f.remove(qVar)) {
            qVar.a();
        }
    }

    public final void dispatchRememberObservers() {
        Object objBeginSection;
        Set set = this.f97021a;
        if (set == null) {
            return;
        }
        this.f97031k = null;
        r0.c cVar = this.f97026f;
        int size = cVar.getSize();
        j0 j0Var = j0.f97136a;
        if (size != 0) {
            objBeginSection = j0Var.beginSection("Compose:onForgotten");
            try {
                int size2 = cVar.getSize();
                while (true) {
                    size2--;
                    if (-1 >= size2) {
                        break;
                    }
                    Object obj = cVar.f83647b[size2];
                    try {
                        if (obj instanceof k4) {
                            j4 wrapped = ((k4) obj).getWrapped();
                            set.remove(wrapped);
                            wrapped.onForgotten();
                        }
                    } finally {
                    }
                }
            } finally {
            }
        }
        r0.c cVar2 = this.f97023c;
        if (cVar2.getSize() != 0) {
            objBeginSection = j0Var.beginSection("Compose:onRemembered");
            try {
                Set set2 = this.f97021a;
                if (set2 != null) {
                    Object[] objArr = cVar2.f83647b;
                    int size3 = cVar2.getSize();
                    for (int i10 = 0; i10 < size3; i10++) {
                        j4 wrapped2 = ((k4) objArr[i10]).getWrapped();
                        set2.remove(wrapped2);
                        try {
                            wrapped2.onRemembered();
                        } finally {
                        }
                    }
                }
            } finally {
                j0Var.endSection(objBeginSection);
            }
        }
    }

    public final void dispatchSideEffects() {
        r0.c cVar = this.f97027g;
        if (cVar.getSize() != 0) {
            j0 j0Var = j0.f97136a;
            Object objBeginSection = j0Var.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = cVar.f83647b;
                int size = cVar.getSize();
                for (int i10 = 0; i10 < size; i10++) {
                    ((kv.a) objArr[i10]).invoke();
                }
                cVar.clear();
                j0Var.endSection(objBeginSection);
            } catch (Throwable th2) {
                j0Var.endSection(objBeginSection);
                throw th2;
            }
        }
    }

    @Override // p0.i4
    public void endResumingScope(k3 k3Var) {
        r0.c cVar;
        u0 u0Var = this.f97029i;
        if (u0Var == null || ((x) u0Var.get(k3Var)) == null) {
            return;
        }
        ArrayList arrayList = this.f97030j;
        if (arrayList != null && (cVar = (r0.c) u5.m5850popimpl(arrayList)) != null) {
            this.f97025e = cVar;
        }
        u0Var.remove(k3Var);
    }

    public final o1 extractRememberSet() {
        if (!this.f97024d.isNotEmpty()) {
            return null;
        }
        v0 v0Var = this.f97024d;
        this.f97024d = p1.mutableScatterSetOf();
        this.f97023c.clear();
        return v0Var;
    }

    @Override // p0.i4
    public void forgetting(k4 k4Var) {
        if (this.f97024d.contains(k4Var)) {
            this.f97024d.remove(k4Var);
            if (!this.f97025e.remove(k4Var)) {
                r0.c cVar = this.f97023c;
                if (!cVar.remove(k4Var)) {
                    a(k4Var, cVar);
                }
            }
            Set set = this.f97021a;
            if (set == null) {
                return;
            } else {
                set.add(k4Var.getWrapped());
            }
        }
        o1 o1Var = this.f97031k;
        if (o1Var == null || !o1Var.contains(k4Var)) {
            this.f97026f.add(k4Var);
        }
    }

    public final void ignoreForgotten(o1 o1Var) {
        this.f97031k = o1Var;
    }

    public final void prepare(Set<j4> set, d1.f fVar) {
        clear();
        this.f97021a = set;
        this.f97022b = fVar;
    }

    @Override // p0.i4
    public void releasing(p0.q qVar) {
        v0 v0VarMutableScatterSetOf = this.f97028h;
        if (v0VarMutableScatterSetOf == null) {
            v0VarMutableScatterSetOf = p1.mutableScatterSetOf();
            this.f97028h = v0VarMutableScatterSetOf;
        }
        v0VarMutableScatterSetOf.plusAssign(qVar);
        this.f97026f.add(qVar);
    }

    @Override // p0.i4
    public void rememberPausingScope(k3 k3Var) {
        Set set = this.f97021a;
        if (set == null) {
            return;
        }
        x xVar = new x(set);
        u0 u0VarMutableScatterMapOf = this.f97029i;
        if (u0VarMutableScatterMapOf == null) {
            u0VarMutableScatterMapOf = m1.mutableScatterMapOf();
            this.f97029i = u0VarMutableScatterMapOf;
        }
        u0VarMutableScatterMapOf.set(k3Var, xVar);
        this.f97025e.add(new k4(xVar, null));
    }

    @Override // p0.i4
    public void remembering(k4 k4Var) {
        this.f97025e.add(k4Var);
        this.f97024d.add(k4Var);
    }

    @Override // p0.i4
    public void sideEffect(kv.a aVar) {
        this.f97027g.add(aVar);
    }

    @Override // p0.i4
    public void startResumingScope(k3 k3Var) {
        u0 u0Var = this.f97029i;
        x xVar = u0Var != null ? (x) u0Var.get(k3Var) : null;
        if (xVar != null) {
            ArrayList arrayListM5841constructorimpl$default = this.f97030j;
            if (arrayListM5841constructorimpl$default == null) {
                arrayListM5841constructorimpl$default = u5.m5841constructorimpl$default(null, 1, null);
                this.f97030j = arrayListM5841constructorimpl$default;
            }
            u5.m5851pushimpl(arrayListM5841constructorimpl$default, this.f97025e);
            this.f97025e = xVar.getPausedRemembers();
        }
    }

    public final void use(Set<j4> set, d1.f fVar, kv.l lVar) {
        try {
            prepare(set, fVar);
            lVar.invoke(this);
        } finally {
            kotlin.jvm.internal.b0.finallyStart(1);
            clear();
            kotlin.jvm.internal.b0.finallyEnd(1);
        }
    }
}
