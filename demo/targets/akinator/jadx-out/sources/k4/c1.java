package k4;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c1 implements r2 {

    /* renamed from: d, reason: collision with root package name */
    public static final a f70295d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final LinkedHashSet f70296e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f70297f = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final h2 f70298a;

    /* renamed from: b, reason: collision with root package name */
    public final kv.l f70299b;

    /* renamed from: c, reason: collision with root package name */
    public final kv.a f70300c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final Set<String> getActiveFiles$datastore_core_release() {
            return c1.f70296e;
        }

        public final Object getActiveFilesLock$datastore_core_release() {
            return c1.f70297f;
        }
    }

    public c1(h2 serializer, kv.l coordinatorProducer, kv.a produceFile) {
        kotlin.jvm.internal.e0.checkNotNullParameter(serializer, "serializer");
        kotlin.jvm.internal.e0.checkNotNullParameter(coordinatorProducer, "coordinatorProducer");
        kotlin.jvm.internal.e0.checkNotNullParameter(produceFile, "produceFile");
        this.f70298a = serializer;
        this.f70299b = coordinatorProducer;
        this.f70300c = produceFile;
    }

    @Override // k4.r2
    public s2 createConnection() throws IOException {
        File file = ((File) this.f70300c.invoke()).getCanonicalFile();
        synchronized (f70297f) {
            String path = file.getAbsolutePath();
            LinkedHashSet linkedHashSet = f70296e;
            if (linkedHashSet.contains(path)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(path, "path");
            linkedHashSet.add(path);
        }
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(file, "file");
        return new g1(file, this.f70298a, (l1) this.f70299b.invoke(file), new d1(file));
    }

    public /* synthetic */ c1(h2 h2Var, kv.l lVar, kv.a aVar, int i10, kotlin.jvm.internal.u uVar) {
        this(h2Var, (i10 & 2) != 0 ? b1.f70283e : lVar, aVar);
    }
}
