package b1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class t0 {

    /* renamed from: b, reason: collision with root package name */
    public final i0 f8685b;

    /* renamed from: c, reason: collision with root package name */
    public final Iterator f8686c;

    /* renamed from: e, reason: collision with root package name */
    public int f8687e;

    /* renamed from: f, reason: collision with root package name */
    public Map.Entry f8688f;

    /* renamed from: g, reason: collision with root package name */
    public Map.Entry f8689g;

    public t0(i0 i0Var, Iterator<? extends Map.Entry<Object, Object>> it) {
        this.f8685b = i0Var;
        this.f8686c = it;
        this.f8687e = i0Var.getModification$runtime();
        a();
    }

    public final void a() {
        this.f8688f = this.f8689g;
        Iterator it = this.f8686c;
        this.f8689g = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    public final Iterator<Map.Entry<Object, Object>> getIterator() {
        return this.f8686c;
    }

    public final i0 getMap() {
        return this.f8685b;
    }

    public final boolean hasNext() {
        return this.f8689g != null;
    }

    public final void remove() {
        if (getMap().getModification$runtime() != this.f8687e) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.f8688f;
        if (entry == null) {
            throw new IllegalStateException();
        }
        this.f8685b.remove(entry.getKey());
        this.f8688f = null;
        this.f8687e = getMap().getModification$runtime();
    }
}
