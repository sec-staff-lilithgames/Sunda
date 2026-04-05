package vw;

import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class o4 implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final l3 f90038b;

    /* renamed from: c, reason: collision with root package name */
    public final Constructor f90039c;

    /* renamed from: e, reason: collision with root package name */
    public final Class f90040e;

    public o4(o4 o4Var) {
        this(o4Var.f90039c, o4Var.f90040e);
    }

    public void add(i3 i3Var) {
        Object key = i3Var.getKey();
        if (key != null) {
            this.f90038b.put(key, i3Var);
        }
    }

    public boolean contains(Object obj) {
        return this.f90038b.containsKey(obj);
    }

    public o4 copy() throws Exception {
        o4 o4Var = new o4(this);
        Iterator<i3> it = iterator();
        while (it.hasNext()) {
            o4Var.add(it.next());
        }
        return o4Var;
    }

    public Object create() throws Exception {
        Constructor constructor = this.f90039c;
        if (!constructor.isAccessible()) {
            constructor.setAccessible(true);
        }
        return constructor.newInstance(null);
    }

    public i3 get(int i10) {
        return this.f90038b.get(i10);
    }

    public List<i3> getAll() {
        return this.f90038b.getAll();
    }

    public Class getType() {
        return this.f90040e;
    }

    public boolean isEmpty() {
        return this.f90038b.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<i3> iterator() {
        return this.f90038b.iterator();
    }

    public i3 remove(Object obj) {
        return (i3) this.f90038b.remove(obj);
    }

    public void set(Object obj, i3 i3Var) {
        this.f90038b.put(obj, i3Var);
    }

    public int size() {
        return this.f90038b.size();
    }

    public String toString() {
        return this.f90039c.toString();
    }

    public o4(Constructor constructor) {
        this(constructor, constructor.getDeclaringClass());
    }

    public i3 get(Object obj) {
        return (i3) this.f90038b.get(obj);
    }

    public o4(Constructor constructor, Class cls) {
        this.f90038b = new l3();
        this.f90039c = constructor;
        this.f90040e = cls;
    }

    public Object create(Object[] objArr) throws Exception {
        Constructor constructor = this.f90039c;
        if (!constructor.isAccessible()) {
            constructor.setAccessible(true);
        }
        return constructor.newInstance(objArr);
    }
}
