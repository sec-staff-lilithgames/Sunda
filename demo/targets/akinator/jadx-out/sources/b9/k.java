package b9;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.q;
import com.bumptech.glide.u;
import j9.s;
import java.util.ArrayList;
import n8.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final m8.b f8951a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f8952b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f8953c;

    /* renamed from: d, reason: collision with root package name */
    public final u f8954d;

    /* renamed from: e, reason: collision with root package name */
    public final q8.d f8955e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8956f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8957g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8958h;

    /* renamed from: i, reason: collision with root package name */
    public q f8959i;

    /* renamed from: j, reason: collision with root package name */
    public h f8960j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8961k;

    /* renamed from: l, reason: collision with root package name */
    public h f8962l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap f8963m;

    /* renamed from: n, reason: collision with root package name */
    public z f8964n;

    /* renamed from: o, reason: collision with root package name */
    public h f8965o;

    /* renamed from: p, reason: collision with root package name */
    public int f8966p;

    /* renamed from: q, reason: collision with root package name */
    public int f8967q;

    /* renamed from: r, reason: collision with root package name */
    public int f8968r;

    public k(com.bumptech.glide.c cVar, m8.b bVar, int i10, int i11, z zVar, Bitmap bitmap) {
        q8.d bitmapPool = cVar.getBitmapPool();
        u uVarWith = com.bumptech.glide.c.with(cVar.getContext());
        q qVarApply = com.bumptech.glide.c.with(cVar.getContext()).asBitmap().apply(((f9.i) ((f9.i) f9.i.diskCacheStrategyOf(p8.z.f80912a).useAnimationPool(true)).skipMemoryCache(true)).override(i10, i11));
        this.f8953c = new ArrayList();
        this.f8954d = uVarWith;
        Handler handler = new Handler(Looper.getMainLooper(), new j(this));
        this.f8955e = bitmapPool;
        this.f8952b = handler;
        this.f8959i = qVarApply;
        this.f8951a = bVar;
        c(zVar, bitmap);
    }

    public final void a() {
        if (!this.f8956f || this.f8957g) {
            return;
        }
        boolean z10 = this.f8958h;
        m8.b bVar = this.f8951a;
        if (z10) {
            j9.q.checkArgument(this.f8965o == null, "Pending target must be null when starting from the first frame");
            bVar.resetFrameIndex();
            this.f8958h = false;
        }
        h hVar = this.f8965o;
        if (hVar != null) {
            this.f8965o = null;
            b(hVar);
            return;
        }
        this.f8957g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + bVar.getNextDelay();
        bVar.advance();
        this.f8962l = new h(this.f8952b, bVar.getCurrentFrameIndex(), jUptimeMillis);
        this.f8959i.apply((f9.a) f9.i.signatureOf(new i9.d(Double.valueOf(Math.random())))).load((Object) bVar).into((q) this.f8962l);
    }

    public final void b(h hVar) {
        this.f8957g = false;
        boolean z10 = this.f8961k;
        Handler handler = this.f8952b;
        if (z10) {
            handler.obtainMessage(2, hVar).sendToTarget();
            return;
        }
        if (!this.f8956f) {
            if (this.f8958h) {
                handler.obtainMessage(2, hVar).sendToTarget();
                return;
            } else {
                this.f8965o = hVar;
                return;
            }
        }
        if (hVar.f8949i != null) {
            Bitmap bitmap = this.f8963m;
            if (bitmap != null) {
                this.f8955e.put(bitmap);
                this.f8963m = null;
            }
            h hVar2 = this.f8960j;
            this.f8960j = hVar;
            ArrayList arrayList = this.f8953c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((i) arrayList.get(size)).onFrameReady();
            }
            if (hVar2 != null) {
                handler.obtainMessage(2, hVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(z zVar, Bitmap bitmap) {
        this.f8964n = (z) j9.q.checkNotNull(zVar);
        this.f8963m = (Bitmap) j9.q.checkNotNull(bitmap);
        this.f8959i = this.f8959i.apply(new f9.i().transform(zVar));
        this.f8966p = s.getBitmapByteSize(bitmap);
        this.f8967q = bitmap.getWidth();
        this.f8968r = bitmap.getHeight();
    }
}
