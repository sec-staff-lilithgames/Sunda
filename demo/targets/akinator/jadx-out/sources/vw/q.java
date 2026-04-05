package vw;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class q implements p0 {

    /* renamed from: b, reason: collision with root package name */
    public final p f90050b = new p();

    /* renamed from: c, reason: collision with root package name */
    public final p f90051c = new p();

    @Override // vw.p0
    public void commit(Object obj) throws Exception {
        for (V v10 : this.f90050b.values()) {
            v10.getContact().set(obj, v10.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vw.p0
    public l5 get(Object obj) {
        return (l5) this.f90050b.get(obj);
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        return this.f90050b.iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vw.p0
    public l5 remove(Object obj) throws Exception {
        return (l5) this.f90050b.remove(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vw.p0
    public l5 resolve(String str) {
        return (l5) this.f90051c.get(str);
    }

    @Override // vw.p0
    public void set(i2 i2Var, Object obj) throws Exception {
        l5 l5Var = new l5(i2Var, obj);
        if (i2Var != null) {
            String[] paths = i2Var.getPaths();
            Object key = i2Var.getKey();
            for (String str : paths) {
                this.f90051c.put(str, l5Var);
            }
            this.f90050b.put(key, l5Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vw.p0
    public l5 get(i2 i2Var) throws Exception {
        if (i2Var == null) {
            return null;
        }
        return (l5) this.f90050b.get(i2Var.getKey());
    }
}
