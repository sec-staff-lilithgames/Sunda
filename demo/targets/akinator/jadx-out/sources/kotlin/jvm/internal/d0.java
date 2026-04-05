package kotlin.jvm.internal;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import androidx.datastore.preferences.protobuf.y3;
import com.applovin.shadow.okio.Utf8;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mh.p1;
import wr.d5;
import wr.e5;
import xr.i6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class d0 implements com.google.android.play.core.splitinstall.internal.h {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f71824a;

    public static e5 A(e5 e5Var, wr.r0 r0Var, Object obj) {
        return e5Var == null ? new d5(r0Var, obj) : e5Var.put(r0Var, obj, r0Var.hashCode(), 0);
    }

    public static int F(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    public static int G(Object obj) {
        return F(obj == null ? 0 : obj.hashCode());
    }

    public static int H(Context context, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static float I(float f10, float f11, float f12, int i10) {
        return i10 > 0 ? (f12 / 2.0f) + f11 : f10;
    }

    public static boolean J(ClassLoader classLoader, File file, File file2, boolean z10, com.google.android.play.core.splitinstall.internal.l lVar, String str, com.google.android.play.core.splitinstall.internal.k kVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = new ArrayList();
        Object objZzc = com.google.android.play.core.splitinstall.internal.c0.zzb(classLoader, "pathList", Object.class).zzc();
        com.google.android.play.core.splitinstall.internal.a0 a0VarZza = com.google.android.play.core.splitinstall.internal.c0.zza(objZzc, "dexElements", Object.class);
        List listAsList = Arrays.asList((Object[]) a0VarZza.zzc());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList2.add((File) com.google.android.play.core.splitinstall.internal.c0.zzb(it.next(), str, File.class).zzc());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (!z10 && !kVar.zza(objZzc, file2, file)) {
            Log.w("SplitCompat", "Should be optimized ".concat(String.valueOf(file2.getPath())));
            return false;
        }
        a0VarZza.zza(Arrays.asList(lVar.zza(objZzc, new ArrayList(Collections.singleton(file2)), file, arrayList)));
        if (arrayList.isEmpty()) {
            return true;
        }
        com.google.android.play.core.splitinstall.internal.z zVar = new com.google.android.play.core.splitinstall.internal.z("DexPathList.makeDexElement failed");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            IOException iOException = (IOException) arrayList.get(i10);
            Log.e("SplitCompat", "DexPathList.makeDexElement failed", iOException);
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zVar, iOException);
            } catch (Exception unused) {
            }
        }
        com.google.android.play.core.splitinstall.internal.c0.zza(objZzc, "dexElementsSuppressedExceptions", IOException.class).zza(arrayList);
        throw zVar;
    }

    public static float a(float f10, int i10, float f11) {
        return (Math.max(0, i10 - 1) * f11) + f10;
    }

    public static float b(float f10, int i10, float f11) {
        return i10 > 0 ? (f11 / 2.0f) + f10 : f10;
    }

    public static double c(BigInteger bigInteger) {
        BigInteger bigIntegerAbs = bigInteger.abs();
        int iBitLength = bigIntegerAbs.bitLength();
        int i10 = iBitLength - 1;
        if (i10 < 63) {
            return bigInteger.longValue();
        }
        if (i10 > 1023) {
            return bigInteger.signum() * Double.POSITIVE_INFINITY;
        }
        int i11 = iBitLength - 54;
        long jLongValue = bigIntegerAbs.shiftRight(i11).longValue();
        long j10 = jLongValue >> 1;
        long j11 = 4503599627370495L & j10;
        if ((jLongValue & 1) != 0 && ((j10 & 1) != 0 || bigIntegerAbs.getLowestSetBit() < i11)) {
            j11++;
        }
        return Double.longBitsToDouble((((iBitLength + IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW) << 52) + j11) | (bigInteger.signum() & Long.MIN_VALUE));
    }

    public static boolean isFinite(double d10) {
        return Math.getExponent(d10) <= 1023;
    }

    public static IconCompat j(Icon icon) {
        w3.i.checkNotNull(icon);
        int iQ = q(icon);
        if (iQ == 2) {
            return IconCompat.createWithResource(null, o(icon), n(icon));
        }
        if (iQ == 4) {
            return IconCompat.createWithContentUri(r(icon));
        }
        if (iQ == 6) {
            return IconCompat.createWithAdaptiveBitmapContentUri(r(icon));
        }
        IconCompat iconCompat = new IconCompat(-1);
        iconCompat.f5751b = icon;
        return iconCompat;
    }

    public static String k(androidx.datastore.preferences.protobuf.x xVar) {
        y3 y3Var = new y3(xVar);
        StringBuilder sb2 = new StringBuilder(y3Var.size());
        for (int i10 = 0; i10 < y3Var.size(); i10++) {
            byte bByteAt = y3Var.byteAt(i10);
            if (bByteAt == 34) {
                sb2.append("\\\"");
            } else if (bByteAt == 39) {
                sb2.append("\\'");
            } else if (bByteAt != 92) {
                switch (bByteAt) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bByteAt < 32 || bByteAt > 126) {
                            sb2.append(AbstractJsonLexerKt.STRING_ESC);
                            sb2.append((char) (((bByteAt >>> 6) & 3) + 48));
                            sb2.append((char) (((bByteAt >>> 3) & 7) + 48));
                            sb2.append((char) ((bByteAt & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) bByteAt);
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static int n(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return e4.q.j(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon resource", e10);
            return 0;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon resource", e11);
            return 0;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon resource", e12);
            return 0;
        }
    }

    public static String o(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return e4.q.k(obj);
        }
        try {
            return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon package", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon package", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon package", e12);
            return null;
        }
    }

    public static long p(double d10) {
        p1.checkArgument(isFinite(d10), "not a normal value");
        int exponent = Math.getExponent(d10);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static int q(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return e4.q.t(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e10);
            return -1;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e11);
            return -1;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e12);
            return -1;
        }
    }

    public static Uri r(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return e4.q.u(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon uri", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon uri", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon uri", e12);
            return null;
        }
    }

    public static void s(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
        if (!v(b11)) {
            if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !v(b12) && !v(b13)) {
                int i11 = ((b10 & 7) << 18) | ((b11 & Utf8.REPLACEMENT_BYTE) << 12) | ((b12 & Utf8.REPLACEMENT_BYTE) << 6) | (b13 & Utf8.REPLACEMENT_BYTE);
                cArr[i10] = (char) ((i11 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                cArr[i10 + 1] = (char) ((i11 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + Utf8.LOG_SURROGATE_HEADER);
                return;
            }
        }
        throw new IllegalArgumentException("Invalid UTF-8");
    }

    public static void t(byte b10, byte b11, byte b12, char[] cArr, int i10) {
        if (v(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || v(b12)))) {
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & Utf8.REPLACEMENT_BYTE) << 6) | (b12 & Utf8.REPLACEMENT_BYTE));
    }

    public static void u(byte b10, byte b11, char[] cArr, int i10) {
        if (b10 < -62) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        }
        if (v(b11)) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
        }
        cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & Utf8.REPLACEMENT_BYTE));
    }

    public static boolean v(byte b10) {
        return b10 > -65;
    }

    public abstract void B(sh.s sVar, sh.s sVar2);

    public abstract void C(w2.h hVar, w2.h hVar2);

    public abstract void D(sh.s sVar, Thread thread);

    public abstract void E(w2.h hVar, Thread thread);

    public abstract boolean d(sh.k kVar, sh.h hVar, sh.h hVar2);

    public abstract boolean e(w2.i iVar, w2.d dVar, w2.d dVar2);

    public abstract boolean f(sh.t tVar, Object obj, Object obj2);

    public abstract boolean g(w2.i iVar, Object obj, Object obj2);

    public abstract boolean h(sh.t tVar, sh.s sVar, sh.s sVar2);

    public abstract boolean i(w2.i iVar, w2.h hVar, w2.h hVar2);

    public abstract sh.h l(sh.k kVar);

    public abstract sh.s m(sh.k kVar);

    public abstract void y(wr.g0 g0Var);

    public abstract void z(i6 i6Var);

    public void w(i6 i6Var) {
    }

    public void x(i6 i6Var) {
    }
}
