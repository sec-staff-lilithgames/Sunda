package com.explorestack.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h8 extends j8 {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f22203c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(Object obj, long j10, int i10) {
        List list = (List) sc.f22643c.getObject(obj, j10);
        if (list.isEmpty()) {
            List f8Var = list instanceof g8 ? new f8(i10) : ((list instanceof ga) && (list instanceof w7)) ? ((w7) list).mutableCopyWithCapacity(i10) : new ArrayList(i10);
            sc.s(obj, j10, f8Var);
            return f8Var;
        }
        if (f22203c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i10);
            arrayList.addAll(list);
            sc.s(obj, j10, arrayList);
            return arrayList;
        }
        if (list instanceof mc) {
            f8 f8Var2 = new f8(list.size() + i10);
            f8Var2.addAll((mc) list);
            sc.s(obj, j10, f8Var2);
            return f8Var2;
        }
        if ((list instanceof ga) && (list instanceof w7)) {
            w7 w7Var = (w7) list;
            if (!w7Var.isModifiable()) {
                w7 w7VarMutableCopyWithCapacity = w7Var.mutableCopyWithCapacity(list.size() + i10);
                sc.s(obj, j10, w7VarMutableCopyWithCapacity);
                return w7VarMutableCopyWithCapacity;
            }
        }
        return list;
    }

    @Override // com.explorestack.protobuf.j8
    public final void a(Object obj, long j10) {
        Object objUnmodifiableList;
        List list = (List) sc.f22643c.getObject(obj, j10);
        if (list instanceof g8) {
            objUnmodifiableList = ((g8) list).getUnmodifiableView();
        } else {
            if (f22203c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof ga) && (list instanceof w7)) {
                w7 w7Var = (w7) list;
                if (w7Var.isModifiable()) {
                    w7Var.makeImmutable();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        sc.s(obj, j10, objUnmodifiableList);
    }

    @Override // com.explorestack.protobuf.j8
    public final void b(Object obj, Object obj2, long j10) {
        List list = (List) sc.f22643c.getObject(obj2, j10);
        List listD = d(obj, j10, list.size());
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        sc.s(obj, j10, list);
    }

    @Override // com.explorestack.protobuf.j8
    public final List c(Object obj, long j10) {
        return d(obj, j10, 10);
    }
}
