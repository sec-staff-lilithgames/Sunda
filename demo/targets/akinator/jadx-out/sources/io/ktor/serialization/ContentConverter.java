package io.ktor.serialization;

import io.ktor.http.ContentType;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteReadChannel;
import java.nio.charset.Charset;
import kotlin.jvm.internal.e0;
import tu.f;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface ContentConverter {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        @f
        public static Object serialize(ContentConverter contentConverter, ContentType contentType, Charset charset, TypeInfo typeInfo, Object obj, d<? super OutgoingContent> dVar) {
            return contentConverter.serializeNullable(contentType, charset, typeInfo, obj, dVar);
        }

        public static Object serializeNullable(ContentConverter contentConverter, ContentType contentType, Charset charset, TypeInfo typeInfo, Object obj, d<? super OutgoingContent> dVar) {
            e0.checkNotNull(obj);
            return contentConverter.serialize(contentType, charset, typeInfo, obj, dVar);
        }
    }

    Object deserialize(Charset charset, TypeInfo typeInfo, ByteReadChannel byteReadChannel, d<Object> dVar);

    @f
    Object serialize(ContentType contentType, Charset charset, TypeInfo typeInfo, Object obj, d<? super OutgoingContent> dVar);

    Object serializeNullable(ContentType contentType, Charset charset, TypeInfo typeInfo, Object obj, d<? super OutgoingContent> dVar);
}
