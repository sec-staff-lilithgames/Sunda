package fx;

import retrofit2.Response;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Response f56306a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f56307b;

    public g(Response response, Throwable th2) {
        this.f56306a = response;
        this.f56307b = th2;
    }

    public static <T> g error(Throwable th2) {
        if (th2 != null) {
            return new g(null, th2);
        }
        throw new NullPointerException("error == null");
    }

    public static <T> g response(Response<T> response) {
        if (response != null) {
            return new g(response, null);
        }
        throw new NullPointerException("response == null");
    }

    public boolean isError() {
        return this.f56307b != null;
    }

    public Throwable error() {
        return this.f56307b;
    }

    public Response<Object> response() {
        return this.f56306a;
    }
}
