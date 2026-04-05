package io.ktor.client.engine;

import java.net.Proxy;
import java.net.SocketAddress;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class ProxyConfigJvmKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.SOCKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ProxyType getType(Proxy proxy) {
        e0.checkNotNullParameter(proxy, "<this>");
        Proxy.Type type = proxy.type();
        int i10 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        return i10 != 1 ? i10 != 2 ? ProxyType.UNKNOWN : ProxyType.HTTP : ProxyType.SOCKS;
    }

    public static final SocketAddress resolveAddress(Proxy proxy) {
        e0.checkNotNullParameter(proxy, "<this>");
        SocketAddress socketAddressAddress = proxy.address();
        e0.checkNotNullExpressionValue(socketAddressAddress, "address()");
        return socketAddressAddress;
    }
}
