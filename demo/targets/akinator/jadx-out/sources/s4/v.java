package s4;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v extends q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f85466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f85467b;

    public v(q qVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f85466a = qVar;
        this.f85467b = threadPoolExecutor;
    }

    @Override // s4.q
    public void onFailed(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.f85467b;
        try {
            this.f85466a.onFailed(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // s4.q
    public void onLoaded(o0 o0Var) {
        ThreadPoolExecutor threadPoolExecutor = this.f85467b;
        try {
            this.f85466a.onLoaded(o0Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
