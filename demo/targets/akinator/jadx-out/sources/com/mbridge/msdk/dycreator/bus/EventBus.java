package com.mbridge.msdk.dycreator.bus;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class EventBus {

    /* renamed from: o, reason: collision with root package name */
    private static volatile EventBus f40155o;

    /* renamed from: k, reason: collision with root package name */
    private boolean f40167k;

    /* renamed from: n, reason: collision with root package name */
    static ExecutorService f40154n = Executors.newCachedThreadPool();
    public static String TAG = "Event";

    /* renamed from: p, reason: collision with root package name */
    private static final Map<Class<?>, List<Class<?>>> f40156p = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, CopyOnWriteArrayList<Subscription>> f40157a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Object, List<Class<?>>> f40158b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, Object> f40159c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final ThreadLocal<List<Object>> f40160d = new ThreadLocal<List<Object>>() { // from class: com.mbridge.msdk.dycreator.bus.EventBus.1
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<Object> initialValue() {
            return new ArrayList();
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private final ThreadLocal<BooleanWrapper> f40161e = new ThreadLocal<BooleanWrapper>() { // from class: com.mbridge.msdk.dycreator.bus.EventBus.2
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BooleanWrapper initialValue() {
            return new BooleanWrapper();
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private String f40162f = "onEvent";

    /* renamed from: g, reason: collision with root package name */
    private final HandlerPoster f40163g = new HandlerPoster(this, Looper.getMainLooper(), 10);

    /* renamed from: h, reason: collision with root package name */
    private final BackgroundPoster f40164h = new BackgroundPoster(this);

    /* renamed from: i, reason: collision with root package name */
    private final AsyncPoster f40165i = new AsyncPoster(this);

    /* renamed from: j, reason: collision with root package name */
    private final SubscriberMethodFinder f40166j = new SubscriberMethodFinder();

    /* renamed from: l, reason: collision with root package name */
    private boolean f40168l = true;

    /* renamed from: m, reason: collision with root package name */
    private Map<String, Object> f40169m = new ConcurrentHashMap();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.dycreator.bus.EventBus$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40172a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f40172a = iArr;
            try {
                iArr[ThreadMode.PostThread.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40172a[ThreadMode.MainThread.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40172a[ThreadMode.BackgroundThread.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40172a[ThreadMode.Async.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class BooleanWrapper {

        /* renamed from: a, reason: collision with root package name */
        boolean f40173a;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface PostCallback {
        void onPostCompleted(List<SubscriberExceptionEvent> list);
    }

    private void a(Object obj, String str, boolean z10) throws IllegalAccessException, Error, SecurityException, IllegalArgumentException, InvocationTargetException {
        Iterator<SubscriberMethod> it = this.f40166j.a(obj.getClass(), str).iterator();
        while (it.hasNext()) {
            a(obj, it.next(), z10);
        }
    }

    public static void clearCaches() {
        SubscriberMethodFinder.a();
        f40156p.clear();
    }

    public static void clearSkipMethodNameVerifications() {
        SubscriberMethodFinder.clearSkipMethodNameVerifications();
    }

    public static EventBus getDefault() {
        if (f40155o == null) {
            synchronized (EventBus.class) {
                try {
                    if (f40155o == null) {
                        f40155o = new EventBus();
                    }
                } finally {
                }
            }
        }
        return f40155o;
    }

    public static void skipMethodNameVerificationFor(Class<?> cls) {
        SubscriberMethodFinder.a(cls);
    }

    public void configureLogSubscriberExceptions(boolean z10) {
        if (this.f40167k) {
            throw new EventBusException("This method must be called before any registration");
        }
        this.f40168l = z10;
    }

    public Object getStickyEvent(Class<?> cls) {
        Object obj;
        synchronized (this.f40159c) {
            obj = this.f40159c.get(cls);
        }
        return obj;
    }

    public void post(Object obj) {
        List<Object> list = this.f40160d.get();
        list.add(obj);
        BooleanWrapper booleanWrapper = this.f40161e.get();
        if (booleanWrapper.f40173a) {
            return;
        }
        boolean z10 = Looper.getMainLooper() == Looper.myLooper();
        booleanWrapper.f40173a = true;
        while (!list.isEmpty()) {
            try {
                a(list.remove(0), z10);
            } finally {
                booleanWrapper.f40173a = false;
            }
        }
    }

    public void postSticky(Object obj) {
        post(obj);
        synchronized (this.f40159c) {
            this.f40159c.put(obj.getClass(), obj);
        }
    }

    public void register(Object obj) throws IllegalAccessException, Error, SecurityException, IllegalArgumentException, InvocationTargetException {
        a(obj, this.f40162f, false);
    }

    public void registerSticky(Object obj) throws IllegalAccessException, Error, SecurityException, IllegalArgumentException, InvocationTargetException {
        a(obj, this.f40162f, true);
    }

    public void release() {
        if (f40155o != null) {
            f40155o = null;
            f40154n = null;
            Map<Class<?>, List<Class<?>>> map = f40156p;
            if (map != null && map.size() > 0) {
                map.clear();
            }
            Map<Class<?>, CopyOnWriteArrayList<Subscription>> map2 = this.f40157a;
            if (map2 != null && map2.size() > 0) {
                this.f40157a.clear();
            }
            Map<Object, List<Class<?>>> map3 = this.f40158b;
            if (map3 != null && map3.size() > 0) {
                this.f40158b.clear();
            }
            Map<Class<?>, Object> map4 = this.f40159c;
            if (map4 != null && map4.size() > 0) {
                this.f40159c.clear();
            }
            Map<String, Object> map5 = this.f40169m;
            if (map5 == null || map5.size() <= 0) {
                return;
            }
            this.f40169m.clear();
        }
    }

    public Object removeStickyEvent(Class<?> cls) {
        Object objRemove;
        synchronized (this.f40159c) {
            objRemove = this.f40159c.remove(cls);
        }
        return objRemove;
    }

    public synchronized void unregister(Object obj, Class<?>... clsArr) {
        try {
            if (clsArr.length == 0) {
                throw new IllegalArgumentException("Provide at least one event class");
            }
            List<Class<?>> list = this.f40158b.get(obj);
            if (list != null) {
                for (Class<?> cls : clsArr) {
                    a(obj, cls);
                    list.remove(cls);
                }
                if (list.isEmpty()) {
                    this.f40158b.remove(obj);
                }
            } else {
                Log.w(TAG, "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void register(String str, Object obj) throws IllegalAccessException, Error, SecurityException, IllegalArgumentException, InvocationTargetException {
        Map<String, Object> map = this.f40169m;
        if (map != null && map.containsKey(str)) {
            unregister(this.f40169m.get(str));
        }
        this.f40169m.put(str, obj);
        a(obj, this.f40162f, false);
    }

    public void registerSticky(Object obj, String str) throws IllegalAccessException, Error, SecurityException, IllegalArgumentException, InvocationTargetException {
        a(obj, str, true);
    }

    public void registerSticky(Object obj, Class<?> cls, Class<?>... clsArr) {
        a(obj, this.f40162f, true, cls, clsArr);
    }

    public synchronized void registerSticky(Object obj, String str, Class<?> cls, Class<?>... clsArr) {
        a(obj, str, true, cls, clsArr);
    }

    public boolean removeStickyEvent(Object obj) {
        synchronized (this.f40159c) {
            try {
                Class<?> cls = obj.getClass();
                if (!obj.equals(this.f40159c.get(cls))) {
                    return false;
                }
                this.f40159c.remove(cls);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private synchronized void a(Object obj, String str, boolean z10, Class<?> cls, Class<?>... clsArr) {
        try {
            for (SubscriberMethod subscriberMethod : this.f40166j.a(obj.getClass(), str)) {
                if (cls == subscriberMethod.f40186c) {
                    a(obj, subscriberMethod, z10);
                } else if (clsArr != null) {
                    int length = clsArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            break;
                        }
                        if (clsArr[i10] == subscriberMethod.f40186c) {
                            a(obj, subscriberMethod, z10);
                            break;
                        }
                        i10++;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void register(Object obj, String str) throws IllegalAccessException, Error, SecurityException, IllegalArgumentException, InvocationTargetException {
        a(obj, str, false);
    }

    public void register(Object obj, Class<?> cls, Class<?>... clsArr) {
        a(obj, this.f40162f, false, cls, clsArr);
    }

    public synchronized void register(Object obj, String str, Class<?> cls, Class<?>... clsArr) {
        a(obj, str, false, cls, clsArr);
    }

    public synchronized void unregister(Object obj) {
        try {
            List<Class<?>> list = this.f40158b.get(obj);
            if (list != null) {
                Iterator<Class<?>> it = list.iterator();
                while (it.hasNext()) {
                    a(obj, it.next());
                }
                this.f40158b.remove(obj);
            } else {
                Log.w(TAG, "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void a(Object obj, SubscriberMethod subscriberMethod, boolean z10) throws IllegalAccessException, Error, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object obj2;
        this.f40167k = true;
        Class<?> cls = subscriberMethod.f40186c;
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList = this.f40157a.get(cls);
        Subscription subscription = new Subscription(obj, subscriberMethod);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f40157a.put(cls, copyOnWriteArrayList);
        } else {
            Iterator<Subscription> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (it.next().equals(subscription)) {
                    throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
                }
            }
        }
        subscriberMethod.f40184a.setAccessible(true);
        copyOnWriteArrayList.add(subscription);
        List<Class<?>> arrayList = this.f40158b.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f40158b.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (z10) {
            synchronized (this.f40159c) {
                obj2 = this.f40159c.get(cls);
            }
            if (obj2 != null) {
                a(subscription, obj2, Looper.getMainLooper() == Looper.myLooper());
            }
        }
    }

    public synchronized void unregister(String str) {
        try {
            Map<String, Object> map = this.f40169m;
            if (map != null && map.containsKey(str)) {
                Object objRemove = this.f40169m.remove(str);
                List<Class<?>> list = this.f40158b.get(objRemove);
                if (list != null) {
                    Iterator<Class<?>> it = list.iterator();
                    while (it.hasNext()) {
                        a(objRemove, it.next());
                    }
                    this.f40158b.remove(objRemove);
                } else {
                    Log.w(TAG, "Subscriber to unregister was not registered before: " + objRemove.getClass());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void a(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList = this.f40157a.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i10 = 0;
            while (i10 < size) {
                if (copyOnWriteArrayList.get(i10).f40190a == obj) {
                    copyOnWriteArrayList.remove(i10);
                    i10--;
                    size--;
                }
                i10++;
            }
        }
    }

    private void a(Object obj, boolean z10) throws Error {
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList;
        if (obj != null) {
            try {
                Class<?> cls = obj.getClass();
                List<Class<?>> listA = a(cls);
                int size = listA.size();
                boolean z11 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    Class<?> cls2 = listA.get(i10);
                    synchronized (this) {
                        copyOnWriteArrayList = this.f40157a.get(cls2);
                    }
                    if (copyOnWriteArrayList != null) {
                        Iterator<Subscription> it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            a(it.next(), obj, z10);
                        }
                        z11 = true;
                    }
                }
                if (z11) {
                    return;
                }
                Log.d(TAG, "No subscripers registered for event " + cls);
                if (cls == NoSubscriberEvent.class || cls == SubscriberExceptionEvent.class) {
                    return;
                }
                post(new NoSubscriberEvent(this, obj));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private void a(Subscription subscription, Object obj, boolean z10) throws IllegalAccessException, Error, IllegalArgumentException, InvocationTargetException {
        int i10 = AnonymousClass3.f40172a[subscription.f40191b.f40185b.ordinal()];
        if (i10 == 1) {
            a(subscription, obj);
            return;
        }
        if (i10 == 2) {
            if (z10) {
                a(subscription, obj);
                return;
            } else {
                this.f40163g.a(subscription, obj);
                return;
            }
        }
        if (i10 == 3) {
            if (z10) {
                this.f40164h.enqueue(subscription, obj);
                return;
            } else {
                a(subscription, obj);
                return;
            }
        }
        if (i10 == 4) {
            this.f40165i.enqueue(subscription, obj);
        } else {
            throw new IllegalStateException("Unknown thread mode: " + subscription.f40191b.f40185b);
        }
    }

    private List<Class<?>> a(Class<?> cls) {
        List<Class<?>> list;
        Map<Class<?>, List<Class<?>>> map = f40156p;
        synchronized (map) {
            try {
                List<Class<?>> list2 = map.get(cls);
                list = list2;
                if (list2 == null) {
                    ArrayList arrayList = new ArrayList();
                    for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                        arrayList.add(superclass);
                        a(arrayList, superclass.getInterfaces());
                    }
                    f40156p.put(cls, arrayList);
                    list = arrayList;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return list;
    }

    public static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    public void a(PendingPost pendingPost) {
        Object obj = pendingPost.f40179a;
        Subscription subscription = pendingPost.f40180b;
        PendingPost.a(pendingPost);
        a(subscription, obj);
    }

    public void a(Subscription subscription, Object obj) throws IllegalAccessException, Error, IllegalArgumentException, InvocationTargetException {
        try {
            subscription.f40191b.f40184a.invoke(subscription.f40190a, obj);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Unexpected exception", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (obj instanceof SubscriberExceptionEvent) {
                Log.e(TAG, "SubscriberExceptionEvent subscriber " + subscription.f40190a.getClass() + " threw an exception", cause);
                SubscriberExceptionEvent subscriberExceptionEvent = (SubscriberExceptionEvent) obj;
                Log.e(TAG, "Initial event " + subscriberExceptionEvent.causingEvent + " caused exception in " + subscriberExceptionEvent.causingSubscriber, subscriberExceptionEvent.throwable);
                return;
            }
            if (this.f40168l) {
                Log.e(TAG, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + subscription.f40190a.getClass(), cause);
            }
            post(new SubscriberExceptionEvent(this, cause, obj, subscription.f40190a));
        }
    }
}
