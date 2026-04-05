package com.unity3d.services.core.misc;

import android.text.TextUtils;
import com.unity3d.services.core.log.DeviceLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class JsonStorage implements IJsonStorageReader {
    private JSONObject _data;

    private synchronized void createObjectTree(String str) {
        String[] strArrSplit = str.split("\\.");
        JSONObject jSONObject = this._data;
        if (str.length() == 0) {
            return;
        }
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            if (jSONObject.has(strArrSplit[i10])) {
                try {
                    jSONObject = jSONObject.getJSONObject(strArrSplit[i10]);
                } catch (Exception e10) {
                    DeviceLog.exception("Couldn't get existing JSONObject", e10);
                }
            } else {
                try {
                    jSONObject = jSONObject.put(strArrSplit[i10], new JSONObject()).getJSONObject(strArrSplit[i10]);
                } catch (Exception e11) {
                    DeviceLog.exception("Couldn't create new JSONObject", e11);
                }
            }
        }
    }

    private synchronized Object findObject(String str) {
        String[] strArrSplit = str.split("\\.");
        JSONObject jSONObject = this._data;
        if (str.length() == 0) {
            return jSONObject;
        }
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            if (!jSONObject.has(strArrSplit[i10])) {
                return null;
            }
            try {
                jSONObject = jSONObject.getJSONObject(strArrSplit[i10]);
            } catch (Exception e10) {
                DeviceLog.exception("Couldn't read JSONObject: " + strArrSplit[i10], e10);
                return null;
            }
        }
        return jSONObject;
    }

    private synchronized String getParentObjectTreeFor(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList(Arrays.asList(str.split("\\.")));
        arrayList.remove(arrayList.size() - 1);
        return TextUtils.join(".", arrayList.toArray());
    }

    public synchronized void clearData() {
        this._data = null;
    }

    public synchronized boolean delete(String str) {
        JSONObject jSONObject;
        if (this._data == null) {
            DeviceLog.error("Data is NULL, readStorage probably not called");
            return false;
        }
        String[] strArrSplit = str.split("\\.");
        return (!(findObject(getParentObjectTreeFor(str)) instanceof JSONObject) || (jSONObject = (JSONObject) findObject(getParentObjectTreeFor(str))) == null || jSONObject.remove(strArrSplit[strArrSplit.length - 1]) == null) ? false : true;
    }

    @Override // com.unity3d.services.core.misc.IJsonStorageReader
    public synchronized Object get(String str) {
        JSONObject jSONObject;
        Object obj = null;
        if (this._data == null) {
            DeviceLog.error("Data is NULL, readStorage probably not called");
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if (!(findObject(getParentObjectTreeFor(str)) instanceof JSONObject) || (jSONObject = (JSONObject) findObject(getParentObjectTreeFor(str))) == null) {
            return null;
        }
        try {
            if (jSONObject.has(strArrSplit[strArrSplit.length - 1])) {
                obj = jSONObject.get(strArrSplit[strArrSplit.length - 1]);
            }
        } catch (Exception e10) {
            DeviceLog.exception("Error getting data", e10);
        }
        return obj;
    }

    @Override // com.unity3d.services.core.misc.IJsonStorageReader
    public synchronized JSONObject getData() {
        return this._data;
    }

    public synchronized List<String> getKeys(String str, boolean z10) {
        List<String> keys;
        try {
            if (!(get(str) instanceof JSONObject)) {
                return null;
            }
            JSONObject jSONObject = (JSONObject) get(str);
            ArrayList arrayList = new ArrayList();
            if (jSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (z10) {
                        keys = getKeys(str + "." + next, z10);
                    } else {
                        keys = null;
                    }
                    arrayList.add(next);
                    if (keys != null) {
                        Iterator<String> it = keys.iterator();
                        while (it.hasNext()) {
                            arrayList.add(next + "." + it.next());
                        }
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean hasData() {
        JSONObject jSONObject = this._data;
        if (jSONObject != null) {
            if (jSONObject.length() > 0) {
                return true;
            }
        }
        return false;
    }

    public synchronized boolean initData() {
        if (this._data != null) {
            return false;
        }
        this._data = new JSONObject();
        return true;
    }

    public synchronized boolean set(String str, Object obj) {
        if (this._data != null && str != null && str.length() != 0 && obj != null) {
            createObjectTree(getParentObjectTreeFor(str));
            if (!(findObject(getParentObjectTreeFor(str)) instanceof JSONObject)) {
                DeviceLog.debug("Cannot set subvalue to an object that is not JSONObject");
                return false;
            }
            JSONObject jSONObject = (JSONObject) findObject(getParentObjectTreeFor(str));
            String[] strArrSplit = str.split("\\.");
            if (jSONObject != null) {
                try {
                    jSONObject.put(strArrSplit[strArrSplit.length - 1], obj);
                } catch (JSONException e10) {
                    DeviceLog.exception("Couldn't set value", e10);
                    return false;
                }
            }
            return true;
        }
        DeviceLog.error("Storage not properly initialized or incorrect parameters:" + this._data + ", " + str + ", " + obj);
        return false;
    }

    public synchronized void setData(JSONObject jSONObject) {
        this._data = jSONObject;
    }
}
