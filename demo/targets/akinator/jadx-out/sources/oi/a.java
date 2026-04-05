package oi;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ei.f;
import hi.c0;
import hi.r0;
import jd.e;
import ki.f2;
import md.e0;
import md.h0;
import nh.n1;
import pi.g;
import pi.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final li.c f79398b = new li.c();

    /* renamed from: c, reason: collision with root package name */
    public static final String f79399c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: d, reason: collision with root package name */
    public static final String f79400d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e, reason: collision with root package name */
    public static final n1 f79401e = new n1(23);

    /* renamed from: a, reason: collision with root package name */
    public final c f79402a;

    public a(c cVar) {
        this.f79402a = cVar;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }

    public static a create(Context context, j jVar, r0 r0Var) {
        h0.initialize(context);
        return new a(new c(((e0) h0.getInstance().newFactory(new kd.a(f79399c, f79400d))).getTransport("FIREBASE_CRASHLYTICS_REPORT", f2.class, e.of("json"), f79401e), ((g) jVar).getSettingsSync(), r0Var));
    }

    public Task<c0> enqueueReport(c0 c0Var, boolean z10) {
        TaskCompletionSource taskCompletionSource;
        c cVar = this.f79402a;
        synchronized (cVar.f79411f) {
            try {
                taskCompletionSource = new TaskCompletionSource();
                if (z10) {
                    cVar.f79414i.incrementRecordedOnDemandExceptions();
                    if (cVar.f79411f.size() < cVar.f79410e) {
                        f.getLogger().d("Enqueueing report: " + c0Var.getSessionId());
                        f.getLogger().d("Queue size: " + cVar.f79411f.size());
                        cVar.f79412g.execute(new b(cVar, c0Var, taskCompletionSource));
                        f.getLogger().d("Closing task for report: " + c0Var.getSessionId());
                        taskCompletionSource.trySetResult(c0Var);
                    } else {
                        cVar.a();
                        f.getLogger().d("Dropping report due to queue being full: " + c0Var.getSessionId());
                        cVar.f79414i.incrementDroppedOnDemandExceptions();
                        taskCompletionSource.trySetResult(c0Var);
                    }
                } else {
                    cVar.b(c0Var, taskCompletionSource);
                }
            } finally {
            }
        }
        return taskCompletionSource.getTask();
    }
}
