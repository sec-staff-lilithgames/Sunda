package com.moloco.sdk.internal.error.crash;

import bv.n;
import com.moloco.sdk.internal.error.crash.c;
import java.lang.Thread;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c implements com.moloco.sdk.internal.error.crash.a {

    /* renamed from: a, reason: collision with root package name */
    public final d f45903a;

    /* renamed from: b, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f45904b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends n implements p {
        public a(zu.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return c.this.new a(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            final c cVar = c.this;
            if (cVar.f45904b == null) {
                cVar.f45904b = Thread.getDefaultUncaughtExceptionHandler();
                Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.moloco.sdk.internal.error.crash.b
                    @Override // java.lang.Thread.UncaughtExceptionHandler
                    public final void uncaughtException(Thread thread, Throwable th2) {
                        c.a.a(cVar, thread, th2);
                    }
                });
            }
            return x0.f87415a;
        }

        public static final void a(c cVar, Thread thread, Throwable th2) {
            d dVar = cVar.f45903a;
            e0.checkNotNull(th2);
            dVar.a(th2);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = cVar.f45904b;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th2);
            } else {
                System.exit(2);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }
        }
    }

    public c(d crashHandler) {
        e0.checkNotNullParameter(crashHandler, "crashHandler");
        this.f45903a = crashHandler;
    }

    @Override // com.moloco.sdk.internal.error.crash.a
    public Object a(zu.d<? super x0> dVar) {
        Object objWithContext = BuildersKt.withContext(com.moloco.sdk.internal.scheduling.c.a().getMain(), new a(null), dVar);
        return objWithContext == av.e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }
}
