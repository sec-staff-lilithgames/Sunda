package f9;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.app.NotificationCompat;
import b9.m;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import j9.s;
import java.util.Map;
import n8.q;
import n8.r;
import n8.u;
import n8.v;
import p8.z;
import x8.a0;
import x8.d0;
import x8.f0;
import x8.h1;
import x8.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class a implements Cloneable {
    public boolean B;

    /* renamed from: b, reason: collision with root package name */
    public int f55516b;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f55520g;

    /* renamed from: h, reason: collision with root package name */
    public int f55521h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f55522i;

    /* renamed from: j, reason: collision with root package name */
    public int f55523j;

    /* renamed from: o, reason: collision with root package name */
    public boolean f55528o;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f55530q;

    /* renamed from: r, reason: collision with root package name */
    public int f55531r;

    /* renamed from: v, reason: collision with root package name */
    public boolean f55535v;

    /* renamed from: w, reason: collision with root package name */
    public Resources.Theme f55536w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f55537x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f55538y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f55539z;

    /* renamed from: c, reason: collision with root package name */
    public float f55517c = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public z f55518e = z.f80914c;

    /* renamed from: f, reason: collision with root package name */
    public com.bumptech.glide.l f55519f = com.bumptech.glide.l.f16579e;

    /* renamed from: k, reason: collision with root package name */
    public boolean f55524k = true;

    /* renamed from: l, reason: collision with root package name */
    public int f55525l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f55526m = -1;

    /* renamed from: n, reason: collision with root package name */
    public q f55527n = i9.c.obtain();

    /* renamed from: p, reason: collision with root package name */
    public boolean f55529p = true;

    /* renamed from: s, reason: collision with root package name */
    public v f55532s = new v();

    /* renamed from: t, reason: collision with root package name */
    public j9.c f55533t = new j9.c();

    /* renamed from: u, reason: collision with root package name */
    public Class f55534u = Object.class;
    public boolean A = true;

    public static boolean a(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public a apply(a aVar) {
        if (this.f55537x) {
            return mo370clone().apply(aVar);
        }
        if (a(aVar.f55516b, 2)) {
            this.f55517c = aVar.f55517c;
        }
        if (a(aVar.f55516b, 262144)) {
            this.f55538y = aVar.f55538y;
        }
        if (a(aVar.f55516b, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES)) {
            this.B = aVar.B;
        }
        if (a(aVar.f55516b, 4)) {
            this.f55518e = aVar.f55518e;
        }
        if (a(aVar.f55516b, 8)) {
            this.f55519f = aVar.f55519f;
        }
        if (a(aVar.f55516b, 16)) {
            this.f55520g = aVar.f55520g;
            this.f55521h = 0;
            this.f55516b &= -33;
        }
        if (a(aVar.f55516b, 32)) {
            this.f55521h = aVar.f55521h;
            this.f55520g = null;
            this.f55516b &= -17;
        }
        if (a(aVar.f55516b, 64)) {
            this.f55522i = aVar.f55522i;
            this.f55523j = 0;
            this.f55516b &= -129;
        }
        if (a(aVar.f55516b, 128)) {
            this.f55523j = aVar.f55523j;
            this.f55522i = null;
            this.f55516b &= -65;
        }
        if (a(aVar.f55516b, NotificationCompat.FLAG_LOCAL_ONLY)) {
            this.f55524k = aVar.f55524k;
        }
        if (a(aVar.f55516b, 512)) {
            this.f55526m = aVar.f55526m;
            this.f55525l = aVar.f55525l;
        }
        if (a(aVar.f55516b, 1024)) {
            this.f55527n = aVar.f55527n;
        }
        if (a(aVar.f55516b, 4096)) {
            this.f55534u = aVar.f55534u;
        }
        if (a(aVar.f55516b, Segment.SIZE)) {
            this.f55530q = aVar.f55530q;
            this.f55531r = 0;
            this.f55516b &= -16385;
        }
        if (a(aVar.f55516b, 16384)) {
            this.f55531r = aVar.f55531r;
            this.f55530q = null;
            this.f55516b &= -8193;
        }
        if (a(aVar.f55516b, 32768)) {
            this.f55536w = aVar.f55536w;
        }
        if (a(aVar.f55516b, C.DEFAULT_BUFFER_SEGMENT_SIZE)) {
            this.f55529p = aVar.f55529p;
        }
        if (a(aVar.f55516b, 131072)) {
            this.f55528o = aVar.f55528o;
        }
        if (a(aVar.f55516b, 2048)) {
            this.f55533t.putAll((Map) aVar.f55533t);
            this.A = aVar.A;
        }
        if (a(aVar.f55516b, 524288)) {
            this.f55539z = aVar.f55539z;
        }
        if (!this.f55529p) {
            this.f55533t.clear();
            int i10 = this.f55516b;
            this.f55528o = false;
            this.f55516b = i10 & (-133121);
            this.A = true;
        }
        this.f55516b |= aVar.f55516b;
        this.f55532s.putAll(aVar.f55532s);
        e();
        return this;
    }

    public a autoClone() {
        if (this.f55535v && !this.f55537x) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f55537x = true;
        return lock();
    }

    public final a b(x xVar, x8.f fVar) {
        if (this.f55537x) {
            return mo370clone().b(xVar, fVar);
        }
        downsample(xVar);
        return g(fVar, false);
    }

    public final a c(u uVar) {
        if (this.f55537x) {
            return mo370clone().c(uVar);
        }
        this.f55532s.remove(uVar);
        e();
        return this;
    }

    public a centerCrop() {
        return h(x.f91881c, new x8.i());
    }

    public a centerInside() {
        return d(x.f91880b, new x8.j(), true);
    }

    public a circleCrop() {
        return h(x.f91880b, new x8.k());
    }

    public final a d(x xVar, x8.f fVar, boolean z10) {
        a aVarH = z10 ? h(xVar, fVar) : b(xVar, fVar);
        aVarH.A = true;
        return aVarH;
    }

    public a decode(Class<?> cls) {
        if (this.f55537x) {
            return mo370clone().decode(cls);
        }
        this.f55534u = (Class) j9.q.checkNotNull(cls);
        this.f55516b |= 4096;
        e();
        return this;
    }

    public a disallowHardwareConfig() {
        return set(a0.f91796i, Boolean.FALSE);
    }

    public a diskCacheStrategy(z zVar) {
        if (this.f55537x) {
            return mo370clone().diskCacheStrategy(zVar);
        }
        this.f55518e = (z) j9.q.checkNotNull(zVar);
        this.f55516b |= 4;
        e();
        return this;
    }

    public a dontAnimate() {
        return set(m.f8971b, Boolean.TRUE);
    }

    public a dontTransform() {
        if (this.f55537x) {
            return mo370clone().dontTransform();
        }
        this.f55533t.clear();
        int i10 = this.f55516b;
        this.f55528o = false;
        this.f55529p = false;
        this.f55516b = (i10 & (-133121)) | C.DEFAULT_BUFFER_SEGMENT_SIZE;
        this.A = true;
        e();
        return this;
    }

    public a downsample(x xVar) {
        return set(x.f91884f, j9.q.checkNotNull(xVar));
    }

    public final void e() {
        if (this.f55535v) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public a encodeFormat(Bitmap.CompressFormat compressFormat) {
        return set(x8.c.f91808c, j9.q.checkNotNull(compressFormat));
    }

    public a encodeQuality(int i10) {
        return set(x8.c.f91807b, Integer.valueOf(i10));
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return isEquivalentTo((a) obj);
        }
        return false;
    }

    public a error(Drawable drawable) {
        if (this.f55537x) {
            return mo370clone().error(drawable);
        }
        this.f55520g = drawable;
        int i10 = this.f55516b | 16;
        this.f55521h = 0;
        this.f55516b = i10 & (-33);
        e();
        return this;
    }

    public final a f(Class cls, n8.z zVar, boolean z10) {
        if (this.f55537x) {
            return mo370clone().f(cls, zVar, z10);
        }
        j9.q.checkNotNull(cls);
        j9.q.checkNotNull(zVar);
        this.f55533t.put(cls, zVar);
        int i10 = this.f55516b;
        this.f55529p = true;
        this.f55516b = 67584 | i10;
        this.A = false;
        if (z10) {
            this.f55516b = i10 | 198656;
            this.f55528o = true;
        }
        e();
        return this;
    }

    public a fallback(Drawable drawable) {
        if (this.f55537x) {
            return mo370clone().fallback(drawable);
        }
        this.f55530q = drawable;
        int i10 = this.f55516b | Segment.SIZE;
        this.f55531r = 0;
        this.f55516b = i10 & (-16385);
        e();
        return this;
    }

    public a fitCenter() {
        return d(x.f91879a, new f0(), true);
    }

    public a format(n8.b bVar) {
        j9.q.checkNotNull(bVar);
        return set(a0.f91793f, bVar).set(m.f8970a, bVar);
    }

    public a frame(long j10) {
        return set(h1.f91831d, Long.valueOf(j10));
    }

    public final a g(n8.z zVar, boolean z10) {
        if (this.f55537x) {
            return mo370clone().g(zVar, z10);
        }
        d0 d0Var = new d0(zVar, z10);
        f(Bitmap.class, zVar, z10);
        f(Drawable.class, d0Var, z10);
        f(BitmapDrawable.class, d0Var.asBitmapDrawable(), z10);
        f(b9.d.class, new b9.g(zVar), z10);
        e();
        return this;
    }

    public final z getDiskCacheStrategy() {
        return this.f55518e;
    }

    public final int getErrorId() {
        return this.f55521h;
    }

    public final Drawable getErrorPlaceholder() {
        return this.f55520g;
    }

    public final Drawable getFallbackDrawable() {
        return this.f55530q;
    }

    public final int getFallbackId() {
        return this.f55531r;
    }

    public final boolean getOnlyRetrieveFromCache() {
        return this.f55539z;
    }

    public final v getOptions() {
        return this.f55532s;
    }

    public final int getOverrideHeight() {
        return this.f55525l;
    }

    public final int getOverrideWidth() {
        return this.f55526m;
    }

    public final Drawable getPlaceholderDrawable() {
        return this.f55522i;
    }

    public final int getPlaceholderId() {
        return this.f55523j;
    }

    public final com.bumptech.glide.l getPriority() {
        return this.f55519f;
    }

    public final Class<?> getResourceClass() {
        return this.f55534u;
    }

    public final q getSignature() {
        return this.f55527n;
    }

    public final float getSizeMultiplier() {
        return this.f55517c;
    }

    public final Resources.Theme getTheme() {
        return this.f55536w;
    }

    public final Map<Class<?>, n8.z> getTransformations() {
        return this.f55533t;
    }

    public final boolean getUseAnimationPool() {
        return this.B;
    }

    public final boolean getUseUnlimitedSourceGeneratorsPool() {
        return this.f55538y;
    }

    public final a h(x xVar, x8.f fVar) {
        if (this.f55537x) {
            return mo370clone().h(xVar, fVar);
        }
        downsample(xVar);
        return transform(fVar);
    }

    public int hashCode() {
        return s.hashCode(this.f55536w, s.hashCode(this.f55527n, s.hashCode(this.f55534u, s.hashCode(this.f55533t, s.hashCode(this.f55532s, s.hashCode(this.f55519f, s.hashCode(this.f55518e, s.hashCode(this.f55539z, s.hashCode(this.f55538y, s.hashCode(this.f55529p, s.hashCode(this.f55528o, s.hashCode(this.f55526m, s.hashCode(this.f55525l, s.hashCode(this.f55524k, s.hashCode(this.f55530q, s.hashCode(this.f55531r, s.hashCode(this.f55522i, s.hashCode(this.f55523j, s.hashCode(this.f55520g, s.hashCode(this.f55521h, s.hashCode(this.f55517c)))))))))))))))))))));
    }

    public final boolean isDiskCacheStrategySet() {
        return a(this.f55516b, 4);
    }

    public final boolean isEquivalentTo(a aVar) {
        return Float.compare(aVar.f55517c, this.f55517c) == 0 && this.f55521h == aVar.f55521h && s.bothNullOrEqual(this.f55520g, aVar.f55520g) && this.f55523j == aVar.f55523j && s.bothNullOrEqual(this.f55522i, aVar.f55522i) && this.f55531r == aVar.f55531r && s.bothNullOrEqual(this.f55530q, aVar.f55530q) && this.f55524k == aVar.f55524k && this.f55525l == aVar.f55525l && this.f55526m == aVar.f55526m && this.f55528o == aVar.f55528o && this.f55529p == aVar.f55529p && this.f55538y == aVar.f55538y && this.f55539z == aVar.f55539z && this.f55518e.equals(aVar.f55518e) && this.f55519f == aVar.f55519f && this.f55532s.equals(aVar.f55532s) && this.f55533t.equals(aVar.f55533t) && this.f55534u.equals(aVar.f55534u) && s.bothNullOrEqual(this.f55527n, aVar.f55527n) && s.bothNullOrEqual(this.f55536w, aVar.f55536w);
    }

    public final boolean isLocked() {
        return this.f55535v;
    }

    public final boolean isMemoryCacheable() {
        return this.f55524k;
    }

    public final boolean isPrioritySet() {
        return a(this.f55516b, 8);
    }

    public final boolean isSkipMemoryCacheSet() {
        return a(this.f55516b, NotificationCompat.FLAG_LOCAL_ONLY);
    }

    public final boolean isTransformationAllowed() {
        return this.f55529p;
    }

    public final boolean isTransformationRequired() {
        return this.f55528o;
    }

    public final boolean isTransformationSet() {
        return a(this.f55516b, 2048);
    }

    public final boolean isValidOverride() {
        return s.isValidDimensions(this.f55526m, this.f55525l);
    }

    public a lock() {
        this.f55535v = true;
        return this;
    }

    public a onlyRetrieveFromCache(boolean z10) {
        if (this.f55537x) {
            return mo370clone().onlyRetrieveFromCache(z10);
        }
        this.f55539z = z10;
        this.f55516b |= 524288;
        e();
        return this;
    }

    public a optionalCenterCrop() {
        return b(x.f91881c, new x8.i());
    }

    public a optionalCenterInside() {
        return d(x.f91880b, new x8.j(), false);
    }

    public a optionalCircleCrop() {
        return b(x.f91881c, new x8.k());
    }

    public a optionalFitCenter() {
        return d(x.f91879a, new f0(), false);
    }

    public a optionalTransform(n8.z zVar) {
        return g(zVar, false);
    }

    public a override(int i10, int i11) {
        if (this.f55537x) {
            return mo370clone().override(i10, i11);
        }
        this.f55526m = i10;
        this.f55525l = i11;
        this.f55516b |= 512;
        e();
        return this;
    }

    public a placeholder(Drawable drawable) {
        if (this.f55537x) {
            return mo370clone().placeholder(drawable);
        }
        this.f55522i = drawable;
        int i10 = this.f55516b | 64;
        this.f55523j = 0;
        this.f55516b = i10 & (-129);
        e();
        return this;
    }

    public a priority(com.bumptech.glide.l lVar) {
        if (this.f55537x) {
            return mo370clone().priority(lVar);
        }
        this.f55519f = (com.bumptech.glide.l) j9.q.checkNotNull(lVar);
        this.f55516b |= 8;
        e();
        return this;
    }

    public <Y> a set(u uVar, Y y10) {
        if (this.f55537x) {
            return mo370clone().set(uVar, y10);
        }
        j9.q.checkNotNull(uVar);
        j9.q.checkNotNull(y10);
        this.f55532s.set(uVar, y10);
        e();
        return this;
    }

    public a signature(q qVar) {
        if (this.f55537x) {
            return mo370clone().signature(qVar);
        }
        this.f55527n = (q) j9.q.checkNotNull(qVar);
        this.f55516b |= 1024;
        e();
        return this;
    }

    public a sizeMultiplier(float f10) {
        if (this.f55537x) {
            return mo370clone().sizeMultiplier(f10);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f55517c = f10;
        this.f55516b |= 2;
        e();
        return this;
    }

    public a skipMemoryCache(boolean z10) {
        if (this.f55537x) {
            return mo370clone().skipMemoryCache(true);
        }
        this.f55524k = !z10;
        this.f55516b |= NotificationCompat.FLAG_LOCAL_ONLY;
        e();
        return this;
    }

    public a theme(Resources.Theme theme) {
        if (this.f55537x) {
            return mo370clone().theme(theme);
        }
        this.f55536w = theme;
        if (theme != null) {
            this.f55516b |= 32768;
            return set(z8.h.f97697b, theme);
        }
        this.f55516b &= -32769;
        return c(z8.h.f97697b);
    }

    public a timeout(int i10) {
        return set(v8.a.f89169b, Integer.valueOf(i10));
    }

    public a transform(n8.z zVar) {
        return g(zVar, true);
    }

    @Deprecated
    public a transforms(n8.z... zVarArr) {
        return g(new r(zVarArr), true);
    }

    public a useAnimationPool(boolean z10) {
        if (this.f55537x) {
            return mo370clone().useAnimationPool(z10);
        }
        this.B = z10;
        this.f55516b |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        e();
        return this;
    }

    public a useUnlimitedSourceGeneratorsPool(boolean z10) {
        if (this.f55537x) {
            return mo370clone().useUnlimitedSourceGeneratorsPool(z10);
        }
        this.f55538y = z10;
        this.f55516b |= 262144;
        e();
        return this;
    }

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public a mo370clone() {
        try {
            a aVar = (a) super.clone();
            v vVar = new v();
            aVar.f55532s = vVar;
            vVar.putAll(this.f55532s);
            j9.c cVar = new j9.c();
            aVar.f55533t = cVar;
            cVar.putAll((Map) this.f55533t);
            aVar.f55535v = false;
            aVar.f55537x = false;
            return aVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public <Y> a optionalTransform(Class<Y> cls, n8.z zVar) {
        return f(cls, zVar, false);
    }

    public a transform(n8.z... zVarArr) {
        if (zVarArr.length > 1) {
            return g(new r(zVarArr), true);
        }
        if (zVarArr.length == 1) {
            return transform(zVarArr[0]);
        }
        e();
        return this;
    }

    public a override(int i10) {
        return override(i10, i10);
    }

    public <Y> a transform(Class<Y> cls, n8.z zVar) {
        return f(cls, zVar, true);
    }

    public a error(int i10) {
        if (this.f55537x) {
            return mo370clone().error(i10);
        }
        this.f55521h = i10;
        int i11 = this.f55516b | 32;
        this.f55520g = null;
        this.f55516b = i11 & (-17);
        e();
        return this;
    }

    public a fallback(int i10) {
        if (this.f55537x) {
            return mo370clone().fallback(i10);
        }
        this.f55531r = i10;
        int i11 = this.f55516b | 16384;
        this.f55530q = null;
        this.f55516b = i11 & (-8193);
        e();
        return this;
    }

    public a placeholder(int i10) {
        if (this.f55537x) {
            return mo370clone().placeholder(i10);
        }
        this.f55523j = i10;
        int i11 = this.f55516b | 128;
        this.f55522i = null;
        this.f55516b = i11 & (-65);
        e();
        return this;
    }
}
