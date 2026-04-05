package o6;

import o5.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends y0.b {

    /* renamed from: a, reason: collision with root package name */
    public final n6.b f77870a;

    public c(n6.b clock) {
        kotlin.jvm.internal.e0.checkNotNullParameter(clock, "clock");
        this.f77870a = clock;
    }

    public final n6.b getClock() {
        return this.f77870a;
    }

    @Override // o5.y0.b
    public void onOpen(y5.c db2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
        super.onOpen(db2);
        db2.beginTransaction();
        try {
            db2.execSQL("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (this.f77870a.currentTimeMillis() - f0.f77888a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            db2.setTransactionSuccessful();
        } finally {
            db2.endTransaction();
        }
    }
}
