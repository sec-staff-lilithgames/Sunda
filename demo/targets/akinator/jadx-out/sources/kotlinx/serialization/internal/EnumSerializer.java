package kotlinx.serialization.internal;

import androidx.lifecycle.x0;
import java.lang.Enum;
import java.util.Arrays;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import tu.o;
import tu.q;
import uu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class EnumSerializer<T extends Enum<T>> implements KSerializer<T> {
    private final o descriptor$delegate;
    private SerialDescriptor overriddenDescriptor;
    private final T[] values;

    public EnumSerializer(String serialName, T[] values) {
        e0.checkNotNullParameter(serialName, "serialName");
        e0.checkNotNullParameter(values, "values");
        this.values = values;
        this.descriptor$delegate = q.lazy(new x0(12, this, serialName));
    }

    private final SerialDescriptor createUnmarkedDescriptor(String str) {
        EnumDescriptor enumDescriptor = new EnumDescriptor(str, this.values.length);
        for (T t10 : this.values) {
            PluginGeneratedSerialDescriptor.addElement$default(enumDescriptor, t10.name(), false, 2, null);
        }
        return enumDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor descriptor_delegate$lambda$0(EnumSerializer enumSerializer, String str) {
        SerialDescriptor serialDescriptor = enumSerializer.overriddenDescriptor;
        return serialDescriptor == null ? enumSerializer.createUnmarkedDescriptor(str) : serialDescriptor;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.descriptor$delegate.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().getSerialName() + '>';
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public T deserialize(Decoder decoder) {
        e0.checkNotNullParameter(decoder, "decoder");
        int iDecodeEnum = decoder.decodeEnum(getDescriptor());
        if (iDecodeEnum >= 0) {
            T[] tArr = this.values;
            if (iDecodeEnum < tArr.length) {
                return tArr[iDecodeEnum];
            }
        }
        throw new SerializationException(iDecodeEnum + " is not among valid " + getDescriptor().getSerialName() + " enum values, values size is " + this.values.length);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, T value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        int iIndexOf = k0.indexOf(this.values, value);
        if (iIndexOf != -1) {
            encoder.encodeEnum(getDescriptor(), iIndexOf);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(value);
        sb2.append(" is not a valid enum ");
        sb2.append(getDescriptor().getSerialName());
        sb2.append(", must be one of ");
        String string = Arrays.toString(this.values);
        e0.checkNotNullExpressionValue(string, "toString(...)");
        sb2.append(string);
        throw new SerializationException(sb2.toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumSerializer(String serialName, T[] values, SerialDescriptor descriptor) {
        this(serialName, values);
        e0.checkNotNullParameter(serialName, "serialName");
        e0.checkNotNullParameter(values, "values");
        e0.checkNotNullParameter(descriptor, "descriptor");
        this.overriddenDescriptor = descriptor;
    }
}
