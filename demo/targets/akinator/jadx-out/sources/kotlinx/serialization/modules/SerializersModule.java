package kotlinx.serialization.modules;

import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import tu.f;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class SerializersModule {
    public /* synthetic */ SerializersModule(u uVar) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KSerializer getContextual$default(SerializersModule serializersModule, KClass kClass, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i10 & 2) != 0) {
            list = p0.emptyList();
        }
        return serializersModule.getContextual(kClass, list);
    }

    @ExperimentalSerializationApi
    public abstract void dumpTo(SerializersModuleCollector serializersModuleCollector);

    @ExperimentalSerializationApi
    @f
    public final /* synthetic */ KSerializer getContextual(KClass kclass) {
        e0.checkNotNullParameter(kclass, "kclass");
        return getContextual(kclass, p0.emptyList());
    }

    @ExperimentalSerializationApi
    public abstract <T> KSerializer<T> getContextual(KClass<T> kClass, List<? extends KSerializer<?>> list);

    public abstract boolean getHasInterfaceContextualSerializers$kotlinx_serialization_core();

    @ExperimentalSerializationApi
    public abstract <T> DeserializationStrategy<T> getPolymorphic(KClass<? super T> kClass, String str);

    @ExperimentalSerializationApi
    public abstract <T> SerializationStrategy<T> getPolymorphic(KClass<? super T> kClass, T t10);

    private SerializersModule() {
    }

    @InternalSerializationApi
    public static /* synthetic */ void getHasInterfaceContextualSerializers$kotlinx_serialization_core$annotations() {
    }
}
