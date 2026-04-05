package u3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import z.b0;
import z.t1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f87811a = new b0(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f87812b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f87813c;

    /* renamed from: d, reason: collision with root package name */
    public static final t1 f87814d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new s());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f87812b = threadPoolExecutor;
        f87813c = new Object();
        f87814d = new t1();
    }

    public static String a(int i10, List list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb2.append(((g) list.get(i11)).f87798h);
            sb2.append("-");
            sb2.append(i10);
            if (i11 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    public static l b(Context context, List list, String str, int i10) {
        int i11;
        b0 b0Var = f87811a;
        d6.a.beginSection("getFontSync");
        try {
            Typeface typeface = (Typeface) b0Var.get(str);
            if (typeface != null) {
                return new l(typeface);
            }
            n nVarA = f.a(context, list, null);
            boolean z10 = true;
            if (nVarA.getStatusCode() != 0) {
                i11 = nVarA.getStatusCode() != 1 ? -3 : -2;
            } else {
                o[] fonts = nVarA.getFonts();
                if (fonts == null || fonts.length == 0) {
                    i11 = 1;
                } else {
                    int length = fonts.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length) {
                            i11 = 0;
                            break;
                        }
                        int resultCode = fonts[i12].getResultCode();
                        if (resultCode == 0) {
                            i12++;
                        } else if (resultCode >= 0) {
                            i11 = resultCode;
                        }
                    }
                }
            }
            if (i11 != 0) {
                return new l(i11);
            }
            if (nVarA.f87816b.size() <= 1) {
                z10 = false;
            }
            Typeface typefaceCreateFromFontInfo = (!z10 || Build.VERSION.SDK_INT < 29) ? o3.i.createFromFontInfo(context, null, nVarA.getFonts(), i10) : o3.i.createFromFontInfoWithFallback(context, null, nVarA.getFontsWithFallbacks(), i10);
            if (typefaceCreateFromFontInfo == null) {
                return new l(-3);
            }
            b0Var.put(str, typefaceCreateFromFontInfo);
            return new l(typefaceCreateFromFontInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            return new l(-1);
        } finally {
            d6.a.endSection();
        }
    }

    public static Typeface c(Context context, List list, int i10, Executor executor, androidx.localbroadcastmanager.content.b bVar) {
        String strA = a(i10, list);
        Typeface typeface = (Typeface) f87811a.get(strA);
        if (typeface != null) {
            ((Executor) bVar.f6757b).execute(new a((p) bVar.f6756a, typeface));
            return typeface;
        }
        i iVar = new i(bVar);
        synchronized (f87813c) {
            try {
                t1 t1Var = f87814d;
                ArrayList arrayList = (ArrayList) t1Var.get(strA);
                if (arrayList != null) {
                    arrayList.add(iVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(iVar);
                t1Var.put(strA, arrayList2);
                j jVar = new j(context, list, strA, i10);
                if (executor == null) {
                    executor = f87812b;
                }
                k kVar = new k(strA);
                Handler handler = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                v vVar = new v();
                vVar.f87827b = jVar;
                vVar.f87828c = kVar;
                vVar.f87829e = handler;
                executor.execute(vVar);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
