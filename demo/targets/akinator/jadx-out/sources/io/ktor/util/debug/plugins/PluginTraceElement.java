package io.ktor.util.debug.plugins;

import kotlin.jvm.internal.e0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class PluginTraceElement {
    private final PluginEvent event;
    private final String handler;
    private final String pluginName;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum PluginEvent {
        STARTED,
        FINISHED
    }

    public PluginTraceElement(String pluginName, String handler, PluginEvent event) {
        e0.checkNotNullParameter(pluginName, "pluginName");
        e0.checkNotNullParameter(handler, "handler");
        e0.checkNotNullParameter(event, "event");
        this.pluginName = pluginName;
        this.handler = handler;
        this.event = event;
    }

    public static /* synthetic */ PluginTraceElement copy$default(PluginTraceElement pluginTraceElement, String str, String str2, PluginEvent pluginEvent, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pluginTraceElement.pluginName;
        }
        if ((i10 & 2) != 0) {
            str2 = pluginTraceElement.handler;
        }
        if ((i10 & 4) != 0) {
            pluginEvent = pluginTraceElement.event;
        }
        return pluginTraceElement.copy(str, str2, pluginEvent);
    }

    public final String component1() {
        return this.pluginName;
    }

    public final String component2() {
        return this.handler;
    }

    public final PluginEvent component3() {
        return this.event;
    }

    public final PluginTraceElement copy(String pluginName, String handler, PluginEvent event) {
        e0.checkNotNullParameter(pluginName, "pluginName");
        e0.checkNotNullParameter(handler, "handler");
        e0.checkNotNullParameter(event, "event");
        return new PluginTraceElement(pluginName, handler, event);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PluginTraceElement)) {
            return false;
        }
        PluginTraceElement pluginTraceElement = (PluginTraceElement) obj;
        return e0.areEqual(this.pluginName, pluginTraceElement.pluginName) && e0.areEqual(this.handler, pluginTraceElement.handler) && this.event == pluginTraceElement.event;
    }

    public final PluginEvent getEvent() {
        return this.event;
    }

    public final String getHandler() {
        return this.handler;
    }

    public final String getPluginName() {
        return this.pluginName;
    }

    public int hashCode() {
        return this.event.hashCode() + o2.e(this.pluginName.hashCode() * 31, 31, this.handler);
    }

    public String toString() {
        return "PluginTraceElement(pluginName=" + this.pluginName + ", handler=" + this.handler + ", event=" + this.event + ')';
    }
}
