package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f71830a;

    public f1(int i10) {
        this.f71830a = new ArrayList(i10);
    }

    public void add(Object obj) {
        this.f71830a.add(obj);
    }

    public void addSpread(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z10 = obj instanceof Object[];
        ArrayList arrayList = this.f71830a;
        if (z10) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    public int size() {
        return this.f71830a.size();
    }

    public Object[] toArray(Object[] objArr) {
        return this.f71830a.toArray(objArr);
    }
}
