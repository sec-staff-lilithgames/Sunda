package rv;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public Object f85046b;

    /* renamed from: c, reason: collision with root package name */
    public int f85047c = -2;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f85048e;

    public n(o oVar) {
        this.f85048e = oVar;
    }

    public final void a() {
        Object objInvoke;
        int i10 = this.f85047c;
        o oVar = this.f85048e;
        if (i10 == -2) {
            objInvoke = oVar.f85051a.invoke();
        } else {
            kv.l lVar = oVar.f85052b;
            Object obj = this.f85046b;
            kotlin.jvm.internal.e0.checkNotNull(obj);
            objInvoke = lVar.invoke(obj);
        }
        this.f85046b = objInvoke;
        this.f85047c = objInvoke == null ? 0 : 1;
    }

    public final Object getNextItem() {
        return this.f85046b;
    }

    public final int getNextState() {
        return this.f85047c;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f85047c < 0) {
            a();
        }
        return this.f85047c == 1;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.f85047c < 0) {
            a();
        }
        if (this.f85047c == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f85046b;
        kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f85047c = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setNextItem(Object obj) {
        this.f85046b = obj;
    }

    public final void setNextState(int i10) {
        this.f85047c = i10;
    }
}
