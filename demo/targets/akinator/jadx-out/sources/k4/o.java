package k4;

import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f70432a = new o();

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ n create$default(o oVar, r2 r2Var, l4.b bVar, List list, CoroutineScope coroutineScope, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            list = uu.p0.emptyList();
        }
        if ((i10 & 8) != 0) {
            coroutineScope = CoroutineScopeKt.CoroutineScope(a.ioDispatcher().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        }
        return oVar.create(r2Var, bVar, (List<? extends h>) list, coroutineScope);
    }

    public final <T> n create(h2 serializer, kv.a produceFile) {
        kotlin.jvm.internal.e0.checkNotNullParameter(serializer, "serializer");
        kotlin.jvm.internal.e0.checkNotNullParameter(produceFile, "produceFile");
        return create$default(this, serializer, null, null, null, produceFile, 14, null);
    }

    public final <T> n create(h2 serializer, l4.b bVar, List<? extends h> migrations, kv.a produceFile) {
        kotlin.jvm.internal.e0.checkNotNullParameter(serializer, "serializer");
        kotlin.jvm.internal.e0.checkNotNullParameter(migrations, "migrations");
        kotlin.jvm.internal.e0.checkNotNullParameter(produceFile, "produceFile");
        return create$default(this, serializer, bVar, migrations, null, produceFile, 8, null);
    }

    public final <T> n create(h2 serializer, l4.b bVar, kv.a produceFile) {
        kotlin.jvm.internal.e0.checkNotNullParameter(serializer, "serializer");
        kotlin.jvm.internal.e0.checkNotNullParameter(produceFile, "produceFile");
        return create$default(this, serializer, bVar, null, null, produceFile, 12, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ n create$default(o oVar, h2 h2Var, l4.b bVar, List list, CoroutineScope coroutineScope, kv.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            list = uu.p0.emptyList();
        }
        if ((i10 & 8) != 0) {
            coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        }
        return oVar.create(h2Var, bVar, list, coroutineScope, aVar);
    }

    public final <T> n create(r2 storage) {
        kotlin.jvm.internal.e0.checkNotNullParameter(storage, "storage");
        return create$default(this, storage, null, null, null, 14, null);
    }

    public final <T> n create(r2 storage, l4.b bVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(storage, "storage");
        return create$default(this, storage, bVar, null, null, 12, null);
    }

    public final <T> n create(r2 storage, l4.b bVar, List<? extends h> migrations) {
        kotlin.jvm.internal.e0.checkNotNullParameter(storage, "storage");
        kotlin.jvm.internal.e0.checkNotNullParameter(migrations, "migrations");
        return create$default(this, storage, bVar, migrations, null, 8, null);
    }

    public final <T> n create(h2 serializer, l4.b bVar, List<? extends h> migrations, CoroutineScope scope, kv.a produceFile) {
        kotlin.jvm.internal.e0.checkNotNullParameter(serializer, "serializer");
        kotlin.jvm.internal.e0.checkNotNullParameter(migrations, "migrations");
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.e0.checkNotNullParameter(produceFile, "produceFile");
        return create(new c1(serializer, null, produceFile, 2, null), bVar, migrations, scope);
    }

    public final <T> n create(r2 storage, l4.b bVar, List<? extends h> migrations, CoroutineScope scope) {
        kotlin.jvm.internal.e0.checkNotNullParameter(storage, "storage");
        kotlin.jvm.internal.e0.checkNotNullParameter(migrations, "migrations");
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        f aVar = bVar;
        if (bVar == null) {
            aVar = new l4.a();
        }
        return new p(storage, uu.o0.listOf(m.f70413a.getInitializer(migrations)), aVar, scope);
    }
}
