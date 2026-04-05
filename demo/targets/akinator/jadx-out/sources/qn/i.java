package qn;

import android.net.Uri;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.media3.common.util.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f83349a;

    /* renamed from: b, reason: collision with root package name */
    public final long f83350b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83351c;

    /* renamed from: d, reason: collision with root package name */
    public int f83352d;

    public i(String str, long j10, long j11) {
        this.f83351c = str == null ? "" : str;
        this.f83349a = j10;
        this.f83350b = j11;
    }

    public i attemptMerge(i iVar, String str) {
        String str2;
        i iVar2;
        String strResolveUriString = resolveUriString(str);
        if (iVar != null) {
            long j10 = iVar.f83350b;
            if (strResolveUriString.equals(iVar.resolveUriString(str))) {
                long j11 = this.f83350b;
                if (j11 != -1) {
                    str2 = strResolveUriString;
                    iVar2 = null;
                    long j12 = this.f83349a;
                    if (j12 + j11 == iVar.f83349a) {
                        return new i(str2, j12, j10 != -1 ? j11 + j10 : -1L);
                    }
                } else {
                    str2 = strResolveUriString;
                    iVar2 = null;
                }
                if (j10 == -1) {
                    return iVar2;
                }
                long j13 = iVar.f83349a;
                if (j13 + j10 == this.f83349a) {
                    return new i(str2, j13, j11 != -1 ? j10 + j11 : -1L);
                }
                return iVar2;
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f83349a == iVar.f83349a && this.f83350b == iVar.f83350b && this.f83351c.equals(iVar.f83351c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f83352d == 0) {
            this.f83352d = this.f83351c.hashCode() + ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + ((int) this.f83349a)) * 31) + ((int) this.f83350b)) * 31);
        }
        return this.f83352d;
    }

    public Uri resolveUri(String str) {
        return x0.resolveToUri(str, this.f83351c);
    }

    public String resolveUriString(String str) {
        return x0.resolve(str, this.f83351c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f83351c);
        sb2.append(", start=");
        sb2.append(this.f83349a);
        sb2.append(", length=");
        return a.b.g(this.f83350b, ")", sb2);
    }
}
