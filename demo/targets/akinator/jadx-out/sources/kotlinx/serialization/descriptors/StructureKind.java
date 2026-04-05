package kotlinx.serialization.descriptors;

import kotlin.jvm.internal.u;
import kotlinx.serialization.ExperimentalSerializationApi;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@ExperimentalSerializationApi
/* loaded from: classes10.dex */
public abstract class StructureKind extends SerialKind {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class CLASS extends StructureKind {
        public static final CLASS INSTANCE = new CLASS();

        private CLASS() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class LIST extends StructureKind {
        public static final LIST INSTANCE = new LIST();

        private LIST() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class MAP extends StructureKind {
        public static final MAP INSTANCE = new MAP();

        private MAP() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class OBJECT extends StructureKind {
        public static final OBJECT INSTANCE = new OBJECT();

        private OBJECT() {
            super(null);
        }
    }

    public /* synthetic */ StructureKind(u uVar) {
        this();
    }

    private StructureKind() {
        super(null);
    }
}
