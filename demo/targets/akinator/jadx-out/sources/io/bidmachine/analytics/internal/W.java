package io.bidmachine.analytics.internal;

import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class W implements V {

    /* renamed from: a, reason: collision with root package name */
    private final SQLiteOpenHelper f59950a;

    /* renamed from: b, reason: collision with root package name */
    private final tu.o f59951b = tu.q.lazy(new a());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.a {
        public a() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S invoke() {
            return new S(W.this.f59950a);
        }
    }

    public W(SQLiteOpenHelper sQLiteOpenHelper) {
        this.f59950a = sQLiteOpenHelper;
    }

    @Override // io.bidmachine.analytics.internal.V
    public Object b(List list) {
        S sA = a();
        ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(U.a((Q) it.next()));
        }
        return sA.a(arrayList);
    }

    @Override // io.bidmachine.analytics.internal.V
    public Object c(List list) {
        S sA = a();
        ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(U.a((Q) it.next()));
        }
        return sA.b(arrayList);
    }

    private final S a() {
        return (S) this.f59951b.getValue();
    }

    @Override // io.bidmachine.analytics.internal.V
    public Object a(Q q10) {
        return a().a(U.a(q10));
    }

    @Override // io.bidmachine.analytics.internal.V
    public Object a(String str, String str2) {
        return a(a().a(str, str2));
    }

    @Override // io.bidmachine.analytics.internal.V
    public Object a(String str, String str2, int i10) {
        return a(a().a(str, str2, Integer.valueOf(i10)));
    }

    public final Object b() {
        return a().a();
    }

    @Override // io.bidmachine.analytics.internal.V
    public Object a(List list) {
        S sA = a();
        ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(U.a((Q) it.next()));
        }
        return sA.c(arrayList);
    }

    @Override // io.bidmachine.analytics.internal.V
    public Object a(String str, List list) {
        return a().a(str, list);
    }

    private final Object a(Object obj) {
        try {
            int i10 = tu.z.f87419c;
            tu.a0.throwOnFailure(obj);
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(U.a((T) it.next()));
            }
            return tu.z.m7131constructorimpl(arrayList);
        } catch (Throwable th2) {
            int i11 = tu.z.f87419c;
            return tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
        }
    }
}
