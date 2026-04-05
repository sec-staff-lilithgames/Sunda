package com.vungle.ads.internal.network;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import xv.f0;
import xv.v0;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class Response<T> {
    public static final Companion Companion = new Companion(null);
    private final T body;
    private final w0 errorBody;
    private final v0 rawResponse;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final <T> Response<T> error(w0 w0Var, v0 rawResponse) {
            e0.checkNotNullParameter(rawResponse, "rawResponse");
            if (rawResponse.isSuccessful()) {
                throw new IllegalArgumentException("rawResponse should not be successful response");
            }
            u uVar = null;
            return new Response<>(rawResponse, uVar, w0Var, uVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <T> Response<T> success(T t10, v0 rawResponse) {
            e0.checkNotNullParameter(rawResponse, "rawResponse");
            if (rawResponse.isSuccessful()) {
                return new Response<>(rawResponse, t10, null, 0 == true ? 1 : 0);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }

        private Companion() {
        }
    }

    public /* synthetic */ Response(v0 v0Var, Object obj, w0 w0Var, u uVar) {
        this(v0Var, obj, w0Var);
    }

    public final T body() {
        return this.body;
    }

    public final int code() {
        return this.rawResponse.code();
    }

    public final w0 errorBody() {
        return this.errorBody;
    }

    public final f0 headers() {
        return this.rawResponse.headers();
    }

    public final boolean isSuccessful() {
        return this.rawResponse.isSuccessful();
    }

    public final String message() {
        return this.rawResponse.message();
    }

    public final v0 raw() {
        return this.rawResponse;
    }

    public String toString() {
        return this.rawResponse.toString();
    }

    private Response(v0 v0Var, T t10, w0 w0Var) {
        this.rawResponse = v0Var;
        this.body = t10;
        this.errorBody = w0Var;
    }
}
