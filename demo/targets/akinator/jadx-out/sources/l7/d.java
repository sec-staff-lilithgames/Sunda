package l7;

import android.graphics.Bitmap;
import androidx.lifecycle.k0;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f72535a;

    /* renamed from: b, reason: collision with root package name */
    public final m7.k f72536b;

    /* renamed from: c, reason: collision with root package name */
    public final m7.i f72537c;

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineDispatcher f72538d;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineDispatcher f72539e;

    /* renamed from: f, reason: collision with root package name */
    public final CoroutineDispatcher f72540f;

    /* renamed from: g, reason: collision with root package name */
    public final CoroutineDispatcher f72541g;

    /* renamed from: h, reason: collision with root package name */
    public final p7.c f72542h;

    /* renamed from: i, reason: collision with root package name */
    public final m7.f f72543i;

    /* renamed from: j, reason: collision with root package name */
    public final Bitmap.Config f72544j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f72545k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f72546l;

    /* renamed from: m, reason: collision with root package name */
    public final b f72547m;

    /* renamed from: n, reason: collision with root package name */
    public final b f72548n;

    /* renamed from: o, reason: collision with root package name */
    public final b f72549o;

    public d(k0 k0Var, m7.k kVar, m7.i iVar, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, p7.c cVar, m7.f fVar, Bitmap.Config config, Boolean bool, Boolean bool2, b bVar, b bVar2, b bVar3) {
        this.f72535a = k0Var;
        this.f72536b = kVar;
        this.f72537c = iVar;
        this.f72538d = coroutineDispatcher;
        this.f72539e = coroutineDispatcher2;
        this.f72540f = coroutineDispatcher3;
        this.f72541g = coroutineDispatcher4;
        this.f72542h = cVar;
        this.f72543i = fVar;
        this.f72544j = config;
        this.f72545k = bool;
        this.f72546l = bool2;
        this.f72547m = bVar;
        this.f72548n = bVar2;
        this.f72549o = bVar3;
    }

    public final d copy(k0 k0Var, m7.k kVar, m7.i iVar, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, p7.c cVar, m7.f fVar, Bitmap.Config config, Boolean bool, Boolean bool2, b bVar, b bVar2, b bVar3) {
        return new d(k0Var, kVar, iVar, coroutineDispatcher, coroutineDispatcher2, coroutineDispatcher3, coroutineDispatcher4, cVar, fVar, config, bool, bool2, bVar, bVar2, bVar3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return e0.areEqual(this.f72535a, dVar.f72535a) && e0.areEqual(this.f72536b, dVar.f72536b) && this.f72537c == dVar.f72537c && e0.areEqual(this.f72538d, dVar.f72538d) && e0.areEqual(this.f72539e, dVar.f72539e) && e0.areEqual(this.f72540f, dVar.f72540f) && e0.areEqual(this.f72541g, dVar.f72541g) && e0.areEqual(this.f72542h, dVar.f72542h) && this.f72543i == dVar.f72543i && this.f72544j == dVar.f72544j && e0.areEqual(this.f72545k, dVar.f72545k) && e0.areEqual(this.f72546l, dVar.f72546l) && this.f72547m == dVar.f72547m && this.f72548n == dVar.f72548n && this.f72549o == dVar.f72549o;
    }

    public final Boolean getAllowHardware() {
        return this.f72545k;
    }

    public final Boolean getAllowRgb565() {
        return this.f72546l;
    }

    public final Bitmap.Config getBitmapConfig() {
        return this.f72544j;
    }

    public final CoroutineDispatcher getDecoderDispatcher() {
        return this.f72540f;
    }

    public final b getDiskCachePolicy() {
        return this.f72548n;
    }

    public final CoroutineDispatcher getFetcherDispatcher() {
        return this.f72539e;
    }

    public final CoroutineDispatcher getInterceptorDispatcher() {
        return this.f72538d;
    }

    public final k0 getLifecycle() {
        return this.f72535a;
    }

    public final b getMemoryCachePolicy() {
        return this.f72547m;
    }

    public final b getNetworkCachePolicy() {
        return this.f72549o;
    }

    public final m7.f getPrecision() {
        return this.f72543i;
    }

    public final m7.i getScale() {
        return this.f72537c;
    }

    public final m7.k getSizeResolver() {
        return this.f72536b;
    }

    public final CoroutineDispatcher getTransformationDispatcher() {
        return this.f72541g;
    }

    public final p7.c getTransitionFactory() {
        return this.f72542h;
    }

    public int hashCode() {
        k0 k0Var = this.f72535a;
        int iHashCode = (k0Var != null ? k0Var.hashCode() : 0) * 31;
        m7.k kVar = this.f72536b;
        int iHashCode2 = (iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        m7.i iVar = this.f72537c;
        int iHashCode3 = (iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher = this.f72538d;
        int iHashCode4 = (iHashCode3 + (coroutineDispatcher != null ? coroutineDispatcher.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher2 = this.f72539e;
        int iHashCode5 = (iHashCode4 + (coroutineDispatcher2 != null ? coroutineDispatcher2.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher3 = this.f72540f;
        int iHashCode6 = (iHashCode5 + (coroutineDispatcher3 != null ? coroutineDispatcher3.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher4 = this.f72541g;
        int iHashCode7 = (iHashCode6 + (coroutineDispatcher4 != null ? coroutineDispatcher4.hashCode() : 0)) * 31;
        p7.c cVar = this.f72542h;
        int iHashCode8 = (iHashCode7 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        m7.f fVar = this.f72543i;
        int iHashCode9 = (iHashCode8 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        Bitmap.Config config = this.f72544j;
        int iHashCode10 = (iHashCode9 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.f72545k;
        int iHashCode11 = (iHashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f72546l;
        int iHashCode12 = (iHashCode11 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        b bVar = this.f72547m;
        int iHashCode13 = (iHashCode12 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        b bVar2 = this.f72548n;
        int iHashCode14 = (iHashCode13 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
        b bVar3 = this.f72549o;
        return iHashCode14 + (bVar3 != null ? bVar3.hashCode() : 0);
    }
}
