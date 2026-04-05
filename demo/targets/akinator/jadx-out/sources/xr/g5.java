package xr;

import com.applovin.shadow.okhttp3.internal.http2.Header;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class g5 extends d {

    /* renamed from: w, reason: collision with root package name */
    public static final wr.z3 f92550w = wr.p2.keyOf(Header.RESPONSE_STATUS_UTF8, new f5());

    /* renamed from: s, reason: collision with root package name */
    public wr.m6 f92551s;

    /* renamed from: t, reason: collision with root package name */
    public wr.e4 f92552t;

    /* renamed from: u, reason: collision with root package name */
    public Charset f92553u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f92554v;

    public static Charset f(wr.e4 e4Var) {
        String str = (String) e4Var.get(c5.f92315j);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return mh.h0.f74628c;
    }

    public static wr.m6 g(wr.e4 e4Var) {
        Integer num = (Integer) e4Var.get(f92550w);
        if (num == null) {
            return wr.m6.f91046n.withDescription("Missing HTTP status code");
        }
        String str = (String) e4Var.get(c5.f92315j);
        if (c5.isGrpcContentType(str)) {
            return null;
        }
        return c5.httpStatusToGrpcStatus(num.intValue()).augmentDescription("invalid content-type: " + str);
    }

    @Override // xr.d, xr.m, xr.m9
    public abstract /* synthetic */ void bytesRead(int i10);

    @Override // xr.d, xr.m, xr.m9
    public abstract /* synthetic */ void deframeFailed(Throwable th2);

    @Override // xr.d, xr.m, xr.m9
    public /* bridge */ /* synthetic */ void deframerClosed(boolean z10) {
        super.deframerClosed(z10);
    }

    @Override // xr.d, xr.m, xr.w, xr.b0
    public abstract /* synthetic */ void runOnTransportThread(Runnable runnable);
}
