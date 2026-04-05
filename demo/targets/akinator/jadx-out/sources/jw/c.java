package jw;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.e0;
import sv.n0;
import sv.p0;
import uu.p1;
import xv.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f69955a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final CopyOnWriteArraySet f69956b = new CopyOnWriteArraySet();

    /* renamed from: c, reason: collision with root package name */
    public static final Map f69957c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = l0.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(l0.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(fw.j.class.getName(), "okhttp.Http2");
        linkedHashMap.put(bw.g.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f69957c = p1.toMap(linkedHashMap);
    }

    public static /* synthetic */ void androidLog$okhttp$default(c cVar, String str, int i10, String str2, Throwable th2, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            th2 = null;
        }
        cVar.androidLog$okhttp(str, i10, str2, th2);
    }

    public final void androidLog$okhttp(String loggerName, int i10, String message, Throwable th2) {
        int iMin;
        e0.checkNotNullParameter(loggerName, "loggerName");
        e0.checkNotNullParameter(message, "message");
        String strTake = (String) f69957c.get(loggerName);
        if (strTake == null) {
            strTake = p0.take(loggerName, 23);
        }
        if (Log.isLoggable(strTake, i10)) {
            if (th2 != null) {
                StringBuilder sbS = a.b.s(message, '\n');
                sbS.append(Log.getStackTraceString(th2));
                message = sbS.toString();
            }
            String str = message;
            int length = str.length();
            int i11 = 0;
            while (i11 < length) {
                int iIndexOf$default = n0.indexOf$default((CharSequence) str, '\n', i11, false, 4, (Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = length;
                }
                while (true) {
                    iMin = Math.min(iIndexOf$default, i11 + 4000);
                    String strSubstring = str.substring(i11, iMin);
                    e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    Log.println(i10, strTake, strSubstring);
                    if (iMin >= iIndexOf$default) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
            }
        }
    }

    public final void enable() throws SecurityException {
        try {
            for (Map.Entry entry : f69957c.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (f69956b.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(d.f69958a);
                }
            }
        } catch (RuntimeException e10) {
            e10.printStackTrace();
        }
    }
}
