package s0;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface j extends d, h {
    @Override // java.util.List, java.util.Collection, s0.h
    /* synthetic */ h add(Object obj);

    @Override // java.util.List
    j add(int i10, Object obj);

    @Override // java.util.List, java.util.Collection, s0.h
    j add(Object obj);

    @Override // java.util.List, java.util.Collection, s0.h
    /* synthetic */ h addAll(Collection collection);

    @Override // java.util.List
    j addAll(int i10, Collection<Object> collection);

    @Override // java.util.List, java.util.Collection, s0.h
    j addAll(Collection<Object> collection);

    @Override // s0.h
    /* synthetic */ g builder();

    @Override // s0.h
    i builder();

    @Override // java.util.List, java.util.Collection, s0.h
    /* synthetic */ h clear();

    @Override // java.util.List, java.util.Collection, s0.h
    j clear();

    @Override // java.util.List, java.util.Collection, s0.h
    /* synthetic */ h remove(Object obj);

    @Override // java.util.List, java.util.Collection, s0.h
    j remove(Object obj);

    @Override // java.util.List, java.util.Collection, s0.h
    /* synthetic */ h removeAll(Collection collection);

    @Override // s0.h
    /* synthetic */ h removeAll(kv.l lVar);

    @Override // java.util.List, java.util.Collection, s0.h
    j removeAll(Collection<Object> collection);

    @Override // s0.h
    j removeAll(kv.l lVar);

    j removeAt(int i10);

    @Override // java.util.List, java.util.Collection, s0.h
    /* synthetic */ h retainAll(Collection collection);

    @Override // java.util.List, java.util.Collection, s0.h
    j retainAll(Collection<Object> collection);

    @Override // java.util.List
    j set(int i10, Object obj);

    @Override // s0.d
    /* bridge */ /* synthetic */ default List subList(int i10, int i11) {
        return super.subList(i10, i11);
    }

    @Override // s0.d, java.util.List
    /* bridge */ /* synthetic */ default d subList(int i10, int i11) {
        return super.subList(i10, i11);
    }
}
