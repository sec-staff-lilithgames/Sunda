package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import md.d0;
import md.h0;
import on.z;
import yd.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f27009b = 0;

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        h0.initialize(getApplicationContext());
        d0.a priority = d0.builder().setBackendName(string).setPriority(a.valueOf(i10));
        if (string2 != null) {
            priority.setExtras(Base64.decode(string2, 0));
        }
        h0.getInstance().getUploader().upload(priority.build(), i11, new z(16, this, jobParameters));
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
