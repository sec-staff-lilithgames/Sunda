package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.ServiceProvider;
import kotlin.jvm.internal.e0;
import kv.a;
import n6.a0;
import tu.o;
import tu.q;
import tu.s;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class OperativeEventJob extends UniversalRequestJob implements IServiceComponent {
    private final o getOperativeRequestPolicy$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperativeEventJob(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(workerParams, "workerParams");
        this.getOperativeRequestPolicy$delegate = q.lazy(s.f87405e, (a) new OperativeEventJob$special$$inlined$inject$default$1(this, ServiceProvider.NAMED_OPERATIVE_REQ));
    }

    private final GetRequestPolicy getGetOperativeRequestPolicy() {
        return (GetRequestPolicy) this.getOperativeRequestPolicy$delegate.getValue();
    }

    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob, androidx.work.CoroutineWorker
    public Object doWork(d<? super a0> dVar) {
        setRequestPolicy(getGetOperativeRequestPolicy().invoke());
        return super.doWork(dVar);
    }
}
