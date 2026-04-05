package kotlinx.serialization.json;

import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable(with = JsonElementSerializer.class)
/* loaded from: classes10.dex */
public abstract class JsonElement {
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<JsonElement> serializer() {
            return JsonElementSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }
    }

    public /* synthetic */ JsonElement(u uVar) {
        this();
    }

    private JsonElement() {
    }
}
