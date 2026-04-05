package p8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f80803a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f80804b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.h f80805c;

    /* renamed from: d, reason: collision with root package name */
    public Object f80806d;

    /* renamed from: e, reason: collision with root package name */
    public int f80807e;

    /* renamed from: f, reason: collision with root package name */
    public int f80808f;

    /* renamed from: g, reason: collision with root package name */
    public Class f80809g;

    /* renamed from: h, reason: collision with root package name */
    public o f80810h;

    /* renamed from: i, reason: collision with root package name */
    public n8.v f80811i;

    /* renamed from: j, reason: collision with root package name */
    public Map f80812j;

    /* renamed from: k, reason: collision with root package name */
    public Class f80813k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f80814l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f80815m;

    /* renamed from: n, reason: collision with root package name */
    public n8.q f80816n;

    /* renamed from: o, reason: collision with root package name */
    public com.bumptech.glide.l f80817o;

    /* renamed from: p, reason: collision with root package name */
    public z f80818p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f80819q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f80820r;

    public final ArrayList a() {
        boolean z10 = this.f80815m;
        ArrayList arrayList = this.f80804b;
        if (!z10) {
            this.f80815m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i10 = 0; i10 < size; i10++) {
                u8.k0 k0Var = (u8.k0) arrayListB.get(i10);
                n8.q qVar = k0Var.f88089a;
                List list = k0Var.f88090b;
                if (!arrayList.contains(qVar)) {
                    arrayList.add(k0Var.f88089a);
                }
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (!arrayList.contains(list.get(i11))) {
                        arrayList.add(list.get(i11));
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z10 = this.f80814l;
        ArrayList arrayList = this.f80803a;
        if (!z10) {
            this.f80814l = true;
            arrayList.clear();
            List<u8.l0> modelLoaders = this.f80805c.getRegistry().getModelLoaders(this.f80806d);
            int size = modelLoaders.size();
            for (int i10 = 0; i10 < size; i10++) {
                u8.k0 k0VarBuildLoadData = modelLoaders.get(i10).buildLoadData(this.f80806d, this.f80807e, this.f80808f, this.f80811i);
                if (k0VarBuildLoadData != null) {
                    arrayList.add(k0VarBuildLoadData);
                }
            }
        }
        return arrayList;
    }

    public final n8.z c(Class cls) {
        n8.z zVar = (n8.z) this.f80812j.get(cls);
        if (zVar == null) {
            Iterator it = this.f80812j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    zVar = (n8.z) entry.getValue();
                    break;
                }
            }
        }
        if (zVar != null) {
            return zVar;
        }
        if (!this.f80812j.isEmpty() || !this.f80819q) {
            return w8.d.get();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
