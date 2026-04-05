package zr;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLParameters;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k implements PrivilegedExceptionAction {
    @Override // java.security.PrivilegedExceptionAction
    public Method run() throws Exception {
        return SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
    }
}
