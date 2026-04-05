package sh;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class r extends kotlin.jvm.internal.d0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Unsafe f85846b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f85847c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f85848d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f85849e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f85850f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f85851g;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e10) {
                throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new q());
        }
        try {
            f85848d = unsafe.objectFieldOffset(t.class.getDeclaredField("e"));
            f85847c = unsafe.objectFieldOffset(t.class.getDeclaredField(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM));
            f85849e = unsafe.objectFieldOffset(t.class.getDeclaredField(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B));
            f85850f = unsafe.objectFieldOffset(s.class.getDeclaredField("a"));
            f85851g = unsafe.objectFieldOffset(s.class.getDeclaredField(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B));
            f85846b = unsafe;
        } catch (NoSuchFieldException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static /* synthetic */ Unsafe K() throws IllegalAccessException, SecurityException, IllegalArgumentException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override // kotlin.jvm.internal.d0
    public final void B(s sVar, s sVar2) {
        f85846b.putObject(sVar, f85851g, sVar2);
    }

    @Override // kotlin.jvm.internal.d0
    public final void D(s sVar, Thread thread) {
        f85846b.putObject(sVar, f85850f, thread);
    }

    @Override // kotlin.jvm.internal.d0
    public final boolean d(k kVar, h hVar, h hVar2) {
        return n.a(f85846b, kVar, f85847c, hVar, hVar2);
    }

    @Override // kotlin.jvm.internal.d0
    public final boolean f(t tVar, Object obj, Object obj2) {
        return o.a(f85846b, tVar, f85849e, obj, obj2);
    }

    @Override // kotlin.jvm.internal.d0
    public final boolean h(t tVar, s sVar, s sVar2) {
        return p.a(f85846b, tVar, f85848d, sVar, sVar2);
    }

    @Override // kotlin.jvm.internal.d0
    public final h l(k kVar) {
        h hVar;
        h hVar2 = h.f85813d;
        do {
            hVar = kVar.f85863c;
            if (hVar2 == hVar) {
                break;
            }
        } while (!d(kVar, hVar, hVar2));
        return hVar;
    }

    @Override // kotlin.jvm.internal.d0
    public final s m(k kVar) {
        s sVar;
        s sVar2 = s.f85854c;
        do {
            sVar = kVar.f85864e;
            if (sVar2 == sVar) {
                break;
            }
        } while (!h(kVar, sVar, sVar2));
        return sVar;
    }
}
