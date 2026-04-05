package xr;

import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class id extends wr.k5 {

    /* renamed from: n, reason: collision with root package name */
    public static final Logger f92648n = Logger.getLogger(id.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final ee f92649a;

    /* renamed from: b, reason: collision with root package name */
    public final wr.k4 f92650b;

    /* renamed from: c, reason: collision with root package name */
    public final lt.e f92651c;

    /* renamed from: d, reason: collision with root package name */
    public final wr.n0 f92652d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f92653e;

    /* renamed from: f, reason: collision with root package name */
    public final wr.c1 f92654f;

    /* renamed from: g, reason: collision with root package name */
    public final wr.e0 f92655g;

    /* renamed from: h, reason: collision with root package name */
    public final v0 f92656h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f92657i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f92658j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f92659k;

    /* renamed from: l, reason: collision with root package name */
    public wr.d0 f92660l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f92661m;

    public id(ee eeVar, wr.k4 k4Var, wr.e4 e4Var, wr.n0 n0Var, wr.c1 c1Var, wr.e0 e0Var, v0 v0Var, lt.e eVar) {
        this.f92649a = eeVar;
        this.f92650b = k4Var;
        this.f92652d = n0Var;
        this.f92653e = (byte[]) e4Var.get(c5.f92311f);
        this.f92654f = c1Var;
        this.f92655g = e0Var;
        this.f92656h = v0Var;
        v0Var.reportCallStarted();
        this.f92651c = eVar;
    }

    public final void a(wr.m6 m6Var, wr.e4 e4Var) {
        v0 v0Var = this.f92656h;
        mh.p1.checkState(!this.f92659k, "call already closed");
        try {
            this.f92659k = true;
            if (m6Var.isOk() && this.f92650b.getType().serverSendsOneMessage() && !this.f92661m) {
                b(wr.m6.f91046n.withDescription("Completed without a response").asRuntimeException());
            } else {
                this.f92649a.close(m6Var, e4Var);
            }
        } finally {
            v0Var.reportCallEnded(m6Var.isOk());
        }
    }

    public final void b(RuntimeException runtimeException) {
        f92648n.log(Level.WARNING, "Cancelling the stream because of internal error", (Throwable) runtimeException);
        this.f92649a.cancel(runtimeException instanceof wr.o6 ? ((wr.o6) runtimeException).getStatus() : wr.m6.f91046n.withCause(runtimeException).withDescription("Internal error so cancelling stream."));
        this.f92656h.reportCallEnded(false);
    }

    public final void c(wr.e4 e4Var) {
        byte[] bArr;
        mh.p1.checkState(!this.f92658j, "sendHeaders has already been called");
        mh.p1.checkState(!this.f92659k, "call is closed");
        e4Var.discardAll(c5.f92314i);
        e4Var.discardAll(c5.f92310e);
        wr.d0 d0Var = this.f92660l;
        wr.z zVar = wr.z.f91209a;
        if (d0Var == null || (bArr = this.f92653e) == null) {
            this.f92660l = zVar;
        } else {
            Iterable<String> iterableSplit = c5.f92318m.split(new String(bArr, c5.f92308c));
            String messageEncoding = this.f92660l.getMessageEncoding();
            boolean zContains = false;
            if (iterableSplit instanceof Collection) {
                try {
                    zContains = ((Collection) iterableSplit).contains(messageEncoding);
                } catch (ClassCastException | NullPointerException unused) {
                }
            } else {
                Iterator<String> it = iterableSplit.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (mh.h1.equal(it.next(), messageEncoding)) {
                        zContains = true;
                        break;
                    }
                }
            }
            if (!zContains) {
                this.f92660l = zVar;
            }
        }
        e4Var.put(c5.f92310e, this.f92660l.getMessageEncoding());
        wr.d0 d0Var2 = this.f92660l;
        ee eeVar = this.f92649a;
        eeVar.setCompressor(d0Var2);
        wr.z3 z3Var = c5.f92311f;
        e4Var.discardAll(z3Var);
        byte[] rawAdvertisedMessageEncodings = wr.k2.getRawAdvertisedMessageEncodings(this.f92654f);
        if (rawAdvertisedMessageEncodings.length != 0) {
            e4Var.put(z3Var, rawAdvertisedMessageEncodings);
        }
        this.f92658j = true;
        eeVar.writeHeaders(e4Var, !getMethodDescriptor().getType().serverSendsOneMessage());
    }

    @Override // wr.k5
    public void close(wr.m6 m6Var, wr.e4 e4Var) {
        lt.f fVarTraceTask = lt.c.traceTask("ServerCall.close");
        try {
            lt.c.attachTag(this.f92651c);
            a(m6Var, e4Var);
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

    public final void d(Object obj) {
        ee eeVar = this.f92649a;
        mh.p1.checkState(this.f92658j, "sendHeaders has not been called");
        mh.p1.checkState(!this.f92659k, "call is closed");
        wr.k4 k4Var = this.f92650b;
        if (k4Var.getType().serverSendsOneMessage() && this.f92661m) {
            b(wr.m6.f91046n.withDescription("Too many responses").asRuntimeException());
            return;
        }
        this.f92661m = true;
        try {
            eeVar.writeMessage(k4Var.streamResponse(obj));
            if (getMethodDescriptor().getType().serverSendsOneMessage()) {
                return;
            }
            eeVar.flush();
        } catch (Error e10) {
            close(wr.m6.f91038f.withDescription("Server sendMessage() failed with Error"), new wr.e4());
            throw e10;
        } catch (RuntimeException e11) {
            b(e11);
        }
    }

    @Override // wr.k5
    public wr.c getAttributes() {
        return this.f92649a.getAttributes();
    }

    @Override // wr.k5
    public String getAuthority() {
        return this.f92649a.getAuthority();
    }

    @Override // wr.k5
    public wr.k4 getMethodDescriptor() {
        return this.f92650b;
    }

    @Override // wr.k5
    public wr.h5 getSecurityLevel() {
        wr.c attributes = getAttributes();
        if (attributes == null) {
            return super.getSecurityLevel();
        }
        wr.h5 h5Var = (wr.h5) attributes.get(s4.f92979a);
        return h5Var == null ? super.getSecurityLevel() : h5Var;
    }

    @Override // wr.k5
    public boolean isCancelled() {
        return this.f92657i;
    }

    @Override // wr.k5
    public boolean isReady() {
        if (this.f92659k) {
            return false;
        }
        return this.f92649a.isReady();
    }

    @Override // wr.k5
    public void request(int i10) {
        lt.f fVarTraceTask = lt.c.traceTask("ServerCall.request");
        try {
            lt.c.attachTag(this.f92651c);
            this.f92649a.request(i10);
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

    @Override // wr.k5
    public void sendHeaders(wr.e4 e4Var) {
        lt.f fVarTraceTask = lt.c.traceTask("ServerCall.sendHeaders");
        try {
            lt.c.attachTag(this.f92651c);
            c(e4Var);
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

    @Override // wr.k5
    public void sendMessage(Object obj) {
        lt.f fVarTraceTask = lt.c.traceTask("ServerCall.sendMessage");
        try {
            lt.c.attachTag(this.f92651c);
            d(obj);
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

    @Override // wr.k5
    public void setCompression(String str) {
        mh.p1.checkState(!this.f92658j, "sendHeaders has been called");
        wr.d0 d0VarLookupCompressor = this.f92655g.lookupCompressor(str);
        this.f92660l = d0VarLookupCompressor;
        mh.p1.checkArgument(d0VarLookupCompressor != null, "Unable to find compressor by name %s", str);
    }

    @Override // wr.k5
    public void setMessageCompression(boolean z10) {
        this.f92649a.setMessageCompression(z10);
    }
}
