package kotlinx.serialization.modules;

import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class ContextualProvider {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Argless extends ContextualProvider {
        private final KSerializer<?> serializer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Argless(KSerializer<?> serializer) {
            super(null);
            e0.checkNotNullParameter(serializer, "serializer");
            this.serializer = serializer;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Argless) && e0.areEqual(((Argless) obj).serializer, this.serializer);
        }

        public final KSerializer<?> getSerializer() {
            return this.serializer;
        }

        public int hashCode() {
            return this.serializer.hashCode();
        }

        @Override // kotlinx.serialization.modules.ContextualProvider
        public KSerializer<?> invoke(List<? extends KSerializer<?>> typeArgumentsSerializers) {
            e0.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.serializer;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class WithTypeArguments extends ContextualProvider {
        private final l provider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithTypeArguments(l provider) {
            super(null);
            e0.checkNotNullParameter(provider, "provider");
            this.provider = provider;
        }

        public final l getProvider() {
            return this.provider;
        }

        @Override // kotlinx.serialization.modules.ContextualProvider
        public KSerializer<?> invoke(List<? extends KSerializer<?>> typeArgumentsSerializers) {
            e0.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
            return (KSerializer) this.provider.invoke(typeArgumentsSerializers);
        }
    }

    public /* synthetic */ ContextualProvider(u uVar) {
        this();
    }

    public abstract KSerializer<?> invoke(List<? extends KSerializer<?>> list);

    private ContextualProvider() {
    }
}
