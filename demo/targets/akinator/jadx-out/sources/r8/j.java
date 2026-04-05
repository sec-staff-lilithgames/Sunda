package r8;

import android.util.Log;
import androidx.datastore.preferences.protobuf.i3;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j implements c {

    /* renamed from: f, reason: collision with root package name */
    public static j f84020f;

    /* renamed from: b, reason: collision with root package name */
    public final File f84022b;

    /* renamed from: c, reason: collision with root package name */
    public final long f84023c;

    /* renamed from: e, reason: collision with root package name */
    public l8.f f84025e;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.localbroadcastmanager.content.b f84024d = new androidx.localbroadcastmanager.content.b(14);

    /* renamed from: a, reason: collision with root package name */
    public final v f84021a = new v();

    public j(File file, long j10) {
        this.f84022b = file;
        this.f84023c = j10;
    }

    public static c create(File file, long j10) {
        return new j(file, j10);
    }

    @Deprecated
    public static synchronized c get(File file, long j10) {
        try {
            if (f84020f == null) {
                f84020f = new j(file, j10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f84020f;
    }

    public final synchronized l8.f a() {
        try {
            if (this.f84025e == null) {
                this.f84025e = l8.f.open(this.f84022b, 1, 1, this.f84023c);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f84025e;
    }

    @Override // r8.c
    public synchronized void clear() {
        try {
            try {
                a().delete();
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e10);
                }
                synchronized (this) {
                    this.f84025e = null;
                }
            }
            synchronized (this) {
                this.f84025e = null;
            }
        } catch (Throwable th2) {
            synchronized (this) {
                this.f84025e = null;
                throw th2;
            }
        }
    }

    @Override // r8.c
    public void delete(n8.q qVar) {
        try {
            a().remove(this.f84021a.getSafeKey(qVar));
        } catch (IOException e10) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to delete from disk cache", e10);
            }
        }
    }

    @Override // r8.c
    public void put(n8.q qVar, b bVar) {
        e eVar;
        String safeKey = this.f84021a.getSafeKey(qVar);
        androidx.localbroadcastmanager.content.b bVar2 = this.f84024d;
        synchronized (bVar2) {
            eVar = (e) ((HashMap) bVar2.f6756a).get(safeKey);
            if (eVar == null) {
                i3 i3Var = (i3) bVar2.f6757b;
                synchronized (i3Var.f5906a) {
                    eVar = (e) i3Var.f5906a.poll();
                }
                if (eVar == null) {
                    eVar = new e();
                }
                ((HashMap) bVar2.f6756a).put(safeKey, eVar);
            }
            eVar.f84014b++;
        }
        eVar.f84013a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + safeKey + " for for Key: " + qVar);
            }
            try {
                l8.f fVarA = a();
                if (fVarA.get(safeKey) == null) {
                    l8.c cVarEdit = fVarA.edit(safeKey);
                    if (cVarEdit == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + safeKey);
                    }
                    try {
                        if (((p8.i) bVar).write(cVarEdit.getFile(0))) {
                            cVarEdit.commit();
                        }
                        cVarEdit.abortUnlessCommitted();
                    } catch (Throwable th2) {
                        cVarEdit.abortUnlessCommitted();
                        throw th2;
                    }
                }
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            }
        } finally {
            this.f84024d.e(safeKey);
        }
    }

    @Override // r8.c
    public File get(n8.q qVar) throws Throwable {
        String safeKey = this.f84021a.getSafeKey(qVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + safeKey + " for for Key: " + qVar);
        }
        try {
            l8.e eVar = a().get(safeKey);
            if (eVar != null) {
                return eVar.getFile(0);
            }
            return null;
        } catch (IOException e10) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
            return null;
        }
    }
}
