package xp;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h extends g {
    @Override // xp.g, javax.net.ssl.SSLSocket
    public void setEnabledProtocols(String[] strArr) {
        if (strArr != null && strArr.length == 1 && "SSLv3".equals(strArr[0])) {
            ArrayList arrayList = new ArrayList(Arrays.asList(this.f92187b.getEnabledProtocols()));
            if (arrayList.size() > 1) {
                arrayList.remove("SSLv3");
                System.out.println("Removed SSLv3 from enabled protocols");
            } else {
                System.out.println("SSL stuck with protocol available for " + arrayList);
            }
            strArr = (String[]) arrayList.toArray(new String[0]);
        }
        super.setEnabledProtocols(strArr);
    }
}
