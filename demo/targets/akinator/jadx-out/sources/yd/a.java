package yd;

import a.b;
import android.util.SparseArray;
import java.util.HashMap;
import jd.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f94362a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f94363b;

    static {
        HashMap map = new HashMap();
        f94363b = map;
        map.put(h.f69502b, 0);
        map.put(h.f69503c, 1);
        map.put(h.f69504e, 2);
        for (h hVar : map.keySet()) {
            f94362a.append(((Integer) f94363b.get(hVar)).intValue(), hVar);
        }
    }

    public static int toInt(h hVar) {
        Integer num = (Integer) f94363b.get(hVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + hVar);
    }

    public static h valueOf(int i10) {
        h hVar = (h) f94362a.get(i10);
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalArgumentException(b.e(i10, "Unknown Priority for value "));
    }
}
