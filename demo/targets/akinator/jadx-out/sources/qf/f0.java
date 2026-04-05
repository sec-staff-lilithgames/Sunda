package qf;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class f0 extends q {

    /* renamed from: c, reason: collision with root package name */
    public final int f82940c;

    @Deprecated
    public f0(t tVar, int i10) {
        this(tVar, 2000, i10);
    }

    public static f0 createForIOException(IOException iOException, t tVar, int i10) {
        String message = iOException.getMessage();
        int i11 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !mh.c.toLowerCase(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i11 == 2007 ? new d0(iOException, tVar) : new f0(iOException, tVar, i11, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f0(t tVar, int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            i10 = 2001;
        }
        super(i10);
        this.f82940c = i11;
    }

    @Deprecated
    public f0(String str, t tVar, int i10) {
        this(str, tVar, 2000, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f0(String str, t tVar, int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            i10 = 2001;
        }
        super(str, i10);
        this.f82940c = i11;
    }

    @Deprecated
    public f0(IOException iOException, t tVar, int i10) {
        this(iOException, tVar, 2000, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f0(IOException iOException, t tVar, int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            i10 = 2001;
        }
        super(iOException, i10);
        this.f82940c = i11;
    }

    @Deprecated
    public f0(String str, IOException iOException, t tVar, int i10) {
        this(str, iOException, tVar, 2000, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f0(String str, IOException iOException, t tVar, int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            i10 = 2001;
        }
        super(str, iOException, i10);
        this.f82940c = i11;
    }
}
