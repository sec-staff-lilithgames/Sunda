package nh;

import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b8 extends z {
    public static <E> b8 create() {
        return create(3);
    }

    @Override // nh.h0, java.util.AbstractCollection, java.util.Collection, nh.ud
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // nh.h0, nh.ud
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // nh.h0, nh.ud
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // nh.h0, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public static <E> b8 create(int i10) {
        b8 b8Var = new b8();
        b8Var.f76801e = new se(i10);
        return b8Var;
    }

    public static <E> b8 create(Iterable<? extends E> iterable) {
        b8 b8VarCreate = create(iterable instanceof ud ? ((ud) iterable).elementSet().size() : 11);
        i7.addAll(b8VarCreate, iterable);
        return b8VarCreate;
    }
}
