package v6;

import androidx.lifecycle.c3;
import java.util.List;
import kotlin.reflect.KClass;
import o5.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q implements o {

    /* renamed from: c, reason: collision with root package name */
    public static final a f89151c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final y0 f89152a;

    /* renamed from: b, reason: collision with root package name */
    public final p f89153b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final List<KClass<?>> getRequiredConverters() {
            return uu.p0.emptyList();
        }
    }

    public q(y0 __db) {
        kotlin.jvm.internal.e0.checkNotNullParameter(__db, "__db");
        this.f89152a = __db;
        this.f89153b = new p();
    }

    @Override // v6.o
    public /* bridge */ /* synthetic */ n getSystemIdInfo(s sVar) {
        return super.getSystemIdInfo(sVar);
    }

    @Override // v6.o
    public List<String> getWorkSpecIds() {
        return (List) u5.c.performBlocking(this.f89152a, true, false, new t5.s(8));
    }

    @Override // v6.o
    public void insertSystemIdInfo(n systemIdInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(systemIdInfo, "systemIdInfo");
        u5.c.performBlocking(this.f89152a, false, true, new c3(24, this, systemIdInfo));
    }

    @Override // v6.o
    public /* bridge */ /* synthetic */ void removeSystemIdInfo(s sVar) {
        super.removeSystemIdInfo(sVar);
    }

    @Override // v6.o
    public n getSystemIdInfo(String workSpecId, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workSpecId, "workSpecId");
        return (n) u5.c.performBlocking(this.f89152a, true, false, new ba.f(workSpecId, i10, 2));
    }

    @Override // v6.o
    public void removeSystemIdInfo(String workSpecId, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workSpecId, "workSpecId");
        u5.c.performBlocking(this.f89152a, false, true, new ba.f(workSpecId, i10, 1));
    }

    @Override // v6.o
    public void removeSystemIdInfo(String workSpecId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workSpecId, "workSpecId");
        u5.c.performBlocking(this.f89152a, false, true, new ba.d(workSpecId, 18));
    }
}
