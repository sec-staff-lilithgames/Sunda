package io.ktor.client.request.forms;

import a.b;
import com.applovin.shadow.okhttp3.HttpUrl;
import io.ktor.http.Headers;
import io.ktor.util.InternalAPI;
import io.ktor.utils.io.core.ByteReadPacket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kv.a;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class FormBuilder {
    private final List<FormPart<?>> parts = new ArrayList();

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, Object obj, Headers headers, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            headers = Headers.Companion.getEmpty();
        }
        formBuilder.append(str, (String) obj, headers);
    }

    public static /* synthetic */ void appendInput$default(FormBuilder formBuilder, String str, Headers headers, Long l9, a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            headers = Headers.Companion.getEmpty();
        }
        if ((i10 & 4) != 0) {
            l9 = null;
        }
        formBuilder.appendInput(str, headers, l9, aVar);
    }

    @InternalAPI
    public final <T> void append(String key, T value, Headers headers) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        e0.checkNotNullParameter(headers, "headers");
        this.parts.add(new FormPart<>(key, value, headers));
    }

    public final void appendInput(String key, Headers headers, Long l9, a block) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(block, "block");
        this.parts.add(new FormPart<>(key, new InputProvider(l9, block), headers));
    }

    public final List<FormPart<?>> build$ktor_client_core() {
        return this.parts;
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, String str2, Headers headers, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            headers = Headers.Companion.getEmpty();
        }
        formBuilder.append(str, str2, headers);
    }

    public final void append(String key, String value, Headers headers) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        e0.checkNotNullParameter(headers, "headers");
        this.parts.add(new FormPart<>(key, value, headers));
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, Number number, Headers headers, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            headers = Headers.Companion.getEmpty();
        }
        formBuilder.append(str, number, headers);
    }

    public final void append(String key, Number value, Headers headers) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        e0.checkNotNullParameter(headers, "headers");
        this.parts.add(new FormPart<>(key, value, headers));
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, boolean z10, Headers headers, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            headers = Headers.Companion.getEmpty();
        }
        formBuilder.append(str, z10, headers);
    }

    public final void append(String key, boolean z10, Headers headers) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(headers, "headers");
        this.parts.add(new FormPart<>(key, Boolean.valueOf(z10), headers));
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, byte[] bArr, Headers headers, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            headers = Headers.Companion.getEmpty();
        }
        formBuilder.append(str, bArr, headers);
    }

    public final void append(String key, byte[] value, Headers headers) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        e0.checkNotNullParameter(headers, "headers");
        this.parts.add(new FormPart<>(key, value, headers));
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, InputProvider inputProvider, Headers headers, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            headers = Headers.Companion.getEmpty();
        }
        formBuilder.append(str, inputProvider, headers);
    }

    public final void append(String key, InputProvider value, Headers headers) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        e0.checkNotNullParameter(headers, "headers");
        this.parts.add(new FormPart<>(key, value, headers));
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, ByteReadPacket byteReadPacket, Headers headers, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            headers = Headers.Companion.getEmpty();
        }
        formBuilder.append(str, byteReadPacket, headers);
    }

    public final void append(String key, ByteReadPacket value, Headers headers) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        e0.checkNotNullParameter(headers, "headers");
        this.parts.add(new FormPart<>(key, value, headers));
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, Iterable iterable, Headers headers, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            headers = Headers.Companion.getEmpty();
        }
        formBuilder.append(str, (Iterable<String>) iterable, headers);
    }

    public final void append(String key, Iterable<String> values, Headers headers) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(values, "values");
        e0.checkNotNullParameter(headers, "headers");
        if (k0.endsWith$default(key, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, false, 2, null)) {
            Iterator<String> it = values.iterator();
            while (it.hasNext()) {
                this.parts.add(new FormPart<>(key, it.next(), headers));
            }
            return;
        }
        throw new IllegalArgumentException(b.l("Array parameter must be suffixed with square brackets ie `", key, "[]`").toString());
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, String[] strArr, Headers headers, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            headers = Headers.Companion.getEmpty();
        }
        formBuilder.append(str, strArr, headers);
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, ChannelProvider channelProvider, Headers headers, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            headers = Headers.Companion.getEmpty();
        }
        formBuilder.append(str, channelProvider, headers);
    }

    public final void append(String key, String[] values, Headers headers) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(values, "values");
        e0.checkNotNullParameter(headers, "headers");
        append(key, uu.k0.asIterable(values), headers);
    }

    public final void append(String key, ChannelProvider value, Headers headers) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        e0.checkNotNullParameter(headers, "headers");
        this.parts.add(new FormPart<>(key, value, headers));
    }

    public final <T> void append(FormPart<T> part) {
        e0.checkNotNullParameter(part, "part");
        this.parts.add(part);
    }
}
