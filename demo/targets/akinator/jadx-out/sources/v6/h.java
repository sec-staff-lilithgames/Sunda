package v6;

import androidx.lifecycle.c3;
import androidx.lifecycle.l1;
import java.util.List;
import kotlin.reflect.KClass;
import o5.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final a f89122c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final y0 f89123a;

    /* renamed from: b, reason: collision with root package name */
    public final g f89124b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final List<KClass<?>> getRequiredConverters() {
            return uu.p0.emptyList();
        }
    }

    public h(y0 __db) {
        kotlin.jvm.internal.e0.checkNotNullParameter(__db, "__db");
        this.f89123a = __db;
        this.f89124b = new g();
    }

    @Override // v6.f
    public Long getLongValue(String key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        return (Long) u5.c.performBlocking(this.f89123a, true, false, new ba.d(key, 17));
    }

    @Override // v6.f
    public l1 getObservableLongValue(String key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        return this.f89123a.getInvalidationTracker().createLiveData(new String[]{"Preference"}, false, (kv.l) new ba.d(key, 16));
    }

    @Override // v6.f
    public void insertPreference(e preference) {
        kotlin.jvm.internal.e0.checkNotNullParameter(preference, "preference");
        u5.c.performBlocking(this.f89123a, false, true, new c3(23, this, preference));
    }
}
