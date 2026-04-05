package xr;

import java.util.concurrent.Executor;
import wr.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class ze extends wr.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Executor f93361a;

    public ze(Executor executor) {
        this.f93361a = executor;
    }

    @Override // wr.p
    public void start(p.a aVar, wr.e4 e4Var) {
        this.f93361a.execute(new ye(aVar));
    }

    @Override // wr.p
    public void halfClose() {
    }

    @Override // wr.p
    public void request(int i10) {
    }

    @Override // wr.p
    public void sendMessage(Object obj) {
    }

    @Override // wr.p
    public void cancel(String str, Throwable th2) {
    }
}
