package a6;

import a6.c;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import kotlin.jvm.internal.e0;
import y5.i;
import z5.c;
import z5.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements SQLiteDatabase.CursorFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4085a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4086b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f4085a = i10;
        this.f4086b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        int i10 = this.f4085a;
        Object obj = this.f4086b;
        switch (i10) {
            case 0:
                c.C0000c c0000c = (c.C0000c) obj;
                c.C0000c.a aVar = c.C0000c.f4078m;
                e0.checkNotNull(sQLiteQuery);
                int length = c0000c.f4079g.length;
                for (int i11 = 1; i11 < length; i11++) {
                    int i12 = c0000c.f4079g[i11];
                    if (i12 == 1) {
                        sQLiteQuery.bindLong(i11, c0000c.f4080h[i11]);
                    } else if (i12 == 2) {
                        sQLiteQuery.bindDouble(i11, c0000c.f4081i[i11]);
                    } else if (i12 == 3) {
                        sQLiteQuery.bindString(i11, c0000c.f4082j[i11]);
                    } else if (i12 == 4) {
                        sQLiteQuery.bindBlob(i11, c0000c.f4083k[i11]);
                    } else if (i12 == 5) {
                        sQLiteQuery.bindNull(i11);
                    }
                }
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            case 1:
                c.a aVar2 = z5.c.f97534c;
                e0.checkNotNull(sQLiteQuery);
                ((i) obj).bindTo(new h(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                c.a aVar3 = z5.c.f97534c;
                return (Cursor) ((z5.a) obj).invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
