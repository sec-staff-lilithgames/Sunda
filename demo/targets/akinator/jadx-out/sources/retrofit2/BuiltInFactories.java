package retrofit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
class BuiltInFactories {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Java8 extends BuiltInFactories {
        @Override // retrofit2.BuiltInFactories
        public List<? extends CallAdapter.Factory> createDefaultCallAdapterFactories(Executor executor) {
            return Arrays.asList(new CompletableFutureCallAdapterFactory(), new DefaultCallAdapterFactory(executor));
        }

        @Override // retrofit2.BuiltInFactories
        public List<? extends Converter.Factory> createDefaultConverterFactories() {
            return Collections.singletonList(new OptionalConverterFactory());
        }
    }

    public List<? extends CallAdapter.Factory> createDefaultCallAdapterFactories(Executor executor) {
        return Collections.singletonList(new DefaultCallAdapterFactory(executor));
    }

    public List<? extends Converter.Factory> createDefaultConverterFactories() {
        return Collections.EMPTY_LIST;
    }
}
