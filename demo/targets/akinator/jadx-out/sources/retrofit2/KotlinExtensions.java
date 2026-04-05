package retrofit2;

import av.b;
import av.e;
import bv.d;
import bv.f;
import bv.h;
import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kv.l;
import tu.a0;
import tu.x0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class KotlinExtensions {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", i = {0}, l = {Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE}, m = "suspendAndThrow", n = {"$this$suspendAndThrow"}, s = {"L$0"})
    /* renamed from: retrofit2.KotlinExtensions$suspendAndThrow$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinExtensions.suspendAndThrow(null, this);
        }
    }

    public static final <T> Object await(final Call<T> call, zu.d<? super T> dVar) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new l() { // from class: retrofit2.KotlinExtensions$await$2$1
            @Override // kv.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return x0.f87415a;
            }

            public final void invoke(Throwable th2) {
                call.cancel();
            }
        });
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$2$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable t10) {
                e0.checkNotNullParameter(call2, "call");
                e0.checkNotNullParameter(t10, "t");
                CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl;
                int i10 = z.f87419c;
                cancellableContinuation.resumeWith(z.m7131constructorimpl(a0.createFailure(t10)));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                e0.checkNotNullParameter(call2, "call");
                e0.checkNotNullParameter(response, "response");
                if (!response.isSuccessful()) {
                    CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl;
                    int i10 = z.f87419c;
                    cancellableContinuation.resumeWith(z.m7131constructorimpl(a0.createFailure(new HttpException(response))));
                    return;
                }
                T tBody = response.body();
                if (tBody != null) {
                    cancellableContinuationImpl.resumeWith(z.m7131constructorimpl(tBody));
                    return;
                }
                Object objTag = call2.request().tag(Invocation.class);
                e0.checkNotNull(objTag);
                Invocation invocation = (Invocation) objTag;
                tu.l lVar = new tu.l("Response from " + invocation.service().getName() + '.' + invocation.method().getName() + " was null but response body type was declared as non-null");
                CancellableContinuation<T> cancellableContinuation2 = cancellableContinuationImpl;
                int i11 = z.f87419c;
                cancellableContinuation2.resumeWith(z.m7131constructorimpl(a0.createFailure(lVar)));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return result;
    }

    public static final <T> Object awaitNullable(final Call<T> call, zu.d<? super T> dVar) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new l() { // from class: retrofit2.KotlinExtensions$await$4$1
            @Override // kv.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return x0.f87415a;
            }

            public final void invoke(Throwable th2) {
                call.cancel();
            }
        });
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$4$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable t10) {
                e0.checkNotNullParameter(call2, "call");
                e0.checkNotNullParameter(t10, "t");
                CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl;
                int i10 = z.f87419c;
                cancellableContinuation.resumeWith(z.m7131constructorimpl(a0.createFailure(t10)));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                e0.checkNotNullParameter(call2, "call");
                e0.checkNotNullParameter(response, "response");
                if (response.isSuccessful()) {
                    CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl;
                    int i10 = z.f87419c;
                    cancellableContinuation.resumeWith(z.m7131constructorimpl(response.body()));
                } else {
                    CancellableContinuation<T> cancellableContinuation2 = cancellableContinuationImpl;
                    int i11 = z.f87419c;
                    cancellableContinuation2.resumeWith(z.m7131constructorimpl(a0.createFailure(new HttpException(response))));
                }
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return result;
    }

    public static final <T> Object awaitResponse(final Call<T> call, zu.d<? super Response<T>> dVar) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new l() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$1
            @Override // kv.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return x0.f87415a;
            }

            public final void invoke(Throwable th2) {
                call.cancel();
            }
        });
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable t10) {
                e0.checkNotNullParameter(call2, "call");
                e0.checkNotNullParameter(t10, "t");
                CancellableContinuation<Response<T>> cancellableContinuation = cancellableContinuationImpl;
                int i10 = z.f87419c;
                cancellableContinuation.resumeWith(z.m7131constructorimpl(a0.createFailure(t10)));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                e0.checkNotNullParameter(call2, "call");
                e0.checkNotNullParameter(response, "response");
                cancellableContinuationImpl.resumeWith(z.m7131constructorimpl(response));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return result;
    }

    public static final Object awaitUnit(Call<x0> call, zu.d<? super x0> dVar) {
        e0.checkNotNull(call, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
        return awaitNullable(call, dVar);
    }

    public static final /* synthetic */ <T> T create(Retrofit retrofit) {
        e0.checkNotNullParameter(retrofit, "<this>");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        T t10 = (T) retrofit.create(Object.class);
        e0.checkNotNullExpressionValue(t10, "create(...)");
        return t10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object suspendAndThrow(final java.lang.Throwable r4, zu.d<?> r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.L$0
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            tu.a0.throwOnFailure(r5)
            goto L5c
        L35:
            tu.a0.throwOnFailure(r5)
            r0.L$0 = r4
            r0.label = r3
            kotlinx.coroutines.CoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getDefault()
            zu.m r2 = r0.getContext()
            retrofit2.KotlinExtensions$suspendAndThrow$2$1 r3 = new retrofit2.KotlinExtensions$suspendAndThrow$2$1
            r3.<init>()
            r5.mo5197dispatch(r2, r3)
            java.lang.Object r4 = av.e.getCOROUTINE_SUSPENDED()
            java.lang.Object r5 = av.e.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L59
            bv.h.probeCoroutineSuspended(r0)
        L59:
            if (r4 != r1) goto L5c
            return r1
        L5c:
            tu.k r4 = new tu.k
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.suspendAndThrow(java.lang.Throwable, zu.d):java.lang.Object");
    }
}
