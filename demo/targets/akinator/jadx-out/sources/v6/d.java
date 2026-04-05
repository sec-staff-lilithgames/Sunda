package v6;

import androidx.lifecycle.c3;
import java.util.List;
import kotlin.reflect.KClass;
import o5.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: c, reason: collision with root package name */
    public static final a f89097c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final y0 f89098a;

    /* renamed from: b, reason: collision with root package name */
    public final c f89099b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final List<KClass<?>> getRequiredConverters() {
            return uu.p0.emptyList();
        }
    }

    public d(y0 __db) {
        kotlin.jvm.internal.e0.checkNotNullParameter(__db, "__db");
        this.f89098a = __db;
        this.f89099b = new c();
    }

    @Override // v6.b
    public List<String> getDependentWorkIds(String id2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        return (List) u5.c.performBlocking(this.f89098a, true, false, new ba.d(id2, 12));
    }

    @Override // v6.b
    public List<String> getPrerequisites(String id2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        return (List) u5.c.performBlocking(this.f89098a, true, false, new ba.d(id2, 15));
    }

    @Override // v6.b
    public boolean hasCompletedAllPrerequisites(String id2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        return ((Boolean) u5.c.performBlocking(this.f89098a, true, false, new ba.d(id2, 14))).booleanValue();
    }

    @Override // v6.b
    public boolean hasDependents(String id2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        return ((Boolean) u5.c.performBlocking(this.f89098a, true, false, new ba.d(id2, 13))).booleanValue();
    }

    @Override // v6.b
    public void insertDependency(v6.a dependency) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dependency, "dependency");
        u5.c.performBlocking(this.f89098a, false, true, new c3(22, this, dependency));
    }
}
