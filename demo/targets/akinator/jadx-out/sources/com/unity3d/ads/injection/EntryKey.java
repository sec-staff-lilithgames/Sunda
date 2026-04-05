package com.unity3d.ads.injection;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class EntryKey {
    private final KClass<?> instanceClass;
    private final String named;

    public EntryKey(String named, KClass<?> instanceClass) {
        e0.checkNotNullParameter(named, "named");
        e0.checkNotNullParameter(instanceClass, "instanceClass");
        this.named = named;
        this.instanceClass = instanceClass;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EntryKey copy$default(EntryKey entryKey, String str, KClass kClass, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = entryKey.named;
        }
        if ((i10 & 2) != 0) {
            kClass = entryKey.instanceClass;
        }
        return entryKey.copy(str, kClass);
    }

    public final String component1() {
        return this.named;
    }

    public final KClass<?> component2() {
        return this.instanceClass;
    }

    public final EntryKey copy(String named, KClass<?> instanceClass) {
        e0.checkNotNullParameter(named, "named");
        e0.checkNotNullParameter(instanceClass, "instanceClass");
        return new EntryKey(named, instanceClass);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntryKey)) {
            return false;
        }
        EntryKey entryKey = (EntryKey) obj;
        return e0.areEqual(this.named, entryKey.named) && e0.areEqual(this.instanceClass, entryKey.instanceClass);
    }

    public final KClass<?> getInstanceClass() {
        return this.instanceClass;
    }

    public final String getNamed() {
        return this.named;
    }

    public int hashCode() {
        return this.instanceClass.hashCode() + (this.named.hashCode() * 31);
    }

    public String toString() {
        return "EntryKey(named=" + this.named + ", instanceClass=" + this.instanceClass + ')';
    }

    public /* synthetic */ EntryKey(String str, KClass kClass, int i10, u uVar) {
        this((i10 & 1) != 0 ? "" : str, kClass);
    }
}
