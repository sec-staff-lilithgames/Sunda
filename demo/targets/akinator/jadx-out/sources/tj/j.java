package tj;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class j implements m {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f86949a;

    public j(TaskCompletionSource<String> taskCompletionSource) {
        this.f86949a = taskCompletionSource;
    }

    @Override // tj.m
    public boolean onException(Exception exc) {
        return false;
    }

    @Override // tj.m
    public boolean onStateReached(vj.f fVar) {
        if (!fVar.isUnregistered() && !fVar.isRegistered() && !fVar.isErrored()) {
            return false;
        }
        this.f86949a.trySetResult(fVar.getFirebaseInstallationId());
        return true;
    }
}
