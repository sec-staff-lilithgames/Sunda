package ya;

import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f94257b = new b();

    /* renamed from: a, reason: collision with root package name */
    public a f94258a;

    public static void a(d dVar, Exception exc) {
        a(dVar, fb.a.a(exc, null));
    }

    public static void a(d dVar, Object... objArr) {
        cb.b.a("%s : dispatching event", "IgniteEventDispatcher");
        if (f94257b.f94258a != null) {
            t tVarA = t.a(dVar);
            if (tVarA == null) {
                IAlog.f("%s : One DT Error: %s is missing in IAReportError map", "IgniteEventDispatcherWrapper", dVar);
            } else {
                new w(tVarA).a(objArr).a((String) null);
            }
        }
    }
}
