package io.bidmachine.media3.exoplayer;

import com.ironsource.mediationsdk.logger.IronSourceError;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f61293a;

    /* renamed from: b, reason: collision with root package name */
    public final io.bidmachine.media3.common.b f61294b;

    /* renamed from: c, reason: collision with root package name */
    public final io.bidmachine.media3.common.b f61295c;

    /* renamed from: d, reason: collision with root package name */
    public final int f61296d;

    /* renamed from: e, reason: collision with root package name */
    public final int f61297e;

    public k(String str, io.bidmachine.media3.common.b bVar, io.bidmachine.media3.common.b bVar2, int i10, int i11) {
        io.bidmachine.media3.common.util.a.checkArgument(i10 == 0 || i11 == 0);
        this.f61293a = io.bidmachine.media3.common.util.a.checkNotEmpty(str);
        this.f61294b = (io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkNotNull(bVar);
        this.f61295c = (io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkNotNull(bVar2);
        this.f61296d = i10;
        this.f61297e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f61296d == kVar.f61296d && this.f61297e == kVar.f61297e && this.f61293a.equals(kVar.f61293a) && this.f61294b.equals(kVar.f61294b) && this.f61295c.equals(kVar.f61295c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f61295c.hashCode() + ((this.f61294b.hashCode() + o2.e((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f61296d) * 31) + this.f61297e) * 31, 31, this.f61293a)) * 31);
    }
}
