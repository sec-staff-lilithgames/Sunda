package n4;

import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b {
    public static final nv.b preferencesDataStore(String name, l4.b bVar, kv.l produceMigrations, CoroutineScope scope) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(produceMigrations, "produceMigrations");
        e0.checkNotNullParameter(scope, "scope");
        return new e(name, bVar, produceMigrations, scope);
    }

    public static /* synthetic */ nv.b preferencesDataStore$default(String str, l4.b bVar, kv.l lVar, CoroutineScope coroutineScope, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            lVar = a.f75607e;
        }
        if ((i10 & 8) != 0) {
            coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        }
        return preferencesDataStore(str, bVar, lVar, coroutineScope);
    }
}
