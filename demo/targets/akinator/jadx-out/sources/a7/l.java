package a7;

import a7.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import kotlinx.coroutines.CoroutineDispatcher;
import p7.a;
import xv.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4105a;

    /* renamed from: b, reason: collision with root package name */
    public l7.c f4106b;

    /* renamed from: c, reason: collision with root package name */
    public tu.o f4107c;

    /* renamed from: d, reason: collision with root package name */
    public tu.o f4108d;

    /* renamed from: e, reason: collision with root package name */
    public tu.o f4109e;

    /* renamed from: f, reason: collision with root package name */
    public f f4110f;

    /* renamed from: g, reason: collision with root package name */
    public b f4111g;

    /* renamed from: h, reason: collision with root package name */
    public q7.s f4112h;

    public l(Context context) {
        this.f4105a = context.getApplicationContext();
        this.f4106b = q7.l.getDEFAULT_REQUEST_OPTIONS();
        this.f4107c = null;
        this.f4108d = null;
        this.f4109e = null;
        this.f4110f = null;
        this.f4111g = null;
        this.f4112h = new q7.s(false, false, false, 0, null, 31, null);
    }

    public final l addLastModifiedToFileCacheKey(boolean z10) {
        this.f4112h = q7.s.copy$default(this.f4112h, z10, false, false, 0, null, 30, null);
        return this;
    }

    public final l allowHardware(boolean z10) {
        l7.c cVar = this.f4106b;
        this.f4106b = cVar.copy((32639 & 1) != 0 ? cVar.f72520a : null, (32639 & 2) != 0 ? cVar.f72521b : null, (32639 & 4) != 0 ? cVar.f72522c : null, (32639 & 8) != 0 ? cVar.f72523d : null, (32639 & 16) != 0 ? cVar.f72524e : null, (32639 & 32) != 0 ? cVar.f72525f : null, (32639 & 64) != 0 ? cVar.f72526g : null, (32639 & 128) != 0 ? cVar.f72527h : z10, (32639 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? cVar.f72528i : false, (32639 & 512) != 0 ? cVar.f72529j : null, (32639 & 1024) != 0 ? cVar.f72530k : null, (32639 & 2048) != 0 ? cVar.f72531l : null, (32639 & 4096) != 0 ? cVar.f72532m : null, (32639 & Segment.SIZE) != 0 ? cVar.f72533n : null, (32639 & 16384) != 0 ? cVar.f72534o : null);
        return this;
    }

    public final l allowRgb565(boolean z10) {
        l7.c cVar = this.f4106b;
        this.f4106b = cVar.copy((32639 & 1) != 0 ? cVar.f72520a : null, (32639 & 2) != 0 ? cVar.f72521b : null, (32639 & 4) != 0 ? cVar.f72522c : null, (32639 & 8) != 0 ? cVar.f72523d : null, (32639 & 16) != 0 ? cVar.f72524e : null, (32639 & 32) != 0 ? cVar.f72525f : null, (32639 & 64) != 0 ? cVar.f72526g : null, (32639 & 128) != 0 ? cVar.f72527h : false, (32639 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? cVar.f72528i : z10, (32639 & 512) != 0 ? cVar.f72529j : null, (32639 & 1024) != 0 ? cVar.f72530k : null, (32639 & 2048) != 0 ? cVar.f72531l : null, (32639 & 4096) != 0 ? cVar.f72532m : null, (32639 & Segment.SIZE) != 0 ? cVar.f72533n : null, (32639 & 16384) != 0 ? cVar.f72534o : null);
        return this;
    }

    @tu.f
    public final l availableMemoryPercentage(double d10) {
        q7.n.unsupported();
        throw new tu.k();
    }

    public final l bitmapConfig(Bitmap.Config config) {
        l7.c cVar = this.f4106b;
        this.f4106b = cVar.copy((32639 & 1) != 0 ? cVar.f72520a : null, (32639 & 2) != 0 ? cVar.f72521b : null, (32639 & 4) != 0 ? cVar.f72522c : null, (32639 & 8) != 0 ? cVar.f72523d : null, (32639 & 16) != 0 ? cVar.f72524e : null, (32639 & 32) != 0 ? cVar.f72525f : null, (32639 & 64) != 0 ? cVar.f72526g : config, (32639 & 128) != 0 ? cVar.f72527h : false, (32639 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? cVar.f72528i : false, (32639 & 512) != 0 ? cVar.f72529j : null, (32639 & 1024) != 0 ? cVar.f72530k : null, (32639 & 2048) != 0 ? cVar.f72531l : null, (32639 & 4096) != 0 ? cVar.f72532m : null, (32639 & Segment.SIZE) != 0 ? cVar.f72533n : null, (32639 & 16384) != 0 ? cVar.f72534o : null);
        return this;
    }

    public final l bitmapFactoryExifOrientationPolicy(c7.n nVar) {
        this.f4112h = q7.s.copy$default(this.f4112h, false, false, false, 0, nVar, 15, null);
        return this;
    }

    public final l bitmapFactoryMaxParallelism(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxParallelism must be > 0.");
        }
        this.f4112h = q7.s.copy$default(this.f4112h, false, false, false, i10, null, 23, null);
        return this;
    }

    public final m build() {
        l7.c cVar = this.f4106b;
        tu.o oVarLazy = this.f4107c;
        if (oVarLazy == null) {
            oVarLazy = tu.q.lazy(new h(this));
        }
        tu.o oVar = oVarLazy;
        tu.o oVarLazy2 = this.f4108d;
        if (oVarLazy2 == null) {
            oVarLazy2 = tu.q.lazy(new i(this));
        }
        tu.o oVar2 = oVarLazy2;
        tu.o oVarLazy3 = this.f4109e;
        if (oVarLazy3 == null) {
            oVarLazy3 = tu.q.lazy(j.f4103e);
        }
        tu.o oVar3 = oVarLazy3;
        f fVar = this.f4110f;
        if (fVar == null) {
            fVar = f.f4099t8;
        }
        f fVar2 = fVar;
        b bVar = this.f4111g;
        if (bVar == null) {
            bVar = new b();
        }
        return new q(this.f4105a, cVar, oVar, oVar2, oVar3, fVar2, bVar, this.f4112h, null);
    }

    public final l callFactory(xv.i iVar) {
        this.f4109e = tu.r.lazyOf(iVar);
        return this;
    }

    @tu.f
    public final /* synthetic */ l componentRegistry(kv.l lVar) {
        q7.n.unsupported();
        throw new tu.k();
    }

    public final /* synthetic */ l components(kv.l lVar) {
        b.a aVar = new b.a();
        lVar.invoke(aVar);
        return components(aVar.build());
    }

    public final l crossfade(boolean z10) {
        return crossfade(z10 ? 100 : 0);
    }

    public final l decoderDispatcher(CoroutineDispatcher coroutineDispatcher) {
        l7.c cVar = this.f4106b;
        this.f4106b = cVar.copy((32639 & 1) != 0 ? cVar.f72520a : null, (32639 & 2) != 0 ? cVar.f72521b : null, (32639 & 4) != 0 ? cVar.f72522c : coroutineDispatcher, (32639 & 8) != 0 ? cVar.f72523d : null, (32639 & 16) != 0 ? cVar.f72524e : null, (32639 & 32) != 0 ? cVar.f72525f : null, (32639 & 64) != 0 ? cVar.f72526g : null, (32639 & 128) != 0 ? cVar.f72527h : false, (32639 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? cVar.f72528i : false, (32639 & 512) != 0 ? cVar.f72529j : null, (32639 & 1024) != 0 ? cVar.f72530k : null, (32639 & 2048) != 0 ? cVar.f72531l : null, (32639 & 4096) != 0 ? cVar.f72532m : null, (32639 & Segment.SIZE) != 0 ? cVar.f72533n : null, (32639 & 16384) != 0 ? cVar.f72534o : null);
        return this;
    }

    public final l diskCache(d7.d dVar) {
        this.f4108d = tu.r.lazyOf(dVar);
        return this;
    }

    public final l diskCachePolicy(l7.b bVar) {
        l7.c cVar = this.f4106b;
        this.f4106b = cVar.copy((32639 & 1) != 0 ? cVar.f72520a : null, (32639 & 2) != 0 ? cVar.f72521b : null, (32639 & 4) != 0 ? cVar.f72522c : null, (32639 & 8) != 0 ? cVar.f72523d : null, (32639 & 16) != 0 ? cVar.f72524e : null, (32639 & 32) != 0 ? cVar.f72525f : null, (32639 & 64) != 0 ? cVar.f72526g : null, (32639 & 128) != 0 ? cVar.f72527h : false, (32639 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? cVar.f72528i : false, (32639 & 512) != 0 ? cVar.f72529j : null, (32639 & 1024) != 0 ? cVar.f72530k : null, (32639 & 2048) != 0 ? cVar.f72531l : null, (32639 & 4096) != 0 ? cVar.f72532m : null, (32639 & Segment.SIZE) != 0 ? cVar.f72533n : bVar, (32639 & 16384) != 0 ? cVar.f72534o : null);
        return this;
    }

    public final l dispatcher(CoroutineDispatcher coroutineDispatcher) {
        l7.c cVar = this.f4106b;
        this.f4106b = cVar.copy((32639 & 1) != 0 ? cVar.f72520a : null, (32639 & 2) != 0 ? cVar.f72521b : coroutineDispatcher, (32639 & 4) != 0 ? cVar.f72522c : coroutineDispatcher, (32639 & 8) != 0 ? cVar.f72523d : coroutineDispatcher, (32639 & 16) != 0 ? cVar.f72524e : null, (32639 & 32) != 0 ? cVar.f72525f : null, (32639 & 64) != 0 ? cVar.f72526g : null, (32639 & 128) != 0 ? cVar.f72527h : false, (32639 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? cVar.f72528i : false, (32639 & 512) != 0 ? cVar.f72529j : null, (32639 & 1024) != 0 ? cVar.f72530k : null, (32639 & 2048) != 0 ? cVar.f72531l : null, (32639 & 4096) != 0 ? cVar.f72532m : null, (32639 & Segment.SIZE) != 0 ? cVar.f72533n : null, (32639 & 16384) != 0 ? cVar.f72534o : null);
        return this;
    }

    public final l error(int i10) {
        return error(q7.d.getDrawableCompat(this.f4105a, i10));
    }

    public final l eventListener(g gVar) {
        return eventListenerFactory(new k(gVar));
    }

    public final l eventListenerFactory(f fVar) {
        this.f4110f = fVar;
        return this;
    }

    public final l fallback(int i10) {
        return fallback(q7.d.getDrawableCompat(this.f4105a, i10));
    }

    public final l fetcherDispatcher(CoroutineDispatcher coroutineDispatcher) {
        l7.c cVar = this.f4106b;
        this.f4106b = cVar.copy((32639 & 1) != 0 ? cVar.f72520a : null, (32639 & 2) != 0 ? cVar.f72521b : coroutineDispatcher, (32639 & 4) != 0 ? cVar.f72522c : null, (32639 & 8) != 0 ? cVar.f72523d : null, (32639 & 16) != 0 ? cVar.f72524e : null, (32639 & 32) != 0 ? cVar.f72525f : null, (32639 & 64) != 0 ? cVar.f72526g : null, (32639 & 128) != 0 ? cVar.f72527h : false, (32639 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? cVar.f72528i : false, (32639 & 512) != 0 ? cVar.f72529j : null, (32639 & 1024) != 0 ? cVar.f72530k : null, (32639 & 2048) != 0 ? cVar.f72531l : null, (32639 & 4096) != 0 ? cVar.f72532m : null, (32639 & Segment.SIZE) != 0 ? cVar.f72533n : null, (32639 & 16384) != 0 ? cVar.f72534o : null);
        return this;
    }

    public final l interceptorDispatcher(CoroutineDispatcher coroutineDispatcher) {
        l7.c cVar = this.f4106b;
        this.f4106b = cVar.copy((32639 & 1) != 0 ? cVar.f72520a : coroutineDispatcher, (32639 & 2) != 0 ? cVar.f72521b : null, (32639 & 4) != 0 ? cVar.f72522c : null, (32639 & 8) != 0 ? cVar.f72523d : null, (32639 & 16) != 0 ? cVar.f72524e : null, (32639 & 32) != 0 ? cVar.f72525f : null, (32639 & 64) != 0 ? cVar.f72526g : null, (32639 & 128) != 0 ? cVar.f72527h : false, (32639 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? cVar.f72528i : false, (32639 & 512) != 0 ? cVar.f72529j : null, (32639 & 1024) != 0 ? cVar.f72530k : null, (32639 & 2048) != 0 ? cVar.f72531l : null, (32639 & 4096) != 0 ? cVar.f72532m : null, (32639 & Segment.SIZE) != 0 ? cVar.f72533n : null, (32639 & 16384) != 0 ? cVar.f72534o : null);
        return this;
    }

    @tu.f
    public final l launchInterceptorChainOnMainThread(boolean z10) {
        q7.n.unsupported();
        throw new tu.k();
    }

    public final l memoryCache(j7.f fVar) {
        this.f4107c = tu.r.lazyOf(fVar);
        return this;
    }

    public final l memoryCachePolicy(l7.b bVar) {
        l7.c cVar = this.f4106b;
        this.f4106b = cVar.copy((32639 & 1) != 0 ? cVar.f72520a : null, (32639 & 2) != 0 ? cVar.f72521b : null, (32639 & 4) != 0 ? cVar.f72522c : null, (32639 & 8) != 0 ? cVar.f72523d : null, (32639 & 16) != 0 ? cVar.f72524e : null, (32639 & 32) != 0 ? cVar.f72525f : null, (32639 & 64) != 0 ? cVar.f72526g : null, (32639 & 128) != 0 ? cVar.f72527h : false, (32639 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? cVar.f72528i : false, (32639 & 512) != 0 ? cVar.f72529j : null, (32639 & 1024) != 0 ? cVar.f72530k : null, (32639 & 2048) != 0 ? cVar.f72531l : null, (32639 & 4096) != 0 ? cVar.f72532m : bVar, (32639 & Segment.SIZE) != 0 ? cVar.f72533n : null, (32639 & 16384) != 0 ? cVar.f72534o : null);
        return this;
    }

    public final l networkCachePolicy(l7.b bVar) {
        l7.c cVar = this.f4106b;
        this.f4106b = cVar.copy((32639 & 1) != 0 ? cVar.f72520a : null, (32639 & 2) != 0 ? cVar.f72521b : null, (32639 & 4) != 0 ? cVar.f72522c : null, (32639 & 8) != 0 ? cVar.f72523d : null, (32639 & 16) != 0 ? cVar.f72524e : null, (32639 & 32) != 0 ? cVar.f72525f : null, (32639 & 64) != 0 ? cVar.f72526g : null, (32639 & 128) != 0 ? cVar.f72527h : false, (32639 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? cVar.f72528i : false, (32639 & 512) != 0 ? cVar.f72529j : null, (32639 & 1024) != 0 ? cVar.f72530k : null, (32639 & 2048) != 0 ? cVar.f72531l : null, (32639 & 4096) != 0 ? cVar.f72532m : null, (32639 & Segment.SIZE) != 0 ? cVar.f72533n : null, (32639 & 16384) != 0 ? cVar.f72534o : bVar);
        return this;
    }

    public final l networkObserverEnabled(boolean z10) {
        this.f4112h = q7.s.copy$default(this.f4112h, false, z10, false, 0, null, 29, null);
        return this;
    }

    public final l okHttpClient(l0 l0Var) {
        return callFactory(l0Var);
    }

    public final l placeholder(int i10) {
        return placeholder(q7.d.getDrawableCompat(this.f4105a, i10));
    }

    public final l precision(m7.f fVar) {
        l7.c cVar = this.f4106b;
        this.f4106b = cVar.copy((32639 & 1) != 0 ? cVar.f72520a : null, (32639 & 2) != 0 ? cVar.f72521b : null, (32639 & 4) != 0 ? cVar.f72522c : null, (32639 & 8) != 0 ? cVar.f72523d : null, (32639 & 16) != 0 ? cVar.f72524e : null, (32639 & 32) != 0 ? cVar.f72525f : fVar, (32639 & 64) != 0 ? cVar.f72526g : null, (32639 & 128) != 0 ? cVar.f72527h : false, (32639 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? cVar.f72528i : false, (32639 & 512) != 0 ? cVar.f72529j : null, (32639 & 1024) != 0 ? cVar.f72530k : null, (32639 & 2048) != 0 ? cVar.f72531l : null, (32639 & 4096) != 0 ? cVar.f72532m : null, (32639 & Segment.SIZE) != 0 ? cVar.f72533n : null, (32639 & 16384) != 0 ? cVar.f72534o : null);
        return this;
    }

    public final l respectCacheHeaders(boolean z10) {
        this.f4112h = q7.s.copy$default(this.f4112h, false, false, z10, 0, null, 27, null);
        return this;
    }

    @tu.f
    public final l trackWeakReferences(boolean z10) {
        q7.n.unsupported();
        throw new tu.k();
    }

    public final l transformationDispatcher(CoroutineDispatcher coroutineDispatcher) {
        l7.c cVar = this.f4106b;
        this.f4106b = cVar.copy((32639 & 1) != 0 ? cVar.f72520a : null, (32639 & 2) != 0 ? cVar.f72521b : null, (32639 & 4) != 0 ? cVar.f72522c : null, (32639 & 8) != 0 ? cVar.f72523d : coroutineDispatcher, (32639 & 16) != 0 ? cVar.f72524e : null, (32639 & 32) != 0 ? cVar.f72525f : null, (32639 & 64) != 0 ? cVar.f72526g : null, (32639 & 128) != 0 ? cVar.f72527h : false, (32639 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? cVar.f72528i : false, (32639 & 512) != 0 ? cVar.f72529j : null, (32639 & 1024) != 0 ? cVar.f72530k : null, (32639 & 2048) != 0 ? cVar.f72531l : null, (32639 & 4096) != 0 ? cVar.f72532m : null, (32639 & Segment.SIZE) != 0 ? cVar.f72533n : null, (32639 & 16384) != 0 ? cVar.f72534o : null);
        return this;
    }

    @tu.f
    public final l transition(p7.d dVar) {
        q7.n.unsupported();
        throw new tu.k();
    }

    public final l transitionFactory(p7.c cVar) {
        l7.c cVar2 = this.f4106b;
        this.f4106b = cVar2.copy((32639 & 1) != 0 ? cVar2.f72520a : null, (32639 & 2) != 0 ? cVar2.f72521b : null, (32639 & 4) != 0 ? cVar2.f72522c : null, (32639 & 8) != 0 ? cVar2.f72523d : null, (32639 & 16) != 0 ? cVar2.f72524e : cVar, (32639 & 32) != 0 ? cVar2.f72525f : null, (32639 & 64) != 0 ? cVar2.f72526g : null, (32639 & 128) != 0 ? cVar2.f72527h : false, (32639 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? cVar2.f72528i : false, (32639 & 512) != 0 ? cVar2.f72529j : null, (32639 & 1024) != 0 ? cVar2.f72530k : null, (32639 & 2048) != 0 ? cVar2.f72531l : null, (32639 & 4096) != 0 ? cVar2.f72532m : null, (32639 & Segment.SIZE) != 0 ? cVar2.f72533n : null, (32639 & 16384) != 0 ? cVar2.f72534o : null);
        return this;
    }

    public final l callFactory(kv.a aVar) {
        this.f4109e = tu.q.lazy(aVar);
        return this;
    }

    @tu.f
    public final l componentRegistry(b bVar) {
        q7.n.unsupported();
        throw new tu.k();
    }

    public final l components(b bVar) {
        this.f4111g = bVar;
        return this;
    }

    public final l crossfade(int i10) {
        p7.c c0760a;
        if (i10 > 0) {
            c0760a = new a.C0760a(i10, false, 2, null);
        } else {
            c0760a = p7.c.f80723a;
        }
        transitionFactory(c0760a);
        return this;
    }

    public final l diskCache(kv.a aVar) {
        this.f4108d = tu.q.lazy(aVar);
        return this;
    }

    public final l error(Drawable drawable) {
        l7.c cVar = this.f4106b;
        this.f4106b = cVar.copy((32639 & 1) != 0 ? cVar.f72520a : null, (32639 & 2) != 0 ? cVar.f72521b : null, (32639 & 4) != 0 ? cVar.f72522c : null, (32639 & 8) != 0 ? cVar.f72523d : null, (32639 & 16) != 0 ? cVar.f72524e : null, (32639 & 32) != 0 ? cVar.f72525f : null, (32639 & 64) != 0 ? cVar.f72526g : null, (32639 & 128) != 0 ? cVar.f72527h : false, (32639 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? cVar.f72528i : false, (32639 & 512) != 0 ? cVar.f72529j : null, (32639 & 1024) != 0 ? cVar.f72530k : drawable != null ? drawable.mutate() : null, (32639 & 2048) != 0 ? cVar.f72531l : null, (32639 & 4096) != 0 ? cVar.f72532m : null, (32639 & Segment.SIZE) != 0 ? cVar.f72533n : null, (32639 & 16384) != 0 ? cVar.f72534o : null);
        return this;
    }

    public final l fallback(Drawable drawable) {
        l7.c cVar = this.f4106b;
        this.f4106b = cVar.copy((32639 & 1) != 0 ? cVar.f72520a : null, (32639 & 2) != 0 ? cVar.f72521b : null, (32639 & 4) != 0 ? cVar.f72522c : null, (32639 & 8) != 0 ? cVar.f72523d : null, (32639 & 16) != 0 ? cVar.f72524e : null, (32639 & 32) != 0 ? cVar.f72525f : null, (32639 & 64) != 0 ? cVar.f72526g : null, (32639 & 128) != 0 ? cVar.f72527h : false, (32639 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? cVar.f72528i : false, (32639 & 512) != 0 ? cVar.f72529j : null, (32639 & 1024) != 0 ? cVar.f72530k : null, (32639 & 2048) != 0 ? cVar.f72531l : drawable != null ? drawable.mutate() : null, (32639 & 4096) != 0 ? cVar.f72532m : null, (32639 & Segment.SIZE) != 0 ? cVar.f72533n : null, (32639 & 16384) != 0 ? cVar.f72534o : null);
        return this;
    }

    public final l memoryCache(kv.a aVar) {
        this.f4107c = tu.q.lazy(aVar);
        return this;
    }

    public final l okHttpClient(kv.a aVar) {
        return callFactory(aVar);
    }

    public final l placeholder(Drawable drawable) {
        l7.c cVar = this.f4106b;
        this.f4106b = cVar.copy((32639 & 1) != 0 ? cVar.f72520a : null, (32639 & 2) != 0 ? cVar.f72521b : null, (32639 & 4) != 0 ? cVar.f72522c : null, (32639 & 8) != 0 ? cVar.f72523d : null, (32639 & 16) != 0 ? cVar.f72524e : null, (32639 & 32) != 0 ? cVar.f72525f : null, (32639 & 64) != 0 ? cVar.f72526g : null, (32639 & 128) != 0 ? cVar.f72527h : false, (32639 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? cVar.f72528i : false, (32639 & 512) != 0 ? cVar.f72529j : drawable != null ? drawable.mutate() : null, (32639 & 1024) != 0 ? cVar.f72530k : null, (32639 & 2048) != 0 ? cVar.f72531l : null, (32639 & 4096) != 0 ? cVar.f72532m : null, (32639 & Segment.SIZE) != 0 ? cVar.f72533n : null, (32639 & 16384) != 0 ? cVar.f72534o : null);
        return this;
    }

    public l(q qVar) {
        this.f4105a = qVar.getContext().getApplicationContext();
        this.f4106b = qVar.getDefaults();
        this.f4107c = qVar.getMemoryCacheLazy();
        this.f4108d = qVar.getDiskCacheLazy();
        this.f4109e = qVar.getCallFactoryLazy();
        this.f4110f = qVar.getEventListenerFactory();
        this.f4111g = qVar.getComponentRegistry();
        this.f4112h = qVar.getOptions();
        qVar.getLogger();
    }

    public final l logger(q7.v vVar) {
        return this;
    }
}
