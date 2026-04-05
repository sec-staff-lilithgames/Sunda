package io.ktor.client.call;

import io.ktor.http.content.OutgoingContent;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class UnsupportedContentTypeException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsupportedContentTypeException(OutgoingContent content) {
        super("Failed to write body: " + c1.getOrCreateKotlinClass(content.getClass()));
        e0.checkNotNullParameter(content, "content");
    }
}
