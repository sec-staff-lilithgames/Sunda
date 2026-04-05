package a7;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import c7.b;
import f7.a;
import f7.b;
import f7.c;
import f7.d;
import f7.e;
import f7.j;
import f7.k;
import f7.n;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import q7.x;
import uu.y0;
import xv.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q implements m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4116a;

    /* renamed from: b, reason: collision with root package name */
    public final l7.c f4117b;

    /* renamed from: c, reason: collision with root package name */
    public final tu.o f4118c;

    /* renamed from: d, reason: collision with root package name */
    public final tu.o f4119d;

    /* renamed from: e, reason: collision with root package name */
    public final tu.o f4120e;

    /* renamed from: f, reason: collision with root package name */
    public final f f4121f;

    /* renamed from: g, reason: collision with root package name */
    public final a7.b f4122g;

    /* renamed from: h, reason: collision with root package name */
    public final q7.s f4123h;

    /* renamed from: i, reason: collision with root package name */
    public final CoroutineScope f4124i = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()).plus(new b(CoroutineExceptionHandler.Key, this)));

    /* renamed from: j, reason: collision with root package name */
    public final x f4125j;

    /* renamed from: k, reason: collision with root package name */
    public final l7.r f4126k;

    /* renamed from: l, reason: collision with root package name */
    public final tu.o f4127l;

    /* renamed from: m, reason: collision with root package name */
    public final tu.o f4128m;

    /* renamed from: n, reason: collision with root package name */
    public final a7.b f4129n;

    /* renamed from: o, reason: collision with root package name */
    public final List f4130o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f4131p;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends zu.a implements CoroutineExceptionHandler {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ q f4132e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.Key key, q qVar) {
            super(key);
            this.f4132e = qVar;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(zu.m mVar, Throwable th2) {
            this.f4132e.getLogger();
        }
    }

    static {
        new a(null);
    }

    public q(Context context, l7.c cVar, tu.o oVar, tu.o oVar2, tu.o oVar3, f fVar, a7.b bVar, q7.s sVar, q7.v vVar) {
        this.f4116a = context;
        this.f4117b = cVar;
        this.f4118c = oVar;
        this.f4119d = oVar2;
        this.f4120e = oVar3;
        this.f4121f = fVar;
        this.f4122g = bVar;
        this.f4123h = sVar;
        x xVar = new x(this, context, sVar.getNetworkObserverEnabled());
        this.f4125j = xVar;
        l7.r rVar = new l7.r(this, xVar, null);
        this.f4126k = rVar;
        this.f4127l = oVar;
        this.f4128m = oVar2;
        this.f4129n = bVar.newBuilder().add(new i7.c(), g0.class).add(new i7.g(), String.class).add(new i7.b(), Uri.class).add(new i7.f(), Uri.class).add(new i7.e(), Integer.class).add(new i7.a(), byte[].class).add(new h7.c(), Uri.class).add(new h7.a(sVar.getAddLastModifiedToFileCacheKey()), File.class).add(new k.b(oVar3, oVar2, sVar.getRespectCacheHeaders()), Uri.class).add(new j.a(), File.class).add(new a.C0561a(), Uri.class).add(new d.a(), Uri.class).add(new n.b(), Uri.class).add(new e.a(), Drawable.class).add(new b.a(), Bitmap.class).add(new c.a(), ByteBuffer.class).add(new b.c(sVar.getBitmapFactoryMaxParallelism(), sVar.getBitmapFactoryExifOrientationPolicy())).build();
        this.f4130o = y0.plus((Collection<? extends g7.a>) getComponents().getInterceptors(), new g7.a(this, rVar, null));
        this.f4131p = new AtomicBoolean(false);
        xVar.register();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(l7.f r3, n7.d r4, a7.g r5) {
        /*
            l7.i r0 = r3.getRequest()
            boolean r1 = r4 instanceof p7.f
            if (r1 != 0) goto Lb
            if (r4 == 0) goto L3a
            goto L1e
        Lb:
            l7.i r1 = r3.getRequest()
            p7.c r1 = r1.getTransitionFactory()
            r2 = r4
            p7.f r2 = (p7.f) r2
            p7.d r1 = r1.create(r2, r3)
            boolean r2 = r1 instanceof p7.b
            if (r2 == 0) goto L26
        L1e:
            android.graphics.drawable.Drawable r1 = r3.getDrawable()
            r4.onError(r1)
            goto L3a
        L26:
            l7.i r4 = r3.getRequest()
            r2 = r5
            a7.c r2 = (a7.c) r2
            r2.transitionStart(r4, r1)
            r1.transition()
            l7.i r4 = r3.getRequest()
            r2.transitionEnd(r4, r1)
        L3a:
            a7.c r5 = (a7.c) r5
            r5.onError(r0, r3)
            l7.j r4 = r0.getListener()
            if (r4 == 0) goto L48
            r4.onError(r0, r3)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.q.a(l7.f, n7.d, a7.g):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c8 A[Catch: all -> 0x01c6, TRY_LEAVE, TryCatch #4 {all -> 0x01c6, blocks: (B:92:0x01b0, B:94:0x01b4, B:96:0x01c2, B:97:0x01c5, B:100:0x01c8), top: B:113:0x01b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9 A[Catch: all -> 0x00d9, TryCatch #6 {all -> 0x00d9, blocks: (B:43:0x00dd, B:45:0x00e3, B:47:0x00e9, B:50:0x00f1, B:53:0x00f9, B:55:0x010b, B:57:0x0111, B:58:0x0114, B:54:0x0107, B:32:0x00ad, B:34:0x00b9, B:36:0x00be, B:90:0x01aa, B:91:0x01af), top: B:116:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107 A[Catch: all -> 0x00d9, TryCatch #6 {all -> 0x00d9, blocks: (B:43:0x00dd, B:45:0x00e3, B:47:0x00e9, B:50:0x00f1, B:53:0x00f9, B:55:0x010b, B:57:0x0111, B:58:0x0114, B:54:0x0107, B:32:0x00ad, B:34:0x00b9, B:36:0x00be, B:90:0x01aa, B:91:0x01af), top: B:116:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0111 A[Catch: all -> 0x00d9, TryCatch #6 {all -> 0x00d9, blocks: (B:43:0x00dd, B:45:0x00e3, B:47:0x00e9, B:50:0x00f1, B:53:0x00f9, B:55:0x010b, B:57:0x0111, B:58:0x0114, B:54:0x0107, B:32:0x00ad, B:34:0x00b9, B:36:0x00be, B:90:0x01aa, B:91:0x01af), top: B:116:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0120 A[Catch: all -> 0x0124, TryCatch #3 {all -> 0x0124, blocks: (B:59:0x011a, B:61:0x0120, B:64:0x0129), top: B:111:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0178 A[Catch: all -> 0x0189, TryCatch #7 {all -> 0x0189, blocks: (B:73:0x0172, B:75:0x0178, B:80:0x018b, B:82:0x018f), top: B:117:0x0172 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018b A[Catch: all -> 0x0189, TryCatch #7 {all -> 0x0189, blocks: (B:73:0x0172, B:75:0x0178, B:80:0x018b, B:82:0x018f), top: B:117:0x0172 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b4 A[Catch: all -> 0x01c6, TryCatch #4 {all -> 0x01c6, blocks: (B:92:0x01b0, B:94:0x01b4, B:96:0x01c2, B:97:0x01c5, B:100:0x01c8), top: B:113:0x01b0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$executeMain(a7.q r18, l7.i r19, int r20, zu.d r21) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.q.access$executeMain(a7.q, l7.i, int, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(l7.s r3, n7.d r4, a7.g r5) {
        /*
            l7.i r0 = r3.getRequest()
            r3.getDataSource()
            boolean r1 = r4 instanceof p7.f
            if (r1 != 0) goto Le
            if (r4 == 0) goto L3d
            goto L21
        Le:
            l7.i r1 = r3.getRequest()
            p7.c r1 = r1.getTransitionFactory()
            r2 = r4
            p7.f r2 = (p7.f) r2
            p7.d r1 = r1.create(r2, r3)
            boolean r2 = r1 instanceof p7.b
            if (r2 == 0) goto L29
        L21:
            android.graphics.drawable.Drawable r1 = r3.getDrawable()
            r4.onSuccess(r1)
            goto L3d
        L29:
            l7.i r4 = r3.getRequest()
            r2 = r5
            a7.c r2 = (a7.c) r2
            r2.transitionStart(r4, r1)
            r1.transition()
            l7.i r4 = r3.getRequest()
            r2.transitionEnd(r4, r1)
        L3d:
            a7.c r5 = (a7.c) r5
            r5.onSuccess(r0, r3)
            l7.j r4 = r0.getListener()
            if (r4 == 0) goto L4b
            r4.onSuccess(r0, r3)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.q.b(l7.s, n7.d, a7.g):void");
    }

    @Override // a7.m
    public l7.e enqueue(l7.i iVar) {
        Deferred<? extends l7.k> deferredAsync$default = BuildersKt__Builders_commonKt.async$default(this.f4124i, null, null, new r(this, iVar, null), 3, null);
        return iVar.getTarget() instanceof n7.e ? q7.n.getRequestManager(((n7.e) iVar.getTarget()).getView()).getDisposable(deferredAsync$default) : new l7.n(deferredAsync$default);
    }

    @Override // a7.m
    public Object execute(l7.i iVar, zu.d<? super l7.k> dVar) {
        return CoroutineScopeKt.coroutineScope(new t(this, iVar, null), dVar);
    }

    public final tu.o getCallFactoryLazy() {
        return this.f4120e;
    }

    public final a7.b getComponentRegistry() {
        return this.f4122g;
    }

    @Override // a7.m
    public a7.b getComponents() {
        return this.f4129n;
    }

    public final Context getContext() {
        return this.f4116a;
    }

    @Override // a7.m
    public l7.c getDefaults() {
        return this.f4117b;
    }

    @Override // a7.m
    public d7.d getDiskCache() {
        return (d7.d) this.f4128m.getValue();
    }

    public final tu.o getDiskCacheLazy() {
        return this.f4119d;
    }

    public final f getEventListenerFactory() {
        return this.f4121f;
    }

    public final q7.v getLogger() {
        return null;
    }

    @Override // a7.m
    public j7.f getMemoryCache() {
        return (j7.f) this.f4127l.getValue();
    }

    public final tu.o getMemoryCacheLazy() {
        return this.f4118c;
    }

    public final q7.s getOptions() {
        return this.f4123h;
    }

    @Override // a7.m
    public l newBuilder() {
        return new l(this);
    }

    public final void onTrimMemory$coil_base_release(int i10) {
        j7.f fVar;
        tu.o oVar = this.f4118c;
        if (oVar == null || (fVar = (j7.f) oVar.getValue()) == null) {
            return;
        }
        fVar.trimMemory(i10);
    }

    @Override // a7.m
    public void shutdown() {
        if (this.f4131p.getAndSet(true)) {
            return;
        }
        CoroutineScopeKt.cancel$default(this.f4124i, null, 1, null);
        this.f4125j.shutdown();
        j7.f memoryCache = getMemoryCache();
        if (memoryCache != null) {
            memoryCache.clear();
        }
    }
}
