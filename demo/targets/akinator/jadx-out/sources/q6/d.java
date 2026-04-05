package q6;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import n6.c0;
import n6.d0;
import n6.f;
import v6.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final String f82524d = c0.tagWithPrefix("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f82525a;

    /* renamed from: b, reason: collision with root package name */
    public final n6.b f82526b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f82527c;

    public d(Context context, n6.b bVar, boolean z10) {
        this.f82526b = bVar;
        this.f82525a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.f82527c = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JobInfo a(b0 b0Var, int i10) {
        int i11;
        String traceTag;
        n6.f fVar = b0Var.f89062j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", b0Var.f89053a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", b0Var.getGeneration());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", b0Var.isPeriodic());
        JobInfo.Builder extras = new JobInfo.Builder(i10, this.f82525a).setRequiresCharging(fVar.requiresCharging()).setRequiresDeviceIdle(fVar.requiresDeviceIdle()).setExtras(persistableBundle);
        NetworkRequest requiredNetworkRequest = fVar.getRequiredNetworkRequest();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 28 || requiredNetworkRequest == null) {
            d0 requiredNetworkType = fVar.getRequiredNetworkType();
            if (i12 < 30 || requiredNetworkType != d0.f75710h) {
                int iOrdinal = requiredNetworkType.ordinal();
                if (iOrdinal == 0) {
                    i11 = 0;
                } else if (iOrdinal != 1) {
                    i11 = 2;
                    if (iOrdinal != 2) {
                        i11 = 3;
                        if (iOrdinal != 3) {
                            i11 = 4;
                            if (iOrdinal != 4 || i12 < 26) {
                                c0.get().debug(f82524d, "API version too low. Cannot convert network type value " + requiredNetworkType);
                                i11 = 1;
                            }
                        }
                    }
                } else {
                    i11 = 1;
                }
                extras.setRequiredNetworkType(i11);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            e.setRequiredNetworkRequest(extras, requiredNetworkRequest);
        }
        if (!fVar.requiresDeviceIdle()) {
            extras.setBackoffCriteria(b0Var.f89065m, b0Var.f89064l == n6.a.f75681c ? 0 : 1);
        }
        long jMax = Math.max(b0Var.calculateNextRunTime() - this.f82526b.currentTimeMillis(), 0L);
        if (i12 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!b0Var.f89069q && this.f82527c) {
            extras.setImportantWhileForeground(true);
        }
        if (fVar.hasContentUriTriggers()) {
            for (f.c cVar : fVar.getContentUriTriggers()) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(cVar.getUri(), cVar.isTriggeredForDescendants() ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(fVar.getContentTriggerUpdateDelayMillis());
            extras.setTriggerContentMaxDelay(fVar.getContentTriggerMaxDelayMillis());
        }
        extras.setPersisted(false);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            extras.setRequiresBatteryNotLow(fVar.requiresBatteryNotLow());
            extras.setRequiresStorageNotLow(fVar.requiresStorageNotLow());
        }
        Object[] objArr = b0Var.f89063k > 0;
        boolean z10 = jMax > 0;
        if (i13 >= 31 && b0Var.f89069q && objArr == false && !z10) {
            extras.setExpedited(true);
        }
        if (i13 >= 35 && (traceTag = b0Var.getTraceTag()) != null) {
            extras.setTraceTag(traceTag);
        }
        return extras.build();
    }
}
