package rv;

import androidx.work.b;
import b0.e2;
import java.util.ArrayList;
import v6.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class e0 implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f85005b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f85006c;

    public /* synthetic */ e0(int i10, int i11) {
        this.f85005b = i11;
        this.f85006c = i10;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        x5.d dVarPrepare;
        int i10;
        int i11;
        Integer numValueOf;
        Boolean boolValueOf;
        int i12;
        int i13;
        Integer numValueOf2;
        Boolean boolValueOf2;
        int i14 = this.f85005b;
        int i15 = this.f85006c;
        switch (i14) {
            case 0:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException(e2.h('.', "Sequence doesn't contain element at index ", i15));
            case 1:
                y5.c db2 = (y5.c) obj;
                kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
                db2.setMaxSqlCacheSize(i15);
                return tu.x0.f87415a;
            case 2:
                y5.c db3 = (y5.c) obj;
                kotlin.jvm.internal.e0.checkNotNullParameter(db3, "db");
                db3.setVersion(i15);
                return tu.x0.f87415a;
            case 3:
                y5.c db4 = (y5.c) obj;
                kotlin.jvm.internal.e0.checkNotNullParameter(db4, "db");
                return Boolean.valueOf(db4.needUpgrade(i15));
            case 4:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException(e2.h('.', "Collection doesn't contain element at index ", i15));
            case 5:
                x5.b _connection = (x5.b) obj;
                m0.a aVar = v6.m0.f89142d;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection, "_connection");
                dVarPrepare = _connection.prepare("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
                try {
                    dVarPrepare.bindLong(1, i15);
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
                        int i16 = columnIndexOrThrow14;
                        ArrayList arrayList2 = arrayList;
                        n6.x0 x0VarIntToState = v6.t0.intToState((int) dVarPrepare.getLong(columnIndexOrThrow2));
                        String text2 = dVarPrepare.getText(columnIndexOrThrow3);
                        String text3 = dVarPrepare.getText(columnIndexOrThrow4);
                        byte[] blob = dVarPrepare.getBlob(columnIndexOrThrow5);
                        b.C0007b c0007b = androidx.work.b.f7480b;
                        androidx.work.b bVarFromByteArray = c0007b.fromByteArray(blob);
                        androidx.work.b bVarFromByteArray2 = c0007b.fromByteArray(dVarPrepare.getBlob(columnIndexOrThrow6));
                        long j10 = dVarPrepare.getLong(columnIndexOrThrow7);
                        long j11 = dVarPrepare.getLong(columnIndexOrThrow8);
                        long j12 = dVarPrepare.getLong(columnIndexOrThrow9);
                        int i17 = (int) dVarPrepare.getLong(columnIndexOrThrow10);
                        int i18 = columnIndexOrThrow2;
                        int i19 = columnIndexOrThrow3;
                        n6.a aVarIntToBackoffPolicy = v6.t0.intToBackoffPolicy((int) dVarPrepare.getLong(columnIndexOrThrow11));
                        long j13 = dVarPrepare.getLong(columnIndexOrThrow12);
                        long j14 = dVarPrepare.getLong(columnIndexOrThrow13);
                        long j15 = dVarPrepare.getLong(i16);
                        int i20 = columnIndexOrThrow15;
                        long j16 = dVarPrepare.getLong(i20);
                        int i21 = columnIndexOrThrow;
                        int i22 = columnIndexOrThrow16;
                        boolean z10 = ((int) dVarPrepare.getLong(i22)) != 0;
                        int i23 = columnIndexOrThrow4;
                        int i24 = columnIndexOrThrow17;
                        int i25 = columnIndexOrThrow5;
                        n6.o0 o0VarIntToOutOfQuotaPolicy = v6.t0.intToOutOfQuotaPolicy((int) dVarPrepare.getLong(i24));
                        int i26 = columnIndexOrThrow18;
                        int i27 = (int) dVarPrepare.getLong(i26);
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
                            i10 = i35;
                            i11 = i33;
                            numValueOf = null;
                        } else {
                            i10 = i35;
                            i11 = i33;
                            numValueOf = Integer.valueOf((int) dVarPrepare.getLong(i36));
                        }
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        int i37 = columnIndexOrThrow25;
                        n6.d0 d0VarIntToNetworkType = v6.t0.intToNetworkType((int) dVarPrepare.getLong(i37));
                        int i38 = columnIndexOrThrow26;
                        w6.r networkRequest$work_runtime_release = v6.t0.toNetworkRequest$work_runtime_release(dVarPrepare.getBlob(i38));
                        int i39 = columnIndexOrThrow27;
                        boolean z11 = ((int) dVarPrepare.getLong(i39)) != 0;
                        int i40 = columnIndexOrThrow28;
                        boolean z12 = ((int) dVarPrepare.getLong(i40)) != 0;
                        int i41 = columnIndexOrThrow29;
                        boolean z13 = ((int) dVarPrepare.getLong(i41)) != 0;
                        columnIndexOrThrow29 = i41;
                        int i42 = columnIndexOrThrow30;
                        int i43 = columnIndexOrThrow31;
                        int i44 = columnIndexOrThrow32;
                        columnIndexOrThrow31 = i43;
                        int i45 = columnIndexOrThrow33;
                        columnIndexOrThrow33 = i45;
                        arrayList2.add(new v6.b0(text, x0VarIntToState, text2, text3, bVarFromByteArray, bVarFromByteArray2, j10, j11, j12, new n6.f(networkRequest$work_runtime_release, d0VarIntToNetworkType, z11, z12, z13, ((int) dVarPrepare.getLong(i42)) != 0, dVarPrepare.getLong(i43), dVarPrepare.getLong(i44), v6.t0.byteArrayToSetOfTriggers(dVarPrepare.getBlob(i45))), i17, aVarIntToBackoffPolicy, j13, j14, j15, j16, z10, o0VarIntToOutOfQuotaPolicy, i27, i29, j17, i32, i34, text4, boolValueOf));
                        arrayList = arrayList2;
                        columnIndexOrThrow2 = i18;
                        columnIndexOrThrow32 = i44;
                        columnIndexOrThrow30 = i42;
                        columnIndexOrThrow4 = i23;
                        columnIndexOrThrow20 = i30;
                        columnIndexOrThrow27 = i39;
                        columnIndexOrThrow14 = i16;
                        columnIndexOrThrow3 = i19;
                        columnIndexOrThrow28 = i40;
                        columnIndexOrThrow5 = i25;
                        columnIndexOrThrow17 = i24;
                        columnIndexOrThrow18 = i26;
                        columnIndexOrThrow19 = i28;
                        columnIndexOrThrow21 = i31;
                        columnIndexOrThrow22 = i11;
                        columnIndexOrThrow23 = i10;
                        columnIndexOrThrow24 = i36;
                        columnIndexOrThrow25 = i37;
                        columnIndexOrThrow26 = i38;
                        columnIndexOrThrow = i21;
                        columnIndexOrThrow15 = i20;
                        columnIndexOrThrow16 = i22;
                    }
                    ArrayList arrayList3 = arrayList;
                    dVarPrepare.close();
                    return arrayList3;
                } finally {
                }
            default:
                x5.b _connection2 = (x5.b) obj;
                m0.a aVar2 = v6.m0.f89142d;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection2, "_connection");
                dVarPrepare = _connection2.prepare("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
                try {
                    dVarPrepare.bindLong(1, i15);
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
                    ArrayList arrayList4 = new ArrayList();
                    while (dVarPrepare.step()) {
                        String text5 = dVarPrepare.getText(columnIndexOrThrow34);
                        int i46 = columnIndexOrThrow47;
                        ArrayList arrayList5 = arrayList4;
                        n6.x0 x0VarIntToState2 = v6.t0.intToState((int) dVarPrepare.getLong(columnIndexOrThrow35));
                        String text6 = dVarPrepare.getText(columnIndexOrThrow36);
                        String text7 = dVarPrepare.getText(columnIndexOrThrow37);
                        byte[] blob2 = dVarPrepare.getBlob(columnIndexOrThrow38);
                        b.C0007b c0007b2 = androidx.work.b.f7480b;
                        androidx.work.b bVarFromByteArray3 = c0007b2.fromByteArray(blob2);
                        androidx.work.b bVarFromByteArray4 = c0007b2.fromByteArray(dVarPrepare.getBlob(columnIndexOrThrow39));
                        long j18 = dVarPrepare.getLong(columnIndexOrThrow40);
                        long j19 = dVarPrepare.getLong(columnIndexOrThrow41);
                        long j20 = dVarPrepare.getLong(columnIndexOrThrow42);
                        int i47 = (int) dVarPrepare.getLong(columnIndexOrThrow43);
                        int i48 = columnIndexOrThrow34;
                        int i49 = columnIndexOrThrow36;
                        n6.a aVarIntToBackoffPolicy2 = v6.t0.intToBackoffPolicy((int) dVarPrepare.getLong(columnIndexOrThrow44));
                        long j21 = dVarPrepare.getLong(columnIndexOrThrow45);
                        long j22 = dVarPrepare.getLong(columnIndexOrThrow46);
                        long j23 = dVarPrepare.getLong(i46);
                        int i50 = columnIndexOrThrow48;
                        long j24 = dVarPrepare.getLong(i50);
                        columnIndexOrThrow48 = i50;
                        int i51 = columnIndexOrThrow49;
                        boolean z14 = ((int) dVarPrepare.getLong(i51)) != 0;
                        int i52 = columnIndexOrThrow37;
                        int i53 = columnIndexOrThrow50;
                        n6.o0 o0VarIntToOutOfQuotaPolicy2 = v6.t0.intToOutOfQuotaPolicy((int) dVarPrepare.getLong(i53));
                        int i54 = columnIndexOrThrow38;
                        int i55 = columnIndexOrThrow51;
                        int i56 = (int) dVarPrepare.getLong(i55);
                        int i57 = columnIndexOrThrow52;
                        int i58 = (int) dVarPrepare.getLong(i57);
                        int i59 = columnIndexOrThrow53;
                        long j25 = dVarPrepare.getLong(i59);
                        int i60 = columnIndexOrThrow35;
                        int i61 = columnIndexOrThrow54;
                        int i62 = (int) dVarPrepare.getLong(i61);
                        int i63 = columnIndexOrThrow55;
                        int i64 = (int) dVarPrepare.getLong(i63);
                        int i65 = columnIndexOrThrow56;
                        String text8 = dVarPrepare.isNull(i65) ? null : dVarPrepare.getText(i65);
                        int i66 = columnIndexOrThrow57;
                        if (dVarPrepare.isNull(i66)) {
                            i12 = i62;
                            i13 = i63;
                            numValueOf2 = null;
                        } else {
                            i12 = i62;
                            i13 = i63;
                            numValueOf2 = Integer.valueOf((int) dVarPrepare.getLong(i66));
                        }
                        if (numValueOf2 != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                        } else {
                            boolValueOf2 = null;
                        }
                        int i67 = columnIndexOrThrow58;
                        n6.d0 d0VarIntToNetworkType2 = v6.t0.intToNetworkType((int) dVarPrepare.getLong(i67));
                        int i68 = columnIndexOrThrow59;
                        w6.r networkRequest$work_runtime_release2 = v6.t0.toNetworkRequest$work_runtime_release(dVarPrepare.getBlob(i68));
                        columnIndexOrThrow58 = i67;
                        columnIndexOrThrow59 = i68;
                        int i69 = columnIndexOrThrow60;
                        boolean z15 = ((int) dVarPrepare.getLong(i69)) != 0;
                        columnIndexOrThrow60 = i69;
                        int i70 = columnIndexOrThrow61;
                        boolean z16 = ((int) dVarPrepare.getLong(i70)) != 0;
                        int i71 = columnIndexOrThrow62;
                        boolean z17 = ((int) dVarPrepare.getLong(i71)) != 0;
                        columnIndexOrThrow62 = i71;
                        int i72 = columnIndexOrThrow63;
                        int i73 = columnIndexOrThrow64;
                        int i74 = columnIndexOrThrow65;
                        int i75 = columnIndexOrThrow66;
                        columnIndexOrThrow66 = i75;
                        arrayList5.add(new v6.b0(text5, x0VarIntToState2, text6, text7, bVarFromByteArray3, bVarFromByteArray4, j18, j19, j20, new n6.f(networkRequest$work_runtime_release2, d0VarIntToNetworkType2, z15, z16, z17, ((int) dVarPrepare.getLong(i72)) != 0, dVarPrepare.getLong(i73), dVarPrepare.getLong(i74), v6.t0.byteArrayToSetOfTriggers(dVarPrepare.getBlob(i75))), i47, aVarIntToBackoffPolicy2, j21, j22, j23, j24, z14, o0VarIntToOutOfQuotaPolicy2, i56, i58, j25, i12, i64, text8, boolValueOf2));
                        arrayList4 = arrayList5;
                        columnIndexOrThrow35 = i60;
                        columnIndexOrThrow53 = i59;
                        columnIndexOrThrow54 = i61;
                        columnIndexOrThrow56 = i65;
                        columnIndexOrThrow61 = i70;
                        columnIndexOrThrow38 = i54;
                        columnIndexOrThrow50 = i53;
                        columnIndexOrThrow51 = i55;
                        columnIndexOrThrow52 = i57;
                        columnIndexOrThrow55 = i13;
                        columnIndexOrThrow57 = i66;
                        columnIndexOrThrow63 = i72;
                        columnIndexOrThrow37 = i52;
                        columnIndexOrThrow49 = i51;
                        columnIndexOrThrow64 = i73;
                        columnIndexOrThrow65 = i74;
                        columnIndexOrThrow47 = i46;
                        columnIndexOrThrow34 = i48;
                        columnIndexOrThrow36 = i49;
                    }
                    ArrayList arrayList6 = arrayList4;
                    dVarPrepare.close();
                    return arrayList6;
                } finally {
                }
        }
    }
}
