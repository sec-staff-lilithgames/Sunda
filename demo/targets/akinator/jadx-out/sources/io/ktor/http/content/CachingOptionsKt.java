package io.ktor.http.content;

import io.ktor.util.AttributeKey;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class CachingOptionsKt {
    private static final AttributeKey<CachingOptions> CachingProperty = new AttributeKey<>("Caching");

    public static final CachingOptions getCaching(OutgoingContent outgoingContent) {
        e0.checkNotNullParameter(outgoingContent, "<this>");
        return (CachingOptions) outgoingContent.getProperty(CachingProperty);
    }

    public static final AttributeKey<CachingOptions> getCachingProperty() {
        return CachingProperty;
    }

    public static final void setCaching(OutgoingContent outgoingContent, CachingOptions cachingOptions) {
        e0.checkNotNullParameter(outgoingContent, "<this>");
        outgoingContent.setProperty(CachingProperty, cachingOptions);
    }
}
