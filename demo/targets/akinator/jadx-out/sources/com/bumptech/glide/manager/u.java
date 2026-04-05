package com.bumptech.glide.manager;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x8.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class u implements Handler.Callback {

    /* renamed from: h, reason: collision with root package name */
    public static final s f16647h = new s();

    /* renamed from: b, reason: collision with root package name */
    public volatile com.bumptech.glide.u f16648b;

    /* renamed from: c, reason: collision with root package name */
    public final t f16649c;

    /* renamed from: e, reason: collision with root package name */
    public final z.f f16650e = new z.f();

    /* renamed from: f, reason: collision with root package name */
    public final l f16651f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.localbroadcastmanager.content.b f16652g;

    public u(t tVar) {
        tVar = tVar == null ? f16647h : tVar;
        this.f16649c = tVar;
        androidx.localbroadcastmanager.content.b bVar = new androidx.localbroadcastmanager.content.b();
        bVar.f6756a = new HashMap();
        bVar.f6757b = tVar;
        this.f16652g = bVar;
        this.f16651f = (g0.f91820f && g0.f91819e) ? new k() : new g();
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void b(List list, Map map) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                b(fragment.getChildFragmentManager().getFragments(), map);
            }
        }
    }

    public com.bumptech.glide.u get(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (j9.s.isOnMainThread() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return get((FragmentActivity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return get(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f16648b == null) {
            synchronized (this) {
                try {
                    if (this.f16648b == null) {
                        com.bumptech.glide.c cVar = com.bumptech.glide.c.get(context.getApplicationContext());
                        this.f16648b = ((s) this.f16649c).build(cVar, new a(), new h(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f16648b;
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public boolean handleMessage(Message message) {
        return false;
    }

    public com.bumptech.glide.u get(FragmentActivity fragmentActivity) {
        if (j9.s.isOnBackgroundThread()) {
            return get(fragmentActivity.getApplicationContext());
        }
        if (!fragmentActivity.isDestroyed()) {
            this.f16651f.registerSelf(fragmentActivity);
            Activity activityA = a(fragmentActivity);
            return this.f16652g.c(fragmentActivity, com.bumptech.glide.c.get(fragmentActivity.getApplicationContext()), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), activityA == null || !activityA.isFinishing());
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public com.bumptech.glide.u get(Fragment fragment) {
        j9.q.checkNotNull(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (j9.s.isOnBackgroundThread()) {
            return get(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f16651f.registerSelf(fragment.getActivity());
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        return this.f16652g.c(context, com.bumptech.glide.c.get(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
    }

    @Deprecated
    public com.bumptech.glide.u get(Activity activity) {
        return get(activity.getApplicationContext());
    }

    public com.bumptech.glide.u get(View view) {
        if (j9.s.isOnBackgroundThread()) {
            return get(view.getContext().getApplicationContext());
        }
        j9.q.checkNotNull(view);
        j9.q.checkNotNull(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityA = a(view.getContext());
        if (activityA == null) {
            return get(view.getContext().getApplicationContext());
        }
        if (activityA instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) activityA;
            z.f fVar = this.f16650e;
            fVar.clear();
            b(fragmentActivity.getSupportFragmentManager().getFragments(), fVar);
            View viewFindViewById = fragmentActivity.findViewById(R.id.content);
            Fragment fragment = null;
            while (!view.equals(viewFindViewById) && (fragment = (Fragment) fVar.get(view)) == null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            fVar.clear();
            return fragment != null ? get(fragment) : get(fragmentActivity);
        }
        return get(view.getContext().getApplicationContext());
    }

    @Deprecated
    public com.bumptech.glide.u get(android.app.Fragment fragment) {
        if (fragment.getActivity() != null) {
            return get(fragment.getActivity().getApplicationContext());
        }
        throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
    }
}
