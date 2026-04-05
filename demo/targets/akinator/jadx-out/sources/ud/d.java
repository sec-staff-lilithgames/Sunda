package ud;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.zip.Adler32;
import md.d0;
import vd.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class d implements l {

    /* renamed from: a, reason: collision with root package name */
    public final Context f88415a;

    /* renamed from: b, reason: collision with root package name */
    public final vd.d f88416b;

    /* renamed from: c, reason: collision with root package name */
    public final e f88417c;

    public d(Context context, vd.d dVar, e eVar) {
        this.f88415a = context;
        this.f88416b = dVar;
        this.f88417c = eVar;
    }

    @Override // ud.l
    public void schedule(d0 d0Var, int i10) {
        schedule(d0Var, i10, false);
    }

    @Override // ud.l
    public void schedule(d0 d0Var, int i10, boolean z10) {
        Context context = this.f88415a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName(C.UTF8_NAME)));
        adler32.update(d0Var.getBackendName().getBytes(Charset.forName(C.UTF8_NAME)));
        adler32.update(ByteBuffer.allocate(4).putInt(yd.a.toInt(d0Var.getPriority())).array());
        if (d0Var.getExtras() != null) {
            adler32.update(d0Var.getExtras());
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i11 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i11 >= i10) {
                        rd.a.d("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", d0Var);
                        return;
                    }
                }
            }
        }
        long nextCallTime = ((p) this.f88416b).getNextCallTime(d0Var);
        JobInfo.Builder builderConfigureJob = this.f88417c.configureJob(new JobInfo.Builder(value, componentName), d0Var.getPriority(), nextCallTime, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", d0Var.getBackendName());
        persistableBundle.putInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, yd.a.toInt(d0Var.getPriority()));
        if (d0Var.getExtras() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(d0Var.getExtras(), 0));
        }
        builderConfigureJob.setExtras(persistableBundle);
        rd.a.d("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", d0Var, Integer.valueOf(value), Long.valueOf(this.f88417c.getScheduleDelay(d0Var.getPriority(), nextCallTime, i10)), Long.valueOf(nextCallTime), Integer.valueOf(i10));
        jobScheduler.schedule(builderConfigureJob.build());
    }
}
