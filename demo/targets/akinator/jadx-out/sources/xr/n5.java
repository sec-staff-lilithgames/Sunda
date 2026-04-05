package xr;

import java.io.IOException;
import java.net.SocketAddress;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface n5 {
    SocketAddress getListenSocketAddress();

    List<? extends SocketAddress> getListenSocketAddresses();

    wr.m2 getListenSocketStats();

    List<wr.m2> getListenSocketStatsList();

    void shutdown();

    void start(de deVar) throws IOException;
}
