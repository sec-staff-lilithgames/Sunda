package n6;

import j$.time.Duration;
import java.util.concurrent.TimeUnit;
import kotlin.reflect.KClass;
import n6.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p0 extends b1 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends b1.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<? extends b0> workerClass, long j10, TimeUnit repeatIntervalTimeUnit) {
            super(workerClass);
            kotlin.jvm.internal.e0.checkNotNullParameter(workerClass, "workerClass");
            kotlin.jvm.internal.e0.checkNotNullParameter(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            getWorkSpec$work_runtime_release().setPeriodic(repeatIntervalTimeUnit.toMillis(j10));
        }

        public final a clearNextScheduleTimeOverride() {
            getWorkSpec$work_runtime_release().setNextScheduleTimeOverride(Long.MAX_VALUE);
            getWorkSpec$work_runtime_release().setNextScheduleTimeOverrideGeneration(1);
            return this;
        }

        public final a setNextScheduleTimeOverride(long j10) {
            if (j10 == Long.MAX_VALUE) {
                throw new IllegalArgumentException("Cannot set Long.MAX_VALUE as the schedule override time");
            }
            getWorkSpec$work_runtime_release().setNextScheduleTimeOverride(j10);
            getWorkSpec$work_runtime_release().setNextScheduleTimeOverrideGeneration(1);
            return this;
        }

        @Override // n6.b1.a
        public p0 buildInternal$work_runtime_release() {
            if (getBackoffCriteriaSet$work_runtime_release() && getWorkSpec$work_runtime_release().f89062j.requiresDeviceIdle()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            if (getWorkSpec$work_runtime_release().f89069q) {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
            }
            return new p0(this);
        }

        @Override // n6.b1.a
        public a getThisObject$work_runtime_release() {
            return this;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(KClass<? extends b0> workerClass, long j10, TimeUnit repeatIntervalTimeUnit) {
            super(jv.a.getJavaClass((KClass) workerClass));
            kotlin.jvm.internal.e0.checkNotNullParameter(workerClass, "workerClass");
            kotlin.jvm.internal.e0.checkNotNullParameter(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            getWorkSpec$work_runtime_release().setPeriodic(repeatIntervalTimeUnit.toMillis(j10));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<? extends b0> workerClass, Duration repeatInterval) {
            super(workerClass);
            kotlin.jvm.internal.e0.checkNotNullParameter(workerClass, "workerClass");
            kotlin.jvm.internal.e0.checkNotNullParameter(repeatInterval, "repeatInterval");
            getWorkSpec$work_runtime_release().setPeriodic(w6.e.toMillisCompat(repeatInterval));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(KClass<? extends b0> workerClass, Duration repeatInterval) {
            super(jv.a.getJavaClass((KClass) workerClass));
            kotlin.jvm.internal.e0.checkNotNullParameter(workerClass, "workerClass");
            kotlin.jvm.internal.e0.checkNotNullParameter(repeatInterval, "repeatInterval");
            getWorkSpec$work_runtime_release().setPeriodic(w6.e.toMillisCompat(repeatInterval));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<? extends b0> workerClass, long j10, TimeUnit repeatIntervalTimeUnit, long j11, TimeUnit flexIntervalTimeUnit) {
            super(workerClass);
            kotlin.jvm.internal.e0.checkNotNullParameter(workerClass, "workerClass");
            kotlin.jvm.internal.e0.checkNotNullParameter(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            kotlin.jvm.internal.e0.checkNotNullParameter(flexIntervalTimeUnit, "flexIntervalTimeUnit");
            getWorkSpec$work_runtime_release().setPeriodic(repeatIntervalTimeUnit.toMillis(j10), flexIntervalTimeUnit.toMillis(j11));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(KClass<? extends b0> workerClass, long j10, TimeUnit repeatIntervalTimeUnit, long j11, TimeUnit flexIntervalTimeUnit) {
            super(jv.a.getJavaClass((KClass) workerClass));
            kotlin.jvm.internal.e0.checkNotNullParameter(workerClass, "workerClass");
            kotlin.jvm.internal.e0.checkNotNullParameter(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            kotlin.jvm.internal.e0.checkNotNullParameter(flexIntervalTimeUnit, "flexIntervalTimeUnit");
            getWorkSpec$work_runtime_release().setPeriodic(repeatIntervalTimeUnit.toMillis(j10), flexIntervalTimeUnit.toMillis(j11));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<? extends b0> workerClass, Duration repeatInterval, Duration flexInterval) {
            super(workerClass);
            kotlin.jvm.internal.e0.checkNotNullParameter(workerClass, "workerClass");
            kotlin.jvm.internal.e0.checkNotNullParameter(repeatInterval, "repeatInterval");
            kotlin.jvm.internal.e0.checkNotNullParameter(flexInterval, "flexInterval");
            getWorkSpec$work_runtime_release().setPeriodic(w6.e.toMillisCompat(repeatInterval), w6.e.toMillisCompat(flexInterval));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(KClass<? extends b0> workerClass, Duration repeatInterval, Duration flexInterval) {
            super(jv.a.getJavaClass((KClass) workerClass));
            kotlin.jvm.internal.e0.checkNotNullParameter(workerClass, "workerClass");
            kotlin.jvm.internal.e0.checkNotNullParameter(repeatInterval, "repeatInterval");
            kotlin.jvm.internal.e0.checkNotNullParameter(flexInterval, "flexInterval");
            getWorkSpec$work_runtime_release().setPeriodic(w6.e.toMillisCompat(repeatInterval), w6.e.toMillisCompat(flexInterval));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(a builder) {
        super(builder.getId$work_runtime_release(), builder.getWorkSpec$work_runtime_release(), builder.getTags$work_runtime_release());
        kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
    }
}
