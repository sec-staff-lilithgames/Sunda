package xr;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.logging.Level;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class wa implements ya {
    @Override // xr.ya
    public PasswordAuthentication requestPasswordAuthentication(String str, InetAddress inetAddress, int i10, String str2, String str3, String str4) {
        URL url;
        try {
            url = new URL(str2, str, i10, "");
        } catch (MalformedURLException unused) {
            za.f93326d.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{str2, str});
            url = null;
        }
        return Authenticator.requestPasswordAuthentication(str, inetAddress, i10, str2, str3, str4, url, Authenticator.RequestorType.PROXY);
    }
}
