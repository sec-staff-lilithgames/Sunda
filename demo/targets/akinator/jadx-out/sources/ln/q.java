package ln;

import java.util.List;
import java.util.Map;
import java.util.Set;
import nh.ec;
import nh.g4;
import nh.ha;
import nh.og;
import nh.z7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class q extends g4 {

    /* renamed from: b, reason: collision with root package name */
    public final Map f73511b;

    public q(Map<String, List<String>> map) {
        this.f73511b = map;
    }

    @Override // nh.g4
    public final Map c() {
        return this.f73511b;
    }

    @Override // nh.g4, java.util.Map
    public boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // nh.g4, java.util.Map
    public boolean containsValue(Object obj) {
        return z7.contains(new ha(1, entrySet().iterator()), obj);
    }

    @Override // nh.l4
    public final Object delegate() {
        return this.f73511b;
    }

    @Override // nh.g4, java.util.Map
    public Set<Map.Entry<String, List<String>>> entrySet() {
        return og.filter(super.entrySet(), new p(0));
    }

    @Override // nh.g4, java.util.Map
    public boolean equals(Object obj) {
        return obj != null && ec.e(this, obj);
    }

    @Override // nh.g4, java.util.Map
    public int hashCode() {
        return og.b(entrySet());
    }

    @Override // nh.g4, java.util.Map
    public boolean isEmpty() {
        return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
    }

    @Override // nh.g4, java.util.Map
    public Set<String> keySet() {
        return og.filter(super.keySet(), new p(1));
    }

    @Override // nh.g4, java.util.Map
    public int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    @Override // nh.g4, java.util.Map
    public List<String> get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) super.get(obj);
    }
}
