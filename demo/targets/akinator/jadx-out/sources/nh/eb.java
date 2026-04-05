package nh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class eb extends oa {

    /* renamed from: h, reason: collision with root package name */
    public final Set f76221h;

    public eb(Map map, mh.q1 q1Var) {
        super(map, q1Var);
        this.f76221h = og.filter(map.entrySet(), this.f76531g);
    }

    public static boolean d(Map map, mh.q1 q1Var, Collection collection) {
        Iterator it = map.entrySet().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (q1Var.apply(entry) && collection.contains(entry.getKey())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean e(Map map, mh.q1 q1Var, Collection collection) {
        Iterator it = map.entrySet().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (q1Var.apply(entry) && !collection.contains(entry.getKey())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // nh.dc
    public final Set a() {
        return new cb(this);
    }

    @Override // nh.dc
    public Set createKeySet() {
        return new db(this);
    }
}
