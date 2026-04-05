package androidx.lifecycle;

import android.content.Context;
import android.os.Parcel;
import aw.g;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.future.FutureKt;
import p0.n3;
import t5.r;
import v6.a0;
import v6.d;
import v6.h;
import v6.m0;
import v6.q;
import v6.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class c3 implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6533b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6534c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6535e;

    public /* synthetic */ c3(int i10, Object obj, Object obj2) {
        this.f6533b = i10;
        this.f6534c = obj;
        this.f6535e = obj2;
    }

    @Override // kv.l
    public final Object invoke(Object obj) throws Exception {
        x5.d dVarPrepare;
        boolean z10 = false;
        switch (this.f6533b) {
            case 0:
                ((r1) this.f6534c).setValue(((kv.l) this.f6535e).invoke(obj));
                return tu.x0.f87415a;
            case 1:
                r1 r1Var = (r1) this.f6534c;
                kotlin.jvm.internal.w0 w0Var = (kotlin.jvm.internal.w0) this.f6535e;
                Object value = r1Var.getValue();
                if (w0Var.f71863b || ((value == null && obj != null) || (value != null && !kotlin.jvm.internal.e0.areEqual(value, obj)))) {
                    w0Var.f71863b = false;
                    r1Var.setValue(obj);
                }
                return tu.x0.f87415a;
            case 2:
                ((r1) this.f6534c).setValue(((t.a) this.f6535e).apply(obj));
                return tu.x0.f87415a;
            case 3:
                aw.g gVar = (aw.g) this.f6534c;
                g.b bVar = (g.b) this.f6535e;
                IOException it = (IOException) obj;
                kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
                synchronized (gVar) {
                    bVar.detach$okhttp();
                }
                return tu.x0.f87415a;
            case 4:
                Parcel parcel = (Parcel) this.f6534c;
                ClassLoader classLoader = (ClassLoader) this.f6535e;
                ((Integer) obj).intValue();
                return parcel.readValue(classLoader);
            case 5:
                ((ba.k) this.f6534c).f9004d.insert((x5.b) obj, (ba.m) this.f6535e);
                return null;
            case 6:
                ((ba.k) this.f6534c).f9005e.insert((x5.b) obj, (ba.o) this.f6535e);
                return null;
            case 7:
                return com.moloco.sdk.internal.publisher.g.a((RewardedInterstitialAdShowListener) this.f6534c, (com.moloco.sdk.internal.publisher.g) this.f6535e, ((Boolean) obj).booleanValue());
            case 8:
                return h.a.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h) this.f6534c, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0) this.f6535e, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) obj);
            case 9:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.modifiers.a.a((a.c) this.f6534c, (kv.l) this.f6535e, (x1.d0) obj);
            case 10:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.i0.a((kv.l) this.f6535e, (p0.j2) this.f6534c, (a.c) obj);
            case 11:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.c.a((kv.p) this.f6534c, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a) this.f6535e, (Context) obj);
            case 12:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f) this.f6534c, (com.moloco.sdk.common_adapter_internal.d) this.f6535e, (List) obj);
            case 13:
                return HandlerContext.scheduleResumeAfterDelay$lambda$2((HandlerContext) this.f6534c, (im.k) this.f6535e, (Throwable) obj);
            case 14:
                return FutureKt.asCompletableFuture$lambda$1((CompletableFuture) this.f6534c, (Deferred) this.f6535e, (Throwable) obj);
            case 15:
                p0.y0 y0Var = (p0.y0) this.f6534c;
                z.v0 v0Var = (z.v0) this.f6535e;
                n3.a aVar = p0.n3.C;
                y0Var.recordWriteOf(obj);
                if (v0Var != null) {
                    v0Var.add(obj);
                }
                return tu.x0.f87415a;
            case 16:
                p0.n3 n3Var = (p0.n3) this.f6534c;
                Throwable th2 = (Throwable) this.f6535e;
                Throwable th3 = (Throwable) obj;
                synchronized (n3Var.f80350c) {
                    if (th2 != null) {
                        if (th3 != null) {
                            try {
                                th = th3 instanceof CancellationException ? null : th3;
                                if (th != null) {
                                    tu.h.addSuppressed(th2, th);
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                        th = th2;
                    }
                    n3Var.f80352e = th;
                    n3Var.f80370w.setValue(p0.o3.f80381b);
                }
                return tu.x0.f87415a;
            case 17:
                return ((q0.s0) this.f6534c).b(obj, (String) this.f6535e);
            case 18:
                Job.DefaultImpls.cancel$default((Job) this.f6534c, (CancellationException) null, 1, (Object) null);
                ((ProducerScope) this.f6535e).mo5139trySendJP2dKIU((r6.c) obj);
                return tu.x0.f87415a;
            case 19:
                kotlin.jvm.internal.w0 w0Var2 = (kotlin.jvm.internal.w0) this.f6534c;
                Object obj2 = this.f6535e;
                if (w0Var2.f71863b || !kotlin.jvm.internal.e0.areEqual(obj, obj2)) {
                    z10 = true;
                } else {
                    w0Var2.f71863b = true;
                }
                return Boolean.valueOf(z10);
            case 20:
                String str = (String) this.f6534c;
                Object[] objArr = (Object[]) this.f6535e;
                y5.c db2 = (y5.c) obj;
                kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
                db2.execSQL(str, objArr);
                return tu.x0.f87415a;
            case 21:
                r.b bVar2 = (r.b) this.f6534c;
                kv.l lVar = (kv.l) this.f6535e;
                y5.c db3 = (y5.c) obj;
                int i10 = r.b.f86363j;
                kotlin.jvm.internal.e0.checkNotNullParameter(db3, "db");
                y5.j jVarCompileStatement = db3.compileStatement(bVar2.f86364b);
                int length = bVar2.f86366e.length;
                for (int i11 = 1; i11 < length; i11++) {
                    int i12 = bVar2.f86366e[i11];
                    if (i12 == 1) {
                        jVarCompileStatement.bindLong(i11, bVar2.f86367f[i11]);
                    } else if (i12 == 2) {
                        jVarCompileStatement.bindDouble(i11, bVar2.f86368g[i11]);
                    } else if (i12 == 3) {
                        String str2 = bVar2.f86369h[i11];
                        kotlin.jvm.internal.e0.checkNotNull(str2);
                        jVarCompileStatement.bindString(i11, str2);
                    } else if (i12 == 4) {
                        byte[] bArr = bVar2.f86370i[i11];
                        kotlin.jvm.internal.e0.checkNotNull(bArr);
                        jVarCompileStatement.bindBlob(i11, bArr);
                    } else if (i12 == 5) {
                        jVarCompileStatement.bindNull(i11);
                    }
                }
                return lVar.invoke(jVarCompileStatement);
            case 22:
                v6.d dVar = (v6.d) this.f6534c;
                v6.a aVar2 = (v6.a) this.f6535e;
                x5.b _connection = (x5.b) obj;
                d.a aVar3 = v6.d.f89097c;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection, "_connection");
                dVar.f89099b.insert(_connection, aVar2);
                return tu.x0.f87415a;
            case 23:
                v6.h hVar = (v6.h) this.f6534c;
                v6.e eVar = (v6.e) this.f6535e;
                x5.b _connection2 = (x5.b) obj;
                h.a aVar4 = v6.h.f89122c;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection2, "_connection");
                hVar.f89124b.insert(_connection2, eVar);
                return tu.x0.f87415a;
            case 24:
                v6.q qVar = (v6.q) this.f6534c;
                v6.n nVar = (v6.n) this.f6535e;
                x5.b _connection3 = (x5.b) obj;
                q.a aVar5 = v6.q.f89151c;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection3, "_connection");
                qVar.f89153b.insert(_connection3, nVar);
                return tu.x0.f87415a;
            case 25:
                v6.w wVar = (v6.w) this.f6534c;
                v6.t tVar = (v6.t) this.f6535e;
                x5.b _connection4 = (x5.b) obj;
                w.a aVar6 = v6.w.f89161c;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection4, "_connection");
                wVar.f89163b.insert(_connection4, tVar);
                return tu.x0.f87415a;
            case 26:
                v6.a0 a0Var = (v6.a0) this.f6534c;
                v6.x xVar = (v6.x) this.f6535e;
                x5.b _connection5 = (x5.b) obj;
                a0.a aVar7 = v6.a0.f89049c;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection5, "_connection");
                a0Var.f89051b.insert(_connection5, xVar);
                return tu.x0.f87415a;
            case 27:
                androidx.work.b bVar3 = (androidx.work.b) this.f6534c;
                String str3 = (String) this.f6535e;
                x5.b _connection6 = (x5.b) obj;
                m0.a aVar8 = v6.m0.f89142d;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection6, "_connection");
                dVarPrepare = _connection6.prepare("UPDATE workspec SET output=? WHERE id=?");
                try {
                    dVarPrepare.bindBlob(1, androidx.work.b.f7480b.toByteArrayInternalV1(bVar3));
                    dVarPrepare.bindText(2, str3);
                    dVarPrepare.step();
                    dVarPrepare.close();
                    return tu.x0.f87415a;
                } finally {
                }
            default:
                n6.x0 x0Var = (n6.x0) this.f6534c;
                String str4 = (String) this.f6535e;
                x5.b _connection7 = (x5.b) obj;
                m0.a aVar9 = v6.m0.f89142d;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection7, "_connection");
                dVarPrepare = _connection7.prepare("UPDATE workspec SET state=? WHERE id=?");
                try {
                    dVarPrepare.bindLong(1, v6.t0.stateToInt(x0Var));
                    dVarPrepare.bindText(2, str4);
                    dVarPrepare.step();
                    int totalChangedRows = u5.r.getTotalChangedRows(_connection7);
                    dVarPrepare.close();
                    return Integer.valueOf(totalChangedRows);
                } finally {
                }
        }
    }

    public /* synthetic */ c3(kv.l lVar, p0.j2 j2Var) {
        this.f6533b = 10;
        this.f6535e = lVar;
        this.f6534c = j2Var;
    }
}
