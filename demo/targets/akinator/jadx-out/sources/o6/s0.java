package o6;

import androidx.core.app.NotificationCompat;
import androidx.work.impl.WorkDatabase_Impl;
import com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ;
import com.ironsource.C3191e4;
import com.ironsource.Y1;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import o5.r1;
import u5.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class s0 extends r1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WorkDatabase_Impl f77970d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(WorkDatabase_Impl workDatabase_Impl) {
        super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        this.f77970d = workDatabase_Impl;
    }

    @Override // o5.r1
    public void createAllTables(x5.b connection) throws Exception {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        x5.a.execSQL(connection, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        x5.a.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        x5.a.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        x5.a.execSQL(connection, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        x5.a.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        x5.a.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        x5.a.execSQL(connection, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        x5.a.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        x5.a.execSQL(connection, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        x5.a.execSQL(connection, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        x5.a.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        x5.a.execSQL(connection, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        x5.a.execSQL(connection, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        x5.a.execSQL(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        x5.a.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
    }

    @Override // o5.r1
    public void dropAllTables(x5.b connection) throws Exception {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        x5.a.execSQL(connection, "DROP TABLE IF EXISTS `Dependency`");
        x5.a.execSQL(connection, "DROP TABLE IF EXISTS `WorkSpec`");
        x5.a.execSQL(connection, "DROP TABLE IF EXISTS `WorkTag`");
        x5.a.execSQL(connection, "DROP TABLE IF EXISTS `SystemIdInfo`");
        x5.a.execSQL(connection, "DROP TABLE IF EXISTS `WorkName`");
        x5.a.execSQL(connection, "DROP TABLE IF EXISTS `WorkProgress`");
        x5.a.execSQL(connection, "DROP TABLE IF EXISTS `Preference`");
    }

    @Override // o5.r1
    public void onCreate(x5.b connection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
    }

    @Override // o5.r1
    public void onOpen(x5.b connection) throws Exception {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        x5.a.execSQL(connection, "PRAGMA foreign_keys = ON");
        WorkDatabase_Impl.access$internalInitInvalidationTracker(this.f77970d, connection);
    }

    @Override // o5.r1
    public void onPostMigrate(x5.b connection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
    }

    @Override // o5.r1
    public void onPreMigrate(x5.b connection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        u5.c.dropFtsSyncTriggers(connection);
    }

    @Override // o5.r1
    public r1.a onValidateSchema(x5.b connection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("work_spec_id", new z.a("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap.put("prerequisite_id", new z.a("prerequisite_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new z.c("WorkSpec", "CASCADE", "CASCADE", uu.o0.listOf("work_spec_id"), uu.o0.listOf("id")));
        linkedHashSet.add(new z.c("WorkSpec", "CASCADE", "CASCADE", uu.o0.listOf("prerequisite_id"), uu.o0.listOf("id")));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new z.d("index_Dependency_work_spec_id", false, uu.o0.listOf("work_spec_id"), uu.o0.listOf("ASC")));
        linkedHashSet2.add(new z.d("index_Dependency_prerequisite_id", false, uu.o0.listOf("prerequisite_id"), uu.o0.listOf("ASC")));
        u5.z zVar = new u5.z("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
        z.b bVar = u5.z.f87940e;
        u5.z zVar2 = bVar.read(connection, "Dependency");
        if (!zVar.equals(zVar2)) {
            return new r1.a(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + zVar + "\n Found:\n" + zVar2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new z.a("id", "TEXT", true, 1, null, 1));
        linkedHashMap2.put("state", new z.a("state", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("worker_class_name", new z.a("worker_class_name", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("input_merger_class_name", new z.a("input_merger_class_name", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("input", new z.a("input", "BLOB", true, 0, null, 1));
        linkedHashMap2.put("output", new z.a("output", "BLOB", true, 0, null, 1));
        linkedHashMap2.put("initial_delay", new z.a("initial_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("interval_duration", new z.a("interval_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("flex_duration", new z.a("flex_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("run_attempt_count", new z.a("run_attempt_count", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("backoff_policy", new z.a("backoff_policy", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("backoff_delay_duration", new z.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("last_enqueue_time", new z.a("last_enqueue_time", "INTEGER", true, 0, Y1.f35726f, 1));
        linkedHashMap2.put("minimum_retention_duration", new z.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("schedule_requested_at", new z.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("run_in_foreground", new z.a("run_in_foreground", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("out_of_quota_policy", new z.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("period_count", new z.a("period_count", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("generation", new z.a("generation", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("next_schedule_time_override", new z.a("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
        linkedHashMap2.put("next_schedule_time_override_generation", new z.a("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("stop_reason", new z.a("stop_reason", "INTEGER", true, 0, "-256", 1));
        linkedHashMap2.put("trace_tag", new z.a("trace_tag", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("backoff_on_system_interruptions", new z.a("backoff_on_system_interruptions", "INTEGER", false, 0, null, 1));
        linkedHashMap2.put("required_network_type", new z.a("required_network_type", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("required_network_request", new z.a("required_network_request", "BLOB", true, 0, "x''", 1));
        linkedHashMap2.put("requires_charging", new z.a("requires_charging", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_device_idle", new z.a("requires_device_idle", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_battery_not_low", new z.a(OcvDtWCQ.LpqVap, "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_storage_not_low", new z.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("trigger_content_update_delay", new z.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("trigger_max_content_delay", new z.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("content_uri_triggers", new z.a("content_uri_triggers", "BLOB", true, 0, null, 1));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new z.d("index_WorkSpec_schedule_requested_at", false, uu.o0.listOf("schedule_requested_at"), uu.o0.listOf("ASC")));
        linkedHashSet4.add(new z.d("index_WorkSpec_last_enqueue_time", false, uu.o0.listOf("last_enqueue_time"), uu.o0.listOf("ASC")));
        u5.z zVar3 = new u5.z("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
        u5.z zVar4 = bVar.read(connection, "WorkSpec");
        if (!zVar3.equals(zVar4)) {
            return new r1.a(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + zVar3 + "\n Found:\n" + zVar4);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("tag", new z.a("tag", "TEXT", true, 1, null, 1));
        linkedHashMap3.put("work_spec_id", new z.a("work_spec_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        linkedHashSet5.add(new z.c("WorkSpec", "CASCADE", "CASCADE", uu.o0.listOf("work_spec_id"), uu.o0.listOf("id")));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.add(new z.d("index_WorkTag_work_spec_id", false, uu.o0.listOf("work_spec_id"), uu.o0.listOf("ASC")));
        u5.z zVar5 = new u5.z("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
        u5.z zVar6 = bVar.read(connection, "WorkTag");
        if (!zVar5.equals(zVar6)) {
            return new r1.a(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + zVar5 + "\n Found:\n" + zVar6);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("work_spec_id", new z.a("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap4.put("generation", new z.a("generation", "INTEGER", true, 2, "0", 1));
        linkedHashMap4.put("system_id", new z.a("system_id", "INTEGER", true, 0, null, 1));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.add(new z.c("WorkSpec", "CASCADE", "CASCADE", uu.o0.listOf("work_spec_id"), uu.o0.listOf("id")));
        u5.z zVar7 = new u5.z("SystemIdInfo", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
        u5.z zVar8 = bVar.read(connection, "SystemIdInfo");
        if (!zVar7.equals(zVar8)) {
            return new r1.a(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + zVar7 + "\n Found:\n" + zVar8);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("name", new z.a("name", "TEXT", true, 1, null, 1));
        linkedHashMap5.put("work_spec_id", new z.a("work_spec_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.add(new z.c("WorkSpec", "CASCADE", "CASCADE", uu.o0.listOf("work_spec_id"), uu.o0.listOf("id")));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        linkedHashSet9.add(new z.d("index_WorkName_work_spec_id", false, uu.o0.listOf("work_spec_id"), uu.o0.listOf("ASC")));
        u5.z zVar9 = new u5.z("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
        u5.z zVar10 = bVar.read(connection, "WorkName");
        if (!zVar9.equals(zVar10)) {
            return new r1.a(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + zVar9 + "\n Found:\n" + zVar10);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("work_spec_id", new z.a("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap6.put(NotificationCompat.CATEGORY_PROGRESS, new z.a(NotificationCompat.CATEGORY_PROGRESS, "BLOB", true, 0, null, 1));
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        linkedHashSet10.add(new z.c("WorkSpec", "CASCADE", "CASCADE", uu.o0.listOf("work_spec_id"), uu.o0.listOf("id")));
        u5.z zVar11 = new u5.z("WorkProgress", linkedHashMap6, linkedHashSet10, new LinkedHashSet());
        u5.z zVar12 = bVar.read(connection, "WorkProgress");
        if (!zVar11.equals(zVar12)) {
            return new r1.a(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + zVar11 + "\n Found:\n" + zVar12);
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put(C3191e4.h.W, new z.a(C3191e4.h.W, "TEXT", true, 1, null, 1));
        linkedHashMap7.put("long_value", new z.a("long_value", "INTEGER", false, 0, null, 1));
        u5.z zVar13 = new u5.z("Preference", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
        u5.z zVar14 = bVar.read(connection, "Preference");
        if (zVar13.equals(zVar14)) {
            return new r1.a(true, null);
        }
        return new r1.a(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + zVar13 + "\n Found:\n" + zVar14);
    }
}
