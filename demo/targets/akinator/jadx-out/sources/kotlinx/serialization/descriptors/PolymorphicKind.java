package kotlinx.serialization.descriptors;

import kotlin.jvm.internal.u;
import kotlinx.serialization.ExperimentalSerializationApi;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@ExperimentalSerializationApi
/* loaded from: classes10.dex */
public abstract class PolymorphicKind extends SerialKind {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class OPEN extends PolymorphicKind {
        public static final OPEN INSTANCE = new OPEN();

        private OPEN() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class SEALED extends PolymorphicKind {
        public static final SEALED INSTANCE = new SEALED();

        private SEALED() {
            super(null);
        }
    }

    public /* synthetic */ PolymorphicKind(u uVar) {
        this();
    }

    private PolymorphicKind() {
        super(null);
    }
}
