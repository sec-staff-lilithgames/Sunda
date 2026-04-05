package jh;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.media.ThumbnailUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import b0.e2;
import com.applovin.impl.ga;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.Utf8;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.messaging.c0;
import com.google.firebase.messaging.v;
import com.ironsource.mediationsdk.logger.IronSourceError;
import du.t2;
import j1.o2;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import mh.p1;
import mt.i0;
import mt.t0;
import mt.y;
import nh.ei;
import nh.fi;
import nh.gi;
import nh.oi;
import nh.pi;
import nh.si;
import q.u1;
import sh.z;
import ut.o0;
import v4.c;
import zt.j4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class i implements u1 {

    /* renamed from: b, reason: collision with root package name */
    public static SharedPreferences f69550b;

    public static void A(v4.b bVar, c.a aVar, int i10) throws IOException {
        byte[] bArr = new byte[Segment.SIZE];
        while (i10 > 0) {
            int iMin = Math.min(i10, Segment.SIZE);
            int i11 = bVar.read(bArr, 0, iMin);
            if (i11 != iMin) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i10 -= i11;
            aVar.write(bArr, 0, i11);
        }
    }

    public static Set C() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static SharedPreferences D(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static SharedPreferences E(Context context) {
        if (f69550b == null) {
            f69550b = context.getSharedPreferences("BidMachinePref", 0);
        }
        return f69550b;
    }

    public static boolean I(byte b10) {
        return b10 > -65;
    }

    public static gi J(List list, Object obj) {
        return list instanceof RandomAccess ? new oi(list, obj) : new gi(list, obj);
    }

    public static void K(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static void N(Context context, v vVar, boolean z10) {
        if (PlatformVersion.isAtLeastQ()) {
            SharedPreferences sharedPreferencesD = D(context);
            if (sharedPreferencesD.contains("proxy_retention") && sharedPreferencesD.getBoolean("proxy_retention", false) == z10) {
                return;
            }
            vVar.f29894c.setRetainProxiedNotifications(z10).addOnSuccessListener(new ga(2), new c0(context, 0, z10));
        }
    }

    public static boolean P(Object obj, st.o oVar, mt.f fVar) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) obj).call();
            mt.i iVar = objCall != null ? (mt.i) o0.requireNonNull(oVar.apply(objCall), "The mapper returned a null CompletableSource") : null;
            if (iVar == null) {
                tt.e.complete(fVar);
            } else {
                iVar.subscribe(fVar);
            }
            return true;
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            tt.e.error(th2, fVar);
            return true;
        }
    }

    public static boolean Q(Object obj, st.o oVar, i0 i0Var) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) obj).call();
            y yVar = objCall != null ? (y) o0.requireNonNull(oVar.apply(objCall), "The mapper returned a null MaybeSource") : null;
            if (yVar == null) {
                tt.e.complete(i0Var);
            } else {
                yVar.subscribe(j4.create(i0Var));
            }
            return true;
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            tt.e.error(th2, i0Var);
            return true;
        }
    }

    public static boolean R(Object obj, st.o oVar, i0 i0Var) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) obj).call();
            t0 t0Var = objCall != null ? (t0) o0.requireNonNull(oVar.apply(objCall), "The mapper returned a null SingleSource") : null;
            if (t0Var == null) {
                tt.e.complete(i0Var);
            } else {
                t0Var.subscribe(t2.create(i0Var));
            }
            return true;
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            tt.e.error(th2, i0Var);
            return true;
        }
    }

    public static void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws androidx.datastore.preferences.protobuf.u1 {
        if (!I(b11)) {
            if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !I(b12) && !I(b13)) {
                int i11 = ((b10 & 7) << 18) | ((b11 & Utf8.REPLACEMENT_BYTE) << 12) | ((b12 & Utf8.REPLACEMENT_BYTE) << 6) | (b13 & Utf8.REPLACEMENT_BYTE);
                cArr[i10] = (char) ((i11 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                cArr[i10 + 1] = (char) ((i11 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + Utf8.LOG_SURROGATE_HEADER);
                return;
            }
        }
        throw androidx.datastore.preferences.protobuf.u1.c();
    }

    public static pi b(Set set, Object obj) {
        return set instanceof SortedSet ? new si((SortedSet) set, obj) : new pi(set, obj);
    }

    public static ei c(Object obj, Collection collection) {
        return collection instanceof SortedSet ? new si((SortedSet) collection, obj) : collection instanceof Set ? new pi((Set) collection, obj) : collection instanceof List ? J((List) collection, obj) : new ei(collection, obj);
    }

    public static fi d(Map.Entry entry, Object obj) {
        if (entry == null) {
            return null;
        }
        return new fi(entry, obj);
    }

    public static void e(byte b10, byte b11, char[] cArr, int i10) throws androidx.datastore.preferences.protobuf.u1 {
        if (b10 < -62 || I(b11)) {
            throw androidx.datastore.preferences.protobuf.u1.c();
        }
        cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & Utf8.REPLACEMENT_BYTE));
    }

    public static void f(byte b10, byte b11, byte b12, char[] cArr, int i10) throws androidx.datastore.preferences.protobuf.u1 {
        if (I(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || I(b12)))) {
            throw androidx.datastore.preferences.protobuf.u1.c();
        }
        cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & Utf8.REPLACEMENT_BYTE) << 6) | (b12 & Utf8.REPLACEMENT_BYTE));
    }

    public static String g(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            sb2.append(String.format("%02x", Byte.valueOf(b10)));
        }
        return sb2.toString();
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0033: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:52), block:B:15:0x0033 */
    public static File h(File file, String str) throws Throwable {
        InputStream inputStreamT;
        Closeable closeable;
        Closeable closeable2 = null;
        try {
            try {
                inputStreamT = kc.p.t(str);
                try {
                    File file2 = new File(file, nm.j.generateFileName(str));
                    if (file2.exists() && file2.length() > 0) {
                        if (ThumbnailUtils.createVideoThumbnail(file2.getPath(), 1) != null) {
                            nm.j.close(inputStreamT);
                            return file2;
                        }
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i10 = inputStreamT.read(bArr);
                        if (i10 <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i10);
                    }
                    nm.j.close(fileOutputStream);
                    if (ThumbnailUtils.createVideoThumbnail(file2.getPath(), 1) != null) {
                        nm.j.close(inputStreamT);
                        return file2;
                    }
                    nm.j.close(inputStreamT);
                    return null;
                } catch (Exception e10) {
                    e = e10;
                    nm.a.w(e);
                    nm.j.close(inputStreamT);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                closeable2 = closeable;
                nm.j.close(closeable2);
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            inputStreamT = null;
        } catch (Throwable th3) {
            th = th3;
            nm.j.close(closeable2);
            throw th;
        }
    }

    public static void i(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(o2.j(obj2, "null key in entry: null="));
        }
        if (obj2 == null) {
            throw new NullPointerException(o2.k(obj, "null value in entry: ", "=null"));
        }
    }

    public static void j(boolean z10, double d10, RoundingMode roundingMode) {
        if (z10) {
            return;
        }
        throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + roundingMode);
    }

    public static void k(int i10, int i11, boolean z10) {
        if (!z10) {
            throw new ArithmeticException(p0.o2.i(i10, i11, "overflow: checkedPow(", ", ", ")"));
        }
    }

    public static void l(long j10, long j11, boolean z10) {
        if (!z10) {
            throw new ArithmeticException(a.b.g(j11, ")", e2.r(j10, "overflow: checkedPow(", ", ")));
        }
    }

    public static void m(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + i10 + ") must be >= 0");
    }

    public static void n(long j10, String str) {
        if (j10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j10 + ") must be >= 0");
    }

    public static void o(int i10, String str) {
        if (i10 < 0) {
            throw new IllegalArgumentException(o2.g(i10, str, " cannot be negative but was: "));
        }
    }

    public static void p(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(p0.o2.m(j10, "distance cannot be negative but was: "));
        }
    }

    public static void q(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(p0.o2.k(i10, "x (", ") must be > 0"));
        }
    }

    public static void r(long j10) {
        if (j10 <= 0) {
            throw new IllegalArgumentException(p0.o2.n(j10, "x (", ") must be > 0"));
        }
    }

    public static void s(BigInteger bigInteger) {
        if (bigInteger.signum() > 0) {
            return;
        }
        throw new IllegalArgumentException("x (" + bigInteger + ") must be > 0");
    }

    public static void t(boolean z10) {
        p1.checkState(z10, "no calls to next() since the last call to remove()");
    }

    public static void u(boolean z10) {
        if (!z10) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static void v(FileDescriptor fileDescriptor) {
        try {
            v4.h.a(fileDescriptor);
        } catch (Exception unused) {
            Log.e("ExifInterfaceUtils", "Error closing fd.");
        }
    }

    public static void w(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] y(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            jArr[i10] = iArr[i10];
        }
        return jArr;
    }

    public static void z(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[Segment.SIZE];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }

    public abstract int B(z zVar);

    public abstract int F(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int G();

    public abstract ViewPropertyAnimator H(int i10, View view);

    public abstract void L(Rect rect);

    public abstract void M(View view, int i10, int i11);

    public abstract void O(int i10, View view);

    public abstract void x(z zVar, Set set);
}
