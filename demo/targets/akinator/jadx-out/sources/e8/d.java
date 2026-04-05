package e8;

import android.util.Log;
import java.util.HashSet;
import r7.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class d implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f53918a = new HashSet();

    @Override // r7.f0
    public void debug(String str) {
        debug(str, null);
    }

    @Override // r7.f0
    public void error(String str, Throwable th2) {
        boolean z10 = r7.d.f83874a;
    }

    @Override // r7.f0
    public void warning(String str) {
        warning(str, null);
    }

    @Override // r7.f0
    public void debug(String str, Throwable th2) {
        boolean z10 = r7.d.f83874a;
    }

    @Override // r7.f0
    public void warning(String str, Throwable th2) {
        HashSet hashSet = f53918a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th2);
        hashSet.add(str);
    }
}
