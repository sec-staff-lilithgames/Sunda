package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class LocalBroadcastManager {
    private static final boolean DEBUG = false;
    static final int MSG_EXEC_PENDING_BROADCASTS = 1;
    private static final String TAG = "LocalBroadcastManager";
    private static LocalBroadcastManager mInstance;
    private static final Object mLock = new Object();
    private final Context mAppContext;
    private final Handler mHandler;
    private final HashMap<BroadcastReceiver, ArrayList<c>> mReceivers = new HashMap<>();
    private final HashMap<String, ArrayList<c>> mActions = new HashMap<>();
    private final ArrayList<b> mPendingBroadcasts = new ArrayList<>();

    private LocalBroadcastManager(Context context) {
        this.mAppContext = context;
        this.mHandler = new a(this, context.getMainLooper());
    }

    public static LocalBroadcastManager getInstance(Context context) {
        LocalBroadcastManager localBroadcastManager;
        synchronized (mLock) {
            try {
                if (mInstance == null) {
                    mInstance = new LocalBroadcastManager(context.getApplicationContext());
                }
                localBroadcastManager = mInstance;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return localBroadcastManager;
    }

    public void executePendingBroadcasts() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.mReceivers) {
                try {
                    size = this.mPendingBroadcasts.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.mPendingBroadcasts.toArray(bVarArr);
                    this.mPendingBroadcasts.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = bVarArr[i10];
                int size2 = ((ArrayList) bVar.f6757b).size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c cVar = (c) ((ArrayList) bVar.f6757b).get(i11);
                    if (!cVar.f6761d) {
                        cVar.f6759b.onReceive(this.mAppContext, (Intent) bVar.f6756a);
                    }
                }
            }
        }
    }

    public void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.mReceivers) {
            try {
                c cVar = new c(broadcastReceiver, intentFilter);
                ArrayList<c> arrayList = this.mReceivers.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.mReceivers.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                    String action = intentFilter.getAction(i10);
                    ArrayList<c> arrayList2 = this.mActions.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.mActions.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean sendBroadcast(Intent intent) {
        ArrayList<c> arrayList;
        synchronized (this.mReceivers) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.mAppContext.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z10 = (intent.getFlags() & 8) != 0;
                if (z10) {
                    Log.v(TAG, "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<c> arrayList2 = this.mActions.get(intent.getAction());
                if (arrayList2 != null) {
                    if (z10) {
                        Log.v(TAG, "Action list: " + arrayList2);
                    }
                    ArrayList arrayList3 = null;
                    int i10 = 0;
                    while (i10 < arrayList2.size()) {
                        c cVar = arrayList2.get(i10);
                        if (z10) {
                            Log.v(TAG, "Matching against filter " + cVar.f6758a);
                        }
                        if (cVar.f6760c) {
                            if (z10) {
                                Log.v(TAG, "  Filter's target already added");
                            }
                            arrayList = arrayList2;
                        } else {
                            int iMatch = cVar.f6758a.match(action, strResolveTypeIfNeeded, scheme, data, categories, TAG);
                            if (iMatch >= 0) {
                                if (z10) {
                                    StringBuilder sb2 = new StringBuilder();
                                    arrayList = arrayList2;
                                    sb2.append("  Filter matched!  match=0x");
                                    sb2.append(Integer.toHexString(iMatch));
                                    Log.v(TAG, sb2.toString());
                                } else {
                                    arrayList = arrayList2;
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(cVar);
                                cVar.f6760c = true;
                            } else {
                                arrayList = arrayList2;
                                if (z10) {
                                    Log.v(TAG, "  Filter did not match: " + (iMatch != -4 ? iMatch != -3 ? iMatch != -2 ? iMatch != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                                }
                            }
                        }
                        i10++;
                        arrayList2 = arrayList;
                    }
                    if (arrayList3 != null) {
                        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                            ((c) arrayList3.get(i11)).f6760c = false;
                        }
                        this.mPendingBroadcasts.add(new b(intent, arrayList3));
                        if (!this.mHandler.hasMessages(1)) {
                            this.mHandler.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void sendBroadcastSync(Intent intent) {
        if (sendBroadcast(intent)) {
            executePendingBroadcasts();
        }
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        synchronized (this.mReceivers) {
            try {
                ArrayList<c> arrayListRemove = this.mReceivers.remove(broadcastReceiver);
                if (arrayListRemove == null) {
                    return;
                }
                for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                    c cVar = arrayListRemove.get(size);
                    cVar.f6761d = true;
                    for (int i10 = 0; i10 < cVar.f6758a.countActions(); i10++) {
                        String action = cVar.f6758a.getAction(i10);
                        ArrayList<c> arrayList = this.mActions.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = arrayList.get(size2);
                                if (cVar2.f6759b == broadcastReceiver) {
                                    cVar2.f6761d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.mActions.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
