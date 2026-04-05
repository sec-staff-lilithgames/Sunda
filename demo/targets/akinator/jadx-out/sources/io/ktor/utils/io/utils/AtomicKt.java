package io.ktor.utils.io.utils;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KProperty1;
import sv.j0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class AtomicKt {
    public static final int getIOIntProperty(String name, int i10) {
        String property;
        Integer intOrNull;
        e0.checkNotNullParameter(name, "name");
        try {
            property = System.getProperty("io.ktor.utils.io." + name);
        } catch (SecurityException unused) {
            property = null;
        }
        return (property == null || (intOrNull = j0.toIntOrNull(property)) == null) ? i10 : intOrNull.intValue();
    }

    public static final /* synthetic */ <Owner> AtomicLongFieldUpdater<Owner> longUpdater(KProperty1<Owner, Long> p10) {
        e0.checkNotNullParameter(p10, "p");
        e0.reifiedOperationMarker(4, "Owner");
        AtomicLongFieldUpdater<Owner> atomicLongFieldUpdaterNewUpdater = AtomicLongFieldUpdater.newUpdater(Object.class, p10.getName());
        e0.checkNotNullExpressionValue(atomicLongFieldUpdaterNewUpdater, "newUpdater(Owner::class.java, p.name)");
        return atomicLongFieldUpdaterNewUpdater;
    }
}
