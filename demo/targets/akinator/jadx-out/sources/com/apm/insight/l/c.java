package com.apm.insight.l;

import android.os.Debug;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static a f13162a = new b(0);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {
        private a() {
        }

        public int a(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        public int b(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        public int c(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        public /* synthetic */ a(byte b10) {
            this();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends a {
        private b() {
            super((byte) 0);
        }

        @Override // com.apm.insight.l.c.a
        public final int a(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalPrivateClean();
        }

        @Override // com.apm.insight.l.c.a
        public final int b(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSharedClean();
        }

        @Override // com.apm.insight.l.c.a
        public final int c(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSwappablePss();
        }

        public /* synthetic */ b(byte b10) {
            this();
        }
    }

    public static int a(Debug.MemoryInfo memoryInfo) {
        return f13162a.a(memoryInfo);
    }

    public static int b(Debug.MemoryInfo memoryInfo) {
        return f13162a.b(memoryInfo);
    }

    public static int c(Debug.MemoryInfo memoryInfo) {
        return f13162a.c(memoryInfo);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.apm.insight.l.c$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static Long a(Map<? super String, Long> map, String str, Long l9) {
            if (str == null || map == null) {
                return -1L;
            }
            Long l10 = map.get(str);
            if (l10 != null) {
                l9 = Long.valueOf(l9.longValue() + l10.longValue());
            }
            map.put(str, l9);
            return l9;
        }

        public static Float a(Map<? super String, Float> map) {
            float fFloatValue = 0.0f;
            for (Float f10 : map.values()) {
                if (f10 != null) {
                    fFloatValue = f10.floatValue() + fFloatValue;
                }
            }
            return Float.valueOf(fFloatValue);
        }

        public static int a(Object obj, int i10) {
            if (obj != null) {
                if (obj instanceof Integer) {
                    return ((Integer) obj).intValue();
                }
                if (obj instanceof String) {
                    try {
                        return Integer.parseInt(String.valueOf(obj));
                    } catch (Throwable unused) {
                    }
                }
            }
            return i10;
        }
    }
}
