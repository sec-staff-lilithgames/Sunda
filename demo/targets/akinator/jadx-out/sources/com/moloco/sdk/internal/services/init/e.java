package com.moloco.sdk.internal.services.init;

import com.moloco.sdk.internal.services.h0;
import com.moloco.sdk.internal.services.u;
import com.moloco.sdk.publisher.MediationInfo;
import io.ktor.http.HeadersBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.CancellableContinuation;
import o4.j;
import p0.c3;
import p0.n3;
import p0.y0;
import z.v0;
import z0.j0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class e implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f47074b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f47075c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f47076e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f47077f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f47078g;

    public /* synthetic */ e(int i10, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f47074b = i10;
        this.f47075c = obj;
        this.f47076e = obj2;
        this.f47077f = obj3;
        this.f47078g = obj4;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        boolean zD;
        Object objBeginSection;
        int i10;
        CancellableContinuation cancellableContinuationC;
        long j10;
        long j11 = 1;
        switch (this.f47074b) {
            case 0:
                return f.a((f) this.f47075c, (h0) this.f47076e, (MediationInfo) this.f47077f, (u) this.f47078g, (HeadersBuilder) obj);
            case 1:
                n3 n3Var = (n3) this.f47075c;
                List list = (List) this.f47076e;
                list = (List) this.f47077f;
                c3 c3Var = (c3) this.f47078g;
                long jLongValue = ((Long) obj).longValue();
                n3.a aVar = n3.C;
                synchronized (n3Var.f80350c) {
                    zD = n3Var.d();
                }
                if (zD) {
                    j0 j0Var = j0.f97136a;
                    objBeginSection = j0Var.beginSection("Recomposer:animation");
                    try {
                        n3Var.f80349b.sendFrame(jLongValue);
                        b1.m.f8651e.sendApplyNotifications();
                        j0Var.endSection(objBeginSection);
                    } finally {
                    }
                }
                objBeginSection = j0.f97136a.beginSection("Recomposer:recompose");
                try {
                    n3Var.n();
                    synchronized (n3Var.f80350c) {
                        try {
                            ArrayList arrayList = n3Var.f80357j;
                            int size = arrayList.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                list.add((y0) arrayList.get(i11));
                            }
                            n3Var.f80357j.clear();
                            r0.c cVar = n3Var.f80356i;
                            Object[] objArr = cVar.f83647b;
                            int size2 = cVar.getSize();
                            for (int i12 = 0; i12 < size2; i12++) {
                                list.add((y0) objArr[i12]);
                            }
                            n3Var.f80356i.clear();
                            c3Var.takeFrameRequestLocked();
                        } finally {
                        }
                    }
                    v0 v0Var = new v0(0, 1, null);
                    try {
                        int size3 = list.size();
                        for (int i13 = 0; i13 < size3; i13++) {
                            y0 y0VarJ = n3Var.j((y0) list.get(i13), v0Var);
                            if (y0VarJ != null) {
                                list.add(y0VarJ);
                            }
                        }
                        list.clear();
                        if (!list.isEmpty()) {
                            n3Var.f80348a++;
                        }
                        try {
                            int size4 = list.size();
                            for (i10 = 0; i10 < size4; i10++) {
                                ((y0) list.get(i10)).applyChanges();
                            }
                            list.clear();
                            synchronized (n3Var.f80350c) {
                                cancellableContinuationC = n3Var.c();
                            }
                            return cancellableContinuationC;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            default:
                zi.j jVar = (zi.j) this.f47075c;
                String str = (String) this.f47076e;
                String str2 = (String) this.f47077f;
                j.a aVar2 = (j.a) this.f47078g;
                o4.d dVar = (o4.d) obj;
                j.a aVar3 = zi.j.f97995b;
                jVar.getClass();
                if (((String) ri.j.getOrDefault(dVar, zi.j.f97997d, "")).equals(str)) {
                    j.a aVarC = jVar.c(dVar, str);
                    if (aVarC != null && !aVarC.getName().equals(str2)) {
                        synchronized (jVar) {
                            jVar.d(dVar, str);
                            HashSet hashSet = new HashSet((Collection) ri.j.getOrDefault(dVar, aVar2, new HashSet()));
                            hashSet.add(str);
                            dVar.set(aVar2, hashSet);
                        }
                    }
                } else {
                    j.a aVar4 = zi.j.f97996c;
                    long jLongValue2 = ((Long) ri.j.getOrDefault(dVar, aVar4, 0L)).longValue();
                    if (jLongValue2 + 1 == 30) {
                        synchronized (jVar) {
                            try {
                                long jLongValue3 = ((Long) ri.j.getOrDefault(dVar, aVar4, 0L)).longValue();
                                String name = "";
                                Set hashSet2 = new HashSet();
                                String str3 = null;
                                for (Map.Entry<j.a, Object> entry : dVar.asMap().entrySet()) {
                                    if (entry.getValue() instanceof Set) {
                                        Set<String> set = (Set) entry.getValue();
                                        for (String str4 : set) {
                                            long j12 = j11;
                                            if (str3 == null || str3.compareTo(str4) > 0) {
                                                str3 = str4;
                                                name = entry.getKey().getName();
                                                hashSet2 = set;
                                            }
                                            j11 = j12;
                                        }
                                    }
                                    j11 = j11;
                                }
                                j10 = j11;
                                HashSet hashSet3 = new HashSet(hashSet2);
                                hashSet3.remove(str3);
                                dVar.set(o4.n.stringSetKey(name), hashSet3);
                                jLongValue2 = jLongValue3 - j10;
                                dVar.set(zi.j.f97996c, Long.valueOf(jLongValue2));
                            } finally {
                            }
                        }
                    } else {
                        j10 = 1;
                    }
                    HashSet hashSet4 = new HashSet((Collection) ri.j.getOrDefault(dVar, aVar2, new HashSet()));
                    hashSet4.add(str);
                    dVar.set(aVar2, hashSet4);
                    dVar.set(zi.j.f97996c, Long.valueOf(jLongValue2 + j10));
                    dVar.set(zi.j.f97997d, str);
                }
                return null;
        }
    }
}
