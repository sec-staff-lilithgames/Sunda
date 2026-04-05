package bd;

import com.ironsource.C3191e4;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class q extends y0 {
    public q() {
        super(InetSocketAddress.class);
    }

    @Override // bd.z0, jc.w
    public void serialize(InetSocketAddress inetSocketAddress, ub.o oVar, jc.u0 u0Var) throws IOException {
        String strSubstring;
        InetAddress address = inetSocketAddress.getAddress();
        String hostName = address == null ? inetSocketAddress.getHostName() : address.toString().trim();
        int iIndexOf = hostName.indexOf(47);
        if (iIndexOf >= 0) {
            if (iIndexOf == 0) {
                if (address instanceof Inet6Address) {
                    strSubstring = C3191e4.i.f36529d + hostName.substring(1) + C3191e4.i.f36531e;
                } else {
                    strSubstring = hostName.substring(1);
                }
                hostName = strSubstring;
            } else {
                hostName = hostName.substring(0, iIndexOf);
            }
        }
        StringBuilder sbT = a.b.t(hostName, ":");
        sbT.append(inetSocketAddress.getPort());
        oVar.writeString(sbT.toString());
    }

    @Override // bd.y0, jc.w
    public void serializeWithType(InetSocketAddress inetSocketAddress, ub.o oVar, jc.u0 u0Var, wc.j jVar) throws IOException {
        hc.c cVarWriteTypePrefix = jVar.writeTypePrefix(oVar, jVar.typeId(inetSocketAddress, InetSocketAddress.class, ub.z.VALUE_STRING));
        serialize(inetSocketAddress, oVar, u0Var);
        jVar.writeTypeSuffix(oVar, cVarWriteTypePrefix);
    }
}
