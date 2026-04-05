package io.odeeo.internal.y1;

import io.odeeo.internal.y1.c;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e extends c.a {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f67555a = new e();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a<R> implements c<R, CompletableFuture<R>> {

        /* renamed from: a, reason: collision with root package name */
        public final Type f67556a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.y1.e$a$a, reason: collision with other inner class name */
        public class C0690a extends CompletableFuture<R> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ io.odeeo.internal.y1.b f67557a;

            public C0690a(io.odeeo.internal.y1.b bVar) {
                this.f67557a = bVar;
            }

            @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
            public boolean cancel(boolean z10) {
                if (z10) {
                    this.f67557a.cancel();
                }
                return super.cancel(z10);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class b implements d<R> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CompletableFuture f67559a;

            public b(CompletableFuture completableFuture) {
                this.f67559a = completableFuture;
            }

            @Override // io.odeeo.internal.y1.d
            public void onFailure(io.odeeo.internal.y1.b<R> bVar, Throwable th2) {
                this.f67559a.completeExceptionally(th2);
            }

            @Override // io.odeeo.internal.y1.d
            public void onResponse(io.odeeo.internal.y1.b<R> bVar, r<R> rVar) {
                if (rVar.isSuccessful()) {
                    this.f67559a.complete(rVar.body());
                } else {
                    this.f67559a.completeExceptionally(new h(rVar));
                }
            }
        }

        public a(Type type) {
            this.f67556a = type;
        }

        @Override // io.odeeo.internal.y1.c
        public Type responseType() {
            return this.f67556a;
        }

        @Override // io.odeeo.internal.y1.c
        public CompletableFuture<R> adapt(io.odeeo.internal.y1.b<R> bVar) {
            C0690a c0690a = new C0690a(bVar);
            bVar.enqueue(new b(c0690a));
            return c0690a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b<R> implements c<R, CompletableFuture<r<R>>> {

        /* renamed from: a, reason: collision with root package name */
        public final Type f67561a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends CompletableFuture<r<R>> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ io.odeeo.internal.y1.b f67562a;

            public a(io.odeeo.internal.y1.b bVar) {
                this.f67562a = bVar;
            }

            @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
            public boolean cancel(boolean z10) {
                if (z10) {
                    this.f67562a.cancel();
                }
                return super.cancel(z10);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.y1.e$b$b, reason: collision with other inner class name */
        public class C0691b implements d<R> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CompletableFuture f67564a;

            public C0691b(CompletableFuture completableFuture) {
                this.f67564a = completableFuture;
            }

            @Override // io.odeeo.internal.y1.d
            public void onFailure(io.odeeo.internal.y1.b<R> bVar, Throwable th2) {
                this.f67564a.completeExceptionally(th2);
            }

            @Override // io.odeeo.internal.y1.d
            public void onResponse(io.odeeo.internal.y1.b<R> bVar, r<R> rVar) {
                this.f67564a.complete(rVar);
            }
        }

        public b(Type type) {
            this.f67561a = type;
        }

        @Override // io.odeeo.internal.y1.c
        public Type responseType() {
            return this.f67561a;
        }

        @Override // io.odeeo.internal.y1.c
        public CompletableFuture<r<R>> adapt(io.odeeo.internal.y1.b<R> bVar) {
            a aVar = new a(bVar);
            bVar.enqueue(new C0691b(aVar));
            return aVar;
        }
    }

    @Override // io.odeeo.internal.y1.c.a
    public c<?, ?> get(Type type, Annotation[] annotationArr, s sVar) {
        if (c.a.a(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeA = c.a.a(0, (ParameterizedType) type);
        if (c.a.a(typeA) != r.class) {
            return new a(typeA);
        }
        if (typeA instanceof ParameterizedType) {
            return new b(c.a.a(0, (ParameterizedType) typeA));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
