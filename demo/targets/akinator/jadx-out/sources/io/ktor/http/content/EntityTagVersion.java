package io.ktor.http.content;

import a.b;
import io.ktor.http.ApplicationResponsePropertiesKt;
import io.ktor.http.HeaderValue;
import io.ktor.http.HeaderValueWithParametersKt;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaderValueParserKt;
import io.ktor.http.HttpHeaders;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import sv.k0;
import sv.n0;
import sv.p0;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class EntityTagVersion implements Version {
    public static final Companion Companion = new Companion(null);
    private static final EntityTagVersion STAR = new EntityTagVersion("*", false);
    private final String etag;
    private final String normalized;
    private final boolean weak;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final EntityTagVersion getSTAR() {
            return EntityTagVersion.STAR;
        }

        public final List<EntityTagVersion> parse(String headerValue) {
            e0.checkNotNullParameter(headerValue, "headerValue");
            List<HeaderValue> headerValue2 = HttpHeaderValueParserKt.parseHeaderValue(headerValue);
            ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(headerValue2, 10));
            for (HeaderValue headerValue3 : headerValue2) {
                if (headerValue3.getQuality() != 1.0d) {
                    throw new IllegalStateException(("entity-tag quality parameter is not allowed: " + headerValue3.getQuality() + '.').toString());
                }
                if (!headerValue3.getParams().isEmpty()) {
                    throw new IllegalStateException(("entity-tag parameters are not allowed: " + headerValue3.getParams() + '.').toString());
                }
                arrayList.add(EntityTagVersion.Companion.parseSingle(headerValue3.getValue()));
            }
            return arrayList;
        }

        public final EntityTagVersion parseSingle(String value) {
            boolean z10;
            e0.checkNotNullParameter(value, "value");
            if (e0.areEqual(value, "*")) {
                return getSTAR();
            }
            if (k0.startsWith$default(value, "W/", false, 2, null)) {
                value = p0.drop(value, 2);
                z10 = true;
            } else {
                z10 = false;
            }
            if (!k0.startsWith$default(value, "\"", false, 2, null)) {
                value = HeaderValueWithParametersKt.quote(value);
            }
            return new EntityTagVersion(value, z10);
        }

        private Companion() {
        }
    }

    public EntityTagVersion(String etag, boolean z10) {
        e0.checkNotNullParameter(etag, "etag");
        this.etag = etag;
        this.weak = z10;
        this.normalized = (e0.areEqual(etag, "*") || k0.startsWith$default(etag, "\"", false, 2, null)) ? etag : HeaderValueWithParametersKt.quote(etag);
        int length = etag.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = this.etag.charAt(i10);
            if ((e0.compare((int) cCharAt, 32) <= 0 || cCharAt == '\"') && i10 != 0 && i10 != n0.getLastIndex(this.etag)) {
                throw new IllegalArgumentException(("Character '" + cCharAt + "' is not allowed in entity-tag.").toString());
            }
        }
    }

    public static /* synthetic */ EntityTagVersion copy$default(EntityTagVersion entityTagVersion, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = entityTagVersion.etag;
        }
        if ((i10 & 2) != 0) {
            z10 = entityTagVersion.weak;
        }
        return entityTagVersion.copy(str, z10);
    }

    @Override // io.ktor.http.content.Version
    public void appendHeadersTo(HeadersBuilder builder) {
        e0.checkNotNullParameter(builder, "builder");
        ApplicationResponsePropertiesKt.etag(builder, this.normalized);
    }

    @Override // io.ktor.http.content.Version
    public VersionCheckResult check(Headers requestHeaders) {
        List<EntityTagVersion> list;
        VersionCheckResult versionCheckResultMatch;
        List<EntityTagVersion> list2;
        VersionCheckResult versionCheckResultNoneMatch;
        e0.checkNotNullParameter(requestHeaders, "requestHeaders");
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        String str = requestHeaders.get(httpHeaders.getIfNoneMatch());
        if (str != null && (list2 = Companion.parse(str)) != null && (versionCheckResultNoneMatch = noneMatch(list2)) != VersionCheckResult.OK) {
            return versionCheckResultNoneMatch;
        }
        String str2 = requestHeaders.get(httpHeaders.getIfMatch());
        return (str2 == null || (list = Companion.parse(str2)) == null || (versionCheckResultMatch = match(list)) == VersionCheckResult.OK) ? VersionCheckResult.OK : versionCheckResultMatch;
    }

    public final String component1() {
        return this.etag;
    }

    public final boolean component2() {
        return this.weak;
    }

    public final EntityTagVersion copy(String etag, boolean z10) {
        e0.checkNotNullParameter(etag, "etag");
        return new EntityTagVersion(etag, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntityTagVersion)) {
            return false;
        }
        EntityTagVersion entityTagVersion = (EntityTagVersion) obj;
        return e0.areEqual(this.etag, entityTagVersion.etag) && this.weak == entityTagVersion.weak;
    }

    public final String getEtag() {
        return this.etag;
    }

    public final boolean getWeak() {
        return this.weak;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.etag.hashCode() * 31;
        boolean z10 = this.weak;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return iHashCode + i10;
    }

    public final boolean match(EntityTagVersion other) {
        e0.checkNotNullParameter(other, "other");
        EntityTagVersion entityTagVersion = STAR;
        if (e0.areEqual(this, entityTagVersion) || e0.areEqual(other, entityTagVersion)) {
            return true;
        }
        return e0.areEqual(this.normalized, other.normalized);
    }

    public final VersionCheckResult noneMatch(List<EntityTagVersion> givenNoneMatchEtags) {
        e0.checkNotNullParameter(givenNoneMatchEtags, "givenNoneMatchEtags");
        if (givenNoneMatchEtags.contains(STAR)) {
            return VersionCheckResult.OK;
        }
        List<EntityTagVersion> list = givenNoneMatchEtags;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (match((EntityTagVersion) it.next())) {
                    return VersionCheckResult.NOT_MODIFIED;
                }
            }
        }
        return VersionCheckResult.OK;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EntityTagVersion(etag=");
        sb2.append(this.etag);
        sb2.append(", weak=");
        return b.p(sb2, this.weak, ')');
    }

    public final VersionCheckResult match(List<EntityTagVersion> givenMatchEtags) {
        e0.checkNotNullParameter(givenMatchEtags, "givenMatchEtags");
        if (!givenMatchEtags.isEmpty() && !givenMatchEtags.contains(STAR)) {
            Iterator<EntityTagVersion> it = givenMatchEtags.iterator();
            while (it.hasNext()) {
                if (match(it.next())) {
                    return VersionCheckResult.OK;
                }
            }
            return VersionCheckResult.PRECONDITION_FAILED;
        }
        return VersionCheckResult.OK;
    }
}
