package n6;

import j$.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import uu.c2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b1 {

    /* renamed from: d, reason: collision with root package name */
    public static final b f75689d = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final UUID f75690a;

    /* renamed from: b, reason: collision with root package name */
    public final v6.b0 f75691b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f75692c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(kotlin.jvm.internal.u uVar) {
        }

        public static final String access$deriveTraceTagFromClassName(b bVar, String str) {
            bVar.getClass();
            List listSplit$default = sv.n0.split$default((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null);
            String str2 = listSplit$default.size() == 1 ? (String) listSplit$default.get(0) : (String) uu.y0.last(listSplit$default);
            return str2.length() <= 127 ? str2 : sv.p0.take(str2, 127);
        }
    }

    public b1(UUID id2, v6.b0 workSpec, Set<String> tags) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        kotlin.jvm.internal.e0.checkNotNullParameter(workSpec, "workSpec");
        kotlin.jvm.internal.e0.checkNotNullParameter(tags, "tags");
        this.f75690a = id2;
        this.f75691b = workSpec;
        this.f75692c = tags;
    }

    public UUID getId() {
        return this.f75690a;
    }

    public final String getStringId() {
        String string = getId().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final Set<String> getTags() {
        return this.f75692c;
    }

    public final v6.b0 getWorkSpec() {
        return this.f75691b;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f75693a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f75694b;

        /* renamed from: c, reason: collision with root package name */
        public UUID f75695c;

        /* renamed from: d, reason: collision with root package name */
        public v6.b0 f75696d;

        /* renamed from: e, reason: collision with root package name */
        public final Set f75697e;

        public a(Class<? extends b0> workerClass) {
            kotlin.jvm.internal.e0.checkNotNullParameter(workerClass, "workerClass");
            this.f75693a = workerClass;
            UUID uuidRandomUUID = UUID.randomUUID();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
            this.f75695c = uuidRandomUUID;
            String string = this.f75695c.toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
            String name = workerClass.getName();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(name, "getName(...)");
            this.f75696d = new v6.b0(string, name);
            String name2 = workerClass.getName();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(name2, "getName(...)");
            this.f75697e = c2.mutableSetOf(name2);
        }

        public final a addTag(String tag) {
            kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
            this.f75697e.add(tag);
            return getThisObject$work_runtime_release();
        }

        public final b1 build() {
            b1 b1VarBuildInternal$work_runtime_release = buildInternal$work_runtime_release();
            f fVar = this.f75696d.f89062j;
            boolean z10 = fVar.hasContentUriTriggers() || fVar.requiresBatteryNotLow() || fVar.requiresCharging() || fVar.requiresDeviceIdle();
            v6.b0 b0Var = this.f75696d;
            if (b0Var.f89069q) {
                if (z10) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (b0Var.f89059g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            String traceTag = b0Var.getTraceTag();
            if (traceTag == null) {
                v6.b0 b0Var2 = this.f75696d;
                b0Var2.setTraceTag(b.access$deriveTraceTagFromClassName(b1.f75689d, b0Var2.f89055c));
            } else if (traceTag.length() > 127) {
                this.f75696d.setTraceTag(sv.p0.take(traceTag, 127));
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
            setId(uuidRandomUUID);
            return b1VarBuildInternal$work_runtime_release;
        }

        public abstract b1 buildInternal$work_runtime_release();

        public final boolean getBackoffCriteriaSet$work_runtime_release() {
            return this.f75694b;
        }

        public final UUID getId$work_runtime_release() {
            return this.f75695c;
        }

        public final Set<String> getTags$work_runtime_release() {
            return this.f75697e;
        }

        public abstract a getThisObject$work_runtime_release();

        public final v6.b0 getWorkSpec$work_runtime_release() {
            return this.f75696d;
        }

        public final Class<? extends b0> getWorkerClass$work_runtime_release() {
            return this.f75693a;
        }

        public final a keepResultsForAtLeast(long j10, TimeUnit timeUnit) {
            kotlin.jvm.internal.e0.checkNotNullParameter(timeUnit, "timeUnit");
            this.f75696d.f89067o = timeUnit.toMillis(j10);
            return getThisObject$work_runtime_release();
        }

        public final a setBackoffCriteria(n6.a backoffPolicy, long j10, TimeUnit timeUnit) {
            kotlin.jvm.internal.e0.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            kotlin.jvm.internal.e0.checkNotNullParameter(timeUnit, "timeUnit");
            this.f75694b = true;
            v6.b0 b0Var = this.f75696d;
            b0Var.f89064l = backoffPolicy;
            b0Var.setBackoffDelayDuration(timeUnit.toMillis(j10));
            return getThisObject$work_runtime_release();
        }

        public final void setBackoffCriteriaSet$work_runtime_release(boolean z10) {
            this.f75694b = z10;
        }

        public final a setBackoffForSystemInterruptions() {
            this.f75696d.setBackOffOnSystemInterruptions(Boolean.TRUE);
            return getThisObject$work_runtime_release();
        }

        public final a setConstraints(f constraints) {
            kotlin.jvm.internal.e0.checkNotNullParameter(constraints, "constraints");
            this.f75696d.f89062j = constraints;
            return getThisObject$work_runtime_release();
        }

        public a setExpedited(o0 policy) {
            kotlin.jvm.internal.e0.checkNotNullParameter(policy, "policy");
            v6.b0 b0Var = this.f75696d;
            b0Var.f89069q = true;
            b0Var.f89070r = policy;
            return getThisObject$work_runtime_release();
        }

        public final a setId(UUID id2) {
            kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
            this.f75695c = id2;
            String string = id2.toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
            this.f75696d = new v6.b0(string, this.f75696d);
            return getThisObject$work_runtime_release();
        }

        public final void setId$work_runtime_release(UUID uuid) {
            kotlin.jvm.internal.e0.checkNotNullParameter(uuid, "<set-?>");
            this.f75695c = uuid;
        }

        public a setInitialDelay(long j10, TimeUnit timeUnit) {
            kotlin.jvm.internal.e0.checkNotNullParameter(timeUnit, "timeUnit");
            this.f75696d.f89059g = timeUnit.toMillis(j10);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f75696d.f89059g) {
                return getThisObject$work_runtime_release();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        public final a setInitialRunAttemptCount(int i10) {
            this.f75696d.f89063k = i10;
            return getThisObject$work_runtime_release();
        }

        public final a setInitialState(x0 state) {
            kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
            this.f75696d.f89054b = state;
            return getThisObject$work_runtime_release();
        }

        public final a setInputData(androidx.work.b inputData) {
            kotlin.jvm.internal.e0.checkNotNullParameter(inputData, "inputData");
            this.f75696d.f89057e = inputData;
            return getThisObject$work_runtime_release();
        }

        public final a setLastEnqueueTime(long j10, TimeUnit timeUnit) {
            kotlin.jvm.internal.e0.checkNotNullParameter(timeUnit, "timeUnit");
            this.f75696d.f89066n = timeUnit.toMillis(j10);
            return getThisObject$work_runtime_release();
        }

        public final a setScheduleRequestedAt(long j10, TimeUnit timeUnit) {
            kotlin.jvm.internal.e0.checkNotNullParameter(timeUnit, "timeUnit");
            this.f75696d.f89068p = timeUnit.toMillis(j10);
            return getThisObject$work_runtime_release();
        }

        public final a setTraceTag(String traceTag) {
            kotlin.jvm.internal.e0.checkNotNullParameter(traceTag, "traceTag");
            this.f75696d.setTraceTag(traceTag);
            return getThisObject$work_runtime_release();
        }

        public final void setWorkSpec$work_runtime_release(v6.b0 b0Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(b0Var, "<set-?>");
            this.f75696d = b0Var;
        }

        public final a keepResultsForAtLeast(Duration duration) {
            kotlin.jvm.internal.e0.checkNotNullParameter(duration, "duration");
            this.f75696d.f89067o = w6.e.toMillisCompat(duration);
            return getThisObject$work_runtime_release();
        }

        public final a setBackoffCriteria(n6.a backoffPolicy, Duration duration) {
            kotlin.jvm.internal.e0.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            kotlin.jvm.internal.e0.checkNotNullParameter(duration, "duration");
            this.f75694b = true;
            v6.b0 b0Var = this.f75696d;
            b0Var.f89064l = backoffPolicy;
            b0Var.setBackoffDelayDuration(w6.e.toMillisCompat(duration));
            return getThisObject$work_runtime_release();
        }

        public a setInitialDelay(Duration duration) {
            kotlin.jvm.internal.e0.checkNotNullParameter(duration, "duration");
            this.f75696d.f89059g = w6.e.toMillisCompat(duration);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f75696d.f89059g) {
                return getThisObject$work_runtime_release();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }
}
