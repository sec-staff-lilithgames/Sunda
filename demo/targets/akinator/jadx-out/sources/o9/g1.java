package o9;

import android.os.AsyncTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f78156b;

    public g1(h1 h1Var) {
        this.f78156b = h1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f78156b.f78185b.D) {
            new f1(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }
}
