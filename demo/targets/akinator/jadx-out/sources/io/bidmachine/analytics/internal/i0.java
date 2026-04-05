package io.bidmachine.analytics.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import tu.x0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f60066b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final SQLiteOpenHelper f60067a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SQLiteDatabase f60068a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ContentValues f60069b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SQLiteDatabase sQLiteDatabase, ContentValues contentValues) {
            super(1);
            this.f60068a = sQLiteDatabase;
            this.f60069b = contentValues;
        }

        public final void a(List list) {
            SQLiteDatabase sQLiteDatabase = this.f60068a;
            ContentValues contentValues = this.f60069b;
            String[] strArrA = null;
            String strA = list != null ? AbstractC3884q.a(list, "id IN") : null;
            if (list != null) {
                ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((j0) it.next()).c());
                }
                strArrA = AbstractC3884q.a(arrayList);
            }
            sQLiteDatabase.update("reader_record", contentValues, strA, strArrA);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SQLiteDatabase f60070a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SQLiteDatabase sQLiteDatabase) {
            super(1);
            this.f60070a = sQLiteDatabase;
        }

        public final void a(List list) {
            SQLiteDatabase sQLiteDatabase = this.f60070a;
            String[] strArrA = null;
            String strA = list != null ? AbstractC3884q.a(list, "id IN") : null;
            if (list != null) {
                ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((j0) it.next()).c());
                }
                strArrA = AbstractC3884q.a(arrayList);
            }
            sQLiteDatabase.delete("reader_record", strA, strArrA);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return x0.f87415a;
        }
    }

    public i0(SQLiteOpenHelper sQLiteOpenHelper) {
        this.f60067a = sQLiteOpenHelper;
    }

    public final Object a(j0 j0Var) {
        Object objM7131constructorimpl;
        synchronized (this.f60067a) {
            try {
                int i10 = tu.z.f87419c;
                SQLiteDatabase writableDatabase = this.f60067a.getWritableDatabase();
                try {
                    writableDatabase.insert("reader_record", null, b(j0Var));
                    x0 x0Var = x0.f87415a;
                    gv.d.closeFinally(writableDatabase, null);
                    objM7131constructorimpl = tu.z.m7131constructorimpl(x0Var);
                } finally {
                }
            } catch (Throwable th2) {
                int i11 = tu.z.f87419c;
                objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
            }
        }
        return objM7131constructorimpl;
    }

    public final Object b() {
        return a(false, (List) null);
    }

    public final Object c(j0 j0Var) {
        Object objM7131constructorimpl;
        synchronized (this.f60067a) {
            try {
                int i10 = tu.z.f87419c;
                SQLiteDatabase writableDatabase = this.f60067a.getWritableDatabase();
                try {
                    writableDatabase.update("reader_record", b(j0Var), "id = ?", new String[]{j0Var.c()});
                    x0 x0Var = x0.f87415a;
                    gv.d.closeFinally(writableDatabase, null);
                    objM7131constructorimpl = tu.z.m7131constructorimpl(x0Var);
                } finally {
                }
            } catch (Throwable th2) {
                int i11 = tu.z.f87419c;
                objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
            }
        }
        return objM7131constructorimpl;
    }

    public final Object d(List list) {
        return a(false, list);
    }

    public final Object e(List list) {
        return a(true, list);
    }

    public final Object b(List list) {
        Object objM7131constructorimpl;
        synchronized (this.f60067a) {
            try {
                int i10 = tu.z.f87419c;
                SQLiteDatabase writableDatabase = this.f60067a.getWritableDatabase();
                try {
                    writableDatabase.delete("reader_record", AbstractC3884q.a(list, "name NOT IN"), AbstractC3884q.a(list));
                    x0 x0Var = x0.f87415a;
                    gv.d.closeFinally(writableDatabase, null);
                    objM7131constructorimpl = tu.z.m7131constructorimpl(x0Var);
                } finally {
                }
            } catch (Throwable th2) {
                int i11 = tu.z.f87419c;
                objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
            }
        }
        return objM7131constructorimpl;
    }

    public final Object a(String str, String str2) {
        Object objA = a(this, "name = ? AND rule = ? AND " + a(), new String[]{str, s0.c(str2)}, null, 4, null);
        if (tu.z.m7136isFailureimpl(objA)) {
            Throwable thM7134exceptionOrNullimpl = tu.z.m7134exceptionOrNullimpl(objA);
            if (thM7134exceptionOrNullimpl == null) {
                thM7134exceptionOrNullimpl = new Exception();
            }
            return tu.z.m7131constructorimpl(tu.a0.createFailure(thM7134exceptionOrNullimpl));
        }
        if (tu.z.m7136isFailureimpl(objA)) {
            objA = null;
        }
        List list = (List) objA;
        return tu.z.m7131constructorimpl(list != null ? (j0) y0.firstOrNull(list) : null);
    }

    public final Object c(List list) {
        Object objM7131constructorimpl;
        synchronized (this.f60067a) {
            try {
                int i10 = tu.z.f87419c;
                ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(s0.c((String) it.next()));
                }
                SQLiteDatabase writableDatabase = this.f60067a.getWritableDatabase();
                try {
                    writableDatabase.delete("reader_record", AbstractC3884q.a(arrayList, "rule NOT IN"), AbstractC3884q.a(arrayList));
                    x0 x0Var = x0.f87415a;
                    gv.d.closeFinally(writableDatabase, null);
                    objM7131constructorimpl = tu.z.m7131constructorimpl(x0Var);
                } finally {
                }
            } catch (Throwable th2) {
                int i11 = tu.z.f87419c;
                objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
            }
        }
        return objM7131constructorimpl;
    }

    private final ContentValues b(j0 j0Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", j0Var.c());
        contentValues.put("name", j0Var.d());
        contentValues.put("timestamp", Long.valueOf(j0Var.f()));
        contentValues.put("data_hash", j0Var.a());
        contentValues.put("rule", s0.c(j0Var.e()));
        contentValues.put("error", s0.b(j0Var.b(), j0Var.c()));
        contentValues.put("is_dirty", Boolean.valueOf(j0Var.g()));
        return contentValues;
    }

    public final Object a(String str) {
        return a(this, "name = ? AND is_reserved = 0 AND is_dirty = 1", new String[]{str}, null, 4, null);
    }

    public static /* synthetic */ Object a(i0 i0Var, String str, String[] strArr, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            strArr = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        return i0Var.a(str, strArr, str2);
    }

    /* JADX WARN: Finally extract failed */
    private final Object a(String str, String[] strArr, String str2) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f60067a) {
            try {
                int i10 = tu.z.f87419c;
                SQLiteDatabase readableDatabase = this.f60067a.getReadableDatabase();
                try {
                    Cursor cursorQuery = readableDatabase.query("reader_record", new String[]{"id", "name", "timestamp", "data_hash", "rule", "error", "is_dirty"}, str, strArr, null, null, "timestamp DESC", str2);
                    while (cursorQuery.moveToNext()) {
                        try {
                            try {
                                int i11 = tu.z.f87419c;
                                String string = cursorQuery.getString(0);
                                tu.z.m7131constructorimpl(Boolean.valueOf(arrayList.add(new j0(string, cursorQuery.getString(1), cursorQuery.getLong(2), cursorQuery.getString(3), s0.a(cursorQuery.getString(4)), s0.a(cursorQuery.getBlob(5), string), cursorQuery.getInt(6) == 1))));
                            } catch (Throwable th2) {
                                int i12 = tu.z.f87419c;
                                tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                gv.d.closeFinally(cursorQuery, th3);
                                throw th4;
                            }
                        }
                    }
                    x0 x0Var = x0.f87415a;
                    gv.d.closeFinally(cursorQuery, null);
                    gv.d.closeFinally(readableDatabase, null);
                    tu.z.m7131constructorimpl(x0Var);
                } finally {
                }
            } catch (Throwable th5) {
                int i13 = tu.z.f87419c;
                tu.z.m7131constructorimpl(tu.a0.createFailure(th5));
            }
        }
        return tu.z.m7131constructorimpl(arrayList);
    }

    private final Object a(boolean z10, List list) {
        Object objM7131constructorimpl;
        synchronized (this.f60067a) {
            try {
                int i10 = tu.z.f87419c;
                SQLiteDatabase writableDatabase = this.f60067a.getWritableDatabase();
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("is_reserved", Boolean.valueOf(z10));
                    AbstractC3884q.a(list, writableDatabase, 0, new b(writableDatabase, contentValues), 2, null);
                    x0 x0Var = x0.f87415a;
                    gv.d.closeFinally(writableDatabase, null);
                    objM7131constructorimpl = tu.z.m7131constructorimpl(x0Var);
                } finally {
                }
            } finally {
                return objM7131constructorimpl;
            }
        }
        return objM7131constructorimpl;
    }

    public final Object a(List list) {
        Object objM7131constructorimpl;
        synchronized (this.f60067a) {
            try {
                int i10 = tu.z.f87419c;
                SQLiteDatabase writableDatabase = this.f60067a.getWritableDatabase();
                try {
                    AbstractC3884q.a(list, writableDatabase, 0, new c(writableDatabase), 2, null);
                    x0 x0Var = x0.f87415a;
                    gv.d.closeFinally(writableDatabase, null);
                    objM7131constructorimpl = tu.z.m7131constructorimpl(x0Var);
                } finally {
                }
            } finally {
                return objM7131constructorimpl;
            }
        }
        return objM7131constructorimpl;
    }

    public final Object a(String str, List list) {
        Object objM7131constructorimpl;
        synchronized (this.f60067a) {
            try {
                int i10 = tu.z.f87419c;
                ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(s0.c((String) it.next()));
                }
                SQLiteDatabase writableDatabase = this.f60067a.getWritableDatabase();
                try {
                    writableDatabase.delete("reader_record", "name = ? AND " + a() + " AND " + AbstractC3884q.a(arrayList, "rule IN"), AbstractC3884q.a(y0.plus((Collection) uu.o0.listOf(str), (Iterable) arrayList)));
                    x0 x0Var = x0.f87415a;
                    gv.d.closeFinally(writableDatabase, null);
                    objM7131constructorimpl = tu.z.m7131constructorimpl(x0Var);
                } finally {
                }
            } catch (Throwable th2) {
                int i11 = tu.z.f87419c;
                objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
            }
        }
        return objM7131constructorimpl;
    }

    private final String a() {
        return "(LENGTH(error) = 0 OR error IS NULL)";
    }
}
