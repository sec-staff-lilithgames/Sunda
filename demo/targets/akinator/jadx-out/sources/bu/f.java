package bu;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public Object f10288b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f10289c;

    public f(g gVar) {
        this.f10289c = gVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        this.f10288b = this.f10289c.f10325c;
        return !iu.u.isComplete(r0);
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            if (this.f10288b == null) {
                this.f10288b = this.f10289c.f10325c;
            }
            if (iu.u.isComplete(this.f10288b)) {
                throw new NoSuchElementException();
            }
            if (iu.u.isError(this.f10288b)) {
                throw iu.m.wrapOrThrow(iu.u.getError(this.f10288b));
            }
            Object value = iu.u.getValue(this.f10288b);
            this.f10288b = null;
            return value;
        } catch (Throwable th2) {
            this.f10288b = null;
            throw th2;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Read only iterator");
    }
}
