package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpClientPluginKt {
    private static final AttributeKey<Attributes> PLUGIN_INSTALLED_LIST = new AttributeKey<>("ApplicationPluginRegistry");

    public static final AttributeKey<Attributes> getPLUGIN_INSTALLED_LIST() {
        return PLUGIN_INSTALLED_LIST;
    }

    public static final <B, F> F plugin(HttpClient httpClient, HttpClientPlugin<? extends B, F> plugin) {
        e0.checkNotNullParameter(httpClient, "<this>");
        e0.checkNotNullParameter(plugin, "plugin");
        F f10 = (F) pluginOrNull(httpClient, plugin);
        if (f10 != null) {
            return f10;
        }
        throw new IllegalStateException("Plugin " + plugin + " is not installed. Consider using `install(" + plugin.getKey() + ")` in client config first.");
    }

    public static final <B, F> F pluginOrNull(HttpClient httpClient, HttpClientPlugin<? extends B, F> plugin) {
        e0.checkNotNullParameter(httpClient, "<this>");
        e0.checkNotNullParameter(plugin, "plugin");
        Attributes attributes = (Attributes) httpClient.getAttributes().getOrNull(PLUGIN_INSTALLED_LIST);
        if (attributes != null) {
            return (F) attributes.getOrNull(plugin.getKey());
        }
        return null;
    }
}
