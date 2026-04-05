package i;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.b1;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.v0;
import i.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.h1;
import kotlin.jvm.internal.u;
import rv.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f59278h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f59279a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f59280b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f59281c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f59282d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f59283e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f59284f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f59285g = new Bundle();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final i.b f59286a;

        /* renamed from: b, reason: collision with root package name */
        public final j.a f59287b;

        public a(i.b callback, j.a contract) {
            e0.checkNotNullParameter(callback, "callback");
            e0.checkNotNullParameter(contract, "contract");
            this.f59286a = callback;
            this.f59287b = contract;
        }

        public final i.b getCallback() {
            return this.f59286a;
        }

        public final j.a getContract() {
            return this.f59287b;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final k0 f59288a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f59289b;

        public c(k0 lifecycle) {
            e0.checkNotNullParameter(lifecycle, "lifecycle");
            this.f59288a = lifecycle;
            this.f59289b = new ArrayList();
        }

        public final void addObserver(v0 observer) {
            e0.checkNotNullParameter(observer, "observer");
            this.f59288a.addObserver(observer);
            this.f59289b.add(observer);
        }

        public final void clearObservers() {
            ArrayList arrayList = this.f59289b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f59288a.removeObserver((v0) it.next());
            }
            arrayList.clear();
        }

        public final k0 getLifecycle() {
            return this.f59288a;
        }
    }

    static {
        new b(null);
    }

    public final void a(String str) {
        LinkedHashMap linkedHashMap = this.f59280b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : y.generateSequence(new f(0))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f59279a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final boolean dispatchResult(int i10, int i11, Intent intent) {
        String str = (String) this.f59279a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f59283e.get(str);
        if ((aVar != null ? aVar.getCallback() : null) != null) {
            ArrayList arrayList = this.f59282d;
            if (arrayList.contains(str)) {
                aVar.getCallback().onActivityResult(aVar.getContract().parseResult(i11, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f59284f.remove(str);
        this.f59285g.putParcelable(str, new ActivityResult(i11, intent));
        return true;
    }

    public abstract <I, O> void onLaunch(int i10, j.a aVar, I i11, k3.h hVar);

    public final void onRestoreInstanceState(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.f59282d.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        Bundle bundle3 = this.f59285g;
        if (bundle2 != null) {
            bundle3.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = stringArrayList.get(i10);
            LinkedHashMap linkedHashMap = this.f59280b;
            boolean zContainsKey = linkedHashMap.containsKey(str);
            LinkedHashMap linkedHashMap2 = this.f59279a;
            if (zContainsKey) {
                Integer num = (Integer) linkedHashMap.remove(str);
                if (!bundle3.containsKey(str)) {
                    h1.asMutableMap(linkedHashMap2).remove(num);
                }
            }
            Integer num2 = integerArrayList.get(i10);
            e0.checkNotNullExpressionValue(num2, "get(...)");
            int iIntValue = num2.intValue();
            String str2 = stringArrayList.get(i10);
            e0.checkNotNullExpressionValue(str2, "get(...)");
            String str3 = str2;
            linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
            linkedHashMap.put(str3, Integer.valueOf(iIntValue));
        }
    }

    public final void onSaveInstanceState(Bundle outState) {
        e0.checkNotNullParameter(outState, "outState");
        LinkedHashMap linkedHashMap = this.f59280b;
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f59282d));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.f59285g));
    }

    public final <I, O> d register(final String key, b1 lifecycleOwner, final j.a contract, final i.b callback) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        e0.checkNotNullParameter(contract, "contract");
        e0.checkNotNullParameter(callback, "callback");
        k0 lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState().isAtLeast(j0.f6617f)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        a(key);
        LinkedHashMap linkedHashMap = this.f59281c;
        c cVar = (c) linkedHashMap.get(key);
        if (cVar == null) {
            cVar = new c(lifecycle);
        }
        cVar.addObserver(new v0() { // from class: i.e
            @Override // androidx.lifecycle.v0
            public final void onStateChanged(b1 b1Var, i0 event) {
                g gVar = this.f59273b;
                LinkedHashMap linkedHashMap2 = gVar.f59283e;
                int i10 = g.f59278h;
                e0.checkNotNullParameter(b1Var, "<unused var>");
                e0.checkNotNullParameter(event, "event");
                i0 i0Var = i0.ON_START;
                String str = key;
                if (i0Var != event) {
                    if (i0.ON_STOP == event) {
                        linkedHashMap2.remove(str);
                        return;
                    } else {
                        if (i0.ON_DESTROY == event) {
                            gVar.unregister$activity_release(str);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = gVar.f59285g;
                LinkedHashMap linkedHashMap3 = gVar.f59284f;
                b bVar = callback;
                j.a aVar = contract;
                linkedHashMap2.put(str, new g.a(bVar, aVar));
                if (linkedHashMap3.containsKey(str)) {
                    Object obj = linkedHashMap3.get(str);
                    linkedHashMap3.remove(str);
                    bVar.onActivityResult(obj);
                }
                ActivityResult activityResult = (ActivityResult) t3.d.getParcelable(bundle, str, ActivityResult.class);
                if (activityResult != null) {
                    bundle.remove(str);
                    bVar.onActivityResult(aVar.parseResult(activityResult.getResultCode(), activityResult.getData()));
                }
            }
        });
        linkedHashMap.put(key, cVar);
        return new h(this, key, contract);
    }

    public final void unregister$activity_release(String key) {
        Integer num;
        e0.checkNotNullParameter(key, "key");
        if (!this.f59282d.contains(key) && (num = (Integer) this.f59280b.remove(key)) != null) {
            this.f59279a.remove(num);
        }
        this.f59283e.remove(key);
        LinkedHashMap linkedHashMap = this.f59284f;
        if (linkedHashMap.containsKey(key)) {
            StringBuilder sbO = e3.g.o("Dropping pending result for request ", key, ": ");
            sbO.append(linkedHashMap.get(key));
            Log.w("ActivityResultRegistry", sbO.toString());
            linkedHashMap.remove(key);
        }
        Bundle bundle = this.f59285g;
        if (bundle.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((ActivityResult) t3.d.getParcelable(bundle, key, ActivityResult.class)));
            bundle.remove(key);
        }
        LinkedHashMap linkedHashMap2 = this.f59281c;
        c cVar = (c) linkedHashMap2.get(key);
        if (cVar != null) {
            cVar.clearObservers();
            linkedHashMap2.remove(key);
        }
    }

    public final <O> boolean dispatchResult(int i10, O o10) {
        String str = (String) this.f59279a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f59283e.get(str);
        if ((aVar != null ? aVar.getCallback() : null) == null) {
            this.f59285g.remove(str);
            this.f59284f.put(str, o10);
            return true;
        }
        i.b callback = aVar.getCallback();
        e0.checkNotNull(callback, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.f59282d.remove(str)) {
            return true;
        }
        callback.onActivityResult(o10);
        return true;
    }

    public final <I, O> d register(String key, j.a contract, i.b callback) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(contract, "contract");
        e0.checkNotNullParameter(callback, "callback");
        a(key);
        this.f59283e.put(key, new a(callback, contract));
        LinkedHashMap linkedHashMap = this.f59284f;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            callback.onActivityResult(obj);
        }
        Bundle bundle = this.f59285g;
        ActivityResult activityResult = (ActivityResult) t3.d.getParcelable(bundle, key, ActivityResult.class);
        if (activityResult != null) {
            bundle.remove(key);
            callback.onActivityResult(contract.parseResult(activityResult.getResultCode(), activityResult.getData()));
        }
        return new i(this, key, contract);
    }
}
