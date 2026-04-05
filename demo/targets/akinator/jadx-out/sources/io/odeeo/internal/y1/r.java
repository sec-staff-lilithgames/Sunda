package io.odeeo.internal.y1;

import io.odeeo.internal.y1.l;
import xv.f0;
import xv.n0;
import xv.o0;
import xv.v0;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r<T> {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f67717a;

    /* renamed from: b, reason: collision with root package name */
    public final T f67718b;

    /* renamed from: c, reason: collision with root package name */
    public final w0 f67719c;

    public r(v0 v0Var, T t10, w0 w0Var) {
        this.f67717a = v0Var;
        this.f67718b = t10;
        this.f67719c = w0Var;
    }

    public static <T> r<T> error(int i10, w0 w0Var) {
        w.a(w0Var, "body == null");
        if (i10 >= 400) {
            return error(w0Var, new v0.a().body(new l.c(w0Var.contentType(), w0Var.contentLength())).code(i10).message("Response.error()").protocol(n0.f93760f).request(new o0.a().url("http://localhost/").build()).build());
        }
        throw new IllegalArgumentException(a.b.e(i10, "code < 400: "));
    }

    public static <T> r<T> success(T t10) {
        return success(t10, new v0.a().code(200).message("OK").protocol(n0.f93760f).request(new o0.a().url("http://localhost/").build()).build());
    }

    public T body() {
        return this.f67718b;
    }

    public int code() {
        return this.f67717a.code();
    }

    public w0 errorBody() {
        return this.f67719c;
    }

    public f0 headers() {
        return this.f67717a.headers();
    }

    public boolean isSuccessful() {
        return this.f67717a.isSuccessful();
    }

    public String message() {
        return this.f67717a.message();
    }

    public v0 raw() {
        return this.f67717a;
    }

    public String toString() {
        return this.f67717a.toString();
    }

    public static <T> r<T> success(int i10, T t10) {
        if (i10 >= 200 && i10 < 300) {
            return success(t10, new v0.a().code(i10).message("Response.success()").protocol(n0.f93760f).request(new o0.a().url("http://localhost/").build()).build());
        }
        throw new IllegalArgumentException(a.b.e(i10, "code < 200 or >= 300: "));
    }

    public static <T> r<T> error(w0 w0Var, v0 v0Var) {
        w.a(w0Var, "body == null");
        w.a(v0Var, "rawResponse == null");
        if (!v0Var.isSuccessful()) {
            return new r<>(v0Var, null, w0Var);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> r<T> success(T t10, f0 f0Var) {
        w.a(f0Var, "headers == null");
        return success(t10, new v0.a().code(200).message("OK").protocol(n0.f93760f).headers(f0Var).request(new o0.a().url("http://localhost/").build()).build());
    }

    public static <T> r<T> success(T t10, v0 v0Var) {
        w.a(v0Var, "rawResponse == null");
        if (v0Var.isSuccessful()) {
            return new r<>(v0Var, t10, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }
}
