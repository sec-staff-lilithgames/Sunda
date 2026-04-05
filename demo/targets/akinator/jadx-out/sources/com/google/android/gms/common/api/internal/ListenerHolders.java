package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class ListenerHolders {
    private final Set zaa = Collections.newSetFromMap(new WeakHashMap());

    public static <L> ListenerHolder<L> createListenerHolder(L l9, Looper looper, String str) {
        Preconditions.checkNotNull(l9, "Listener must not be null");
        Preconditions.checkNotNull(looper, "Looper must not be null");
        Preconditions.checkNotNull(str, "Listener type must not be null");
        return new ListenerHolder<>(looper, l9, str);
    }

    public static <L> ListenerHolder.ListenerKey<L> createListenerKey(L l9, String str) {
        Preconditions.checkNotNull(l9, "Listener must not be null");
        Preconditions.checkNotNull(str, "Listener type must not be null");
        Preconditions.checkNotEmpty(str, "Listener type must not be empty");
        return new ListenerHolder.ListenerKey<>(l9, str);
    }

    public final ListenerHolder zaa(Object obj, Looper looper, String str) {
        Set set = this.zaa;
        ListenerHolder listenerHolderCreateListenerHolder = createListenerHolder(obj, looper, "NO_TYPE");
        set.add(listenerHolderCreateListenerHolder);
        return listenerHolderCreateListenerHolder;
    }

    public final void zab() {
        Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((ListenerHolder) it.next()).clear();
        }
        this.zaa.clear();
    }

    public static <L> ListenerHolder<L> createListenerHolder(L l9, Executor executor, String str) {
        Preconditions.checkNotNull(l9, "Listener must not be null");
        Preconditions.checkNotNull(executor, "Executor must not be null");
        Preconditions.checkNotNull(str, "Listener type must not be null");
        return new ListenerHolder<>(executor, l9, str);
    }
}
