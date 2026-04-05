package j7;

import android.content.Context;
import q7.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f69153a;

    /* renamed from: b, reason: collision with root package name */
    public double f69154b;

    /* renamed from: c, reason: collision with root package name */
    public int f69155c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f69156d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f69157e = true;

    public c(Context context) {
        this.f69153a = context;
        this.f69154b = n.defaultMemoryCacheSizePercent(context);
    }

    public final f build() {
        l aVar;
        m kVar = this.f69157e ? new k() : new b();
        if (this.f69156d) {
            double d10 = this.f69154b;
            int iCalculateMemoryCacheSize = d10 > 0.0d ? n.calculateMemoryCacheSize(this.f69153a, d10) : this.f69155c;
            aVar = iCalculateMemoryCacheSize > 0 ? new i(iCalculateMemoryCacheSize, kVar) : new a(kVar);
        } else {
            aVar = new a(kVar);
        }
        return new h(aVar, kVar);
    }

    public final c maxSizeBytes(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("size must be >= 0.");
        }
        this.f69154b = 0.0d;
        this.f69155c = i10;
        return this;
    }

    public final c maxSizePercent(double d10) {
        if (0.0d > d10 || d10 > 1.0d) {
            throw new IllegalArgumentException("size must be in the range [0.0, 1.0].");
        }
        this.f69155c = 0;
        this.f69154b = d10;
        return this;
    }

    public final c strongReferencesEnabled(boolean z10) {
        this.f69156d = z10;
        return this;
    }

    public final c weakReferencesEnabled(boolean z10) {
        this.f69157e = z10;
        return this;
    }
}
