package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6576a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f6577b;

    public g(HashMap map) {
        this.f6577b = map;
        for (Map.Entry entry : map.entrySet()) {
            i0 i0Var = (i0) entry.getValue();
            List arrayList = (List) this.f6576a.get(i0Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f6576a.put(i0Var, arrayList);
            }
            arrayList.add((h) entry.getKey());
        }
    }

    public static void a(List list, b1 b1Var, i0 i0Var, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                h hVar = (h) list.get(size);
                Method method = hVar.f6588b;
                try {
                    int i10 = hVar.f6587a;
                    if (i10 == 0) {
                        method.invoke(obj, null);
                    } else if (i10 == 1) {
                        method.invoke(obj, b1Var);
                    } else if (i10 == 2) {
                        method.invoke(obj, b1Var, i0Var);
                    }
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException("Failed to call observer method", e11.getCause());
                }
            }
        }
    }
}
