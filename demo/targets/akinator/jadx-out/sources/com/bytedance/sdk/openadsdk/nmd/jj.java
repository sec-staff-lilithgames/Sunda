package com.bytedance.sdk.openadsdk.nmd;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.core.app.NotificationCompat;
import com.ironsource.C3191e4;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj {

    /* renamed from: jd, reason: collision with root package name */
    private WeakReference<xyk> f21309jd;
    private Context jpo;
    private Map<String, jpo> wqx = new HashMap();

    /* renamed from: cm, reason: collision with root package name */
    private SensorEventListener f21308cm = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.1
        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            xyk xykVarCm;
            if (sensorEvent.sensor.getType() != 1 || (xykVarCm = jj.this.cm()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f10);
                jSONObject.put("y", f11);
                jSONObject.put("z", f12);
                xykVarCm.jpo("accelerometer_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }
    };
    private SensorEventListener my = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.12
        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            xyk xykVarCm;
            if (sensorEvent.sensor.getType() != 4 || (xykVarCm = jj.this.cm()) == null) {
                return;
            }
            float degrees = (float) Math.toDegrees(sensorEvent.values[0]);
            float degrees2 = (float) Math.toDegrees(sensorEvent.values[1]);
            float degrees3 = (float) Math.toDegrees(sensorEvent.values[2]);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", degrees);
                jSONObject.put("y", degrees2);
                jSONObject.put("z", degrees3);
                xykVarCm.jpo("gyro_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }
    };

    /* renamed from: jj, reason: collision with root package name */
    private SensorEventListener f21310jj = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.23
        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            xyk xykVarCm;
            if (sensorEvent.sensor.getType() != 10 || (xykVarCm = jj.this.cm()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f10);
                jSONObject.put("y", f11);
                jSONObject.put("z", f12);
                xykVarCm.jpo("accelerometer_grativityless_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }
    };

    /* renamed from: qk, reason: collision with root package name */
    private SensorEventListener f21311qk = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.34
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                float[] fArr = sensorEvent.values;
                float[] fArr2 = yd.f21401jd;
                System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            } else if (sensorEvent.sensor.getType() == 2) {
                float[] fArr3 = sensorEvent.values;
                float[] fArr4 = yd.wqx;
                System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
            }
            float[] fArr5 = yd.f21400cm;
            SensorManager.getRotationMatrix(fArr5, null, yd.f21401jd, yd.wqx);
            float[] fArr6 = yd.my;
            SensorManager.getOrientation(fArr5, fArr6);
            xyk xykVarCm = jj.this.cm();
            if (xykVarCm == null) {
                return;
            }
            float f10 = fArr6[0];
            float f11 = fArr6[1];
            float f12 = fArr6[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("alpha", f10);
                jSONObject.put("beta", f11);
                jSONObject.put(SUvoXnn.MirAbwPTViQo, f12);
                xykVarCm.jpo("rotation_vector_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        JSONObject jpo(JSONObject jSONObject) throws Throwable;
    }

    public jj(xyk xykVar) {
        this.jpo = xykVar.jpo();
        this.f21309jd = new WeakReference<>(xykVar);
        wqx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public xyk cm() {
        WeakReference<xyk> weakReference = this.f21309jd;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.nmd.jpo my() {
        xyk xykVarCm = cm();
        if (xykVarCm == null) {
            return null;
        }
        return xykVarCm.sq();
    }

    private void wqx() {
        this.wqx.put("adInfo", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.45
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                if (xykVarCm == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectJr = xykVarCm.jr();
                if (jSONObjectJr != null) {
                    jSONObjectJr.put("code", 1);
                    return jSONObjectJr;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", -1);
                return jSONObject3;
            }
        });
        this.wqx.put("appInfo", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.56
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = jj.this.jpo().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject2.put("supportList", jSONArray);
                xyk xykVarCm = jj.this.cm();
                if (xykVarCm != null) {
                    jSONObject2.put("deviceId", xykVarCm.qk());
                    jSONObject2.put("netType", xykVarCm.hna());
                    jSONObject2.put("innerAppName", xykVarCm.cm());
                    jSONObject2.put("appName", xykVarCm.my());
                    jSONObject2.put(C3191e4.i.W, xykVarCm.jj());
                    Map<String, String> mapJd = xykVarCm.jd();
                    for (String str : mapJd.keySet()) {
                        jSONObject2.put(str, mapJd.get(str));
                    }
                }
                return jSONObject2;
            }
        });
        this.wqx.put("playableSDKInfo", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.62
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                jSONObject2.put("os", "android");
                return jSONObject2;
            }
        });
        this.wqx.put("subscribe_app_ad", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.63
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.nmd.jpo jpoVarMy = jj.this.my();
                JSONObject jSONObject2 = new JSONObject();
                if (jpoVarMy == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("download_app_ad", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.64
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.nmd.jpo jpoVarMy = jj.this.my();
                JSONObject jSONObject2 = new JSONObject();
                if (jpoVarMy == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put(C3191e4.h.f36499o, new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.2
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                if (xykVarCm == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("viewStatus", xykVarCm.zz());
                return jSONObject3;
            }
        });
        this.wqx.put("getVolume", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.3
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                if (xykVarCm == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("endcard_mute", xykVarCm.xyk());
                return jSONObject3;
            }
        });
        this.wqx.put("getScreenSize", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.4
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                if (xykVarCm == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectOpi = xykVarCm.opi();
                jSONObjectOpi.put("code", 1);
                return jSONObjectOpi;
            }
        });
        this.wqx.put("start_accelerometer_observer", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.5
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th2) {
                        qk.jpo("PlayableJsBridge", "invoke start_accelerometer_observer error", th2);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th2.toString());
                        return jSONObject2;
                    }
                }
                yd.jpo(jj.this.jpo, jj.this.f21308cm, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("close_accelerometer_observer", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.6
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    yd.jpo(jj.this.jpo, jj.this.f21308cm);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    qk.jpo("PlayableJsBridge", "invoke close_accelerometer_observer error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.wqx.put("start_gyro_observer", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.7
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th2) {
                        qk.jpo("PlayableJsBridge", "invoke start_gyro_observer error", th2);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th2.toString());
                        return jSONObject2;
                    }
                }
                yd.jd(jj.this.jpo, jj.this.my, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("close_gyro_observer", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.8
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    yd.jpo(jj.this.jpo, jj.this.my);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    qk.jpo("PlayableJsBridge", "invoke close_gyro_observer error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.wqx.put("start_accelerometer_grativityless_observer", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.9
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th2) {
                        qk.jpo("PlayableJsBridge", "invoke start_accelerometer_grativityless_observer error", th2);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th2.toString());
                        return jSONObject2;
                    }
                }
                yd.wqx(jj.this.jpo, jj.this.f21310jj, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("close_accelerometer_grativityless_observer", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.10
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    yd.jpo(jj.this.jpo, jj.this.f21310jj);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    qk.jpo("PlayableJsBridge", "invoke close_accelerometer_grativityless_observer error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.wqx.put("start_rotation_vector_observer", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.11
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th2) {
                        qk.jpo("PlayableJsBridge", "invoke start_rotation_vector_observer error", th2);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th2.toString());
                        return jSONObject2;
                    }
                }
                yd.cm(jj.this.jpo, jj.this.f21311qk, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("close_rotation_vector_observer", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.13
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    yd.jpo(jj.this.jpo, jj.this.f21311qk);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    qk.jpo("PlayableJsBridge", "invoke close_rotation_vector_observer error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.wqx.put("device_shake", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.14
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    yd.jpo(jj.this.jpo, 300L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    qk.jpo("PlayableJsBridge", "invoke device_shake error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.wqx.put("device_shake_short", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.15
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    yd.jpo(jj.this.jpo, 150L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    qk.jpo("PlayableJsBridge", "invoke device_shake error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.wqx.put("playable_style", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.16
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectWqx = xykVarCm.wqx();
                jSONObjectWqx.put("code", 1);
                return jSONObjectWqx;
            }
        });
        this.wqx.put("sendReward", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.17
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                xykVarCm.rq();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("playableInteractionTriggered", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.18
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                xykVarCm.tu();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("webview_time_track", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.19
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                return new JSONObject();
            }
        });
        this.wqx.put("playable_event", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.20
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null || jSONObject == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                xykVarCm.jd(jSONObject.optString(NotificationCompat.CATEGORY_EVENT, null), jSONObject.optJSONObject("params"));
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("reportAd", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.21
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("close", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.22
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("openAdLandPageLinks", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.24
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("get_viewport", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.25
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectNmd = xykVarCm.nmd();
                jSONObjectNmd.put("code", 1);
                return jSONObjectNmd;
            }
        });
        this.wqx.put("jssdk_load_finish", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.26
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                xykVarCm.sz();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("playable_material_render_result", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.27
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                xykVarCm.zz(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("detect_change_playable_click", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.28
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectYd = xykVarCm.yd();
                jSONObjectYd.put("code", 1);
                return jSONObjectYd;
            }
        });
        this.wqx.put("check_camera_permission", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.29
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectAu = xykVarCm.au();
                jSONObjectAu.put("code", 1);
                return jSONObjectAu;
            }
        });
        this.wqx.put("check_external_storage", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.30
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectOya = xykVarCm.oya();
                if (jSONObjectOya.isNull("result")) {
                    jSONObjectOya.put("code", -1);
                    return jSONObjectOya;
                }
                jSONObjectOya.put("code", 1);
                return jSONObjectOya;
            }
        });
        this.wqx.put("playable_open_camera", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.31
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("playable_pick_photo", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.32
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("playable_download_media_in_photos", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.33
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                xykVarCm.jpo(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("playable_preventTouchEvent", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.35
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                xykVarCm.jd(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("playable_settings_info", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.36
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectPrr = xykVarCm.prr();
                jSONObjectPrr.put("code", 1);
                return jSONObjectPrr;
            }
        });
        this.wqx.put("playable_load_main_scene", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.37
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                xykVarCm.dt();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("playable_enter_section", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.38
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                xykVarCm.cm(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("playable_end", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.39
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                xykVarCm.hmu();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("playable_finish_play_playable", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.40
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                xykVarCm.nq();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("playable_transfrom_module_show", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.41
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                xykVarCm.se();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("playable_transfrom_module_change_color", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.42
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                xykVarCm.hx();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("playable_set_scroll_rect", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.43
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("playable_click_area", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.44
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                xykVarCm.my(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("playable_real_play_start", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.46
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("playable_material_first_frame_show", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.47
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                xykVarCm.pdm();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("playable_stuck_check_pong", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.48
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                xykVarCm.rv();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("playable_material_adnormal_mask", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.49
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                xykVarCm.jj(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("playable_long_press_panel", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.50
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("playable_alpha_player_play", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.51
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("playable_transfrom_module_highlight", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.52
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("playable_send_click_event", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.53
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("playable_query_media_permission_declare", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.54
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectQk = xykVarCm.qk(jSONObject);
                jSONObjectQk.put("code", 1);
                return jSONObjectQk;
            }
        });
        this.wqx.put("playable_query_media_permission_enable", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.55
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                xyk xykVarCm = jj.this.cm();
                JSONObject jSONObject2 = new JSONObject();
                if (xykVarCm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectXyk = xykVarCm.xyk(jSONObject);
                jSONObjectXyk.put("code", 1);
                return jSONObjectXyk;
            }
        });
        this.wqx.put("playable_apply_media_permission", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.57
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.nmd.jpo jpoVarMy = jj.this.my();
                JSONObject jSONObject2 = new JSONObject();
                if (jpoVarMy == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("playable_start_kws", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.58
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.nmd.jpo jpoVarMy = jj.this.my();
                JSONObject jSONObject2 = new JSONObject();
                if (jpoVarMy == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("playable_close_kws", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.59
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.nmd.jpo jpoVarMy = jj.this.my();
                JSONObject jSONObject2 = new JSONObject();
                if (jpoVarMy == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("playable_video_preload_task_add", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.60
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.nmd.jpo jpoVarMy = jj.this.my();
                JSONObject jSONObject2 = new JSONObject();
                if (jpoVarMy == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.wqx.put("playable_video_preload_task_cancel", new jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jj.61
            @Override // com.bytedance.sdk.openadsdk.nmd.jj.jpo
            public JSONObject jpo(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.nmd.jpo jpoVarMy = jj.this.my();
                JSONObject jSONObject2 = new JSONObject();
                if (jpoVarMy == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
    }

    public void jd() {
        yd.jpo(this.jpo, this.f21308cm);
        yd.jpo(this.jpo, this.my);
        yd.jpo(this.jpo, this.f21310jj);
        yd.jpo(this.jpo, this.f21311qk);
    }

    public Set<String> jpo() {
        return this.wqx.keySet();
    }

    public JSONObject jpo(String str, JSONObject jSONObject) {
        try {
            jpo jpoVar = this.wqx.get(str);
            if (jpoVar == null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
            return jpoVar.jpo(jSONObject);
        } catch (Throwable th2) {
            qk.jpo("PlayableJsBridge", "invoke error", th2);
            return null;
        }
    }
}
