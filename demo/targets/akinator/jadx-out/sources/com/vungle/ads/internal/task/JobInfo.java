package com.vungle.ads.internal.task;

import android.os.Bundle;
import com.moloco.sdk.BKC.KerkSviMAy;
import com.vungle.ads.internal.util.Logger;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class JobInfo implements Cloneable {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "JobInfo";
    private long delay;
    private Bundle extras;
    private final String jobTag;
    private long nextRescheduleTimeout;
    private int priority;
    private int requiredNetworkType;
    private int reschedulePolicy;
    private long rescheduleTimeout;
    private boolean updateCurrent;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.RUNTIME)
    public @interface NetworkType {
        public static final int ANY = 0;
        public static final int CONNECTED = 1;
        public static final Companion Companion = Companion.$$INSTANCE;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int ANY = 0;
            public static final int CONNECTED = 1;

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Priority {
        public static final int CRITICAL = 5;
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final int HIGH = 3;
        public static final int HIGHEST = 4;
        public static final int LOW = 1;
        public static final int LOWEST = 0;
        public static final int NORMAL = 2;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int CRITICAL = 5;
            public static final int HIGH = 3;
            public static final int HIGHEST = 4;
            public static final int LOW = 1;
            public static final int LOWEST = 0;
            public static final int NORMAL = 2;

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ReschedulePolicy {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final int EXPONENTIAL = 1;
        public static final int LINEAR = 0;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int EXPONENTIAL = 1;
            public static final int LINEAR = 0;

            private Companion() {
            }
        }
    }

    public JobInfo(String jobTag) {
        e0.checkNotNullParameter(jobTag, "jobTag");
        this.jobTag = jobTag;
        this.extras = new Bundle();
        this.reschedulePolicy = 1;
        this.priority = 2;
    }

    public static /* synthetic */ void getPriority$annotations() {
    }

    @NetworkType
    public static /* synthetic */ void getRequiredNetworkType$annotations() {
    }

    private static /* synthetic */ void getReschedulePolicy$annotations() {
    }

    public Object clone() {
        return super.clone();
    }

    public final long getDelay() {
        return this.delay;
    }

    public final Bundle getExtras() {
        return this.extras;
    }

    public final String getJobTag() {
        return this.jobTag;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final int getRequiredNetworkType() {
        return this.requiredNetworkType;
    }

    public final boolean getUpdateCurrent() {
        return this.updateCurrent;
    }

    public final long makeNextRescedule() {
        long j10 = this.rescheduleTimeout;
        if (j10 == 0) {
            return 0L;
        }
        long j11 = this.nextRescheduleTimeout;
        if (j11 == 0) {
            this.nextRescheduleTimeout = j10;
        } else if (this.reschedulePolicy == 1) {
            this.nextRescheduleTimeout = j11 * 2;
        }
        return this.nextRescheduleTimeout;
    }

    public final JobInfo setDelay(long j10) {
        this.delay = j10;
        return this;
    }

    public final JobInfo setExtras(Bundle extras) {
        e0.checkNotNullParameter(extras, "extras");
        this.extras = extras;
        return this;
    }

    public final JobInfo setPriority(int i10) {
        this.priority = i10;
        return this;
    }

    public final JobInfo setRequiredNetworkType(@NetworkType int i10) {
        this.requiredNetworkType = i10;
        return this;
    }

    public final JobInfo setReschedulePolicy(long j10, int i10) {
        this.rescheduleTimeout = j10;
        this.reschedulePolicy = i10;
        return this;
    }

    public final JobInfo setUpdateCurrent(boolean z10) {
        this.updateCurrent = z10;
        return this;
    }

    public final JobInfo copy() throws CloneNotSupportedException {
        try {
            Object objClone = super.clone();
            e0.checkNotNull(objClone, KerkSviMAy.Qwm);
            return (JobInfo) objClone;
        } catch (CloneNotSupportedException e10) {
            Logger.Companion.e(TAG, "Cannot copy JobInfo " + this, e10);
            return null;
        }
    }
}
