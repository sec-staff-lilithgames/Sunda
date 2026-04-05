package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.ExperimentalSerializationApi;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface SerialDescriptor {
    List<Annotation> getAnnotations();

    @ExperimentalSerializationApi
    List<Annotation> getElementAnnotations(int i10);

    @ExperimentalSerializationApi
    SerialDescriptor getElementDescriptor(int i10);

    @ExperimentalSerializationApi
    int getElementIndex(String str);

    @ExperimentalSerializationApi
    String getElementName(int i10);

    int getElementsCount();

    SerialKind getKind();

    String getSerialName();

    @ExperimentalSerializationApi
    boolean isElementOptional(int i10);

    boolean isInline();

    boolean isNullable();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static List<Annotation> getAnnotations(SerialDescriptor serialDescriptor) {
            return p0.emptyList();
        }

        public static boolean isInline(SerialDescriptor serialDescriptor) {
            return false;
        }

        public static boolean isNullable(SerialDescriptor serialDescriptor) {
            return false;
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void getAnnotations$annotations() {
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void getElementsCount$annotations() {
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void getKind$annotations() {
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void getSerialName$annotations() {
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void isNullable$annotations() {
        }
    }
}
