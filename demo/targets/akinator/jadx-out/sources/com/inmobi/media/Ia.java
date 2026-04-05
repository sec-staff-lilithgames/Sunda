package com.inmobi.media;

import android.content.Context;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ia {

    /* renamed from: b, reason: collision with root package name */
    public static volatile Picasso f31874b;

    /* renamed from: a, reason: collision with root package name */
    public static final Ia f31873a = new Ia();

    /* renamed from: c, reason: collision with root package name */
    public static final Object f31875c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f31876d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public static final Ha f31877e = new Ha();

    public static final /* synthetic */ String d() {
        return "Ia";
    }

    public static final WeakReference a(Ia ia2, Context context) {
        ia2.getClass();
        int size = f31876d.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = f31876d;
            Context context2 = (Context) ((WeakReference) arrayList.get(i10)).get();
            if (context2 != null && kotlin.jvm.internal.e0.areEqual(context2, context)) {
                return (WeakReference) arrayList.get(i10);
            }
        }
        return null;
    }

    public final Picasso a(Context context) {
        WeakReference weakReference;
        Picasso picassoBuild;
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        synchronized (f31875c) {
            try {
                int size = f31876d.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        weakReference = null;
                        break;
                    }
                    ArrayList arrayList = f31876d;
                    Context context2 = (Context) ((WeakReference) arrayList.get(i10)).get();
                    if (context2 != null && kotlin.jvm.internal.e0.areEqual(context2, context)) {
                        weakReference = (WeakReference) arrayList.get(i10);
                        break;
                    }
                    i10++;
                }
                if (weakReference == null) {
                    f31876d.add(new WeakReference(context));
                }
                picassoBuild = f31874b;
                if (picassoBuild == null) {
                    picassoBuild = new Picasso.Builder(context).build();
                    f31874b = picassoBuild;
                    C2925od.a(context, f31877e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(picassoBuild, "synchronized(...)");
        return picassoBuild;
    }

    public final Object a(InvocationHandler connectionCallbackHandler) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connectionCallbackHandler, "connectionCallbackHandler");
        try {
            return Proxy.newProxyInstance(Callback.class.getClassLoader(), new Class[]{Callback.class}, connectionCallbackHandler);
        } catch (Exception unused) {
            return null;
        }
    }
}
