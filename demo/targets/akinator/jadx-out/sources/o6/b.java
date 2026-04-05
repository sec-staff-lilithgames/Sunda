package o6;

import android.database.SQLException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b implements s5.a {
    @Override // s5.a
    public /* bridge */ /* synthetic */ void onPostMigrate(x5.b bVar) {
        super.onPostMigrate(bVar);
    }

    @Override // s5.a
    public void onPostMigrate(y5.c db2) throws SQLException {
        kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
        db2.execSQL("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }
}
