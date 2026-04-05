package d5;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.b1;
import androidx.lifecycle.j3;
import androidx.lifecycle.m3;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import z.u1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class g extends b {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f51861c;

    /* renamed from: a, reason: collision with root package name */
    public final b1 f51862a;

    /* renamed from: b, reason: collision with root package name */
    public final f f51863b;

    public g(b1 b1Var, m3 m3Var) {
        this.f51862a = b1Var;
        e eVar = f.f51858c;
        this.f51863b = (f) new j3(m3Var, f.f51858c).get(f.class);
    }

    public final e5.c a(int i10, Bundle bundle, e5.c cVar) {
        f fVar = this.f51863b;
        try {
            fVar.f51860b = true;
            throw null;
        } catch (Throwable th2) {
            fVar.f51860b = false;
            throw th2;
        }
    }

    @Override // d5.b
    public void destroyLoader(int i10) {
        f fVar = this.f51863b;
        boolean z10 = fVar.f51860b;
        u1 u1Var = fVar.f51859a;
        if (z10) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (f51861c) {
            Log.v("LoaderManager", "destroyLoader in " + this + " of " + i10);
        }
    }

    @Override // d5.b
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f51863b.dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // d5.b
    public <D> e5.c getLoader(int i10) {
        f fVar = this.f51863b;
        if (fVar.f51860b) {
            throw new IllegalStateException("Called while creating a loader");
        }
        return null;
    }

    @Override // d5.b
    public boolean hasRunningLoaders() {
        u1 u1Var = this.f51863b.f51859a;
        int size = u1Var.size();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) u1Var.valueAt(i10);
            if (cVar.hasActiveObservers() && cVar.f51856l != null) {
                return true;
            }
        }
        return false;
    }

    @Override // d5.b
    public <D> e5.c initLoader(int i10, Bundle bundle, a aVar) {
        f fVar = this.f51863b;
        if (fVar.f51860b) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        if (f51861c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        a(i10, bundle, null);
        throw null;
    }

    @Override // d5.b
    public void markForRedelivery() {
        u1 u1Var = this.f51863b.f51859a;
        int size = u1Var.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c) u1Var.valueAt(i10)).h();
        }
    }

    @Override // d5.b
    public <D> e5.c restartLoader(int i10, Bundle bundle, a aVar) {
        f fVar = this.f51863b;
        if (fVar.f51860b) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
        if (f51861c) {
            Log.v("LoaderManager", "restartLoader in " + this + ": args=" + bundle);
        }
        a(i10, bundle, null);
        throw null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        w3.c.buildShortClassTag(this.f51862a, sb2);
        sb2.append(PtLatqAYjEFT.mdcSKqFxARdpLc);
        return sb2.toString();
    }
}
