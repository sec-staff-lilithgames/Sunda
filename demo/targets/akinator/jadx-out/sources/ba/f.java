package ba;

import com.ironsource.Q6;
import java.util.ArrayList;
import kotlin.jvm.internal.e0;
import tu.x0;
import u5.s;
import v6.m0;
import v6.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8990b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8991c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8992e;

    public /* synthetic */ f(int i10, String str, int i11) {
        this.f8990b = i11;
        this.f8992e = i10;
        this.f8991c = str;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        x5.d dVarPrepare;
        int i10 = this.f8990b;
        x0 x0Var = x0.f87415a;
        int i11 = this.f8992e;
        String str = this.f8991c;
        x5.b _connection = (x5.b) obj;
        switch (i10) {
            case 0:
                dVarPrepare = _connection.prepare("SELECT * FROM AccountAwards WHERE theme_id = ? AND lang = ?");
                try {
                    dVarPrepare.bindLong(1, i11);
                    if (str == null) {
                        dVarPrepare.bindNull(2);
                    } else {
                        dVarPrepare.bindText(2, str);
                    }
                    int columnIndexOrThrow = s.getColumnIndexOrThrow(dVarPrepare, "id");
                    int columnIndexOrThrow2 = s.getColumnIndexOrThrow(dVarPrepare, "name");
                    int columnIndexOrThrow3 = s.getColumnIndexOrThrow(dVarPrepare, "type");
                    int columnIndexOrThrow4 = s.getColumnIndexOrThrow(dVarPrepare, "theme_id");
                    int columnIndexOrThrow5 = s.getColumnIndexOrThrow(dVarPrepare, Q6.f35290q);
                    int columnIndexOrThrow6 = s.getColumnIndexOrThrow(dVarPrepare, "description");
                    ArrayList arrayList = new ArrayList();
                    while (dVarPrepare.step()) {
                        a aVar = new a();
                        aVar.setId(dVarPrepare.isNull(columnIndexOrThrow) ? null : dVarPrepare.getText(columnIndexOrThrow));
                        aVar.setName(dVarPrepare.isNull(columnIndexOrThrow2) ? null : dVarPrepare.getText(columnIndexOrThrow2));
                        aVar.setType(dVarPrepare.isNull(columnIndexOrThrow3) ? null : dVarPrepare.getText(columnIndexOrThrow3));
                        aVar.setThemeId(dVarPrepare.isNull(columnIndexOrThrow4) ? null : dVarPrepare.getText(columnIndexOrThrow4));
                        aVar.setLang(dVarPrepare.isNull(columnIndexOrThrow5) ? null : dVarPrepare.getText(columnIndexOrThrow5));
                        aVar.setDescription(dVarPrepare.isNull(columnIndexOrThrow6) ? null : dVarPrepare.getText(columnIndexOrThrow6));
                        arrayList.add(aVar);
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    throw th2;
                }
            case 1:
                q.a aVar2 = q.f89151c;
                e0.checkNotNullParameter(_connection, "_connection");
                dVarPrepare = _connection.prepare("DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?");
                try {
                    dVarPrepare.bindText(1, str);
                    dVarPrepare.bindLong(2, i11);
                    dVarPrepare.step();
                    return x0Var;
                } finally {
                }
            case 2:
                q.a aVar3 = q.f89151c;
                e0.checkNotNullParameter(_connection, "_connection");
                dVarPrepare = _connection.prepare("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    dVarPrepare.bindText(1, str);
                    dVarPrepare.bindLong(2, i11);
                    return dVarPrepare.step() ? new v6.n(dVarPrepare.getText(s.getColumnIndexOrThrow(dVarPrepare, "work_spec_id")), (int) dVarPrepare.getLong(s.getColumnIndexOrThrow(dVarPrepare, "generation")), (int) dVarPrepare.getLong(s.getColumnIndexOrThrow(dVarPrepare, "system_id"))) : null;
                } finally {
                }
            case 3:
                m0.a aVar4 = m0.f89142d;
                e0.checkNotNullParameter(_connection, "_connection");
                dVarPrepare = _connection.prepare("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    dVarPrepare.bindLong(1, i11);
                    dVarPrepare.bindText(2, str);
                    dVarPrepare.step();
                    return x0Var;
                } finally {
                }
            default:
                m0.a aVar5 = m0.f89142d;
                e0.checkNotNullParameter(_connection, "_connection");
                dVarPrepare = _connection.prepare("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    dVarPrepare.bindText(1, str);
                    dVarPrepare.bindLong(2, i11);
                    dVarPrepare.step();
                    return x0Var;
                } finally {
                }
        }
    }

    public /* synthetic */ f(String str, int i10, int i11) {
        this.f8990b = i11;
        this.f8991c = str;
        this.f8992e = i10;
    }
}
