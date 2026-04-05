package io.ktor.http.content;

import io.ktor.http.CacheControl;
import io.ktor.util.date.GMTDate;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class CachingOptions {
    private final CacheControl cacheControl;
    private final GMTDate expires;

    /* JADX WARN: Multi-variable type inference failed */
    public CachingOptions() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CachingOptions copy$default(CachingOptions cachingOptions, CacheControl cacheControl, GMTDate gMTDate, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cacheControl = cachingOptions.cacheControl;
        }
        if ((i10 & 2) != 0) {
            gMTDate = cachingOptions.expires;
        }
        return cachingOptions.copy(cacheControl, gMTDate);
    }

    public final CacheControl component1() {
        return this.cacheControl;
    }

    public final GMTDate component2() {
        return this.expires;
    }

    public final CachingOptions copy(CacheControl cacheControl, GMTDate gMTDate) {
        return new CachingOptions(cacheControl, gMTDate);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachingOptions)) {
            return false;
        }
        CachingOptions cachingOptions = (CachingOptions) obj;
        return e0.areEqual(this.cacheControl, cachingOptions.cacheControl) && e0.areEqual(this.expires, cachingOptions.expires);
    }

    public final CacheControl getCacheControl() {
        return this.cacheControl;
    }

    public final GMTDate getExpires() {
        return this.expires;
    }

    public int hashCode() {
        CacheControl cacheControl = this.cacheControl;
        int iHashCode = (cacheControl == null ? 0 : cacheControl.hashCode()) * 31;
        GMTDate gMTDate = this.expires;
        return iHashCode + (gMTDate != null ? gMTDate.hashCode() : 0);
    }

    public String toString() {
        return "CachingOptions(cacheControl=" + this.cacheControl + ", expires=" + this.expires + ')';
    }

    public CachingOptions(CacheControl cacheControl, GMTDate gMTDate) {
        this.cacheControl = cacheControl;
        this.expires = gMTDate;
    }

    public /* synthetic */ CachingOptions(CacheControl cacheControl, GMTDate gMTDate, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : cacheControl, (i10 & 2) != 0 ? null : gMTDate);
    }
}
