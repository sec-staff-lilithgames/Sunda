package uu;

import java.util.AbstractList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class o extends AbstractList implements List, lv.d {
    @Override // java.util.AbstractList, java.util.List
    public abstract void add(int i10, Object obj);

    public abstract int getSize();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i10) {
        return removeAt(i10);
    }

    public abstract Object removeAt(int i10);

    @Override // java.util.AbstractList, java.util.List
    public abstract Object set(int i10, Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }
}
