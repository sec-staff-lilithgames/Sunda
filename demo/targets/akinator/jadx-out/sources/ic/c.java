package ic;

import java.lang.ref.SoftReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f59453a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f59454b;

    static {
        boolean zEquals;
        try {
            zEquals = "true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers"));
        } catch (SecurityException unused) {
            zEquals = false;
        }
        f59453a = zEquals ? l0.instance() : null;
        f59454b = new ThreadLocal();
    }

    @Deprecated
    public static byte[] encodeAsUTF8(String str) {
        return cc.k.getInstance().encodeAsUTF8(str);
    }

    @Deprecated
    public static b getBufferRecycler() {
        ThreadLocal threadLocal = f59454b;
        SoftReference softReference = (SoftReference) threadLocal.get();
        b bVar = softReference == null ? null : (b) softReference.get();
        if (bVar == null) {
            bVar = new b();
            l0 l0Var = f59453a;
            threadLocal.set(l0Var != null ? l0Var.wrapAndTrack(bVar) : new SoftReference<>(bVar));
        }
        return bVar;
    }

    @Deprecated
    public static cc.k getJsonStringEncoder() {
        return cc.k.getInstance();
    }

    @Deprecated
    public static char[] quoteAsJsonText(String str) {
        return cc.k.getInstance().quoteAsString(str);
    }

    @Deprecated
    public static byte[] quoteAsJsonUTF8(String str) {
        return cc.k.getInstance().quoteAsUTF8(str);
    }

    public static int releaseBuffers() {
        l0 l0Var = f59453a;
        if (l0Var != null) {
            return l0Var.releaseBuffers();
        }
        return -1;
    }

    @Deprecated
    public static void quoteAsJsonText(CharSequence charSequence, StringBuilder sb2) {
        cc.k.getInstance().quoteAsString(charSequence, sb2);
    }
}
