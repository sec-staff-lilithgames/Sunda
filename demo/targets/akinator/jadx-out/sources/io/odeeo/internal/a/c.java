package io.odeeo.internal.a;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class c<V, E> {

    /* renamed from: a, reason: collision with root package name */
    public static final a f62203a = new a(null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a() {
        }

        @f
        public final <V> c<V, Exception> of(kv.a function) {
            e0.checkNotNullParameter(function, "function");
            try {
                return new b(function.invoke());
            } catch (Exception e10) {
                return new io.odeeo.internal.a.a(e10);
            }
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    public c() {
    }

    public abstract V component1();

    public abstract E component2();

    public /* synthetic */ c(u uVar) {
        this();
    }
}
