package bi;

import android.app.Service;
import android.content.Context;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9563a;

    /* renamed from: b, reason: collision with root package name */
    public final f f9564b;

    public h(Context context, f fVar) {
        this.f9563a = context;
        this.f9564b = fVar;
    }

    public static ComponentRegistrar a(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new u("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
            return null;
        } catch (IllegalAccessException e10) {
            throw new u(a.b.l("Could not instantiate ", str, "."), e10);
        } catch (InstantiationException e11) {
            throw new u(a.b.l("Could not instantiate ", str, "."), e11);
        } catch (NoSuchMethodException e12) {
            throw new u(a.b.k("Could not instantiate ", str), e12);
        } catch (InvocationTargetException e13) {
            throw new u(a.b.k("Could not instantiate ", str), e13);
        }
    }

    public static h forContext(Context context, Class<? extends Service> cls) {
        return new h(context, new f(cls));
    }

    @Deprecated
    public List<ComponentRegistrar> discover() throws ClassNotFoundException {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f9564b.retrieve(this.f9563a).iterator();
        while (it.hasNext()) {
            try {
                ComponentRegistrar componentRegistrarA = a((String) it.next());
                if (componentRegistrarA != null) {
                    arrayList.add(componentRegistrarA);
                }
            } catch (u e10) {
                Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
            }
        }
        return arrayList;
    }

    public List<sj.c> discoverLazy() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f9564b.retrieve(this.f9563a).iterator();
        while (it.hasNext()) {
            arrayList.add(new e((String) it.next(), 0));
        }
        return arrayList;
    }
}
