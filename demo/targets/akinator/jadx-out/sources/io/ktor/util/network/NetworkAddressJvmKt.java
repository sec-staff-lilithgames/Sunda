package io.ktor.util.network;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class NetworkAddressJvmKt {
    public static final SocketAddress NetworkAddress(String hostname, int i10) {
        e0.checkNotNullParameter(hostname, "hostname");
        return new InetSocketAddress(hostname, i10);
    }

    public static final String getAddress(SocketAddress socketAddress) {
        e0.checkNotNullParameter(socketAddress, "<this>");
        InetSocketAddress inetSocketAddress = socketAddress instanceof InetSocketAddress ? (InetSocketAddress) socketAddress : null;
        String hostString = inetSocketAddress != null ? inetSocketAddress.getHostString() : null;
        return hostString == null ? "" : hostString;
    }

    public static final String getHostname(SocketAddress socketAddress) {
        InetAddress address;
        String hostName;
        e0.checkNotNullParameter(socketAddress, "<this>");
        boolean z10 = socketAddress instanceof InetSocketAddress;
        String hostName2 = null;
        InetSocketAddress inetSocketAddress = z10 ? (InetSocketAddress) socketAddress : null;
        if (inetSocketAddress != null && (hostName = inetSocketAddress.getHostName()) != null) {
            return hostName;
        }
        InetSocketAddress inetSocketAddress2 = z10 ? (InetSocketAddress) socketAddress : null;
        if (inetSocketAddress2 != null && (address = inetSocketAddress2.getAddress()) != null) {
            hostName2 = address.getHostName();
        }
        return hostName2 == null ? "" : hostName2;
    }

    public static final int getPort(SocketAddress socketAddress) {
        e0.checkNotNullParameter(socketAddress, "<this>");
        InetSocketAddress inetSocketAddress = socketAddress instanceof InetSocketAddress ? (InetSocketAddress) socketAddress : null;
        if (inetSocketAddress != null) {
            return inetSocketAddress.getPort();
        }
        return 0;
    }
}
