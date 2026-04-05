package io.ktor.util.converters;

import com.google.android.gms.ads.RequestConfiguration;
import io.ktor.util.KtorDsl;
import io.ktor.util.converters.DelegatingConversionService;
import io.ktor.util.reflect.TypeInfo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.h1;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kv.l;
import uu.p0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class DataConversion implements ConversionService {
    private final Map<KClass<?>, ConversionService> converters;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @KtorDsl
    public static final class Configuration {
        private final Map<KClass<?>, ConversionService> converters = new LinkedHashMap();

        public final void convert(KClass<?> type, ConversionService convertor) {
            e0.checkNotNullParameter(type, "type");
            e0.checkNotNullParameter(convertor, "convertor");
            this.converters.put(type, convertor);
        }

        public final Map<KClass<?>, ConversionService> getConverters$ktor_utils() {
            return this.converters;
        }

        public final <T> void convert(KType type, l configure) {
            e0.checkNotNullParameter(type, "type");
            e0.checkNotNullParameter(configure, "configure");
            KClassifier classifier = type.getClassifier();
            e0.checkNotNull(classifier, "null cannot be cast to non-null type kotlin.reflect.KClass<T of io.ktor.util.converters.DataConversion.Configuration.convert>");
            KClass<?> kClass = (KClass) classifier;
            DelegatingConversionService.Configuration configuration = new DelegatingConversionService.Configuration(kClass);
            configure.invoke(configuration);
            convert(kClass, new DelegatingConversionService(kClass, configuration.getDecoder$ktor_utils(), (l) h1.beforeCheckcastToFunctionOfArity(configuration.getEncoder$ktor_utils(), 1)));
        }

        public final /* synthetic */ <T> void convert(l configure) {
            e0.checkNotNullParameter(configure, "configure");
            e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            convert((KType) null, configure);
        }
    }

    public DataConversion(Configuration configuration) {
        e0.checkNotNullParameter(configuration, "configuration");
        this.converters = p1.toMap(configuration.getConverters$ktor_utils());
    }

    @Override // io.ktor.util.converters.ConversionService
    public Object fromValues(List<String> values, TypeInfo type) {
        e0.checkNotNullParameter(values, "values");
        e0.checkNotNullParameter(type, "type");
        if (values.isEmpty()) {
            return null;
        }
        ConversionService conversionService = this.converters.get(type.getType());
        if (conversionService == null) {
            conversionService = DefaultConversionService.INSTANCE;
        }
        return conversionService.fromValues(values, type);
    }

    @Override // io.ktor.util.converters.ConversionService
    public List<String> toValues(Object obj) {
        if (obj == null) {
            return p0.emptyList();
        }
        ConversionService conversionService = this.converters.get(c1.getOrCreateKotlinClass(obj.getClass()));
        if (conversionService == null) {
            conversionService = DefaultConversionService.INSTANCE;
        }
        return conversionService.toValues(obj);
    }
}
