package p8;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j0 implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f80778b;

    public j0(ArrayList arrayList) {
        this.f80778b = arrayList;
    }

    @Override // java.lang.Iterable
    public Iterator<i0> iterator() {
        return this.f80778b.iterator();
    }
}
