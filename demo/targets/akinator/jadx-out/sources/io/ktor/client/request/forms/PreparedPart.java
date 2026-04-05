package io.ktor.client.request.forms;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
abstract class PreparedPart {
    private final byte[] headers;
    private final Long size;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ChannelPart extends PreparedPart {
        private final a provider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChannelPart(byte[] headers, a provider, Long l9) {
            super(headers, l9, null);
            e0.checkNotNullParameter(headers, "headers");
            e0.checkNotNullParameter(provider, "provider");
            this.provider = provider;
        }

        public final a getProvider() {
            return this.provider;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class InputPart extends PreparedPart {
        private final a provider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InputPart(byte[] headers, a provider, Long l9) {
            super(headers, l9, null);
            e0.checkNotNullParameter(headers, "headers");
            e0.checkNotNullParameter(provider, "provider");
            this.provider = provider;
        }

        public final a getProvider() {
            return this.provider;
        }
    }

    public /* synthetic */ PreparedPart(byte[] bArr, Long l9, u uVar) {
        this(bArr, l9);
    }

    public final byte[] getHeaders() {
        return this.headers;
    }

    public final Long getSize() {
        return this.size;
    }

    private PreparedPart(byte[] bArr, Long l9) {
        this.headers = bArr;
        this.size = l9;
    }
}
