package kotlinx.serialization.modules;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.h0;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class PolymorphicModuleBuilderKt {
    public static final /* synthetic */ <Base, T extends Base> void subclass(PolymorphicModuleBuilder<? super Base> polymorphicModuleBuilder, KSerializer<T> serializer) {
        e0.checkNotNullParameter(polymorphicModuleBuilder, "<this>");
        e0.checkNotNullParameter(serializer, "serializer");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        polymorphicModuleBuilder.subclass(c1.getOrCreateKotlinClass(Object.class), serializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <Base, T extends Base> void subclass(PolymorphicModuleBuilder<? super Base> polymorphicModuleBuilder, KClass<T> clazz) {
        e0.checkNotNullParameter(polymorphicModuleBuilder, "<this>");
        e0.checkNotNullParameter(clazz, "clazz");
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        h0.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        polymorphicModuleBuilder.subclass(clazz, SerializersKt.serializer((KType) null));
    }
}
