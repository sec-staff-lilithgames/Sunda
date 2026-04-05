package o6;

import android.database.SQLException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k extends s5.b {

    /* renamed from: c, reason: collision with root package name */
    public static final k f77934c = new k(3, 4);

    @Override // s5.b
    public void migrate(y5.c db2) throws SQLException {
        kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
        db2.execSQL("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
