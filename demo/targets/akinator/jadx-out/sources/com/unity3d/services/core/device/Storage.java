package com.unity3d.services.core.device;

import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kv.l;
import org.json.JSONObject;
import sv.g;
import uu.p0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class Storage extends JsonStorage {
    public static final Companion Companion = new Companion(null);
    private static final MutableStateFlow<List<l>> onStorageEventCallbacks = StateFlowKt.MutableStateFlow(p0.emptyList());
    private final String _targetFileName;
    private final StorageManager.StorageType type;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final void addStorageEventCallback(l callback) {
            Object value;
            e0.checkNotNullParameter(callback, "callback");
            MutableStateFlow mutableStateFlow = Storage.onStorageEventCallbacks;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, y0.plus((Collection<? extends l>) value, callback)));
        }

        public final void removeStorageEventCallback(l callback) {
            Object value;
            e0.checkNotNullParameter(callback, "callback");
            MutableStateFlow mutableStateFlow = Storage.onStorageEventCallbacks;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, y0.minus((List) value, callback)));
        }

        private Companion() {
        }
    }

    public synchronized boolean clearStorage() {
        clearData();
        return new File(this._targetFileName).delete();
    }

    public final StorageManager.StorageType getType() {
        return this.type;
    }

    public final synchronized boolean initStorage() {
        readStorage();
        super.initData();
        return true;
    }

    public synchronized boolean readStorage() {
        byte[] fileBytes;
        boolean z10 = false;
        try {
            try {
                fileBytes = Utilities.readFileBytes(new File(this._targetFileName));
            } catch (FileNotFoundException e10) {
                DeviceLog.debug("Storage JSON file not found in local cache:", e10);
            }
        } catch (Exception e11) {
            DeviceLog.debug("Failed to read storage JSON file:", e11);
        }
        if (fileBytes == null) {
            return false;
        }
        setData(new JSONObject(new String(fileBytes, g.f86134b)));
        z10 = true;
        return z10;
    }

    public final synchronized void sendEvent(StorageEvent storageEvent, Object obj) {
        List<l> value = onStorageEventCallbacks.getValue();
        if (value.isEmpty()) {
            if (!(WebViewApp.getCurrentApp() != null ? WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.STORAGE, storageEvent, this.type.name(), obj) : false)) {
                DeviceLog.debug("Couldn't send storage event to WebApp");
            }
            return;
        }
        e0.checkNotNull(storageEvent);
        StorageEventInfo storageEventInfo = new StorageEventInfo(storageEvent, this.type, obj);
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            ((l) it.next()).invoke(storageEventInfo);
        }
    }

    public final synchronized boolean storageFileExists() {
        return new File(this._targetFileName).exists();
    }

    public synchronized boolean writeStorage() {
        File file = new File(this._targetFileName);
        if (getData() == null) {
            return false;
        }
        return Utilities.writeFile(file, getData().toString());
    }

    public Storage(String str, StorageManager.StorageType type) {
        e0.checkNotNullParameter(str, gjnZrsdA.YhR);
        e0.checkNotNullParameter(type, "type");
        this._targetFileName = str;
        this.type = type;
    }
}
