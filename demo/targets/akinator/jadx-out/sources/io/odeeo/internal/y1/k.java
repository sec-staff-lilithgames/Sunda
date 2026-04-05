package io.odeeo.internal.y1;

import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Method;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import tu.a0;
import tu.x0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends f0 implements kv.l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ io.odeeo.internal.y1.b f67590a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.odeeo.internal.y1.b bVar) {
            super(1);
            this.f67590a = bVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }

        public final void invoke(Throwable th2) {
            this.f67590a.cancel();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends f0 implements kv.l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ io.odeeo.internal.y1.b f67591a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.odeeo.internal.y1.b bVar) {
            super(1);
            this.f67591a = bVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }

        public final void invoke(Throwable th2) {
            this.f67591a.cancel();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c<T> implements io.odeeo.internal.y1.d<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation f67592a;

        public c(CancellableContinuation cancellableContinuation) {
            this.f67592a = cancellableContinuation;
        }

        @Override // io.odeeo.internal.y1.d
        public void onFailure(io.odeeo.internal.y1.b<T> call, Throwable t10) {
            e0.checkParameterIsNotNull(call, "call");
            e0.checkParameterIsNotNull(t10, "t");
            CancellableContinuation cancellableContinuation = this.f67592a;
            int i10 = z.f87419c;
            cancellableContinuation.resumeWith(z.m7131constructorimpl(a0.createFailure(t10)));
        }

        @Override // io.odeeo.internal.y1.d
        public void onResponse(io.odeeo.internal.y1.b<T> call, r<T> response) {
            e0.checkParameterIsNotNull(call, "call");
            e0.checkParameterIsNotNull(response, "response");
            if (!response.isSuccessful()) {
                CancellableContinuation cancellableContinuation = this.f67592a;
                io.odeeo.internal.y1.h hVar = new io.odeeo.internal.y1.h(response);
                int i10 = z.f87419c;
                cancellableContinuation.resumeWith(z.m7131constructorimpl(a0.createFailure(hVar)));
                return;
            }
            T tBody = response.body();
            if (tBody != null) {
                this.f67592a.resumeWith(z.m7131constructorimpl(tBody));
                return;
            }
            Object objTag = call.request().tag(j.class);
            if (objTag == null) {
                e0.throwNpe();
            }
            e0.checkExpressionValueIsNotNull(objTag, "call.request().tag(Invocation::class.java)!!");
            Method method = ((j) objTag).method();
            StringBuilder sb2 = new StringBuilder("Response from ");
            e0.checkExpressionValueIsNotNull(method, "method");
            Class<?> declaringClass = method.getDeclaringClass();
            e0.checkExpressionValueIsNotNull(declaringClass, "method.declaringClass");
            sb2.append(declaringClass.getName());
            sb2.append('.');
            sb2.append(method.getName());
            sb2.append(" was null but response body type was declared as non-null");
            tu.l lVar = new tu.l(sb2.toString());
            CancellableContinuation cancellableContinuation2 = this.f67592a;
            int i11 = z.f87419c;
            cancellableContinuation2.resumeWith(z.m7131constructorimpl(a0.createFailure(lVar)));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d<T> implements io.odeeo.internal.y1.d<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation f67593a;

        public d(CancellableContinuation cancellableContinuation) {
            this.f67593a = cancellableContinuation;
        }

        @Override // io.odeeo.internal.y1.d
        public void onFailure(io.odeeo.internal.y1.b<T> call, Throwable t10) {
            e0.checkParameterIsNotNull(call, "call");
            e0.checkParameterIsNotNull(t10, "t");
            CancellableContinuation cancellableContinuation = this.f67593a;
            int i10 = z.f87419c;
            cancellableContinuation.resumeWith(z.m7131constructorimpl(a0.createFailure(t10)));
        }

        @Override // io.odeeo.internal.y1.d
        public void onResponse(io.odeeo.internal.y1.b<T> call, r<T> response) {
            e0.checkParameterIsNotNull(call, "call");
            e0.checkParameterIsNotNull(response, "response");
            if (response.isSuccessful()) {
                this.f67593a.resumeWith(z.m7131constructorimpl(response.body()));
                return;
            }
            CancellableContinuation cancellableContinuation = this.f67593a;
            io.odeeo.internal.y1.h hVar = new io.odeeo.internal.y1.h(response);
            int i10 = z.f87419c;
            cancellableContinuation.resumeWith(z.m7131constructorimpl(a0.createFailure(hVar)));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends f0 implements kv.l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ io.odeeo.internal.y1.b f67594a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.odeeo.internal.y1.b bVar) {
            super(1);
            this.f67594a = bVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }

        public final void invoke(Throwable th2) {
            this.f67594a.cancel();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f<T> implements io.odeeo.internal.y1.d<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation f67595a;

        public f(CancellableContinuation cancellableContinuation) {
            this.f67595a = cancellableContinuation;
        }

        @Override // io.odeeo.internal.y1.d
        public void onFailure(io.odeeo.internal.y1.b<T> call, Throwable t10) {
            e0.checkParameterIsNotNull(call, "call");
            e0.checkParameterIsNotNull(t10, "t");
            CancellableContinuation cancellableContinuation = this.f67595a;
            int i10 = z.f87419c;
            cancellableContinuation.resumeWith(z.m7131constructorimpl(a0.createFailure(t10)));
        }

        @Override // io.odeeo.internal.y1.d
        public void onResponse(io.odeeo.internal.y1.b<T> call, r<T> response) {
            e0.checkParameterIsNotNull(call, "call");
            e0.checkParameterIsNotNull(response, "response");
            this.f67595a.resumeWith(z.m7131constructorimpl(response));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ zu.d f67596a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Exception f67597b;

        public g(zu.d dVar, Exception exc) {
            this.f67596a = dVar;
            this.f67597b = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            zu.d dVarIntercepted = av.b.intercepted(this.f67596a);
            Exception exc = this.f67597b;
            int i10 = z.f87419c;
            dVarIntercepted.resumeWith(z.m7131constructorimpl(a0.createFailure(exc)));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "retrofit2/KotlinExtensions", f = "KotlinExtensions.kt", i = {0}, l = {112, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE}, m = "suspendAndThrow", n = {"$receiver"}, s = {"L$0"})
    public static final class h extends bv.d {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f67598a;

        /* renamed from: b, reason: collision with root package name */
        public int f67599b;

        /* renamed from: c, reason: collision with root package name */
        public Object f67600c;

        public h(zu.d dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f67598a = obj;
            this.f67599b |= Integer.MIN_VALUE;
            return k.suspendAndThrow(null, this);
        }
    }

    public static final <T> Object await(io.odeeo.internal.y1.b<T> bVar, zu.d<? super T> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl.invokeOnCancellation(new a(bVar));
        bVar.enqueue(new c(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == av.e.getCOROUTINE_SUSPENDED()) {
            bv.h.probeCoroutineSuspended(dVar);
        }
        return result;
    }

    public static final <T> Object awaitNullable(io.odeeo.internal.y1.b<T> bVar, zu.d<? super T> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl.invokeOnCancellation(new b(bVar));
        bVar.enqueue(new d(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == av.e.getCOROUTINE_SUSPENDED()) {
            bv.h.probeCoroutineSuspended(dVar);
        }
        return result;
    }

    public static final <T> Object awaitResponse(io.odeeo.internal.y1.b<T> bVar, zu.d<? super r<T>> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl.invokeOnCancellation(new e(bVar));
        bVar.enqueue(new f(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == av.e.getCOROUTINE_SUSPENDED()) {
            bv.h.probeCoroutineSuspended(dVar);
        }
        return result;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object suspendAndThrow(java.lang.Exception r4, zu.d<?> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.odeeo.internal.y1.k.h
            if (r0 == 0) goto L13
            r0 = r5
            io.odeeo.internal.y1.k$h r0 = (io.odeeo.internal.y1.k.h) r0
            int r1 = r0.f67599b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67599b = r1
            goto L18
        L13:
            io.odeeo.internal.y1.k$h r0 = new io.odeeo.internal.y1.k$h
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f67598a
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f67599b
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f67600c
            java.lang.Exception r4 = (java.lang.Exception) r4
            boolean r4 = r5 instanceof tu.y
            if (r4 != 0) goto L2e
            goto L63
        L2e:
            tu.y r5 = (tu.y) r5
            java.lang.Throwable r4 = r5.f87416b
            throw r4
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            boolean r2 = r5 instanceof tu.y
            if (r2 != 0) goto L66
            r0.f67600c = r4
            r0.f67599b = r3
            kotlinx.coroutines.CoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getDefault()
            zu.m r2 = r0.getContext()
            io.odeeo.internal.y1.k$g r3 = new io.odeeo.internal.y1.k$g
            r3.<init>(r0, r4)
            r5.mo5197dispatch(r2, r3)
            java.lang.Object r4 = av.e.getCOROUTINE_SUSPENDED()
            java.lang.Object r5 = av.e.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L60
            bv.h.probeCoroutineSuspended(r0)
        L60:
            if (r4 != r1) goto L63
            return r1
        L63:
            tu.x0 r4 = tu.x0.f87415a
            return r4
        L66:
            tu.y r5 = (tu.y) r5
            java.lang.Throwable r4 = r5.f87416b
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.y1.k.suspendAndThrow(java.lang.Exception, zu.d):java.lang.Object");
    }
}
