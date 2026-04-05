package ri;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.util.Map;
import k4.n;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kv.l;
import n4.t;
import o4.j;
import o4.k;
import uu.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f84426e = {c1.property2(new u0(i.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public final Context f84427a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84428b;

    /* renamed from: c, reason: collision with root package name */
    public final ThreadLocal f84429c;

    /* renamed from: d, reason: collision with root package name */
    public final n f84430d;

    public i(Context context, String name) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(name, "name");
        this.f84427a = context;
        this.f84428b = name;
        this.f84429c = new ThreadLocal();
        final int i10 = 0;
        final int i11 = 1;
        this.f84430d = (n) n4.b.preferencesDataStore$default(name, new l4.b(new l(this) { // from class: ri.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i f84404c;

            {
                this.f84404c = this;
            }

            @Override // kv.l
            public final Object invoke(Object obj) {
                int i12 = i10;
                i iVar = this.f84404c;
                switch (i12) {
                    case 0:
                        k4.e ex2 = (k4.e) obj;
                        KProperty[] kPropertyArr = i.f84426e;
                        e0.checkNotNullParameter(ex2, "ex");
                        Log.w(c1.getOrCreateKotlinClass(i.class).getSimpleName(), "CorruptionException in " + iVar.f84428b + " DataStore running in process " + Process.myPid(), ex2);
                        return k.createEmpty();
                    default:
                        Context it = (Context) obj;
                        KProperty[] kPropertyArr2 = i.f84426e;
                        e0.checkNotNullParameter(it, "it");
                        return o0.listOf(t.SharedPreferencesMigration$default(it, iVar.f84428b, null, 4, null));
                }
            }
        }), new l(this) { // from class: ri.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i f84404c;

            {
                this.f84404c = this;
            }

            @Override // kv.l
            public final Object invoke(Object obj) {
                int i12 = i11;
                i iVar = this.f84404c;
                switch (i12) {
                    case 0:
                        k4.e ex2 = (k4.e) obj;
                        KProperty[] kPropertyArr = i.f84426e;
                        e0.checkNotNullParameter(ex2, "ex");
                        Log.w(c1.getOrCreateKotlinClass(i.class).getSimpleName(), "CorruptionException in " + iVar.f84428b + " DataStore running in process " + Process.myPid(), ex2);
                        return k.createEmpty();
                    default:
                        Context it = (Context) obj;
                        KProperty[] kPropertyArr2 = i.f84426e;
                        e0.checkNotNullParameter(it, "it");
                        return o0.listOf(t.SharedPreferencesMigration$default(it, iVar.f84428b, null, 4, null));
                }
            }
        }, null, 8, null).getValue(context, f84426e[0]);
    }

    public final <T> boolean contains(j.a key) {
        e0.checkNotNullParameter(key, "key");
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new b(this, key, null), 1, null)).booleanValue();
    }

    public final o4.j editSync(l transform) {
        e0.checkNotNullParameter(transform, "transform");
        return (o4.j) BuildersKt__BuildersKt.runBlocking$default(null, new d(this, transform, null), 1, null);
    }

    public final Map<j.a, Object> getAllSync() {
        return (Map) BuildersKt__BuildersKt.runBlocking$default(null, new e(this, null), 1, null);
    }

    public final Context getContext() {
        return this.f84427a;
    }

    public final String getName() {
        return this.f84428b;
    }

    public final <T> T getSync(j.a key, T t10) {
        e0.checkNotNullParameter(key, "key");
        return (T) BuildersKt__BuildersKt.runBlocking$default(null, new f(this, key, t10, null), 1, null);
    }

    public final <T> o4.j putSync(j.a key, T t10) {
        e0.checkNotNullParameter(key, "key");
        return (o4.j) BuildersKt__BuildersKt.runBlocking$default(null, new h(this, key, t10, null), 1, null);
    }
}
