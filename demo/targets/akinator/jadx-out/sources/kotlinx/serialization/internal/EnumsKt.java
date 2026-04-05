package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import uu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class EnumsKt {
    public static final <T extends Enum<T>> KSerializer<T> createAnnotatedEnumSerializer(String serialName, T[] values, String[] names, Annotation[][] entryAnnotations, Annotation[] annotationArr) {
        e0.checkNotNullParameter(serialName, "serialName");
        e0.checkNotNullParameter(values, "values");
        e0.checkNotNullParameter(names, "names");
        e0.checkNotNullParameter(entryAnnotations, "entryAnnotations");
        EnumDescriptor enumDescriptor = new EnumDescriptor(serialName, values.length);
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                enumDescriptor.pushClassAnnotation(annotation);
            }
        }
        int length = values.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            T t10 = values[i10];
            int i12 = i11 + 1;
            String strName = (String) k0.getOrNull(names, i11);
            if (strName == null) {
                strName = t10.name();
            }
            PluginGeneratedSerialDescriptor.addElement$default(enumDescriptor, strName, false, 2, null);
            Annotation[] annotationArr2 = (Annotation[]) k0.getOrNull(entryAnnotations, i11);
            if (annotationArr2 != null) {
                for (Annotation annotation2 : annotationArr2) {
                    enumDescriptor.pushAnnotation(annotation2);
                }
            }
            i10++;
            i11 = i12;
        }
        return new EnumSerializer(serialName, values, enumDescriptor);
    }

    public static final <T extends Enum<T>> KSerializer<T> createMarkedEnumSerializer(String serialName, T[] values, String[] names, Annotation[][] annotations) {
        e0.checkNotNullParameter(serialName, "serialName");
        e0.checkNotNullParameter(values, "values");
        e0.checkNotNullParameter(names, "names");
        e0.checkNotNullParameter(annotations, "annotations");
        EnumDescriptor enumDescriptor = new EnumDescriptor(serialName, values.length);
        int length = values.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            T t10 = values[i10];
            int i12 = i11 + 1;
            String strName = (String) k0.getOrNull(names, i11);
            if (strName == null) {
                strName = t10.name();
            }
            PluginGeneratedSerialDescriptor.addElement$default(enumDescriptor, strName, false, 2, null);
            Annotation[] annotationArr = (Annotation[]) k0.getOrNull(annotations, i11);
            if (annotationArr != null) {
                for (Annotation annotation : annotationArr) {
                    enumDescriptor.pushAnnotation(annotation);
                }
            }
            i10++;
            i11 = i12;
        }
        return new EnumSerializer(serialName, values, enumDescriptor);
    }

    public static final <T extends Enum<T>> KSerializer<T> createSimpleEnumSerializer(String serialName, T[] values) {
        e0.checkNotNullParameter(serialName, "serialName");
        e0.checkNotNullParameter(values, "values");
        return new EnumSerializer(serialName, values);
    }
}
