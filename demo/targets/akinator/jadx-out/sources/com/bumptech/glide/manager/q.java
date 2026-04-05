package com.bumptech.glide.manager;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.k0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class q implements v {

    /* renamed from: a, reason: collision with root package name */
    public final FragmentManager f16645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.localbroadcastmanager.content.b f16646b;

    public q(androidx.localbroadcastmanager.content.b bVar, FragmentManager fragmentManager) {
        this.f16646b = bVar;
        this.f16645a = fragmentManager;
    }

    public final void a(FragmentManager fragmentManager, HashSet hashSet) {
        List<Fragment> fragments = fragmentManager.getFragments();
        int size = fragments.size();
        for (int i10 = 0; i10 < size; i10++) {
            Fragment fragment = fragments.get(i10);
            a(fragment.getChildFragmentManager(), hashSet);
            k0 lifecycle = fragment.getLifecycle();
            androidx.localbroadcastmanager.content.b bVar = this.f16646b;
            bVar.getClass();
            j9.s.assertMainThread();
            com.bumptech.glide.u uVar = (com.bumptech.glide.u) ((HashMap) bVar.f6756a).get(lifecycle);
            if (uVar != null) {
                hashSet.add(uVar);
            }
        }
    }

    @Override // com.bumptech.glide.manager.v
    public Set<com.bumptech.glide.u> getDescendants() {
        HashSet hashSet = new HashSet();
        a(this.f16645a, hashSet);
        return hashSet;
    }
}
