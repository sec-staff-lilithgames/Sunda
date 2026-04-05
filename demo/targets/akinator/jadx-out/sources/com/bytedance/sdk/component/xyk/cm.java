package com.bytedance.sdk.component.xyk;

import a.b;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.prr;
import com.ironsource.C3191e4;
import j1.o2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm {
    private static AtomicInteger wqx = new AtomicInteger(0);
    public static final String[] jpo = {"com.bytedance.sdk", "com.bykv.vk", "com.ss", "tt_pangle"};

    /* renamed from: jd, reason: collision with root package name */
    public static final String[] f19018jd = {"tt_pangle", "bd_tracker"};

    /* renamed from: cm, reason: collision with root package name */
    private static int f19017cm = 0;
    private static int my = 0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: cm, reason: collision with root package name */
        public String f19019cm;

        /* renamed from: jd, reason: collision with root package name */
        public String f19020jd;
        public int jpo;
        public String wqx;

        public jpo(String str, int i10, String str2, String str3) {
            this.wqx = str;
            this.jpo = i10;
            this.f19019cm = str2;
            this.f19020jd = str3;
        }

        public void jpo(int i10) {
            this.jpo = i10;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ThreadModel{times=");
            sb2.append(this.jpo);
            sb2.append(", name='");
            sb2.append(this.f19020jd);
            sb2.append("', lastStackStack='");
            return o2.o(sb2, this.wqx, "'}");
        }

        public int jpo() {
            return this.jpo;
        }
    }

    private static void jd() {
        int i10;
        String str;
        wqx wqxVarZz = jj.zz();
        if (wqxVarZz == null) {
            return;
        }
        int i11 = 1;
        int iAddAndGet = wqx.addAndGet(1);
        int i12 = jj.wqx;
        if (i12 < 0 || iAddAndGet % i12 != 0 || Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        HashMap map = new HashMap();
        if (allStackTraces == null) {
            return;
        }
        boolean zJpo = prr.jpo();
        int size = allStackTraces.size();
        if (size > my) {
            my = size;
        }
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it = allStackTraces.entrySet().iterator();
        int i13 = 0;
        int i14 = 0;
        while (it.hasNext()) {
            Map.Entry<Thread, StackTraceElement[]> next = it.next();
            i14 += i11;
            Thread key = next.getKey();
            StackTraceElement[] value = next.getValue();
            StringBuilder sb2 = new StringBuilder("\n");
            if (zJpo) {
                sb2.append("Thread Name is : " + key.getName());
                sb2.append("\n");
            }
            int length = value.length;
            String str2 = null;
            int i15 = 0;
            while (i15 < length) {
                int i16 = i11;
                String string = value[i15].toString();
                Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = it;
                if (zJpo) {
                    sb2.append(string + "\n");
                }
                if (TextUtils.isEmpty(str2)) {
                    if (jpo(string, jpo)) {
                        str = string;
                    } else {
                        str = string;
                        if (jpo(key.getName(), f19018jd)) {
                        }
                    }
                    i13++;
                    str2 = str;
                }
                i15++;
                it = it2;
                i11 = i16;
            }
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it3 = it;
            int i17 = i11;
            if (zJpo) {
                if (TextUtils.isEmpty(str2)) {
                    i10 = i17;
                } else {
                    StringBuilder sbT = b.t(str2, C3191e4.i.f36527c);
                    sbT.append(key.getName());
                    String string2 = sbT.toString();
                    jpo jpoVar = (jpo) map.get(string2);
                    if (jpoVar != null) {
                        jpoVar.jpo(jpoVar.jpo() + 1);
                        i10 = i17;
                    } else {
                        String string3 = sb2.toString();
                        String name = key.getName();
                        i10 = i17;
                        jpoVar = new jpo(string2, i10, string3, name);
                    }
                    map.put(string2, jpoVar);
                }
                if (!TextUtils.isEmpty(sb2.toString())) {
                    Log.e("PoolTaskStatistics", "Thread index = " + i14 + "   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    Log.w("PoolTaskStatistics", sb2.toString());
                }
            } else {
                i10 = i17;
            }
            i11 = i10;
            it = it3;
        }
        if (i13 > f19017cm) {
            f19017cm = i13;
        }
        if (zJpo) {
            StringBuilder sbT2 = p0.o2.t(i13, "SDK current threads=", ", SDK Max threads=");
            b.x(f19017cm, size, ", Application threads = ", ", Application max threads = ", sbT2);
            sbT2.append(my);
            Log.e("PoolTaskStatistics", sbT2.toString());
            Iterator it4 = map.entrySet().iterator();
            while (it4.hasNext()) {
                Log.i("PoolTaskStatistics", ((jpo) ((Map.Entry) it4.next()).getValue()).toString());
            }
        }
        wqxVarZz.jpo(new com.bytedance.sdk.component.xyk.jd.jpo(i13, f19017cm, size, my));
    }

    public static void jpo() {
        try {
            jd();
        } catch (Throwable unused) {
        }
    }

    private static boolean jpo(String str, String[] strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
