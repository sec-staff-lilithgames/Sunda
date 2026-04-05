package io.bidmachine.analytics.internal;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p0.o2;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: io.bidmachine.analytics.internal.q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC3884q {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.q$a */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f60253a = new a();

        public a() {
            super(1);
        }

        @Override // kv.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Object obj) {
            return "?";
        }
    }

    public static final String a(List list, String str) {
        if (list != null) {
            return o2.q(a.b.t(str, " ("), y0.joinToString$default(list, ",", null, null, 0, null, a.f60253a, 30, null), ')');
        }
        return null;
    }

    public static /* synthetic */ void a(List list, SQLiteDatabase sQLiteDatabase, int i10, kv.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 100;
        }
        a(list, sQLiteDatabase, i10, lVar);
    }

    public static final void a(List list, SQLiteDatabase sQLiteDatabase, int i10, kv.l lVar) {
        if (list == null) {
            lVar.invoke(null);
            return;
        }
        sQLiteDatabase.beginTransaction();
        try {
            Iterator it = y0.chunked(list, i10).iterator();
            while (it.hasNext()) {
                lVar.invoke((List) it.next());
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th2) {
            sQLiteDatabase.endTransaction();
            throw th2;
        }
    }

    public static final String[] a(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
