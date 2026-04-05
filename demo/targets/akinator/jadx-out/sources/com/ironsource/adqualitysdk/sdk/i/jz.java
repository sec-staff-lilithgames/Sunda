package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class jz {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static Map<c, Method> f3112 = null;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f3113 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f3114 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f3115;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c {

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static int f3116 = 1;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static long f3117 = -6255176130970394591L;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static int f3118;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private String f3119;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private Class f3120;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private List<Class> f3121;

        public c(Object obj, String str, List<Class> list) {
            if (obj instanceof Class) {
                this.f3120 = (Class) obj;
            } else {
                this.f3120 = obj.getClass();
            }
            this.f3119 = str;
            this.f3121 = list;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static String m3134(String str, int i10) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (j.f2852) {
                try {
                    j.f2850 = i10;
                    char[] cArr2 = new char[cArr.length];
                    j.f2851 = 0;
                    while (true) {
                        int i11 = j.f2851;
                        if (i11 < cArr.length) {
                            cArr2[i11] = (char) ((cArr[i11] ^ (j.f2850 * i11)) ^ f3117);
                            j.f2851++;
                        } else {
                            str2 = new String(cArr2);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }

        public final boolean equals(Object obj) {
            int i10 = f3118;
            int i11 = i10 + 69;
            f3116 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                int i12 = i10 + 91;
                f3116 = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 25 / 0;
                }
                return true;
            }
            if (obj != null) {
                f3116 = (i10 + 91) % 128;
                if (c.class == obj.getClass()) {
                    c cVar = (c) obj;
                    if (this.f3120.equals(cVar.f3120) && this.f3119.equals(cVar.f3119)) {
                        return this.f3121.equals(cVar.f3121);
                    }
                    return false;
                }
            }
            return false;
        }

        public final int hashCode() {
            f3118 = (f3116 + 51) % 128;
            int iHashCode = this.f3121.hashCode() + ((this.f3119.hashCode() + (this.f3120.hashCode() * 31)) * 31);
            f3116 = (f3118 + 77) % 128;
            return iHashCode;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(m3134("\ue06c䬉뛏\ue1ae䵺룄\ue3ab佟먯\ue5fd免밇\ue7c9务빸\ue9cc咊", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 43853).intern());
            sb2.append(m3134("\ue04c裟ㄡ\uda58䊀\ueb37鑳㲵ꗅ乹\uf6b8鿉ࡐ", 26801 - (ViewConfiguration.getEdgeSlop() >> 16)).intern());
            sb2.append(this.f3120);
            sb2.append(m3134("\ue00d⾨缞躗\udee0\uee18㶿䷑鴍겞ﳚఏ宨殉문", 53160 - Process.getGidForName("")).intern());
            sb2.append(this.f3119);
            sb2.append('\'');
            sb2.append(m3134("\ue00dﻶ\udda2벅鮏窕妨㢌៸\uf6fd헴듙鏆犗", 7927 - KeyEvent.getDeadChar(0, 0)).intern());
            sb2.append(this.f3121);
            sb2.append(AbstractJsonLexerKt.END_OBJ);
            String string = sb2.toString();
            int i10 = f3118 + 29;
            f3116 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 16 / 0;
            }
            return string;
        }
    }

    static {
        m3121();
        f3112 = new ConcurrentHashMap();
        f3113 = (f3114 + 51) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static Object m3115(Class cls, List<Object> list, Class... clsArr) throws Exception {
        f3113 = (f3114 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
        Object objNewInstance = cls.getConstructor(clsArr).newInstance(list.toArray());
        f3113 = (f3114 + 97) % 128;
        return objNewInstance;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m3121() {
        f3115 = 196;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Class m3124(String str, boolean z10) {
        f3113 = (f3114 + 65) % 128;
        try {
            Class<?> cls = Class.forName(str);
            f3114 = (f3113 + 17) % 128;
            return cls;
        } catch (Throwable th2) {
            if (!z10) {
                return null;
            }
            String strIntern = m3130(299 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 14 - ((byte) KeyEvent.getModifierMetaStateMask()), "\f￭\u0006\u0007\u0001\f\ufffb�\u0004\ufffe�￪\u000b\u0004\u0001", 12 - TextUtils.getCapsMode("", 0, 0), true).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m3130(285 - (ViewConfiguration.getFadingEdgeLength() >> 16), AndroidCharacter.getMirror('0') - '*', "￪ￇ\u001a\u001a\b\u0013", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), true).intern());
            sb2.append(str);
            sb2.append(m3130(290 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 10 - View.resolveSize(0, 0), "\u0006ￂ\u0010\u0011\u0016ￂ\b\u0011\u0017\u0010", Color.red(0) + 1, false).intern());
            co.m1955(strIntern, sb2.toString(), th2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.reflect.Method] */
    /* renamed from: ﾇ, reason: contains not printable characters */
    public static Method m3131(Object obj, String str, List<Class> list) throws NoSuchMethodException, SecurityException {
        int i10 = f3113 + 49;
        f3114 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                m3123(list);
                throw null;
            }
            Class<?>[] clsArrM3123 = m3123(list);
            if (!(obj instanceof Class)) {
                return obj.getClass().getMethod(str, clsArrM3123);
            }
            f3114 = (f3113 + 103) % 128;
            try {
                obj = ((Class) obj).getMethod(str, clsArrM3123);
                return obj;
            } catch (NoSuchMethodException unused) {
                return Class.class.getMethod(str, clsArrM3123);
            }
        } catch (NoSuchMethodException e10) {
            String strIntern = m3130((ViewConfiguration.getPressedStateDuration() >> 16) + 300, 15 - TextUtils.getOffsetBefore("", 0), "\f￭\u0006\u0007\u0001\f\ufffb�\u0004\ufffe�￪\u000b\u0004\u0001", TextUtils.getTrimmedLength("") + 12, true).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m3130(TextUtils.indexOf("", "") + 261, (Process.myPid() >> 22) + 4, "\uffdf.\r￦", MotionEvent.axisFromString("") + 4, true).intern());
            sb2.append(str);
            sb2.append(m3130((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 284, View.getDefaultSize(0, 0) + 19, "\f\uffc8\u000e\u0017\u001a\uffc8ￏ\uffc8\u0015\r\u001c\u0010\u0017\f\uffc8\u000e\u0017\u001d\u0016", 6 - (ViewConfiguration.getTouchSlop() >> 8), false).intern());
            sb2.append(obj);
            co.m1955(strIntern, sb2.toString(), e10);
            return null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static List<Class> m3116(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        f3114 = (f3113 + 35) % 128;
        for (Object obj : list) {
            if (obj != null) {
                int i10 = f3114 + 25;
                f3113 = i10 % 128;
                if (i10 % 2 != 0) {
                    arrayList.add(obj.getClass());
                    throw null;
                }
                arrayList.add(obj.getClass());
            } else {
                arrayList.add(Object.class);
            }
        }
        return arrayList;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static Object m3118(Class cls, List<Object> list) throws Exception {
        f3113 = (f3114 + 5) % 128;
        Object objNewInstance = m3125(cls, list).newInstance(list.toArray());
        int i10 = f3113 + 105;
        f3114 = i10 % 128;
        if (i10 % 2 != 0) {
            return objNewInstance;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Method m3120(Object obj, String str, List<Object> list) {
        int i10 = f3113 + 13;
        f3114 = i10 % 128;
        int i11 = i10 % 2;
        return m3119(obj.getClass(), str, list, false);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Method m3119(Class cls, String str, List<Object> list, boolean z10) throws SecurityException {
        Method[] methods;
        int length;
        int i10 = f3114 + 75;
        f3113 = i10 % 128;
        if (i10 % 2 != 0) {
            methods = cls.getMethods();
            length = methods.length;
        } else {
            methods = cls.getMethods();
            length = methods.length;
        }
        for (int i11 = 0; i11 < length; i11++) {
            Method method = methods[i11];
            if (method.getName().equals(str) && method.getParameterTypes().length == list.size()) {
                f3114 = (f3113 + 5) % 128;
                if (Modifier.isStatic(method.getModifiers()) == z10 && m3122(method, list)) {
                    return method;
                }
            }
        }
        return null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static Constructor m3125(Class cls, List<Object> list) throws SecurityException {
        Constructor<?>[] constructors = cls.getConstructors();
        int length = constructors.length;
        int i10 = 0;
        while (i10 < length) {
            Constructor<?> constructor = constructors[i10];
            if (constructor.getParameterTypes().length == list.size()) {
                f3114 = (f3113 + 37) % 128;
                if (m3128(constructor, list)) {
                    return constructor;
                }
            }
            i10++;
            f3113 = (f3114 + 81) % 128;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m3117(java.lang.Class[] r5, java.util.List<java.lang.Object> r6) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.jz.f3114
            int r0 = r0 + 93
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.jz.f3113 = r0
            r0 = 0
            r1 = r0
        La:
            int r2 = r5.length
            if (r1 >= r2) goto L3b
            java.lang.Object r2 = r6.get(r1)
            if (r2 != 0) goto L25
            int r3 = com.ironsource.adqualitysdk.sdk.i.jz.f3113
            int r3 = r3 + 11
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.jz.f3114 = r3
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r4 = r5[r1]
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 == 0) goto L2f
        L25:
            if (r2 == 0) goto L38
            r3 = r5[r1]
            boolean r2 = m3127(r3, r2)
            if (r2 != 0) goto L38
        L2f:
            int r5 = com.ironsource.adqualitysdk.sdk.i.jz.f3114
            int r5 = r5 + 75
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.jz.f3113 = r5
            return r0
        L38:
            int r1 = r1 + 1
            goto La
        L3b:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jz.m3117(java.lang.Class[], java.util.List):boolean");
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Method m3126(Object obj, String str, List<Object> list) throws SecurityException {
        Method methodM3120;
        c cVar = new c(obj, str, m3116(list));
        Method method = f3112.get(cVar);
        if (method != null) {
            if (m3117(method.getParameterTypes(), list)) {
                int i10 = f3114 + 47;
                f3113 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 23 / 0;
                }
                return method;
            }
            String strIntern = m3130(((Process.getThreadPriority(0) + 20) >> 6) + 300, 15 - (Process.myPid() >> 22), "\f￭\u0006\u0007\u0001\f\ufffb�\u0004\ufffe�￪\u000b\u0004\u0001", 12 - Color.alpha(0), true).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m3130(290 - View.resolveSizeAndState(0, 0, 0), 29 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\u000f\u0007\u0016\n\u0011\u0006ￂ\uffe7\u0014\u0014\u0011\u0014ￂ\t\u0007\u0016\u0016\u000b\u0010\tￂ\u0005\u0003\u0005\n\u0007\u0006ￂ", TextUtils.getCapsMode("", 0, 0) + 7, false).intern());
            sb2.append(cVar);
            co.m1955(strIntern, sb2.toString(), null);
        }
        if (obj instanceof Class) {
            methodM3120 = m3119((Class) obj, str, list, true);
            if (methodM3120 == null) {
                f3114 = (f3113 + 95) % 128;
                methodM3120 = m3120(Class.class, str, list);
            }
        } else {
            methodM3120 = m3120(obj, str, list);
        }
        if (methodM3120 != null) {
            f3112.put(cVar, methodM3120);
        }
        return methodM3120;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static Field[] m3133(Field[] fieldArr, Field[] fieldArr2) {
        f3114 = (f3113 + 97) % 128;
        int length = fieldArr.length;
        int length2 = fieldArr2.length;
        Field[] fieldArr3 = new Field[length + length2];
        System.arraycopy(fieldArr, 0, fieldArr3, 0, length);
        System.arraycopy(fieldArr2, 0, fieldArr3, length, length2);
        f3114 = (f3113 + 1) % 128;
        return fieldArr3;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m3122(Method method, List<Object> list) {
        int i10 = f3113 + 77;
        f3114 = i10 % 128;
        int i11 = i10 % 2;
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (i11 == 0) {
            m3117(parameterTypes, list);
            throw null;
        }
        boolean zM3117 = m3117(parameterTypes, list);
        f3114 = (f3113 + 103) % 128;
        return zM3117;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Class[] m3123(List<Class> list) {
        f3114 = (f3113 + 53) % 128;
        Class[] clsArr = new Class[list.size()];
        int i10 = 0;
        while (i10 < list.size()) {
            int i11 = f3114 + 21;
            f3113 = i11 % 128;
            if (i11 % 2 != 0) {
                clsArr[i10] = list.get(i10);
                i10 += 75;
            } else {
                clsArr[i10] = list.get(i10);
                i10++;
            }
        }
        return clsArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m3132(java.lang.Class r7, java.util.List<java.lang.String> r8) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.jz.f3113
            int r0 = r0 + 113
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.jz.f3114 = r0
            r1 = 0
            if (r7 == 0) goto Lf5
            r2 = 1
            if (r8 == 0) goto Lf4
            int r0 = r0 + 117
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.jz.f3113 = r0
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L1c
            goto Lf4
        L1c:
            java.util.Iterator r8 = r8.iterator()
        L20:
            boolean r0 = r8.hasNext()
            java.lang.String r3 = ""
            if (r0 == 0) goto L9e
            int r0 = com.ironsource.adqualitysdk.sdk.i.jz.f3113
            int r0 = r0 + 105
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.jz.f3114 = r0
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r4 = r0.equals(r3)
            if (r4 == 0) goto L6a
            java.lang.Package r4 = r7.getPackage()
            if (r4 == 0) goto L94
            int r4 = com.ironsource.adqualitysdk.sdk.i.jz.f3113
            int r4 = r4 + 111
            int r5 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.jz.f3114 = r5
            int r4 = r4 % 2
            if (r4 == 0) goto L5d
            java.lang.Package r4 = r7.getPackage()
            java.lang.String r4 = r4.getName()
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L94
            goto L6a
        L5d:
            java.lang.Package r7 = r7.getPackage()
            java.lang.String r7 = r7.getName()
            r7.equals(r3)
            r7 = 0
            throw r7
        L6a:
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L95
            int r3 = com.ironsource.adqualitysdk.sdk.i.jz.f3114
            int r3 = r3 + 11
            int r4 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.jz.f3113 = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L8a
            java.lang.String r3 = r7.getName()
            boolean r0 = r3.startsWith(r0)
            r3 = 99
            int r3 = r3 / r1
            if (r0 == 0) goto L95
            goto L94
        L8a:
            java.lang.String r3 = r7.getName()
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L95
        L94:
            return r2
        L95:
            int r0 = com.ironsource.adqualitysdk.sdk.i.jz.f3114
            int r0 = r0 + 13
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.jz.f3113 = r0
            goto L20
        L9e:
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.jz> r8 = com.ironsource.adqualitysdk.sdk.i.jz.class
            java.lang.String r0 = r8.getName()
            int r4 = android.view.ViewConfiguration.getTapTimeout()
            int r4 = r4 >> 16
            int r4 = r4 + 299
            int r5 = android.text.TextUtils.getOffsetAfter(r3, r1)
            int r5 = 24 - r5
            r6 = 48
            int r3 = android.text.TextUtils.lastIndexOf(r3, r6, r1)
            int r3 = r3 + 7
            java.lang.String r6 = "\u000e\ufffa\u0005\u0002\r\u0012￼\b\u0006ￇ\u0002\u000b\b\u0007\f\b\u000e\u000b￼\ufffeￇ\ufffa�\n"
            java.lang.String r3 = m3130(r4, r5, r6, r3, r1)
            java.lang.String r3 = r3.intern()
            boolean r0 = r0.startsWith(r3)
            if (r0 != 0) goto Lf5
            java.lang.Package r0 = r8.getPackage()
            if (r0 != 0) goto Ld6
            java.lang.Package r0 = r7.getPackage()
            if (r0 == 0) goto Lea
        Ld6:
            java.lang.Package r0 = r8.getPackage()
            if (r0 == 0) goto Lf3
            java.lang.Package r8 = r8.getPackage()
            java.lang.Package r7 = r7.getPackage()
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto Lf3
        Lea:
            int r7 = com.ironsource.adqualitysdk.sdk.i.jz.f3113
            int r7 = r7 + 85
            int r7 = r7 % 128
            com.ironsource.adqualitysdk.sdk.i.jz.f3114 = r7
            return r2
        Lf3:
            return r1
        Lf4:
            return r2
        Lf5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jz.m3132(java.lang.Class, java.util.List):boolean");
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean m3128(Constructor constructor, List<Object> list) {
        f3113 = (f3114 + 31) % 128;
        boolean zM3117 = m3117(constructor.getParameterTypes(), list);
        int i10 = f3113 + 29;
        f3114 = i10 % 128;
        if (i10 % 2 != 0) {
            return zM3117;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0192, code lost:
    
        if (r12.isAssignableFrom(java.lang.Boolean.class) != false) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0140  */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m3127(java.lang.Class r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jz.m3127(java.lang.Class, java.lang.Object):boolean");
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m3130(int i10, int i11, String str, int i12, boolean z10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (e.f2108) {
            try {
                char[] cArr2 = new char[i11];
                e.f2107 = 0;
                while (true) {
                    int i13 = e.f2107;
                    if (i13 >= i11) {
                        break;
                    }
                    e.f2110 = cArr[i13];
                    cArr2[e.f2107] = (char) (e.f2110 + i10);
                    int i14 = e.f2107;
                    cArr2[i14] = (char) (cArr2[i14] - f3115);
                    e.f2107 = i14 + 1;
                }
                if (i12 > 0) {
                    e.f2109 = i12;
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr2, 0, cArr3, 0, i11);
                    int i15 = e.f2109;
                    System.arraycopy(cArr3, 0, cArr2, i11 - i15, i15);
                    int i16 = e.f2109;
                    System.arraycopy(cArr3, i16, cArr2, 0, i11 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    e.f2107 = 0;
                    while (true) {
                        int i17 = e.f2107;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i11 - i17) - 1];
                        e.f2107 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Method[] m3129(Method[] methodArr, Method[] methodArr2) {
        f3113 = (f3114 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
        int length = methodArr.length;
        int length2 = methodArr2.length;
        Method[] methodArr3 = new Method[length + length2];
        System.arraycopy(methodArr, 0, methodArr3, 0, length);
        System.arraycopy(methodArr2, 0, methodArr3, length, length2);
        f3114 = (f3113 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
        return methodArr3;
    }
}
