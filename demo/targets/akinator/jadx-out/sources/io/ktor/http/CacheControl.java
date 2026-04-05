package io.ktor.http;

import com.google.android.gms.internal.play_billing.a;
import java.util.ArrayList;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class CacheControl {
    private final Visibility visibility;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class MaxAge extends CacheControl {
        private final int maxAgeSeconds;
        private final boolean mustRevalidate;
        private final Integer proxyMaxAgeSeconds;
        private final boolean proxyRevalidate;

        public /* synthetic */ MaxAge(int i10, Integer num, boolean z10, boolean z11, Visibility visibility, int i11, u uVar) {
            this(i10, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? null : visibility);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MaxAge)) {
                return false;
            }
            MaxAge maxAge = (MaxAge) obj;
            return maxAge.maxAgeSeconds == this.maxAgeSeconds && e0.areEqual(maxAge.proxyMaxAgeSeconds, this.proxyMaxAgeSeconds) && maxAge.mustRevalidate == this.mustRevalidate && maxAge.proxyRevalidate == this.proxyRevalidate && maxAge.getVisibility() == getVisibility();
        }

        public final int getMaxAgeSeconds() {
            return this.maxAgeSeconds;
        }

        public final boolean getMustRevalidate() {
            return this.mustRevalidate;
        }

        public final Integer getProxyMaxAgeSeconds() {
            return this.proxyMaxAgeSeconds;
        }

        public final boolean getProxyRevalidate() {
            return this.proxyRevalidate;
        }

        public int hashCode() {
            int i10 = this.maxAgeSeconds * 31;
            Integer num = this.proxyMaxAgeSeconds;
            int iC = a.c(a.c((i10 + (num != null ? num.intValue() : 0)) * 31, 31, this.mustRevalidate), 31, this.proxyRevalidate);
            Visibility visibility = getVisibility();
            return iC + (visibility != null ? visibility.hashCode() : 0);
        }

        public String toString() {
            ArrayList arrayList = new ArrayList(5);
            arrayList.add("max-age=" + this.maxAgeSeconds);
            if (this.proxyMaxAgeSeconds != null) {
                arrayList.add("s-maxage=" + this.proxyMaxAgeSeconds);
            }
            if (this.mustRevalidate) {
                arrayList.add(io.ktor.client.utils.CacheControl.MUST_REVALIDATE);
            }
            if (this.proxyRevalidate) {
                arrayList.add(io.ktor.client.utils.CacheControl.PROXY_REVALIDATE);
            }
            if (getVisibility() != null) {
                arrayList.add(getVisibility().getHeaderValue$ktor_http());
            }
            return y0.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
        }

        public MaxAge(int i10, Integer num, boolean z10, boolean z11, Visibility visibility) {
            super(visibility);
            this.maxAgeSeconds = i10;
            this.proxyMaxAgeSeconds = num;
            this.mustRevalidate = z10;
            this.proxyRevalidate = z11;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class NoCache extends CacheControl {
        public NoCache(Visibility visibility) {
            super(visibility);
        }

        public boolean equals(Object obj) {
            return (obj instanceof NoCache) && getVisibility() == ((NoCache) obj).getVisibility();
        }

        public int hashCode() {
            Visibility visibility = getVisibility();
            if (visibility != null) {
                return visibility.hashCode();
            }
            return 0;
        }

        public String toString() {
            if (getVisibility() == null) {
                return io.ktor.client.utils.CacheControl.NO_CACHE;
            }
            return "no-cache, " + getVisibility().getHeaderValue$ktor_http();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class NoStore extends CacheControl {
        public NoStore(Visibility visibility) {
            super(visibility);
        }

        public boolean equals(Object obj) {
            return (obj instanceof NoStore) && ((NoStore) obj).getVisibility() == getVisibility();
        }

        public int hashCode() {
            Visibility visibility = getVisibility();
            if (visibility != null) {
                return visibility.hashCode();
            }
            return 0;
        }

        public String toString() {
            if (getVisibility() == null) {
                return io.ktor.client.utils.CacheControl.NO_STORE;
            }
            return "no-store, " + getVisibility().getHeaderValue$ktor_http();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum Visibility {
        Public(io.ktor.client.utils.CacheControl.PUBLIC),
        Private(io.ktor.client.utils.CacheControl.PRIVATE);

        private final String headerValue;

        Visibility(String str) {
            this.headerValue = str;
        }

        public final String getHeaderValue$ktor_http() {
            return this.headerValue;
        }
    }

    public CacheControl(Visibility visibility) {
        this.visibility = visibility;
    }

    public final Visibility getVisibility() {
        return this.visibility;
    }
}
