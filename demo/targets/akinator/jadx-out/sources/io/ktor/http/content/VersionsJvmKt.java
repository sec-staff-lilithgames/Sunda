package io.ktor.http.content;

import io.ktor.util.date.DateJvmKt;
import java.util.Date;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class VersionsJvmKt {
    public static final LastModifiedVersion LastModifiedVersion(Date lastModified) {
        e0.checkNotNullParameter(lastModified, "lastModified");
        return new LastModifiedVersion(DateJvmKt.GMTDate(Long.valueOf(lastModified.getTime())));
    }
}
