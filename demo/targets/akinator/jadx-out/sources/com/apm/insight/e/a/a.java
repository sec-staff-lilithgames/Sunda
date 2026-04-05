package com.apm.insight.e.a;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.c;
import com.apm.insight.runtime.j;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class a<T> {

    /* renamed from: a, reason: collision with root package name */
    protected final String f12981a;

    /* renamed from: b, reason: collision with root package name */
    private String f12982b = "_id";

    public a(String str) {
        this.f12981a = str;
    }

    public abstract ContentValues a(T t10);

    public abstract HashMap<String, String> a();

    public final void a(SQLiteDatabase sQLiteDatabase) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CREATE TABLE ");
            sb2.append(this.f12981a);
            sb2.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
            HashMap<String, String> mapA = a();
            for (String str : mapA.keySet()) {
                sb2.append(str);
                sb2.append(" ");
                sb2.append(mapA.get(str));
                sb2.append(",");
            }
            sb2.delete(sb2.length() - 1, sb2.length());
            sb2.append(")");
            sQLiteDatabase.execSQL(sb2.toString());
        } catch (Throwable th2) {
            c.a();
            j.a(th2, "NPTH_CATCH");
        }
    }

    public void a(SQLiteDatabase sQLiteDatabase, T t10) {
        if (sQLiteDatabase == null || t10 == null) {
            return;
        }
        try {
            sQLiteDatabase.insert(this.f12981a, null, a((a<T>) t10));
        } catch (Throwable th2) {
            com.apm.insight.a.b(th2);
        }
    }
}
