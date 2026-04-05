package retrofit2;

import a.b;
import java.util.Objects;
import retrofit2.OkHttpCall;
import xv.f0;
import xv.n0;
import xv.o0;
import xv.v0;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Response<T> {
    private final T body;
    private final w0 errorBody;
    private final v0 rawResponse;

    private Response(v0 v0Var, T t10, w0 w0Var) {
        this.rawResponse = v0Var;
        this.body = t10;
        this.errorBody = w0Var;
    }

    public static <T> Response<T> error(int i10, w0 w0Var) {
        Objects.requireNonNull(w0Var, "body == null");
        if (i10 >= 400) {
            return error(w0Var, new v0.a().body(new OkHttpCall.NoContentResponseBody(w0Var.contentType(), w0Var.contentLength())).code(i10).message("Response.error()").protocol(n0.f93760f).request(new o0.a().url("http://localhost/").build()).build());
        }
        throw new IllegalArgumentException(b.e(i10, "code < 400: "));
    }

    public static <T> Response<T> success(T t10) {
        return success(t10, new v0.a().code(200).message("OK").protocol(n0.f93760f).request(new o0.a().url("http://localhost/").build()).build());
    }

    public T body() {
        return this.body;
    }

    public int code() {
        return this.rawResponse.code();
    }

    public w0 errorBody() {
        return this.errorBody;
    }

    public f0 headers() {
        return this.rawResponse.headers();
    }

    public boolean isSuccessful() {
        return this.rawResponse.isSuccessful();
    }

    public String message() {
        return this.rawResponse.message();
    }

    public v0 raw() {
        return this.rawResponse;
    }

    public String toString() {
        return this.rawResponse.toString();
    }

    public static <T> Response<T> success(int i10, T t10) {
        if (i10 >= 200 && i10 < 300) {
            return success(t10, new v0.a().code(i10).message("Response.success()").protocol(n0.f93760f).request(new o0.a().url("http://localhost/").build()).build());
        }
        throw new IllegalArgumentException(b.e(i10, "code < 200 or >= 300: "));
    }

    public static <T> Response<T> error(w0 w0Var, v0 v0Var) {
        Objects.requireNonNull(w0Var, "body == null");
        Objects.requireNonNull(v0Var, "rawResponse == null");
        if (!v0Var.isSuccessful()) {
            return new Response<>(v0Var, null, w0Var);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> Response<T> success(T t10, f0 f0Var) {
        Objects.requireNonNull(f0Var, "headers == null");
        return success(t10, new v0.a().code(200).message("OK").protocol(n0.f93760f).headers(f0Var).request(new o0.a().url("http://localhost/").build()).build());
    }

    public static <T> Response<T> success(T t10, v0 v0Var) {
        Objects.requireNonNull(v0Var, "rawResponse == null");
        if (v0Var.isSuccessful()) {
            return new Response<>(v0Var, t10, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }
}
