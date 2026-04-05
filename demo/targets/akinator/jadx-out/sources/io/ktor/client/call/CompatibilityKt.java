package io.ktor.client.call;

import io.ktor.client.statement.HttpResponse;
import io.ktor.util.reflect.TypeInfo;
import tu.f;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class CompatibilityKt {
    @f
    public static final /* synthetic */ <T> Object receive(HttpClientCall httpClientCall, d<? super T> dVar) {
        throw new IllegalStateException("Use `body` method instead");
    }

    @f
    public static final /* synthetic */ <T> Object receive(HttpResponse httpResponse, d<? super T> dVar) {
        throw new IllegalStateException("Use `body` method instead");
    }

    @f
    public static final Object receive(HttpClientCall httpClientCall, TypeInfo typeInfo, d<Object> dVar) {
        throw new IllegalStateException("Use `body` method instead");
    }
}
