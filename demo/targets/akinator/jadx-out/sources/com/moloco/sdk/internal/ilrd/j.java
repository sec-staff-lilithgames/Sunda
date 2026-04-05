package com.moloco.sdk.internal.ilrd;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.work.impl.WorkDatabase;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.w0;
import n6.b1;
import n6.n;
import o5.a;
import o6.d0;
import o6.e1;
import o6.p;
import o6.r;
import o6.y0;
import p0.v4;
import q0.p0;
import r6.o;
import tu.x0;
import uu.o0;
import uu.q0;
import v6.b0;
import v6.c0;
import v6.x;
import w6.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class j implements kv.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46020b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f46021c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f46022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f46023f;

    public /* synthetic */ j(Object obj, int i10, Object obj2, Object obj3) {
        this.f46020b = i10;
        this.f46021c = obj;
        this.f46022e = obj2;
        this.f46023f = obj3;
    }

    @Override // kv.a
    public final Object invoke() throws Exception {
        List<Certificate> listClean;
        int i10 = this.f46020b;
        x0 x0Var = x0.f87415a;
        Object obj = this.f46023f;
        Object obj2 = this.f46021c;
        Object obj3 = this.f46022e;
        switch (i10) {
            case 0:
                return k.a((List) obj2, (Context) obj3, (k) obj);
            case 1:
                int i11 = cw.d.f51115y;
                mw.c certificateChainCleaner$okhttp = ((xv.l) obj2).getCertificateChainCleaner$okhttp();
                e0.checkNotNull(certificateChainCleaner$okhttp);
                return certificateChainCleaner$okhttp.clean(((xv.e0) obj3).peerCertificates(), ((xv.a) obj).url().host());
            case 2:
                o5.a aVar = (o5.a) obj2;
                a.b bVar = (a.b) obj3;
                String str = (String) obj;
                if (aVar.f77492b) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                x5.b bVarOpen = bVar.f77493a.open(str);
                if (aVar.f77491a) {
                    o5.a.access$configurationConnection(aVar, bVarOpen);
                } else {
                    try {
                        aVar.f77492b = true;
                        o5.a.access$configureDatabase(aVar, bVarOpen);
                    } finally {
                        aVar.f77492b = false;
                    }
                }
                return bVarOpen;
            case 3:
                y0 y0Var = (y0) obj2;
                String str2 = (String) obj3;
                b1 b1Var = (b1) obj;
                c0 c0VarWorkSpecDao = y0Var.getWorkDatabase().workSpecDao();
                List<b0.b> workSpecIdAndStatesForName = c0VarWorkSpecDao.getWorkSpecIdAndStatesForName(str2);
                if (workSpecIdAndStatesForName.size() > 1) {
                    throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
                }
                b0.b bVar2 = (b0.b) uu.y0.firstOrNull((List) workSpecIdAndStatesForName);
                if (bVar2 == null) {
                    w6.f.enqueue(new d0(y0Var, str2, n.f75768c, o0.listOf(b1Var)));
                } else {
                    String str3 = bVar2.f89078a;
                    b0 workSpec = c0VarWorkSpecDao.getWorkSpec(str3);
                    if (workSpec == null) {
                        throw new IllegalStateException(e3.g.l("WorkSpec with ", str3, ", that matches a name \"", str2, "\", wasn't found"));
                    }
                    if (!workSpec.isPeriodic()) {
                        throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                    }
                    if (bVar2.f89079b == n6.x0.f75811h) {
                        c0VarWorkSpecDao.delete(str3);
                        w6.f.enqueue(new d0(y0Var, str2, n.f75768c, o0.listOf(b1Var)));
                    } else {
                        b0 b0VarCopy$default = b0.copy$default(b1Var.getWorkSpec(), bVar2.f89078a, null, null, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554430, null);
                        p processor = y0Var.getProcessor();
                        e0.checkNotNullExpressionValue(processor, "getProcessor(...)");
                        WorkDatabase workDatabase = y0Var.getWorkDatabase();
                        e0.checkNotNullExpressionValue(workDatabase, "getWorkDatabase(...)");
                        androidx.work.a configuration = y0Var.getConfiguration();
                        e0.checkNotNullExpressionValue(configuration, "<get-configuration>(...)");
                        List<r> schedulers = y0Var.getSchedulers();
                        e0.checkNotNullExpressionValue(schedulers, "getSchedulers(...)");
                        e1.a(processor, workDatabase, configuration, schedulers, b0VarCopy$default, b1Var.getTags());
                    }
                }
                return x0Var;
            case 4:
                p0.b bVar3 = (p0.b) obj2;
                v4 v4Var = (v4) obj3;
                p0 p0Var = (p0) obj;
                if (bVar3 != null) {
                    v4Var.seek(bVar3);
                }
                List listBuildTrace$default = d1.b.buildTrace$default(v4Var, null, 0, null, 7, null);
                d1.c cVar = (d1.c) uu.y0.lastOrNull(listBuildTrace$default);
                Integer groupOffset = cVar != null ? cVar.getGroupOffset() : null;
                List<d1.c> listBuildStackTrace = p0Var.buildStackTrace(groupOffset);
                if (groupOffset != null && !listBuildStackTrace.isEmpty()) {
                    listBuildStackTrace = uu.y0.plus((Collection) o0.listOf(d1.c.copy$default((d1.c) uu.y0.first((List) listBuildStackTrace), null, groupOffset, 1, null)), (Iterable) uu.y0.drop(listBuildStackTrace, 1));
                }
                return uu.y0.plus((Collection) listBuildTrace$default, (Iterable) listBuildStackTrace);
            case 5:
                ConnectivityManager connectivityManager = (ConnectivityManager) obj3;
                r6.d dVar = (r6.d) obj;
                if (((w0) obj2).f71863b) {
                    n6.c0.get().debug(o.f83843a, "NetworkRequestConstraintController unregister callback");
                    connectivityManager.unregisterNetworkCallback(dVar);
                }
                return x0Var;
            case 6:
                h0 h0Var = (h0) obj2;
                UUID uuid = (UUID) obj3;
                androidx.work.b bVar4 = (androidx.work.b) obj;
                String str4 = h0.f90416c;
                h0Var.getClass();
                String string = uuid.toString();
                n6.c0 c0Var = n6.c0.get();
                String str5 = h0.f90416c;
                c0Var.debug(str5, "Updating progress for " + uuid + " (" + bVar4 + ")");
                WorkDatabase workDatabase2 = h0Var.f90417a;
                workDatabase2.beginTransaction();
                try {
                    b0 workSpec2 = workDatabase2.workSpecDao().getWorkSpec(string);
                    if (workSpec2 == null) {
                        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    if (workSpec2.f89054b == n6.x0.f75807c) {
                        workDatabase2.workProgressDao().insert(new x(string, bVar4));
                    } else {
                        n6.c0.get().warning(str5, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
                    }
                    workDatabase2.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                List<Certificate> list = (List) obj2;
                String str6 = (String) obj;
                mw.c cVar2 = ((xv.l) obj3).f93697b;
                if (cVar2 != null && (listClean = cVar2.clean(list, str6)) != null) {
                    list = listClean;
                }
                List<Certificate> list2 = list;
                ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list2, 10));
                for (Certificate certificate : list2) {
                    e0.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
        }
    }

    public /* synthetic */ j(xv.l lVar, List list, String str) {
        this.f46020b = 7;
        this.f46022e = lVar;
        this.f46021c = list;
        this.f46023f = str;
    }
}
