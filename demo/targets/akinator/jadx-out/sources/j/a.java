package j;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: j.a$a, reason: collision with other inner class name */
    public static final class C0708a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f68739a;

        public C0708a(Object obj) {
            this.f68739a = obj;
        }

        public final Object getValue() {
            return this.f68739a;
        }
    }

    public abstract Intent createIntent(Context context, Object obj);

    public C0708a getSynchronousResult(Context context, Object obj) {
        e0.checkNotNullParameter(context, "context");
        return null;
    }

    public abstract Object parseResult(int i10, Intent intent);
}
