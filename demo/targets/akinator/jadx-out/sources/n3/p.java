package n3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.TypedValue;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f75593a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f75594b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f75595c = new Object();

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface a(android.content.Context r13, int r14, android.util.TypedValue r15, int r16, n3.n r17, android.os.Handler r18, boolean r19, boolean r20) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.p.a(android.content.Context, int, android.util.TypedValue, int, n3.n, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }

    public static void clearCachesForTheme(Resources.Theme theme) {
        synchronized (f75595c) {
            try {
                Iterator it = f75594b.keySet().iterator();
                while (it.hasNext()) {
                    m mVar = (m) it.next();
                    if (mVar != null && theme.equals(mVar.f75592b)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Typeface getCachedFont(Context context, int i10) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return a(context, i10, new TypedValue(), 0, null, null, false, true);
    }

    public static int getColor(Resources resources, int i10, Resources.Theme theme) throws Resources.NotFoundException {
        return resources.getColor(i10, theme);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if (r4.f75590c == r9.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList getColorStateList(android.content.res.Resources r7, int r8, android.content.res.Resources.Theme r9) throws android.content.res.Resources.NotFoundException {
        /*
            n3.m r0 = new n3.m
            r0.<init>(r7, r9)
            java.lang.Object r1 = n3.p.f75595c
            monitor-enter(r1)
            java.util.WeakHashMap r2 = n3.p.f75594b     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L34
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.lang.Throwable -> L34
            r3 = 0
            if (r2 == 0) goto L48
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L34
            if (r4 <= 0) goto L48
            java.lang.Object r4 = r2.get(r8)     // Catch: java.lang.Throwable -> L34
            n3.l r4 = (n3.l) r4     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L48
            android.content.res.Configuration r5 = r4.f75589b     // Catch: java.lang.Throwable -> L34
            android.content.res.Configuration r6 = r7.getConfiguration()     // Catch: java.lang.Throwable -> L34
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L34
            if (r5 == 0) goto L45
            if (r9 != 0) goto L37
            int r5 = r4.f75590c     // Catch: java.lang.Throwable -> L34
            if (r5 == 0) goto L41
            goto L37
        L34:
            r7 = move-exception
            goto Lb0
        L37:
            if (r9 == 0) goto L45
            int r5 = r4.f75590c     // Catch: java.lang.Throwable -> L34
            int r6 = r9.hashCode()     // Catch: java.lang.Throwable -> L34
            if (r5 != r6) goto L45
        L41:
            android.content.res.ColorStateList r2 = r4.f75588a     // Catch: java.lang.Throwable -> L34
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            goto L4a
        L45:
            r2.remove(r8)     // Catch: java.lang.Throwable -> L34
        L48:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            r2 = r3
        L4a:
            if (r2 == 0) goto L4d
            return r2
        L4d:
            java.lang.ThreadLocal r1 = n3.p.f75593a
            java.lang.Object r2 = r1.get()
            android.util.TypedValue r2 = (android.util.TypedValue) r2
            if (r2 != 0) goto L5f
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r1.set(r2)
        L5f:
            r1 = 1
            r7.getValue(r8, r2, r1)
            int r1 = r2.type
            r2 = 28
            if (r1 < r2) goto L6e
            r2 = 31
            if (r1 > r2) goto L6e
            goto L7f
        L6e:
            android.content.res.XmlResourceParser r1 = r7.getXml(r8)
            android.content.res.ColorStateList r3 = n3.c.createFromXml(r7, r1, r9)     // Catch: java.lang.Exception -> L77
            goto L7f
        L77:
            r1 = move-exception
            java.lang.String r2 = "ResourcesCompat"
            java.lang.String r4 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r2, r4, r1)
        L7f:
            if (r3 == 0) goto Lab
            java.lang.Object r1 = n3.p.f75595c
            monitor-enter(r1)
            java.util.WeakHashMap r7 = n3.p.f75594b     // Catch: java.lang.Throwable -> L97
            java.lang.Object r2 = r7.get(r0)     // Catch: java.lang.Throwable -> L97
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.lang.Throwable -> L97
            if (r2 != 0) goto L99
            android.util.SparseArray r2 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L97
            r2.<init>()     // Catch: java.lang.Throwable -> L97
            r7.put(r0, r2)     // Catch: java.lang.Throwable -> L97
            goto L99
        L97:
            r7 = move-exception
            goto La9
        L99:
            n3.l r7 = new n3.l     // Catch: java.lang.Throwable -> L97
            android.content.res.Resources r0 = r0.f75591a     // Catch: java.lang.Throwable -> L97
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L97
            r7.<init>(r3, r0, r9)     // Catch: java.lang.Throwable -> L97
            r2.append(r8, r7)     // Catch: java.lang.Throwable -> L97
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L97
            return r3
        La9:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L97
            throw r7
        Lab:
            android.content.res.ColorStateList r7 = r7.getColorStateList(r8, r9)
            return r7
        Lb0:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.p.getColorStateList(android.content.res.Resources, int, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    public static Drawable getDrawable(Resources resources, int i10, Resources.Theme theme) throws Resources.NotFoundException {
        return resources.getDrawable(i10, theme);
    }

    public static Drawable getDrawableForDensity(Resources resources, int i10, int i11, Resources.Theme theme) throws Resources.NotFoundException {
        return resources.getDrawableForDensity(i10, i11, theme);
    }

    public static float getFloat(Resources resources, int i10) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 29) {
            return k.a(resources, i10);
        }
        ThreadLocal threadLocal = f75593a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i10, typedValue, true);
        if (typedValue.type == 4) {
            return typedValue.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i10) + " type #0x" + Integer.toHexString(typedValue.type) + " is not valid");
    }

    public static Typeface getFont(Context context, int i10) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return a(context, i10, new TypedValue(), 0, null, null, false, false);
    }

    public static void getFont(Context context, int i10, n nVar, Handler handler) throws Resources.NotFoundException {
        w3.i.checkNotNull(nVar);
        if (context.isRestricted()) {
            nVar.callbackFailAsync(-4, handler);
        } else {
            a(context, i10, new TypedValue(), 0, nVar, handler, false, false);
        }
    }

    public static Typeface getFont(Context context, int i10, TypedValue typedValue, int i11, n nVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return a(context, i10, typedValue, i11, nVar, null, true, false);
    }
}
