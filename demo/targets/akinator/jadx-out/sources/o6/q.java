package o6;

import android.content.Context;
import android.database.SQLException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q extends s5.b {

    /* renamed from: c, reason: collision with root package name */
    public final Context f77963c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context mContext, int i10, int i11) {
        super(i10, i11);
        kotlin.jvm.internal.e0.checkNotNullParameter(mContext, "mContext");
        this.f77963c = mContext;
    }

    public final Context getMContext() {
        return this.f77963c;
    }

    @Override // s5.b
    public void migrate(y5.c db2) throws SQLException {
        kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
        if (this.f85472b >= 10) {
            db2.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
        } else {
            this.f77963c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
