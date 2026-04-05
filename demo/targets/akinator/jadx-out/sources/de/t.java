package de;

import android.os.Looper;
import com.google.android.exoplayer2.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface t {

    /* renamed from: a, reason: collision with root package name */
    public static final r f52168a = new r();

    @Deprecated
    static t getDummyDrmSessionManager() {
        return f52168a;
    }

    n acquireSession(p pVar, z0 z0Var);

    int getCryptoType(z0 z0Var);

    default s preacquireSession(p pVar, z0 z0Var) {
        return s.D8;
    }

    void setPlayer(Looper looper, zd.c0 c0Var);

    default void prepare() {
    }

    default void release() {
    }
}
