package xr;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.InputStream;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c0 implements m9 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f92296a;

    /* renamed from: b, reason: collision with root package name */
    public final m9 f92297b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f92298c = new ArrayDeque();

    public c0(m9 m9Var, b0 b0Var) {
        this.f92297b = (m9) mh.p1.checkNotNull(m9Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f92296a = (b0) mh.p1.checkNotNull(b0Var, "transportExecutor");
    }

    @Override // xr.m9
    public void bytesRead(int i10) {
        this.f92296a.runOnTransportThread(new y(this, i10));
    }

    @Override // xr.m9
    public void deframeFailed(Throwable th2) {
        this.f92296a.runOnTransportThread(new a0(this, th2));
    }

    @Override // xr.m9
    public void deframerClosed(boolean z10) {
        this.f92296a.runOnTransportThread(new z(this, z10));
    }

    public InputStream messageReadQueuePoll() {
        return (InputStream) this.f92298c.poll();
    }

    @Override // xr.m9
    public void messagesAvailable(ve veVar) {
        while (true) {
            InputStream next = veVar.next();
            if (next == null) {
                return;
            } else {
                this.f92298c.add(next);
            }
        }
    }
}
