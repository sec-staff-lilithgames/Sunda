package androidx.localbroadcastmanager.content;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.Log;
import androidx.datastore.preferences.protobuf.i3;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.k0;
import com.android.billingclient.api.BillingResult;
import com.bumptech.glide.manager.n;
import com.bumptech.glide.manager.p;
import com.bumptech.glide.manager.q;
import com.bumptech.glide.manager.t;
import com.bumptech.glide.u;
import com.digidust.elokence.akinator.freemium.R;
import ei.f;
import hi.j;
import j9.s;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import r8.e;
import u3.l;
import ug.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public Object f6756a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6757b;

    public b(BillingResult billingResult, ArrayList arrayList) {
        this.f6756a = arrayList;
        this.f6757b = billingResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.localbroadcastmanager.content.b a(android.content.Context r5) throws java.io.IOException {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L27 java.lang.Error -> L2a java.io.IOException -> L2c
            androidx.localbroadcastmanager.content.b r2 = new androidx.localbroadcastmanager.content.b     // Catch: java.nio.channels.OverlappingFileLockException -> L21 java.lang.Error -> L23 java.io.IOException -> L25
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L21 java.lang.Error -> L23 java.io.IOException -> L25
            return r2
        L21:
            r2 = move-exception
            goto L36
        L23:
            r2 = move-exception
            goto L36
        L25:
            r2 = move-exception
            goto L36
        L27:
            r2 = move-exception
        L28:
            r0 = r1
            goto L36
        L2a:
            r2 = move-exception
            goto L28
        L2c:
            r2 = move-exception
            goto L28
        L2e:
            r2 = move-exception
        L2f:
            r5 = r1
            r0 = r5
            goto L36
        L32:
            r2 = move-exception
            goto L2f
        L34:
            r2 = move-exception
            goto L2f
        L36:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L42
            r0.release()     // Catch: java.io.IOException -> L42
        L42:
            if (r5 == 0) goto L47
            r5.close()     // Catch: java.io.IOException -> L47
        L47:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.localbroadcastmanager.content.b.a(android.content.Context):androidx.localbroadcastmanager.content.b");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public nd.e b(java.lang.String r14) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.localbroadcastmanager.content.b.b(java.lang.String):nd.e");
    }

    public u c(Context context, com.bumptech.glide.c cVar, k0 k0Var, FragmentManager fragmentManager, boolean z10) {
        s.assertMainThread();
        s.assertMainThread();
        HashMap map = (HashMap) this.f6756a;
        u uVar = (u) map.get(k0Var);
        if (uVar != null) {
            return uVar;
        }
        n nVar = new n(k0Var);
        u uVarBuild = ((com.bumptech.glide.manager.s) ((t) this.f6757b)).build(cVar, nVar, new q(this, fragmentManager), context);
        map.put(k0Var, uVarBuild);
        nVar.addListener(new p(this, k0Var));
        if (z10) {
            uVarBuild.onStart();
        }
        return uVarBuild;
    }

    public void d(l lVar) {
        Executor executor = (Executor) this.f6757b;
        u3.p pVar = (u3.p) this.f6756a;
        int i10 = lVar.f87810b;
        if (i10 == 0) {
            executor.execute(new u3.a(pVar, lVar.f87809a));
        } else {
            executor.execute(new u3.b(pVar, i10));
        }
    }

    public void e(String str) {
        e eVar;
        synchronized (this) {
            try {
                eVar = (e) j9.q.checkNotNull(((HashMap) this.f6756a).get(str));
                int i10 = eVar.f84014b;
                if (i10 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + eVar.f84014b);
                }
                int i11 = i10 - 1;
                eVar.f84014b = i11;
                if (i11 == 0) {
                    e eVar2 = (e) ((HashMap) this.f6756a).remove(str);
                    if (!eVar2.equals(eVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + eVar + ", but actually removed: " + eVar2 + ", safeKey: " + str);
                    }
                    i3 i3Var = (i3) this.f6757b;
                    synchronized (i3Var.f5906a) {
                        try {
                            if (i3Var.f5906a.size() < 10) {
                                i3Var.f5906a.offer(eVar2);
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        eVar.f84013a.unlock();
    }

    public void f() throws IOException {
        try {
            ((FileLock) this.f6757b).release();
            ((FileChannel) this.f6756a).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    public /* synthetic */ b(Object obj, Object obj2) {
        this.f6756a = obj;
        this.f6757b = obj2;
    }

    public b(Context context, int i10) throws Resources.NotFoundException {
        switch (i10) {
            case 11:
                this.f6757b = null;
                this.f6756a = context;
                break;
            default:
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(ug.c.resolveOrThrow(context, R.attr.materialCalendarStyle, com.google.android.material.datepicker.s.class.getCanonicalName()), uf.a.f88474v);
                com.google.android.material.datepicker.b.a(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
                com.google.android.material.datepicker.b.a(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
                com.google.android.material.datepicker.b.a(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
                com.google.android.material.datepicker.b.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
                ColorStateList colorStateList = d.getColorStateList(context, typedArrayObtainStyledAttributes, 7);
                this.f6756a = com.google.android.material.datepicker.b.a(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
                com.google.android.material.datepicker.b.a(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
                this.f6757b = com.google.android.material.datepicker.b.a(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
                new Paint().setColor(colorStateList.getDefaultColor());
                typedArrayObtainStyledAttributes.recycle();
                break;
        }
    }

    public b(ei.e eVar) throws Resources.NotFoundException, IOException {
        Context context = eVar.f54401a;
        int resourcesIdentifier = j.getResourcesIdentifier(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (resourcesIdentifier != 0) {
            this.f6756a = "Unity";
            String string = context.getResources().getString(resourcesIdentifier);
            this.f6757b = string;
            f.getLogger().v("Unity Editor version is: " + string);
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.f6756a = "Flutter";
                this.f6757b = null;
                f.getLogger().v("Development platform is: Flutter");
                return;
            } catch (IOException unused) {
            }
        }
        this.f6756a = null;
        this.f6757b = null;
    }

    public b(int i10) {
        switch (i10) {
            case 13:
                this.f6756a = new HashMap();
                this.f6757b = new HashMap();
                break;
            case 14:
                this.f6756a = new HashMap();
                this.f6757b = new i3(2);
                break;
            default:
                this.f6756a = new AtomicLong();
                this.f6757b = new AtomicLong();
                break;
        }
    }
}
