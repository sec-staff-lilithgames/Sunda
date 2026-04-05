package o0;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f77375a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f77376b = new LinkedHashMap();

    public final u get(b indicationInstance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(indicationInstance, "indicationInstance");
        return (u) this.f77375a.get(indicationInstance);
    }

    public final void remove(b indicationInstance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(indicationInstance, "indicationInstance");
        LinkedHashMap linkedHashMap = this.f77375a;
        u uVar = (u) linkedHashMap.get(indicationInstance);
        if (uVar != null) {
        }
        linkedHashMap.remove(indicationInstance);
    }

    public final void set(b indicationInstance, u rippleHostView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(indicationInstance, "indicationInstance");
        kotlin.jvm.internal.e0.checkNotNullParameter(rippleHostView, "rippleHostView");
        this.f77375a.put(indicationInstance, rippleHostView);
        this.f77376b.put(rippleHostView, indicationInstance);
    }

    public final b get(u rippleHostView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rippleHostView, "rippleHostView");
        return (b) this.f77376b.get(rippleHostView);
    }
}
