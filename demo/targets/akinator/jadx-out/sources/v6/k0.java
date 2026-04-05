package v6;

import androidx.work.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k0 extends o5.o {
    @Override // o5.o
    public final String a() {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // o5.o
    public void bind(x5.d statement, Object obj) {
        b0 entity = (b0) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(statement, "statement");
        kotlin.jvm.internal.e0.checkNotNullParameter(entity, "entity");
        statement.bindText(1, entity.f89053a);
        statement.bindLong(2, t0.stateToInt(entity.f89054b));
        statement.bindText(3, entity.f89055c);
        statement.bindText(4, entity.f89056d);
        b.C0007b c0007b = androidx.work.b.f7480b;
        statement.bindBlob(5, c0007b.toByteArrayInternalV1(entity.f89057e));
        statement.bindBlob(6, c0007b.toByteArrayInternalV1(entity.f89058f));
        statement.bindLong(7, entity.f89059g);
        statement.bindLong(8, entity.f89060h);
        statement.bindLong(9, entity.f89061i);
        statement.bindLong(10, entity.f89063k);
        statement.bindLong(11, t0.backoffPolicyToInt(entity.f89064l));
        statement.bindLong(12, entity.f89065m);
        statement.bindLong(13, entity.f89066n);
        statement.bindLong(14, entity.f89067o);
        statement.bindLong(15, entity.f89068p);
        statement.bindLong(16, entity.f89069q ? 1L : 0L);
        statement.bindLong(17, t0.outOfQuotaPolicyToInt(entity.f89070r));
        statement.bindLong(18, entity.getPeriodCount());
        statement.bindLong(19, entity.getGeneration());
        statement.bindLong(20, entity.getNextScheduleTimeOverride());
        statement.bindLong(21, entity.getNextScheduleTimeOverrideGeneration());
        statement.bindLong(22, entity.getStopReason());
        String traceTag = entity.getTraceTag();
        if (traceTag == null) {
            statement.bindNull(23);
        } else {
            statement.bindText(23, traceTag);
        }
        Boolean backOffOnSystemInterruptions = entity.getBackOffOnSystemInterruptions();
        if ((backOffOnSystemInterruptions != null ? Integer.valueOf(backOffOnSystemInterruptions.booleanValue() ? 1 : 0) : null) == null) {
            statement.bindNull(24);
        } else {
            statement.bindLong(24, r0.intValue());
        }
        n6.f fVar = entity.f89062j;
        statement.bindLong(25, t0.networkTypeToInt(fVar.getRequiredNetworkType()));
        statement.bindBlob(26, t0.fromNetworkRequest$work_runtime_release(fVar.getRequiredNetworkRequestCompat$work_runtime_release()));
        statement.bindLong(27, fVar.requiresCharging() ? 1L : 0L);
        statement.bindLong(28, fVar.requiresDeviceIdle() ? 1L : 0L);
        statement.bindLong(29, fVar.requiresBatteryNotLow() ? 1L : 0L);
        statement.bindLong(30, fVar.requiresStorageNotLow() ? 1L : 0L);
        statement.bindLong(31, fVar.getContentTriggerUpdateDelayMillis());
        statement.bindLong(32, fVar.getContentTriggerMaxDelayMillis());
        statement.bindBlob(33, t0.setOfTriggersToByteArray(fVar.getContentUriTriggers()));
    }
}
