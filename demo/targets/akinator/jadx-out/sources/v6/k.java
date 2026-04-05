package v6;

import java.util.ArrayList;
import java.util.List;
import n6.x0;
import o5.u1;
import uu.p1;
import v6.b0;
import v6.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f89133b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f89134c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u1 f89135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f89136f;

    public /* synthetic */ k(String str, u1 u1Var, m mVar, int i10) {
        this.f89133b = i10;
        this.f89134c = str;
        this.f89135e = u1Var;
        this.f89136f = mVar;
    }

    private final Object a(Object obj) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z10;
        int i20;
        boolean z11;
        int i21;
        boolean z12;
        int i22;
        int i23;
        int i24;
        u1 u1Var = this.f89135e;
        m mVar = this.f89136f;
        x5.b _connection = (x5.b) obj;
        m.a aVar = m.f89140b;
        kotlin.jvm.internal.e0.checkNotNullParameter(_connection, "_connection");
        x5.d dVarPrepare = _connection.prepare(this.f89134c);
        try {
            u1Var.getBindingFunction().invoke(dVarPrepare);
            int columnIndex = u5.s.getColumnIndex(dVarPrepare, "id");
            int columnIndex2 = u5.s.getColumnIndex(dVarPrepare, "state");
            int columnIndex3 = u5.s.getColumnIndex(dVarPrepare, "output");
            int columnIndex4 = u5.s.getColumnIndex(dVarPrepare, "initial_delay");
            int columnIndex5 = u5.s.getColumnIndex(dVarPrepare, "interval_duration");
            int columnIndex6 = u5.s.getColumnIndex(dVarPrepare, "flex_duration");
            int columnIndex7 = u5.s.getColumnIndex(dVarPrepare, "run_attempt_count");
            int columnIndex8 = u5.s.getColumnIndex(dVarPrepare, "backoff_policy");
            int columnIndex9 = u5.s.getColumnIndex(dVarPrepare, "backoff_delay_duration");
            int columnIndex10 = u5.s.getColumnIndex(dVarPrepare, "last_enqueue_time");
            int columnIndex11 = u5.s.getColumnIndex(dVarPrepare, "period_count");
            int columnIndex12 = u5.s.getColumnIndex(dVarPrepare, "generation");
            String str = "getValue(...)";
            int columnIndex13 = u5.s.getColumnIndex(dVarPrepare, "next_schedule_time_override");
            int columnIndex14 = u5.s.getColumnIndex(dVarPrepare, "stop_reason");
            int columnIndex15 = u5.s.getColumnIndex(dVarPrepare, "required_network_type");
            int columnIndex16 = u5.s.getColumnIndex(dVarPrepare, "required_network_request");
            int columnIndex17 = u5.s.getColumnIndex(dVarPrepare, "requires_charging");
            int columnIndex18 = u5.s.getColumnIndex(dVarPrepare, "requires_device_idle");
            int columnIndex19 = u5.s.getColumnIndex(dVarPrepare, "requires_battery_not_low");
            int columnIndex20 = u5.s.getColumnIndex(dVarPrepare, "requires_storage_not_low");
            int columnIndex21 = u5.s.getColumnIndex(dVarPrepare, "trigger_content_update_delay");
            int columnIndex22 = u5.s.getColumnIndex(dVarPrepare, "trigger_max_content_delay");
            int columnIndex23 = u5.s.getColumnIndex(dVarPrepare, "content_uri_triggers");
            z.f fVar = new z.f();
            int i25 = columnIndex12;
            z.f fVar2 = new z.f();
            while (dVarPrepare.step()) {
                int i26 = columnIndex11;
                String text = dVarPrepare.getText(columnIndex);
                if (fVar.containsKey(text)) {
                    i24 = columnIndex10;
                } else {
                    i24 = columnIndex10;
                    fVar.put(text, new ArrayList());
                }
                String text2 = dVarPrepare.getText(columnIndex);
                if (!fVar2.containsKey(text2)) {
                    fVar2.put(text2, new ArrayList());
                }
                columnIndex11 = i26;
                columnIndex10 = i24;
            }
            int i27 = columnIndex10;
            int i28 = columnIndex11;
            dVarPrepare.reset();
            mVar.b(_connection, fVar);
            mVar.a(_connection, fVar2);
            ArrayList arrayList = new ArrayList();
            while (dVarPrepare.step()) {
                if (columnIndex == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'id', found NULL value instead.");
                }
                String text3 = dVarPrepare.getText(columnIndex);
                if (columnIndex2 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'state', found NULL value instead.");
                }
                x0 x0VarIntToState = t0.intToState((int) dVarPrepare.getLong(columnIndex2));
                if (columnIndex3 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'output', found NULL value instead.");
                }
                androidx.work.b bVarFromByteArray = androidx.work.b.f7480b.fromByteArray(dVarPrepare.getBlob(columnIndex3));
                long j10 = columnIndex4 == -1 ? 0L : dVarPrepare.getLong(columnIndex4);
                long j11 = columnIndex5 == -1 ? 0L : dVarPrepare.getLong(columnIndex5);
                long j12 = columnIndex6 == -1 ? 0L : dVarPrepare.getLong(columnIndex6);
                boolean z13 = false;
                int i29 = columnIndex7 == -1 ? 0 : (int) dVarPrepare.getLong(columnIndex7);
                if (columnIndex8 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'backoff_policy', found NULL value instead.");
                }
                z.f fVar3 = fVar;
                n6.a aVarIntToBackoffPolicy = t0.intToBackoffPolicy((int) dVarPrepare.getLong(columnIndex8));
                long j13 = columnIndex9 == -1 ? 0L : dVarPrepare.getLong(columnIndex9);
                int i30 = i27;
                long j14 = i30 == -1 ? 0L : dVarPrepare.getLong(i30);
                i27 = i30;
                int i31 = i28;
                if (i31 == -1) {
                    i10 = columnIndex2;
                    i11 = columnIndex3;
                    i12 = 0;
                } else {
                    i10 = columnIndex2;
                    i11 = columnIndex3;
                    i12 = (int) dVarPrepare.getLong(i31);
                }
                int i32 = i25;
                if (i32 == -1) {
                    i13 = columnIndex4;
                    i14 = 0;
                } else {
                    i13 = columnIndex4;
                    i14 = (int) dVarPrepare.getLong(i32);
                }
                int i33 = columnIndex13;
                long j15 = i33 == -1 ? 0L : dVarPrepare.getLong(i33);
                int i34 = columnIndex14;
                if (i34 == -1) {
                    i15 = i32;
                    i16 = i33;
                    i17 = 0;
                } else {
                    i15 = i32;
                    i16 = i33;
                    i17 = (int) dVarPrepare.getLong(i34);
                }
                int i35 = columnIndex15;
                if (i35 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_type', found NULL value instead.");
                }
                n6.d0 d0VarIntToNetworkType = t0.intToNetworkType((int) dVarPrepare.getLong(i35));
                int i36 = columnIndex16;
                if (i36 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_request', found NULL value instead.");
                }
                w6.r networkRequest$work_runtime_release = t0.toNetworkRequest$work_runtime_release(dVarPrepare.getBlob(i36));
                int i37 = columnIndex17;
                if (i37 == -1) {
                    i18 = i35;
                    i19 = i36;
                    z10 = false;
                } else {
                    i18 = i35;
                    i19 = i36;
                    z10 = ((int) dVarPrepare.getLong(i37)) != 0;
                }
                int i38 = columnIndex18;
                if (i38 == -1) {
                    i20 = i37;
                    z11 = false;
                } else {
                    i20 = i37;
                    z11 = ((int) dVarPrepare.getLong(i38)) != 0;
                }
                int i39 = columnIndex19;
                if (i39 == -1) {
                    i21 = columnIndex5;
                    z12 = false;
                } else {
                    i21 = columnIndex5;
                    z12 = ((int) dVarPrepare.getLong(i39)) != 0;
                }
                int i40 = columnIndex20;
                if (i40 == -1) {
                    i22 = i38;
                    i23 = i39;
                } else {
                    i22 = i38;
                    i23 = i39;
                    if (((int) dVarPrepare.getLong(i40)) != 0) {
                        z13 = true;
                    }
                }
                int i41 = columnIndex21;
                boolean z14 = z13;
                long j16 = i41 == -1 ? 0L : dVarPrepare.getLong(i41);
                int i42 = columnIndex22;
                long j17 = i42 == -1 ? 0L : dVarPrepare.getLong(i42);
                int i43 = columnIndex23;
                if (i43 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                }
                n6.f fVar4 = new n6.f(networkRequest$work_runtime_release, d0VarIntToNetworkType, z10, z11, z12, z14, j16, j17, t0.byteArrayToSetOfTriggers(dVarPrepare.getBlob(i43)));
                Object value = p1.getValue(fVar3, dVarPrepare.getText(columnIndex));
                columnIndex23 = i43;
                String str2 = str;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(value, str2);
                List list = (List) value;
                Object value2 = p1.getValue(fVar2, dVarPrepare.getText(columnIndex));
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(value2, str2);
                arrayList.add(new b0.c(text3, x0VarIntToState, bVarFromByteArray, j10, j11, j12, fVar4, i29, aVarIntToBackoffPolicy, j13, j14, i12, i14, j15, i17, list, (List) value2));
                int i44 = i23;
                columnIndex20 = i40;
                columnIndex4 = i13;
                i25 = i15;
                columnIndex13 = i16;
                columnIndex14 = i34;
                columnIndex15 = i18;
                columnIndex17 = i20;
                columnIndex18 = i22;
                columnIndex5 = i21;
                columnIndex19 = i44;
                str = str2;
                columnIndex21 = i41;
                columnIndex22 = i42;
                fVar = fVar3;
                columnIndex2 = i10;
                columnIndex3 = i11;
                i28 = i31;
                columnIndex16 = i19;
            }
            dVarPrepare.close();
            return arrayList;
        } catch (Throwable th2) {
            dVarPrepare.close();
            throw th2;
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // kv.l
    public final Object invoke(Object obj) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z10;
        int i20;
        int i21;
        boolean z11;
        int i22;
        int i23;
        boolean z12;
        int i24;
        int i25;
        boolean z13;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        boolean z14;
        int i38;
        int i39;
        boolean z15;
        int i40;
        int i41;
        boolean z16;
        int i42;
        int i43;
        boolean z17;
        int i44;
        int i45;
        int i46 = this.f89133b;
        String str = "getValue(...)";
        m mVar = this.f89136f;
        u1 u1Var = this.f89135e;
        String str2 = this.f89134c;
        switch (i46) {
            case 0:
                x5.b _connection = (x5.b) obj;
                m.a aVar = m.f89140b;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection, "_connection");
                x5.d dVarPrepare = _connection.prepare(str2);
                try {
                    u1Var.getBindingFunction().invoke(dVarPrepare);
                    int columnIndex = u5.s.getColumnIndex(dVarPrepare, "id");
                    int columnIndex2 = u5.s.getColumnIndex(dVarPrepare, "state");
                    int columnIndex3 = u5.s.getColumnIndex(dVarPrepare, "output");
                    int columnIndex4 = u5.s.getColumnIndex(dVarPrepare, "initial_delay");
                    int columnIndex5 = u5.s.getColumnIndex(dVarPrepare, "interval_duration");
                    int columnIndex6 = u5.s.getColumnIndex(dVarPrepare, "flex_duration");
                    int columnIndex7 = u5.s.getColumnIndex(dVarPrepare, "run_attempt_count");
                    int columnIndex8 = u5.s.getColumnIndex(dVarPrepare, "backoff_policy");
                    int columnIndex9 = u5.s.getColumnIndex(dVarPrepare, "backoff_delay_duration");
                    int columnIndex10 = u5.s.getColumnIndex(dVarPrepare, "last_enqueue_time");
                    int columnIndex11 = u5.s.getColumnIndex(dVarPrepare, "period_count");
                    int columnIndex12 = u5.s.getColumnIndex(dVarPrepare, "generation");
                    int columnIndex13 = u5.s.getColumnIndex(dVarPrepare, "next_schedule_time_override");
                    int columnIndex14 = u5.s.getColumnIndex(dVarPrepare, "stop_reason");
                    int columnIndex15 = u5.s.getColumnIndex(dVarPrepare, "required_network_type");
                    int columnIndex16 = u5.s.getColumnIndex(dVarPrepare, "required_network_request");
                    int columnIndex17 = u5.s.getColumnIndex(dVarPrepare, "requires_charging");
                    int columnIndex18 = u5.s.getColumnIndex(dVarPrepare, "requires_device_idle");
                    int columnIndex19 = u5.s.getColumnIndex(dVarPrepare, "requires_battery_not_low");
                    int columnIndex20 = u5.s.getColumnIndex(dVarPrepare, "requires_storage_not_low");
                    int columnIndex21 = u5.s.getColumnIndex(dVarPrepare, "trigger_content_update_delay");
                    int columnIndex22 = u5.s.getColumnIndex(dVarPrepare, "trigger_max_content_delay");
                    int columnIndex23 = u5.s.getColumnIndex(dVarPrepare, "content_uri_triggers");
                    z.f fVar = new z.f();
                    int i47 = columnIndex13;
                    z.f fVar2 = new z.f();
                    while (dVarPrepare.step()) {
                        int i48 = columnIndex12;
                        String text = dVarPrepare.getText(columnIndex);
                        if (fVar.containsKey(text)) {
                            i27 = columnIndex11;
                        } else {
                            i27 = columnIndex11;
                            fVar.put(text, new ArrayList());
                        }
                        String text2 = dVarPrepare.getText(columnIndex);
                        if (!fVar2.containsKey(text2)) {
                            fVar2.put(text2, new ArrayList());
                        }
                        columnIndex12 = i48;
                        columnIndex11 = i27;
                    }
                    int i49 = columnIndex12;
                    int i50 = columnIndex11;
                    dVarPrepare.reset();
                    mVar.b(_connection, fVar);
                    mVar.a(_connection, fVar2);
                    ArrayList arrayList = new ArrayList();
                    while (dVarPrepare.step()) {
                        if (columnIndex == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'id', found NULL value instead.");
                        }
                        String text3 = dVarPrepare.getText(columnIndex);
                        if (columnIndex2 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'state', found NULL value instead.");
                        }
                        x0 x0VarIntToState = t0.intToState((int) dVarPrepare.getLong(columnIndex2));
                        if (columnIndex3 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'output', found NULL value instead.");
                        }
                        androidx.work.b bVarFromByteArray = androidx.work.b.f7480b.fromByteArray(dVarPrepare.getBlob(columnIndex3));
                        int i51 = -1;
                        long j10 = columnIndex4 == -1 ? 0L : dVarPrepare.getLong(columnIndex4);
                        long j11 = columnIndex5 == -1 ? 0L : dVarPrepare.getLong(columnIndex5);
                        long j12 = columnIndex6 == -1 ? 0L : dVarPrepare.getLong(columnIndex6);
                        if (columnIndex7 == -1) {
                            i10 = 0;
                        } else {
                            i10 = (int) dVarPrepare.getLong(columnIndex7);
                            i51 = -1;
                        }
                        if (columnIndex8 == i51) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'backoff_policy', found NULL value instead.");
                        }
                        n6.a aVarIntToBackoffPolicy = t0.intToBackoffPolicy((int) dVarPrepare.getLong(columnIndex8));
                        long j13 = columnIndex9 == -1 ? 0L : dVarPrepare.getLong(columnIndex9);
                        long j14 = columnIndex10 == -1 ? 0L : dVarPrepare.getLong(columnIndex10);
                        int i52 = i50;
                        if (i52 == -1) {
                            i11 = columnIndex10;
                            i12 = columnIndex9;
                            i13 = 0;
                        } else {
                            i11 = columnIndex10;
                            i12 = columnIndex9;
                            i13 = (int) dVarPrepare.getLong(i52);
                        }
                        int i53 = i49;
                        if (i53 == -1) {
                            i15 = -1;
                            i50 = i52;
                            i14 = 0;
                        } else {
                            i50 = i52;
                            i14 = (int) dVarPrepare.getLong(i53);
                            i15 = -1;
                        }
                        int i54 = i47;
                        long j15 = i54 == i15 ? 0L : dVarPrepare.getLong(i54);
                        int i55 = columnIndex14;
                        if (i55 == i15) {
                            i16 = columnIndex8;
                            i17 = 0;
                            i18 = i15;
                        } else {
                            i16 = columnIndex8;
                            i17 = (int) dVarPrepare.getLong(i55);
                            i18 = -1;
                        }
                        int i56 = columnIndex15;
                        if (i56 == i18) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_type', found NULL value instead.");
                        }
                        int i57 = columnIndex7;
                        n6.d0 d0VarIntToNetworkType = t0.intToNetworkType((int) dVarPrepare.getLong(i56));
                        int i58 = columnIndex16;
                        if (i58 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_request', found NULL value instead.");
                        }
                        w6.r networkRequest$work_runtime_release = t0.toNetworkRequest$work_runtime_release(dVarPrepare.getBlob(i58));
                        i47 = i54;
                        int i59 = columnIndex17;
                        if (i59 == -1) {
                            i19 = columnIndex6;
                            z10 = false;
                            i20 = -1;
                        } else {
                            i19 = columnIndex6;
                            z10 = ((int) dVarPrepare.getLong(i59)) != 0;
                            i20 = -1;
                        }
                        int i60 = columnIndex18;
                        if (i60 == i20) {
                            i21 = columnIndex5;
                            z11 = false;
                            i22 = i20;
                        } else {
                            i21 = columnIndex5;
                            z11 = ((int) dVarPrepare.getLong(i60)) != 0;
                            i22 = -1;
                        }
                        int i61 = columnIndex19;
                        if (i61 == i22) {
                            i23 = columnIndex4;
                            z12 = false;
                            i24 = i22;
                        } else {
                            i23 = columnIndex4;
                            z12 = ((int) dVarPrepare.getLong(i61)) != 0;
                            i24 = -1;
                        }
                        int i62 = columnIndex20;
                        if (i62 == i24) {
                            i25 = columnIndex3;
                            z13 = false;
                            i26 = i24;
                        } else {
                            i25 = columnIndex3;
                            z13 = ((int) dVarPrepare.getLong(i62)) != 0;
                            i26 = -1;
                        }
                        int i63 = columnIndex21;
                        long j16 = i63 == i26 ? 0L : dVarPrepare.getLong(i63);
                        int i64 = columnIndex22;
                        long j17 = i64 == i26 ? 0L : dVarPrepare.getLong(i64);
                        columnIndex22 = i64;
                        int i65 = columnIndex23;
                        if (i65 == i26) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                        }
                        n6.f fVar3 = new n6.f(networkRequest$work_runtime_release, d0VarIntToNetworkType, z10, z11, z12, z13, j16, j17, t0.byteArrayToSetOfTriggers(dVarPrepare.getBlob(i65)));
                        Object value = p1.getValue(fVar, dVarPrepare.getText(columnIndex));
                        columnIndex23 = i65;
                        String str3 = str;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(value, str3);
                        Object value2 = p1.getValue(fVar2, dVarPrepare.getText(columnIndex));
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(value2, str3);
                        arrayList.add(new b0.c(text3, x0VarIntToState, bVarFromByteArray, j10, j11, j12, fVar3, i10, aVarIntToBackoffPolicy, j13, j14, i13, i14, j15, i17, (List) value, (List) value2));
                        columnIndex20 = i62;
                        columnIndex5 = i21;
                        columnIndex17 = i59;
                        i49 = i53;
                        columnIndex21 = i63;
                        columnIndex10 = i11;
                        columnIndex4 = i23;
                        columnIndex3 = i25;
                        columnIndex18 = i60;
                        columnIndex19 = i61;
                        columnIndex7 = i57;
                        columnIndex6 = i19;
                        columnIndex15 = i56;
                        columnIndex16 = i58;
                        columnIndex9 = i12;
                        columnIndex8 = i16;
                        columnIndex14 = i55;
                        str = str3;
                    }
                    dVarPrepare.close();
                    return arrayList;
                } catch (Throwable th2) {
                    dVarPrepare.close();
                    throw th2;
                }
            case 1:
                return a(obj);
            default:
                x5.b _connection2 = (x5.b) obj;
                m.a aVar2 = m.f89140b;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection2, "_connection");
                x5.d dVarPrepare2 = _connection2.prepare(str2);
                try {
                    u1Var.getBindingFunction().invoke(dVarPrepare2);
                    int columnIndex24 = u5.s.getColumnIndex(dVarPrepare2, "id");
                    int columnIndex25 = u5.s.getColumnIndex(dVarPrepare2, "state");
                    int columnIndex26 = u5.s.getColumnIndex(dVarPrepare2, "output");
                    int columnIndex27 = u5.s.getColumnIndex(dVarPrepare2, "initial_delay");
                    int columnIndex28 = u5.s.getColumnIndex(dVarPrepare2, "interval_duration");
                    int columnIndex29 = u5.s.getColumnIndex(dVarPrepare2, "flex_duration");
                    int columnIndex30 = u5.s.getColumnIndex(dVarPrepare2, "run_attempt_count");
                    int columnIndex31 = u5.s.getColumnIndex(dVarPrepare2, "backoff_policy");
                    int columnIndex32 = u5.s.getColumnIndex(dVarPrepare2, "backoff_delay_duration");
                    int columnIndex33 = u5.s.getColumnIndex(dVarPrepare2, "last_enqueue_time");
                    int columnIndex34 = u5.s.getColumnIndex(dVarPrepare2, "period_count");
                    int columnIndex35 = u5.s.getColumnIndex(dVarPrepare2, "generation");
                    int columnIndex36 = u5.s.getColumnIndex(dVarPrepare2, "next_schedule_time_override");
                    int columnIndex37 = u5.s.getColumnIndex(dVarPrepare2, "stop_reason");
                    int columnIndex38 = u5.s.getColumnIndex(dVarPrepare2, "required_network_type");
                    int columnIndex39 = u5.s.getColumnIndex(dVarPrepare2, "required_network_request");
                    int columnIndex40 = u5.s.getColumnIndex(dVarPrepare2, "requires_charging");
                    int columnIndex41 = u5.s.getColumnIndex(dVarPrepare2, "requires_device_idle");
                    int columnIndex42 = u5.s.getColumnIndex(dVarPrepare2, "requires_battery_not_low");
                    int columnIndex43 = u5.s.getColumnIndex(dVarPrepare2, "requires_storage_not_low");
                    int columnIndex44 = u5.s.getColumnIndex(dVarPrepare2, "trigger_content_update_delay");
                    int columnIndex45 = u5.s.getColumnIndex(dVarPrepare2, "trigger_max_content_delay");
                    int columnIndex46 = u5.s.getColumnIndex(dVarPrepare2, "content_uri_triggers");
                    z.f fVar4 = new z.f();
                    int i66 = columnIndex36;
                    z.f fVar5 = new z.f();
                    while (dVarPrepare2.step()) {
                        int i67 = columnIndex35;
                        String text4 = dVarPrepare2.getText(columnIndex24);
                        if (fVar4.containsKey(text4)) {
                            i45 = columnIndex34;
                        } else {
                            i45 = columnIndex34;
                            fVar4.put(text4, new ArrayList());
                        }
                        String text5 = dVarPrepare2.getText(columnIndex24);
                        if (!fVar5.containsKey(text5)) {
                            fVar5.put(text5, new ArrayList());
                        }
                        columnIndex35 = i67;
                        columnIndex34 = i45;
                    }
                    int i68 = columnIndex35;
                    int i69 = columnIndex34;
                    dVarPrepare2.reset();
                    mVar.b(_connection2, fVar4);
                    mVar.a(_connection2, fVar5);
                    ArrayList arrayList2 = new ArrayList();
                    while (dVarPrepare2.step()) {
                        if (columnIndex24 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'id', found NULL value instead.");
                        }
                        String text6 = dVarPrepare2.getText(columnIndex24);
                        if (columnIndex25 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'state', found NULL value instead.");
                        }
                        x0 x0VarIntToState2 = t0.intToState((int) dVarPrepare2.getLong(columnIndex25));
                        if (columnIndex26 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'output', found NULL value instead.");
                        }
                        androidx.work.b bVarFromByteArray2 = androidx.work.b.f7480b.fromByteArray(dVarPrepare2.getBlob(columnIndex26));
                        int i70 = -1;
                        long j18 = columnIndex27 == -1 ? 0L : dVarPrepare2.getLong(columnIndex27);
                        long j19 = columnIndex28 == -1 ? 0L : dVarPrepare2.getLong(columnIndex28);
                        long j20 = columnIndex29 == -1 ? 0L : dVarPrepare2.getLong(columnIndex29);
                        if (columnIndex30 == -1) {
                            i28 = 0;
                        } else {
                            i28 = (int) dVarPrepare2.getLong(columnIndex30);
                            i70 = -1;
                        }
                        if (columnIndex31 == i70) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'backoff_policy', found NULL value instead.");
                        }
                        n6.a aVarIntToBackoffPolicy2 = t0.intToBackoffPolicy((int) dVarPrepare2.getLong(columnIndex31));
                        long j21 = columnIndex32 == -1 ? 0L : dVarPrepare2.getLong(columnIndex32);
                        long j22 = columnIndex33 == -1 ? 0L : dVarPrepare2.getLong(columnIndex33);
                        int i71 = i69;
                        if (i71 == -1) {
                            i29 = columnIndex33;
                            i30 = columnIndex32;
                            i31 = 0;
                        } else {
                            i29 = columnIndex33;
                            i30 = columnIndex32;
                            i31 = (int) dVarPrepare2.getLong(i71);
                        }
                        int i72 = i68;
                        if (i72 == -1) {
                            i32 = i71;
                            i33 = 0;
                            i34 = -1;
                        } else {
                            i32 = i71;
                            i33 = (int) dVarPrepare2.getLong(i72);
                            i34 = -1;
                        }
                        int i73 = i66;
                        long j23 = i73 == i34 ? 0L : dVarPrepare2.getLong(i73);
                        i66 = i73;
                        int i74 = columnIndex37;
                        if (i74 == i34) {
                            i68 = i72;
                            i35 = 0;
                            i36 = i34;
                        } else {
                            i68 = i72;
                            i35 = (int) dVarPrepare2.getLong(i74);
                            i36 = -1;
                        }
                        int i75 = columnIndex38;
                        if (i75 == i36) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_type', found NULL value instead.");
                        }
                        int i76 = i32;
                        n6.d0 d0VarIntToNetworkType2 = t0.intToNetworkType((int) dVarPrepare2.getLong(i75));
                        int i77 = columnIndex39;
                        if (i77 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_request', found NULL value instead.");
                        }
                        w6.r networkRequest$work_runtime_release2 = t0.toNetworkRequest$work_runtime_release(dVarPrepare2.getBlob(i77));
                        int i78 = columnIndex40;
                        if (i78 == -1) {
                            i37 = columnIndex31;
                            z14 = false;
                            i38 = -1;
                        } else {
                            i37 = columnIndex31;
                            z14 = ((int) dVarPrepare2.getLong(i78)) != 0;
                            i38 = -1;
                        }
                        int i79 = columnIndex41;
                        if (i79 == i38) {
                            i39 = columnIndex30;
                            z15 = false;
                            i40 = i38;
                        } else {
                            i39 = columnIndex30;
                            z15 = ((int) dVarPrepare2.getLong(i79)) != 0;
                            i40 = -1;
                        }
                        int i80 = columnIndex42;
                        if (i80 == i40) {
                            i41 = columnIndex29;
                            z16 = false;
                            i42 = i40;
                        } else {
                            i41 = columnIndex29;
                            z16 = ((int) dVarPrepare2.getLong(i80)) != 0;
                            i42 = -1;
                        }
                        int i81 = columnIndex43;
                        if (i81 == i42) {
                            i43 = columnIndex28;
                            z17 = false;
                            i44 = i42;
                        } else {
                            i43 = columnIndex28;
                            z17 = ((int) dVarPrepare2.getLong(i81)) != 0;
                            i44 = -1;
                        }
                        int i82 = columnIndex44;
                        long j24 = i82 == i44 ? 0L : dVarPrepare2.getLong(i82);
                        int i83 = columnIndex45;
                        long j25 = i83 == i44 ? 0L : dVarPrepare2.getLong(i83);
                        columnIndex45 = i83;
                        int i84 = columnIndex46;
                        if (i84 == i44) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                        }
                        n6.f fVar6 = new n6.f(networkRequest$work_runtime_release2, d0VarIntToNetworkType2, z14, z15, z16, z17, j24, j25, t0.byteArrayToSetOfTriggers(dVarPrepare2.getBlob(i84)));
                        Object value3 = p1.getValue(fVar4, dVarPrepare2.getText(columnIndex24));
                        columnIndex46 = i84;
                        String str4 = str;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(value3, str4);
                        Object value4 = p1.getValue(fVar5, dVarPrepare2.getText(columnIndex24));
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(value4, str4);
                        arrayList2.add(new b0.c(text6, x0VarIntToState2, bVarFromByteArray2, j18, j19, j20, fVar6, i28, aVarIntToBackoffPolicy2, j21, j22, i31, i33, j23, i35, (List) value3, (List) value4));
                        columnIndex43 = i81;
                        columnIndex30 = i39;
                        columnIndex40 = i78;
                        columnIndex44 = i82;
                        columnIndex29 = i41;
                        columnIndex28 = i43;
                        columnIndex41 = i79;
                        columnIndex42 = i80;
                        columnIndex32 = i30;
                        columnIndex31 = i37;
                        columnIndex39 = i77;
                        columnIndex33 = i29;
                        i69 = i76;
                        columnIndex37 = i74;
                        columnIndex38 = i75;
                        str = str4;
                    }
                    dVarPrepare2.close();
                    return arrayList2;
                } catch (Throwable th3) {
                    dVarPrepare2.close();
                    throw th3;
                }
        }
    }
}
