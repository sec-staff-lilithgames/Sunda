package zr;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n extends m {

    /* renamed from: e, reason: collision with root package name */
    public final Method f98502e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f98503f;

    public n(Provider provider, Method method, Method method2) {
        super(provider);
        this.f98502e = method;
        this.f98503f = method2;
    }

    @Override // zr.m
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<p> list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList(list.size());
        for (p pVar : list) {
            if (pVar != p.HTTP_1_0) {
                arrayList.add(pVar.toString());
            }
        }
        try {
            this.f98502e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // zr.m
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        try {
            return (String) this.f98503f.invoke(sSLSocket, null);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // zr.m
    public o getTlsExtensionType() {
        return o.f98504b;
    }
}
