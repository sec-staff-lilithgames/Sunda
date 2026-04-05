package com.vungle.ads.internal.task;

import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface Job {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Result {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final int FAILURE = 1;
        public static final int RESCHEDULE = 2;
        public static final int SUCCESS = 0;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int FAILURE = 1;
            public static final int RESCHEDULE = 2;
            public static final int SUCCESS = 0;

            private Companion() {
            }
        }
    }

    int onRunJob(Bundle bundle, JobRunner jobRunner);
}
