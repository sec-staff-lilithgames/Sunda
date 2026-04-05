package com.vungle.ads.internal.task;

import android.os.Bundle;
import android.os.Process;
import com.vungle.ads.internal.util.Logger;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class JobRunnable extends PriorityRunnable {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "JobRunnable";
    private final JobCreator creator;
    private final JobRunner jobRunner;
    private final JobInfo jobinfo;
    private final ThreadPriorityHelper threadPriorityHelper;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public JobRunnable(JobInfo jobinfo, JobCreator creator, JobRunner jobRunner, ThreadPriorityHelper threadPriorityHelper) {
        e0.checkNotNullParameter(jobinfo, "jobinfo");
        e0.checkNotNullParameter(creator, "creator");
        e0.checkNotNullParameter(jobRunner, "jobRunner");
        this.jobinfo = jobinfo;
        this.creator = creator;
        this.jobRunner = jobRunner;
        this.threadPriorityHelper = threadPriorityHelper;
    }

    @Override // com.vungle.ads.internal.task.PriorityRunnable
    public int getPriority() {
        return this.jobinfo.getPriority();
    }

    @Override // java.lang.Runnable
    public void run() {
        ThreadPriorityHelper threadPriorityHelper = this.threadPriorityHelper;
        if (threadPriorityHelper != null) {
            try {
                int iMakeAndroidThreadPriority = threadPriorityHelper.makeAndroidThreadPriority(this.jobinfo);
                Process.setThreadPriority(iMakeAndroidThreadPriority);
                Logger.Companion companion = Logger.Companion;
                String TAG2 = TAG;
                e0.checkNotNullExpressionValue(TAG2, "TAG");
                companion.d(TAG2, "Setting process thread prio = " + iMakeAndroidThreadPriority + " for " + this.jobinfo.getJobTag());
            } catch (Throwable unused) {
                Logger.Companion companion2 = Logger.Companion;
                String TAG3 = TAG;
                e0.checkNotNullExpressionValue(TAG3, "TAG");
                companion2.e(TAG3, "Error on setting process thread priority");
            }
        }
        try {
            String jobTag = this.jobinfo.getJobTag();
            Bundle extras = this.jobinfo.getExtras();
            Logger.Companion companion3 = Logger.Companion;
            String TAG4 = TAG;
            e0.checkNotNullExpressionValue(TAG4, "TAG");
            companion3.d(TAG4, "Start job " + jobTag + "Thread " + Thread.currentThread().getName());
            int iOnRunJob = this.creator.create(jobTag).onRunJob(extras, this.jobRunner);
            e0.checkNotNullExpressionValue(TAG4, "TAG");
            companion3.d(TAG4, "On job finished " + jobTag + " with result " + iOnRunJob);
            if (iOnRunJob == 2) {
                long jMakeNextRescedule = this.jobinfo.makeNextRescedule();
                if (jMakeNextRescedule > 0) {
                    this.jobinfo.setDelay(jMakeNextRescedule);
                    this.jobRunner.execute(this.jobinfo);
                    e0.checkNotNullExpressionValue(TAG4, "TAG");
                    companion3.d(TAG4, "Rescheduling " + jobTag + " in " + jMakeNextRescedule);
                }
            }
        } catch (Exception e10) {
            Logger.Companion companion4 = Logger.Companion;
            String TAG5 = TAG;
            e0.checkNotNullExpressionValue(TAG5, "TAG");
            companion4.e(TAG5, "Cannot create job" + e10.getLocalizedMessage());
        }
    }

    public static /* synthetic */ void getPriority$annotations() {
    }
}
