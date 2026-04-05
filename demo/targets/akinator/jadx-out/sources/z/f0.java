package z;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f0 implements Iterator, lv.c {

    /* renamed from: b, reason: collision with root package name */
    public Iterator f96809b;

    /* renamed from: c, reason: collision with root package name */
    public int f96810c = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0 f96811e;

    public f0(g0 g0Var) {
        this.f96811e = g0Var;
        this.f96809b = rv.w.iterator(new e0(g0Var, this, null));
    }

    public final int getCurrent() {
        return this.f96810c;
    }

    public final Iterator<Map.Entry<Object, Object>> getIterator() {
        return this.f96809b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f96809b.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.f96810c != -1) {
            this.f96811e.f96818b.removeValueAt(this.f96810c);
            this.f96810c = -1;
        }
    }

    public final void setCurrent(int i10) {
        this.f96810c = i10;
    }

    public final void setIterator(Iterator<? extends Map.Entry<Object, Object>> it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "<set-?>");
        this.f96809b = it;
    }

    @Override // java.util.Iterator
    public Map.Entry<Object, Object> next() {
        return (Map.Entry) this.f96809b.next();
    }
}
