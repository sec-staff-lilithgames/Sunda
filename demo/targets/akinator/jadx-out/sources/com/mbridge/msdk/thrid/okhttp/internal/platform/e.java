package com.mbridge.msdk.thrid.okhttp.internal.platform;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.mbridge.msdk.thrid.okhttp.u;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
class e extends g {

    /* renamed from: c, reason: collision with root package name */
    private final Method f43621c;

    /* renamed from: d, reason: collision with root package name */
    private final Method f43622d;

    /* renamed from: e, reason: collision with root package name */
    private final Method f43623e;

    /* renamed from: f, reason: collision with root package name */
    private final Class<?> f43624f;

    /* renamed from: g, reason: collision with root package name */
    private final Class<?> f43625g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private final List<String> f43626a;

        /* renamed from: b, reason: collision with root package name */
        boolean f43627b;

        /* renamed from: c, reason: collision with root package name */
        String f43628c;

        public a(List<String> list) {
            this.f43626a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = com.mbridge.msdk.thrid.okhttp.internal.c.f43288b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f43627b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f43626a;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f43626a.contains(list.get(i10))) {
                            String str = (String) list.get(i10);
                            this.f43628c = str;
                            return str;
                        }
                    }
                    String str2 = this.f43626a.get(0);
                    this.f43628c = str2;
                    return str2;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f43628c = (String) objArr[0];
            return null;
        }
    }

    public e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f43621c = method;
        this.f43622d = method2;
        this.f43623e = method3;
        this.f43624f = cls;
        this.f43625g = cls2;
    }

    public static g h() throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
            return new e(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod(ProductAction.ACTION_REMOVE, SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public void a(SSLSocket sSLSocket, String str, List<u> list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f43621c.invoke(null, sSLSocket, Proxy.newProxyInstance(g.class.getClassLoader(), new Class[]{this.f43624f, this.f43625g}, new a(g.a(list))));
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw com.mbridge.msdk.thrid.okhttp.internal.c.a("unable to set alpn", (Exception) e10);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public String b(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f43622d.invoke(null, sSLSocket));
            boolean z10 = aVar.f43627b;
            if (!z10 && aVar.f43628c == null) {
                g.d().a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            }
            if (z10) {
                return null;
            }
            return aVar.f43628c;
        } catch (IllegalAccessException e10) {
            e = e10;
            throw com.mbridge.msdk.thrid.okhttp.internal.c.a("unable to get selected protocol", e);
        } catch (InvocationTargetException e11) {
            e = e11;
            throw com.mbridge.msdk.thrid.okhttp.internal.c.a("unable to get selected protocol", e);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public void a(SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f43623e.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw com.mbridge.msdk.thrid.okhttp.internal.c.a("unable to remove alpn", (Exception) e10);
        }
    }
}
