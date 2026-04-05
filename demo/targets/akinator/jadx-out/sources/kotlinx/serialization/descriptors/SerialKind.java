package kotlinx.serialization.descriptors;

import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.ExperimentalSerializationApi;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@ExperimentalSerializationApi
/* loaded from: classes10.dex */
public abstract class SerialKind {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @ExperimentalSerializationApi
    public static final class CONTEXTUAL extends SerialKind {
        public static final CONTEXTUAL INSTANCE = new CONTEXTUAL();

        private CONTEXTUAL() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @ExperimentalSerializationApi
    public static final class ENUM extends SerialKind {
        public static final ENUM INSTANCE = new ENUM();

        private ENUM() {
            super(null);
        }
    }

    public /* synthetic */ SerialKind(u uVar) {
        this();
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        String simpleName = c1.getOrCreateKotlinClass(getClass()).getSimpleName();
        e0.checkNotNull(simpleName);
        return simpleName;
    }

    private SerialKind() {
    }
}
