package t5;

import androidx.work.b;
import java.util.ArrayList;
import kotlin.jvm.internal.e0;
import n6.d0;
import n6.o0;
import n6.x0;
import t5.r;
import v6.a0;
import v6.b0;
import v6.m0;
import v6.q;
import v6.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f86373b;

    public /* synthetic */ s(int i10) {
        this.f86373b = i10;
    }

    private final Object a(Object obj) {
        int i10;
        int i11;
        Integer numValueOf;
        x5.b _connection = (x5.b) obj;
        m0.a aVar = m0.f89142d;
        e0.checkNotNullParameter(_connection, "_connection");
        x5.d dVarPrepare = _connection.prepare("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        try {
            int columnIndexOrThrow = u5.s.getColumnIndexOrThrow(dVarPrepare, "id");
            int columnIndexOrThrow2 = u5.s.getColumnIndexOrThrow(dVarPrepare, "state");
            int columnIndexOrThrow3 = u5.s.getColumnIndexOrThrow(dVarPrepare, "worker_class_name");
            int columnIndexOrThrow4 = u5.s.getColumnIndexOrThrow(dVarPrepare, "input_merger_class_name");
            int columnIndexOrThrow5 = u5.s.getColumnIndexOrThrow(dVarPrepare, "input");
            int columnIndexOrThrow6 = u5.s.getColumnIndexOrThrow(dVarPrepare, "output");
            int columnIndexOrThrow7 = u5.s.getColumnIndexOrThrow(dVarPrepare, "initial_delay");
            int columnIndexOrThrow8 = u5.s.getColumnIndexOrThrow(dVarPrepare, "interval_duration");
            int columnIndexOrThrow9 = u5.s.getColumnIndexOrThrow(dVarPrepare, "flex_duration");
            int columnIndexOrThrow10 = u5.s.getColumnIndexOrThrow(dVarPrepare, "run_attempt_count");
            int columnIndexOrThrow11 = u5.s.getColumnIndexOrThrow(dVarPrepare, "backoff_policy");
            int columnIndexOrThrow12 = u5.s.getColumnIndexOrThrow(dVarPrepare, "backoff_delay_duration");
            int columnIndexOrThrow13 = u5.s.getColumnIndexOrThrow(dVarPrepare, "last_enqueue_time");
            int columnIndexOrThrow14 = u5.s.getColumnIndexOrThrow(dVarPrepare, "minimum_retention_duration");
            int columnIndexOrThrow15 = u5.s.getColumnIndexOrThrow(dVarPrepare, "schedule_requested_at");
            int columnIndexOrThrow16 = u5.s.getColumnIndexOrThrow(dVarPrepare, "run_in_foreground");
            int columnIndexOrThrow17 = u5.s.getColumnIndexOrThrow(dVarPrepare, "out_of_quota_policy");
            int columnIndexOrThrow18 = u5.s.getColumnIndexOrThrow(dVarPrepare, "period_count");
            int columnIndexOrThrow19 = u5.s.getColumnIndexOrThrow(dVarPrepare, "generation");
            int columnIndexOrThrow20 = u5.s.getColumnIndexOrThrow(dVarPrepare, "next_schedule_time_override");
            int columnIndexOrThrow21 = u5.s.getColumnIndexOrThrow(dVarPrepare, "next_schedule_time_override_generation");
            int columnIndexOrThrow22 = u5.s.getColumnIndexOrThrow(dVarPrepare, "stop_reason");
            int columnIndexOrThrow23 = u5.s.getColumnIndexOrThrow(dVarPrepare, "trace_tag");
            int columnIndexOrThrow24 = u5.s.getColumnIndexOrThrow(dVarPrepare, "backoff_on_system_interruptions");
            int columnIndexOrThrow25 = u5.s.getColumnIndexOrThrow(dVarPrepare, "required_network_type");
            int columnIndexOrThrow26 = u5.s.getColumnIndexOrThrow(dVarPrepare, "required_network_request");
            int columnIndexOrThrow27 = u5.s.getColumnIndexOrThrow(dVarPrepare, "requires_charging");
            int columnIndexOrThrow28 = u5.s.getColumnIndexOrThrow(dVarPrepare, "requires_device_idle");
            int columnIndexOrThrow29 = u5.s.getColumnIndexOrThrow(dVarPrepare, "requires_battery_not_low");
            int columnIndexOrThrow30 = u5.s.getColumnIndexOrThrow(dVarPrepare, "requires_storage_not_low");
            int columnIndexOrThrow31 = u5.s.getColumnIndexOrThrow(dVarPrepare, "trigger_content_update_delay");
            int columnIndexOrThrow32 = u5.s.getColumnIndexOrThrow(dVarPrepare, "trigger_max_content_delay");
            int columnIndexOrThrow33 = u5.s.getColumnIndexOrThrow(dVarPrepare, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (dVarPrepare.step()) {
                String text = dVarPrepare.getText(columnIndexOrThrow);
                int i12 = columnIndexOrThrow14;
                ArrayList arrayList2 = arrayList;
                x0 x0VarIntToState = t0.intToState((int) dVarPrepare.getLong(columnIndexOrThrow2));
                String text2 = dVarPrepare.getText(columnIndexOrThrow3);
                String text3 = dVarPrepare.getText(columnIndexOrThrow4);
                byte[] blob = dVarPrepare.getBlob(columnIndexOrThrow5);
                b.C0007b c0007b = androidx.work.b.f7480b;
                androidx.work.b bVarFromByteArray = c0007b.fromByteArray(blob);
                androidx.work.b bVarFromByteArray2 = c0007b.fromByteArray(dVarPrepare.getBlob(columnIndexOrThrow6));
                long j10 = dVarPrepare.getLong(columnIndexOrThrow7);
                long j11 = dVarPrepare.getLong(columnIndexOrThrow8);
                long j12 = dVarPrepare.getLong(columnIndexOrThrow9);
                int i13 = (int) dVarPrepare.getLong(columnIndexOrThrow10);
                int i14 = columnIndexOrThrow2;
                int i15 = columnIndexOrThrow3;
                n6.a aVarIntToBackoffPolicy = t0.intToBackoffPolicy((int) dVarPrepare.getLong(columnIndexOrThrow11));
                long j13 = dVarPrepare.getLong(columnIndexOrThrow12);
                long j14 = dVarPrepare.getLong(columnIndexOrThrow13);
                long j15 = dVarPrepare.getLong(i12);
                int i16 = columnIndexOrThrow15;
                long j16 = dVarPrepare.getLong(i16);
                int i17 = columnIndexOrThrow;
                int i18 = columnIndexOrThrow16;
                boolean z10 = ((int) dVarPrepare.getLong(i18)) != 0;
                int i19 = columnIndexOrThrow17;
                int i20 = columnIndexOrThrow4;
                o0 o0VarIntToOutOfQuotaPolicy = t0.intToOutOfQuotaPolicy((int) dVarPrepare.getLong(i19));
                int i21 = columnIndexOrThrow18;
                int i22 = columnIndexOrThrow5;
                int i23 = (int) dVarPrepare.getLong(i21);
                int i24 = columnIndexOrThrow19;
                int i25 = (int) dVarPrepare.getLong(i24);
                int i26 = columnIndexOrThrow20;
                long j17 = dVarPrepare.getLong(i26);
                int i27 = columnIndexOrThrow21;
                int i28 = (int) dVarPrepare.getLong(i27);
                int i29 = columnIndexOrThrow22;
                int i30 = (int) dVarPrepare.getLong(i29);
                int i31 = columnIndexOrThrow23;
                Boolean boolValueOf = null;
                String text4 = dVarPrepare.isNull(i31) ? null : dVarPrepare.getText(i31);
                int i32 = columnIndexOrThrow24;
                if (dVarPrepare.isNull(i32)) {
                    i10 = i28;
                    i11 = i29;
                    numValueOf = null;
                } else {
                    i10 = i28;
                    i11 = i29;
                    numValueOf = Integer.valueOf((int) dVarPrepare.getLong(i32));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i33 = columnIndexOrThrow25;
                Boolean bool = boolValueOf;
                d0 d0VarIntToNetworkType = t0.intToNetworkType((int) dVarPrepare.getLong(i33));
                int i34 = columnIndexOrThrow26;
                w6.r networkRequest$work_runtime_release = t0.toNetworkRequest$work_runtime_release(dVarPrepare.getBlob(i34));
                columnIndexOrThrow25 = i33;
                columnIndexOrThrow26 = i34;
                int i35 = columnIndexOrThrow27;
                boolean z11 = ((int) dVarPrepare.getLong(i35)) != 0;
                columnIndexOrThrow27 = i35;
                int i36 = columnIndexOrThrow28;
                boolean z12 = ((int) dVarPrepare.getLong(i36)) != 0;
                int i37 = columnIndexOrThrow29;
                boolean z13 = ((int) dVarPrepare.getLong(i37)) != 0;
                columnIndexOrThrow29 = i37;
                int i38 = columnIndexOrThrow30;
                int i39 = columnIndexOrThrow31;
                int i40 = columnIndexOrThrow32;
                int i41 = columnIndexOrThrow33;
                columnIndexOrThrow33 = i41;
                arrayList2.add(new b0(text, x0VarIntToState, text2, text3, bVarFromByteArray, bVarFromByteArray2, j10, j11, j12, new n6.f(networkRequest$work_runtime_release, d0VarIntToNetworkType, z11, z12, z13, ((int) dVarPrepare.getLong(i38)) != 0, dVarPrepare.getLong(i39), dVarPrepare.getLong(i40), t0.byteArrayToSetOfTriggers(dVarPrepare.getBlob(i41))), i13, aVarIntToBackoffPolicy, j13, j14, j15, j16, z10, o0VarIntToOutOfQuotaPolicy, i23, i25, j17, i10, i30, text4, bool));
                columnIndexOrThrow30 = i38;
                columnIndexOrThrow4 = i20;
                columnIndexOrThrow17 = i19;
                columnIndexOrThrow19 = i24;
                columnIndexOrThrow22 = i11;
                columnIndexOrThrow24 = i32;
                columnIndexOrThrow31 = i39;
                columnIndexOrThrow32 = i40;
                columnIndexOrThrow2 = i14;
                columnIndexOrThrow14 = i12;
                columnIndexOrThrow3 = i15;
                arrayList = arrayList2;
                columnIndexOrThrow = i17;
                columnIndexOrThrow15 = i16;
                columnIndexOrThrow16 = i18;
                columnIndexOrThrow20 = i26;
                columnIndexOrThrow21 = i27;
                columnIndexOrThrow23 = i31;
                columnIndexOrThrow28 = i36;
                columnIndexOrThrow5 = i22;
                columnIndexOrThrow18 = i21;
            }
            ArrayList arrayList3 = arrayList;
            dVarPrepare.close();
            return arrayList3;
        } catch (Throwable th2) {
            dVarPrepare.close();
            throw th2;
        }
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        x5.d dVarPrepare;
        boolean z10;
        int i10;
        int i11;
        Integer numValueOf;
        Boolean boolValueOf;
        int i12;
        Integer numValueOf2;
        Boolean boolValueOf2;
        int i13 = this.f86373b;
        tu.x0 x0Var = tu.x0.f87415a;
        switch (i13) {
            case 0:
                y5.j obj2 = (y5.j) obj;
                int i14 = r.b.f86363j;
                e0.checkNotNullParameter(obj2, "obj");
                return Long.valueOf(obj2.executeInsert());
            case 1:
                y5.j statement = (y5.j) obj;
                int i15 = r.b.f86363j;
                e0.checkNotNullParameter(statement, "statement");
                statement.execute();
                return x0Var;
            case 2:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 3:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 4:
                char cCharValue = ((Character) obj).charValue();
                if (cCharValue != 'T' && cCharValue != 't') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 6:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 7:
                char cCharValue2 = ((Character) obj).charValue();
                return Boolean.valueOf('0' <= cCharValue2 && cCharValue2 < ':');
            case 8:
                x5.b _connection = (x5.b) obj;
                q.a aVar = v6.q.f89151c;
                e0.checkNotNullParameter(_connection, "_connection");
                dVarPrepare = _connection.prepare("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (dVarPrepare.step()) {
                        arrayList.add(dVarPrepare.getText(0));
                    }
                    return arrayList;
                } finally {
                }
            case 9:
                x5.b _connection2 = (x5.b) obj;
                a0.a aVar2 = a0.f89049c;
                e0.checkNotNullParameter(_connection2, "_connection");
                try {
                    _connection2.prepare("DELETE FROM WorkProgress").step();
                    return x0Var;
                } finally {
                }
            case 10:
                x5.b _connection3 = (x5.b) obj;
                m0.a aVar3 = m0.f89142d;
                e0.checkNotNullParameter(_connection3, "_connection");
                dVarPrepare = _connection3.prepare("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (dVarPrepare.step()) {
                        arrayList2.add(dVarPrepare.getText(0));
                    }
                    return arrayList2;
                } finally {
                }
            case 11:
                x5.b _connection4 = (x5.b) obj;
                m0.a aVar4 = m0.f89142d;
                e0.checkNotNullParameter(_connection4, "_connection");
                dVarPrepare = _connection4.prepare("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    int i16 = dVarPrepare.step() ? (int) dVarPrepare.getLong(0) : 0;
                    dVarPrepare.close();
                    return Integer.valueOf(i16);
                } finally {
                }
            case 12:
                x5.b _connection5 = (x5.b) obj;
                m0.a aVar5 = m0.f89142d;
                e0.checkNotNullParameter(_connection5, "_connection");
                try {
                    _connection5.prepare("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))").step();
                    return x0Var;
                } finally {
                }
            case 13:
                x5.b _connection6 = (x5.b) obj;
                m0.a aVar6 = m0.f89142d;
                e0.checkNotNullParameter(_connection6, "_connection");
                dVarPrepare = _connection6.prepare("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                try {
                    if (dVarPrepare.step()) {
                        z10 = ((int) dVarPrepare.getLong(0)) != 0;
                    } else {
                        z10 = false;
                    }
                    dVarPrepare.close();
                    return Boolean.valueOf(z10);
                } finally {
                }
            case 14:
                x5.b _connection7 = (x5.b) obj;
                m0.a aVar7 = m0.f89142d;
                e0.checkNotNullParameter(_connection7, "_connection");
                dVarPrepare = _connection7.prepare("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                try {
                    dVarPrepare.step();
                    int totalChangedRows = u5.r.getTotalChangedRows(_connection7);
                    dVarPrepare.close();
                    return Integer.valueOf(totalChangedRows);
                } finally {
                }
            case 15:
                x5.b _connection8 = (x5.b) obj;
                m0.a aVar8 = m0.f89142d;
                e0.checkNotNullParameter(_connection8, "_connection");
                dVarPrepare = _connection8.prepare("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                try {
                    int columnIndexOrThrow = u5.s.getColumnIndexOrThrow(dVarPrepare, "id");
                    int columnIndexOrThrow2 = u5.s.getColumnIndexOrThrow(dVarPrepare, "state");
                    int columnIndexOrThrow3 = u5.s.getColumnIndexOrThrow(dVarPrepare, "worker_class_name");
                    int columnIndexOrThrow4 = u5.s.getColumnIndexOrThrow(dVarPrepare, "input_merger_class_name");
                    int columnIndexOrThrow5 = u5.s.getColumnIndexOrThrow(dVarPrepare, "input");
                    int columnIndexOrThrow6 = u5.s.getColumnIndexOrThrow(dVarPrepare, "output");
                    int columnIndexOrThrow7 = u5.s.getColumnIndexOrThrow(dVarPrepare, "initial_delay");
                    int columnIndexOrThrow8 = u5.s.getColumnIndexOrThrow(dVarPrepare, "interval_duration");
                    int columnIndexOrThrow9 = u5.s.getColumnIndexOrThrow(dVarPrepare, "flex_duration");
                    int columnIndexOrThrow10 = u5.s.getColumnIndexOrThrow(dVarPrepare, "run_attempt_count");
                    int columnIndexOrThrow11 = u5.s.getColumnIndexOrThrow(dVarPrepare, "backoff_policy");
                    int columnIndexOrThrow12 = u5.s.getColumnIndexOrThrow(dVarPrepare, "backoff_delay_duration");
                    int columnIndexOrThrow13 = u5.s.getColumnIndexOrThrow(dVarPrepare, "last_enqueue_time");
                    int columnIndexOrThrow14 = u5.s.getColumnIndexOrThrow(dVarPrepare, "minimum_retention_duration");
                    int columnIndexOrThrow15 = u5.s.getColumnIndexOrThrow(dVarPrepare, "schedule_requested_at");
                    int columnIndexOrThrow16 = u5.s.getColumnIndexOrThrow(dVarPrepare, "run_in_foreground");
                    int columnIndexOrThrow17 = u5.s.getColumnIndexOrThrow(dVarPrepare, "out_of_quota_policy");
                    int columnIndexOrThrow18 = u5.s.getColumnIndexOrThrow(dVarPrepare, "period_count");
                    int columnIndexOrThrow19 = u5.s.getColumnIndexOrThrow(dVarPrepare, "generation");
                    int columnIndexOrThrow20 = u5.s.getColumnIndexOrThrow(dVarPrepare, "next_schedule_time_override");
                    int columnIndexOrThrow21 = u5.s.getColumnIndexOrThrow(dVarPrepare, "next_schedule_time_override_generation");
                    int columnIndexOrThrow22 = u5.s.getColumnIndexOrThrow(dVarPrepare, "stop_reason");
                    int columnIndexOrThrow23 = u5.s.getColumnIndexOrThrow(dVarPrepare, "trace_tag");
                    int columnIndexOrThrow24 = u5.s.getColumnIndexOrThrow(dVarPrepare, "backoff_on_system_interruptions");
                    int columnIndexOrThrow25 = u5.s.getColumnIndexOrThrow(dVarPrepare, "required_network_type");
                    int columnIndexOrThrow26 = u5.s.getColumnIndexOrThrow(dVarPrepare, "required_network_request");
                    int columnIndexOrThrow27 = u5.s.getColumnIndexOrThrow(dVarPrepare, "requires_charging");
                    int columnIndexOrThrow28 = u5.s.getColumnIndexOrThrow(dVarPrepare, "requires_device_idle");
                    int columnIndexOrThrow29 = u5.s.getColumnIndexOrThrow(dVarPrepare, "requires_battery_not_low");
                    int columnIndexOrThrow30 = u5.s.getColumnIndexOrThrow(dVarPrepare, "requires_storage_not_low");
                    int columnIndexOrThrow31 = u5.s.getColumnIndexOrThrow(dVarPrepare, "trigger_content_update_delay");
                    int columnIndexOrThrow32 = u5.s.getColumnIndexOrThrow(dVarPrepare, "trigger_max_content_delay");
                    int columnIndexOrThrow33 = u5.s.getColumnIndexOrThrow(dVarPrepare, "content_uri_triggers");
                    ArrayList arrayList3 = new ArrayList();
                    while (dVarPrepare.step()) {
                        String text = dVarPrepare.getText(columnIndexOrThrow);
                        int i17 = columnIndexOrThrow14;
                        int i18 = columnIndexOrThrow13;
                        x0 x0VarIntToState = t0.intToState((int) dVarPrepare.getLong(columnIndexOrThrow2));
                        String text2 = dVarPrepare.getText(columnIndexOrThrow3);
                        String text3 = dVarPrepare.getText(columnIndexOrThrow4);
                        byte[] blob = dVarPrepare.getBlob(columnIndexOrThrow5);
                        b.C0007b c0007b = androidx.work.b.f7480b;
                        androidx.work.b bVarFromByteArray = c0007b.fromByteArray(blob);
                        androidx.work.b bVarFromByteArray2 = c0007b.fromByteArray(dVarPrepare.getBlob(columnIndexOrThrow6));
                        long j10 = dVarPrepare.getLong(columnIndexOrThrow7);
                        long j11 = dVarPrepare.getLong(columnIndexOrThrow8);
                        long j12 = dVarPrepare.getLong(columnIndexOrThrow9);
                        int i19 = (int) dVarPrepare.getLong(columnIndexOrThrow10);
                        int i20 = columnIndexOrThrow2;
                        int i21 = columnIndexOrThrow;
                        n6.a aVarIntToBackoffPolicy = t0.intToBackoffPolicy((int) dVarPrepare.getLong(columnIndexOrThrow11));
                        long j13 = dVarPrepare.getLong(columnIndexOrThrow12);
                        long j14 = dVarPrepare.getLong(i18);
                        long j15 = dVarPrepare.getLong(i17);
                        int i22 = columnIndexOrThrow15;
                        long j16 = dVarPrepare.getLong(i22);
                        columnIndexOrThrow15 = i22;
                        int i23 = columnIndexOrThrow16;
                        int i24 = columnIndexOrThrow3;
                        boolean z11 = ((int) dVarPrepare.getLong(i23)) != 0;
                        int i25 = columnIndexOrThrow17;
                        o0 o0VarIntToOutOfQuotaPolicy = t0.intToOutOfQuotaPolicy((int) dVarPrepare.getLong(i25));
                        columnIndexOrThrow17 = i25;
                        int i26 = columnIndexOrThrow18;
                        int i27 = (int) dVarPrepare.getLong(i26);
                        columnIndexOrThrow18 = i26;
                        int i28 = columnIndexOrThrow19;
                        int i29 = (int) dVarPrepare.getLong(i28);
                        int i30 = columnIndexOrThrow20;
                        long j17 = dVarPrepare.getLong(i30);
                        int i31 = columnIndexOrThrow21;
                        int i32 = (int) dVarPrepare.getLong(i31);
                        int i33 = columnIndexOrThrow22;
                        int i34 = (int) dVarPrepare.getLong(i33);
                        int i35 = columnIndexOrThrow23;
                        String text4 = dVarPrepare.isNull(i35) ? null : dVarPrepare.getText(i35);
                        int i36 = columnIndexOrThrow24;
                        if (dVarPrepare.isNull(i36)) {
                            i10 = i32;
                            i11 = i33;
                            numValueOf = null;
                        } else {
                            i10 = i32;
                            i11 = i33;
                            numValueOf = Integer.valueOf((int) dVarPrepare.getLong(i36));
                        }
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        columnIndexOrThrow24 = i36;
                        int i37 = columnIndexOrThrow25;
                        d0 d0VarIntToNetworkType = t0.intToNetworkType((int) dVarPrepare.getLong(i37));
                        int i38 = columnIndexOrThrow26;
                        w6.r networkRequest$work_runtime_release = t0.toNetworkRequest$work_runtime_release(dVarPrepare.getBlob(i38));
                        columnIndexOrThrow25 = i37;
                        int i39 = columnIndexOrThrow27;
                        boolean z12 = ((int) dVarPrepare.getLong(i39)) != 0;
                        columnIndexOrThrow27 = i39;
                        int i40 = columnIndexOrThrow28;
                        boolean z13 = ((int) dVarPrepare.getLong(i40)) != 0;
                        columnIndexOrThrow28 = i40;
                        int i41 = columnIndexOrThrow29;
                        boolean z14 = ((int) dVarPrepare.getLong(i41)) != 0;
                        columnIndexOrThrow29 = i41;
                        int i42 = columnIndexOrThrow30;
                        int i43 = columnIndexOrThrow31;
                        int i44 = columnIndexOrThrow32;
                        columnIndexOrThrow31 = i43;
                        int i45 = columnIndexOrThrow33;
                        columnIndexOrThrow33 = i45;
                        arrayList3.add(new b0(text, x0VarIntToState, text2, text3, bVarFromByteArray, bVarFromByteArray2, j10, j11, j12, new n6.f(networkRequest$work_runtime_release, d0VarIntToNetworkType, z12, z13, z14, ((int) dVarPrepare.getLong(i42)) != 0, dVarPrepare.getLong(i43), dVarPrepare.getLong(i44), t0.byteArrayToSetOfTriggers(dVarPrepare.getBlob(i45))), i19, aVarIntToBackoffPolicy, j13, j14, j15, j16, z11, o0VarIntToOutOfQuotaPolicy, i27, i29, j17, i10, i34, text4, boolValueOf));
                        columnIndexOrThrow32 = i44;
                        columnIndexOrThrow30 = i42;
                        columnIndexOrThrow = i21;
                        columnIndexOrThrow3 = i24;
                        columnIndexOrThrow16 = i23;
                        columnIndexOrThrow19 = i28;
                        columnIndexOrThrow20 = i30;
                        columnIndexOrThrow21 = i31;
                        columnIndexOrThrow22 = i11;
                        columnIndexOrThrow23 = i35;
                        columnIndexOrThrow13 = i18;
                        columnIndexOrThrow2 = i20;
                        columnIndexOrThrow26 = i38;
                        columnIndexOrThrow14 = i17;
                    }
                    return arrayList3;
                } finally {
                }
            case 16:
                x5.b _connection9 = (x5.b) obj;
                m0.a aVar9 = m0.f89142d;
                e0.checkNotNullParameter(_connection9, "_connection");
                dVarPrepare = _connection9.prepare("SELECT id FROM workspec");
                try {
                    ArrayList arrayList4 = new ArrayList();
                    while (dVarPrepare.step()) {
                        arrayList4.add(dVarPrepare.getText(0));
                    }
                    return arrayList4;
                } finally {
                }
            case 17:
                x5.b _connection10 = (x5.b) obj;
                m0.a aVar10 = m0.f89142d;
                e0.checkNotNullParameter(_connection10, "_connection");
                dVarPrepare = _connection10.prepare("SELECT id FROM workspec");
                try {
                    ArrayList arrayList5 = new ArrayList();
                    while (dVarPrepare.step()) {
                        arrayList5.add(dVarPrepare.getText(0));
                    }
                    return arrayList5;
                } finally {
                }
            case 18:
                x5.b _connection11 = (x5.b) obj;
                m0.a aVar11 = m0.f89142d;
                e0.checkNotNullParameter(_connection11, "_connection");
                dVarPrepare = _connection11.prepare("SELECT * FROM workspec WHERE state=1");
                try {
                    int columnIndexOrThrow34 = u5.s.getColumnIndexOrThrow(dVarPrepare, "id");
                    int columnIndexOrThrow35 = u5.s.getColumnIndexOrThrow(dVarPrepare, "state");
                    int columnIndexOrThrow36 = u5.s.getColumnIndexOrThrow(dVarPrepare, "worker_class_name");
                    int columnIndexOrThrow37 = u5.s.getColumnIndexOrThrow(dVarPrepare, "input_merger_class_name");
                    int columnIndexOrThrow38 = u5.s.getColumnIndexOrThrow(dVarPrepare, "input");
                    int columnIndexOrThrow39 = u5.s.getColumnIndexOrThrow(dVarPrepare, "output");
                    int columnIndexOrThrow40 = u5.s.getColumnIndexOrThrow(dVarPrepare, "initial_delay");
                    int columnIndexOrThrow41 = u5.s.getColumnIndexOrThrow(dVarPrepare, "interval_duration");
                    int columnIndexOrThrow42 = u5.s.getColumnIndexOrThrow(dVarPrepare, "flex_duration");
                    int columnIndexOrThrow43 = u5.s.getColumnIndexOrThrow(dVarPrepare, "run_attempt_count");
                    int columnIndexOrThrow44 = u5.s.getColumnIndexOrThrow(dVarPrepare, "backoff_policy");
                    int columnIndexOrThrow45 = u5.s.getColumnIndexOrThrow(dVarPrepare, "backoff_delay_duration");
                    int columnIndexOrThrow46 = u5.s.getColumnIndexOrThrow(dVarPrepare, "last_enqueue_time");
                    int columnIndexOrThrow47 = u5.s.getColumnIndexOrThrow(dVarPrepare, "minimum_retention_duration");
                    int columnIndexOrThrow48 = u5.s.getColumnIndexOrThrow(dVarPrepare, "schedule_requested_at");
                    int columnIndexOrThrow49 = u5.s.getColumnIndexOrThrow(dVarPrepare, "run_in_foreground");
                    int columnIndexOrThrow50 = u5.s.getColumnIndexOrThrow(dVarPrepare, "out_of_quota_policy");
                    int columnIndexOrThrow51 = u5.s.getColumnIndexOrThrow(dVarPrepare, "period_count");
                    int columnIndexOrThrow52 = u5.s.getColumnIndexOrThrow(dVarPrepare, "generation");
                    int columnIndexOrThrow53 = u5.s.getColumnIndexOrThrow(dVarPrepare, "next_schedule_time_override");
                    int columnIndexOrThrow54 = u5.s.getColumnIndexOrThrow(dVarPrepare, "next_schedule_time_override_generation");
                    int columnIndexOrThrow55 = u5.s.getColumnIndexOrThrow(dVarPrepare, "stop_reason");
                    int columnIndexOrThrow56 = u5.s.getColumnIndexOrThrow(dVarPrepare, "trace_tag");
                    int columnIndexOrThrow57 = u5.s.getColumnIndexOrThrow(dVarPrepare, "backoff_on_system_interruptions");
                    int columnIndexOrThrow58 = u5.s.getColumnIndexOrThrow(dVarPrepare, "required_network_type");
                    int columnIndexOrThrow59 = u5.s.getColumnIndexOrThrow(dVarPrepare, "required_network_request");
                    int columnIndexOrThrow60 = u5.s.getColumnIndexOrThrow(dVarPrepare, "requires_charging");
                    int columnIndexOrThrow61 = u5.s.getColumnIndexOrThrow(dVarPrepare, "requires_device_idle");
                    int columnIndexOrThrow62 = u5.s.getColumnIndexOrThrow(dVarPrepare, "requires_battery_not_low");
                    int columnIndexOrThrow63 = u5.s.getColumnIndexOrThrow(dVarPrepare, "requires_storage_not_low");
                    int columnIndexOrThrow64 = u5.s.getColumnIndexOrThrow(dVarPrepare, "trigger_content_update_delay");
                    int columnIndexOrThrow65 = u5.s.getColumnIndexOrThrow(dVarPrepare, "trigger_max_content_delay");
                    int columnIndexOrThrow66 = u5.s.getColumnIndexOrThrow(dVarPrepare, "content_uri_triggers");
                    ArrayList arrayList6 = new ArrayList();
                    while (dVarPrepare.step()) {
                        String text5 = dVarPrepare.getText(columnIndexOrThrow34);
                        int i46 = columnIndexOrThrow47;
                        int i47 = columnIndexOrThrow46;
                        x0 x0VarIntToState2 = t0.intToState((int) dVarPrepare.getLong(columnIndexOrThrow35));
                        String text6 = dVarPrepare.getText(columnIndexOrThrow36);
                        String text7 = dVarPrepare.getText(columnIndexOrThrow37);
                        byte[] blob2 = dVarPrepare.getBlob(columnIndexOrThrow38);
                        b.C0007b c0007b2 = androidx.work.b.f7480b;
                        androidx.work.b bVarFromByteArray3 = c0007b2.fromByteArray(blob2);
                        androidx.work.b bVarFromByteArray4 = c0007b2.fromByteArray(dVarPrepare.getBlob(columnIndexOrThrow39));
                        long j18 = dVarPrepare.getLong(columnIndexOrThrow40);
                        long j19 = dVarPrepare.getLong(columnIndexOrThrow41);
                        long j20 = dVarPrepare.getLong(columnIndexOrThrow42);
                        int i48 = (int) dVarPrepare.getLong(columnIndexOrThrow43);
                        int i49 = columnIndexOrThrow35;
                        int i50 = columnIndexOrThrow34;
                        n6.a aVarIntToBackoffPolicy2 = t0.intToBackoffPolicy((int) dVarPrepare.getLong(columnIndexOrThrow44));
                        long j21 = dVarPrepare.getLong(columnIndexOrThrow45);
                        long j22 = dVarPrepare.getLong(i47);
                        long j23 = dVarPrepare.getLong(i46);
                        int i51 = columnIndexOrThrow48;
                        long j24 = dVarPrepare.getLong(i51);
                        int i52 = columnIndexOrThrow36;
                        int i53 = columnIndexOrThrow49;
                        boolean z15 = ((int) dVarPrepare.getLong(i53)) != 0;
                        columnIndexOrThrow49 = i53;
                        int i54 = columnIndexOrThrow50;
                        o0 o0VarIntToOutOfQuotaPolicy2 = t0.intToOutOfQuotaPolicy((int) dVarPrepare.getLong(i54));
                        columnIndexOrThrow50 = i54;
                        int i55 = columnIndexOrThrow51;
                        int i56 = (int) dVarPrepare.getLong(i55);
                        columnIndexOrThrow51 = i55;
                        int i57 = columnIndexOrThrow52;
                        int i58 = (int) dVarPrepare.getLong(i57);
                        long j25 = dVarPrepare.getLong(columnIndexOrThrow53);
                        int i59 = columnIndexOrThrow54;
                        int i60 = (int) dVarPrepare.getLong(i59);
                        columnIndexOrThrow52 = i57;
                        columnIndexOrThrow54 = i59;
                        int i61 = columnIndexOrThrow55;
                        int i62 = (int) dVarPrepare.getLong(i61);
                        int i63 = columnIndexOrThrow56;
                        String text8 = dVarPrepare.isNull(i63) ? null : dVarPrepare.getText(i63);
                        int i64 = columnIndexOrThrow57;
                        if (dVarPrepare.isNull(i64)) {
                            i12 = i62;
                            columnIndexOrThrow56 = i63;
                            numValueOf2 = null;
                        } else {
                            i12 = i62;
                            columnIndexOrThrow56 = i63;
                            numValueOf2 = Integer.valueOf((int) dVarPrepare.getLong(i64));
                        }
                        if (numValueOf2 != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                        } else {
                            boolValueOf2 = null;
                        }
                        columnIndexOrThrow57 = i64;
                        columnIndexOrThrow55 = i61;
                        int i65 = columnIndexOrThrow58;
                        d0 d0VarIntToNetworkType2 = t0.intToNetworkType((int) dVarPrepare.getLong(i65));
                        int i66 = columnIndexOrThrow59;
                        w6.r networkRequest$work_runtime_release2 = t0.toNetworkRequest$work_runtime_release(dVarPrepare.getBlob(i66));
                        columnIndexOrThrow58 = i65;
                        int i67 = columnIndexOrThrow60;
                        boolean z16 = ((int) dVarPrepare.getLong(i67)) != 0;
                        columnIndexOrThrow59 = i66;
                        columnIndexOrThrow60 = i67;
                        int i68 = columnIndexOrThrow61;
                        boolean z17 = ((int) dVarPrepare.getLong(i68)) != 0;
                        columnIndexOrThrow61 = i68;
                        int i69 = columnIndexOrThrow62;
                        boolean z18 = ((int) dVarPrepare.getLong(i69)) != 0;
                        int i70 = columnIndexOrThrow63;
                        int i71 = columnIndexOrThrow64;
                        int i72 = columnIndexOrThrow65;
                        columnIndexOrThrow62 = i69;
                        int i73 = columnIndexOrThrow66;
                        columnIndexOrThrow66 = i73;
                        arrayList6.add(new b0(text5, x0VarIntToState2, text6, text7, bVarFromByteArray3, bVarFromByteArray4, j18, j19, j20, new n6.f(networkRequest$work_runtime_release2, d0VarIntToNetworkType2, z16, z17, z18, ((int) dVarPrepare.getLong(i70)) != 0, dVarPrepare.getLong(i71), dVarPrepare.getLong(i72), t0.byteArrayToSetOfTriggers(dVarPrepare.getBlob(i73))), i48, aVarIntToBackoffPolicy2, j21, j22, j23, j24, z15, o0VarIntToOutOfQuotaPolicy2, i56, i58, j25, i60, i12, text8, boolValueOf2));
                        columnIndexOrThrow63 = i70;
                        columnIndexOrThrow64 = i71;
                        columnIndexOrThrow65 = i72;
                        columnIndexOrThrow47 = i46;
                        columnIndexOrThrow34 = i50;
                        columnIndexOrThrow35 = i49;
                        columnIndexOrThrow36 = i52;
                        columnIndexOrThrow48 = i51;
                        columnIndexOrThrow46 = i47;
                    }
                    return arrayList6;
                } finally {
                }
            case 19:
                return a(obj);
            default:
                Long l9 = (Long) obj;
                return Long.valueOf(l9 != null ? l9.longValue() : 0L);
        }
    }
}
