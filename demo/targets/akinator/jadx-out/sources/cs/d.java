package cs;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import mh.p1;
import wr.g4;
import wr.v3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static volatile ExtensionRegistryLite f50938a = ExtensionRegistryLite.getEmptyRegistry();

    public static <T extends MessageLite> g4 marshaller(T t10) {
        return new b(t10, -1);
    }

    public static <T extends MessageLite> g4 marshallerWithRecursionLimit(T t10, int i10) {
        return new b(t10, i10);
    }

    public static <T extends MessageLite> v3 metadataMarshaller(T t10) {
        return new c(t10);
    }

    public static void setExtensionRegistry(ExtensionRegistryLite extensionRegistryLite) {
        f50938a = (ExtensionRegistryLite) p1.checkNotNull(extensionRegistryLite, "newRegistry");
    }
}
