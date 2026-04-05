package u5;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.File;
import java.io.IOException;
import o5.y0;

/* loaded from: classes.dex */
public abstract class c {
    @tu.f
    public static final CancellationSignal createCancellationSignal() {
        return h.createCancellationSignal();
    }

    public static final void dropFtsSyncTriggers(x5.b bVar) {
        d.dropFtsSyncTriggers(bVar);
    }

    public static final void foreignKeyCheck(x5.b bVar, String str) {
        d.foreignKeyCheck(bVar, str);
    }

    public static final Object getCoroutineContext(y0 y0Var, boolean z10, zu.d<? super zu.m> dVar) {
        return h.getCoroutineContext(y0Var, z10, dVar);
    }

    public static final <R> Object internalPerform(y0 y0Var, boolean z10, boolean z11, kv.p pVar, zu.d<? super R> dVar) {
        return d.internalPerform(y0Var, z10, z11, pVar, dVar);
    }

    public static final <R> R performBlocking(y0 y0Var, boolean z10, boolean z11, kv.l lVar) {
        return (R) h.performBlocking(y0Var, z10, z11, lVar);
    }

    public static final <R> Object performInTransactionSuspending(y0 y0Var, kv.l lVar, zu.d<? super R> dVar) {
        return h.performInTransactionSuspending(y0Var, lVar, dVar);
    }

    public static final <R> Object performSuspending(y0 y0Var, boolean z10, boolean z11, kv.l lVar, zu.d<? super R> dVar) {
        return h.performSuspending(y0Var, z10, z11, lVar, dVar);
    }

    @tu.f
    public static final Cursor query(y0 y0Var, y5.i iVar, boolean z10) {
        return h.query(y0Var, iVar, z10);
    }

    public static final int readVersion(File file) throws IOException {
        return h.readVersion(file);
    }

    public static final x5.b toSQLiteConnection(y5.c cVar) {
        return h.toSQLiteConnection(cVar);
    }

    @tu.f
    public static final void dropFtsSyncTriggers(y5.c cVar) {
        h.dropFtsSyncTriggers(cVar);
    }

    public static final void foreignKeyCheck(y5.c cVar, String str) {
        h.foreignKeyCheck(cVar, str);
    }

    public static final Cursor query(y0 y0Var, y5.i iVar, boolean z10, CancellationSignal cancellationSignal) {
        return h.query(y0Var, iVar, z10, cancellationSignal);
    }
}
