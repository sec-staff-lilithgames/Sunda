package io.odeeo.internal.y1;

import com.moloco.sdk.BKC.JzVV;
import io.odeeo.internal.y1.c;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import xv.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g extends c.a {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f67566a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements c<Object, io.odeeo.internal.y1.b<?>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f67567a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Executor f67568b;

        public a(Type type, Executor executor) {
            this.f67567a = type;
            this.f67568b = executor;
        }

        @Override // io.odeeo.internal.y1.c
        public Type responseType() {
            return this.f67567a;
        }

        @Override // io.odeeo.internal.y1.c
        /* renamed from: adapt, reason: merged with bridge method [inline-methods] */
        public io.odeeo.internal.y1.b<?> adapt2(io.odeeo.internal.y1.b<Object> bVar) {
            Executor executor = this.f67568b;
            return executor == null ? bVar : new b(executor, bVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b<T> implements io.odeeo.internal.y1.b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Executor f67570a;

        /* renamed from: b, reason: collision with root package name */
        public final io.odeeo.internal.y1.b<T> f67571b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements d<T> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f67572a;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: io.odeeo.internal.y1.g$b$a$a, reason: collision with other inner class name */
            public class RunnableC0692a implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ r f67574a;

                public RunnableC0692a(r rVar) {
                    this.f67574a = rVar;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (b.this.f67571b.isCanceled()) {
                        a aVar = a.this;
                        aVar.f67572a.onFailure(b.this, new IOException("Canceled"));
                    } else {
                        a aVar2 = a.this;
                        aVar2.f67572a.onResponse(b.this, this.f67574a);
                    }
                }
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: io.odeeo.internal.y1.g$b$a$b, reason: collision with other inner class name */
            public class RunnableC0693b implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Throwable f67576a;

                public RunnableC0693b(Throwable th2) {
                    this.f67576a = th2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a aVar = a.this;
                    aVar.f67572a.onFailure(b.this, this.f67576a);
                }
            }

            public a(d dVar) {
                this.f67572a = dVar;
            }

            @Override // io.odeeo.internal.y1.d
            public void onFailure(io.odeeo.internal.y1.b<T> bVar, Throwable th2) {
                b.this.f67570a.execute(new RunnableC0693b(th2));
            }

            @Override // io.odeeo.internal.y1.d
            public void onResponse(io.odeeo.internal.y1.b<T> bVar, r<T> rVar) {
                b.this.f67570a.execute(new RunnableC0692a(rVar));
            }
        }

        public b(Executor executor, io.odeeo.internal.y1.b<T> bVar) {
            this.f67570a = executor;
            this.f67571b = bVar;
        }

        @Override // io.odeeo.internal.y1.b
        public void cancel() {
            this.f67571b.cancel();
        }

        @Override // io.odeeo.internal.y1.b
        public r<T> execute() throws IOException {
            return this.f67571b.execute();
        }

        @Override // io.odeeo.internal.y1.b
        public boolean isCanceled() {
            return this.f67571b.isCanceled();
        }

        @Override // io.odeeo.internal.y1.b
        public boolean isExecuted() {
            return this.f67571b.isExecuted();
        }

        @Override // io.odeeo.internal.y1.b
        public o0 request() {
            return this.f67571b.request();
        }

        @Override // io.odeeo.internal.y1.b
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public io.odeeo.internal.y1.b<T> m4615clone() {
            return new b(this.f67570a, this.f67571b.m4615clone());
        }

        @Override // io.odeeo.internal.y1.b
        public void enqueue(d<T> dVar) {
            w.a(dVar, JzVV.rKNgHbgq);
            this.f67571b.enqueue(new a(dVar));
        }
    }

    public g(Executor executor) {
        this.f67566a = executor;
    }

    @Override // io.odeeo.internal.y1.c.a
    public c<?, ?> get(Type type, Annotation[] annotationArr, s sVar) {
        if (c.a.a(type) != io.odeeo.internal.y1.b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(w.b(0, (ParameterizedType) type), w.a(annotationArr, (Class<? extends Annotation>) u.class) ? null : this.f67566a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
