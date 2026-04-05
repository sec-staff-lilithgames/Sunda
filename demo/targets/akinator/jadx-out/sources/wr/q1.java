package wr;

import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import wr.q3;
import wr.x5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class q1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f91097a = b.create("io.grpc.Grpc.TRANSPORT_ATTR_REMOTE_ADDR");

    /* renamed from: b, reason: collision with root package name */
    public static final b f91098b = b.create("io.grpc.Grpc.TRANSPORT_ATTR_LOCAL_ADDR");

    /* renamed from: c, reason: collision with root package name */
    public static final b f91099c = b.create("io.grpc.Grpc.TRANSPORT_ATTR_SSL_SESSION");

    public static l3 newChannelBuilder(String str, k kVar) {
        t4 providerForScheme;
        List list;
        List<n3> list2;
        q3 defaultRegistry = q3.getDefaultRegistry();
        defaultRegistry.getClass();
        w4 defaultRegistry2 = w4.getDefaultRegistry();
        try {
            providerForScheme = defaultRegistry2.getProviderForScheme(new URI(str).getScheme());
        } catch (URISyntaxException unused) {
            providerForScheme = null;
        }
        if (providerForScheme == null) {
            providerForScheme = defaultRegistry2.getProviderForScheme(defaultRegistry2.getDefaultScheme());
        }
        Collection<Class<? extends SocketAddress>> producedSocketAddressTypes = providerForScheme != null ? providerForScheme.getProducedSocketAddressTypes() : Collections.EMPTY_SET;
        synchronized (defaultRegistry) {
            list = defaultRegistry.f91104b;
        }
        if (list.isEmpty()) {
            throw new q3.a("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
        }
        StringBuilder sb2 = new StringBuilder();
        synchronized (defaultRegistry) {
            list2 = defaultRegistry.f91104b;
        }
        for (n3 n3Var : list2) {
            if (n3Var.a().containsAll(producedSocketAddressTypes)) {
                m3 m3VarNewChannelBuilder = n3Var.newChannelBuilder(str, kVar);
                if (m3VarNewChannelBuilder.getChannelBuilder() != null) {
                    return m3VarNewChannelBuilder.getChannelBuilder();
                }
                sb2.append("; ");
                sb2.append(n3Var.getClass().getName());
                sb2.append(": ");
                sb2.append(m3VarNewChannelBuilder.getError());
            } else {
                sb2.append("; ");
                sb2.append(n3Var.getClass().getName());
                sb2.append(": does not support 1 or more of ");
                sb2.append(Arrays.toString(producedSocketAddressTypes.toArray()));
            }
        }
        throw new q3.a(sb2.substring(2));
    }

    public static l3 newChannelBuilderForAddress(String str, int i10, k kVar) {
        String str2;
        int i11;
        try {
            str2 = str;
            i11 = i10;
        } catch (URISyntaxException e10) {
            e = e10;
            str2 = str;
            i11 = i10;
        }
        try {
            return newChannelBuilder(new URI(null, null, str2, i11, null, null, null).getAuthority(), kVar);
        } catch (URISyntaxException e11) {
            e = e11;
            throw new IllegalArgumentException("Invalid host or port: " + str2 + " " + i11, e);
        }
    }

    public static j5 newServerBuilderForPort(int i10, n5 n5Var) {
        List list;
        List<v5> list2;
        x5 defaultRegistry = x5.getDefaultRegistry();
        synchronized (defaultRegistry) {
            list = defaultRegistry.f91189b;
        }
        if (list.isEmpty()) {
            throw new x5.a("No functional server found. Try adding a dependency on the grpc-netty, grpc-netty-shaded, or grpc-okhttp artifact");
        }
        StringBuilder sb2 = new StringBuilder();
        synchronized (defaultRegistry) {
            list2 = defaultRegistry.f91189b;
        }
        for (v5 v5Var : list2) {
            u5 u5VarB = v5Var.b(i10, n5Var);
            if (u5VarB.getServerBuilder() != null) {
                return u5VarB.getServerBuilder();
            }
            sb2.append("; ");
            sb2.append(v5Var.getClass().getName());
            sb2.append(": ");
            sb2.append(u5VarB.getError());
        }
        throw new x5.a(sb2.substring(2));
    }
}
