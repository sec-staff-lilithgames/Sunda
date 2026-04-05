package ii;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f59609b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f59610c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public Task f59611e = Tasks.forResult(null);

    public c(ExecutorService executorService) {
        this.f59609b = executorService;
    }

    public void await() throws ExecutionException, InterruptedException, TimeoutException {
        Tasks.await(submit(new al.b(6)), 30L, TimeUnit.SECONDS);
        Thread.sleep(1L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f59609b.execute(runnable);
    }

    public ExecutorService getExecutor() {
        return this.f59609b;
    }

    public <T> Task<T> submit(Callable<T> callable) {
        Task<T> taskContinueWithTask;
        synchronized (this.f59610c) {
            taskContinueWithTask = this.f59611e.continueWithTask(this.f59609b, new b(callable, 0));
            this.f59611e = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    public <T> Task<T> submitTask(Callable<Task<T>> callable) {
        Task<T> taskContinueWithTask;
        synchronized (this.f59610c) {
            taskContinueWithTask = this.f59611e.continueWithTask(this.f59609b, new b(callable, 1));
            this.f59611e = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    public <T, R> Task<R> submitTaskOnSuccess(Callable<Task<T>> callable, SuccessContinuation<T, R> successContinuation) {
        Task<R> taskContinueWithTask;
        synchronized (this.f59610c) {
            taskContinueWithTask = this.f59611e.continueWithTask(this.f59609b, new b(callable, 3)).continueWithTask(this.f59609b, new ha.a(successContinuation, 9));
            this.f59611e = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    public Task<Void> submit(Runnable runnable) {
        Task<Void> taskContinueWithTask;
        synchronized (this.f59610c) {
            taskContinueWithTask = this.f59611e.continueWithTask(this.f59609b, new ha.a(runnable, 8));
            this.f59611e = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    public <T, R> Task<R> submitTask(Callable<Task<T>> callable, Continuation<T, Task<R>> continuation) {
        Task<R> taskContinueWithTask;
        synchronized (this.f59610c) {
            taskContinueWithTask = this.f59611e.continueWithTask(this.f59609b, new b(callable, 2)).continueWithTask(this.f59609b, continuation);
            this.f59611e = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }
}
