package io.odeeo.internal.f;

import android.os.Looper;
import com.facebook.ads.AdError;
import io.odeeo.internal.f.f;
import io.odeeo.internal.f.g;
import nh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f63923a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final h f63924b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements h {
        @Override // io.odeeo.internal.f.h
        public f acquireSession(Looper looper, g.a aVar, io.odeeo.internal.b.t tVar) {
            if (tVar.f62974o == null) {
                return null;
            }
            return new l(new f.a(new t(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
        }

        @Override // io.odeeo.internal.f.h
        public int getCryptoType(io.odeeo.internal.b.t tVar) {
            return tVar.f62974o != null ? 1 : 0;
        }

        @Override // io.odeeo.internal.f.h
        public /* bridge */ /* synthetic */ b preacquireSession(Looper looper, g.a aVar, io.odeeo.internal.b.t tVar) {
            return super.preacquireSession(looper, aVar, tVar);
        }

        @Override // io.odeeo.internal.f.h
        public /* bridge */ /* synthetic */ void prepare() {
            super.prepare();
        }

        @Override // io.odeeo.internal.f.h
        public /* bridge */ /* synthetic */ void release() {
            super.release();
        }
    }

    static {
        a aVar = new a();
        f63923a = aVar;
        f63924b = aVar;
    }

    @Deprecated
    static h getDummyDrmSessionManager() {
        return f63923a;
    }

    f acquireSession(Looper looper, g.a aVar, io.odeeo.internal.b.t tVar);

    int getCryptoType(io.odeeo.internal.b.t tVar);

    default b preacquireSession(Looper looper, g.a aVar, io.odeeo.internal.b.t tVar) {
        return b.f63925a;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f63925a = new n1(29);

        void release();

        static /* synthetic */ void a() {
        }
    }

    default void prepare() {
    }

    default void release() {
    }
}
