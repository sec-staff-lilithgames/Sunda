package ln;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class v extends j {

    /* renamed from: c, reason: collision with root package name */
    public final int f73533c;

    @Deprecated
    public v(m mVar, int i10) {
        this(mVar, 2000, i10);
    }

    public static v createForIOException(IOException iOException, m mVar, int i10) {
        String message = iOException.getMessage();
        int i11 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !mh.c.toLowerCase(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i11 == 2007 ? new t(iOException, mVar) : new v(iOException, mVar, i11, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public v(m mVar, int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            i10 = 2001;
        }
        super(i10);
        this.f73533c = i11;
    }

    @Deprecated
    public v(String str, m mVar, int i10) {
        this(str, mVar, 2000, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public v(String str, m mVar, int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            i10 = 2001;
        }
        super(str, i10);
        this.f73533c = i11;
    }

    @Deprecated
    public v(IOException iOException, m mVar, int i10) {
        this(iOException, mVar, 2000, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public v(IOException iOException, m mVar, int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            i10 = 2001;
        }
        super(iOException, i10);
        this.f73533c = i11;
    }

    @Deprecated
    public v(String str, IOException iOException, m mVar, int i10) {
        this(str, iOException, mVar, 2000, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public v(String str, IOException iOException, m mVar, int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            i10 = 2001;
        }
        super(str, iOException, i10);
        this.f73533c = i11;
    }
}
