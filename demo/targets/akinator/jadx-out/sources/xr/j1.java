package xr;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import wr.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j1 extends wr.p {

    /* renamed from: s, reason: collision with root package name */
    public static final Logger f92672s = Logger.getLogger(j1.class.getName());

    /* renamed from: t, reason: collision with root package name */
    public static final double f92673t;

    /* renamed from: a, reason: collision with root package name */
    public final wr.k4 f92674a;

    /* renamed from: b, reason: collision with root package name */
    public final lt.e f92675b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f92676c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f92677d;

    /* renamed from: e, reason: collision with root package name */
    public final v0 f92678e;

    /* renamed from: f, reason: collision with root package name */
    public final wr.u0 f92679f;

    /* renamed from: g, reason: collision with root package name */
    public volatile ScheduledFuture f92680g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f92681h;

    /* renamed from: i, reason: collision with root package name */
    public wr.i f92682i;

    /* renamed from: j, reason: collision with root package name */
    public k1 f92683j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f92684k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f92685l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f92686m;

    /* renamed from: n, reason: collision with root package name */
    public final g1 f92687n;

    /* renamed from: p, reason: collision with root package name */
    public final ScheduledExecutorService f92689p;

    /* renamed from: o, reason: collision with root package name */
    public final h1 f92688o = new h1(this);

    /* renamed from: q, reason: collision with root package name */
    public wr.c1 f92690q = wr.c1.getDefaultInstance();

    /* renamed from: r, reason: collision with root package name */
    public wr.e0 f92691r = wr.e0.getDefaultInstance();

    static {
        "gzip".getBytes(Charset.forName(C.ASCII_NAME));
        f92673t = TimeUnit.SECONDS.toNanos(1L) * 1.0d;
    }

    public j1(wr.k4 k4Var, Executor executor, wr.i iVar, g1 g1Var, ScheduledExecutorService scheduledExecutorService, v0 v0Var) {
        this.f92674a = k4Var;
        lt.e eVarCreateTag = lt.c.createTag(k4Var.getFullMethodName(), System.identityHashCode(this));
        this.f92675b = eVarCreateTag;
        if (executor == sh.w1.directExecutor()) {
            this.f92676c = new bd();
            this.f92677d = true;
        } else {
            this.f92676c = new fd(executor);
            this.f92677d = false;
        }
        this.f92678e = v0Var;
        this.f92679f = wr.u0.current();
        this.f92681h = k4Var.getType() == wr.h4.f90954b || k4Var.getType() == wr.h4.f90956e;
        this.f92682i = iVar;
        this.f92687n = g1Var;
        this.f92689p = scheduledExecutorService;
        lt.c.event("ClientCall.<init>", eVarCreateTag);
    }

    public final void a(String str, Throwable th2) {
        if (str == null && th2 == null) {
            th2 = new CancellationException("Cancelled without a message or cause");
            f92672s.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th2);
        }
        if (this.f92685l) {
            return;
        }
        this.f92685l = true;
        try {
            if (this.f92683j != null) {
                wr.m6 m6Var = wr.m6.f91038f;
                wr.m6 m6VarWithDescription = str != null ? m6Var.withDescription(str) : m6Var.withDescription("Call cancelled without message");
                if (th2 != null) {
                    m6VarWithDescription = m6VarWithDescription.withCause(th2);
                }
                this.f92683j.cancel(m6VarWithDescription);
            }
            b();
        } catch (Throwable th3) {
            b();
            throw th3;
        }
    }

    public final void b() {
        this.f92679f.removeListener(this.f92688o);
        ScheduledFuture scheduledFuture = this.f92680g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void c(Object obj) {
        mh.p1.checkState(this.f92683j != null, "Not started");
        mh.p1.checkState(!this.f92685l, "call was cancelled");
        mh.p1.checkState(!this.f92686m, "call was half-closed");
        try {
            k1 k1Var = this.f92683j;
            if (k1Var instanceof tc) {
                ((tc) k1Var).i(obj);
            } else {
                k1Var.writeMessage(this.f92674a.streamRequest(obj));
            }
            if (this.f92681h) {
                return;
            }
            this.f92683j.flush();
        } catch (Error e10) {
            this.f92683j.cancel(wr.m6.f91038f.withDescription("Client sendMessage() failed with Error"));
            throw e10;
        } catch (RuntimeException e11) {
            this.f92683j.cancel(wr.m6.f91038f.withCause(e11).withDescription("Failed to stream message"));
        }
    }

    @Override // wr.p
    public void cancel(String str, Throwable th2) {
        lt.f fVarTraceTask = lt.c.traceTask("ClientCall.cancel");
        try {
            lt.c.attachTag(this.f92675b);
            a(str, th2);
            if (fVarTraceTask != null) {
                fVarTraceTask.close();
            }
        } catch (Throwable th3) {
            if (fVarTraceTask != null) {
                try {
                    fVarTraceTask.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    public final void d(p.a aVar, wr.e4 e4Var) {
        wr.d0 d0VarLookupCompressor;
        wr.z zVar = wr.z.f91209a;
        boolean zIsBefore = true;
        mh.p1.checkState(this.f92683j == null, "Already started");
        mh.p1.checkState(!this.f92685l, "call was cancelled");
        mh.p1.checkNotNull(aVar, "observer");
        mh.p1.checkNotNull(e4Var, "headers");
        if (this.f92679f.isCancelled()) {
            this.f92683j = x9.f93238a;
            this.f92676c.execute(new z0(this, aVar));
            return;
        }
        d9 d9Var = (d9) this.f92682i.getOption(d9.f92427g);
        if (d9Var != null) {
            Integer num = d9Var.f92431d;
            Integer num2 = d9Var.f92430c;
            Long l9 = d9Var.f92428a;
            if (l9 != null) {
                wr.z0 z0VarAfter = wr.z0.after(l9.longValue(), TimeUnit.NANOSECONDS);
                wr.z0 deadline = this.f92682i.getDeadline();
                if (deadline == null || z0VarAfter.compareTo(deadline) < 0) {
                    this.f92682i = this.f92682i.withDeadline(z0VarAfter);
                }
            }
            Boolean bool = d9Var.f92429b;
            if (bool != null) {
                this.f92682i = bool.booleanValue() ? this.f92682i.withWaitForReady() : this.f92682i.withoutWaitForReady();
            }
            if (num2 != null) {
                Integer maxInboundMessageSize = this.f92682i.getMaxInboundMessageSize();
                if (maxInboundMessageSize != null) {
                    this.f92682i = this.f92682i.withMaxInboundMessageSize(Math.min(maxInboundMessageSize.intValue(), num2.intValue()));
                } else {
                    this.f92682i = this.f92682i.withMaxInboundMessageSize(num2.intValue());
                }
            }
            if (num != null) {
                Integer maxOutboundMessageSize = this.f92682i.getMaxOutboundMessageSize();
                if (maxOutboundMessageSize != null) {
                    this.f92682i = this.f92682i.withMaxOutboundMessageSize(Math.min(maxOutboundMessageSize.intValue(), num.intValue()));
                } else {
                    this.f92682i = this.f92682i.withMaxOutboundMessageSize(num.intValue());
                }
            }
        }
        String compressor = this.f92682i.getCompressor();
        if (compressor != null) {
            d0VarLookupCompressor = this.f92691r.lookupCompressor(compressor);
            if (d0VarLookupCompressor == null) {
                this.f92683j = x9.f93238a;
                this.f92676c.execute(new a1(this, aVar, compressor));
                return;
            }
        } else {
            d0VarLookupCompressor = zVar;
        }
        wr.c1 c1Var = this.f92690q;
        e4Var.discardAll(c5.f92314i);
        wr.z3 z3Var = c5.f92310e;
        e4Var.discardAll(z3Var);
        if (d0VarLookupCompressor != zVar) {
            e4Var.put(z3Var, d0VarLookupCompressor.getMessageEncoding());
        }
        wr.z3 z3Var2 = c5.f92311f;
        e4Var.discardAll(z3Var2);
        byte[] rawAdvertisedMessageEncodings = wr.k2.getRawAdvertisedMessageEncodings(c1Var);
        if (rawAdvertisedMessageEncodings.length != 0) {
            e4Var.put(z3Var2, rawAdvertisedMessageEncodings);
        }
        e4Var.discardAll(c5.f92312g);
        e4Var.discardAll(c5.f92313h);
        wr.z0 deadline2 = this.f92682i.getDeadline();
        wr.z0 deadline3 = this.f92679f.getDeadline();
        if (deadline2 == null) {
            deadline2 = deadline3;
        } else if (deadline3 != null) {
            deadline2 = deadline2.minimum(deadline3);
        }
        if (deadline2 == null || !deadline2.isExpired()) {
            wr.z0 deadline4 = this.f92679f.getDeadline();
            wr.z0 deadline5 = this.f92682i.getDeadline();
            Logger logger = f92672s;
            if (logger.isLoggable(Level.FINE) && deadline2 != null && deadline2.equals(deadline4)) {
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long jMax = Math.max(0L, deadline2.timeRemaining(timeUnit));
                Locale locale = Locale.US;
                StringBuilder sb2 = new StringBuilder(p0.o2.n(jMax, "Call timeout set to '", "' ns, due to context deadline."));
                if (deadline5 == null) {
                    sb2.append(" Explicit call timeout was not set.");
                } else {
                    sb2.append(" Explicit call timeout was '" + deadline5.timeRemaining(timeUnit) + "' ns.");
                }
                logger.fine(sb2.toString());
            }
            this.f92683j = this.f92687n.newStream(this.f92674a, this.f92682i, e4Var, this.f92679f);
        } else {
            wr.u[] clientStreamTracers = c5.getClientStreamTracers(this.f92682i, e4Var, 0, false);
            wr.z0 deadline6 = this.f92682i.getDeadline();
            wr.z0 deadline7 = this.f92679f.getDeadline();
            if (deadline6 == null) {
                zIsBefore = false;
            } else if (deadline7 != null) {
                zIsBefore = deadline6.isBefore(deadline7);
            }
            String str = zIsBefore ? "CallOptions" : "Context";
            Long l10 = (Long) this.f92682i.getOption(wr.u.f91140a);
            double dTimeRemaining = deadline2.timeRemaining(TimeUnit.NANOSECONDS);
            double d10 = f92673t;
            this.f92683j = new g4(wr.m6.f91040h.withDescription(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, Double.valueOf(dTimeRemaining / d10), Double.valueOf(l10 == null ? 0.0d : l10.longValue() / d10))), clientStreamTracers);
        }
        if (this.f92677d) {
            this.f92683j.optimizeForDirectExecutor();
        }
        if (this.f92682i.getAuthority() != null) {
            this.f92683j.setAuthority(this.f92682i.getAuthority());
        }
        if (this.f92682i.getMaxInboundMessageSize() != null) {
            this.f92683j.setMaxInboundMessageSize(this.f92682i.getMaxInboundMessageSize().intValue());
        }
        if (this.f92682i.getMaxOutboundMessageSize() != null) {
            this.f92683j.setMaxOutboundMessageSize(this.f92682i.getMaxOutboundMessageSize().intValue());
        }
        if (deadline2 != null) {
            this.f92683j.setDeadline(deadline2);
        }
        this.f92683j.setCompressor(d0VarLookupCompressor);
        this.f92683j.setDecompressorRegistry(this.f92690q);
        this.f92678e.reportCallStarted();
        this.f92683j.start(new f1(this, aVar));
        this.f92679f.addListener(this.f92688o, sh.w1.directExecutor());
        if (deadline2 != null && !deadline2.equals(this.f92679f.getDeadline()) && this.f92689p != null) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            long jTimeRemaining = deadline2.timeRemaining(timeUnit2);
            this.f92680g = this.f92689p.schedule(new x6(new i1(this, jTimeRemaining)), jTimeRemaining, timeUnit2);
        }
        if (this.f92684k) {
            b();
        }
    }

    @Override // wr.p
    public wr.c getAttributes() {
        k1 k1Var = this.f92683j;
        return k1Var != null ? k1Var.getAttributes() : wr.c.f90841b;
    }

    @Override // wr.p
    public void halfClose() {
        lt.f fVarTraceTask = lt.c.traceTask("ClientCall.halfClose");
        try {
            lt.c.attachTag(this.f92675b);
            mh.p1.checkState(this.f92683j != null, "Not started");
            mh.p1.checkState(!this.f92685l, "call was cancelled");
            mh.p1.checkState(!this.f92686m, "call already half-closed");
            this.f92686m = true;
            this.f92683j.halfClose();
            if (fVarTraceTask != null) {
                fVarTraceTask.close();
            }
        } catch (Throwable th2) {
            if (fVarTraceTask != null) {
                try {
                    fVarTraceTask.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // wr.p
    public boolean isReady() {
        if (this.f92686m) {
            return false;
        }
        return this.f92683j.isReady();
    }

    @Override // wr.p
    public void request(int i10) {
        lt.f fVarTraceTask = lt.c.traceTask("ClientCall.request");
        try {
            lt.c.attachTag(this.f92675b);
            mh.p1.checkState(this.f92683j != null, "Not started");
            mh.p1.checkArgument(i10 >= 0, "Number requested must be non-negative");
            this.f92683j.request(i10);
            if (fVarTraceTask != null) {
                fVarTraceTask.close();
            }
        } catch (Throwable th2) {
            if (fVarTraceTask != null) {
                try {
                    fVarTraceTask.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // wr.p
    public void sendMessage(Object obj) {
        lt.f fVarTraceTask = lt.c.traceTask("ClientCall.sendMessage");
        try {
            lt.c.attachTag(this.f92675b);
            c(obj);
            if (fVarTraceTask != null) {
                fVarTraceTask.close();
            }
        } catch (Throwable th2) {
            if (fVarTraceTask != null) {
                try {
                    fVarTraceTask.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // wr.p
    public void setMessageCompression(boolean z10) {
        mh.p1.checkState(this.f92683j != null, "Not started");
        this.f92683j.setMessageCompression(z10);
    }

    @Override // wr.p
    public void start(p.a aVar, wr.e4 e4Var) {
        lt.f fVarTraceTask = lt.c.traceTask("ClientCall.start");
        try {
            lt.c.attachTag(this.f92675b);
            d(aVar, e4Var);
            if (fVarTraceTask != null) {
                fVarTraceTask.close();
            }
        } catch (Throwable th2) {
            if (fVarTraceTask != null) {
                try {
                    fVarTraceTask.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("method", this.f92674a).toString();
    }
}
