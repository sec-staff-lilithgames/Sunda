package com.bykv.vk.openvk.preload.falconx.a;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebResourceResponse;
import com.bykv.vk.openvk.preload.b.b.b;
import com.bykv.vk.openvk.preload.b.d;
import com.ironsource.C3191e4;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<? extends d<?, ?>>, b> f17030a = new HashMap();

    public static WebResourceResponse a(InputStream inputStream, Map<String, String> map) {
        if (inputStream == null) {
            return null;
        }
        try {
            String strReplace = map.get("content-type");
            String[] strArrSplit = new String[0];
            if (TextUtils.isEmpty(strReplace)) {
                strReplace = map.get("Content-Type");
            }
            if (!TextUtils.isEmpty(strReplace) && strReplace != null) {
                strReplace = strReplace.replace(" ", "");
                strArrSplit = strReplace.split(";");
            }
            String str = "";
            String strSubstring = str;
            for (String str2 : strArrSplit) {
                if (!TextUtils.isEmpty(str2)) {
                    int iIndexOf = str2.indexOf(C3191e4.i.f36525b);
                    if (iIndexOf == -1) {
                        str = str2;
                    } else if (str2.contains("charset")) {
                        strSubstring = str2.substring(iIndexOf + 1);
                    }
                }
            }
            if (strReplace != null ? strReplace.contains("font/ttf") : false) {
                return new WebResourceResponse(str, strSubstring, 200, "OK", map, inputStream);
            }
            WebResourceResponse webResourceResponse = new WebResourceResponse(str, strSubstring, inputStream);
            webResourceResponse.setResponseHeaders(map);
            return webResourceResponse;
        } catch (Throwable th2) {
            Log.e("WebResourceUtils", "getResponseWithHeaders error", th2);
            return null;
        }
    }

    public final void a(Class<? extends d<?, ?>> cls, com.bykv.vk.openvk.preload.b.b.a aVar) {
        synchronized (this.f17030a) {
            try {
                b bVar = this.f17030a.get(cls);
                if (bVar == null) {
                    bVar = new b(new com.bykv.vk.openvk.preload.b.b.a[0]);
                    this.f17030a.put(cls, bVar);
                }
                bVar.a(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final com.bykv.vk.openvk.preload.b.b.a a(Class<? extends d<?, ?>> cls) {
        b bVar;
        synchronized (this.f17030a) {
            bVar = this.f17030a.get(cls);
        }
        return bVar;
    }

    public static <T> T a(T t10) {
        t10.getClass();
        return t10;
    }

    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static DateFormat a(int i10, int i11) {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (i10 == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i10 == 1) {
            str = "MMMM d, yyyy";
        } else if (i10 == 2) {
            str = "MMM d, yyyy";
        } else if (i10 == 3) {
            str = "M/d/yy";
        } else {
            throw new IllegalArgumentException("Unknown DateFormat style: ".concat(String.valueOf(i10)));
        }
        sb2.append(str);
        sb2.append(" ");
        if (i11 == 0 || i11 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i11 == 2) {
            str2 = "h:mm:ss a";
        } else if (i11 == 3) {
            str2 = "h:mm a";
        } else {
            throw new IllegalArgumentException("Unknown DateFormat style: ".concat(String.valueOf(i11)));
        }
        sb2.append(str2);
        return new SimpleDateFormat(sb2.toString(), Locale.US);
    }
}
