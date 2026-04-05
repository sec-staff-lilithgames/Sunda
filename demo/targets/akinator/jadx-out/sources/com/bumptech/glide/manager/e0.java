package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e0 implements o {

    /* renamed from: b, reason: collision with root package name */
    public final Set f16634b = Collections.newSetFromMap(new WeakHashMap());

    public void clear() {
        this.f16634b.clear();
    }

    public List<g9.n> getAll() {
        return j9.s.getSnapshot(this.f16634b);
    }

    @Override // com.bumptech.glide.manager.o
    public void onDestroy() {
        Iterator it = j9.s.getSnapshot(this.f16634b).iterator();
        while (it.hasNext()) {
            ((g9.n) it.next()).onDestroy();
        }
    }

    @Override // com.bumptech.glide.manager.o
    public void onStart() {
        Iterator it = j9.s.getSnapshot(this.f16634b).iterator();
        while (it.hasNext()) {
            ((g9.n) it.next()).onStart();
        }
    }

    @Override // com.bumptech.glide.manager.o
    public void onStop() {
        Iterator it = j9.s.getSnapshot(this.f16634b).iterator();
        while (it.hasNext()) {
            ((g9.n) it.next()).onStop();
        }
    }

    public void track(g9.n nVar) {
        this.f16634b.add(nVar);
    }

    public void untrack(g9.n nVar) {
        this.f16634b.remove(nVar);
    }
}
