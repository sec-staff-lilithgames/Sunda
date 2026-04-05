package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.selects.SelectClause0;
import kv.l;
import rv.t;
import rv.y;
import tu.f;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class NonCancellable extends zu.a implements Job {
    public static final NonCancellable INSTANCE = new NonCancellable();
    private static final String message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited";

    private NonCancellable() {
        super(Job.Key);
    }

    @Override // kotlinx.coroutines.Job
    @f
    public ChildHandle attachChild(ChildJob childJob) {
        return NonDisposableHandle.INSTANCE;
    }

    @Override // kotlinx.coroutines.Job
    @f
    public void cancel(CancellationException cancellationException) {
    }

    @Override // kotlinx.coroutines.Job
    @f
    public CancellationException getCancellationException() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    public t getChildren() {
        return y.emptySequence();
    }

    @Override // kotlinx.coroutines.Job
    public SelectClause0 getOnJoin() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    public Job getParent() {
        return null;
    }

    @Override // kotlinx.coroutines.Job
    @f
    public DisposableHandle invokeOnCompletion(l lVar) {
        return NonDisposableHandle.INSTANCE;
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.Job
    public boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    public boolean isCompleted() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    @f
    public Object join(d<? super x0> dVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    @f
    public Job plus(Job job) {
        return Job.DefaultImpls.plus((Job) this, job);
    }

    @Override // kotlinx.coroutines.Job
    @f
    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.Job
    @f
    public /* synthetic */ boolean cancel(Throwable th2) {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    @f
    public DisposableHandle invokeOnCompletion(boolean z10, boolean z11, l lVar) {
        return NonDisposableHandle.INSTANCE;
    }

    @Override // kotlinx.coroutines.Job
    @f
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    @f
    public static /* synthetic */ void getChildren$annotations() {
    }

    @f
    public static /* synthetic */ void getOnJoin$annotations() {
    }

    @f
    public static /* synthetic */ void getParent$annotations() {
    }

    @f
    public static /* synthetic */ void isActive$annotations() {
    }

    @f
    public static /* synthetic */ void isCancelled$annotations() {
    }

    @f
    public static /* synthetic */ void isCompleted$annotations() {
    }
}
