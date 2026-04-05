package com.google.firebase;

import bi.b0;
import bi.q;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements bi.i {

        /* renamed from: a, reason: collision with root package name */
        public static final a f29653a = new a();

        @Override // bi.i
        public final CoroutineDispatcher create(bi.d dVar) {
            Object obj = dVar.get(b0.qualified(ai.a.class, Executor.class));
            e0.checkNotNullExpressionValue(obj, "get(...)");
            return ExecutorsKt.from((Executor) obj);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements bi.i {

        /* renamed from: a, reason: collision with root package name */
        public static final b f29654a = new b();

        @Override // bi.i
        public final CoroutineDispatcher create(bi.d dVar) {
            Object obj = dVar.get(b0.qualified(ai.c.class, Executor.class));
            e0.checkNotNullExpressionValue(obj, "get(...)");
            return ExecutorsKt.from((Executor) obj);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements bi.i {

        /* renamed from: a, reason: collision with root package name */
        public static final c f29655a = new c();

        @Override // bi.i
        public final CoroutineDispatcher create(bi.d dVar) {
            Object obj = dVar.get(b0.qualified(ai.b.class, Executor.class));
            e0.checkNotNullExpressionValue(obj, "get(...)");
            return ExecutorsKt.from((Executor) obj);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d implements bi.i {

        /* renamed from: a, reason: collision with root package name */
        public static final d f29656a = new d();

        @Override // bi.i
        public final CoroutineDispatcher create(bi.d dVar) {
            Object obj = dVar.get(b0.qualified(ai.d.class, Executor.class));
            e0.checkNotNullExpressionValue(obj, "get(...)");
            return ExecutorsKt.from((Executor) obj);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<bi.c> getComponents() {
        bi.c cVarBuild = bi.c.builder(b0.qualified(ai.a.class, CoroutineDispatcher.class)).add(q.required(b0.qualified(ai.a.class, Executor.class))).factory(a.f29653a).build();
        e0.checkNotNullExpressionValue(cVarBuild, "build(...)");
        bi.c cVarBuild2 = bi.c.builder(b0.qualified(ai.c.class, CoroutineDispatcher.class)).add(q.required(b0.qualified(ai.c.class, Executor.class))).factory(b.f29654a).build();
        e0.checkNotNullExpressionValue(cVarBuild2, "build(...)");
        bi.c cVarBuild3 = bi.c.builder(b0.qualified(ai.b.class, CoroutineDispatcher.class)).add(q.required(b0.qualified(ai.b.class, Executor.class))).factory(c.f29655a).build();
        e0.checkNotNullExpressionValue(cVarBuild3, "build(...)");
        bi.c cVarBuild4 = bi.c.builder(b0.qualified(ai.d.class, CoroutineDispatcher.class)).add(q.required(b0.qualified(ai.d.class, Executor.class))).factory(d.f29656a).build();
        e0.checkNotNullExpressionValue(cVarBuild4, "build(...)");
        return p0.listOf((Object[]) new bi.c[]{cVarBuild, cVarBuild2, cVarBuild3, cVarBuild4});
    }
}
