package io.odeeo.internal.p0;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class j extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final int f65619a;

    public j(int i10) {
        this.f65619a = i10;
    }

    public static boolean isCausedByPositionOutOfRange(IOException iOException) {
        for (IOException cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof j) && ((j) cause).f65619a == 2008) {
                return true;
            }
        }
        return false;
    }

    public j(Throwable th2, int i10) {
        super(th2);
        this.f65619a = i10;
    }

    public j(String str, int i10) {
        super(str);
        this.f65619a = i10;
    }

    public j(String str, Throwable th2, int i10) {
        super(str, th2);
        this.f65619a = i10;
    }
}
