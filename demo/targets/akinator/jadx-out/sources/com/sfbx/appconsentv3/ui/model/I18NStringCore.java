package com.sfbx.appconsentv3.ui.model;

import j1.o2;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class I18NStringCore {
    private final Map<String, String> values;

    /* JADX WARN: Multi-variable type inference failed */
    public I18NStringCore() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ I18NStringCore copy$default(I18NStringCore i18NStringCore, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = i18NStringCore.values;
        }
        return i18NStringCore.copy(map);
    }

    public final Map<String, String> component1() {
        return this.values;
    }

    public final I18NStringCore copy(Map<String, String> values) {
        e0.checkNotNullParameter(values, "values");
        return new I18NStringCore(values);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I18NStringCore) && e0.areEqual(this.values, ((I18NStringCore) obj).values);
    }

    public final Map<String, String> getValues() {
        return this.values;
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return o2.q(new StringBuilder("I18NStringCore(values="), this.values, ')');
    }

    public I18NStringCore(Map<String, String> values) {
        e0.checkNotNullParameter(values, "values");
        this.values = values;
    }

    public /* synthetic */ I18NStringCore(Map map, int i10, u uVar) {
        this((i10 & 1) != 0 ? p1.emptyMap() : map);
    }
}
