package p8;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class w0 implements k, com.bumptech.glide.load.data.d {

    /* renamed from: b, reason: collision with root package name */
    public final r f80893b;

    /* renamed from: c, reason: collision with root package name */
    public final l f80894c;

    /* renamed from: e, reason: collision with root package name */
    public int f80895e;

    /* renamed from: f, reason: collision with root package name */
    public int f80896f = -1;

    /* renamed from: g, reason: collision with root package name */
    public n8.q f80897g;

    /* renamed from: h, reason: collision with root package name */
    public List f80898h;

    /* renamed from: i, reason: collision with root package name */
    public int f80899i;

    /* renamed from: j, reason: collision with root package name */
    public volatile u8.k0 f80900j;

    /* renamed from: k, reason: collision with root package name */
    public File f80901k;

    /* renamed from: l, reason: collision with root package name */
    public x0 f80902l;

    public w0(l lVar, r rVar) {
        this.f80894c = lVar;
        this.f80893b = rVar;
    }

    @Override // p8.k
    public void cancel() {
        u8.k0 k0Var = this.f80900j;
        if (k0Var != null) {
            k0Var.f88091c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void onDataReady(Object obj) {
        this.f80893b.onDataFetcherReady(this.f80897g, obj, this.f80900j.f88091c, n8.a.f75826f, this.f80902l);
    }

    @Override // com.bumptech.glide.load.data.d
    public void onLoadFailed(Exception exc) {
        this.f80893b.onDataFetcherFailed(this.f80902l, exc, this.f80900j.f88091c, n8.a.f75826f);
    }

    @Override // p8.k
    public boolean startNext() {
        k9.i.beginSection("ResourceCacheGenerator.startNext");
        try {
            ArrayList arrayListA = this.f80894c.a();
            if (arrayListA.isEmpty()) {
                k9.i.endSection();
                return false;
            }
            l lVar = this.f80894c;
            List<Class<?>> registeredResourceClasses = lVar.f80805c.getRegistry().getRegisteredResourceClasses(lVar.f80806d.getClass(), lVar.f80809g, lVar.f80813k);
            if (registeredResourceClasses.isEmpty()) {
                if (File.class.equals(this.f80894c.f80813k)) {
                    k9.i.endSection();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f80894c.f80806d.getClass() + " to " + this.f80894c.f80813k);
            }
            while (true) {
                List list = this.f80898h;
                if (list != null) {
                    if (this.f80899i < list.size()) {
                        this.f80900j = null;
                        boolean z10 = false;
                        while (!z10) {
                            if (!(this.f80899i < this.f80898h.size())) {
                                break;
                            }
                            List list2 = this.f80898h;
                            int i10 = this.f80899i;
                            this.f80899i = i10 + 1;
                            u8.l0 l0Var = (u8.l0) list2.get(i10);
                            File file = this.f80901k;
                            l lVar2 = this.f80894c;
                            this.f80900j = l0Var.buildLoadData(file, lVar2.f80807e, lVar2.f80808f, lVar2.f80811i);
                            if (this.f80900j != null) {
                                l lVar3 = this.f80894c;
                                if (lVar3.f80805c.getRegistry().getLoadPath(this.f80900j.f88091c.getDataClass(), lVar3.f80809g, lVar3.f80813k) != null) {
                                    this.f80900j.f88091c.loadData(this.f80894c.f80817o, this);
                                    z10 = true;
                                }
                            }
                        }
                        k9.i.endSection();
                        return z10;
                    }
                }
                int i11 = this.f80896f + 1;
                this.f80896f = i11;
                if (i11 >= registeredResourceClasses.size()) {
                    int i12 = this.f80895e + 1;
                    this.f80895e = i12;
                    if (i12 >= arrayListA.size()) {
                        k9.i.endSection();
                        return false;
                    }
                    this.f80896f = 0;
                }
                n8.q qVar = (n8.q) arrayListA.get(this.f80895e);
                Class<?> cls = registeredResourceClasses.get(this.f80896f);
                n8.z zVarC = this.f80894c.c(cls);
                q8.b arrayPool = this.f80894c.f80805c.getArrayPool();
                l lVar4 = this.f80894c;
                this.f80902l = new x0(arrayPool, qVar, lVar4.f80816n, lVar4.f80807e, lVar4.f80808f, zVarC, cls, lVar4.f80811i);
                File file2 = ((c0) lVar4.f80810h).getDiskCache().get(this.f80902l);
                this.f80901k = file2;
                if (file2 != null) {
                    this.f80897g = qVar;
                    this.f80898h = this.f80894c.f80805c.getRegistry().getModelLoaders(file2);
                    this.f80899i = 0;
                }
            }
        } catch (Throwable th2) {
            k9.i.endSection();
            throw th2;
        }
    }
}
