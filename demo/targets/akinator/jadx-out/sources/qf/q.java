package qf;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class q extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public final int f82967b;

    public q(int i10) {
        this.f82967b = i10;
    }

    public static boolean isCausedByPositionOutOfRange(IOException iOException) {
        for (IOException cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof q) && ((q) cause).f82967b == 2008) {
                return true;
            }
        }
        return false;
    }

    public q(Throwable th2, int i10) {
        super(th2);
        this.f82967b = i10;
    }

    public q(String str, int i10) {
        super(str);
        this.f82967b = i10;
    }

    public q(String str, Throwable th2, int i10) {
        super(str, th2);
        this.f82967b = i10;
    }
}
