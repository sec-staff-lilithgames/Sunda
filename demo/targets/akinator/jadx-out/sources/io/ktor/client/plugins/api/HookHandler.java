package io.ktor.client.plugins.api;

import io.ktor.client.HttpClient;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HookHandler<T> {
    private final T handler;
    private final ClientHook<T> hook;

    public HookHandler(ClientHook<T> hook, T t10) {
        e0.checkNotNullParameter(hook, "hook");
        this.hook = hook;
        this.handler = t10;
    }

    public final void install(HttpClient client) {
        e0.checkNotNullParameter(client, "client");
        this.hook.install(client, this.handler);
    }
}
