package ek;

import android.content.Context;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class o0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f54599a;

    /* renamed from: b, reason: collision with root package name */
    public final tu.o f54600b;

    /* renamed from: c, reason: collision with root package name */
    public final int f54601c;

    /* renamed from: d, reason: collision with root package name */
    public final tu.o f54602d;

    /* renamed from: e, reason: collision with root package name */
    public final tu.o f54603e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f54604f;

    public o0(Context appContext, b2 uuidGenerator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(appContext, "appContext");
        kotlin.jvm.internal.e0.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        this.f54599a = appContext;
        final int i10 = 0;
        this.f54600b = tu.q.lazy(new kv.a(this) { // from class: ek.n0

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o0 f54595c;

            {
                this.f54595c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return ((q0) this.f54595c.f54603e.getValue()).getProcessName();
                    default:
                        return r0.f54624a.getMyProcessDetails(this.f54595c.f54599a);
                }
            }
        });
        this.f54601c = Process.myPid();
        this.f54602d = tu.q.lazy(new a1.e(uuidGenerator, 22));
        final int i11 = 1;
        this.f54603e = tu.q.lazy(new kv.a(this) { // from class: ek.n0

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o0 f54595c;

            {
                this.f54595c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return ((q0) this.f54595c.f54603e.getValue()).getProcessName();
                    default:
                        return r0.f54624a.getMyProcessDetails(this.f54595c.f54599a);
                }
            }
        });
    }

    @Override // ek.m0
    public Map<String, k0> generateProcessDataMap() {
        return l0.generateProcessDataMap(this);
    }

    @Override // ek.m0
    public int getMyPid() {
        return this.f54601c;
    }

    @Override // ek.m0
    public String getMyProcessName() {
        return (String) this.f54600b.getValue();
    }

    @Override // ek.m0
    public String getMyUuid() {
        return (String) this.f54602d.getValue();
    }

    @Override // ek.m0
    public boolean isColdStart(Map<String, k0> processDataMap) {
        kotlin.jvm.internal.e0.checkNotNullParameter(processDataMap, "processDataMap");
        if (this.f54604f) {
            return false;
        }
        List<q0> appProcessDetails = r0.f54624a.getAppProcessDetails(this.f54599a);
        ArrayList arrayList = new ArrayList();
        for (q0 q0Var : appProcessDetails) {
            k0 k0Var = processDataMap.get(q0Var.getProcessName());
            tu.v vVar = k0Var != null ? new tu.v(q0Var, k0Var) : null;
            if (vVar != null) {
                arrayList.add(vVar);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            tu.v vVar2 = (tu.v) it.next();
            q0 q0Var2 = (q0) vVar2.component1();
            k0 k0Var2 = (k0) vVar2.component2();
            if (kotlin.jvm.internal.e0.areEqual(getMyProcessName(), q0Var2.getProcessName())) {
                if (q0Var2.getPid() == k0Var2.getPid() && kotlin.jvm.internal.e0.areEqual(getMyUuid(), k0Var2.getUuid())) {
                    return false;
                }
            } else if (q0Var2.getPid() == k0Var2.getPid()) {
                return false;
            }
        }
        return true;
    }

    @Override // ek.m0
    public boolean isMyProcessStale(Map<String, k0> processDataMap) {
        kotlin.jvm.internal.e0.checkNotNullParameter(processDataMap, "processDataMap");
        k0 k0Var = processDataMap.get(getMyProcessName());
        return (k0Var != null && k0Var.getPid() == getMyPid() && kotlin.jvm.internal.e0.areEqual(k0Var.getUuid(), getMyUuid())) ? false : true;
    }

    @Override // ek.m0
    public void onSessionGenerated() {
        this.f54604f = true;
    }

    @Override // ek.m0
    public Map<String, k0> updateProcessDataMap(Map<String, k0> map) {
        Map mutableMap;
        if (map != null && (mutableMap = uu.p1.toMutableMap(map)) != null) {
            mutableMap.put(getMyProcessName(), new k0(Process.myPid(), getMyUuid()));
            Map<String, k0> map2 = uu.p1.toMap(mutableMap);
            if (map2 != null) {
                return map2;
            }
        }
        return uu.o1.mapOf(tu.e0.to(getMyProcessName(), new k0(Process.myPid(), getMyUuid())));
    }
}
