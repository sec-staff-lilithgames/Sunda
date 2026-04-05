package com.inmobi.media;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class B3 extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f31647a = 0;

    public B3(Context context) {
        super(context, "com.im_10.8.8.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase db2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase db2, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
    }
}
