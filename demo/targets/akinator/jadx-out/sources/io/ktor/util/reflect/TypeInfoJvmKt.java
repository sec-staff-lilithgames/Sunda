package io.ktor.util.reflect;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.Type;
import jv.a;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class TypeInfoJvmKt {
    public static final Type getPlatformType(KType kType) {
        e0.checkNotNullParameter(kType, "<this>");
        return TypesJVMKt.getJavaType(kType);
    }

    public static final boolean instanceOf(Object obj, KClass<?> type) {
        e0.checkNotNullParameter(obj, "<this>");
        e0.checkNotNullParameter(type, "type");
        return a.getJavaClass((KClass) type).isInstance(obj);
    }

    public static final /* synthetic */ <T> TypeInfo typeInfo() {
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        Type javaType = TypesJVMKt.getJavaType((KType) null);
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return typeInfoImpl(javaType, c1.getOrCreateKotlinClass(Object.class), null);
    }

    public static final TypeInfo typeInfoImpl(Type reifiedType, KClass<?> kClass, KType kType) {
        e0.checkNotNullParameter(reifiedType, "reifiedType");
        e0.checkNotNullParameter(kClass, "kClass");
        return new TypeInfo(kClass, reifiedType, kType);
    }

    public static /* synthetic */ void getPlatformType$annotations(KType kType) {
    }
}
