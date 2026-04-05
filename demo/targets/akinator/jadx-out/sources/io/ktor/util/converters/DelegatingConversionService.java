package io.ktor.util.converters;

import io.ktor.util.reflect.TypeInfo;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class DelegatingConversionService implements ConversionService {
    private final l decoder;
    private final l encoder;
    private final KClass<?> klass;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Configuration<T> {
        private l decoder;
        private l encoder;
        private final KClass<T> klass;

        public Configuration(KClass<T> klass) {
            e0.checkNotNullParameter(klass, "klass");
            this.klass = klass;
        }

        public final void decode(l converter) {
            e0.checkNotNullParameter(converter, "converter");
            if (this.decoder == null) {
                this.decoder = converter;
                return;
            }
            throw new IllegalStateException("Decoder has already been set for type '" + this.klass + '\'');
        }

        public final void encode(l converter) {
            e0.checkNotNullParameter(converter, "converter");
            if (this.encoder == null) {
                this.encoder = converter;
                return;
            }
            throw new IllegalStateException("Encoder has already been set for type '" + this.klass + '\'');
        }

        public final l getDecoder$ktor_utils() {
            return this.decoder;
        }

        public final l getEncoder$ktor_utils() {
            return this.encoder;
        }

        public final KClass<T> getKlass$ktor_utils() {
            return this.klass;
        }

        public final void setDecoder$ktor_utils(l lVar) {
            this.decoder = lVar;
        }

        public final void setEncoder$ktor_utils(l lVar) {
            this.encoder = lVar;
        }
    }

    public DelegatingConversionService(KClass<?> klass, l lVar, l lVar2) {
        e0.checkNotNullParameter(klass, "klass");
        this.klass = klass;
        this.decoder = lVar;
        this.encoder = lVar2;
    }

    @Override // io.ktor.util.converters.ConversionService
    public Object fromValues(List<String> values, TypeInfo type) {
        e0.checkNotNullParameter(values, "values");
        e0.checkNotNullParameter(type, "type");
        l lVar = this.decoder;
        if (lVar != null) {
            return lVar.invoke(values);
        }
        throw new IllegalStateException("Decoder was not specified for type '" + this.klass + '\'');
    }

    @Override // io.ktor.util.converters.ConversionService
    public List<String> toValues(Object obj) {
        l lVar = this.encoder;
        if (lVar != null) {
            return (List) lVar.invoke(obj);
        }
        throw new IllegalStateException("Encoder was not specified for type '" + this.klass + '\'');
    }
}
