package b1;

import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b0 implements Set, lv.h {

    /* renamed from: b, reason: collision with root package name */
    public final i0 f8575b;

    public b0(i0 i0Var) {
        this.f8575b = i0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f8575b.clear();
    }

    public final i0 getMap() {
        return this.f8575b;
    }

    public int getSize() {
        return this.f8575b.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f8575b.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.t.toArray(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.t.toArray(this, tArr);
    }
}
