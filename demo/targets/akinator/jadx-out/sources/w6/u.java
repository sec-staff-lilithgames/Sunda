package w6;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.f3;
import androidx.lifecycle.l1;
import androidx.work.impl.WorkDatabase;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f90435a;

    public u(WorkDatabase workDatabase) {
        this.f90435a = workDatabase;
    }

    public static void migrateLegacyPreferences(Context context, y5.c cVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j11 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            cVar.beginTransaction();
            try {
                cVar.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                cVar.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j11)});
                sharedPreferences.edit().clear().apply();
                cVar.setTransactionSuccessful();
            } finally {
                cVar.endTransaction();
            }
        }
    }

    public long getLastCancelAllTimeMillis() {
        Long longValue = this.f90435a.preferenceDao().getLongValue("last_cancel_all_time_ms");
        if (longValue != null) {
            return longValue.longValue();
        }
        return 0L;
    }

    public l1 getLastCancelAllTimeMillisLiveData() {
        return f3.map(this.f90435a.preferenceDao().getObservableLongValue("last_cancel_all_time_ms"), new t5.s(20));
    }

    public long getLastForceStopEventMillis() {
        Long longValue = this.f90435a.preferenceDao().getLongValue("last_force_stop_ms");
        if (longValue != null) {
            return longValue.longValue();
        }
        return 0L;
    }

    public boolean getNeedsReschedule() {
        Long longValue = this.f90435a.preferenceDao().getLongValue("reschedule_needed");
        return longValue != null && longValue.longValue() == 1;
    }

    public void setLastCancelAllTimeMillis(long j10) {
        this.f90435a.preferenceDao().insertPreference(new v6.e("last_cancel_all_time_ms", Long.valueOf(j10)));
    }

    public void setLastForceStopEventMillis(long j10) {
        this.f90435a.preferenceDao().insertPreference(new v6.e("last_force_stop_ms", Long.valueOf(j10)));
    }

    public void setNeedsReschedule(boolean z10) {
        this.f90435a.preferenceDao().insertPreference(new v6.e("reschedule_needed", z10));
    }
}
