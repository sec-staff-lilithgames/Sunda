package l7;

import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache$Key;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f72646a;

    /* renamed from: b, reason: collision with root package name */
    public final i f72647b;

    /* renamed from: c, reason: collision with root package name */
    public final c7.f f72648c;

    /* renamed from: d, reason: collision with root package name */
    public final MemoryCache$Key f72649d;

    /* renamed from: e, reason: collision with root package name */
    public final String f72650e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f72651f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f72652g;

    public /* synthetic */ s(Drawable drawable, i iVar, c7.f fVar, MemoryCache$Key memoryCache$Key, String str, boolean z10, boolean z11, int i10, kotlin.jvm.internal.u uVar) {
        this(drawable, iVar, fVar, (i10 & 8) != 0 ? null : memoryCache$Key, (i10 & 16) != 0 ? null : str, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? false : z11);
    }

    public static /* synthetic */ s copy$default(s sVar, Drawable drawable, i iVar, c7.f fVar, MemoryCache$Key memoryCache$Key, String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            drawable = sVar.getDrawable();
        }
        if ((i10 & 2) != 0) {
            iVar = sVar.getRequest();
        }
        if ((i10 & 4) != 0) {
            fVar = sVar.f72648c;
        }
        if ((i10 & 8) != 0) {
            memoryCache$Key = sVar.f72649d;
        }
        if ((i10 & 16) != 0) {
            str = sVar.f72650e;
        }
        if ((i10 & 32) != 0) {
            z10 = sVar.f72651f;
        }
        if ((i10 & 64) != 0) {
            z11 = sVar.f72652g;
        }
        boolean z12 = z10;
        boolean z13 = z11;
        String str2 = str;
        c7.f fVar2 = fVar;
        return sVar.copy(drawable, iVar, fVar2, memoryCache$Key, str2, z12, z13);
    }

    public final s copy(Drawable drawable, i iVar, c7.f fVar, MemoryCache$Key memoryCache$Key, String str, boolean z10, boolean z11) {
        return new s(drawable, iVar, fVar, memoryCache$Key, str, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return e0.areEqual(getDrawable(), sVar.getDrawable()) && e0.areEqual(getRequest(), sVar.getRequest()) && this.f72648c == sVar.f72648c && e0.areEqual(this.f72649d, sVar.f72649d) && e0.areEqual(this.f72650e, sVar.f72650e) && this.f72651f == sVar.f72651f && this.f72652g == sVar.f72652g;
    }

    public final c7.f getDataSource() {
        return this.f72648c;
    }

    public final String getDiskCacheKey() {
        return this.f72650e;
    }

    @Override // l7.k
    public Drawable getDrawable() {
        return this.f72646a;
    }

    public final MemoryCache$Key getMemoryCacheKey() {
        return this.f72649d;
    }

    @Override // l7.k
    public i getRequest() {
        return this.f72647b;
    }

    public int hashCode() {
        int iHashCode = (this.f72648c.hashCode() + ((getRequest().hashCode() + (getDrawable().hashCode() * 31)) * 31)) * 31;
        MemoryCache$Key memoryCache$Key = this.f72649d;
        int iHashCode2 = (iHashCode + (memoryCache$Key != null ? memoryCache$Key.hashCode() : 0)) * 31;
        String str = this.f72650e;
        return Boolean.hashCode(this.f72652g) + com.google.android.gms.internal.play_billing.a.c((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f72651f);
    }

    public final boolean isPlaceholderCached() {
        return this.f72652g;
    }

    public final boolean isSampled() {
        return this.f72651f;
    }

    public s(Drawable drawable, i iVar, c7.f fVar, MemoryCache$Key memoryCache$Key, String str, boolean z10, boolean z11) {
        super(null);
        this.f72646a = drawable;
        this.f72647b = iVar;
        this.f72648c = fVar;
        this.f72649d = memoryCache$Key;
        this.f72650e = str;
        this.f72651f = z10;
        this.f72652g = z11;
    }
}
