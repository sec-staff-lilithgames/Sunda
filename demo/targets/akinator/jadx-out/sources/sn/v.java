package sn;

import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface v {

    /* renamed from: a, reason: collision with root package name */
    public static final s f86044a = new s();

    o acquireSession(q qVar, io.bidmachine.media3.common.b bVar);

    int getCryptoType(io.bidmachine.media3.common.b bVar);

    default u preacquireSession(q qVar, io.bidmachine.media3.common.b bVar) {
        return u.V8;
    }

    void setPlayer(Looper looper, on.f0 f0Var);

    default void prepare() {
    }

    default void release() {
    }
}
