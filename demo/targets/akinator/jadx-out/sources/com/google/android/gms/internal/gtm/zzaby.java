package com.google.android.gms.internal.gtm;

import e3.g;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzaby {
    public static zzabq zzb(Class cls) {
        String strK;
        ClassLoader classLoader = zzaby.class.getClassLoader();
        if (cls.equals(zzabq.class)) {
            strK = "com.google.android.gms.internal.gtm.zzyn";
        } else {
            if (!cls.getPackage().equals(zzaby.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            strK = g.k(cls.getPackage().getName(), ".BlazeGenerated", cls.getSimpleName(), "Loader");
        }
        try {
            try {
                try {
                    try {
                        return (zzabq) cls.cast(((zzaby) Class.forName(strK, true, classLoader).getConstructor(null).newInstance(null)).zza());
                    } catch (InvocationTargetException e10) {
                        throw new IllegalStateException(e10);
                    }
                } catch (NoSuchMethodException e11) {
                    throw new IllegalStateException(e11);
                }
            } catch (IllegalAccessException e12) {
                throw new IllegalStateException(e12);
            } catch (InstantiationException e13) {
                throw new IllegalStateException(e13);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = Collections.singletonList(zzafb.class.getDeclaredConstructor(null).newInstance(null)).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((zzabq) cls.cast(((zzaby) it.next()).zza()));
                } catch (ServiceConfigurationError e14) {
                    Logger.getLogger(zzzi.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e14);
                }
            }
            if (arrayList.size() == 1) {
                return (zzabq) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzabq) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e15) {
                throw new IllegalStateException(e15);
            } catch (NoSuchMethodException e16) {
                throw new IllegalStateException(e16);
            } catch (InvocationTargetException e17) {
                throw new IllegalStateException(e17);
            }
        }
    }

    public abstract zzabq zza();
}
