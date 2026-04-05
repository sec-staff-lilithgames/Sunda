package zr;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.security.ProviderInstaller;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class m {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f98483b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f98484c;

    /* renamed from: d, reason: collision with root package name */
    public static final m f98485d;

    /* renamed from: a, reason: collision with root package name */
    public final Provider f98486a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends m {

        /* renamed from: e, reason: collision with root package name */
        public final i f98487e;

        /* renamed from: f, reason: collision with root package name */
        public final i f98488f;

        /* renamed from: g, reason: collision with root package name */
        public final Method f98489g;

        /* renamed from: h, reason: collision with root package name */
        public final Method f98490h;

        /* renamed from: i, reason: collision with root package name */
        public final i f98491i;

        /* renamed from: j, reason: collision with root package name */
        public final i f98492j;

        /* renamed from: k, reason: collision with root package name */
        public final o f98493k;

        public a(i iVar, i iVar2, Method method, Method method2, i iVar3, i iVar4, Provider provider, o oVar) {
            super(provider);
            this.f98487e = iVar;
            this.f98488f = iVar2;
            this.f98489g = method;
            this.f98490h = method2;
            this.f98491i = iVar3;
            this.f98492j = iVar4;
            this.f98493k = oVar;
        }

        @Override // zr.m
        public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<p> list) {
            if (str != null) {
                this.f98487e.invokeOptionalWithoutCheckedException(sSLSocket, Boolean.TRUE);
                this.f98488f.invokeOptionalWithoutCheckedException(sSLSocket, str);
            }
            i iVar = this.f98492j;
            if (iVar.isSupported(sSLSocket)) {
                iVar.invokeWithoutCheckedException(sSLSocket, m.concatLengthPrefixed(list));
            }
        }

        @Override // zr.m
        public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
            try {
                socket.connect(inetSocketAddress, i10);
            } catch (SecurityException e10) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e10);
                throw iOException;
            }
        }

        @Override // zr.m
        public String getSelectedProtocol(SSLSocket sSLSocket) {
            byte[] bArr;
            i iVar = this.f98491i;
            if (iVar.isSupported(sSLSocket) && (bArr = (byte[]) iVar.invokeWithoutCheckedException(sSLSocket, new Object[0])) != null) {
                return new String(bArr, s.f98525b);
            }
            return null;
        }

        @Override // zr.m
        public o getTlsExtensionType() {
            return this.f98493k;
        }

        @Override // zr.m
        public void tagSocket(Socket socket) throws IllegalAccessException, SocketException, IllegalArgumentException, InvocationTargetException {
            Method method = this.f98489g;
            if (method == null) {
                return;
            }
            try {
                method.invoke(null, socket);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }

        @Override // zr.m
        public void untagSocket(Socket socket) throws IllegalAccessException, SocketException, IllegalArgumentException, InvocationTargetException {
            Method method = this.f98490h;
            if (method == null) {
                return;
            }
            try {
                method.invoke(null, socket);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends m {

        /* renamed from: e, reason: collision with root package name */
        public final Method f98494e;

        /* renamed from: f, reason: collision with root package name */
        public final Method f98495f;

        /* renamed from: g, reason: collision with root package name */
        public final Method f98496g;

        /* renamed from: h, reason: collision with root package name */
        public final Class f98497h;

        /* renamed from: i, reason: collision with root package name */
        public final Class f98498i;

        public b(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2, Provider provider) {
            super(provider);
            this.f98494e = method;
            this.f98495f = method2;
            this.f98496g = method3;
            this.f98497h = cls;
            this.f98498i = cls2;
        }

        @Override // zr.m
        public void afterHandshake(SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                this.f98496g.invoke(null, sSLSocket);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e10) {
                m.f98483b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e10);
            }
        }

        @Override // zr.m
        public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<p> list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                p pVar = list.get(i10);
                if (pVar != p.HTTP_1_0) {
                    arrayList.add(pVar.toString());
                }
            }
            try {
                this.f98494e.invoke(null, sSLSocket, Proxy.newProxyInstance(m.class.getClassLoader(), new Class[]{this.f98497h, this.f98498i}, new c(arrayList)));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // zr.m
        public String getSelectedProtocol(SSLSocket sSLSocket) {
            try {
                c cVar = (c) Proxy.getInvocationHandler(this.f98495f.invoke(null, sSLSocket));
                boolean z10 = cVar.f98500b;
                if (!z10 && cVar.f98501c == null) {
                    m.f98483b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                }
                if (z10) {
                    return null;
                }
                return cVar.f98501c;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
                throw new AssertionError();
            }
        }

        @Override // zr.m
        public o getTlsExtensionType() {
            return o.f98504b;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public final List f98499a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f98500b;

        /* renamed from: c, reason: collision with root package name */
        public String f98501c;

        public c(List<String> list) {
            this.f98499a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = s.f98524a;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f98500b = true;
                return null;
            }
            boolean zEquals = name.equals("protocols");
            List list = this.f98499a;
            if (zEquals && objArr.length == 0) {
                return list;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list2 = (List) obj2;
                    int size = list2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (list.contains(list2.get(i10))) {
                            String str = (String) list2.get(i10);
                            this.f98501c = str;
                            return str;
                        }
                    }
                    String str2 = (String) list.get(0);
                    this.f98501c = str2;
                    return str2;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f98501c = (String) objArr[0];
            return null;
        }
    }

    static {
        Method method;
        Provider provider;
        Provider provider2;
        m mVar;
        Method method2;
        Logger logger = Logger.getLogger(m.class.getName());
        f98483b = logger;
        f98484c = new String[]{"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i10 = 0;
        loop0: while (true) {
            method = null;
            if (i10 >= length) {
                logger.log(Level.WARNING, "Unable to find Conscrypt");
                provider = null;
                break;
            }
            Provider provider3 = providers[i10];
            for (String str : f98484c) {
                if (str.equals(provider3.getClass().getName())) {
                    logger.log(Level.FINE, "Found registered provider {0}", str);
                    provider = provider3;
                    break loop0;
                }
            }
            i10++;
        }
        if (provider != null) {
            i iVar = new i(null, "setUseSessionTickets", Boolean.TYPE);
            i iVar2 = new i(null, "setHostname", String.class);
            i iVar3 = new i(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            i iVar4 = new i(null, "setAlpnProtocols", byte[].class);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                method2 = cls.getMethod("tagSocket", Socket.class);
                try {
                    method = cls.getMethod("untagSocket", Socket.class);
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                method2 = null;
            }
            Method method3 = method2;
            Method method4 = method;
            boolean zEquals = provider.getName().equals(ProviderInstaller.PROVIDER_NAME);
            o oVar = o.f98504b;
            if (!zEquals && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
                try {
                    m.class.getClassLoader().loadClass("android.net.Network");
                } catch (ClassNotFoundException e10) {
                    logger.log(Level.FINE, "Can't find class", (Throwable) e10);
                    try {
                        m.class.getClassLoader().loadClass("android.app.ActivityOptions");
                        oVar = o.f98505c;
                    } catch (ClassNotFoundException e11) {
                        logger.log(Level.FINE, "Can't find class", (Throwable) e11);
                        oVar = o.f98506e;
                    }
                }
            }
            mVar = new a(iVar, iVar2, method3, method4, iVar3, iVar4, provider, oVar);
        } else {
            try {
                Provider provider4 = SSLContext.getDefault().getProvider();
                try {
                    try {
                        SSLContext sSLContext = SSLContext.getInstance("TLS", provider4);
                        sSLContext.init(null, null, null);
                        ((Method) AccessController.doPrivileged(new j())).invoke(sSLContext.createSSLEngine(), null);
                        mVar = new n(provider4, (Method) AccessController.doPrivileged(new k()), (Method) AccessController.doPrivileged(new l()));
                    } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                        provider2 = provider4;
                        mVar = new m(provider2);
                        f98485d = mVar;
                    }
                } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused4) {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    try {
                        mVar = new b(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod("get", SSLSocket.class), cls2.getMethod(ProductAction.ACTION_REMOVE, SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider4);
                    } catch (ClassNotFoundException | NoSuchMethodException unused5) {
                        provider2 = provider4;
                        mVar = new m(provider2);
                        f98485d = mVar;
                    }
                }
            } catch (NoSuchAlgorithmException e12) {
                throw new RuntimeException(e12);
            }
        }
        f98485d = mVar;
    }

    public m(Provider provider) {
        this.f98486a = provider;
    }

    public static byte[] concatLengthPrefixed(List<p> list) {
        pw.g gVar = new pw.g();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = list.get(i10);
            if (pVar != p.HTTP_1_0) {
                gVar.writeByte(pVar.toString().length());
                gVar.writeUtf8(pVar.toString());
            }
        }
        return gVar.readByteArray();
    }

    public static m get() {
        return f98485d;
    }

    public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        socket.connect(inetSocketAddress, i10);
    }

    public String getPrefix() {
        return "OkHttp";
    }

    public Provider getProvider() {
        return this.f98486a;
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
        return null;
    }

    public o getTlsExtensionType() {
        return o.f98506e;
    }

    public void logW(String str) {
        System.out.println(str);
    }

    public void afterHandshake(SSLSocket sSLSocket) {
    }

    public void tagSocket(Socket socket) throws SocketException {
    }

    public void untagSocket(Socket socket) throws SocketException {
    }

    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<p> list) {
    }
}
