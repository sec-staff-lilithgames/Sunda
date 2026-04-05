package sh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import nh.b5;
import nh.p8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class f0 extends z {

    /* renamed from: r, reason: collision with root package name */
    public List f85804r;

    public f0(b5 b5Var, boolean z10) {
        super(b5Var, z10, true);
        List listNewArrayListWithCapacity = b5Var.isEmpty() ? Collections.EMPTY_LIST : p8.newArrayListWithCapacity(b5Var.size());
        for (int i10 = 0; i10 < b5Var.size(); i10++) {
            listNewArrayListWithCapacity.add(null);
        }
        this.f85804r = listNewArrayListWithCapacity;
        r();
    }

    public /* bridge */ Object combine(List list) {
        return m7004combine((List<g0>) list);
    }

    @Override // sh.z
    public final void n(int i10, Object obj) {
        List list = this.f85804r;
        if (list != null) {
            list.set(i10, new g0(obj));
        }
    }

    @Override // sh.z
    public final void p() {
        List list = this.f85804r;
        if (list != null) {
            set(combine(list));
        }
    }

    @Override // sh.z
    public final void t(y yVar) {
        mh.p1.checkNotNull(yVar);
        this.f85887n = null;
        this.f85804r = null;
    }

    /* renamed from: combine, reason: collision with other method in class */
    public List<Object> m7004combine(List<g0> list) {
        ArrayList arrayListNewArrayListWithCapacity = p8.newArrayListWithCapacity(list.size());
        Iterator<g0> it = list.iterator();
        while (it.hasNext()) {
            g0 next = it.next();
            arrayListNewArrayListWithCapacity.add(next != null ? next.f85810a : null);
        }
        return Collections.unmodifiableList(arrayListNewArrayListWithCapacity);
    }
}
