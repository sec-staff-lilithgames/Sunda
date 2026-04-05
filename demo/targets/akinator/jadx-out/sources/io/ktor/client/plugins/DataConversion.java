package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.util.AttributeKey;
import io.ktor.util.converters.DataConversion;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class DataConversion implements HttpClientPlugin<DataConversion.Configuration, io.ktor.util.converters.DataConversion> {
    public static final DataConversion INSTANCE = new DataConversion();
    private static final AttributeKey<io.ktor.util.converters.DataConversion> key = new AttributeKey<>("DataConversion");

    private DataConversion() {
    }

    @Override // io.ktor.client.plugins.HttpClientPlugin
    public AttributeKey<io.ktor.util.converters.DataConversion> getKey() {
        return key;
    }

    @Override // io.ktor.client.plugins.HttpClientPlugin
    public void install(io.ktor.util.converters.DataConversion plugin, HttpClient scope) {
        e0.checkNotNullParameter(plugin, "plugin");
        e0.checkNotNullParameter(scope, "scope");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.ktor.client.plugins.HttpClientPlugin
    public io.ktor.util.converters.DataConversion prepare(l block) {
        e0.checkNotNullParameter(block, "block");
        DataConversion.Configuration configuration = new DataConversion.Configuration();
        block.invoke(configuration);
        return new io.ktor.util.converters.DataConversion(configuration);
    }
}
