package xv;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final cw.w f93816a;

    public r(cw.w delegate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(delegate, "delegate");
        this.f93816a = delegate;
    }

    public final int connectionCount() {
        return this.f93816a.connectionCount();
    }

    public final void evictAll() throws IOException {
        this.f93816a.evictAll();
    }

    public final cw.g getConnectionListener$okhttp() {
        return this.f93816a.getConnectionListener$okhttp();
    }

    public final cw.w getDelegate$okhttp() {
        return this.f93816a;
    }

    public final int idleConnectionCount() {
        return this.f93816a.idleConnectionCount();
    }

    public /* synthetic */ r(int i10, long j10, TimeUnit timeUnit, bw.g gVar, cw.g gVar2, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11, cw.c0 c0Var, int i16, kotlin.jvm.internal.u uVar) {
        this((i16 & 1) != 0 ? 5 : i10, (i16 & 2) != 0 ? 5L : j10, (i16 & 4) != 0 ? TimeUnit.MINUTES : timeUnit, (i16 & 8) != 0 ? bw.g.f11363l : gVar, (i16 & 16) != 0 ? cw.g.f51143a.getNONE() : gVar2, (i16 & 32) != 0 ? 10000 : i11, (i16 & 64) != 0 ? 10000 : i12, (i16 & 128) != 0 ? 10000 : i13, (i16 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 10000 : i14, (i16 & 512) == 0 ? i15 : 10000, (i16 & 1024) != 0 ? true : z10, (i16 & 2048) == 0 ? z11 : true, (i16 & 4096) != 0 ? new cw.c0() : c0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(int i10, long j10, TimeUnit timeUnit, final bw.g taskRunner, cw.g connectionListener, final int i11, final int i12, final int i13, final int i14, final int i15, final boolean z10, final boolean z11, final cw.c0 routeDatabase) {
        this(new cw.w(taskRunner, i10, j10, timeUnit, connectionListener, new kv.q() { // from class: xv.q
            @Override // kv.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                cw.w pool = (cw.w) obj;
                a address = (a) obj2;
                cw.h user = (cw.h) obj3;
                kotlin.jvm.internal.e0.checkNotNullParameter(pool, "pool");
                kotlin.jvm.internal.e0.checkNotNullParameter(address, "address");
                kotlin.jvm.internal.e0.checkNotNullParameter(user, "user");
                bw.g gVar = taskRunner;
                return new cw.m(new cw.n(new cw.z(gVar, pool, i11, i12, i13, i14, i15, z10, z11, address, routeDatabase, user)), gVar);
            }
        }));
        kotlin.jvm.internal.e0.checkNotNullParameter(timeUnit, "timeUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(taskRunner, "taskRunner");
        kotlin.jvm.internal.e0.checkNotNullParameter(connectionListener, "connectionListener");
        kotlin.jvm.internal.e0.checkNotNullParameter(routeDatabase, "routeDatabase");
    }

    public /* synthetic */ r(int i10, long j10, TimeUnit timeUnit, cw.g gVar, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 5 : i10, (i11 & 2) != 0 ? 5L : j10, (i11 & 4) != 0 ? TimeUnit.MINUTES : timeUnit, (i11 & 8) != 0 ? cw.g.f51143a.getNONE() : gVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(int i10, long j10, TimeUnit timeUnit, cw.g connectionListener) {
        this(i10, j10, timeUnit, bw.g.f11363l, connectionListener, 0, 0, 0, 0, 0, false, false, null, 8160, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(timeUnit, "timeUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(connectionListener, "connectionListener");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(int i10, long j10, TimeUnit timeUnit) {
        this(i10, j10, timeUnit, bw.g.f11363l, cw.g.f51143a.getNONE(), 0, 0, 0, 0, 0, false, false, null, 8160, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(timeUnit, "timeUnit");
    }

    public r() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
