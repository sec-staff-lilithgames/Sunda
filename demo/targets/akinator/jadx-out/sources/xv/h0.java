package xv;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface h0 {
    j call();

    int connectTimeoutMillis();

    p connection();

    v0 proceed(o0 o0Var) throws IOException;

    int readTimeoutMillis();

    o0 request();

    h0 withConnectTimeout(int i10, TimeUnit timeUnit);

    h0 withReadTimeout(int i10, TimeUnit timeUnit);

    h0 withWriteTimeout(int i10, TimeUnit timeUnit);

    int writeTimeoutMillis();
}
