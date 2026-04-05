package yr;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import xr.c5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h0 extends i0 {

    /* renamed from: d, reason: collision with root package name */
    public static final zr.i f94912d;

    /* renamed from: e, reason: collision with root package name */
    public static final zr.i f94913e;

    /* renamed from: f, reason: collision with root package name */
    public static final zr.i f94914f;

    /* renamed from: g, reason: collision with root package name */
    public static final zr.i f94915g;

    /* renamed from: h, reason: collision with root package name */
    public static final zr.i f94916h;

    /* renamed from: i, reason: collision with root package name */
    public static final zr.i f94917i;

    /* renamed from: j, reason: collision with root package name */
    public static final Method f94918j;

    /* renamed from: k, reason: collision with root package name */
    public static final Method f94919k;

    /* renamed from: l, reason: collision with root package name */
    public static final Method f94920l;

    /* renamed from: m, reason: collision with root package name */
    public static final Method f94921m;

    /* renamed from: n, reason: collision with root package name */
    public static final Method f94922n;

    /* renamed from: o, reason: collision with root package name */
    public static final Method f94923o;

    /* renamed from: p, reason: collision with root package name */
    public static final Constructor f94924p;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Class<?> cls;
        Logger logger = i0.f94926b;
        Class cls2 = Boolean.TYPE;
        Constructor<?> constructor = null;
        f94912d = new zr.i(null, "setUseSessionTickets", cls2);
        f94913e = new zr.i(null, "setHostname", String.class);
        f94914f = new zr.i(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
        f94915g = new zr.i(null, "setAlpnProtocols", byte[].class);
        f94916h = new zr.i(byte[].class, "getNpnSelectedProtocol", new Class[0]);
        f94917i = new zr.i(null, "setNpnProtocols", byte[].class);
        try {
            method = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            try {
                method2 = SSLParameters.class.getMethod("getApplicationProtocols", null);
            } catch (ClassNotFoundException e10) {
                e = e10;
                method2 = null;
                method3 = method2;
                method4 = method3;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f94920l = method;
                f94921m = method2;
                f94922n = method3;
                f94918j = method4;
                f94919k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f94923o = method6;
                f94924p = constructor;
            } catch (NoSuchMethodException e11) {
                e = e11;
                method2 = null;
                method3 = method2;
                method4 = method3;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f94920l = method;
                f94921m = method2;
                f94922n = method3;
                f94918j = method4;
                f94919k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f94923o = method6;
                f94924p = constructor;
            }
            try {
                method3 = SSLSocket.class.getMethod("getApplicationProtocol", null);
                try {
                    cls = Class.forName("android.net.ssl.SSLSockets");
                    method4 = cls.getMethod("isSupportedSocket", SSLSocket.class);
                } catch (ClassNotFoundException e12) {
                    e = e12;
                    method4 = null;
                } catch (NoSuchMethodException e13) {
                    e = e13;
                    method4 = null;
                }
            } catch (ClassNotFoundException e14) {
                e = e14;
                method3 = null;
                method4 = method3;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f94920l = method;
                f94921m = method2;
                f94922n = method3;
                f94918j = method4;
                f94919k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f94923o = method6;
                f94924p = constructor;
            } catch (NoSuchMethodException e15) {
                e = e15;
                method3 = null;
                method4 = method3;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f94920l = method;
                f94921m = method2;
                f94922n = method3;
                f94918j = method4;
                f94919k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f94923o = method6;
                f94924p = constructor;
            }
            try {
                method5 = cls.getMethod("setUseSessionTickets", SSLSocket.class, cls2);
            } catch (ClassNotFoundException e16) {
                e = e16;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f94920l = method;
                f94921m = method2;
                f94922n = method3;
                f94918j = method4;
                f94919k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f94923o = method6;
                f94924p = constructor;
            } catch (NoSuchMethodException e17) {
                e = e17;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f94920l = method;
                f94921m = method2;
                f94922n = method3;
                f94918j = method4;
                f94919k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f94923o = method6;
                f94924p = constructor;
            }
        } catch (ClassNotFoundException e18) {
            e = e18;
            method = null;
            method2 = null;
        } catch (NoSuchMethodException e19) {
            e = e19;
            method = null;
            method2 = null;
        }
        f94920l = method;
        f94921m = method2;
        f94922n = method3;
        f94918j = method4;
        f94919k = method5;
        try {
            method6 = SSLParameters.class.getMethod("setServerNames", List.class);
        } catch (ClassNotFoundException e20) {
            e = e20;
            method6 = null;
        } catch (NoSuchMethodException e21) {
            e = e21;
            method6 = null;
        }
        try {
            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
        } catch (ClassNotFoundException e22) {
            e = e22;
            logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
            f94923o = method6;
            f94924p = constructor;
        } catch (NoSuchMethodException e23) {
            e = e23;
            logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
            f94923o = method6;
            f94924p = constructor;
        }
        f94923o = method6;
        f94924p = constructor;
    }

    @Override // yr.i0
    public final void a(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Constructor constructor;
        Method method;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((zr.p) it.next()).toString());
        }
        boolean z10 = false;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (str != null) {
            try {
                try {
                    if (!str.contains("_")) {
                        try {
                            c5.checkAuthority(str);
                            Method method2 = f94918j;
                            if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                                f94912d.invokeOptionalWithoutCheckedException(sSLSocket, Boolean.TRUE);
                            } else {
                                f94919k.invoke(null, sSLSocket, Boolean.TRUE);
                            }
                            Method method3 = f94923o;
                            if (method3 == null || (constructor = f94924p) == null) {
                                f94913e.invokeOptionalWithoutCheckedException(sSLSocket, str);
                            } else {
                                method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                            }
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                } catch (InvocationTargetException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (IllegalAccessException e11) {
                throw new RuntimeException(e11);
            } catch (InstantiationException e12) {
                throw new RuntimeException(e12);
            }
        }
        Method method4 = f94922n;
        if (method4 != null) {
            try {
                method4.invoke(sSLSocket, null);
                f94920l.invoke(sSLParameters, strArr);
                z10 = true;
            } catch (InvocationTargetException e13) {
                if (!(e13.getTargetException() instanceof UnsupportedOperationException)) {
                    throw e13;
                }
                i0.f94926b.log(Level.FINER, "setApplicationProtocol unsupported, will try old methods");
            }
        }
        sSLSocket.setSSLParameters(sSLParameters);
        if (z10 && (method = f94921m) != null && Arrays.equals(strArr, (String[]) method.invoke(sSLSocket.getSSLParameters(), null))) {
            return;
        }
        Object[] objArr = {zr.m.concatLengthPrefixed(list)};
        zr.m mVar = this.f94928a;
        if (mVar.getTlsExtensionType() == zr.o.f98504b) {
            f94915g.invokeWithoutCheckedException(sSLSocket, objArr);
        }
        if (mVar.getTlsExtensionType() == zr.o.f98506e) {
            throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
        }
        f94917i.invokeWithoutCheckedException(sSLSocket, objArr);
    }

    @Override // yr.i0
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        Logger logger = i0.f94926b;
        Method method = f94922n;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, null);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                if (!(e11.getTargetException() instanceof UnsupportedOperationException)) {
                    throw new RuntimeException(e11);
                }
                logger.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
            }
        }
        zr.m mVar = this.f94928a;
        if (mVar.getTlsExtensionType() == zr.o.f98504b) {
            try {
                byte[] bArr = (byte[]) f94914f.invokeWithoutCheckedException(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, zr.s.f98525b);
                }
            } catch (Exception e12) {
                logger.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e12);
            }
        }
        if (mVar.getTlsExtensionType() != zr.o.f98506e) {
            try {
                byte[] bArr2 = (byte[]) f94916h.invokeWithoutCheckedException(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, zr.s.f98525b);
                }
            } catch (Exception e13) {
                logger.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e13);
            }
        }
        return null;
    }

    @Override // yr.i0
    public String negotiate(SSLSocket sSLSocket, String str, List<zr.p> list) throws IOException {
        String selectedProtocol = getSelectedProtocol(sSLSocket);
        return selectedProtocol == null ? super.negotiate(sSLSocket, str, list) : selectedProtocol;
    }
}
