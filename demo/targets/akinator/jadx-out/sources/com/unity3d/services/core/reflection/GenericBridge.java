package com.unity3d.services.core.reflection;

import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class GenericBridge {
    private final String _className;
    private final Map<String, Class<?>[]> _functionAndParameters;
    private final Map<String, Method> _methodMap;
    private boolean _methodMapBuilt;
    private final boolean enableLogging;

    public GenericBridge(Map<String, Class<?>[]> map) {
        this(map, true);
    }

    private void buildMethodMap() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z10 = true;
        for (Map.Entry<String, Class<?>[]> entry : getFunctionMap().entrySet()) {
            Class<?>[] value = entry.getValue();
            try {
                Method reflectiveMethod = getReflectiveMethod(classForName(), entry.getKey(), value);
                if (reflectiveMethod != null) {
                    this._methodMap.put(entry.getKey(), reflectiveMethod);
                }
            } catch (Exception unused) {
                if (this.enableLogging) {
                    DeviceLog.debug("ERROR: Could not find %s class with method %s and parameters : %s", this._className, entry.getKey(), value);
                }
                z10 = false;
            }
        }
        this._methodMapBuilt = z10;
    }

    private Method getMethod(String str) {
        return this._methodMap.get(str);
    }

    private Method getReflectiveMethod(Class<?> cls, String str, Class<?>... clsArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (Exception e10) {
            if (this.enableLogging) {
                DeviceLog.debug("ERROR: Could not find method %s in %s", str, cls.getName() + " " + e10.getLocalizedMessage());
            }
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.GMA, c.H, new Object[0]);
            return null;
        }
    }

    public <T> T callNonVoidMethod(String str, Object obj, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method method = getMethod(str);
        if (method == null) {
            if (this.enableLogging) {
                DeviceLog.debug("ERROR: Could not find method %s", str);
            }
            return null;
        }
        try {
            return (T) method.invoke(obj, objArr);
        } catch (Exception e10) {
            if (this.enableLogging) {
                DeviceLog.debug("ERROR: Could not invoke method %s : %s", str, e10.getLocalizedMessage());
            }
            return null;
        }
    }

    public void callVoidMethod(String str, Object obj, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method method = getMethod(str);
        if (method == null) {
            DeviceLog.debug("ERROR: Could not find method %s", str);
            return;
        }
        try {
            method.invoke(obj, objArr);
        } catch (Exception e10) {
            DeviceLog.debug("ERROR: Could not invoke method %s : %s", str, e10.getLocalizedMessage());
        }
    }

    public Class<?> classForName() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            return Class.forName(this._className);
        } catch (ClassNotFoundException e10) {
            if (!this.enableLogging) {
                return null;
            }
            DeviceLog.debug("ERROR: Could not find Class %s %s", this._className, e10.getLocalizedMessage());
            return null;
        }
    }

    public boolean exists() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (classForName() == null) {
            if (this.enableLogging) {
                DeviceLog.debug("ERROR: Could not find class %s", this._className);
            }
            return false;
        }
        if (!this._methodMapBuilt) {
            buildMethodMap();
        }
        return this._methodMap.size() == getFunctionMap().size();
    }

    public abstract String getClassName();

    public Map<String, Class<?>[]> getFunctionMap() {
        return this._functionAndParameters;
    }

    public GenericBridge(Map<String, Class<?>[]> map, boolean z10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        this._methodMapBuilt = false;
        this.enableLogging = z10;
        this._className = getClassName();
        this._functionAndParameters = map;
        this._methodMap = new HashMap();
        buildMethodMap();
    }
}
