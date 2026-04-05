package io.odeeo.internal.t1;

import android.media.AudioManager;
import bv.d;
import io.odeeo.internal.j1.f;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.Dispatchers;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends io.odeeo.internal.p1.b<io.odeeo.internal.e1.b, AbstractC0653a> {

    /* renamed from: b, reason: collision with root package name */
    public final f f66495b;

    /* renamed from: c, reason: collision with root package name */
    public final AudioManager f66496c;

    /* renamed from: d, reason: collision with root package name */
    public final String f66497d;

    /* renamed from: e, reason: collision with root package name */
    public final String f66498e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.t1.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0653a extends Throwable {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.t1.a$a$a, reason: collision with other inner class name */
        public static final class C0654a extends AbstractC0653a {

            /* renamed from: a, reason: collision with root package name */
            public final Throwable f66499a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0654a(Throwable errorCause) {
                super(errorCause, null);
                e0.checkNotNullParameter(errorCause, "errorCause");
                this.f66499a = errorCause;
            }

            public static /* synthetic */ C0654a copy$default(C0654a c0654a, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    th2 = c0654a.f66499a;
                }
                return c0654a.copy(th2);
            }

            public final Throwable component1() {
                return this.f66499a;
            }

            public final C0654a copy(Throwable errorCause) {
                e0.checkNotNullParameter(errorCause, "errorCause");
                return new C0654a(errorCause);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0654a) && e0.areEqual(this.f66499a, ((C0654a) obj).f66499a);
            }

            public final Throwable getErrorCause() {
                return this.f66499a;
            }

            public int hashCode() {
                return this.f66499a.hashCode();
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "NetworkError(errorCause=" + this.f66499a + ')';
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.t1.a$a$b */
        public static final class b extends AbstractC0653a {

            /* renamed from: a, reason: collision with root package name */
            public final int f66500a;

            /* renamed from: b, reason: collision with root package name */
            public final w0 f66501b;

            /* JADX WARN: Multi-variable type inference failed */
            public b(int i10, w0 w0Var) {
                super(null, 1, 0 == true ? 1 : 0);
                this.f66500a = i10;
                this.f66501b = w0Var;
            }

            public static /* synthetic */ b copy$default(b bVar, int i10, w0 w0Var, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = bVar.f66500a;
                }
                if ((i11 & 2) != 0) {
                    w0Var = bVar.f66501b;
                }
                return bVar.copy(i10, w0Var);
            }

            public final int component1() {
                return this.f66500a;
            }

            public final w0 component2() {
                return this.f66501b;
            }

            public final b copy(int i10, w0 w0Var) {
                return new b(i10, w0Var);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f66500a == bVar.f66500a && e0.areEqual(this.f66501b, bVar.f66501b);
            }

            public final int getCode() {
                return this.f66500a;
            }

            public final w0 getErrorBody() {
                return this.f66501b;
            }

            public int hashCode() {
                int iHashCode = Integer.hashCode(this.f66500a) * 31;
                w0 w0Var = this.f66501b;
                return iHashCode + (w0Var == null ? 0 : w0Var.hashCode());
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "ServerError(code=" + this.f66500a + ", errorBody=" + this.f66501b + ')';
            }
        }

        public /* synthetic */ AbstractC0653a(Throwable th2, u uVar) {
            this(th2);
        }

        public AbstractC0653a(Throwable th2) {
            super(th2);
        }

        public /* synthetic */ AbstractC0653a(Throwable th2, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : th2, null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.usecase.init.FetchGlobalConfigUseCase", f = "FetchGlobalConfigUseCase.kt", i = {}, l = {30}, m = "execute", n = {}, s = {})
    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f66502a;

        /* renamed from: c, reason: collision with root package name */
        public int f66504c;

        public b(zu.d<? super b> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f66502a = obj;
            this.f66504c |= Integer.MIN_VALUE;
            return a.this.a(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f networkManager, AudioManager audioManager, String appKey, String bundleId) {
        super(Dispatchers.getIO());
        e0.checkNotNullParameter(networkManager, "networkManager");
        e0.checkNotNullParameter(audioManager, "audioManager");
        e0.checkNotNullParameter(appKey, "appKey");
        e0.checkNotNullParameter(bundleId, "bundleId");
        this.f66495b = networkManager;
        this.f66496c = audioManager;
        this.f66497d = appKey;
        this.f66498e = bundleId;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // io.odeeo.internal.p1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(zu.d<? super io.odeeo.internal.a.c<io.odeeo.internal.e1.b, ? extends io.odeeo.internal.t1.a.AbstractC0653a>> r18) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.t1.a.a(zu.d):java.lang.Object");
    }
}
