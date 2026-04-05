package k5;

import android.content.Context;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import m5.i;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final C0713b f70588a = new C0713b(null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends b {

        /* renamed from: b, reason: collision with root package name */
        public final i f70589b;

        public a(i mTopicsManager) {
            e0.checkNotNullParameter(mTopicsManager, "mTopicsManager");
            this.f70589b = mTopicsManager;
        }

        @Override // k5.b
        public n1 getTopicsAsync(m5.b request) {
            e0.checkNotNullParameter(request, "request");
            return i5.b.asListenableFuture$default(BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new k5.a(this, request, null), 3, null), null, 1, null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: k5.b$b, reason: collision with other inner class name */
    public static final class C0713b {
        public C0713b(u uVar) {
        }

        public final b from(Context context) {
            e0.checkNotNullParameter(context, "context");
            i iVarObtain = i.f74043a.obtain(context);
            if (iVarObtain != null) {
                return new a(iVarObtain);
            }
            return null;
        }
    }

    public static final b from(Context context) {
        return f70588a.from(context);
    }

    public abstract n1 getTopicsAsync(m5.b bVar);
}
