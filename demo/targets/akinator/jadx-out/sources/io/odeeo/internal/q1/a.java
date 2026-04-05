package io.odeeo.internal.q1;

import android.media.AudioManager;
import bv.d;
import io.odeeo.internal.d1.a;
import io.odeeo.internal.j1.f;
import java.io.IOException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.Dispatchers;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends io.odeeo.internal.p1.b<io.odeeo.internal.e1.a, AbstractC0638a> {

    /* renamed from: b, reason: collision with root package name */
    public final f f65978b;

    /* renamed from: c, reason: collision with root package name */
    public final AudioManager f65979c;

    /* renamed from: d, reason: collision with root package name */
    public final String f65980d;

    /* renamed from: e, reason: collision with root package name */
    public final String f65981e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.q1.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0638a extends Throwable {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.q1.a$a$a, reason: collision with other inner class name */
        public static final class C0639a extends AbstractC0638a {

            /* renamed from: a, reason: collision with root package name */
            public final Throwable f65982a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0639a(Throwable errorCause) {
                super(errorCause, null);
                e0.checkNotNullParameter(errorCause, "errorCause");
                this.f65982a = errorCause;
            }

            public static /* synthetic */ C0639a copy$default(C0639a c0639a, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    th2 = c0639a.f65982a;
                }
                return c0639a.copy(th2);
            }

            public final Throwable component1() {
                return this.f65982a;
            }

            public final C0639a copy(Throwable errorCause) {
                e0.checkNotNullParameter(errorCause, "errorCause");
                return new C0639a(errorCause);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0639a) && e0.areEqual(this.f65982a, ((C0639a) obj).f65982a);
            }

            public final Throwable getErrorCause() {
                return this.f65982a;
            }

            public int hashCode() {
                return this.f65982a.hashCode();
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "NetworkError(errorCause=" + this.f65982a + ')';
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.q1.a$a$b */
        public static final class b extends AbstractC0638a {

            /* renamed from: a, reason: collision with root package name */
            public final Throwable f65983a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Throwable errorCause) {
                super(errorCause, null);
                e0.checkNotNullParameter(errorCause, "errorCause");
                this.f65983a = errorCause;
            }

            public static /* synthetic */ b copy$default(b bVar, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    th2 = bVar.f65983a;
                }
                return bVar.copy(th2);
            }

            public final Throwable component1() {
                return this.f65983a;
            }

            public final b copy(Throwable errorCause) {
                e0.checkNotNullParameter(errorCause, "errorCause");
                return new b(errorCause);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && e0.areEqual(this.f65983a, ((b) obj).f65983a);
            }

            public final Throwable getErrorCause() {
                return this.f65983a;
            }

            public int hashCode() {
                return this.f65983a.hashCode();
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "ServerError(errorCause=" + this.f65983a + ')';
            }
        }

        public /* synthetic */ AbstractC0638a(Throwable th2, u uVar) {
            this(th2);
        }

        public AbstractC0638a(Throwable th2) {
            super(th2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.usecase.appconfig.FetchAppConfigUseCase", f = "FetchAppConfigUseCase.kt", i = {0}, l = {33}, m = "execute", n = {"this"}, s = {"L$0"})
    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public Object f65984a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f65985b;

        /* renamed from: d, reason: collision with root package name */
        public int f65987d;

        public b(zu.d<? super b> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f65985b = obj;
            this.f65987d |= Integer.MIN_VALUE;
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
        this.f65978b = networkManager;
        this.f65979c = audioManager;
        this.f65980d = appKey;
        this.f65981e = bundleId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleError$odeeoSdk_release$default(a aVar, w0 w0Var, io.odeeo.internal.y1.f fVar, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            fVar = f.converter$default(aVar.f65978b, a.C0601a.class, null, 2, null);
        }
        aVar.handleError$odeeoSdk_release(w0Var, fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // io.odeeo.internal.p1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(zu.d<? super io.odeeo.internal.a.c<io.odeeo.internal.e1.a, ? extends io.odeeo.internal.q1.a.AbstractC0638a>> r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.q1.a.a(zu.d):java.lang.Object");
    }

    public final void handleError$odeeoSdk_release(w0 w0Var, io.odeeo.internal.y1.f<w0, a.C0601a> converter) throws IOException {
        String message;
        e0.checkNotNullParameter(converter, "converter");
        a.C0601a c0601aConvert = null;
        if (w0Var != null) {
            try {
                c0601aConvert = converter.convert(w0Var);
            } catch (IOException e10) {
                io.odeeo.internal.b2.a.w(e10, e10.getMessage(), new Object[0]);
            }
        }
        if (c0601aConvert == null || (message = c0601aConvert.getMessage()) == null) {
            message = "General error";
        }
        io.odeeo.internal.b2.a.w(message, new Object[0]);
    }
}
