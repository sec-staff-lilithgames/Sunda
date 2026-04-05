package kotlinx.serialization.descriptors;

import com.google.android.gms.ads.RequestConfiguration;
import e3.g;
import f.j0;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.h0;
import kotlin.reflect.KType;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.internal.ArrayListClassDesc;
import kotlinx.serialization.internal.HashMapClassDesc;
import kotlinx.serialization.internal.HashSetClassDesc;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.internal.SerialDescriptorForNullable;
import kv.l;
import sv.n0;
import tu.x0;
import uu.k0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class SerialDescriptorsKt {
    public static final SerialDescriptor PrimitiveSerialDescriptor(String serialName, PrimitiveKind kind) {
        e0.checkNotNullParameter(serialName, "serialName");
        e0.checkNotNullParameter(kind, "kind");
        if (n0.isBlank(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return PrimitivesKt.PrimitiveDescriptorSafe(serialName, kind);
    }

    @ExperimentalSerializationApi
    public static final SerialDescriptor SerialDescriptor(String serialName, SerialDescriptor original) {
        e0.checkNotNullParameter(serialName, "serialName");
        e0.checkNotNullParameter(original, "original");
        if (n0.isBlank(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (original.getKind() instanceof PrimitiveKind) {
            throw new IllegalArgumentException("For primitive descriptors please use 'PrimitiveSerialDescriptor' instead");
        }
        if (!e0.areEqual(serialName, original.getSerialName())) {
            return new WrappedSerialDescriptor(serialName, original);
        }
        StringBuilder sbO = g.o("The name of the wrapped descriptor (", serialName, ") cannot be the same as the name of the original descriptor (");
        sbO.append(original.getSerialName());
        sbO.append(')');
        throw new IllegalArgumentException(sbO.toString().toString());
    }

    public static final SerialDescriptor buildClassSerialDescriptor(String serialName, SerialDescriptor[] typeParameters, l builderAction) {
        e0.checkNotNullParameter(serialName, "serialName");
        e0.checkNotNullParameter(typeParameters, "typeParameters");
        e0.checkNotNullParameter(builderAction, "builderAction");
        if (n0.isBlank(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        ClassSerialDescriptorBuilder classSerialDescriptorBuilder = new ClassSerialDescriptorBuilder(serialName);
        builderAction.invoke(classSerialDescriptorBuilder);
        return new SerialDescriptorImpl(serialName, StructureKind.CLASS.INSTANCE, classSerialDescriptorBuilder.getElementNames$kotlinx_serialization_core().size(), k0.toList(typeParameters), classSerialDescriptorBuilder);
    }

    public static /* synthetic */ SerialDescriptor buildClassSerialDescriptor$default(String str, SerialDescriptor[] serialDescriptorArr, l lVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            lVar = new j0(4);
        }
        return buildClassSerialDescriptor(str, serialDescriptorArr, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 buildClassSerialDescriptor$lambda$0(ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        e0.checkNotNullParameter(classSerialDescriptorBuilder, "<this>");
        return x0.f87415a;
    }

    @InternalSerializationApi
    public static final SerialDescriptor buildSerialDescriptor(String serialName, SerialKind kind, SerialDescriptor[] typeParameters, l builder) {
        e0.checkNotNullParameter(serialName, "serialName");
        e0.checkNotNullParameter(kind, "kind");
        e0.checkNotNullParameter(typeParameters, "typeParameters");
        e0.checkNotNullParameter(builder, "builder");
        if (n0.isBlank(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (e0.areEqual(kind, StructureKind.CLASS.INSTANCE)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        ClassSerialDescriptorBuilder classSerialDescriptorBuilder = new ClassSerialDescriptorBuilder(serialName);
        builder.invoke(classSerialDescriptorBuilder);
        return new SerialDescriptorImpl(serialName, kind, classSerialDescriptorBuilder.getElementNames$kotlinx_serialization_core().size(), k0.toList(typeParameters), classSerialDescriptorBuilder);
    }

    public static /* synthetic */ SerialDescriptor buildSerialDescriptor$default(String str, SerialKind serialKind, SerialDescriptor[] serialDescriptorArr, l lVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            lVar = new j0(5);
        }
        return buildSerialDescriptor(str, serialKind, serialDescriptorArr, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 buildSerialDescriptor$lambda$6(ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        e0.checkNotNullParameter(classSerialDescriptorBuilder, "<this>");
        return x0.f87415a;
    }

    public static final /* synthetic */ <T> void element(ClassSerialDescriptorBuilder classSerialDescriptorBuilder, String elementName, List<? extends Annotation> annotations, boolean z10) {
        e0.checkNotNullParameter(classSerialDescriptorBuilder, "<this>");
        e0.checkNotNullParameter(elementName, "elementName");
        e0.checkNotNullParameter(annotations, "annotations");
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        h0.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        classSerialDescriptorBuilder.element(elementName, SerializersKt.serializer((KType) null).getDescriptor(), annotations, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void element$default(ClassSerialDescriptorBuilder classSerialDescriptorBuilder, String elementName, List annotations, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            annotations = p0.emptyList();
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        e0.checkNotNullParameter(classSerialDescriptorBuilder, "<this>");
        e0.checkNotNullParameter(elementName, "elementName");
        e0.checkNotNullParameter(annotations, "annotations");
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        h0.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        classSerialDescriptorBuilder.element(elementName, SerializersKt.serializer((KType) null).getDescriptor(), annotations, z10);
    }

    public static final SerialDescriptor getNonNullOriginal(SerialDescriptor serialDescriptor) {
        e0.checkNotNullParameter(serialDescriptor, "<this>");
        return serialDescriptor instanceof SerialDescriptorForNullable ? ((SerialDescriptorForNullable) serialDescriptor).getOriginal$kotlinx_serialization_core() : serialDescriptor;
    }

    public static final SerialDescriptor getNullable(SerialDescriptor serialDescriptor) {
        e0.checkNotNullParameter(serialDescriptor, "<this>");
        return serialDescriptor.isNullable() ? serialDescriptor : new SerialDescriptorForNullable(serialDescriptor);
    }

    @ExperimentalSerializationApi
    public static final SerialDescriptor listSerialDescriptor(SerialDescriptor elementDescriptor) {
        e0.checkNotNullParameter(elementDescriptor, "elementDescriptor");
        return new ArrayListClassDesc(elementDescriptor);
    }

    @ExperimentalSerializationApi
    public static final SerialDescriptor mapSerialDescriptor(SerialDescriptor keyDescriptor, SerialDescriptor valueDescriptor) {
        e0.checkNotNullParameter(keyDescriptor, "keyDescriptor");
        e0.checkNotNullParameter(valueDescriptor, "valueDescriptor");
        return new HashMapClassDesc(keyDescriptor, valueDescriptor);
    }

    public static final /* synthetic */ <T> SerialDescriptor serialDescriptor() {
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        h0.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        return SerializersKt.serializer((KType) null).getDescriptor();
    }

    @ExperimentalSerializationApi
    public static final SerialDescriptor setSerialDescriptor(SerialDescriptor elementDescriptor) {
        e0.checkNotNullParameter(elementDescriptor, "elementDescriptor");
        return new HashSetClassDesc(elementDescriptor);
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> SerialDescriptor listSerialDescriptor() {
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        h0.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        return listSerialDescriptor(SerializersKt.serializer((KType) null).getDescriptor());
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <K, V> SerialDescriptor mapSerialDescriptor() {
        e0.reifiedOperationMarker(6, "K");
        h0.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        SerialDescriptor descriptor = SerializersKt.serializer((KType) null).getDescriptor();
        e0.reifiedOperationMarker(6, "V");
        h0.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        return mapSerialDescriptor(descriptor, SerializersKt.serializer((KType) null).getDescriptor());
    }

    public static final SerialDescriptor serialDescriptor(KType type) {
        e0.checkNotNullParameter(type, "type");
        return SerializersKt.serializer(type).getDescriptor();
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> SerialDescriptor setSerialDescriptor() {
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        h0.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        return setSerialDescriptor(SerializersKt.serializer((KType) null).getDescriptor());
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getNonNullOriginal$annotations(SerialDescriptor serialDescriptor) {
    }

    public static /* synthetic */ void getNullable$annotations(SerialDescriptor serialDescriptor) {
    }
}
