package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class jf {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static jf f2955;

    /* renamed from: ﾇ, reason: contains not printable characters */
    boolean f2956 = false;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private Set<jg> f2957 = new HashSet();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e extends jf {

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static boolean f2965 = true;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static int f2966 = 0;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static int f2967 = 1;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static char[] f2968 = {304, 306, 323, 312, 325, 328};

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static boolean f2969 = true;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static int f2970 = 207;

        /* renamed from: ｋ, reason: contains not printable characters */
        private Context f2971;

        public /* synthetic */ e(byte b10) {
            this();
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jf
        /* renamed from: ﻐ */
        public final boolean mo2971() {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f2971.getSystemService(m2980(null, (Process.myTid() >> 22) + 127, null, "\u0086\u0083\u0084\u0085\u0084\u0083\u0082\u0081").intern())).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                int i10 = f2967 + 41;
                f2966 = i10 % 128;
                return i10 % 2 != 0;
            }
            String packageName = this.f2971.getPackageName();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100) {
                    f2967 = (f2966 + 95) % 128;
                    if (runningAppProcessInfo.processName.equals(packageName)) {
                        f2967 = (f2966 + 105) % 128;
                        return true;
                    }
                }
            }
            int i11 = f2967 + 15;
            f2966 = i11 % 128;
            if (i11 % 2 == 0) {
                return false;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jf
        /* renamed from: ﻛ */
        public final Activity mo2972() {
            f2966 = (f2967 + 99) % 128;
            return null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jf
        /* renamed from: ｋ */
        public final synchronized void mo2974(Application application, Activity activity) {
            if (application == null) {
                if (activity != null) {
                    this.f2971 = activity.getApplicationContext();
                    f2966 = (f2967 + 101) % 128;
                }
            } else {
                int i10 = f2966 + 37;
                f2967 = i10 % 128;
                if (i10 % 2 != 0) {
                    this.f2971 = application.getApplicationContext();
                } else {
                    this.f2971 = application.getApplicationContext();
                    throw null;
                }
            }
        }

        private e() {
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static String m2980(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
            byte[] bytes = str2;
            if (str2 != null) {
                bytes = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr = bytes;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (m.f3159) {
                try {
                    char[] cArr2 = f2968;
                    int i11 = f2970;
                    if (f2965) {
                        int length = bArr.length;
                        m.f3157 = length;
                        char[] cArr3 = new char[length];
                        m.f3158 = 0;
                        while (m.f3158 < m.f3157) {
                            int i12 = m.f3158;
                            int i13 = m.f3157 - 1;
                            int i14 = m.f3158;
                            cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                            m.f3158 = i14 + 1;
                        }
                        return new String(cArr3);
                    }
                    if (f2969) {
                        int length2 = cArr.length;
                        m.f3157 = length2;
                        char[] cArr4 = new char[length2];
                        m.f3158 = 0;
                        while (m.f3158 < m.f3157) {
                            int i15 = m.f3158;
                            int i16 = m.f3157 - 1;
                            int i17 = m.f3158;
                            cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                            m.f3158 = i17 + 1;
                        }
                        return new String(cArr4);
                    }
                    int length3 = iArr.length;
                    m.f3157 = length3;
                    char[] cArr5 = new char[length3];
                    m.f3158 = 0;
                    while (m.f3158 < m.f3157) {
                        int i18 = m.f3158;
                        int i19 = m.f3157 - 1;
                        int i20 = m.f3158;
                        cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                        m.f3158 = i20 + 1;
                    }
                    return new String(cArr5);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized jf m2969() {
        try {
            if (f2955 == null) {
                f2955 = new c((byte) 0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f2955;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m2970(jg jgVar) {
        this.f2957.add(jgVar);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public abstract boolean mo2971();

    /* renamed from: ﻛ, reason: contains not printable characters */
    public abstract Activity mo2972();

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m2973(jg jgVar) {
        this.f2957.remove(jgVar);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public abstract void mo2974(Application application, Activity activity);

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized List<jg> m2975() {
        return new ArrayList(this.f2957);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c extends jf implements Application.ActivityLifecycleCallbacks {

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static int f2958 = 1;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static int f2959;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static char[] f2960 = {'#', GMTDateParser.YEAR, GMTDateParser.MINUTES, GMTDateParser.HOURS, 'a', 'f', AbstractJsonLexerKt.STRING_ESC, 'Z', 'g', 'e', GMTDateParser.DAY_OF_MONTH, 'n', 'n', 'g', GMTDateParser.HOURS, 'X', 'Z', 'n', GMTDateParser.SECONDS, 'l', 'i', 'i', 'k', 'b', AbstractJsonLexerKt.STRING_ESC, 'k', 't', 'o', 'f', GMTDateParser.DAY_OF_MONTH, 129, 281, 304, 302, 302, 263, 258, 297, 261, 261, 300, 277, 272, 297, 300, 301, 301, 300, 308, 291, 281, 298, 306, 303, 295, 290, '2', GMTDateParser.DAY_OF_MONTH, 'l', 't', 'k', 'X', GMTDateParser.DAY_OF_MONTH, 'v', 'n', 'o', 'o', 'n', 'k', 'R', 'W', 'n', 'G', 'G', 'k', 'D', 'I', 'p', 'p', 'r', AbstractJsonLexerKt.BEGIN_LIST, '2', 'k', 'Z', '^', 'v', 'n', 'o', 'o', 'n', 'k', 'R', 'W', 'n', 'G', 'G', 'k', 'D', 'I', 'p', 'p', 'r', AbstractJsonLexerKt.BEGIN_LIST, 'T', GMTDateParser.DAY_OF_MONTH, 'l', 'j', '<', 'v', 'n', 'o', 'o', 'n', 'k', 'R', AbstractJsonLexerKt.END_LIST, 'x', GMTDateParser.SECONDS, 'p', 'a', 'a', 'k', 'o', GMTDateParser.MINUTES, 'f', '^', GMTDateParser.DAY_OF_MONTH, 'v', 'n', 'k', 'a', 'A', 'P', 'k', 'o', GMTDateParser.MINUTES, 'f', 'n', 'O', 'I', 'K', 'V', 'v', 'n', 'k', 'q', 'Q', GMTDateParser.MONTH, 'n', 'i', '2', GMTDateParser.DAY_OF_MONTH, 'l', GMTDateParser.SECONDS, 'i', 'j', 'c', 'f', 'v', 'n', 'o', 'o', 'n', 'k', 'R', 'W', 'n', 'G', 'G', 'k', 'D', 'I', 'p', 'p', 'r', AbstractJsonLexerKt.BEGIN_LIST, 'F', 141, 147, 153, 152, 154, 140, 143, 159, 151, 152, 152, 151, 148, AbstractJsonLexerKt.BEGIN_OBJ, 128, 151, 'p', 'p', 148, GMTDateParser.MINUTES, 'r', 153, 153, 155, 132, AbstractJsonLexerKt.STRING, AbstractJsonLexerKt.BEGIN_LIST, 'r', 'p', 'p', 'I', 'D', 'k', 'G', 'G', 'n', 'W', 'R', 'k', 'n', 'o', 'o', 'n', 'v', 'f', 'Z', 'k', GMTDateParser.MINUTES, 'W', AbstractJsonLexerKt.BEGIN_LIST, 'p', GMTDateParser.SECONDS, 'j', 'g', GMTDateParser.HOURS, GMTDateParser.DAY_OF_MONTH, AbstractJsonLexerKt.STRING_ESC, 'c', 'j', 'j', 'l', AbstractJsonLexerKt.STRING, AbstractJsonLexerKt.BEGIN_LIST, 'r', 'p', 'p', 'I', 'D', 'k', 'G', 'G', 'n', 'W', 'R', 'k', 'n', 'o', 'o', 'n', 'v', '^', 'T', 'l', GMTDateParser.SECONDS, GMTDateParser.SECONDS, 'p', 't', 'o', GMTDateParser.DAY_OF_MONTH};

        /* renamed from: ﻐ, reason: contains not printable characters */
        private WeakReference<Activity> f2961;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private Map<Activity, Boolean> f2962;

        /* renamed from: ｋ, reason: contains not printable characters */
        private WeakReference<Application> f2963;

        private c() {
            this.f2962 = new WeakHashMap();
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private void m2979(Activity activity) {
            f2959 = (f2958 + 53) % 128;
            Iterator<jg> it = m2975().iterator();
            while (it.hasNext()) {
                int i10 = f2959 + 51;
                f2958 = i10 % 128;
                if (i10 % 2 == 0) {
                    it.next().mo767(activity);
                    throw null;
                }
                it.next().mo767(activity);
            }
            int i11 = f2959 + 69;
            f2958 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            try {
                synchronized (jf.class) {
                    try {
                        if (this.f2961 == null) {
                            m2978(activity);
                            jf.class.notifyAll();
                        }
                    } finally {
                    }
                }
                Iterator<jg> it = m2975().iterator();
                while (it.hasNext()) {
                    it.next().onActivityCreated(activity, bundle);
                }
            } catch (Exception e10) {
                kd.m3203(m2977("\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000", false, new int[]{0, 30, 0, 0}).intern(), m2977("\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001", true, new int[]{81, 26, 0, 22}).intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            f2958 = (f2959 + 29) % 128;
            try {
                Iterator<jg> it = m2975().iterator();
                while (it.hasNext()) {
                    it.next().onActivityDestroyed(activity);
                    f2958 = (f2959 + 25) % 128;
                }
            } catch (Exception e10) {
                kd.m3203(m2977("\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000", false, new int[]{0, 30, 0, 0}).intern(), m2977("\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", false, new int[]{238, 28, 0, 0}).intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            try {
                Iterator<jg> it = m2975().iterator();
                while (it.hasNext()) {
                    f2959 = (f2958 + 1) % 128;
                    it.next().onActivityPaused(activity);
                    f2959 = (f2958 + 111) % 128;
                }
                f2959 = (f2958 + 75) % 128;
            } catch (Exception e10) {
                kd.m3203(m2977("\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000", false, new int[]{0, 30, 0, 0}).intern(), m2977("\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001", true, new int[]{56, 25, 0, 0}).intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            try {
                m2978(activity);
                Iterator<jg> it = m2975().iterator();
                f2959 = (f2958 + 59) % 128;
                while (it.hasNext()) {
                    f2958 = (f2959 + 19) % 128;
                    it.next().onActivityResumed(activity);
                }
            } catch (Exception e10) {
                kd.m3203(m2977("\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000", false, new int[]{0, 30, 0, 0}).intern(), m2977("\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001", false, new int[]{30, 26, 190, 0}).intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            try {
                Iterator<jg> it = m2975().iterator();
                while (it.hasNext()) {
                    f2958 = (f2959 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
                    it.next().onActivitySaveInstanceState(activity, bundle);
                    f2958 = (f2959 + 61) % 128;
                }
            } catch (Exception e10) {
                kd.m3203(m2977("\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000", false, new int[]{0, 30, 0, 0}).intern(), m2977("\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001", false, new int[]{202, 36, 0, 0}).intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            try {
                if (this.f2961 == null) {
                    m2978(activity);
                }
                synchronized (this) {
                    this.f2962.put(activity, Boolean.TRUE);
                }
                Iterator<jg> it = m2975().iterator();
                while (it.hasNext()) {
                    it.next().onActivityStarted(activity);
                }
                if (activity.getLocalClassName().equals(m2977("\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000", true, new int[]{107, 43, 0, 0}).intern())) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f2962.size() == 1 && !this.f2956) {
                            m2976(activity);
                        }
                    } finally {
                    }
                }
            } catch (Exception e10) {
                kd.m3203(m2977("\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000", false, new int[]{0, 30, 0, 0}).intern(), m2977("\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001", true, new int[]{150, 26, 0, 0}).intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            int size;
            try {
                Iterator<jg> it = m2975().iterator();
                while (it.hasNext()) {
                    it.next().onActivityStopped(activity);
                }
                this.f2956 = activity.isChangingConfigurations();
                synchronized (this) {
                    try {
                        if (!this.f2962.containsKey(activity) || activity.getLocalClassName().equals(m2977("\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000", true, new int[]{107, 43, 0, 0}).intern())) {
                            size = -1;
                        } else {
                            this.f2962.remove(activity);
                            size = this.f2962.size();
                        }
                    } finally {
                    }
                }
                if (size < 0 || size != 0 || this.f2956) {
                    return;
                }
                m2979(activity);
            } catch (Exception e10) {
                kd.m3203(m2977("\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000", false, new int[]{0, 30, 0, 0}).intern(), m2977("\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001", true, new int[]{176, 26, 41, 0}).intern(), e10, false);
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jf
        /* renamed from: ﻐ */
        public final synchronized boolean mo2971() {
            f2958 = (f2959 + 67) % 128;
            if (this.f2962.size() <= 0) {
                return false;
            }
            int i10 = (f2958 + 111) % 128;
            f2959 = i10;
            f2958 = (i10 + 41) % 128;
            return true;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jf
        /* renamed from: ﻛ */
        public final Activity mo2972() {
            int i10 = f2958;
            f2959 = (i10 + 67) % 128;
            WeakReference<Activity> weakReference = this.f2961;
            if (weakReference == null) {
                return null;
            }
            f2959 = (i10 + 105) % 128;
            return weakReference.get();
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jf
        /* renamed from: ｋ */
        public final synchronized void mo2974(Application application, Activity activity) {
            try {
                if (this.f2963 == null) {
                    this.f2963 = new WeakReference<>(application);
                    if (activity != null) {
                        m2978(activity);
                        synchronized (this) {
                            this.f2962.put(activity, Boolean.TRUE);
                        }
                    }
                    application.registerActivityLifecycleCallbacks(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public /* synthetic */ c(byte b10) {
            this();
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private void m2976(Activity activity) {
            Iterator<jg> it = m2975().iterator();
            f2959 = (f2958 + 31) % 128;
            while (it.hasNext()) {
                f2959 = (f2958 + 65) % 128;
                it.next().mo768(activity);
                f2958 = (f2959 + 59) % 128;
            }
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private void m2978(final Activity activity) {
            this.f2961 = new WeakReference<>(activity);
            p.m3247(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jf.c.2
                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* renamed from: ﻐ */
                public final void mo590() throws Exception {
                    ju.m3075(activity);
                }
            });
            int i10 = f2958 + 11;
            f2959 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 4 / 0;
            }
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private static String m2977(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
            String str2;
            byte[] bytes = str;
            if (str != null) {
                bytes = str.getBytes("ISO-8859-1");
            }
            byte[] bArr = bytes;
            synchronized (g.f2307) {
                try {
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    int i12 = iArr[2];
                    int i13 = iArr[3];
                    char[] cArr = new char[i11];
                    System.arraycopy(f2960, i10, cArr, 0, i11);
                    if (bArr != null) {
                        char[] cArr2 = new char[i11];
                        g.f2306 = 0;
                        char c10 = 0;
                        while (true) {
                            int i14 = g.f2306;
                            if (i14 >= i11) {
                                break;
                            }
                            if (bArr[i14] == 1) {
                                cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                            } else {
                                cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                            }
                            c10 = cArr2[i14];
                            g.f2306 = i14 + 1;
                        }
                        cArr = cArr2;
                    }
                    if (i13 > 0) {
                        char[] cArr3 = new char[i11];
                        System.arraycopy(cArr, 0, cArr3, 0, i11);
                        int i15 = i11 - i13;
                        System.arraycopy(cArr3, 0, cArr, i15, i13);
                        System.arraycopy(cArr3, i13, cArr, 0, i15);
                    }
                    if (z10) {
                        char[] cArr4 = new char[i11];
                        g.f2306 = 0;
                        while (true) {
                            int i16 = g.f2306;
                            if (i16 >= i11) {
                                break;
                            }
                            cArr4[i16] = cArr[(i11 - i16) - 1];
                            g.f2306 = i16 + 1;
                        }
                        cArr = cArr4;
                    }
                    if (i12 > 0) {
                        g.f2306 = 0;
                        while (true) {
                            int i17 = g.f2306;
                            if (i17 >= i11) {
                                break;
                            }
                            cArr[i17] = (char) (cArr[i17] - iArr[2]);
                            g.f2306 = i17 + 1;
                        }
                    }
                    str2 = new String(cArr);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }
    }
}
