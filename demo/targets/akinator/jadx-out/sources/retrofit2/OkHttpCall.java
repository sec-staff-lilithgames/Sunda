package retrofit2;

import com.apm.insight.b.El.rJqlArycrfkilN;
import java.io.IOException;
import java.util.Objects;
import pw.d1;
import pw.g;
import pw.h0;
import pw.k;
import pw.u;
import xv.i;
import xv.j;
import xv.j0;
import xv.o0;
import xv.v0;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class OkHttpCall<T> implements Call<T> {
    private final Object[] args;
    private final i callFactory;
    private volatile boolean canceled;
    private Throwable creationFailure;
    private boolean executed;
    private final Object instance;
    private j rawCall;
    private final RequestFactory requestFactory;
    private final Converter<w0, T> responseConverter;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ExceptionCatchingResponseBody extends w0 {
        private final w0 delegate;
        private final k delegateSource;
        IOException thrownException;

        public ExceptionCatchingResponseBody(w0 w0Var) {
            this.delegate = w0Var;
            this.delegateSource = h0.buffer(new u(w0Var.source()) { // from class: retrofit2.OkHttpCall.ExceptionCatchingResponseBody.1
                @Override // pw.u, pw.b1
                public long read(g gVar, long j10) throws IOException {
                    try {
                        return super.read(gVar, j10);
                    } catch (IOException e10) {
                        ExceptionCatchingResponseBody.this.thrownException = e10;
                        throw e10;
                    }
                }
            });
        }

        @Override // xv.w0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        @Override // xv.w0
        public long contentLength() {
            return this.delegate.contentLength();
        }

        @Override // xv.w0
        public j0 contentType() {
            return this.delegate.contentType();
        }

        @Override // xv.w0
        public k source() {
            return this.delegateSource;
        }

        public void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class NoContentResponseBody extends w0 {
        private final long contentLength;
        private final j0 contentType;

        public NoContentResponseBody(j0 j0Var, long j10) {
            this.contentType = j0Var;
            this.contentLength = j10;
        }

        @Override // xv.w0
        public long contentLength() {
            return this.contentLength;
        }

        @Override // xv.w0
        public j0 contentType() {
            return this.contentType;
        }

        @Override // xv.w0
        public k source() {
            throw new IllegalStateException(rJqlArycrfkilN.sqEciFW);
        }
    }

    public OkHttpCall(RequestFactory requestFactory, Object obj, Object[] objArr, i iVar, Converter<w0, T> converter) {
        this.requestFactory = requestFactory;
        this.instance = obj;
        this.args = objArr;
        this.callFactory = iVar;
        this.responseConverter = converter;
    }

    private j createRawCall() throws IOException {
        j jVarNewCall = this.callFactory.newCall(this.requestFactory.create(this.instance, this.args));
        if (jVarNewCall != null) {
            return jVarNewCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    private j getRawCall() throws IOException {
        j jVar = this.rawCall;
        if (jVar != null) {
            return jVar;
        }
        Throwable th2 = this.creationFailure;
        if (th2 != null) {
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw ((Error) th2);
        }
        try {
            j jVarCreateRawCall = createRawCall();
            this.rawCall = jVarCreateRawCall;
            return jVarCreateRawCall;
        } catch (IOException | Error | RuntimeException e10) {
            Utils.throwIfFatal(e10);
            this.creationFailure = e10;
            throw e10;
        }
    }

    @Override // retrofit2.Call
    public void cancel() {
        j jVar;
        this.canceled = true;
        synchronized (this) {
            jVar = this.rawCall;
        }
        if (jVar != null) {
            jVar.cancel();
        }
    }

    @Override // retrofit2.Call
    public void enqueue(final Callback<T> callback) {
        j jVar;
        Throwable th2;
        Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            try {
                if (this.executed) {
                    throw new IllegalStateException("Already executed.");
                }
                this.executed = true;
                jVar = this.rawCall;
                th2 = this.creationFailure;
                if (jVar == null && th2 == null) {
                    try {
                        j jVarCreateRawCall = createRawCall();
                        this.rawCall = jVarCreateRawCall;
                        jVar = jVarCreateRawCall;
                    } catch (Throwable th3) {
                        th2 = th3;
                        Utils.throwIfFatal(th2);
                        this.creationFailure = th2;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (th2 != null) {
            callback.onFailure(this, th2);
            return;
        }
        if (this.canceled) {
            jVar.cancel();
        }
        jVar.enqueue(new xv.k() { // from class: retrofit2.OkHttpCall.1
            private void callFailure(Throwable th5) {
                try {
                    callback.onFailure(OkHttpCall.this, th5);
                } catch (Throwable th6) {
                    Utils.throwIfFatal(th6);
                    th6.printStackTrace();
                }
            }

            @Override // xv.k
            public void onFailure(j jVar2, IOException iOException) {
                callFailure(iOException);
            }

            @Override // xv.k
            public void onResponse(j jVar2, v0 v0Var) {
                try {
                    try {
                        callback.onResponse(OkHttpCall.this, OkHttpCall.this.parseResponse(v0Var));
                    } catch (Throwable th5) {
                        Utils.throwIfFatal(th5);
                        th5.printStackTrace();
                    }
                } catch (Throwable th6) {
                    Utils.throwIfFatal(th6);
                    callFailure(th6);
                }
            }
        });
    }

    @Override // retrofit2.Call
    public Response<T> execute() throws IOException {
        j rawCall;
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already executed.");
            }
            this.executed = true;
            rawCall = getRawCall();
        }
        if (this.canceled) {
            rawCall.cancel();
        }
        return parseResponse(rawCall.execute());
    }

    @Override // retrofit2.Call
    public boolean isCanceled() {
        boolean z10 = true;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            try {
                j jVar = this.rawCall;
                if (jVar == null || !jVar.isCanceled()) {
                    z10 = false;
                }
            } finally {
            }
        }
        return z10;
    }

    @Override // retrofit2.Call
    public synchronized boolean isExecuted() {
        return this.executed;
    }

    public Response<T> parseResponse(v0 v0Var) throws IOException {
        w0 w0VarBody = v0Var.body();
        v0 v0VarBuild = v0Var.newBuilder().body(new NoContentResponseBody(w0VarBody.contentType(), w0VarBody.contentLength())).build();
        int iCode = v0VarBuild.code();
        if (iCode < 200 || iCode >= 300) {
            try {
                return Response.error(Utils.buffer(w0VarBody), v0VarBuild);
            } finally {
                w0VarBody.close();
            }
        }
        if (iCode == 204 || iCode == 205) {
            w0VarBody.close();
            return Response.success((Object) null, v0VarBuild);
        }
        ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(w0VarBody);
        try {
            return Response.success(this.responseConverter.convert(exceptionCatchingResponseBody), v0VarBuild);
        } catch (RuntimeException e10) {
            exceptionCatchingResponseBody.throwIfCaught();
            throw e10;
        }
    }

    @Override // retrofit2.Call
    public synchronized o0 request() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return getRawCall().request();
    }

    @Override // retrofit2.Call
    public synchronized d1 timeout() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create call.", e10);
        }
        return getRawCall().timeout();
    }

    @Override // retrofit2.Call
    public OkHttpCall<T> clone() {
        return new OkHttpCall<>(this.requestFactory, this.instance, this.args, this.callFactory, this.responseConverter);
    }
}
