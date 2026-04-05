package com.ironsource;

import com.ironsource.C3385p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    private final int f34682a;

    /* renamed from: b, reason: collision with root package name */
    private final List<H> f34683b = new CopyOnWriteArrayList();

    public J(int i10) {
        this.f34682a = i10;
    }

    private final boolean b() {
        return this.f34682a == 0;
    }

    private final boolean c() {
        return this.f34682a != -1;
    }

    public final void a(H h10) {
        if (b()) {
            return;
        }
        if (a()) {
            uu.v0.removeFirstOrNull(this.f34683b);
        }
        if (h10 == null) {
            h10 = new H(C3385p0.a.NotPartOfWaterfall);
        }
        this.f34683b.add(h10);
    }

    public final String d() {
        List<H> list = this.f34683b;
        ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((H) it.next()).b().ordinal()));
        }
        return uu.y0.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
    }

    private final boolean a() {
        return c() && this.f34683b.size() >= this.f34682a;
    }
}
