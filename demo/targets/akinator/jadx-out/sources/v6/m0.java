package v6;

import androidx.lifecycle.c3;
import androidx.lifecycle.l1;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;
import n6.x0;
import o5.y0;
import p0.o2;
import v6.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m0 implements c0 {

    /* renamed from: d, reason: collision with root package name */
    public static final a f89142d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final y0 f89143a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f89144b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f89145c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final List<KClass<?>> getRequiredConverters() {
            return uu.p0.emptyList();
        }
    }

    public m0(y0 __db) {
        kotlin.jvm.internal.e0.checkNotNullParameter(__db, "__db");
        this.f89143a = __db;
        this.f89144b = new k0();
        this.f89145c = new l0();
    }

    public final void a(x5.b bVar, z.f fVar) {
        Set<Object> setKeySet = fVar.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (fVar.size() > 999) {
            u5.o.recursiveFetchArrayMap(fVar, true, new j0(this, bVar, 0));
            return;
        }
        StringBuilder sbU = o2.u("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        u5.y.appendPlaceholders(sbU, setKeySet.size());
        sbU.append(")");
        String string = sbU.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        x5.d dVarPrepare = bVar.prepare(string);
        Iterator<Object> it = setKeySet.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            dVarPrepare.bindText(i10, (String) it.next());
            i10++;
        }
        try {
            int columnIndex = u5.s.getColumnIndex(dVarPrepare, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (dVarPrepare.step()) {
                List list = (List) fVar.get(dVarPrepare.getText(columnIndex));
                if (list != null) {
                    list.add(androidx.work.b.f7480b.fromByteArray(dVarPrepare.getBlob(0)));
                }
            }
        } finally {
            dVarPrepare.close();
        }
    }

    public final void b(x5.b bVar, z.f fVar) {
        Set<Object> setKeySet = fVar.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (fVar.size() > 999) {
            u5.o.recursiveFetchArrayMap(fVar, true, new j0(this, bVar, 1));
            return;
        }
        StringBuilder sbU = o2.u("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        u5.y.appendPlaceholders(sbU, setKeySet.size());
        sbU.append(")");
        String string = sbU.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        x5.d dVarPrepare = bVar.prepare(string);
        Iterator<Object> it = setKeySet.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            dVarPrepare.bindText(i10, (String) it.next());
            i10++;
        }
        try {
            int columnIndex = u5.s.getColumnIndex(dVarPrepare, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (dVarPrepare.step()) {
                List list = (List) fVar.get(dVarPrepare.getText(columnIndex));
                if (list != null) {
                    list.add(dVarPrepare.getText(0));
                }
            }
        } finally {
            dVarPrepare.close();
        }
    }

    @Override // v6.c0
    public int countNonFinishedContentUriTriggerWorkers() {
        return ((Number) u5.c.performBlocking(this.f89143a, true, false, new t5.s(11))).intValue();
    }

    @Override // v6.c0
    public void delete(String id2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        u5.c.performBlocking(this.f89143a, false, true, new ba.d(id2, 23));
    }

    @Override // v6.c0
    public List<b0> getAllEligibleWorkSpecsForScheduling(int i10) {
        return (List) u5.c.performBlocking(this.f89143a, true, false, new rv.e0(i10, 5));
    }

    @Override // v6.c0
    public List<String> getAllUnfinishedWork() {
        return (List) u5.c.performBlocking(this.f89143a, true, false, new t5.s(10));
    }

    @Override // v6.c0
    public List<String> getAllWorkSpecIds() {
        return (List) u5.c.performBlocking(this.f89143a, true, false, new t5.s(16));
    }

    @Override // v6.c0
    public l1 getAllWorkSpecIdsLiveData() {
        return this.f89143a.getInvalidationTracker().createLiveData(new String[]{"workspec"}, true, (kv.l) new t5.s(17));
    }

    @Override // v6.c0
    public List<b0> getEligibleWorkForScheduling(int i10) {
        return (List) u5.c.performBlocking(this.f89143a, true, false, new rv.e0(i10, 6));
    }

    @Override // v6.c0
    public List<b0> getEligibleWorkForSchedulingWithContentUris() {
        return (List) u5.c.performBlocking(this.f89143a, true, false, new t5.s(19));
    }

    @Override // v6.c0
    public List<androidx.work.b> getInputsFromPrerequisites(String id2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        return (List) u5.c.performBlocking(this.f89143a, true, false, new ba.d(id2, 29));
    }

    @Override // v6.c0
    public List<b0> getRecentlyCompletedWork(long j10) {
        return (List) u5.c.performBlocking(this.f89143a, true, false, new com.moloco.sdk.acm.http.g(j10, 4));
    }

    @Override // v6.c0
    public List<b0> getRunningWork() {
        return (List) u5.c.performBlocking(this.f89143a, true, false, new t5.s(18));
    }

    @Override // v6.c0
    public l1 getScheduleRequestedAtLiveData(String id2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        return this.f89143a.getInvalidationTracker().createLiveData(new String[]{"workspec"}, false, (kv.l) new i0(id2, 5));
    }

    @Override // v6.c0
    public List<b0> getScheduledWork() {
        return (List) u5.c.performBlocking(this.f89143a, true, false, new t5.s(15));
    }

    @Override // v6.c0
    public x0 getState(String id2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        return (x0) u5.c.performBlocking(this.f89143a, true, false, new i0(id2, 4));
    }

    @Override // v6.c0
    public List<String> getUnfinishedWorkWithName(String name) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        return (List) u5.c.performBlocking(this.f89143a, true, false, new ba.d(name, 25));
    }

    @Override // v6.c0
    public List<String> getUnfinishedWorkWithTag(String tag) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
        return (List) u5.c.performBlocking(this.f89143a, true, false, new i0(tag, 2));
    }

    @Override // v6.c0
    public b0 getWorkSpec(String id2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        return (b0) u5.c.performBlocking(this.f89143a, true, false, new ba.d(id2, 28));
    }

    @Override // v6.c0
    public List<b0.b> getWorkSpecIdAndStatesForName(String name) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        return (List) u5.c.performBlocking(this.f89143a, true, false, new ba.d(name, 24));
    }

    @Override // v6.c0
    public Flow<List<b0.c>> getWorkStatusPojoFlowDataForIds(List<String> ids) {
        kotlin.jvm.internal.e0.checkNotNullParameter(ids, "ids");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        u5.y.appendPlaceholders(sb2, ids.size());
        sb2.append(")");
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        f0 f0Var = new f0(string, ids, this, 0);
        return q5.o.createFlow(this.f89143a, true, new String[]{"WorkTag", "WorkProgress", "workspec"}, f0Var);
    }

    @Override // v6.c0
    public Flow<List<b0.c>> getWorkStatusPojoFlowForName(String name) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        e0 e0Var = new e0(name, this, 4);
        return q5.o.createFlow(this.f89143a, true, new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, e0Var);
    }

    @Override // v6.c0
    public Flow<List<b0.c>> getWorkStatusPojoFlowForTag(String tag) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
        e0 e0Var = new e0(tag, this, 0);
        return q5.o.createFlow(this.f89143a, true, new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, e0Var);
    }

    @Override // v6.c0
    public b0.c getWorkStatusPojoForId(String id2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        return (b0.c) u5.c.performBlocking(this.f89143a, true, true, new e0(id2, this, 5));
    }

    @Override // v6.c0
    public List<b0.c> getWorkStatusPojoForIds(List<String> ids) {
        kotlin.jvm.internal.e0.checkNotNullParameter(ids, "ids");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        u5.y.appendPlaceholders(sb2, ids.size());
        sb2.append(")");
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return (List) u5.c.performBlocking(this.f89143a, true, true, new f0(string, ids, this, 2));
    }

    @Override // v6.c0
    public List<b0.c> getWorkStatusPojoForName(String name) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        return (List) u5.c.performBlocking(this.f89143a, true, true, new e0(name, this, 3));
    }

    @Override // v6.c0
    public List<b0.c> getWorkStatusPojoForTag(String tag) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
        return (List) u5.c.performBlocking(this.f89143a, true, true, new e0(tag, this, 1));
    }

    @Override // v6.c0
    public l1 getWorkStatusPojoLiveDataForIds(List<String> ids) {
        kotlin.jvm.internal.e0.checkNotNullParameter(ids, "ids");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        u5.y.appendPlaceholders(sb2, ids.size());
        sb2.append(")");
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return this.f89143a.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, (kv.l) new f0(string, ids, this, 1));
    }

    @Override // v6.c0
    public l1 getWorkStatusPojoLiveDataForName(String name) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        return this.f89143a.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, (kv.l) new e0(name, this, 2));
    }

    @Override // v6.c0
    public l1 getWorkStatusPojoLiveDataForTag(String tag) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
        return this.f89143a.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, (kv.l) new e0(tag, this, 6));
    }

    @Override // v6.c0
    public Flow<Boolean> hasUnfinishedWorkFlow() {
        t5.s sVar = new t5.s(13);
        return q5.o.createFlow(this.f89143a, false, new String[]{"workspec"}, sVar);
    }

    @Override // v6.c0
    public void incrementGeneration(String id2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        u5.c.performBlocking(this.f89143a, false, true, new i0(id2, 0));
    }

    @Override // v6.c0
    public void incrementPeriodCount(String id2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        u5.c.performBlocking(this.f89143a, false, true, new ba.d(id2, 27));
    }

    @Override // v6.c0
    public int incrementWorkSpecRunAttemptCount(String id2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        return ((Number) u5.c.performBlocking(this.f89143a, false, true, new i0(id2, 3))).intValue();
    }

    @Override // v6.c0
    public void insertWorkSpec(b0 workSpec) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workSpec, "workSpec");
        u5.c.performBlocking(this.f89143a, false, true, new g0(this, workSpec, 1));
    }

    @Override // v6.c0
    public int markWorkSpecScheduled(String id2, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        return ((Number) u5.c.performBlocking(this.f89143a, false, true, new h0(j10, id2, 1))).intValue();
    }

    @Override // v6.c0
    public void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast() {
        u5.c.performBlocking(this.f89143a, false, true, new t5.s(12));
    }

    @Override // v6.c0
    public int resetScheduledState() {
        return ((Number) u5.c.performBlocking(this.f89143a, false, true, new t5.s(14))).intValue();
    }

    @Override // v6.c0
    public void resetWorkSpecNextScheduleTimeOverride(String id2, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        u5.c.performBlocking(this.f89143a, false, true, new ba.f(id2, i10, 4));
    }

    @Override // v6.c0
    public int resetWorkSpecRunAttemptCount(String id2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        return ((Number) u5.c.performBlocking(this.f89143a, false, true, new ba.d(id2, 26))).intValue();
    }

    @Override // v6.c0
    public int setCancelledState(String id2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        return ((Number) u5.c.performBlocking(this.f89143a, false, true, new i0(id2, 1))).intValue();
    }

    @Override // v6.c0
    public void setLastEnqueueTime(String id2, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        u5.c.performBlocking(this.f89143a, false, true, new h0(j10, id2, 2));
    }

    @Override // v6.c0
    public void setNextScheduleTimeOverride(String id2, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        u5.c.performBlocking(this.f89143a, false, true, new h0(j10, id2, 0));
    }

    @Override // v6.c0
    public void setOutput(String id2, androidx.work.b output) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        kotlin.jvm.internal.e0.checkNotNullParameter(output, "output");
        u5.c.performBlocking(this.f89143a, false, true, new c3(27, output, id2));
    }

    @Override // v6.c0
    public int setState(x0 state, String id2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        return ((Number) u5.c.performBlocking(this.f89143a, false, true, new c3(28, state, id2))).intValue();
    }

    @Override // v6.c0
    public void setStopReason(String id2, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        u5.c.performBlocking(this.f89143a, false, true, new ba.f(i10, id2, 3));
    }

    @Override // v6.c0
    public void updateWorkSpec(b0 workSpec) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workSpec, "workSpec");
        u5.c.performBlocking(this.f89143a, false, true, new g0(this, workSpec, 0));
    }
}
