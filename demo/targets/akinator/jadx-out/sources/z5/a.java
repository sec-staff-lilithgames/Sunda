package z5;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import kotlin.jvm.internal.e0;
import kv.r;
import z5.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y5.i f97532b;

    @Override // kv.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        c.a aVar = c.f97534c;
        e0.checkNotNull(sQLiteQuery);
        this.f97532b.bindTo(new h(sQLiteQuery));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}
