package v6;

import java.util.ArrayList;
import java.util.List;
import n6.x0;
import uu.p1;
import v6.b0;
import v6.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f89112b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f89113c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0 f89114e;

    public /* synthetic */ e0(String str, m0 m0Var, int i10) {
        this.f89112b = i10;
        this.f89113c = str;
        this.f89114e = m0Var;
    }

    private final Object a(Object obj) {
        int i10;
        String str = this.f89113c;
        m0 m0Var = this.f89114e;
        x5.b _connection = (x5.b) obj;
        m0.a aVar = m0.f89142d;
        kotlin.jvm.internal.e0.checkNotNullParameter(_connection, "_connection");
        x5.d dVarPrepare = _connection.prepare("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        int i11 = 1;
        try {
            dVarPrepare.bindText(1, str);
            z.f fVar = new z.f();
            z.f fVar2 = new z.f();
            while (true) {
                i10 = 0;
                if (!dVarPrepare.step()) {
                    break;
                }
                String text = dVarPrepare.getText(0);
                if (!fVar.containsKey(text)) {
                    fVar.put(text, new ArrayList());
                }
                String text2 = dVarPrepare.getText(0);
                if (!fVar2.containsKey(text2)) {
                    fVar2.put(text2, new ArrayList());
                }
            }
            dVarPrepare.reset();
            m0Var.b(_connection, fVar);
            m0Var.a(_connection, fVar2);
            ArrayList arrayList = new ArrayList();
            while (dVarPrepare.step()) {
                String text3 = dVarPrepare.getText(i10);
                x0 x0VarIntToState = t0.intToState((int) dVarPrepare.getLong(i11));
                androidx.work.b bVarFromByteArray = androidx.work.b.f7480b.fromByteArray(dVarPrepare.getBlob(2));
                int i12 = (int) dVarPrepare.getLong(3);
                int i13 = (int) dVarPrepare.getLong(4);
                long j10 = dVarPrepare.getLong(14);
                long j11 = dVarPrepare.getLong(15);
                long j12 = dVarPrepare.getLong(16);
                z.f fVar3 = fVar2;
                n6.a aVarIntToBackoffPolicy = t0.intToBackoffPolicy((int) dVarPrepare.getLong(17));
                long j13 = dVarPrepare.getLong(18);
                long j14 = dVarPrepare.getLong(19);
                int i14 = (int) dVarPrepare.getLong(20);
                long j15 = dVarPrepare.getLong(21);
                int i15 = (int) dVarPrepare.getLong(22);
                n6.f fVar4 = new n6.f(t0.toNetworkRequest$work_runtime_release(dVarPrepare.getBlob(6)), t0.intToNetworkType((int) dVarPrepare.getLong(5)), ((int) dVarPrepare.getLong(7)) != 0, ((int) dVarPrepare.getLong(8)) != 0, ((int) dVarPrepare.getLong(9)) != 0, ((int) dVarPrepare.getLong(10)) != 0, dVarPrepare.getLong(11), dVarPrepare.getLong(12), t0.byteArrayToSetOfTriggers(dVarPrepare.getBlob(13)));
                Object value = p1.getValue(fVar, dVarPrepare.getText(0));
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(value, "getValue(...)");
                List list = (List) value;
                Object value2 = p1.getValue(fVar3, dVarPrepare.getText(0));
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(value2, "getValue(...)");
                arrayList.add(new b0.c(text3, x0VarIntToState, bVarFromByteArray, j10, j11, j12, fVar4, i12, aVarIntToBackoffPolicy, j13, j14, i14, i13, j15, i15, list, (List) value2));
                fVar2 = fVar3;
                i11 = 1;
                i10 = 0;
            }
            dVarPrepare.close();
            return arrayList;
        } catch (Throwable th2) {
            dVarPrepare.close();
            throw th2;
        }
    }

    private final Object b(Object obj) {
        b0.c cVar;
        String str = this.f89113c;
        m0 m0Var = this.f89114e;
        x5.b _connection = (x5.b) obj;
        m0.a aVar = m0.f89142d;
        kotlin.jvm.internal.e0.checkNotNullParameter(_connection, "_connection");
        x5.d dVarPrepare = _connection.prepare("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id=?");
        try {
            dVarPrepare.bindText(1, str);
            z.f fVar = new z.f();
            z.f fVar2 = new z.f();
            while (dVarPrepare.step()) {
                String text = dVarPrepare.getText(0);
                if (!fVar.containsKey(text)) {
                    fVar.put(text, new ArrayList());
                }
                String text2 = dVarPrepare.getText(0);
                if (!fVar2.containsKey(text2)) {
                    fVar2.put(text2, new ArrayList());
                }
            }
            dVarPrepare.reset();
            m0Var.b(_connection, fVar);
            m0Var.a(_connection, fVar2);
            if (dVarPrepare.step()) {
                String text3 = dVarPrepare.getText(0);
                x0 x0VarIntToState = t0.intToState((int) dVarPrepare.getLong(1));
                androidx.work.b bVarFromByteArray = androidx.work.b.f7480b.fromByteArray(dVarPrepare.getBlob(2));
                int i10 = (int) dVarPrepare.getLong(3);
                int i11 = (int) dVarPrepare.getLong(4);
                long j10 = dVarPrepare.getLong(14);
                long j11 = dVarPrepare.getLong(15);
                long j12 = dVarPrepare.getLong(16);
                n6.a aVarIntToBackoffPolicy = t0.intToBackoffPolicy((int) dVarPrepare.getLong(17));
                long j13 = dVarPrepare.getLong(18);
                long j14 = dVarPrepare.getLong(19);
                int i12 = (int) dVarPrepare.getLong(20);
                long j15 = dVarPrepare.getLong(21);
                int i13 = (int) dVarPrepare.getLong(22);
                n6.f fVar3 = new n6.f(t0.toNetworkRequest$work_runtime_release(dVarPrepare.getBlob(6)), t0.intToNetworkType((int) dVarPrepare.getLong(5)), ((int) dVarPrepare.getLong(7)) != 0, ((int) dVarPrepare.getLong(8)) != 0, ((int) dVarPrepare.getLong(9)) != 0, ((int) dVarPrepare.getLong(10)) != 0, dVarPrepare.getLong(11), dVarPrepare.getLong(12), t0.byteArrayToSetOfTriggers(dVarPrepare.getBlob(13)));
                Object value = p1.getValue(fVar, dVarPrepare.getText(0));
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(value, "getValue(...)");
                List list = (List) value;
                Object value2 = p1.getValue(fVar2, dVarPrepare.getText(0));
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(value2, "getValue(...)");
                cVar = new b0.c(text3, x0VarIntToState, bVarFromByteArray, j10, j11, j12, fVar3, i10, aVarIntToBackoffPolicy, j13, j14, i12, i11, j15, i13, list, (List) value2);
            } else {
                cVar = null;
            }
            dVarPrepare.close();
            return cVar;
        } catch (Throwable th2) {
            dVarPrepare.close();
            throw th2;
        }
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        x5.d dVarPrepare;
        int i10 = this.f89112b;
        int i11 = 15;
        int i12 = 14;
        int i13 = 4;
        int i14 = 3;
        int i15 = 2;
        int i16 = 1;
        int i17 = 0;
        m0 m0Var = this.f89114e;
        String str = this.f89113c;
        switch (i10) {
            case 0:
                x5.b _connection = (x5.b) obj;
                m0.a aVar = m0.f89142d;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection, "_connection");
                x5.d dVarPrepare2 = _connection.prepare("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)");
                try {
                    dVarPrepare2.bindText(1, str);
                    z.f fVar = new z.f();
                    z.f fVar2 = new z.f();
                    while (dVarPrepare2.step()) {
                        String text = dVarPrepare2.getText(0);
                        if (!fVar.containsKey(text)) {
                            fVar.put(text, new ArrayList());
                        }
                        String text2 = dVarPrepare2.getText(0);
                        if (!fVar2.containsKey(text2)) {
                            fVar2.put(text2, new ArrayList());
                        }
                    }
                    dVarPrepare2.reset();
                    m0Var.b(_connection, fVar);
                    m0Var.a(_connection, fVar2);
                    ArrayList arrayList = new ArrayList();
                    while (dVarPrepare2.step()) {
                        String text3 = dVarPrepare2.getText(0);
                        x0 x0VarIntToState = t0.intToState((int) dVarPrepare2.getLong(1));
                        androidx.work.b bVarFromByteArray = androidx.work.b.f7480b.fromByteArray(dVarPrepare2.getBlob(2));
                        int i18 = (int) dVarPrepare2.getLong(3);
                        int i19 = (int) dVarPrepare2.getLong(4);
                        long j10 = dVarPrepare2.getLong(14);
                        long j11 = dVarPrepare2.getLong(15);
                        long j12 = dVarPrepare2.getLong(16);
                        n6.a aVarIntToBackoffPolicy = t0.intToBackoffPolicy((int) dVarPrepare2.getLong(17));
                        long j13 = dVarPrepare2.getLong(18);
                        long j14 = dVarPrepare2.getLong(19);
                        int i20 = (int) dVarPrepare2.getLong(20);
                        long j15 = dVarPrepare2.getLong(21);
                        int i21 = (int) dVarPrepare2.getLong(22);
                        n6.f fVar3 = new n6.f(t0.toNetworkRequest$work_runtime_release(dVarPrepare2.getBlob(6)), t0.intToNetworkType((int) dVarPrepare2.getLong(5)), ((int) dVarPrepare2.getLong(7)) != 0, ((int) dVarPrepare2.getLong(8)) != 0, ((int) dVarPrepare2.getLong(9)) != 0, ((int) dVarPrepare2.getLong(10)) != 0, dVarPrepare2.getLong(11), dVarPrepare2.getLong(12), t0.byteArrayToSetOfTriggers(dVarPrepare2.getBlob(13)));
                        Object value = p1.getValue(fVar, dVarPrepare2.getText(0));
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(value, "getValue(...)");
                        List list = (List) value;
                        Object value2 = p1.getValue(fVar2, dVarPrepare2.getText(0));
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(value2, "getValue(...)");
                        arrayList.add(new b0.c(text3, x0VarIntToState, bVarFromByteArray, j10, j11, j12, fVar3, i18, aVarIntToBackoffPolicy, j13, j14, i20, i19, j15, i21, list, (List) value2));
                    }
                    dVarPrepare2.close();
                    return arrayList;
                } finally {
                    dVarPrepare2.close();
                }
            case 1:
                x5.b _connection2 = (x5.b) obj;
                m0.a aVar2 = m0.f89142d;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection2, "_connection");
                dVarPrepare = _connection2.prepare("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)");
                try {
                    dVarPrepare.bindText(1, str);
                    z.f fVar4 = new z.f();
                    z.f fVar5 = new z.f();
                    while (dVarPrepare.step()) {
                        String text4 = dVarPrepare.getText(0);
                        if (!fVar4.containsKey(text4)) {
                            fVar4.put(text4, new ArrayList());
                        }
                        String text5 = dVarPrepare.getText(0);
                        if (!fVar5.containsKey(text5)) {
                            fVar5.put(text5, new ArrayList());
                        }
                    }
                    dVarPrepare.reset();
                    m0Var.b(_connection2, fVar4);
                    m0Var.a(_connection2, fVar5);
                    ArrayList arrayList2 = new ArrayList();
                    while (dVarPrepare.step()) {
                        String text6 = dVarPrepare.getText(0);
                        x0 x0VarIntToState2 = t0.intToState((int) dVarPrepare.getLong(1));
                        androidx.work.b bVarFromByteArray2 = androidx.work.b.f7480b.fromByteArray(dVarPrepare.getBlob(2));
                        int i22 = (int) dVarPrepare.getLong(3);
                        int i23 = (int) dVarPrepare.getLong(4);
                        long j16 = dVarPrepare.getLong(14);
                        long j17 = dVarPrepare.getLong(15);
                        long j18 = dVarPrepare.getLong(16);
                        n6.a aVarIntToBackoffPolicy2 = t0.intToBackoffPolicy((int) dVarPrepare.getLong(17));
                        long j19 = dVarPrepare.getLong(18);
                        long j20 = dVarPrepare.getLong(19);
                        int i24 = (int) dVarPrepare.getLong(20);
                        long j21 = dVarPrepare.getLong(21);
                        int i25 = (int) dVarPrepare.getLong(22);
                        n6.f fVar6 = new n6.f(t0.toNetworkRequest$work_runtime_release(dVarPrepare.getBlob(6)), t0.intToNetworkType((int) dVarPrepare.getLong(5)), ((int) dVarPrepare.getLong(7)) != 0, ((int) dVarPrepare.getLong(8)) != 0, ((int) dVarPrepare.getLong(9)) != 0, ((int) dVarPrepare.getLong(10)) != 0, dVarPrepare.getLong(11), dVarPrepare.getLong(12), t0.byteArrayToSetOfTriggers(dVarPrepare.getBlob(13)));
                        Object value3 = p1.getValue(fVar4, dVarPrepare.getText(0));
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(value3, "getValue(...)");
                        Object value4 = p1.getValue(fVar5, dVarPrepare.getText(0));
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(value4, "getValue(...)");
                        arrayList2.add(new b0.c(text6, x0VarIntToState2, bVarFromByteArray2, j16, j17, j18, fVar6, i22, aVarIntToBackoffPolicy2, j19, j20, i24, i23, j21, i25, (List) value3, (List) value4));
                    }
                    dVarPrepare.close();
                    return arrayList2;
                } finally {
                    dVarPrepare.close();
                }
            case 2:
                x5.b _connection3 = (x5.b) obj;
                m0.a aVar3 = m0.f89142d;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection3, "_connection");
                x5.d dVarPrepare3 = _connection3.prepare("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    dVarPrepare3.bindText(1, str);
                    z.f fVar7 = new z.f();
                    z.f fVar8 = new z.f();
                    while (dVarPrepare3.step()) {
                        String text7 = dVarPrepare3.getText(0);
                        if (!fVar7.containsKey(text7)) {
                            fVar7.put(text7, new ArrayList());
                        }
                        String text8 = dVarPrepare3.getText(0);
                        if (!fVar8.containsKey(text8)) {
                            fVar8.put(text8, new ArrayList());
                        }
                    }
                    dVarPrepare3.reset();
                    m0Var.b(_connection3, fVar7);
                    m0Var.a(_connection3, fVar8);
                    ArrayList arrayList3 = new ArrayList();
                    while (dVarPrepare3.step()) {
                        String text9 = dVarPrepare3.getText(0);
                        x0 x0VarIntToState3 = t0.intToState((int) dVarPrepare3.getLong(1));
                        androidx.work.b bVarFromByteArray3 = androidx.work.b.f7480b.fromByteArray(dVarPrepare3.getBlob(2));
                        int i26 = (int) dVarPrepare3.getLong(3);
                        int i27 = (int) dVarPrepare3.getLong(4);
                        long j22 = dVarPrepare3.getLong(14);
                        long j23 = dVarPrepare3.getLong(15);
                        long j24 = dVarPrepare3.getLong(16);
                        n6.a aVarIntToBackoffPolicy3 = t0.intToBackoffPolicy((int) dVarPrepare3.getLong(17));
                        long j25 = dVarPrepare3.getLong(18);
                        long j26 = dVarPrepare3.getLong(19);
                        int i28 = (int) dVarPrepare3.getLong(20);
                        long j27 = dVarPrepare3.getLong(21);
                        int i29 = (int) dVarPrepare3.getLong(22);
                        n6.f fVar9 = new n6.f(t0.toNetworkRequest$work_runtime_release(dVarPrepare3.getBlob(6)), t0.intToNetworkType((int) dVarPrepare3.getLong(5)), ((int) dVarPrepare3.getLong(7)) != 0, ((int) dVarPrepare3.getLong(8)) != 0, ((int) dVarPrepare3.getLong(9)) != 0, ((int) dVarPrepare3.getLong(10)) != 0, dVarPrepare3.getLong(11), dVarPrepare3.getLong(12), t0.byteArrayToSetOfTriggers(dVarPrepare3.getBlob(13)));
                        Object value5 = p1.getValue(fVar7, dVarPrepare3.getText(0));
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(value5, "getValue(...)");
                        Object value6 = p1.getValue(fVar8, dVarPrepare3.getText(0));
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(value6, "getValue(...)");
                        arrayList3.add(new b0.c(text9, x0VarIntToState3, bVarFromByteArray3, j22, j23, j24, fVar9, i26, aVarIntToBackoffPolicy3, j25, j26, i28, i27, j27, i29, (List) value5, (List) value6));
                    }
                    dVarPrepare3.close();
                    return arrayList3;
                } finally {
                    dVarPrepare3.close();
                }
            case 3:
                x5.b _connection4 = (x5.b) obj;
                m0.a aVar4 = m0.f89142d;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection4, "_connection");
                dVarPrepare = _connection4.prepare("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    dVarPrepare.bindText(1, str);
                    z.f fVar10 = new z.f();
                    z.f fVar11 = new z.f();
                    while (dVarPrepare.step()) {
                        String text10 = dVarPrepare.getText(0);
                        if (!fVar10.containsKey(text10)) {
                            fVar10.put(text10, new ArrayList());
                        }
                        String text11 = dVarPrepare.getText(0);
                        if (!fVar11.containsKey(text11)) {
                            fVar11.put(text11, new ArrayList());
                        }
                    }
                    dVarPrepare.reset();
                    m0Var.b(_connection4, fVar10);
                    m0Var.a(_connection4, fVar11);
                    ArrayList arrayList4 = new ArrayList();
                    while (dVarPrepare.step()) {
                        String text12 = dVarPrepare.getText(0);
                        x0 x0VarIntToState4 = t0.intToState((int) dVarPrepare.getLong(1));
                        androidx.work.b bVarFromByteArray4 = androidx.work.b.f7480b.fromByteArray(dVarPrepare.getBlob(2));
                        int i30 = (int) dVarPrepare.getLong(3);
                        int i31 = (int) dVarPrepare.getLong(i13);
                        long j28 = dVarPrepare.getLong(14);
                        long j29 = dVarPrepare.getLong(15);
                        long j30 = dVarPrepare.getLong(16);
                        n6.a aVarIntToBackoffPolicy4 = t0.intToBackoffPolicy((int) dVarPrepare.getLong(17));
                        long j31 = dVarPrepare.getLong(18);
                        long j32 = dVarPrepare.getLong(19);
                        int i32 = (int) dVarPrepare.getLong(20);
                        long j33 = dVarPrepare.getLong(21);
                        int i33 = (int) dVarPrepare.getLong(22);
                        n6.f fVar12 = new n6.f(t0.toNetworkRequest$work_runtime_release(dVarPrepare.getBlob(6)), t0.intToNetworkType((int) dVarPrepare.getLong(5)), ((int) dVarPrepare.getLong(7)) != 0, ((int) dVarPrepare.getLong(8)) != 0, ((int) dVarPrepare.getLong(9)) != 0, ((int) dVarPrepare.getLong(10)) != 0, dVarPrepare.getLong(11), dVarPrepare.getLong(12), t0.byteArrayToSetOfTriggers(dVarPrepare.getBlob(13)));
                        Object value7 = p1.getValue(fVar10, dVarPrepare.getText(0));
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(value7, "getValue(...)");
                        Object value8 = p1.getValue(fVar11, dVarPrepare.getText(0));
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(value8, "getValue(...)");
                        arrayList4.add(new b0.c(text12, x0VarIntToState4, bVarFromByteArray4, j28, j29, j30, fVar12, i30, aVarIntToBackoffPolicy4, j31, j32, i32, i31, j33, i33, (List) value7, (List) value8));
                        i13 = 4;
                    }
                    dVarPrepare.close();
                    return arrayList4;
                } finally {
                }
            case 4:
                return a(obj);
            case 5:
                return b(obj);
            default:
                x5.b _connection5 = (x5.b) obj;
                m0.a aVar5 = m0.f89142d;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection5, "_connection");
                dVarPrepare = _connection5.prepare("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)");
                try {
                    dVarPrepare.bindText(1, str);
                    z.f fVar13 = new z.f();
                    z.f fVar14 = new z.f();
                    while (dVarPrepare.step()) {
                        String text13 = dVarPrepare.getText(0);
                        if (!fVar13.containsKey(text13)) {
                            fVar13.put(text13, new ArrayList());
                        }
                        String text14 = dVarPrepare.getText(0);
                        if (!fVar14.containsKey(text14)) {
                            fVar14.put(text14, new ArrayList());
                        }
                    }
                    dVarPrepare.reset();
                    m0Var.b(_connection5, fVar13);
                    m0Var.a(_connection5, fVar14);
                    ArrayList arrayList5 = new ArrayList();
                    while (dVarPrepare.step()) {
                        String text15 = dVarPrepare.getText(i17);
                        x0 x0VarIntToState5 = t0.intToState((int) dVarPrepare.getLong(i16));
                        androidx.work.b bVarFromByteArray5 = androidx.work.b.f7480b.fromByteArray(dVarPrepare.getBlob(i15));
                        int i34 = (int) dVarPrepare.getLong(i14);
                        int i35 = (int) dVarPrepare.getLong(4);
                        long j34 = dVarPrepare.getLong(i12);
                        long j35 = dVarPrepare.getLong(i11);
                        long j36 = dVarPrepare.getLong(16);
                        n6.a aVarIntToBackoffPolicy5 = t0.intToBackoffPolicy((int) dVarPrepare.getLong(17));
                        long j37 = dVarPrepare.getLong(18);
                        long j38 = dVarPrepare.getLong(19);
                        int i36 = (int) dVarPrepare.getLong(20);
                        long j39 = dVarPrepare.getLong(21);
                        int i37 = (int) dVarPrepare.getLong(22);
                        n6.f fVar15 = new n6.f(t0.toNetworkRequest$work_runtime_release(dVarPrepare.getBlob(6)), t0.intToNetworkType((int) dVarPrepare.getLong(5)), ((int) dVarPrepare.getLong(7)) != 0, ((int) dVarPrepare.getLong(8)) != 0, ((int) dVarPrepare.getLong(9)) != 0, ((int) dVarPrepare.getLong(10)) != 0, dVarPrepare.getLong(11), dVarPrepare.getLong(12), t0.byteArrayToSetOfTriggers(dVarPrepare.getBlob(13)));
                        Object value9 = p1.getValue(fVar13, dVarPrepare.getText(0));
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(value9, "getValue(...)");
                        Object value10 = p1.getValue(fVar14, dVarPrepare.getText(0));
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(value10, "getValue(...)");
                        arrayList5.add(new b0.c(text15, x0VarIntToState5, bVarFromByteArray5, j34, j35, j36, fVar15, i34, aVarIntToBackoffPolicy5, j37, j38, i36, i35, j39, i37, (List) value9, (List) value10));
                        i11 = 15;
                        i12 = 14;
                        i14 = 3;
                        i15 = 2;
                        i16 = 1;
                        i17 = 0;
                    }
                    dVarPrepare.close();
                    return arrayList5;
                } finally {
                }
        }
    }
}
