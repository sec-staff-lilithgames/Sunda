package com.unity3d.ads.metadata;

import android.content.Context;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageEvent;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.misc.Utilities;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class MetaData extends JsonStorage {
    private String _category;
    protected Context _context;

    public MetaData(Context context) {
        this._context = context.getApplicationContext();
    }

    private String getActualKey(String str) {
        if (getCategory() == null) {
            return str;
        }
        return getCategory() + "." + str;
    }

    private synchronized boolean set(String str, boolean z10) {
        return set(str, Boolean.valueOf(z10));
    }

    public void commit() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!StorageManager.init(this._context)) {
            DeviceLog.error("Unity Ads could not commit metadata due to storage error");
            return;
        }
        Storage storage = StorageManager.getStorage(getStorageType());
        if (getData() == null || storage == null) {
            return;
        }
        Iterator<String> itKeys = getData().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objMergeJsonObjects = get(next);
            if (storage.get(next) != null && (storage.get(next) instanceof JSONObject) && (get(next) instanceof JSONObject)) {
                try {
                    objMergeJsonObjects = Utilities.mergeJsonObjects((JSONObject) objMergeJsonObjects, (JSONObject) storage.get(next));
                } catch (Exception e10) {
                    DeviceLog.exception("Exception merging JSONs", e10);
                }
            }
            storage.set(next, objMergeJsonObjects);
        }
        storage.writeStorage();
        storage.sendEvent(StorageEvent.SET, getData());
    }

    public String getCategory() {
        return this._category;
    }

    public StorageManager.StorageType getStorageType() {
        return StorageManager.StorageType.PUBLIC;
    }

    public void setCategory(String str) {
        this._category = str;
    }

    public synchronized boolean setRaw(String str, Object obj) {
        initData();
        return super.set(getActualKey(str), obj);
    }

    private synchronized boolean set(String str, int i10) {
        return set(str, Integer.valueOf(i10));
    }

    private synchronized boolean set(String str, long j10) {
        return set(str, Long.valueOf(j10));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    @Override // com.unity3d.services.core.misc.JsonStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean set(java.lang.String r3, java.lang.Object r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.initData()     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r0.<init>()     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r2.getActualKey(r3)     // Catch: java.lang.Throwable -> L44
            r0.append(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = ".value"
            r0.append(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L44
            boolean r4 = super.set(r0, r4)     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto L46
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r4.<init>()     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = r2.getActualKey(r3)     // Catch: java.lang.Throwable -> L44
            r4.append(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = ".ts"
            r4.append(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L44
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L44
            java.lang.Long r4 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L44
            boolean r3 = super.set(r3, r4)     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L46
            r3 = 1
            goto L47
        L44:
            r3 = move-exception
            goto L49
        L46:
            r3 = 0
        L47:
            monitor-exit(r2)
            return r3
        L49:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L44
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.metadata.MetaData.set(java.lang.String, java.lang.Object):boolean");
    }
}
