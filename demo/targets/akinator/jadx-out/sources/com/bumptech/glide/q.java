package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p8.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class q extends f9.a implements k {
    public static final f9.i Q = (f9.i) ((f9.i) ((f9.i) new f9.i().diskCacheStrategy(z.f80913b)).priority(l.f16580f)).skipMemoryCache(true);
    public final Context C;
    public final u D;
    public final Class E;
    public final c F;
    public final h G;
    public v H;
    public Object I;
    public ArrayList J;
    public q K;
    public q L;
    public Float M;
    public boolean N = true;
    public boolean O;
    public boolean P;

    public q(c cVar, u uVar, Class cls, Context context) {
        f9.i iVar;
        this.F = cVar;
        this.D = uVar;
        this.E = cls;
        this.C = context;
        this.H = uVar.f16670b.f16537f.getDefaultTransitionOptions(cls);
        this.G = cVar.f16537f;
        Iterator it = uVar.f16678k.iterator();
        while (it.hasNext()) {
            addListener((f9.h) it.next());
        }
        synchronized (uVar) {
            iVar = uVar.f16679l;
        }
        apply((f9.a) iVar);
    }

    public q addListener(f9.h hVar) {
        if (this.f55537x) {
            return mo370clone().addListener(hVar);
        }
        if (hVar != null) {
            if (this.J == null) {
                this.J = new ArrayList();
            }
            this.J.add(hVar);
        }
        e();
        return this;
    }

    @Deprecated
    public <Y extends g9.n> Y downloadOnly(Y y10) {
        return (Y) j().into((q) y10);
    }

    @Override // f9.a
    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return super.equals(qVar) && Objects.equals(this.E, qVar.E) && this.H.equals(qVar.H) && Objects.equals(this.I, qVar.I) && Objects.equals(this.J, qVar.J) && Objects.equals(this.K, qVar.K) && Objects.equals(this.L, qVar.L) && Objects.equals(this.M, qVar.M) && this.N == qVar.N && this.O == qVar.O;
    }

    public q error(Object obj) {
        return obj == null ? error((q) null) : error(mo370clone().error((q) null).thumbnail((q) null).load(obj));
    }

    @Override // f9.a
    public int hashCode() {
        return j9.s.hashCode(this.O, j9.s.hashCode(this.N, j9.s.hashCode(this.M, j9.s.hashCode(this.L, j9.s.hashCode(this.K, j9.s.hashCode(this.J, j9.s.hashCode(this.I, j9.s.hashCode(this.H, j9.s.hashCode(this.E, super.hashCode())))))))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final f9.e i(int r17, int r18, com.bumptech.glide.l r19, com.bumptech.glide.v r20, f9.a r21, f9.f r22, f9.h r23, g9.n r24, java.lang.Object r25, java.util.concurrent.Executor r26) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.q.i(int, int, com.bumptech.glide.l, com.bumptech.glide.v, f9.a, f9.f, f9.h, g9.n, java.lang.Object, java.util.concurrent.Executor):f9.e");
    }

    public <Y extends g9.n> Y into(Y y10) {
        l(y10, null, this, j9.h.mainThreadExecutor());
        return y10;
    }

    public final q j() {
        q qVar = new q(this.F, this.D, File.class, this.C);
        qVar.I = this.I;
        qVar.O = this.O;
        qVar.apply((f9.a) this);
        return qVar.apply((f9.a) Q);
    }

    public final l k(l lVar) {
        int iOrdinal = lVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return l.f16577b;
        }
        if (iOrdinal == 2) {
            return l.f16578c;
        }
        if (iOrdinal == 3) {
            return l.f16579e;
        }
        throw new IllegalArgumentException("unknown priority: " + getPriority());
    }

    public final void l(g9.n nVar, f9.g gVar, f9.a aVar, Executor executor) {
        j9.q.checkNotNull(nVar);
        if (!this.O) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        Object obj = new Object();
        v vVar = this.H;
        f9.e eVarI = i(aVar.getOverrideWidth(), aVar.getOverrideHeight(), aVar.getPriority(), vVar, aVar, null, gVar, nVar, obj, executor);
        f9.e request = nVar.getRequest();
        if (eVarI.isEquivalentTo(request) && (aVar.isMemoryCacheable() || !request.isComplete())) {
            if (((f9.e) j9.q.checkNotNull(request)).isRunning()) {
                return;
            }
            request.begin();
        } else {
            this.D.clear(nVar);
            nVar.setRequest(eVarI);
            u uVar = this.D;
            synchronized (uVar) {
                uVar.f16675h.track(nVar);
                uVar.f16673f.runRequest(eVarI);
            }
        }
    }

    public q listener(f9.h hVar) {
        if (this.f55537x) {
            return mo370clone().listener(hVar);
        }
        this.J = null;
        return addListener(hVar);
    }

    public final q m(Object obj) {
        if (this.f55537x) {
            return mo370clone().m(obj);
        }
        this.I = obj;
        this.O = true;
        e();
        return this;
    }

    public final f9.k n(int i10, int i11, l lVar, v vVar, f9.a aVar, f9.f fVar, f9.h hVar, g9.n nVar, Object obj, Executor executor) {
        Object obj2 = this.I;
        ArrayList arrayList = this.J;
        h hVar2 = this.G;
        return f9.k.obtain(this.C, hVar2, obj, obj2, this.E, aVar, i10, i11, lVar, nVar, hVar, arrayList, fVar, hVar2.getEngine(), vVar.f16682b, executor);
    }

    public g9.n preload(int i10, int i11) {
        return into((q) g9.l.obtain(this.D, i10, i11));
    }

    public f9.d submit() {
        return submit(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public q thumbnail(q... qVarArr) {
        return (qVarArr == null || qVarArr.length == 0) ? thumbnail((q) null) : thumbnail(Arrays.asList(qVarArr));
    }

    public q transition(v vVar) {
        if (this.f55537x) {
            return mo370clone().transition(vVar);
        }
        this.H = (v) j9.q.checkNotNull(vVar);
        this.N = false;
        e();
        return this;
    }

    @Override // f9.a
    public q apply(f9.a aVar) {
        j9.q.checkNotNull(aVar);
        return (q) super.apply(aVar);
    }

    @Deprecated
    public f9.d downloadOnly(int i10, int i11) {
        return j().submit(i10, i11);
    }

    public f9.d submit(int i10, int i11) {
        f9.g gVar = new f9.g(i10, i11);
        l(gVar, gVar, this, j9.h.directExecutor());
        return gVar;
    }

    @Override // f9.a
    /* renamed from: clone */
    public q mo370clone() {
        q qVar = (q) super.mo370clone();
        qVar.H = qVar.H.m371clone();
        if (qVar.J != null) {
            qVar.J = new ArrayList(qVar.J);
        }
        q qVar2 = qVar.K;
        if (qVar2 != null) {
            qVar.K = qVar2.mo370clone();
        }
        q qVar3 = qVar.L;
        if (qVar3 != null) {
            qVar.L = qVar3.mo370clone();
        }
        return qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g9.r into(android.widget.ImageView r4) {
        /*
            r3 = this;
            j9.s.assertMainThread()
            j9.q.checkNotNull(r4)
            boolean r0 = r3.isTransformationSet()
            if (r0 != 0) goto L4c
            boolean r0 = r3.isTransformationAllowed()
            if (r0 == 0) goto L4c
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L4c
            int[] r0 = com.bumptech.glide.p.f16662a
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L43;
                case 2: goto L3a;
                case 3: goto L31;
                case 4: goto L31;
                case 5: goto L31;
                case 6: goto L28;
                default: goto L27;
            }
        L27:
            goto L4c
        L28:
            f9.a r0 = r3.mo370clone()
            f9.a r0 = r0.optionalCenterInside()
            goto L4d
        L31:
            f9.a r0 = r3.mo370clone()
            f9.a r0 = r0.optionalFitCenter()
            goto L4d
        L3a:
            f9.a r0 = r3.mo370clone()
            f9.a r0 = r0.optionalCenterInside()
            goto L4d
        L43:
            f9.a r0 = r3.mo370clone()
            f9.a r0 = r0.optionalCenterCrop()
            goto L4d
        L4c:
            r0 = r3
        L4d:
            com.bumptech.glide.h r1 = r3.G
            java.lang.Class r2 = r3.E
            g9.r r4 = r1.buildImageViewTarget(r4, r2)
            r1 = 0
            java.util.concurrent.Executor r2 = j9.h.mainThreadExecutor()
            r3.l(r4, r1, r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.q.into(android.widget.ImageView):g9.r");
    }

    public g9.n preload() {
        return preload(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public q thumbnail(List<q> list) {
        q qVarThumbnail = null;
        if (list != null && !list.isEmpty()) {
            for (int size = list.size() - 1; size >= 0; size--) {
                q qVar = list.get(size);
                if (qVar != null) {
                    qVarThumbnail = qVarThumbnail == null ? qVar : qVar.thumbnail(qVarThumbnail);
                }
            }
            return thumbnail(qVarThumbnail);
        }
        return thumbnail((q) null);
    }

    public q error(q qVar) {
        if (this.f55537x) {
            return mo370clone().error(qVar);
        }
        this.L = qVar;
        e();
        return this;
    }

    @Override // com.bumptech.glide.k
    public q load(Object obj) {
        return m(obj);
    }

    @Deprecated
    public q thumbnail(float f10) {
        if (this.f55537x) {
            return mo370clone().thumbnail(f10);
        }
        if (f10 >= 0.0f && f10 <= 1.0f) {
            this.M = Float.valueOf(f10);
            e();
            return this;
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    @Override // com.bumptech.glide.k
    public q load(Bitmap bitmap) {
        return m(bitmap).apply((f9.a) f9.i.diskCacheStrategyOf(z.f80912a));
    }

    @Override // com.bumptech.glide.k
    public q load(Drawable drawable) {
        return m(drawable).apply((f9.a) f9.i.diskCacheStrategyOf(z.f80912a));
    }

    @Override // com.bumptech.glide.k
    public q load(String str) {
        return m(str);
    }

    @Override // com.bumptech.glide.k
    public q load(Uri uri) {
        q qVarM = m(uri);
        if (uri == null || !"android.resource".equals(uri.getScheme())) {
            return qVarM;
        }
        Context context = this.C;
        return (q) ((q) qVarM.theme(context.getTheme())).signature(i9.a.obtain(context));
    }

    public q thumbnail(q qVar) {
        if (this.f55537x) {
            return mo370clone().thumbnail(qVar);
        }
        this.K = qVar;
        e();
        return this;
    }

    @Deprecated
    public f9.d into(int i10, int i11) {
        return submit(i10, i11);
    }

    @Override // com.bumptech.glide.k
    public q load(File file) {
        return m(file);
    }

    @Override // com.bumptech.glide.k
    public q load(Integer num) {
        q qVarM = m(num);
        Context context = this.C;
        return (q) ((q) qVarM.theme(context.getTheme())).signature(i9.a.obtain(context));
    }

    @Override // com.bumptech.glide.k
    @Deprecated
    public q load(URL url) {
        return m(url);
    }

    @Override // com.bumptech.glide.k
    public q load(byte[] bArr) {
        q qVarM = m(bArr);
        if (!qVarM.isDiskCacheStrategySet()) {
            qVarM = qVarM.apply((f9.a) f9.i.diskCacheStrategyOf(z.f80912a));
        }
        return !qVarM.isSkipMemoryCacheSet() ? qVarM.apply((f9.a) f9.i.skipMemoryCacheOf(true)) : qVarM;
    }
}
