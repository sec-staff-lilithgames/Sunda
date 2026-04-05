package vw;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class z1 implements y1 {

    /* renamed from: a, reason: collision with root package name */
    public final Annotation f90260a;

    /* renamed from: b, reason: collision with root package name */
    public final a f90261b;

    /* renamed from: c, reason: collision with root package name */
    public final m2 f90262c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends LinkedHashMap implements Iterable {

        /* renamed from: b, reason: collision with root package name */
        public final m2 f90263b;

        /* renamed from: c, reason: collision with root package name */
        public e5 f90264c;

        public a(m2 m2Var) {
            this.f90263b = m2Var;
        }

        public boolean isText() {
            return this.f90264c != null;
        }

        @Override // java.lang.Iterable
        public Iterator<i2> iterator() {
            return values().iterator();
        }

        public void register(Class cls, i2 i2Var) throws Exception {
            h hVar = new h(i2Var);
            String name = hVar.getName();
            m2 m2Var = this.f90263b;
            if (!m2Var.containsKey(name)) {
                m2Var.put(name, hVar);
            }
            if (!containsKey(cls)) {
                put(cls, hVar);
            }
            uw.q qVar = (uw.q) hVar.getContact().getAnnotation(uw.q.class);
            if (qVar != null) {
                this.f90264c = new e5(hVar, qVar);
            }
        }

        public i2 resolve(Class cls) {
            e5 e5Var = this.f90264c;
            if (e5Var == null || cls != String.class) {
                e5Var = null;
            }
            if (e5Var != null) {
                return e5Var;
            }
            while (cls != null) {
                i2 i2Var = (i2) get(cls);
                if (i2Var != null) {
                    return i2Var;
                }
                cls = cls.getSuperclass();
            }
            return null;
        }

        public i2 resolveText() {
            e5 e5Var = this.f90264c;
            if (e5Var != null) {
                return e5Var;
            }
            return null;
        }
    }

    public z1(i0 i0Var, Annotation annotation, yw.j jVar) throws Exception {
        r1 r1Var = new r1(i0Var, annotation, jVar);
        m2 m2Var = new m2();
        this.f90262c = m2Var;
        this.f90261b = new a(m2Var);
        this.f90260a = annotation;
        q1 r1Var2 = r1Var.getInstance();
        if (r1Var2 != null) {
            for (Annotation annotation2 : r1Var2.getAnnotations()) {
                i2 label = r1Var2.getLabel(annotation2);
                Class type = r1Var2.getType(annotation2);
                a aVar = this.f90261b;
                if (aVar != null) {
                    aVar.register(type, label);
                }
            }
        }
    }

    @Override // vw.y1
    public m2 getElements() throws Exception {
        return this.f90262c.getLabels();
    }

    @Override // vw.y1
    public i2 getLabel(Class cls) {
        return this.f90261b.resolve(cls);
    }

    public String[] getNames() throws Exception {
        return this.f90262c.getKeys();
    }

    public String[] getPaths() throws Exception {
        return this.f90262c.getPaths();
    }

    @Override // vw.y1
    public i2 getText() {
        return this.f90261b.resolveText();
    }

    public boolean isDeclared(Class cls) {
        return this.f90261b.containsKey(cls);
    }

    @Override // vw.y1
    public boolean isInline() {
        Iterator<i2> it = this.f90261b.iterator();
        while (it.hasNext()) {
            if (!it.next().isInline()) {
                return false;
            }
        }
        return !r0.isEmpty();
    }

    @Override // vw.y1
    public boolean isTextList() {
        return this.f90261b.isText();
    }

    public boolean isValid(Class cls) {
        return this.f90261b.resolve(cls) != null;
    }

    @Override // vw.y1
    public String toString() {
        return this.f90260a.toString();
    }
}
