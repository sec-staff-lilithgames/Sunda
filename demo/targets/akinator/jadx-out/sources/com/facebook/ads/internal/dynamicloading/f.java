package com.facebook.ads.internal.dynamicloading;

import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f22998a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f22999b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f23000c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f23001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ HashMap f23002e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f23003f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ArrayList f23004g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Method f23005h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Method f23006i;

    public f(ArrayList arrayList, HashMap map, ArrayList arrayList2, ArrayList arrayList3, HashMap map2, ArrayList arrayList4, ArrayList arrayList5, Method method, Method method2) {
        this.f22998a = arrayList;
        this.f22999b = map;
        this.f23000c = arrayList2;
        this.f23001d = arrayList3;
        this.f23002e = map2;
        this.f23003f = arrayList4;
        this.f23004g = arrayList5;
        this.f23005h = method;
        this.f23006i = method2;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        HashMap map;
        boolean zIsPrimitive = method.getReturnType().isPrimitive();
        HashMap map2 = this.f22999b;
        if (zIsPrimitive) {
            if (!method.getReturnType().equals(Void.TYPE)) {
                return Array.get(Array.newInstance(method.getReturnType(), 1), 0);
            }
            Iterator it = this.f22998a.iterator();
            while (it.hasNext() && (!DynamicLoaderFallback.equalsMethods(method, (Method) it.next()) || !DynamicLoaderFallback.reportError(obj, map2))) {
            }
            Iterator it2 = this.f23000c.iterator();
            while (it2.hasNext()) {
                if (DynamicLoaderFallback.equalsMethods(method, (Method) it2.next()) && DynamicLoaderFallback.reportError(obj, map2)) {
                    return null;
                }
            }
            return null;
        }
        if (method.getReturnType().equals(String.class)) {
            return "";
        }
        Object objNewProxyInstance = method.getReturnType().equals(obj.getClass().getInterfaces()[0]) ? obj : Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{method.getReturnType()}, this);
        Iterator it3 = this.f23001d.iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            map = this.f23002e;
            if (!zHasNext) {
                break;
            }
            if (DynamicLoaderFallback.equalsMethods(method, (Method) it3.next())) {
                DynamicLoaderFallback.sApiProxyToAdListenersMap.put(map.get(obj), (AdListener) objArr[0]);
                break;
            }
        }
        Iterator it4 = this.f23003f.iterator();
        while (it4.hasNext()) {
            if (DynamicLoaderFallback.equalsMethods(method, (Method) it4.next())) {
                map.put(objNewProxyInstance, obj);
            }
        }
        Iterator it5 = this.f23004g.iterator();
        while (it5.hasNext()) {
            if (DynamicLoaderFallback.equalsMethods(method, (Method) it5.next())) {
                for (Object obj2 : objArr) {
                    if (obj2 instanceof Ad) {
                        map2.put(objNewProxyInstance, (Ad) obj2);
                    }
                }
            }
        }
        if (DynamicLoaderFallback.equalsMethods(method, this.f23005h)) {
            map2.put(objArr[1], (Ad) objArr[0]);
        }
        if (DynamicLoaderFallback.equalsMethods(method, this.f23006i)) {
            map2.put(objArr[1], (Ad) objArr[0]);
        }
        return objNewProxyInstance;
    }
}
