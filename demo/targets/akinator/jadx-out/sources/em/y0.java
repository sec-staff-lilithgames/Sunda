package em;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import io.bidmachine.protobuf.Waterfall;
import java.net.URLConnection;
import nm.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y0 extends d.b {
    @Override // nm.d.b
    public final Object createSuccessResult(nm.d dVar, URLConnection uRLConnection, byte[] bArr) {
        return Waterfall.parseFrom(bArr).getResponse();
    }

    @Override // nm.d.b
    public final byte[] obtainData(nm.d dVar, URLConnection uRLConnection, Object obj) {
        return Waterfall.newBuilder().setRequest((Waterfall.Result) obj).build().toByteArray();
    }

    @Override // nm.d.b
    public final void prepareHeaders(nm.d dVar, URLConnection uRLConnection) {
        uRLConnection.setRequestProperty("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
    }
}
