package io.bidmachine.analytics.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import com.ironsource.C3191e4;
import java.io.Closeable;
import java.io.Flushable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import tu.x0;
import uu.j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class s0 {
    public static final Object a(Closeable closeable) {
        try {
            int i10 = tu.z.f87419c;
            closeable.close();
            return tu.z.m7131constructorimpl(x0.f87415a);
        } catch (Throwable th2) {
            int i11 = tu.z.f87419c;
            return tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
        }
    }

    public static final byte[] b(byte[] bArr, String str) {
        return a(bArr, str.getBytes(sv.g.f86134b));
    }

    public static final String c(String str) {
        return Base64.encodeToString(str.getBytes(sv.g.f86134b), 2);
    }

    public static final String d(String str) {
        if (str.length() == 0) {
            return str;
        }
        int iIndexOf$default = sv.n0.indexOf$default((CharSequence) str, C3191e4.i.f36525b, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return sv.p0.reversed(str).toString();
        }
        return sv.p0.reversed(str.substring(0, iIndexOf$default)).toString() + str.substring(iIndexOf$default);
    }

    public static final String b(String str) {
        return a(d(str));
    }

    public static final Object a(Flushable flushable) {
        try {
            int i10 = tu.z.f87419c;
            flushable.flush();
            return tu.z.m7131constructorimpl(x0.f87415a);
        } catch (Throwable th2) {
            int i11 = tu.z.f87419c;
            return tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
        }
    }

    public static final JSONArray a(List list) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj instanceof List) {
                jSONArray.put(a((List) obj));
            } else if (obj instanceof Map) {
                jSONArray.put(a((Map) obj));
            } else {
                jSONArray.put(obj);
            }
        }
        return jSONArray;
    }

    public static final JSONObject a(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            try {
                int i10 = tu.z.f87419c;
                String strValueOf = String.valueOf(key);
                if (strValueOf.length() != 0 && value != null) {
                    if (value instanceof List) {
                        value = a((List) value);
                    } else if (value instanceof Map) {
                        value = a((Map) value);
                    }
                    jSONObject.put(strValueOf, value);
                }
                tu.z.m7131constructorimpl(x0.f87415a);
            } catch (Throwable th2) {
                int i11 = tu.z.f87419c;
                tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
            }
        }
        return jSONObject;
    }

    public static final Map a(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : rv.y.asSequence(jSONObject.keys())) {
            Object objA = a(jSONObject.get(str));
            if (objA != null) {
                linkedHashMap.put(str, objA);
            }
        }
        return linkedHashMap;
    }

    public static final List a(JSONArray jSONArray) {
        qv.m mVarUntil = qv.v.until(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator it = mVarUntil.iterator();
        while (it.hasNext()) {
            Object objA = a(jSONArray.get(((j1) it).nextInt()));
            if (objA != null) {
                arrayList.add(objA);
            }
        }
        return arrayList;
    }

    private static final Object a(Object obj) {
        if (kotlin.jvm.internal.e0.areEqual(obj, JSONObject.NULL)) {
            return null;
        }
        return obj instanceof JSONObject ? a((JSONObject) obj) : obj instanceof JSONArray ? a((JSONArray) obj) : obj;
    }

    public static final Map a(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            Object string = bundle.get(str);
            if (!(string instanceof Boolean)) {
                if (string instanceof Byte) {
                    string = Integer.valueOf(((Number) string).byteValue());
                } else if (!(string instanceof Character) && !(string instanceof Double) && !(string instanceof Float) && !(string instanceof Integer) && !(string instanceof Long)) {
                    if (string instanceof Short) {
                        string = Integer.valueOf(((Number) string).shortValue());
                    } else if (!(string instanceof String)) {
                        if (string instanceof Bundle) {
                            string = a((Bundle) string);
                        } else {
                            string = (!(string instanceof CharSequence) && string == null) ? null : string.toString();
                        }
                    }
                }
            }
            if (string != null) {
                linkedHashMap.put(str, string);
            }
        }
        return linkedHashMap;
    }

    public static final boolean a(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static final byte[] a(byte[] bArr, String str) {
        return a(bArr, str.getBytes(sv.g.f86134b));
    }

    private static final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10 % bArr2.length]);
        }
        return bArr3;
    }

    public static final String a(String str) {
        return new String(Base64.decode(str, 2), sv.g.f86134b);
    }

    public static final String a(Throwable th2) {
        String message = th2.getMessage();
        if (message != null) {
            String str = th2.getClass().getName() + ": " + message;
            if (str != null) {
                return str;
            }
        }
        return th2.getClass().getName();
    }
}
