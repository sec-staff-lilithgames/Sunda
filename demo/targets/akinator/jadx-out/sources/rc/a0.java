package rc;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a0 implements dd.b {

    /* renamed from: b, reason: collision with root package name */
    public HashMap f84105b;

    public a0() {
    }

    public static a0 merge(a0 a0Var, a0 a0Var2) {
        HashMap map;
        HashMap map2;
        if (a0Var == null || (map = a0Var.f84105b) == null || map.isEmpty()) {
            return a0Var2;
        }
        if (a0Var2 == null || (map2 = a0Var2.f84105b) == null || map2.isEmpty()) {
            return a0Var;
        }
        HashMap map3 = new HashMap();
        for (Annotation annotation : a0Var2.f84105b.values()) {
            map3.put(annotation.annotationType(), annotation);
        }
        for (Annotation annotation2 : a0Var.f84105b.values()) {
            map3.put(annotation2.annotationType(), annotation2);
        }
        return new a0(map3);
    }

    public static a0 of(Class<?> cls, Annotation annotation) {
        HashMap map = new HashMap(4);
        map.put(cls, annotation);
        return new a0(map);
    }

    public final boolean a(Annotation annotation) {
        if (this.f84105b == null) {
            this.f84105b = new HashMap();
        }
        Annotation annotation2 = (Annotation) this.f84105b.put(annotation.annotationType(), annotation);
        return annotation2 == null || !annotation2.equals(annotation);
    }

    public boolean add(Annotation annotation) {
        return a(annotation);
    }

    public boolean addIfNotPresent(Annotation annotation) {
        HashMap map = this.f84105b;
        if (map != null && map.containsKey(annotation.annotationType())) {
            return false;
        }
        a(annotation);
        return true;
    }

    public Iterable<Annotation> annotations() {
        HashMap map = this.f84105b;
        return (map == null || map.size() == 0) ? Collections.EMPTY_LIST : this.f84105b.values();
    }

    @Override // dd.b
    public <A extends Annotation> A get(Class<A> cls) {
        HashMap map = this.f84105b;
        if (map == null) {
            return null;
        }
        return (A) map.get(cls);
    }

    @Override // dd.b
    public boolean has(Class<?> cls) {
        HashMap map = this.f84105b;
        if (map == null) {
            return false;
        }
        return map.containsKey(cls);
    }

    @Override // dd.b
    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        if (this.f84105b != null) {
            for (Class<? extends Annotation> cls : clsArr) {
                if (this.f84105b.containsKey(cls)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // dd.b
    public int size() {
        HashMap map = this.f84105b;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public String toString() {
        HashMap map = this.f84105b;
        return map == null ? "[null]" : map.toString();
    }

    public a0(HashMap map) {
        this.f84105b = map;
    }
}
