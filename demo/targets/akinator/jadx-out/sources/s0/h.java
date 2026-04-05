package s0;

import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface h extends b {
    @Override // java.util.Collection
    h add(Object obj);

    @Override // java.util.Collection
    h addAll(Collection<Object> collection);

    g builder();

    @Override // java.util.Collection
    h clear();

    @Override // java.util.Collection
    h remove(Object obj);

    @Override // java.util.Collection
    h removeAll(Collection<Object> collection);

    h removeAll(kv.l lVar);

    @Override // java.util.Collection
    h retainAll(Collection<Object> collection);
}
