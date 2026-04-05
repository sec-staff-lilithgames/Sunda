package v6;

import androidx.lifecycle.c3;
import java.util.List;
import kotlin.reflect.KClass;
import o5.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a0 implements y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f89049c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final y0 f89050a;

    /* renamed from: b, reason: collision with root package name */
    public final z f89051b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final List<KClass<?>> getRequiredConverters() {
            return uu.p0.emptyList();
        }
    }

    public a0(y0 __db) {
        kotlin.jvm.internal.e0.checkNotNullParameter(__db, "__db");
        this.f89050a = __db;
        this.f89051b = new z();
    }

    @Override // v6.y
    public void delete(String workSpecId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workSpecId, "workSpecId");
        u5.c.performBlocking(this.f89050a, false, true, new ba.d(workSpecId, 22));
    }

    @Override // v6.y
    public void deleteAll() {
        u5.c.performBlocking(this.f89050a, false, true, new t5.s(9));
    }

    @Override // v6.y
    public androidx.work.b getProgressForWorkSpecId(String workSpecId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workSpecId, "workSpecId");
        return (androidx.work.b) u5.c.performBlocking(this.f89050a, true, false, new ba.d(workSpecId, 21));
    }

    @Override // v6.y
    public void insert(x progress) {
        kotlin.jvm.internal.e0.checkNotNullParameter(progress, "progress");
        u5.c.performBlocking(this.f89050a, false, true, new c3(26, this, progress));
    }
}
