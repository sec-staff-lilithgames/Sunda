package kotlinx.serialization.internal;

import kotlinx.serialization.KSerializer;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes10.dex */
public interface SerializerFactory {
    KSerializer<?> serializer(KSerializer<?>... kSerializerArr);
}
