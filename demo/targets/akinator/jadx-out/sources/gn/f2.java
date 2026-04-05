package gn;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f2 extends Exception {
    public f2(String str) {
        this(str, C.TIME_UNSET);
    }

    public static f2 from(Exception exc) {
        return from(exc, C.TIME_UNSET);
    }

    public f2(String str, long j10) {
        super(str);
    }

    public static f2 from(Exception exc, long j10) {
        return exc instanceof f2 ? (f2) exc : new f2(exc, j10);
    }

    public f2(String str, Throwable th2) {
        this(str, th2, C.TIME_UNSET);
    }

    public f2(String str, Throwable th2, long j10) {
        super(str, th2);
    }

    public f2(Throwable th2) {
        this(th2, C.TIME_UNSET);
    }

    public f2(Throwable th2, long j10) {
        super(th2);
    }
}
