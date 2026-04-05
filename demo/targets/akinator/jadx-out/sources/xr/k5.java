package xr;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class k5 {

    /* renamed from: a, reason: collision with root package name */
    public final Set f92731a = Collections.newSetFromMap(new IdentityHashMap());

    public abstract void a();

    public final boolean anyObjectInUse(Object... objArr) {
        for (Object obj : objArr) {
            if (this.f92731a.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract void b();

    public final boolean isInUse() {
        return !this.f92731a.isEmpty();
    }

    public final void updateObjectInUse(Object obj, boolean z10) {
        Set set = this.f92731a;
        int size = set.size();
        if (z10) {
            set.add(obj);
            if (size == 0) {
                a();
                return;
            }
            return;
        }
        if (set.remove(obj) && size == 1) {
            b();
        }
    }
}
