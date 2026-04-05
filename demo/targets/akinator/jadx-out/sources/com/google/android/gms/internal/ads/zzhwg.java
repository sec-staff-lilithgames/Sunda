package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzhwg {
    public static zzhvy zzb(Class cls) {
        ClassLoader classLoader = zzhwg.class.getClassLoader();
        if (cls.equals(zzhvy.class)) {
            try {
                try {
                    return (zzhvy) cls.cast(((zzhwg) Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null)).zza());
                } catch (ReflectiveOperationException e10) {
                    throw new IllegalStateException(e10);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        Iterator it = ServiceLoader.load(zzhwg.class, classLoader).iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            try {
                arrayList.add((zzhvy) cls.cast(((zzhwg) it.next()).zza()));
            } catch (ServiceConfigurationError e11) {
                Logger.getLogger(zzhvt.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e11);
            }
        }
        if (arrayList.size() == 1) {
            return (zzhvy) arrayList.get(0);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        try {
            return (zzhvy) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
        } catch (ReflectiveOperationException e12) {
            throw new IllegalStateException(e12);
        }
    }

    public abstract zzhvy zza();
}
