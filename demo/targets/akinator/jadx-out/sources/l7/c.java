package l7;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineDispatcher f72520a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineDispatcher f72521b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineDispatcher f72522c;

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineDispatcher f72523d;

    /* renamed from: e, reason: collision with root package name */
    public final p7.c f72524e;

    /* renamed from: f, reason: collision with root package name */
    public final m7.f f72525f;

    /* renamed from: g, reason: collision with root package name */
    public final Bitmap.Config f72526g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f72527h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f72528i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f72529j;

    /* renamed from: k, reason: collision with root package name */
    public final Drawable f72530k;

    /* renamed from: l, reason: collision with root package name */
    public final Drawable f72531l;

    /* renamed from: m, reason: collision with root package name */
    public final b f72532m;

    /* renamed from: n, reason: collision with root package name */
    public final b f72533n;

    /* renamed from: o, reason: collision with root package name */
    public final b f72534o;

    public c() {
        this(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);
    }

    public final c copy(CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, p7.c cVar, m7.f fVar, Bitmap.Config config, boolean z10, boolean z11, Drawable drawable, Drawable drawable2, Drawable drawable3, b bVar, b bVar2, b bVar3) {
        return new c(coroutineDispatcher, coroutineDispatcher2, coroutineDispatcher3, coroutineDispatcher4, cVar, fVar, config, z10, z11, drawable, drawable2, drawable3, bVar, bVar2, bVar3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return e0.areEqual(this.f72520a, cVar.f72520a) && e0.areEqual(this.f72521b, cVar.f72521b) && e0.areEqual(this.f72522c, cVar.f72522c) && e0.areEqual(this.f72523d, cVar.f72523d) && e0.areEqual(this.f72524e, cVar.f72524e) && this.f72525f == cVar.f72525f && this.f72526g == cVar.f72526g && this.f72527h == cVar.f72527h && this.f72528i == cVar.f72528i && e0.areEqual(this.f72529j, cVar.f72529j) && e0.areEqual(this.f72530k, cVar.f72530k) && e0.areEqual(this.f72531l, cVar.f72531l) && this.f72532m == cVar.f72532m && this.f72533n == cVar.f72533n && this.f72534o == cVar.f72534o;
    }

    public final boolean getAllowHardware() {
        return this.f72527h;
    }

    public final boolean getAllowRgb565() {
        return this.f72528i;
    }

    public final Bitmap.Config getBitmapConfig() {
        return this.f72526g;
    }

    public final CoroutineDispatcher getDecoderDispatcher() {
        return this.f72522c;
    }

    public final b getDiskCachePolicy() {
        return this.f72533n;
    }

    public final Drawable getError() {
        return this.f72530k;
    }

    public final Drawable getFallback() {
        return this.f72531l;
    }

    public final CoroutineDispatcher getFetcherDispatcher() {
        return this.f72521b;
    }

    public final CoroutineDispatcher getInterceptorDispatcher() {
        return this.f72520a;
    }

    public final b getMemoryCachePolicy() {
        return this.f72532m;
    }

    public final b getNetworkCachePolicy() {
        return this.f72534o;
    }

    public final Drawable getPlaceholder() {
        return this.f72529j;
    }

    public final m7.f getPrecision() {
        return this.f72525f;
    }

    public final CoroutineDispatcher getTransformationDispatcher() {
        return this.f72523d;
    }

    public final p7.c getTransitionFactory() {
        return this.f72524e;
    }

    public int hashCode() {
        int iC = com.google.android.gms.internal.play_billing.a.c(com.google.android.gms.internal.play_billing.a.c((this.f72526g.hashCode() + ((this.f72525f.hashCode() + ((this.f72524e.hashCode() + ((this.f72523d.hashCode() + ((this.f72522c.hashCode() + ((this.f72521b.hashCode() + (this.f72520a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f72527h), 31, this.f72528i);
        Drawable drawable = this.f72529j;
        int iHashCode = (iC + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.f72530k;
        int iHashCode2 = (iHashCode + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.f72531l;
        return this.f72534o.hashCode() + ((this.f72533n.hashCode() + ((this.f72532m.hashCode() + ((iHashCode2 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public c(CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, p7.c cVar, m7.f fVar, Bitmap.Config config, boolean z10, boolean z11, Drawable drawable, Drawable drawable2, Drawable drawable3, b bVar, b bVar2, b bVar3) {
        this.f72520a = coroutineDispatcher;
        this.f72521b = coroutineDispatcher2;
        this.f72522c = coroutineDispatcher3;
        this.f72523d = coroutineDispatcher4;
        this.f72524e = cVar;
        this.f72525f = fVar;
        this.f72526g = config;
        this.f72527h = z10;
        this.f72528i = z11;
        this.f72529j = drawable;
        this.f72530k = drawable2;
        this.f72531l = drawable3;
        this.f72532m = bVar;
        this.f72533n = bVar2;
        this.f72534o = bVar3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c(CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, p7.c cVar, m7.f fVar, Bitmap.Config config, boolean z10, boolean z11, Drawable drawable, Drawable drawable2, Drawable drawable3, b bVar, b bVar2, b bVar3, int i10, kotlin.jvm.internal.u uVar) {
        CoroutineDispatcher immediate = (i10 & 1) != 0 ? Dispatchers.getMain().getImmediate() : coroutineDispatcher;
        CoroutineDispatcher io2 = (i10 & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher2;
        CoroutineDispatcher io3 = (i10 & 4) != 0 ? Dispatchers.getIO() : coroutineDispatcher3;
        CoroutineDispatcher io4 = (i10 & 8) != 0 ? Dispatchers.getIO() : coroutineDispatcher4;
        p7.c cVar2 = (i10 & 16) != 0 ? p7.c.f80723a : cVar;
        m7.f fVar2 = (i10 & 32) != 0 ? m7.f.f74057e : fVar;
        Bitmap.Config default_bitmap_config = (i10 & 64) != 0 ? q7.n.getDEFAULT_BITMAP_CONFIG() : config;
        boolean z12 = (i10 & 128) != 0 ? true : z10;
        boolean z13 = (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? false : z11;
        Drawable drawable4 = (i10 & 512) != 0 ? null : drawable;
        Drawable drawable5 = (i10 & 1024) != 0 ? null : drawable2;
        Drawable drawable6 = (i10 & 2048) == 0 ? drawable3 : null;
        int i11 = i10 & 4096;
        b bVar4 = b.ENABLED;
        this(immediate, io2, io3, io4, cVar2, fVar2, default_bitmap_config, z12, z13, drawable4, drawable5, drawable6, i11 != 0 ? bVar4 : bVar, (i10 & Segment.SIZE) != 0 ? bVar4 : bVar2, (i10 & 16384) != 0 ? bVar4 : bVar3);
    }
}
