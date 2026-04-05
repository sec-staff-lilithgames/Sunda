package com.moloco.sdk.acm.http;

import androidx.work.b;
import io.ktor.client.plugins.HttpTimeout;
import java.util.ArrayList;
import kotlin.jvm.internal.e0;
import kv.l;
import n6.d0;
import n6.o0;
import n6.x0;
import u5.s;
import v6.b0;
import v6.m0;
import v6.t0;
import w6.r;
import zi.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class g implements l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f45628b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f45629c;

    public /* synthetic */ g(long j10, int i10) {
        this.f45628b = i10;
        this.f45629c = j10;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        int i10;
        int i11;
        Integer numValueOf;
        Boolean boolValueOf;
        int i12 = this.f45628b;
        long j10 = this.f45629c;
        switch (i12) {
            case 0:
                return h.a(j10, (HttpTimeout.HttpTimeoutCapabilityConfiguration) obj);
            case 1:
                return com.moloco.sdk.xenoss.sdkdevkit.android.core.b.a(j10, (HttpTimeout.HttpTimeoutCapabilityConfiguration) obj);
            case 2:
                y5.c db2 = (y5.c) obj;
                e0.checkNotNullParameter(db2, "db");
                return Long.valueOf(db2.setMaximumSize(j10));
            case 3:
                y5.c db3 = (y5.c) obj;
                e0.checkNotNullParameter(db3, "db");
                db3.setPageSize(j10);
                return null;
            case 4:
                x5.b _connection = (x5.b) obj;
                m0.a aVar = m0.f89142d;
                e0.checkNotNullParameter(_connection, "_connection");
                x5.d dVarPrepare = _connection.prepare("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    dVarPrepare.bindLong(1, j10);
                    int columnIndexOrThrow = s.getColumnIndexOrThrow(dVarPrepare, "id");
                    int columnIndexOrThrow2 = s.getColumnIndexOrThrow(dVarPrepare, "state");
                    int columnIndexOrThrow3 = s.getColumnIndexOrThrow(dVarPrepare, "worker_class_name");
                    int columnIndexOrThrow4 = s.getColumnIndexOrThrow(dVarPrepare, "input_merger_class_name");
                    int columnIndexOrThrow5 = s.getColumnIndexOrThrow(dVarPrepare, "input");
                    int columnIndexOrThrow6 = s.getColumnIndexOrThrow(dVarPrepare, "output");
                    int columnIndexOrThrow7 = s.getColumnIndexOrThrow(dVarPrepare, "initial_delay");
                    int columnIndexOrThrow8 = s.getColumnIndexOrThrow(dVarPrepare, "interval_duration");
                    int columnIndexOrThrow9 = s.getColumnIndexOrThrow(dVarPrepare, "flex_duration");
                    int columnIndexOrThrow10 = s.getColumnIndexOrThrow(dVarPrepare, "run_attempt_count");
                    int columnIndexOrThrow11 = s.getColumnIndexOrThrow(dVarPrepare, "backoff_policy");
                    int columnIndexOrThrow12 = s.getColumnIndexOrThrow(dVarPrepare, "backoff_delay_duration");
                    int columnIndexOrThrow13 = s.getColumnIndexOrThrow(dVarPrepare, "last_enqueue_time");
                    int columnIndexOrThrow14 = s.getColumnIndexOrThrow(dVarPrepare, "minimum_retention_duration");
                    int columnIndexOrThrow15 = s.getColumnIndexOrThrow(dVarPrepare, "schedule_requested_at");
                    int columnIndexOrThrow16 = s.getColumnIndexOrThrow(dVarPrepare, "run_in_foreground");
                    int columnIndexOrThrow17 = s.getColumnIndexOrThrow(dVarPrepare, "out_of_quota_policy");
                    int columnIndexOrThrow18 = s.getColumnIndexOrThrow(dVarPrepare, "period_count");
                    int columnIndexOrThrow19 = s.getColumnIndexOrThrow(dVarPrepare, "generation");
                    int columnIndexOrThrow20 = s.getColumnIndexOrThrow(dVarPrepare, "next_schedule_time_override");
                    int columnIndexOrThrow21 = s.getColumnIndexOrThrow(dVarPrepare, "next_schedule_time_override_generation");
                    int columnIndexOrThrow22 = s.getColumnIndexOrThrow(dVarPrepare, "stop_reason");
                    int columnIndexOrThrow23 = s.getColumnIndexOrThrow(dVarPrepare, "trace_tag");
                    int columnIndexOrThrow24 = s.getColumnIndexOrThrow(dVarPrepare, "backoff_on_system_interruptions");
                    int columnIndexOrThrow25 = s.getColumnIndexOrThrow(dVarPrepare, "required_network_type");
                    int columnIndexOrThrow26 = s.getColumnIndexOrThrow(dVarPrepare, "required_network_request");
                    int columnIndexOrThrow27 = s.getColumnIndexOrThrow(dVarPrepare, "requires_charging");
                    int columnIndexOrThrow28 = s.getColumnIndexOrThrow(dVarPrepare, "requires_device_idle");
                    int columnIndexOrThrow29 = s.getColumnIndexOrThrow(dVarPrepare, "requires_battery_not_low");
                    int columnIndexOrThrow30 = s.getColumnIndexOrThrow(dVarPrepare, "requires_storage_not_low");
                    int columnIndexOrThrow31 = s.getColumnIndexOrThrow(dVarPrepare, "trigger_content_update_delay");
                    int columnIndexOrThrow32 = s.getColumnIndexOrThrow(dVarPrepare, "trigger_max_content_delay");
                    int columnIndexOrThrow33 = s.getColumnIndexOrThrow(dVarPrepare, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (dVarPrepare.step()) {
                        String text = dVarPrepare.getText(columnIndexOrThrow);
                        int i13 = columnIndexOrThrow14;
                        int i14 = columnIndexOrThrow;
                        x0 x0VarIntToState = t0.intToState((int) dVarPrepare.getLong(columnIndexOrThrow2));
                        String text2 = dVarPrepare.getText(columnIndexOrThrow3);
                        String text3 = dVarPrepare.getText(columnIndexOrThrow4);
                        byte[] blob = dVarPrepare.getBlob(columnIndexOrThrow5);
                        b.C0007b c0007b = androidx.work.b.f7480b;
                        androidx.work.b bVarFromByteArray = c0007b.fromByteArray(blob);
                        androidx.work.b bVarFromByteArray2 = c0007b.fromByteArray(dVarPrepare.getBlob(columnIndexOrThrow6));
                        long j11 = dVarPrepare.getLong(columnIndexOrThrow7);
                        long j12 = dVarPrepare.getLong(columnIndexOrThrow8);
                        long j13 = dVarPrepare.getLong(columnIndexOrThrow9);
                        int i15 = (int) dVarPrepare.getLong(columnIndexOrThrow10);
                        n6.a aVarIntToBackoffPolicy = t0.intToBackoffPolicy((int) dVarPrepare.getLong(columnIndexOrThrow11));
                        long j14 = dVarPrepare.getLong(columnIndexOrThrow12);
                        long j15 = dVarPrepare.getLong(columnIndexOrThrow13);
                        long j16 = dVarPrepare.getLong(i13);
                        int i16 = columnIndexOrThrow15;
                        long j17 = dVarPrepare.getLong(i16);
                        int i17 = columnIndexOrThrow13;
                        int i18 = columnIndexOrThrow16;
                        boolean z10 = ((int) dVarPrepare.getLong(i18)) != 0;
                        int i19 = columnIndexOrThrow17;
                        int i20 = columnIndexOrThrow2;
                        o0 o0VarIntToOutOfQuotaPolicy = t0.intToOutOfQuotaPolicy((int) dVarPrepare.getLong(i19));
                        int i21 = columnIndexOrThrow18;
                        int i22 = columnIndexOrThrow3;
                        int i23 = (int) dVarPrepare.getLong(i21);
                        int i24 = columnIndexOrThrow19;
                        int i25 = (int) dVarPrepare.getLong(i24);
                        int i26 = columnIndexOrThrow20;
                        long j18 = dVarPrepare.getLong(i26);
                        int i27 = columnIndexOrThrow21;
                        int i28 = (int) dVarPrepare.getLong(i27);
                        int i29 = columnIndexOrThrow22;
                        int i30 = (int) dVarPrepare.getLong(i29);
                        int i31 = columnIndexOrThrow23;
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
                        } else {
                            boolValueOf = null;
                        }
                        int i33 = columnIndexOrThrow25;
                        d0 d0VarIntToNetworkType = t0.intToNetworkType((int) dVarPrepare.getLong(i33));
                        int i34 = columnIndexOrThrow26;
                        r networkRequest$work_runtime_release = t0.toNetworkRequest$work_runtime_release(dVarPrepare.getBlob(i34));
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
                        arrayList.add(new b0(text, x0VarIntToState, text2, text3, bVarFromByteArray, bVarFromByteArray2, j11, j12, j13, new n6.f(networkRequest$work_runtime_release, d0VarIntToNetworkType, z11, z12, z13, ((int) dVarPrepare.getLong(i38)) != 0, dVarPrepare.getLong(i39), dVarPrepare.getLong(i40), t0.byteArrayToSetOfTriggers(dVarPrepare.getBlob(i41))), i15, aVarIntToBackoffPolicy, j14, j15, j16, j17, z10, o0VarIntToOutOfQuotaPolicy, i23, i25, j18, i10, i30, text4, boolValueOf));
                        columnIndexOrThrow30 = i38;
                        columnIndexOrThrow2 = i20;
                        columnIndexOrThrow17 = i19;
                        columnIndexOrThrow19 = i24;
                        columnIndexOrThrow22 = i11;
                        columnIndexOrThrow24 = i32;
                        columnIndexOrThrow31 = i39;
                        columnIndexOrThrow32 = i40;
                        columnIndexOrThrow13 = i17;
                        columnIndexOrThrow15 = i16;
                        columnIndexOrThrow16 = i18;
                        columnIndexOrThrow20 = i26;
                        columnIndexOrThrow21 = i27;
                        columnIndexOrThrow23 = i31;
                        columnIndexOrThrow = i14;
                        columnIndexOrThrow14 = i13;
                        columnIndexOrThrow28 = i36;
                        columnIndexOrThrow3 = i22;
                        columnIndexOrThrow18 = i21;
                    }
                    dVarPrepare.close();
                    return arrayList;
                } catch (Throwable th2) {
                    dVarPrepare.close();
                    throw th2;
                }
            default:
                ((o4.d) obj).set(j.f97995b, Long.valueOf(j10));
                return null;
        }
    }
}
