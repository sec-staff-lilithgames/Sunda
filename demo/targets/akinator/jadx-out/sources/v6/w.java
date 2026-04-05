package v6;

import androidx.lifecycle.c3;
import java.util.List;
import kotlin.reflect.KClass;
import o5.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w implements u {

    /* renamed from: c, reason: collision with root package name */
    public static final a f89161c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final y0 f89162a;

    /* renamed from: b, reason: collision with root package name */
    public final v f89163b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final List<KClass<?>> getRequiredConverters() {
            return uu.p0.emptyList();
        }
    }

    public w(y0 __db) {
        kotlin.jvm.internal.e0.checkNotNullParameter(__db, "__db");
        this.f89162a = __db;
        this.f89163b = new v();
    }

    @Override // v6.u
    public List<String> getNamesForWorkSpecId(String workSpecId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workSpecId, "workSpecId");
        return (List) u5.c.performBlocking(this.f89162a, true, false, new ba.d(workSpecId, 20));
    }

    @Override // v6.u
    public List<String> getWorkSpecIdsWithName(String name) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        return (List) u5.c.performBlocking(this.f89162a, true, false, new ba.d(name, 19));
    }

    @Override // v6.u
    public void insert(t workName) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workName, "workName");
        u5.c.performBlocking(this.f89162a, false, true, new c3(25, this, workName));
    }
}
