package em;

import io.bidmachine.protobuf.Waterfall;
import java.net.SocketTimeoutException;
import java.net.URLConnection;
import java.net.UnknownHostException;
import org.apache.http.conn.ConnectTimeoutException;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class z0 extends nm.d {

    /* renamed from: a, reason: collision with root package name */
    public final String f54789a;

    /* renamed from: b, reason: collision with root package name */
    public final int f54790b;

    public z0(String str, Waterfall.Result result, int i10) {
        super(nm.e.Post, null, result);
        this.f54789a = str;
        this.f54790b = i10;
        setDataBinder(new y0());
    }

    @Override // nm.d
    public final String getBaseUrl() {
        return this.f54789a;
    }

    @Override // nm.d
    public final Object obtainError(URLConnection uRLConnection, int i10) {
        if (i10 < 200 || i10 >= 300) {
            return new pr.a((i10 < 400 || i10 >= 500) ? (i10 < 500 || i10 >= 600) ? pr.a.internal("Unknown server error") : pr.a.f81790h : pr.a.f81789g, i10, o2.k(i10, "Server returned ", " code"));
        }
        return pr.a.f81800r;
    }

    @Override // nm.d
    public final void prepareRequestParams(URLConnection uRLConnection) {
        super.prepareRequestParams(uRLConnection);
        int i10 = this.f54790b;
        uRLConnection.setConnectTimeout(i10);
        uRLConnection.setReadTimeout(i10);
    }

    @Override // nm.d
    public final Object obtainError(URLConnection uRLConnection, Throwable th2) {
        if (th2 instanceof UnknownHostException) {
            return pr.a.f81787e;
        }
        if (!(th2 instanceof SocketTimeoutException) && !(th2 instanceof ConnectTimeoutException)) {
            return pr.a.throwable("Unknown api request error", th2);
        }
        return pr.a.f81788f;
    }
}
