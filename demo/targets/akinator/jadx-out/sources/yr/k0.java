package yr;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ServerSocketFactory;
import mh.p1;
import sh.n1;
import wr.b6;
import wr.e2;
import wr.m2;
import wr.n2;
import xr.de;
import xr.n5;
import xr.y9;
import yr.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k0 implements n5 {

    /* renamed from: n, reason: collision with root package name */
    public static final Logger f94938n = Logger.getLogger(k0.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final SocketAddress f94939a;

    /* renamed from: b, reason: collision with root package name */
    public final ServerSocketFactory f94940b;

    /* renamed from: c, reason: collision with root package name */
    public final y9 f94941c;

    /* renamed from: d, reason: collision with root package name */
    public final y9 f94942d;

    /* renamed from: e, reason: collision with root package name */
    public final v0.a f94943e;

    /* renamed from: f, reason: collision with root package name */
    public final e2 f94944f;

    /* renamed from: g, reason: collision with root package name */
    public ServerSocket f94945g;

    /* renamed from: h, reason: collision with root package name */
    public SocketAddress f94946h;

    /* renamed from: i, reason: collision with root package name */
    public a f94947i;

    /* renamed from: j, reason: collision with root package name */
    public Executor f94948j;

    /* renamed from: k, reason: collision with root package name */
    public ScheduledExecutorService f94949k;

    /* renamed from: l, reason: collision with root package name */
    public de f94950l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f94951m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements m2 {

        /* renamed from: a, reason: collision with root package name */
        public final n2 f94952a;

        /* renamed from: b, reason: collision with root package name */
        public final ServerSocket f94953b;

        public a(ServerSocket serverSocket) {
            this.f94953b = serverSocket;
            this.f94952a = n2.allocate((Class<?>) a.class, String.valueOf(serverSocket.getLocalSocketAddress()));
        }

        @Override // wr.m2, wr.v2
        public n2 getLogId() {
            return this.f94952a;
        }

        @Override // wr.m2
        public n1 getStats() {
            return sh.b1.immediateFuture(new e2.h(null, this.f94953b.getLocalSocketAddress(), null, new e2.g.a().build(), null));
        }

        public String toString() {
            return mh.g1.toStringHelper(this).add("logId", this.f94952a.getId()).add("socket", this.f94953b).toString();
        }
    }

    public k0(o0 o0Var, List<? extends b6.a> list, e2 e2Var) {
        this.f94939a = (SocketAddress) p1.checkNotNull(o0Var.f94975b, "listenAddress");
        this.f94940b = (ServerSocketFactory) p1.checkNotNull(o0Var.f94980g, "socketFactory");
        this.f94941c = (y9) p1.checkNotNull(o0Var.f94978e, "transportExecutorPool");
        this.f94942d = (y9) p1.checkNotNull(o0Var.f94979f, "scheduledExecutorServicePool");
        this.f94943e = new v0.a(o0Var, list);
        this.f94944f = (e2) p1.checkNotNull(e2Var, "channelz");
    }

    @Override // xr.n5
    public SocketAddress getListenSocketAddress() {
        return this.f94946h;
    }

    @Override // xr.n5
    public List<? extends SocketAddress> getListenSocketAddresses() {
        return Collections.singletonList(getListenSocketAddress());
    }

    @Override // xr.n5
    public m2 getListenSocketStats() {
        return this.f94947i;
    }

    @Override // xr.n5
    public List<m2> getListenSocketStatsList() {
        return Collections.singletonList(getListenSocketStats());
    }

    @Override // xr.n5
    public void shutdown() throws IOException {
        if (this.f94951m) {
            return;
        }
        this.f94951m = true;
        if (this.f94945g == null) {
            return;
        }
        this.f94944f.removeListenSocket(this.f94947i);
        try {
            this.f94945g.close();
        } catch (IOException unused) {
            f94938n.log(Level.WARNING, "Failed closing server socket", this.f94945g);
        }
        this.f94948j = (Executor) this.f94941c.returnObject(this.f94948j);
        this.f94949k = (ScheduledExecutorService) this.f94942d.returnObject(this.f94949k);
    }

    @Override // xr.n5
    public void start(de deVar) throws IOException {
        this.f94950l = (de) p1.checkNotNull(deVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ServerSocket serverSocketCreateServerSocket = this.f94940b.createServerSocket();
        try {
            serverSocketCreateServerSocket.bind(this.f94939a);
            this.f94945g = serverSocketCreateServerSocket;
            this.f94946h = serverSocketCreateServerSocket.getLocalSocketAddress();
            this.f94947i = new a(serverSocketCreateServerSocket);
            this.f94948j = (Executor) this.f94941c.getObject();
            this.f94949k = (ScheduledExecutorService) this.f94942d.getObject();
            this.f94944f.addListenSocket(this.f94947i);
            this.f94948j.execute(new on.w(this, 28));
        } catch (IOException e10) {
            serverSocketCreateServerSocket.close();
            throw e10;
        }
    }
}
