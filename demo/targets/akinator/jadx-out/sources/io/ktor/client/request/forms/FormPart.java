package io.ktor.client.request.forms;

import io.ktor.http.Headers;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class FormPart<T> {
    private final Headers headers;
    private final String key;
    private final T value;

    public FormPart(String key, T value, Headers headers) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        e0.checkNotNullParameter(headers, "headers");
        this.key = key;
        this.value = value;
        this.headers = headers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormPart copy$default(FormPart formPart, String str, Object obj, Headers headers, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = formPart.key;
        }
        if ((i10 & 2) != 0) {
            obj = formPart.value;
        }
        if ((i10 & 4) != 0) {
            headers = formPart.headers;
        }
        return formPart.copy(str, obj, headers);
    }

    public final String component1() {
        return this.key;
    }

    public final T component2() {
        return this.value;
    }

    public final Headers component3() {
        return this.headers;
    }

    public final FormPart<T> copy(String key, T value, Headers headers) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        e0.checkNotNullParameter(headers, "headers");
        return new FormPart<>(key, value, headers);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormPart)) {
            return false;
        }
        FormPart formPart = (FormPart) obj;
        return e0.areEqual(this.key, formPart.key) && e0.areEqual(this.value, formPart.value) && e0.areEqual(this.headers, formPart.headers);
    }

    public final Headers getHeaders() {
        return this.headers;
    }

    public final String getKey() {
        return this.key;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.headers.hashCode() + ((this.value.hashCode() + (this.key.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "FormPart(key=" + this.key + ", value=" + this.value + ", headers=" + this.headers + ')';
    }

    public /* synthetic */ FormPart(String str, Object obj, Headers headers, int i10, u uVar) {
        this(str, obj, (i10 & 4) != 0 ? Headers.Companion.getEmpty() : headers);
    }
}
