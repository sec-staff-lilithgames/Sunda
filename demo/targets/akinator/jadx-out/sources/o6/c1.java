package o6;

import android.content.Context;
import android.database.SQLException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c1 extends s5.b {

    /* renamed from: c, reason: collision with root package name */
    public final Context f77873c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(Context context) {
        super(9, 10);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f77873c = context;
    }

    @Override // s5.b
    public void migrate(y5.c db2) throws SQLException {
        kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
        db2.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        Context context = this.f77873c;
        w6.u.migrateLegacyPreferences(context, db2);
        w6.j.migrateLegacyIdGenerator(context, db2);
    }
}
