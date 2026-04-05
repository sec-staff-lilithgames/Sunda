package a2;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z4 implements rv.t {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3903a = new ArrayList();

    @Override // rv.t
    public Iterator<y4> iterator() {
        return this.f3903a.iterator();
    }

    public final void set(String name, Object obj) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        this.f3903a.add(new y4(name, obj));
    }
}
