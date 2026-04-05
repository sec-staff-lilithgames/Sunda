package rc;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class e1 implements e0, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final e0 f84171b;

    /* renamed from: c, reason: collision with root package name */
    public Map f84172c;

    public e1(e0 e0Var) {
        this.f84171b = e0Var;
    }

    public void addLocalDefinition(Class<?> cls, Class<?> cls2) {
        if (this.f84172c == null) {
            this.f84172c = new HashMap();
        }
        this.f84172c.put(new cd.b(cls), cls2);
    }

    @Override // rc.e0
    public Class<?> findMixInClassFor(Class<?> cls) {
        Map map;
        e0 e0Var = this.f84171b;
        Class<?> clsFindMixInClassFor = e0Var == null ? null : e0Var.findMixInClassFor(cls);
        return (clsFindMixInClassFor != null || (map = this.f84172c) == null) ? clsFindMixInClassFor : (Class) map.get(new cd.b(cls));
    }

    public boolean hasMixIns() {
        if (this.f84172c != null) {
            return true;
        }
        e0 e0Var = this.f84171b;
        if (e0Var == null) {
            return false;
        }
        if (e0Var instanceof e1) {
            return ((e1) e0Var).hasMixIns();
        }
        return true;
    }

    public int localSize() {
        Map map = this.f84172c;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public void setLocalDefinitions(Map<Class<?>, Class<?>> map) {
        if (map == null || map.isEmpty()) {
            this.f84172c = null;
            return;
        }
        HashMap map2 = new HashMap(map.size());
        for (Map.Entry<Class<?>, Class<?>> entry : map.entrySet()) {
            map2.put(new cd.b(entry.getKey()), entry.getValue());
        }
        this.f84172c = map2;
    }

    public e1 withOverrides(e0 e0Var) {
        return new e1(e0Var, this.f84172c);
    }

    public e1 withoutLocalDefinitions() {
        return new e1(this.f84171b, null);
    }

    @Override // rc.e0
    public e1 copy() {
        e0 e0Var = this.f84171b;
        return new e1(e0Var == null ? null : e0Var.copy(), this.f84172c != null ? new HashMap(this.f84172c) : null);
    }

    public e1(e0 e0Var, Map map) {
        this.f84171b = e0Var;
        this.f84172c = map;
    }
}
