package io.ktor.websocket;

import io.ktor.util.AttributeKey;
import io.ktor.websocket.WebSocketExtension;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface WebSocketExtensionFactory<ConfigType, ExtensionType extends WebSocketExtension<ConfigType>> {
    AttributeKey<ExtensionType> getKey();

    boolean getRsv1();

    boolean getRsv2();

    boolean getRsv3();

    ExtensionType install(l lVar);
}
