package fw;

import com.applovin.shadow.okhttp3.internal.http2.Header;
import com.applovin.shadow.okhttp3.internal.http2.Http2Stream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.TimeZone;
import p0.o2;
import pw.a1;
import pw.b1;
import pw.d1;
import pw.z0;
import xv.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f56258a;

    /* renamed from: b, reason: collision with root package name */
    public final q f56259b;

    /* renamed from: c, reason: collision with root package name */
    public final gw.a f56260c;

    /* renamed from: d, reason: collision with root package name */
    public long f56261d;

    /* renamed from: e, reason: collision with root package name */
    public long f56262e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f56263f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f56264g;

    /* renamed from: h, reason: collision with root package name */
    public final c f56265h;

    /* renamed from: i, reason: collision with root package name */
    public final b f56266i;

    /* renamed from: j, reason: collision with root package name */
    public final d f56267j;

    /* renamed from: k, reason: collision with root package name */
    public final d f56268k;

    /* renamed from: l, reason: collision with root package name */
    public fw.c f56269l;

    /* renamed from: m, reason: collision with root package name */
    public IOException f56270m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class c implements b1 {

        /* renamed from: b, reason: collision with root package name */
        public final long f56276b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f56277c;

        /* renamed from: e, reason: collision with root package name */
        public final pw.g f56278e = new pw.g();

        /* renamed from: f, reason: collision with root package name */
        public final pw.g f56279f = new pw.g();

        /* renamed from: g, reason: collision with root package name */
        public f0 f56280g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f56281h;

        public c(long j10, boolean z10) {
            this.f56276b = j10;
            this.f56277c = z10;
        }

        @Override // pw.b1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long size;
            x xVar = x.this;
            synchronized (xVar) {
                this.f56281h = true;
                size = this.f56279f.size();
                this.f56279f.clear();
                kotlin.jvm.internal.e0.checkNotNull(xVar, "null cannot be cast to non-null type java.lang.Object");
                xVar.notifyAll();
            }
            if (size > 0) {
                x xVar2 = x.this;
                TimeZone timeZone = yv.i.f96667a;
                xVar2.getConnection().updateConnectionFlowControl$okhttp(size);
            }
            x.this.cancelStreamIfNecessary$okhttp();
        }

        public final boolean getClosed$okhttp() {
            return this.f56281h;
        }

        public final boolean getFinished$okhttp() {
            return this.f56277c;
        }

        public final pw.g getReadBuffer() {
            return this.f56279f;
        }

        public final pw.g getReceiveBuffer() {
            return this.f56278e;
        }

        public final f0 getTrailers() {
            return this.f56280g;
        }

        @Override // pw.b1
        public long read(pw.g sink, long j10) throws IOException {
            IOException errorException$okhttp;
            boolean z10;
            long j11;
            kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
            long j12 = 0;
            if (j10 < 0) {
                throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: ").toString());
            }
            while (true) {
                x xVar = x.this;
                synchronized (xVar) {
                    boolean zB = xVar.b();
                    if (zB) {
                        xVar.getReadTimeout$okhttp().enter();
                    }
                    try {
                        if (xVar.getErrorCode$okhttp() == null || this.f56277c) {
                            errorException$okhttp = null;
                        } else {
                            errorException$okhttp = xVar.getErrorException$okhttp();
                            if (errorException$okhttp == null) {
                                fw.c errorCode$okhttp = xVar.getErrorCode$okhttp();
                                kotlin.jvm.internal.e0.checkNotNull(errorCode$okhttp);
                                errorException$okhttp = new e0(errorCode$okhttp);
                            }
                        }
                        if (this.f56281h) {
                            throw new IOException("stream closed");
                        }
                        z10 = false;
                        if (this.f56279f.size() > j12) {
                            pw.g gVar = this.f56279f;
                            j11 = gVar.read(sink, Math.min(j10, gVar.size()));
                            gw.a.update$default(xVar.getReadBytes(), j11, 0L, 2, null);
                            long unacknowledged = xVar.getReadBytes().getUnacknowledged();
                            if (errorException$okhttp == null && unacknowledged >= xVar.getConnection().getOkHttpSettings().getInitialWindowSize() / 2) {
                                xVar.getConnection().writeWindowUpdateLater$okhttp(xVar.getId(), unacknowledged);
                                gw.a.update$default(xVar.getReadBytes(), 0L, unacknowledged, 1, null);
                            }
                        } else {
                            if (!this.f56277c && errorException$okhttp == null) {
                                xVar.waitForIo$okhttp();
                                z10 = true;
                            }
                            j11 = -1;
                        }
                        if (zB) {
                            xVar.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                        }
                    } finally {
                    }
                }
                ((fw.d) x.this.getConnection().getFlowControlListener$okhttp()).receivingStreamWindowChanged(x.this.getId(), x.this.getReadBytes(), this.f56279f.size());
                if (!z10) {
                    if (j11 != -1) {
                        return j11;
                    }
                    if (errorException$okhttp == null) {
                        return -1L;
                    }
                    throw errorException$okhttp;
                }
                j12 = 0;
            }
        }

        public final void receive$okhttp(pw.k source, long j10) throws IOException {
            boolean z10;
            boolean z11;
            kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
            TimeZone timeZone = yv.i.f96667a;
            long j11 = j10;
            while (j11 > 0) {
                synchronized (x.this) {
                    z10 = this.f56277c;
                    z11 = this.f56279f.size() + j11 > this.f56276b;
                }
                if (z11) {
                    source.skip(j11);
                    x.this.closeLater(fw.c.f56126h);
                    return;
                }
                if (z10) {
                    source.skip(j11);
                    return;
                }
                long j12 = source.read(this.f56278e, j11);
                if (j12 == -1) {
                    throw new EOFException();
                }
                j11 -= j12;
                x xVar = x.this;
                synchronized (xVar) {
                    try {
                        if (this.f56281h) {
                            this.f56278e.clear();
                        } else {
                            boolean z12 = this.f56279f.size() == 0;
                            this.f56279f.writeAll(this.f56278e);
                            if (z12) {
                                kotlin.jvm.internal.e0.checkNotNull(xVar, "null cannot be cast to non-null type java.lang.Object");
                                xVar.notifyAll();
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            x xVar2 = x.this;
            TimeZone timeZone2 = yv.i.f96667a;
            xVar2.getConnection().updateConnectionFlowControl$okhttp(j10);
            ((fw.d) x.this.getConnection().getFlowControlListener$okhttp()).receivingStreamWindowChanged(x.this.getId(), x.this.getReadBytes(), this.f56279f.size());
        }

        public final void setClosed$okhttp(boolean z10) {
            this.f56281h = z10;
        }

        public final void setFinished$okhttp(boolean z10) {
            this.f56277c = z10;
        }

        public final void setTrailers(f0 f0Var) {
            this.f56280g = f0Var;
        }

        @Override // pw.b1
        public d1 timeout() {
            return x.this.getReadTimeout$okhttp();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class d extends pw.c {
        public d() {
        }

        @Override // pw.c
        public final IOException a(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // pw.c
        public final void b() {
            fw.c cVar = fw.c.f56128j;
            x xVar = x.this;
            xVar.closeLater(cVar);
            xVar.getConnection().sendDegradedPingLater$okhttp();
        }

        public final void exitAndThrowIfTimedOut() throws IOException {
            if (exit()) {
                throw a(null);
            }
        }
    }

    static {
        new a(null);
    }

    public x(int i10, q connection, boolean z10, boolean z11, f0 f0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        this.f56258a = i10;
        this.f56259b = connection;
        this.f56260c = new gw.a(i10);
        this.f56262e = connection.getPeerSettings().getInitialWindowSize();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f56263f = arrayDeque;
        this.f56265h = new c(connection.getOkHttpSettings().getInitialWindowSize(), z11);
        this.f56266i = new b(z10);
        this.f56267j = new d();
        this.f56268k = new d();
        if (f0Var == null) {
            if (!isLocallyInitiated()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (isLocallyInitiated()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(f0Var);
        }
    }

    public static /* synthetic */ f0 takeHeaders$default(x xVar, boolean z10, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return xVar.takeHeaders(z10);
    }

    public final boolean a(fw.c cVar, IOException iOException) {
        TimeZone timeZone = yv.i.f96667a;
        synchronized (this) {
            if (getErrorCode$okhttp() != null) {
                return false;
            }
            this.f56269l = cVar;
            this.f56270m = iOException;
            kotlin.jvm.internal.e0.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (getSource().getFinished$okhttp()) {
                if (getSink().getFinished()) {
                    return false;
                }
            }
            this.f56259b.removeStream$okhttp(this.f56258a);
            return true;
        }
    }

    public final void addBytesToWriteWindow(long j10) {
        this.f56262e += j10;
        if (j10 > 0) {
            kotlin.jvm.internal.e0.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final boolean b() {
        return !this.f56259b.getClient$okhttp() || getSink().getClosed() || getSink().getFinished();
    }

    @Override // pw.a1
    public void cancel() {
        closeLater(fw.c.f56128j);
    }

    public final void cancelStreamIfNecessary$okhttp() throws IOException {
        boolean z10;
        boolean zIsOpen;
        TimeZone timeZone = yv.i.f96667a;
        synchronized (this) {
            try {
                z10 = !getSource().getFinished$okhttp() && getSource().getClosed$okhttp() && (getSink().getFinished() || getSink().getClosed());
                zIsOpen = isOpen();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            close(fw.c.f56128j, null);
        } else {
            if (zIsOpen) {
                return;
            }
            this.f56259b.removeStream$okhttp(this.f56258a);
        }
    }

    public final void checkOutNotClosed$okhttp() throws IOException {
        if (getSink().getClosed()) {
            throw new IOException("stream closed");
        }
        if (getSink().getFinished()) {
            throw new IOException("stream finished");
        }
        if (getErrorCode$okhttp() != null) {
            IOException iOException = this.f56270m;
            if (iOException != null) {
                throw iOException;
            }
            fw.c errorCode$okhttp = getErrorCode$okhttp();
            kotlin.jvm.internal.e0.checkNotNull(errorCode$okhttp);
            throw new e0(errorCode$okhttp);
        }
    }

    public final void close(fw.c rstStatusCode, IOException iOException) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(rstStatusCode, "rstStatusCode");
        if (a(rstStatusCode, iOException)) {
            this.f56259b.writeSynReset$okhttp(this.f56258a, rstStatusCode);
        }
    }

    public final void closeLater(fw.c errorCode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(errorCode, "errorCode");
        if (a(errorCode, null)) {
            this.f56259b.writeSynResetLater$okhttp(this.f56258a, errorCode);
        }
    }

    public final void enqueueTrailers(f0 trailers) {
        kotlin.jvm.internal.e0.checkNotNullParameter(trailers, "trailers");
        synchronized (this) {
            if (getSink().getFinished()) {
                throw new IllegalStateException("already finished");
            }
            if (trailers.size() == 0) {
                throw new IllegalArgumentException("trailers.size() == 0");
            }
            getSink().setTrailers(trailers);
        }
    }

    public final q getConnection() {
        return this.f56259b;
    }

    public final fw.c getErrorCode$okhttp() {
        fw.c cVar;
        synchronized (this) {
            cVar = this.f56269l;
        }
        return cVar;
    }

    public final IOException getErrorException$okhttp() {
        return this.f56270m;
    }

    public final int getId() {
        return this.f56258a;
    }

    public final gw.a getReadBytes() {
        return this.f56260c;
    }

    public final d getReadTimeout$okhttp() {
        return this.f56267j;
    }

    public final long getWriteBytesMaximum() {
        return this.f56262e;
    }

    public final long getWriteBytesTotal() {
        return this.f56261d;
    }

    public final d getWriteTimeout$okhttp() {
        return this.f56268k;
    }

    public final boolean isLocallyInitiated() {
        return this.f56259b.getClient$okhttp() == ((this.f56258a & 1) == 1);
    }

    public final boolean isOpen() {
        synchronized (this) {
            try {
                if (getErrorCode$okhttp() != null) {
                    return false;
                }
                if (getSource().getFinished$okhttp() || getSource().getClosed$okhttp()) {
                    if (getSink().getFinished() || getSink().getClosed()) {
                        if (this.f56264g) {
                            return false;
                        }
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isSourceComplete() {
        /*
            r1 = this;
            monitor-enter(r1)
            fw.x$c r0 = r1.getSource()     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.getFinished$okhttp()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            fw.x$c r0 = r1.getSource()     // Catch: java.lang.Throwable -> L1b
            pw.g r0 = r0.getReadBuffer()     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.exhausted()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            r0 = 1
            goto L1e
        L1b:
            r0 = move-exception
            goto L20
        L1d:
            r0 = 0
        L1e:
            monitor-exit(r1)
            return r0
        L20:
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fw.x.isSourceComplete():boolean");
    }

    public final f0 peekTrailers() throws IOException {
        synchronized (this) {
            if (getSource().getFinished$okhttp() && getSource().getReceiveBuffer().exhausted() && getSource().getReadBuffer().exhausted()) {
                f0 trailers = getSource().getTrailers();
                if (trailers == null) {
                    trailers = f0.f93622e;
                }
                return trailers;
            }
            if (getErrorCode$okhttp() == null) {
                return null;
            }
            IOException iOException = this.f56270m;
            if (iOException != null) {
                throw iOException;
            }
            fw.c errorCode$okhttp = getErrorCode$okhttp();
            kotlin.jvm.internal.e0.checkNotNull(errorCode$okhttp);
            throw new e0(errorCode$okhttp);
        }
    }

    public final d1 readTimeout() {
        return this.f56267j;
    }

    public final void receiveData(pw.k source, int i10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        TimeZone timeZone = yv.i.f96667a;
        getSource().receive$okhttp(source, i10);
    }

    public final void receiveHeaders(f0 headers, boolean z10) {
        boolean zIsOpen;
        kotlin.jvm.internal.e0.checkNotNullParameter(headers, "headers");
        TimeZone timeZone = yv.i.f96667a;
        synchronized (this) {
            try {
                if (this.f56264g && headers.get(Header.RESPONSE_STATUS_UTF8) == null && headers.get(Header.TARGET_METHOD_UTF8) == null) {
                    getSource().setTrailers(headers);
                } else {
                    this.f56264g = true;
                    this.f56263f.add(headers);
                }
                if (z10) {
                    getSource().setFinished$okhttp(true);
                }
                zIsOpen = isOpen();
                kotlin.jvm.internal.e0.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zIsOpen) {
            return;
        }
        this.f56259b.removeStream$okhttp(this.f56258a);
    }

    public final void receiveRstStream(fw.c errorCode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(errorCode, "errorCode");
        synchronized (this) {
            if (getErrorCode$okhttp() == null) {
                this.f56269l = errorCode;
                kotlin.jvm.internal.e0.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
            }
        }
    }

    public final void setErrorCode$okhttp(fw.c cVar) {
        this.f56269l = cVar;
    }

    public final void setErrorException$okhttp(IOException iOException) {
        this.f56270m = iOException;
    }

    public final void setWriteBytesMaximum$okhttp(long j10) {
        this.f56262e = j10;
    }

    public final void setWriteBytesTotal$okhttp(long j10) {
        this.f56261d = j10;
    }

    public final f0 takeHeaders(boolean z10) throws IOException {
        f0 f0Var;
        synchronized (this) {
            while (this.f56263f.isEmpty() && getErrorCode$okhttp() == null) {
                try {
                    boolean z11 = z10 || b();
                    if (z11) {
                        this.f56267j.enter();
                    }
                    try {
                        waitForIo$okhttp();
                        if (z11) {
                            this.f56267j.exitAndThrowIfTimedOut();
                        }
                    } catch (Throwable th2) {
                        if (z11) {
                            this.f56267j.exitAndThrowIfTimedOut();
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (this.f56263f.isEmpty()) {
                IOException iOException = this.f56270m;
                if (iOException != null) {
                    throw iOException;
                }
                fw.c errorCode$okhttp = getErrorCode$okhttp();
                kotlin.jvm.internal.e0.checkNotNull(errorCode$okhttp);
                throw new e0(errorCode$okhttp);
            }
            Object objRemoveFirst = this.f56263f.removeFirst();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(objRemoveFirst, "removeFirst(...)");
            f0Var = (f0) objRemoveFirst;
        }
        return f0Var;
    }

    public final void waitForIo$okhttp() throws InterruptedException, InterruptedIOException {
        try {
            kotlin.jvm.internal.e0.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void writeHeaders(List<f> responseHeaders, boolean z10, boolean z11) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(responseHeaders, "responseHeaders");
        TimeZone timeZone = yv.i.f96667a;
        synchronized (this) {
            this.f56264g = true;
            if (z10) {
                getSink().setFinished(true);
                kotlin.jvm.internal.e0.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
            }
        }
        if (!z11) {
            synchronized (this) {
                z11 = this.f56259b.getWriteBytesTotal() >= this.f56259b.getWriteBytesMaximum();
            }
        }
        this.f56259b.writeHeaders$okhttp(this.f56258a, z10, responseHeaders);
        if (z11) {
            this.f56259b.flush();
        }
    }

    public final d1 writeTimeout() {
        return this.f56268k;
    }

    @Override // pw.a1
    public b getSink() {
        return this.f56266i;
    }

    @Override // pw.a1
    public c getSource() {
        return this.f56265h;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b implements z0 {

        /* renamed from: b, reason: collision with root package name */
        public boolean f56271b;

        /* renamed from: c, reason: collision with root package name */
        public final pw.g f56272c;

        /* renamed from: e, reason: collision with root package name */
        public f0 f56273e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f56274f;

        public b(boolean z10) {
            this.f56271b = z10;
            this.f56272c = new pw.g();
        }

        /* JADX WARN: Finally extract failed */
        public final void a(boolean z10) throws IOException {
            long jMin;
            boolean z11;
            x xVar = x.this;
            synchronized (xVar) {
                xVar.getWriteTimeout$okhttp().enter();
                while (xVar.getWriteBytesTotal() >= xVar.getWriteBytesMaximum() && !this.f56271b && !this.f56274f && xVar.getErrorCode$okhttp() == null) {
                    try {
                        xVar.waitForIo$okhttp();
                    } catch (Throwable th2) {
                        xVar.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                        throw th2;
                    }
                }
                xVar.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                xVar.checkOutNotClosed$okhttp();
                jMin = Math.min(xVar.getWriteBytesMaximum() - xVar.getWriteBytesTotal(), this.f56272c.size());
                xVar.setWriteBytesTotal$okhttp(xVar.getWriteBytesTotal() + jMin);
                z11 = z10 && jMin == this.f56272c.size();
            }
            x.this.getWriteTimeout$okhttp().enter();
            try {
                x.this.getConnection().writeData(x.this.getId(), z11, this.f56272c, jMin);
            } finally {
                x.this.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
            }
        }

        @Override // pw.z0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            x xVar = x.this;
            TimeZone timeZone = yv.i.f96667a;
            synchronized (xVar) {
                if (this.f56274f) {
                    return;
                }
                boolean z10 = xVar.getErrorCode$okhttp() == null;
                if (!x.this.getSink().f56271b) {
                    boolean z11 = this.f56272c.size() > 0;
                    if (this.f56273e != null) {
                        while (this.f56272c.size() > 0) {
                            a(false);
                        }
                        q connection = x.this.getConnection();
                        int id2 = x.this.getId();
                        f0 f0Var = this.f56273e;
                        kotlin.jvm.internal.e0.checkNotNull(f0Var);
                        connection.writeHeaders$okhttp(id2, z10, yv.i.toHeaderList(f0Var));
                    } else if (z11) {
                        while (this.f56272c.size() > 0) {
                            a(true);
                        }
                    } else if (z10) {
                        x.this.getConnection().writeData(x.this.getId(), true, null, 0L);
                    }
                }
                x xVar2 = x.this;
                synchronized (xVar2) {
                    this.f56274f = true;
                    kotlin.jvm.internal.e0.checkNotNull(xVar2, "null cannot be cast to non-null type java.lang.Object");
                    xVar2.notifyAll();
                }
                x.this.getConnection().flush();
                x.this.cancelStreamIfNecessary$okhttp();
            }
        }

        @Override // pw.z0, java.io.Flushable
        public void flush() throws IOException {
            x xVar = x.this;
            TimeZone timeZone = yv.i.f96667a;
            synchronized (xVar) {
                xVar.checkOutNotClosed$okhttp();
            }
            while (this.f56272c.size() > 0) {
                a(false);
                x.this.getConnection().flush();
            }
        }

        public final boolean getClosed() {
            return this.f56274f;
        }

        public final boolean getFinished() {
            return this.f56271b;
        }

        public final f0 getTrailers() {
            return this.f56273e;
        }

        public final void setClosed(boolean z10) {
            this.f56274f = z10;
        }

        public final void setFinished(boolean z10) {
            this.f56271b = z10;
        }

        public final void setTrailers(f0 f0Var) {
            this.f56273e = f0Var;
        }

        @Override // pw.z0
        public d1 timeout() {
            return x.this.getWriteTimeout$okhttp();
        }

        @Override // pw.z0
        public void write(pw.g source, long j10) throws IOException {
            kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
            TimeZone timeZone = yv.i.f96667a;
            pw.g gVar = this.f56272c;
            gVar.write(source, j10);
            while (gVar.size() >= Http2Stream.EMIT_BUFFER_SIZE) {
                a(false);
            }
        }

        public /* synthetic */ b(x xVar, boolean z10, int i10, kotlin.jvm.internal.u uVar) {
            this((i10 & 1) != 0 ? false : z10);
        }
    }
}
