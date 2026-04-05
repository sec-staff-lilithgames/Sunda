package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.environment.workerthread.WorkerManager;
import com.ironsource.environment.workerthread.WorkerResult;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class C3 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements WorkerManager.WorkEndedListener<D3> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f33910a;

        public a(b bVar) {
            this.f33910a = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkCompleted(List<WorkerResult<D3>> list, long j10) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (WorkerResult<D3> workerResult : list) {
                if (workerResult instanceof WorkerResult.Completed) {
                    arrayList2.add((D3) ((WorkerResult.Completed) workerResult).data);
                } else if (workerResult instanceof WorkerResult.Canceled) {
                    arrayList.add(((CallableC3557z3) ((WorkerResult.Canceled) workerResult).callable).c());
                } else if (workerResult instanceof WorkerResult.Failed) {
                    WorkerResult.Failed failed = (WorkerResult.Failed) workerResult;
                    CallableC3557z3 callableC3557z3 = (CallableC3557z3) failed.callable;
                    arrayList2.add(new D3(callableC3557z3.d(), callableC3557z3.c(), null, 0L, failed.exception.getMessage()));
                }
            }
            C3.this.a(arrayList2, arrayList, j10);
            this.f33910a.a(arrayList2, j10, arrayList);
        }

        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkFailed(String str) {
            String strK = a.b.k("failed to collect bidding data, error= ", str);
            IronLog.INTERNAL.verbose(strK);
            this.f33910a.onFailure(strK);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {
        void a(List<D3> list, long j10, List<String> list2);

        void onFailure(String str);
    }

    public void a(List<CallableC3557z3> list, b bVar, long j10, TimeUnit timeUnit) {
        try {
            if (list.isEmpty()) {
                IronLog.INTERNAL.verbose("BiddingDataCallable list is empty");
                return;
            }
            WorkerManager workerManager = new WorkerManager(IronSourceThreadManager.INSTANCE.getThreadPoolExecutor());
            Iterator<CallableC3557z3> it = list.iterator();
            while (it.hasNext()) {
                workerManager.addCallable(it.next());
            }
            IronLog.INTERNAL.verbose("instances=" + list.size() + ", timeout=" + j10 + " millis");
            workerManager.startWork(new a(bVar), j10, timeUnit);
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            String strO = b0.e2.o(th2, new StringBuilder("Exception - failed to collect bidding data, error= "));
            IronLog.INTERNAL.error(strO);
            bVar.onFailure(strO);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<D3> list, List<String> list2, long j10) {
        IronLog.INTERNAL.verbose("tokens received=" + list.size() + ", reached timeout=" + list2.size() + ", total duration=" + j10 + " millis");
        for (D3 d32 : list) {
            if (d32.a() != null) {
                IronLog.INTERNAL.verbose(d32.c() + " - success (" + d32.e() + " millis)");
            } else {
                IronLog.INTERNAL.verbose(d32.c() + " - failed (" + d32.e() + " millis) error: " + d32.b());
            }
        }
        for (String str : list2) {
            IronLog.INTERNAL.verbose(str + " reached timeout");
        }
    }
}
