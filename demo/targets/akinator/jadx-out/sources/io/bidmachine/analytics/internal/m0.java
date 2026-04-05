package io.bidmachine.analytics.internal;

import android.database.sqlite.SQLiteOpenHelper;
import io.bidmachine.analytics.internal.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    private final SQLiteOpenHelper f60115a;

    /* renamed from: b, reason: collision with root package name */
    private final tu.o f60116b = tu.q.lazy(new a());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.a {
        public a() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i0 invoke() {
            return new i0(m0.this.f60115a);
        }
    }

    public m0(SQLiteOpenHelper sQLiteOpenHelper) {
        this.f60115a = sQLiteOpenHelper;
    }

    @Override // io.bidmachine.analytics.internal.l0
    public Object b(h0 h0Var) {
        return a().a(k0.a(h0Var));
    }

    @Override // io.bidmachine.analytics.internal.l0
    public Object c(List list) {
        i0 i0VarA = a();
        ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k0.a((h0) it.next()));
        }
        return i0VarA.d(arrayList);
    }

    private final i0 a() {
        return (i0) this.f60116b.getValue();
    }

    @Override // io.bidmachine.analytics.internal.l0
    public Object b(List list) {
        i0 i0VarA = a();
        ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k0.a((h0) it.next()));
        }
        return i0VarA.a(arrayList);
    }

    @Override // io.bidmachine.analytics.internal.l0
    public Object a(h0 h0Var) {
        return a().c(k0.a(h0Var));
    }

    @Override // io.bidmachine.analytics.internal.l0
    public Object a(String str, h0.a aVar) {
        Object objA = a().a(str, k0.a(aVar).toString());
        try {
            int i10 = tu.z.f87419c;
            tu.a0.throwOnFailure(objA);
            j0 j0Var = (j0) objA;
            return tu.z.m7131constructorimpl(j0Var != null ? k0.a(j0Var) : null);
        } catch (Throwable th2) {
            int i11 = tu.z.f87419c;
            return tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
        }
    }

    @Override // io.bidmachine.analytics.internal.l0
    public Object a(String str) {
        return a(a().a(str));
    }

    @Override // io.bidmachine.analytics.internal.l0
    public Object a(List list) {
        i0 i0VarA = a();
        ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k0.a((h0) it.next()));
        }
        return i0VarA.e(arrayList);
    }

    public final Object b() {
        return a().b();
    }

    @Override // io.bidmachine.analytics.internal.l0
    public Object a(String str, List list) {
        i0 i0VarA = a();
        ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k0.a((h0.a) it.next()).toString());
        }
        return i0VarA.a(str, arrayList);
    }

    @Override // io.bidmachine.analytics.internal.l0
    public Object a(List list, List list2) {
        a().b(list);
        i0 i0VarA = a();
        ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(k0.a((h0.a) it.next()).toString());
        }
        i0VarA.c(arrayList);
        int i10 = tu.z.f87419c;
        return tu.z.m7131constructorimpl(x0.f87415a);
    }

    private final Object a(Object obj) {
        try {
            int i10 = tu.z.f87419c;
            tu.a0.throwOnFailure(obj);
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(k0.a((j0) it.next()));
            }
            return tu.z.m7131constructorimpl(arrayList);
        } catch (Throwable th2) {
            int i11 = tu.z.f87419c;
            return tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
        }
    }
}
