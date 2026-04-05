package h;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArraySet f58526a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public volatile Context f58527b;

    public final void addOnContextAvailableListener(c listener) {
        e0.checkNotNullParameter(listener, "listener");
        Context context = this.f58527b;
        if (context != null) {
            listener.onContextAvailable(context);
        }
        this.f58526a.add(listener);
    }

    public final void clearAvailableContext() {
        this.f58527b = null;
    }

    public final void dispatchOnContextAvailable(Context context) {
        e0.checkNotNullParameter(context, "context");
        this.f58527b = context;
        Iterator it = this.f58526a.iterator();
        while (it.hasNext()) {
            ((c) it.next()).onContextAvailable(context);
        }
    }

    public final Context peekAvailableContext() {
        return this.f58527b;
    }

    public final void removeOnContextAvailableListener(c listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.f58526a.remove(listener);
    }
}
