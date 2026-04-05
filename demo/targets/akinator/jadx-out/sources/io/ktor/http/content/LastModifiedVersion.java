package io.ktor.http.content;

import io.ktor.http.DateUtilsKt;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.util.date.DateKt;
import io.ktor.util.date.GMTDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class LastModifiedVersion implements Version {
    private final GMTDate lastModified;
    private final GMTDate truncatedModificationDate;

    public LastModifiedVersion(GMTDate lastModified) {
        e0.checkNotNullParameter(lastModified, "lastModified");
        this.lastModified = lastModified;
        this.truncatedModificationDate = DateKt.truncateToSeconds(lastModified);
    }

    public static /* synthetic */ LastModifiedVersion copy$default(LastModifiedVersion lastModifiedVersion, GMTDate gMTDate, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gMTDate = lastModifiedVersion.lastModified;
        }
        return lastModifiedVersion.copy(gMTDate);
    }

    private final List<GMTDate> parseDates(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!n0.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            GMTDate gMTDateFromHttpToGmtDate = null;
            if (!it.hasNext()) {
                break;
            }
            try {
                gMTDateFromHttpToGmtDate = DateUtilsKt.fromHttpToGmtDate((String) it.next());
            } catch (Throwable unused) {
            }
            if (gMTDateFromHttpToGmtDate != null) {
                arrayList2.add(gMTDateFromHttpToGmtDate);
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    @Override // io.ktor.http.content.Version
    public void appendHeadersTo(HeadersBuilder builder) {
        e0.checkNotNullParameter(builder, "builder");
        builder.set(HttpHeaders.INSTANCE.getLastModified(), DateUtilsKt.toHttpDate(this.lastModified));
    }

    @Override // io.ktor.http.content.Version
    public VersionCheckResult check(Headers requestHeaders) {
        e0.checkNotNullParameter(requestHeaders, "requestHeaders");
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        List<String> all = requestHeaders.getAll(httpHeaders.getIfModifiedSince());
        List<GMTDate> dates = all != null ? parseDates(all) : null;
        if (dates != null && !ifModifiedSince(dates)) {
            return VersionCheckResult.NOT_MODIFIED;
        }
        List<String> all2 = requestHeaders.getAll(httpHeaders.getIfUnmodifiedSince());
        List<GMTDate> dates2 = all2 != null ? parseDates(all2) : null;
        return (dates2 == null || ifUnmodifiedSince(dates2)) ? VersionCheckResult.OK : VersionCheckResult.PRECONDITION_FAILED;
    }

    public final GMTDate component1() {
        return this.lastModified;
    }

    public final LastModifiedVersion copy(GMTDate lastModified) {
        e0.checkNotNullParameter(lastModified, "lastModified");
        return new LastModifiedVersion(lastModified);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LastModifiedVersion) && e0.areEqual(this.lastModified, ((LastModifiedVersion) obj).lastModified);
    }

    public final GMTDate getLastModified() {
        return this.lastModified;
    }

    public int hashCode() {
        return this.lastModified.hashCode();
    }

    public final boolean ifModifiedSince(List<GMTDate> dates) {
        e0.checkNotNullParameter(dates, "dates");
        List<GMTDate> list = dates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (this.truncatedModificationDate.compareTo((GMTDate) it.next()) > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean ifUnmodifiedSince(List<GMTDate> dates) {
        e0.checkNotNullParameter(dates, "dates");
        List<GMTDate> list = dates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (this.truncatedModificationDate.compareTo((GMTDate) it.next()) > 0) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return "LastModifiedVersion(lastModified=" + this.lastModified + ')';
    }
}
