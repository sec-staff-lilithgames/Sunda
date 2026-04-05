package com.ironsource.environment.workerthread;

import com.ironsource.C3422r4;
import com.ironsource.environment.workerthread.WorkerResult;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class WorkerManager<T> {

    /* renamed from: a, reason: collision with root package name */
    List<Callable<T>> f36657a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f36658b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface WorkEndedListener<T> {
        void onWorkCompleted(List<WorkerResult<T>> list, long j10);

        void onWorkFailed(String str);
    }

    public WorkerManager(ExecutorService executorService) {
        this.f36658b = executorService;
    }

    public void addCallable(Callable<T> callable) {
        this.f36657a.add(callable);
    }

    public void startWork(WorkEndedListener<T> workEndedListener, long j10, TimeUnit timeUnit) throws InterruptedException {
        if (this.f36658b.isShutdown()) {
            workEndedListener.onWorkFailed("can not start work, executor has been shut down");
            return;
        }
        if (this.f36657a.isEmpty()) {
            workEndedListener.onWorkFailed("can not start work, callable list is empty");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            List<Future<T>> listInvokeAll = this.f36658b.invokeAll(this.f36657a, j10, timeUnit);
            for (int i10 = 0; i10 < listInvokeAll.size(); i10++) {
                Future<T> future = listInvokeAll.get(i10);
                if (!future.isDone() || future.isCancelled()) {
                    arrayList.add(new WorkerResult.Canceled(this.f36657a.get(i10)));
                } else {
                    try {
                        arrayList.add(new WorkerResult.Completed(future.get()));
                    } catch (InterruptedException e10) {
                        e = e10;
                        C3422r4.d().a(e);
                        arrayList.add(new WorkerResult.Failed(this.f36657a.get(i10), e));
                    } catch (CancellationException e11) {
                        C3422r4.d().a(e11);
                        arrayList.add(new WorkerResult.Canceled(this.f36657a.get(i10)));
                    } catch (ExecutionException e12) {
                        e = e12;
                        C3422r4.d().a(e);
                        arrayList.add(new WorkerResult.Failed(this.f36657a.get(i10), e));
                    }
                }
            }
            workEndedListener.onWorkCompleted(arrayList, System.currentTimeMillis() - jCurrentTimeMillis);
            this.f36658b.shutdownNow();
        } catch (Exception e13) {
            C3422r4.d().a(e13);
            IronLog.INTERNAL.error(e13.toString());
            workEndedListener.onWorkFailed("failed to invoke callables, error= " + e13.getMessage());
            this.f36658b.shutdownNow();
        }
    }
}
