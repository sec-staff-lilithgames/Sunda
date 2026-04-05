package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import retrofit2.Converter;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class OptionalConverterFactory extends Converter.Factory {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class OptionalConverter<T> implements Converter<w0, Optional<T>> {
        private final Converter<w0, T> delegate;

        public OptionalConverter(Converter<w0, T> converter) {
            this.delegate = converter;
        }

        @Override // retrofit2.Converter
        public Optional<T> convert(w0 w0Var) throws IOException {
            return Optional.ofNullable(this.delegate.convert(w0Var));
        }
    }

    public static OptionalConverterFactory create() {
        return new OptionalConverterFactory();
    }

    @Override // retrofit2.Converter.Factory
    public Converter<w0, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (Converter.Factory.getRawType(type) != Optional.class) {
            return null;
        }
        return new OptionalConverter(retrofit.responseBodyConverter(Converter.Factory.getParameterUpperBound(0, (ParameterizedType) type), annotationArr));
    }
}
