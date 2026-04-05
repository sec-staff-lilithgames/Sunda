package vw;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class q4 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f90056a;

    /* renamed from: b, reason: collision with root package name */
    public final o4 f90057b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f90058c;

    public q4(o4 o4Var) {
        this.f90058c = o4Var.getType();
        this.f90056a = o4Var.getAll();
        this.f90057b = o4Var;
    }

    @Override // vw.o0
    public Object getInstance() throws Exception {
        return this.f90057b.create();
    }

    @Override // vw.o0
    public double getScore(p0 p0Var) throws Exception {
        o4 o4VarCopy = this.f90057b.copy();
        for (Object obj : p0Var) {
            i3 i3Var = o4VarCopy.get(obj);
            l5 l5Var = p0Var.get(obj);
            i0 contact = l5Var.getContact();
            if (i3Var != null && !v4.isAssignable(l5Var.getValue().getClass(), i3Var.getType())) {
                return -1.0d;
            }
            if (contact.isReadOnly() && i3Var == null) {
                return -1.0d;
            }
        }
        double d10 = 0.0d;
        for (i3 i3Var2 : this.f90056a) {
            if (p0Var.get(i3Var2.getKey()) != null) {
                d10 += 1.0d;
            } else if (i3Var2.isRequired() || i3Var2.isPrimitive()) {
                return -1.0d;
            }
        }
        return d10 > 0.0d ? (d10 / r0.size()) + (r0.size() / 1000.0d) : d10 / r0.size();
    }

    @Override // vw.o0
    public o4 getSignature() {
        return this.f90057b;
    }

    @Override // vw.o0
    public Class getType() {
        return this.f90058c;
    }

    public String toString() {
        return this.f90057b.toString();
    }

    @Override // vw.o0
    public Object getInstance(p0 p0Var) throws Exception {
        List list = this.f90056a;
        Object[] array = list.toArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            l5 l5VarRemove = p0Var.remove(((i3) list.get(i10)).getKey());
            array[i10] = l5VarRemove != null ? l5VarRemove.getValue() : null;
        }
        return this.f90057b.create(array);
    }
}
