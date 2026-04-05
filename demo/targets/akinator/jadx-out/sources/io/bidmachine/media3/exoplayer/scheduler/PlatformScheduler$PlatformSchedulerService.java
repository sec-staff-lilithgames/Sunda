package io.bidmachine.media3.exoplayer.scheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.PersistableBundle;
import e3.g;
import io.bidmachine.media3.common.util.a1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class PlatformScheduler$PlatformSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        int notMetRequirements = new Requirements(extras.getInt("requirements")).getNotMetRequirements(this);
        if (notMetRequirements != 0) {
            g.t(notMetRequirements, "Requirements not met: ", "PlatformScheduler");
            jobFinished(jobParameters, true);
            return false;
        }
        String str = (String) io.bidmachine.media3.common.util.a.checkNotNull(extras.getString("service_action"));
        a1.startForegroundService(this, new Intent(str).setPackage((String) io.bidmachine.media3.common.util.a.checkNotNull(extras.getString("service_package"))));
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
