package rc;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final Map f84241b;

    public p() {
    }

    public m find(String str, Class<?>[] clsArr) {
        Map map = this.f84241b;
        if (map == null) {
            return null;
        }
        return (m) map.get(new p0(str, clsArr));
    }

    @Override // java.lang.Iterable
    public Iterator<m> iterator() {
        Map map = this.f84241b;
        return map == null ? Collections.emptyIterator() : map.values().iterator();
    }

    public int size() {
        Map map = this.f84241b;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public p(Map<p0, m> map) {
        this.f84241b = map;
    }

    public m find(Method method) {
        Map map = this.f84241b;
        if (map == null) {
            return null;
        }
        return (m) map.get(new p0(method));
    }
}
