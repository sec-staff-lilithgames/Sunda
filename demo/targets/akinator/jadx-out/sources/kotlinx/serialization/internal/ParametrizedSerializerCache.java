package kotlinx.serialization.internal;

import java.util.List;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface ParametrizedSerializerCache<T> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: get-gIAlu-s$default, reason: not valid java name */
        public static /* synthetic */ Object m5214getgIAlus$default(ParametrizedSerializerCache parametrizedSerializerCache, KClass kClass, List list, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get-gIAlu-s");
            }
            if ((i10 & 2) != 0) {
                list = p0.emptyList();
            }
            return parametrizedSerializerCache.mo5210getgIAlus(kClass, list);
        }
    }

    /* renamed from: get-gIAlu-s */
    Object mo5210getgIAlus(KClass<Object> kClass, List<? extends KType> list);
}
