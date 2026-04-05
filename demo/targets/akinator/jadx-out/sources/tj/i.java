package tj;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class i implements m {

    /* renamed from: a, reason: collision with root package name */
    public final n f86947a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f86948b;

    public i(n nVar, TaskCompletionSource<k> taskCompletionSource) {
        this.f86947a = nVar;
        this.f86948b = taskCompletionSource;
    }

    @Override // tj.m
    public boolean onException(Exception exc) {
        this.f86948b.trySetException(exc);
        return true;
    }

    @Override // tj.m
    public boolean onStateReached(vj.f fVar) {
        if (!fVar.isRegistered() || this.f86947a.isAuthTokenExpired(fVar)) {
            return false;
        }
        this.f86948b.setResult(k.builder().setToken(fVar.getAuthToken()).setTokenExpirationTimestamp(fVar.getExpiresInSecs()).setTokenCreationTimestamp(fVar.getTokenCreationEpochInSecs()).build());
        return true;
    }
}
