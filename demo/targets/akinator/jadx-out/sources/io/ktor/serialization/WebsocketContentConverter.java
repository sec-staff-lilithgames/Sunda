package io.ktor.serialization;

import io.ktor.util.reflect.TypeInfo;
import io.ktor.websocket.Frame;
import java.nio.charset.Charset;
import kotlin.jvm.internal.e0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface WebsocketContentConverter {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static Object serialize(WebsocketContentConverter websocketContentConverter, Charset charset, TypeInfo typeInfo, Object obj, d<? super Frame> dVar) {
            return websocketContentConverter.serializeNullable(charset, typeInfo, obj, dVar);
        }

        public static Object serializeNullable(WebsocketContentConverter websocketContentConverter, Charset charset, TypeInfo typeInfo, Object obj, d<? super Frame> dVar) {
            e0.checkNotNull(obj);
            return websocketContentConverter.serialize(charset, typeInfo, obj, dVar);
        }
    }

    Object deserialize(Charset charset, TypeInfo typeInfo, Frame frame, d<Object> dVar);

    boolean isApplicable(Frame frame);

    Object serialize(Charset charset, TypeInfo typeInfo, Object obj, d<? super Frame> dVar);

    Object serializeNullable(Charset charset, TypeInfo typeInfo, Object obj, d<? super Frame> dVar);
}
