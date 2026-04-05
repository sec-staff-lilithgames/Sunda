package com.google.firebase.messaging;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29869b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f29870c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f29871e;

    public /* synthetic */ q(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource, int i10) {
        this.f29869b = i10;
        this.f29870c = firebaseMessaging;
        this.f29871e = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f29869b;
        TaskCompletionSource taskCompletionSource = this.f29871e;
        FirebaseMessaging firebaseMessaging = this.f29870c;
        switch (i10) {
            case 0:
                j0 j0Var = FirebaseMessaging.f29723l;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    break;
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            default:
                j0 j0Var2 = FirebaseMessaging.f29723l;
                firebaseMessaging.getClass();
                try {
                    v vVar = firebaseMessaging.f29728c;
                    vVar.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("delete", "1");
                    Tasks.await(vVar.a(vVar.c(y.b(vVar.f29892a), "*", bundle)));
                    FirebaseMessaging.c(firebaseMessaging.f29727b).deleteToken(firebaseMessaging.d(), y.b(firebaseMessaging.f29726a));
                    taskCompletionSource.setResult(null);
                    break;
                } catch (Exception e11) {
                    taskCompletionSource.setException(e11);
                }
        }
    }
}
