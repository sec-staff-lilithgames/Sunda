package kotlinx.serialization.json;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.ExperimentalSerializationApi;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Target({})
@Retention(RetentionPolicy.RUNTIME)
@ExperimentalSerializationApi
/* loaded from: classes10.dex */
public @interface JsonNames {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class Impl implements JsonNames {
        private final /* synthetic */ String[] names;

        public Impl(String[] names) {
            e0.checkNotNullParameter(names, "names");
            this.names = names;
        }

        @Override // kotlinx.serialization.json.JsonNames
        public final /* synthetic */ String[] names() {
            return this.names;
        }
    }

    String[] names();
}
