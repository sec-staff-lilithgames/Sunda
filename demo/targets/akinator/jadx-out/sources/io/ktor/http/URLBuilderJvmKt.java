package io.ktor.http;

import io.bidmachine.protobuf.EventTypeExtended;
import io.ktor.http.URLBuilder;
import io.ktor.http.Url;
import java.net.URI;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class URLBuilderJvmKt {
    public static final String getOrigin(URLBuilder.Companion companion) {
        e0.checkNotNullParameter(companion, "<this>");
        return "http://localhost";
    }

    public static final Url invoke(Url.Companion companion, String fullUrl) {
        e0.checkNotNullParameter(companion, "<this>");
        e0.checkNotNullParameter(fullUrl, "fullUrl");
        URLBuilder uRLBuilder = new URLBuilder(null, null, 0, null, null, null, null, null, false, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE, null);
        URLUtilsJvmKt.takeFrom(uRLBuilder, new URI(fullUrl));
        return uRLBuilder.build();
    }
}
