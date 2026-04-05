package l5;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f72410a = new a(null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final c obtain(Context context) {
            e0.checkNotNullParameter(context, "context");
            StringBuilder sb2 = new StringBuilder("AdServicesInfo.version=");
            h5.c cVar = h5.c.f58698a;
            sb2.append(cVar.adServicesVersion());
            Log.d("MeasurementManager", sb2.toString());
            if (cVar.adServicesVersion() >= 5) {
                return new e(context);
            }
            if (cVar.extServicesVersionS() < 9) {
                return null;
            }
            return (c) h5.d.f58699a.getManager(context, "MeasurementManager", new b(context));
        }
    }

    public static final c obtain(Context context) {
        return f72410a.obtain(context);
    }

    public abstract Object deleteRegistrations(l5.a aVar, zu.d<? super x0> dVar);

    public abstract Object getMeasurementApiStatus(zu.d<? super Integer> dVar);

    public abstract Object registerSource(Uri uri, InputEvent inputEvent, zu.d<? super x0> dVar);

    public abstract Object registerSource(i iVar, zu.d<? super x0> dVar);

    public abstract Object registerTrigger(Uri uri, zu.d<? super x0> dVar);

    public abstract Object registerWebSource(k kVar, zu.d<? super x0> dVar);

    public abstract Object registerWebTrigger(m mVar, zu.d<? super x0> dVar);
}
