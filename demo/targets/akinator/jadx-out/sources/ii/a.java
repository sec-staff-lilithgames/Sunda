package ii;

import ao.q0;
import com.applovin.impl.ga;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ga f59606a = new ga(2);

    public static <T> Task<T> race(Task<T> task, Task<T> task2) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        q0 q0Var = new q0(taskCompletionSource, 10, new AtomicBoolean(false), cancellationTokenSource);
        ga gaVar = f59606a;
        task.continueWithTask(gaVar, q0Var);
        task2.continueWithTask(gaVar, q0Var);
        return taskCompletionSource.getTask();
    }
}
