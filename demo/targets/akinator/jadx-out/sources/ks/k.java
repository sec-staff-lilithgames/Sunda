package ks;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.exoplayer2.util.a0;
import io.bidmachine.media3.common.util.w;
import io.odeeo.internal.c.b;
import io.odeeo.internal.q0.o;
import md.d0;
import on.c0;
import p0.o2;
import sn.t;
import zd.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class k implements o.a, w, wd.b, vd.n, a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71987b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f71988c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f71989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f71990f;

    public /* synthetic */ k(Object obj, Object obj2, long j10, int i10) {
        this.f71987b = i10;
        this.f71990f = obj;
        this.f71988c = obj2;
        this.f71989e = j10;
    }

    @Override // vd.n
    public Object apply(Object obj) throws SQLException {
        String str = (String) this.f71990f;
        qd.f fVar = (qd.f) this.f71988c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        boolean zBooleanValue = ((Boolean) vd.p.m(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(fVar.getNumber())}), new t(9))).booleanValue();
        long j10 = this.f71989e;
        if (zBooleanValue) {
            sQLiteDatabase.execSQL(o2.n(j10, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(fVar.getNumber())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(fVar.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    @Override // wd.b
    public Object execute() {
        ud.h hVar = (ud.h) this.f71990f;
        d0 d0Var = (d0) this.f71988c;
        ((vd.p) hVar.f88429c).recordNextCallTime(d0Var, hVar.f88433g.getTime() + this.f71989e);
        return null;
    }

    @Override // io.odeeo.internal.q0.o.a
    public void invoke(Object obj) {
        switch (this.f71987b) {
            case 0:
                ((io.odeeo.internal.c.b) obj).onRenderedFirstFrame((b.a) this.f71990f, this.f71988c, this.f71989e);
                break;
            case 1:
                ((c0) ((on.d) obj)).onRenderedFirstFrame((on.b) this.f71990f, this.f71988c, this.f71989e);
                break;
            default:
                ((z) ((zd.d) obj)).onRenderedFirstFrame((zd.b) this.f71990f, this.f71988c, this.f71989e);
                break;
        }
    }
}
