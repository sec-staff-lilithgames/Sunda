package u3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import z.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class q {
    public static Typeface buildTypeface(Context context, CancellationSignal cancellationSignal, o[] oVarArr) {
        return o3.i.createFromFontInfo(context, cancellationSignal, oVarArr, 0);
    }

    public static n fetchFonts(Context context, CancellationSignal cancellationSignal, g gVar) throws PackageManager.NameNotFoundException {
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{gVar}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return f.a(context, Collections.unmodifiableList(arrayList), cancellationSignal);
    }

    @Deprecated
    public static Typeface getFontSync(Context context, g gVar, n3.n nVar, Handler handler, boolean z10, int i10, int i11) {
        o3.h hVar = new o3.h(nVar);
        Handler handler2 = n3.n.getHandler(handler);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{gVar}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return requestFont(context, (List<g>) Collections.unmodifiableList(arrayList), i11, z10, i10, handler2, hVar);
    }

    @Deprecated
    public static ProviderInfo getProvider(PackageManager packageManager, g gVar, Resources resources) throws PackageManager.NameNotFoundException {
        return f.b(packageManager, gVar, resources);
    }

    @Deprecated
    public static Map<Uri, ByteBuffer> prepareFontData(Context context, o[] oVarArr, CancellationSignal cancellationSignal) {
        return o3.u.readFontInfoIntoByteBuffer(context, oVarArr, cancellationSignal);
    }

    public static Typeface requestFont(Context context, g gVar, int i10, boolean z10, int i11, Handler handler, p pVar) {
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{gVar}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return requestFont(context, (List<g>) Collections.unmodifiableList(arrayList), i10, z10, i11, handler, pVar);
    }

    public static void requestFontWithFallbackChain(Context context, List<g> list, int i10, Executor executor, Executor executor2, p pVar) {
        m.c(context.getApplicationContext(), list, i10, executor, new androidx.localbroadcastmanager.content.b(pVar, executor2));
    }

    @Deprecated
    public static void resetCache() {
        m.f87811a.evictAll();
    }

    public static void resetTypefaceCache() {
        m.f87811a.evictAll();
    }

    @Deprecated
    public static void requestFont(Context context, g gVar, p pVar, Handler handler) {
        Handler handler2;
        if (Looper.myLooper() == null) {
            handler2 = new Handler(Looper.getMainLooper());
        } else {
            handler2 = new Handler();
        }
        androidx.localbroadcastmanager.content.b bVar = new androidx.localbroadcastmanager.content.b(pVar, new t(handler2));
        t tVar = new t(handler);
        Context applicationContext = context.getApplicationContext();
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{gVar}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m.c(applicationContext, Collections.unmodifiableList(arrayList), 0, tVar, bVar);
    }

    public static void requestFont(Context context, g gVar, int i10, Executor executor, Executor executor2, p pVar) {
        androidx.localbroadcastmanager.content.b bVar = new androidx.localbroadcastmanager.content.b(pVar, executor2);
        Context applicationContext = context.getApplicationContext();
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{gVar}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m.c(applicationContext, Collections.unmodifiableList(arrayList), i10, executor, bVar);
    }

    public static Typeface requestFont(Context context, List<g> list, int i10, boolean z10, int i11, Handler handler, p pVar) throws InterruptedException {
        t tVar = new t(handler);
        androidx.localbroadcastmanager.content.b bVar = new androidx.localbroadcastmanager.content.b(pVar, tVar);
        if (z10) {
            if (list.size() <= 1) {
                g gVar = list.get(0);
                b0 b0Var = m.f87811a;
                ArrayList arrayList = new ArrayList(1);
                Object obj = new Object[]{gVar}[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                String strA = m.a(i10, Collections.unmodifiableList(arrayList));
                Typeface typeface = (Typeface) m.f87811a.get(strA);
                if (typeface != null) {
                    tVar.execute(new a(pVar, typeface));
                    return typeface;
                }
                if (i11 == -1) {
                    ArrayList arrayList2 = new ArrayList(1);
                    Object obj2 = new Object[]{gVar}[0];
                    Objects.requireNonNull(obj2);
                    arrayList2.add(obj2);
                    l lVarB = m.b(context, Collections.unmodifiableList(arrayList2), strA, i10);
                    bVar.d(lVarB);
                    return lVarB.f87809a;
                }
                try {
                    try {
                        l lVar = (l) m.f87812b.submit(new h(strA, context, gVar, i10)).get(i11, TimeUnit.MILLISECONDS);
                        bVar.d(lVar);
                        return lVar.f87809a;
                    } catch (InterruptedException e10) {
                        throw e10;
                    } catch (ExecutionException e11) {
                        throw new RuntimeException(e11);
                    } catch (TimeoutException unused) {
                        throw new InterruptedException("timeout");
                    }
                } catch (InterruptedException unused2) {
                    ((Executor) bVar.f6757b).execute(new b((p) bVar.f6756a, -3));
                    return null;
                }
            }
            throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
        }
        return m.c(context, list, i10, null, bVar);
    }
}
