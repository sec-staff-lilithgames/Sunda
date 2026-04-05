package rv;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends uu.b {

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f84980e;

    /* renamed from: f, reason: collision with root package name */
    public final kv.l f84981f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f84982g;

    public b(Iterator<Object> source, kv.l keySelector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(keySelector, "keySelector");
        this.f84980e = source;
        this.f84981f = keySelector;
        this.f84982g = new HashSet();
    }

    @Override // uu.b
    public final void a() {
        Object next;
        do {
            Iterator it = this.f84980e;
            if (!it.hasNext()) {
                this.f88703b = 2;
                return;
            } else {
                next = it.next();
            }
        } while (!this.f84982g.add(this.f84981f.invoke(next)));
        this.f88704c = next;
        this.f88703b = 1;
    }
}
