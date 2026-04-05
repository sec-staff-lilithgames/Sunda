package jh;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.splitinstall.internal.n0;
import com.google.android.play.core.splitinstall.internal.o0;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class p extends n0 {

    /* renamed from: j, reason: collision with root package name */
    public static p f69566j;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f69567g;

    /* renamed from: h, reason: collision with root package name */
    public final e f69568h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashSet f69569i;

    public p(Context context, e eVar) {
        super(new o0("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.f69567g = new Handler(Looper.getMainLooper());
        this.f69569i = new LinkedHashSet();
        this.f69568h = eVar;
    }

    public static synchronized p zzg(Context context) {
        try {
            if (f69566j == null) {
                f69566j = new p(context, j.f69551b);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f69566j;
    }

    public final synchronized void zzk(a aVar) {
        Iterator it = new LinkedHashSet(this.f69569i).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            throw null;
        }
        zze(aVar);
    }
}
