package uu;

import java.util.AbstractCollection;
import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class n extends AbstractCollection implements Collection, lv.b {
    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean add(Object obj);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }
}
