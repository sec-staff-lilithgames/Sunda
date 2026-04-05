package v6;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import tu.x0;
import v6.m0;
import v6.r0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f89128b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f89129c;

    public /* synthetic */ i0(String str, int i10) {
        this.f89128b = i10;
        this.f89129c = str;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        x5.d dVarPrepare;
        int i10 = this.f89128b;
        Object objIntToState = null;
        x0 x0Var = x0.f87415a;
        String str = this.f89129c;
        switch (i10) {
            case 0:
                x5.b _connection = (x5.b) obj;
                m0.a aVar = m0.f89142d;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection, "_connection");
                dVarPrepare = _connection.prepare("UPDATE workspec SET generation=generation+1 WHERE id=?");
                try {
                    dVarPrepare.bindText(1, str);
                    dVarPrepare.step();
                    return x0Var;
                } finally {
                }
            case 1:
                x5.b _connection2 = (x5.b) obj;
                m0.a aVar2 = m0.f89142d;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection2, "_connection");
                dVarPrepare = _connection2.prepare("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?");
                try {
                    dVarPrepare.bindText(1, str);
                    dVarPrepare.step();
                    int totalChangedRows = u5.r.getTotalChangedRows(_connection2);
                    dVarPrepare.close();
                    return Integer.valueOf(totalChangedRows);
                } finally {
                }
            case 2:
                x5.b _connection3 = (x5.b) obj;
                m0.a aVar3 = m0.f89142d;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection3, "_connection");
                dVarPrepare = _connection3.prepare("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
                try {
                    dVarPrepare.bindText(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (dVarPrepare.step()) {
                        arrayList.add(dVarPrepare.getText(0));
                    }
                    return arrayList;
                } finally {
                }
            case 3:
                x5.b _connection4 = (x5.b) obj;
                m0.a aVar4 = m0.f89142d;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection4, "_connection");
                dVarPrepare = _connection4.prepare("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?");
                try {
                    dVarPrepare.bindText(1, str);
                    dVarPrepare.step();
                    int totalChangedRows2 = u5.r.getTotalChangedRows(_connection4);
                    dVarPrepare.close();
                    return Integer.valueOf(totalChangedRows2);
                } finally {
                }
            case 4:
                x5.b _connection5 = (x5.b) obj;
                m0.a aVar5 = m0.f89142d;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection5, "_connection");
                dVarPrepare = _connection5.prepare("SELECT state FROM workspec WHERE id=?");
                try {
                    dVarPrepare.bindText(1, str);
                    if (dVarPrepare.step()) {
                        Integer numValueOf = dVarPrepare.isNull(0) ? null : Integer.valueOf((int) dVarPrepare.getLong(0));
                        if (numValueOf != null) {
                            objIntToState = t0.intToState(numValueOf.intValue());
                        }
                    }
                    return objIntToState;
                } finally {
                }
            case 5:
                x5.b _connection6 = (x5.b) obj;
                m0.a aVar6 = m0.f89142d;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection6, "_connection");
                dVarPrepare = _connection6.prepare("SELECT schedule_requested_at FROM workspec WHERE id=?");
                try {
                    dVarPrepare.bindText(1, str);
                    if (dVarPrepare.step() && !dVarPrepare.isNull(0)) {
                        objIntToState = Long.valueOf(dVarPrepare.getLong(0));
                    }
                    return objIntToState;
                } finally {
                }
            case 6:
                x5.b _connection7 = (x5.b) obj;
                r0.a aVar7 = r0.f89154c;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection7, "_connection");
                dVarPrepare = _connection7.prepare("DELETE FROM worktag WHERE work_spec_id=?");
                try {
                    dVarPrepare.bindText(1, str);
                    dVarPrepare.step();
                    return x0Var;
                } finally {
                }
            case 7:
                x5.b _connection8 = (x5.b) obj;
                r0.a aVar8 = r0.f89154c;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection8, "_connection");
                dVarPrepare = _connection8.prepare("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                try {
                    dVarPrepare.bindText(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (dVarPrepare.step()) {
                        arrayList2.add(dVarPrepare.getText(0));
                    }
                    return arrayList2;
                } finally {
                }
            case 8:
                x5.b _connection9 = (x5.b) obj;
                r0.a aVar9 = r0.f89154c;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection9, "_connection");
                dVarPrepare = _connection9.prepare("SELECT work_spec_id FROM worktag WHERE tag=?");
                try {
                    dVarPrepare.bindText(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (dVarPrepare.step()) {
                        arrayList3.add(dVarPrepare.getText(0));
                    }
                    return arrayList3;
                } finally {
                }
            case 9:
                WorkDatabase db2 = (WorkDatabase) obj;
                kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
                Object objApply = b0.B.apply(db2.workSpecDao().getWorkStatusPojoForName(str));
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(objApply, "apply(...)");
                return (List) objApply;
            default:
                WorkDatabase db3 = (WorkDatabase) obj;
                kotlin.jvm.internal.e0.checkNotNullParameter(db3, "db");
                Object objApply2 = b0.B.apply(db3.workSpecDao().getWorkStatusPojoForTag(str));
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(objApply2, "apply(...)");
                return (List) objApply2;
        }
    }
}
