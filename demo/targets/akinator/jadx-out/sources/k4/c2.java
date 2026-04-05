package k4;

import android.os.FileObserver;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c2 extends FileObserver {

    /* renamed from: c, reason: collision with root package name */
    public static final a f70301c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final Object f70302d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final LinkedHashMap f70303e = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f70304a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f70305b;

    public c2(String str, kotlin.jvm.internal.u uVar) {
        super(str, 128);
        this.f70304a = str;
        this.f70305b = new CopyOnWriteArrayList();
    }

    public final String getPath() {
        return this.f70304a;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i10, String str) {
        Iterator it = this.f70305b.iterator();
        while (it.hasNext()) {
            ((kv.l) it.next()).invoke(str);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public static final DisposableHandle access$observe(a aVar, File file, kv.l lVar) {
            aVar.getClass();
            String key = file.getCanonicalFile().getPath();
            synchronized (c2.f70302d) {
                try {
                    Map<String, c2> fileObservers$datastore_core_release = c2.f70301c.getFileObservers$datastore_core_release();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(key, "key");
                    c2 c2Var = fileObservers$datastore_core_release.get(key);
                    if (c2Var == null) {
                        c2Var = new c2(key, null);
                        fileObservers$datastore_core_release.put(key, c2Var);
                    }
                    c2 c2Var2 = c2Var;
                    c2Var2.f70305b.add(lVar);
                    if (c2Var2.f70305b.size() == 1) {
                        c2Var2.startWatching();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return new y1(0, key, lVar);
        }

        public final Map<String, c2> getFileObservers$datastore_core_release() {
            return c2.f70303e;
        }

        public final Flow<tu.x0> observe(File file) {
            kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
            return FlowKt.channelFlow(new b2(file, null));
        }

        public final void removeAllObservers$datastore_core_release() {
            synchronized (c2.f70302d) {
                try {
                    Iterator<T> it = c2.f70301c.getFileObservers$datastore_core_release().values().iterator();
                    while (it.hasNext()) {
                        ((c2) it.next()).stopWatching();
                    }
                    c2.f70301c.getFileObservers$datastore_core_release().clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public static /* synthetic */ void getFileObservers$datastore_core_release$annotations() {
        }
    }
}
