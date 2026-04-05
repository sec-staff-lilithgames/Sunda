package com.apm.insight.b;

import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import io.ktor.http.LinkHeader;
import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static MessageQueue f12938a;

    /* renamed from: b, reason: collision with root package name */
    private static Field f12939b;

    /* renamed from: c, reason: collision with root package name */
    private static Field f12940c;

    public static MessageQueue a() {
        if (f12938a == null && Looper.getMainLooper() != null) {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == Looper.myLooper()) {
                f12938a = Looper.myQueue();
            } else {
                f12938a = mainLooper.getQueue();
            }
        }
        return f12938a;
    }

    public static Message a(MessageQueue messageQueue) throws NoSuchFieldException, SecurityException {
        Field field = f12939b;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
                f12939b = declaredField;
                declaredField.setAccessible(true);
                return (Message) f12939b.get(messageQueue);
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            return (Message) field.get(messageQueue);
        } catch (Exception unused2) {
            return null;
        }
    }

    private static Message a(Message message) throws NoSuchFieldException, SecurityException {
        Field field = f12940c;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.Message").getDeclaredField(LinkHeader.Rel.Next);
                f12940c = declaredField;
                declaredField.setAccessible(true);
                return (Message) f12940c.get(message);
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            return (Message) field.get(message);
        } catch (Exception unused2) {
            return null;
        }
    }

    private static JSONObject a(Message message, long j10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (message != null) {
            try {
                jSONObject.put("when", message.getWhen() - j10);
                if (message.getCallback() != null) {
                    jSONObject.put("callback", String.valueOf(message.getCallback()));
                }
                jSONObject.put("what", message.what);
                if (message.getTarget() != null) {
                    jSONObject.put("target", String.valueOf(message.getTarget()));
                } else {
                    jSONObject.put("barrier", message.arg1);
                }
                jSONObject.put("arg1", message.arg1);
                jSONObject.put("arg2", message.arg2);
                Object obj = message.obj;
                if (obj != null) {
                    jSONObject.put("obj", obj);
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
                return jSONObject;
            }
        }
        return jSONObject;
    }

    public static JSONArray a(long j10) {
        MessageQueue messageQueueA = a();
        JSONArray jSONArray = new JSONArray();
        if (messageQueueA != null) {
            try {
                synchronized (messageQueueA) {
                    try {
                        Message messageA = a(messageQueueA);
                        if (messageA == null) {
                            return jSONArray;
                        }
                        int i10 = 0;
                        int i11 = 0;
                        while (messageA != null && i10 < 100) {
                            i10++;
                            i11++;
                            JSONObject jSONObjectA = a(messageA, j10);
                            try {
                                jSONObjectA.put("id", i11);
                            } catch (JSONException unused) {
                            }
                            jSONArray.put(jSONObjectA);
                            messageA = a(messageA);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th3, "NPTH_CATCH");
                return jSONArray;
            }
        }
        return jSONArray;
    }
}
