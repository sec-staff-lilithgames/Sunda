package com.vungle.ads.internal.network;

import com.vungle.ads.internal.network.converters.Converter;
import com.vungle.ads.internal.util.Logger;
import gv.d;
import java.io.IOException;
import java.util.Objects;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import pw.g;
import pw.h0;
import pw.k;
import xv.j;
import xv.j0;
import xv.v0;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class OkHttpCall<T> implements Call<T> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "OkHttpCall";
    private volatile boolean canceled;
    private final j rawCall;
    private final Converter<w0, T> responseConverter;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void throwIfFatal(Throwable th2) throws Throwable {
            if ((th2 instanceof VirtualMachineError) || (th2 instanceof ThreadDeath) || (th2 instanceof LinkageError)) {
                throw th2;
            }
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ExceptionCatchingResponseBody extends w0 {
        private final w0 delegate;
        private final k delegateSource;
        private IOException thrownException;

        public ExceptionCatchingResponseBody(w0 delegate) {
            e0.checkNotNullParameter(delegate, "delegate");
            this.delegate = delegate;
            this.delegateSource = h0.buffer(new pw.u(delegate.source()) { // from class: com.vungle.ads.internal.network.OkHttpCall.ExceptionCatchingResponseBody.1
                @Override // pw.u, pw.b1
                public long read(g sink, long j10) throws IOException {
                    e0.checkNotNullParameter(sink, "sink");
                    try {
                        return super.read(sink, j10);
                    } catch (IOException e10) {
                        ExceptionCatchingResponseBody.this.setThrownException(e10);
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

        public final IOException getThrownException() {
            return this.thrownException;
        }

        public final void setThrownException(IOException iOException) {
            this.thrownException = iOException;
        }

        @Override // xv.w0
        public k source() {
            return this.delegateSource;
        }

        public final void throwIfCaught() throws IOException {
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
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public OkHttpCall(j rawCall, Converter<w0, T> responseConverter) {
        e0.checkNotNullParameter(rawCall, "rawCall");
        e0.checkNotNullParameter(responseConverter, "responseConverter");
        this.rawCall = rawCall;
        this.responseConverter = responseConverter;
    }

    private final w0 buffer(w0 w0Var) throws IOException {
        g gVar = new g();
        w0Var.source().readAll(gVar);
        return w0.Companion.create(gVar, w0Var.contentType(), w0Var.contentLength());
    }

    @Override // com.vungle.ads.internal.network.Call
    public void cancel() {
        j jVar;
        this.canceled = true;
        synchronized (this) {
            jVar = this.rawCall;
        }
        jVar.cancel();
    }

    @Override // com.vungle.ads.internal.network.Call
    public void enqueue(final Callback<T> callback) {
        j jVar;
        e0.checkNotNullParameter(callback, "callback");
        Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            jVar = this.rawCall;
        }
        if (this.canceled) {
            jVar.cancel();
        }
        jVar.enqueue(new xv.k(this) { // from class: com.vungle.ads.internal.network.OkHttpCall.enqueue.2
            final /* synthetic */ OkHttpCall<T> this$0;

            {
                this.this$0 = this;
            }

            private final void callFailure(Throwable th2) throws Throwable {
                try {
                    callback.onFailure(this.this$0, th2);
                } catch (Throwable th3) {
                    OkHttpCall.Companion.throwIfFatal(th3);
                    Logger.Companion.e(OkHttpCall.TAG, "Cannot pass failure to callback", th3);
                }
            }

            @Override // xv.k
            public void onFailure(j call, IOException e10) throws Throwable {
                e0.checkNotNullParameter(call, "call");
                e0.checkNotNullParameter(e10, "e");
                callFailure(e10);
            }

            @Override // xv.k
            public void onResponse(j call, v0 response) throws Throwable {
                e0.checkNotNullParameter(call, "call");
                e0.checkNotNullParameter(response, "response");
                try {
                    try {
                        callback.onResponse(this.this$0, this.this$0.parseResponse(response));
                    } catch (Throwable th2) {
                        OkHttpCall.Companion.throwIfFatal(th2);
                        Logger.Companion.e(OkHttpCall.TAG, "Cannot pass response to callback", th2);
                    }
                } catch (Throwable th3) {
                    OkHttpCall.Companion.throwIfFatal(th3);
                    callFailure(th3);
                }
            }
        });
    }

    @Override // com.vungle.ads.internal.network.Call
    public Response<T> execute() throws IOException {
        j jVar;
        synchronized (this) {
            jVar = this.rawCall;
        }
        if (this.canceled) {
            jVar.cancel();
        }
        return parseResponse(jVar.execute());
    }

    @Override // com.vungle.ads.internal.network.Call
    public boolean isCanceled() {
        boolean zIsCanceled;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            zIsCanceled = this.rawCall.isCanceled();
        }
        return zIsCanceled;
    }

    public final Response<T> parseResponse(v0 rawResp) throws IOException {
        e0.checkNotNullParameter(rawResp, "rawResp");
        w0 w0VarBody = rawResp.body();
        if (w0VarBody == null) {
            return null;
        }
        v0 v0VarBuild = rawResp.newBuilder().body(new NoContentResponseBody(w0VarBody.contentType(), w0VarBody.contentLength())).build();
        int iCode = v0VarBuild.code();
        if (iCode >= 200 && iCode < 300) {
            if (iCode == 204 || iCode == 205) {
                w0VarBody.close();
                return Response.Companion.success(null, v0VarBuild);
            }
            ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(w0VarBody);
            try {
                return Response.Companion.success(this.responseConverter.convert(exceptionCatchingResponseBody), v0VarBuild);
            } catch (Throwable th2) {
                exceptionCatchingResponseBody.throwIfCaught();
                throw th2;
            }
        }
        try {
            Response<T> responseError = Response.Companion.error(buffer(w0VarBody), v0VarBuild);
            d.closeFinally(w0VarBody, null);
            return responseError;
        } finally {
        }
    }
}
