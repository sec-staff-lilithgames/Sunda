package i;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import kotlinx.serialization.json.JsonElementSerializer;
import o5.j2;
import p0.d0;
import qv.v;
import tu.x0;
import uu.o1;
import uu.q0;
import z5.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements kv.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f59277b;

    public /* synthetic */ f(int i10) {
        this.f59277b = i10;
    }

    @Override // kv.a
    public final Object invoke() {
        Class<?> returnType;
        int i10 = this.f59277b;
        x0 x0Var = x0.f87415a;
        switch (i10) {
            case 0:
                int i11 = g.f59278h;
                return Integer.valueOf(ov.g.f79860b.nextInt(2147418112) + C.DEFAULT_BUFFER_SEGMENT_SIZE);
            case 1:
                StringBuilder sb2 = new StringBuilder("Must be called on a background thread, was called on ");
                ii.g.f59612d.getClass();
                sb2.append(Thread.currentThread().getName());
                sb2.append('.');
                return sb2.toString();
            case 2:
                StringBuilder sb3 = new StringBuilder("Must not be called on a main thread, was called on ");
                ii.g.f59612d.getClass();
                sb3.append(Thread.currentThread().getName());
                sb3.append('.');
                return sb3.toString();
            case 3:
                StringBuilder sb4 = new StringBuilder("Must be called on a blocking thread, was called on ");
                ii.g.f59612d.getClass();
                sb4.append(Thread.currentThread().getName());
                sb4.append('.');
                return sb4.toString();
            case 4:
                return DebugProbesImpl.startWeakRefCleanerThread$lambda$2();
            case 5:
                return JsonElementSerializer.descriptor$lambda$5$lambda$0();
            case 6:
                return JsonElementSerializer.descriptor$lambda$5$lambda$1();
            case 7:
                return JsonElementSerializer.descriptor$lambda$5$lambda$2();
            case 8:
                return JsonElementSerializer.descriptor$lambda$5$lambda$3();
            case 9:
                return JsonElementSerializer.descriptor$lambda$5$lambda$4();
            case 10:
                j2.a aVar = j2.f77597l;
                return x0Var;
            case 11:
                j2.a aVar2 = j2.f77597l;
                return Boolean.TRUE;
            case 12:
                d0.composeRuntimeError("Unexpected call to default provider");
                throw new tu.k();
            case 13:
                cv.a entries = sv.d.getEntries();
                LinkedHashMap linkedHashMap = new LinkedHashMap(v.coerceAtLeast(o1.mapCapacity(q0.collectionSizeOrDefault(entries, 10)), 16));
                for (Object obj : entries) {
                    linkedHashMap.put(Integer.valueOf(((sv.d) obj).f86132b), obj);
                }
                return linkedHashMap;
            case 14:
                int i12 = w5.a.f90378i;
                return x0Var;
            case 15:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 16:
                c.a aVar3 = z5.c.f97534c;
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            default:
                try {
                    Method methodAccess$getGetThreadSessionMethod = c.a.access$getGetThreadSessionMethod(z5.c.f97534c);
                    if (methodAccess$getGetThreadSessionMethod == null || (returnType = methodAccess$getGetThreadSessionMethod.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
        }
    }
}
