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
public final class S {

    /* renamed from: b, reason: collision with root package name */
    public static final a f59939b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final SQLiteOpenHelper f59940a;

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
        final /* synthetic */ SQLiteDatabase f59941a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ContentValues f59942b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SQLiteDatabase sQLiteDatabase, ContentValues contentValues) {
            super(1);
            this.f59941a = sQLiteDatabase;
            this.f59942b = contentValues;
        }

        public final void a(List list) {
            SQLiteDatabase sQLiteDatabase = this.f59941a;
            ContentValues contentValues = this.f59942b;
            String[] strArrA = null;
            String strA = list != null ? AbstractC3884q.a(list, "id IN") : null;
            if (list != null) {
                ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((T) it.next()).c());
                }
                strArrA = AbstractC3884q.a(arrayList);
            }
            sQLiteDatabase.update("monitor_record", contentValues, strA, strArrA);
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
        final /* synthetic */ SQLiteDatabase f59943a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SQLiteDatabase sQLiteDatabase) {
            super(1);
            this.f59943a = sQLiteDatabase;
        }

        public final void a(List list) {
            SQLiteDatabase sQLiteDatabase = this.f59943a;
            String[] strArrA = null;
            String strA = list != null ? AbstractC3884q.a(list, "id IN") : null;
            if (list != null) {
                ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((T) it.next()).c());
                }
                strArrA = AbstractC3884q.a(arrayList);
            }
            sQLiteDatabase.delete("monitor_record", strA, strArrA);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return x0.f87415a;
        }
    }

    public S(SQLiteOpenHelper sQLiteOpenHelper) {
        this.f59940a = sQLiteOpenHelper;
    }

    public final Object a(T t10) {
        Object objM7131constructorimpl;
        synchronized (this.f59940a) {
            try {
                int i10 = tu.z.f87419c;
                SQLiteDatabase writableDatabase = this.f59940a.getWritableDatabase();
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("id", t10.c());
                    contentValues.put("name", t10.d());
                    contentValues.put("timestamp", Long.valueOf(t10.f()));
                    contentValues.put("session_id", t10.e());
                    contentValues.put("data", s0.b(t10.a(), t10.c()));
                    contentValues.put("error", s0.b(t10.b(), t10.c()));
                    writableDatabase.insert("monitor_record", null, contentValues);
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

    public final Object b(List list) {
        return a(false, list);
    }

    public final Object c(List list) {
        return a(true, list);
    }

    public final Object a(String str, String str2) {
        return a(str, str2, (Integer) null);
    }

    public final Object a(String str, String str2, Integer num) {
        return a("name = ? AND session_id = ? AND is_reserved = 0", new String[]{str, str2}, num != null ? num.toString() : null);
    }

    /* JADX WARN: Finally extract failed */
    private final Object a(String str, String[] strArr, String str2) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f59940a) {
            try {
                int i10 = tu.z.f87419c;
                SQLiteDatabase readableDatabase = this.f59940a.getReadableDatabase();
                try {
                    Cursor cursorQuery = readableDatabase.query("monitor_record", new String[]{"id", "name", "timestamp", "session_id", "data", "error"}, str, strArr, null, null, "timestamp DESC", str2);
                    while (cursorQuery.moveToNext()) {
                        try {
                            try {
                                int i11 = tu.z.f87419c;
                                String string = cursorQuery.getString(0);
                                String string2 = cursorQuery.getString(1);
                                long j10 = cursorQuery.getLong(2);
                                tu.z.m7131constructorimpl(Boolean.valueOf(arrayList.add(new T(string, string2, cursorQuery.getString(3), j10, s0.a(cursorQuery.getBlob(4), string), s0.a(cursorQuery.getBlob(5), string)))));
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

    public final Object a() {
        return a(false, (List) null);
    }

    private final Object a(boolean z10, List list) {
        Object objM7131constructorimpl;
        synchronized (this.f59940a) {
            try {
                int i10 = tu.z.f87419c;
                SQLiteDatabase writableDatabase = this.f59940a.getWritableDatabase();
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
        synchronized (this.f59940a) {
            try {
                int i10 = tu.z.f87419c;
                SQLiteDatabase writableDatabase = this.f59940a.getWritableDatabase();
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
        synchronized (this.f59940a) {
            try {
                int i10 = tu.z.f87419c;
                SQLiteDatabase writableDatabase = this.f59940a.getWritableDatabase();
                try {
                    writableDatabase.delete("monitor_record", "session_id != ? OR " + AbstractC3884q.a(list, "name NOT IN"), AbstractC3884q.a(y0.plus((Collection) uu.o0.listOf(str), (Iterable) list)));
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
}
