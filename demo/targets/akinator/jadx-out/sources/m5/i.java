package m5;

import android.content.Context;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final a f74043a = new a(null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final i obtain(Context context) {
            e0.checkNotNullParameter(context, "context");
            h5.c cVar = h5.c.f58698a;
            if (cVar.adServicesVersion() >= 11) {
                return new l(context);
            }
            if (cVar.adServicesVersion() >= 5) {
                return new n(context);
            }
            if (cVar.adServicesVersion() == 4) {
                return new m(context);
            }
            int iExtServicesVersionS = cVar.extServicesVersionS();
            h5.d dVar = h5.d.f58699a;
            if (iExtServicesVersionS >= 11) {
                return (i) dVar.getManager(context, "TopicsManager", new g(context));
            }
            if (cVar.extServicesVersionS() >= 9) {
                return (i) dVar.getManager(context, "TopicsManager", new h(context));
            }
            return null;
        }
    }

    public static final i obtain(Context context) {
        return f74043a.obtain(context);
    }

    public abstract Object getTopics(b bVar, zu.d<? super d> dVar);
}
