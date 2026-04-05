package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class AppLovinBroadcastManager {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f15254a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f15255b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final ArrayList f15256c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private static final Handler f15257d = new a(Looper.getMainLooper());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Receiver {
        void onReceive(Intent intent, Map<String, Object> map);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                AppLovinBroadcastManager.b();
            } else {
                super.handleMessage(message);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final Intent f15258a;

        /* renamed from: b, reason: collision with root package name */
        final Map f15259b;

        /* renamed from: c, reason: collision with root package name */
        final List f15260c;

        public b(Intent intent, Map map, List list) {
            this.f15258a = intent;
            this.f15259b = map;
            this.f15260c = list;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final IntentFilter f15261a;

        /* renamed from: b, reason: collision with root package name */
        final Receiver f15262b;

        /* renamed from: c, reason: collision with root package name */
        boolean f15263c;

        /* renamed from: d, reason: collision with root package name */
        boolean f15264d;

        public c(IntentFilter intentFilter, Receiver receiver) {
            this.f15261a = intentFilter;
            this.f15262b = receiver;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (f15254a) {
                try {
                    ArrayList arrayList = f15256c;
                    size = arrayList.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    arrayList.toArray(bVarArr);
                    arrayList.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = bVarArr[i10];
                if (bVar != null) {
                    for (c cVar : bVar.f15260c) {
                        if (cVar != null && !cVar.f15264d) {
                            cVar.f15262b.onReceive(bVar.f15258a, bVar.f15259b);
                        }
                    }
                }
            }
        }
    }

    public static void registerReceiver(Receiver receiver, IntentFilter intentFilter) {
        Map map = f15254a;
        synchronized (map) {
            try {
                c cVar = new c(intentFilter, receiver);
                ArrayList arrayList = (ArrayList) map.get(receiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    map.put(receiver, arrayList);
                }
                arrayList.add(cVar);
                Iterator<String> itActionsIterator = intentFilter.actionsIterator();
                while (itActionsIterator.hasNext()) {
                    String next = itActionsIterator.next();
                    Map map2 = f15255b;
                    ArrayList arrayList2 = (ArrayList) map2.get(next);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        map2.put(next, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean sendBroadcast(Intent intent, Map<String, Object> map) {
        synchronized (f15254a) {
            try {
                List listA = a(intent);
                if (listA == null) {
                    return false;
                }
                f15256c.add(new b(intent, map, listA));
                Handler handler = f15257d;
                if (!handler.hasMessages(1)) {
                    handler.sendEmptyMessage(1);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void sendBroadcastSync(Intent intent, Map<String, Object> map) {
        List<c> listA = a(intent);
        if (listA == null) {
            return;
        }
        for (c cVar : listA) {
            if (!cVar.f15264d) {
                cVar.f15262b.onReceive(intent, map);
            }
        }
    }

    public static void sendBroadcastSyncWithPendingBroadcasts(Intent intent, Map<String, Object> map) {
        if (sendBroadcast(intent, map)) {
            b();
        }
    }

    public static boolean sendBroadcastWithAdObject(String str, Object obj) {
        HashMap map = new HashMap(1);
        map.put("ad", obj);
        return sendBroadcast(new Intent(str), map);
    }

    public static void unregisterReceiver(Receiver receiver) {
        Map map = f15254a;
        synchronized (map) {
            try {
                List<c> list = (List) map.remove(receiver);
                if (list == null) {
                    return;
                }
                for (c cVar : list) {
                    cVar.f15264d = true;
                    Iterator<String> itActionsIterator = cVar.f15261a.actionsIterator();
                    while (itActionsIterator.hasNext()) {
                        String next = itActionsIterator.next();
                        List list2 = (List) f15255b.get(next);
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                if (((c) it.next()).f15262b == receiver) {
                                    cVar.f15264d = true;
                                    it.remove();
                                }
                            }
                            if (list2.size() <= 0) {
                                f15255b.remove(next);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static List a(Intent intent) {
        synchronized (f15254a) {
            try {
                String action = intent.getAction();
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                List<c> list = (List) f15255b.get(action);
                if (list == null) {
                    return null;
                }
                ArrayList arrayList = null;
                for (c cVar : list) {
                    if (!cVar.f15263c && cVar.f15261a.match(action, null, scheme, data, categories, "AppLovinBroadcastManager") >= 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(cVar);
                        cVar.f15263c = true;
                    }
                }
                if (arrayList == null) {
                    return null;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).f15263c = false;
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
