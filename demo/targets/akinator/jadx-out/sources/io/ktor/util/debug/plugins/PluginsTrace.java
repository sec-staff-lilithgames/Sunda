package io.ktor.util.debug.plugins;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;
import uu.y0;
import zu.a;
import zu.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class PluginsTrace extends a {
    public static final Key Key = new Key(null);
    private final List<PluginTraceElement> eventOrder;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Key implements l {
        public /* synthetic */ Key(u uVar) {
            this();
        }

        private Key() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PluginsTrace() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PluginsTrace copy$default(PluginsTrace pluginsTrace, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = pluginsTrace.eventOrder;
        }
        return pluginsTrace.copy(list);
    }

    public final List<PluginTraceElement> component1() {
        return this.eventOrder;
    }

    public final PluginsTrace copy(List<PluginTraceElement> eventOrder) {
        e0.checkNotNullParameter(eventOrder, "eventOrder");
        return new PluginsTrace(eventOrder);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PluginsTrace) && e0.areEqual(this.eventOrder, ((PluginsTrace) obj).eventOrder);
    }

    public final List<PluginTraceElement> getEventOrder() {
        return this.eventOrder;
    }

    public int hashCode() {
        return this.eventOrder.hashCode();
    }

    public String toString() {
        return o2.q(new StringBuilder("PluginsTrace("), y0.joinToString$default(this.eventOrder, null, null, null, 0, null, null, 63, null), ')');
    }

    public /* synthetic */ PluginsTrace(List list, int i10, u uVar) {
        this((i10 & 1) != 0 ? new ArrayList() : list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginsTrace(List<PluginTraceElement> eventOrder) {
        super(Key);
        e0.checkNotNullParameter(eventOrder, "eventOrder");
        this.eventOrder = eventOrder;
    }
}
