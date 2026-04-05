package o6;

import android.database.SQLException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n extends s5.b {

    /* renamed from: c, reason: collision with root package name */
    public static final n f77947c = new n(7, 8);

    @Override // s5.b
    public void migrate(y5.c db2) throws SQLException {
        kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
        db2.execSQL("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
