package o4;

import java.util.List;
import k4.c1;
import k4.r2;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f77483a = new i();

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ k4.n create$default(i iVar, r2 r2Var, l4.b bVar, List list, CoroutineScope coroutineScope, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            list = p0.emptyList();
        }
        if ((i10 & 8) != 0) {
            coroutineScope = CoroutineScopeKt.CoroutineScope(a.ioDispatcher().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        }
        return iVar.create(r2Var, bVar, (List<? extends k4.h>) list, coroutineScope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ k4.n createWithPath$default(i iVar, l4.b bVar, List list, CoroutineScope coroutineScope, kv.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = null;
        }
        if ((i10 & 2) != 0) {
            list = p0.emptyList();
        }
        if ((i10 & 4) != 0) {
            coroutineScope = CoroutineScopeKt.CoroutineScope(a.ioDispatcher().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        }
        return iVar.createWithPath(bVar, list, coroutineScope, aVar);
    }

    public final k4.n create(r2 storage) {
        e0.checkNotNullParameter(storage, "storage");
        return create$default(this, storage, (l4.b) null, (List) null, (CoroutineScope) null, 14, (Object) null);
    }

    public final k4.n createWithPath(kv.a produceFile) {
        e0.checkNotNullParameter(produceFile, "produceFile");
        return createWithPath$default(this, null, null, null, produceFile, 7, null);
    }

    public final k4.n create(r2 storage, l4.b bVar) {
        e0.checkNotNullParameter(storage, "storage");
        return create$default(this, storage, bVar, (List) null, (CoroutineScope) null, 12, (Object) null);
    }

    public final k4.n createWithPath(l4.b bVar, List<? extends k4.h> migrations, kv.a produceFile) {
        e0.checkNotNullParameter(migrations, "migrations");
        e0.checkNotNullParameter(produceFile, "produceFile");
        return createWithPath$default(this, bVar, migrations, null, produceFile, 4, null);
    }

    public final k4.n create(r2 storage, l4.b bVar, List<? extends k4.h> migrations) {
        e0.checkNotNullParameter(storage, "storage");
        e0.checkNotNullParameter(migrations, "migrations");
        return create$default(this, storage, bVar, migrations, (CoroutineScope) null, 8, (Object) null);
    }

    public final k4.n createWithPath(l4.b bVar, kv.a produceFile) {
        e0.checkNotNullParameter(produceFile, "produceFile");
        return createWithPath$default(this, bVar, null, null, produceFile, 6, null);
    }

    public final k4.n create(kv.a produceFile) {
        e0.checkNotNullParameter(produceFile, "produceFile");
        return create$default(this, (l4.b) null, (List) null, (CoroutineScope) null, produceFile, 7, (Object) null);
    }

    public final k4.n createWithPath(l4.b bVar, List<? extends k4.h> migrations, CoroutineScope scope, kv.a produceFile) {
        e0.checkNotNullParameter(migrations, "migrations");
        e0.checkNotNullParameter(scope, "scope");
        e0.checkNotNullParameter(produceFile, "produceFile");
        return create(bVar, migrations, scope, new h(produceFile));
    }

    public final k4.n create(l4.b bVar, List<? extends k4.h> migrations, kv.a produceFile) {
        e0.checkNotNullParameter(migrations, "migrations");
        e0.checkNotNullParameter(produceFile, "produceFile");
        return create$default(this, bVar, migrations, (CoroutineScope) null, produceFile, 4, (Object) null);
    }

    public final k4.n create(l4.b bVar, kv.a produceFile) {
        e0.checkNotNullParameter(produceFile, "produceFile");
        return create$default(this, bVar, (List) null, (CoroutineScope) null, produceFile, 6, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ k4.n create$default(i iVar, l4.b bVar, List list, CoroutineScope coroutineScope, kv.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = null;
        }
        if ((i10 & 2) != 0) {
            list = p0.emptyList();
        }
        if ((i10 & 4) != 0) {
            coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        }
        return iVar.create(bVar, (List<? extends k4.h>) list, coroutineScope, aVar);
    }

    public final k4.n create(l4.b bVar, List<? extends k4.h> migrations, CoroutineScope scope, kv.a produceFile) {
        e0.checkNotNullParameter(migrations, "migrations");
        e0.checkNotNullParameter(scope, "scope");
        e0.checkNotNullParameter(produceFile, "produceFile");
        return new f(create(new c1(m.f77487a, null, new g(produceFile), 2, null), bVar, migrations, scope));
    }

    public final k4.n create(r2 storage, l4.b bVar, List<? extends k4.h> migrations, CoroutineScope scope) {
        e0.checkNotNullParameter(storage, "storage");
        e0.checkNotNullParameter(migrations, "migrations");
        e0.checkNotNullParameter(scope, "scope");
        return new f(k4.o.f70432a.create(storage, bVar, migrations, scope));
    }
}
