package kotlinx.serialization.internal;

import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class JsonInternalDependenciesKt {
    @CoreFriendModuleApi
    public static final Set<String> jsonCachedSerialNames(SerialDescriptor serialDescriptor) {
        e0.checkNotNullParameter(serialDescriptor, "<this>");
        return Platform_commonKt.cachedSerialNames(serialDescriptor);
    }
}
