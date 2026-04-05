package io.ktor.http.content;

import io.ktor.http.content.PartData;
import kotlin.jvm.internal.e0;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class MultipartJvmKt {
    public static final a getStreamProvider(PartData.FileItem fileItem) {
        e0.checkNotNullParameter(fileItem, "<this>");
        return new MultipartJvmKt$streamProvider$1(fileItem);
    }
}
