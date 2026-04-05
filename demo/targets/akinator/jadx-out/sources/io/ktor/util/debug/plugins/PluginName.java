package io.ktor.util.debug.plugins;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;
import zu.a;
import zu.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class PluginName extends a {
    public static final Key Key = new Key(null);
    private final String pluginName;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Key implements l {
        public /* synthetic */ Key(u uVar) {
            this();
        }

        private Key() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginName(String pluginName) {
        super(Key);
        e0.checkNotNullParameter(pluginName, "pluginName");
        this.pluginName = pluginName;
    }

    public static /* synthetic */ PluginName copy$default(PluginName pluginName, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pluginName.pluginName;
        }
        return pluginName.copy(str);
    }

    public final String component1() {
        return this.pluginName;
    }

    public final PluginName copy(String pluginName) {
        e0.checkNotNullParameter(pluginName, "pluginName");
        return new PluginName(pluginName);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PluginName) && e0.areEqual(this.pluginName, ((PluginName) obj).pluginName);
    }

    public final String getPluginName() {
        return this.pluginName;
    }

    public int hashCode() {
        return this.pluginName.hashCode();
    }

    public String toString() {
        return o2.q(new StringBuilder("PluginName("), this.pluginName, ')');
    }
}
