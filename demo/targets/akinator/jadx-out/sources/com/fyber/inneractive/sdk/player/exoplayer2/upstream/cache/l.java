package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final File f25907a;

    /* renamed from: b, reason: collision with root package name */
    public final j f25908b;

    /* renamed from: d, reason: collision with root package name */
    public final i f25910d;

    /* renamed from: f, reason: collision with root package name */
    public a f25912f;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f25909c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f25911e = new HashMap();

    public l(File file, j jVar) {
        this.f25907a = file;
        this.f25908b = jVar;
        this.f25910d = new i(file);
        ConditionVariable conditionVariable = new ConditionVariable();
        new k(this, conditionVariable).start();
        conditionVariable.block();
    }

    public final synchronized m a(String str, long j10) {
        String str2;
        m mVarA;
        try {
            a aVar = this.f25912f;
            if (aVar != null) {
                throw aVar;
            }
            h hVar = (h) this.f25910d.f25896a.get(str);
            if (hVar == null) {
                str2 = str;
                mVarA = new m(str2, j10, -1L, C.TIME_UNSET, null);
            } else {
                str2 = str;
                while (true) {
                    mVarA = hVar.a(j10);
                    if (!mVarA.f25889d || mVarA.f25890e.length() == mVarA.f25888c) {
                        break;
                    }
                    a();
                }
            }
            if (!mVarA.f25889d) {
                if (this.f25909c.containsKey(str2)) {
                    return null;
                }
                this.f25909c.put(str2, mVarA);
                return mVarA;
            }
            h hVar2 = (h) this.f25910d.f25896a.get(str2);
            if (!hVar2.f25894c.remove(mVarA)) {
                throw new IllegalStateException();
            }
            int i10 = hVar2.f25892a;
            if (!mVarA.f25889d) {
                throw new IllegalStateException();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            File parentFile = mVarA.f25890e.getParentFile();
            long j11 = mVarA.f25887b;
            Pattern pattern = m.f25913g;
            File file = new File(parentFile, i10 + "." + j11 + "." + jCurrentTimeMillis + ".v3.exo");
            m mVar = new m(mVarA.f25886a, mVarA.f25887b, mVarA.f25888c, jCurrentTimeMillis, file);
            if (!mVarA.f25890e.renameTo(file)) {
                throw new a("Renaming of " + mVarA.f25890e + " to " + file + " failed.");
            }
            hVar2.f25894c.add(mVar);
            ArrayList arrayList = (ArrayList) this.f25911e.get(mVarA.f25886a);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    j jVar = (j) arrayList.get(size);
                    jVar.f25903a.remove(mVarA);
                    jVar.f25904b -= mVarA.f25888c;
                    jVar.f25903a.add(mVar);
                    jVar.f25904b += mVar.f25888c;
                    jVar.a(this, 0L);
                }
            }
            j jVar2 = this.f25908b;
            jVar2.f25903a.remove(mVarA);
            jVar2.f25904b -= mVarA.f25888c;
            jVar2.f25903a.add(mVar);
            jVar2.f25904b += mVar.f25888c;
            jVar2.a(this, 0L);
            return mVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(m mVar) {
        if (mVar != this.f25909c.remove(mVar.f25886a)) {
            throw new IllegalStateException();
        }
        notifyAll();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l.a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l):void");
    }

    public final void a(m mVar) {
        i iVar = this.f25910d;
        String str = mVar.f25886a;
        h hVarA = (h) iVar.f25896a.get(str);
        if (hVarA == null) {
            hVarA = iVar.a(str, -1L);
        }
        hVarA.f25894c.add(mVar);
        ArrayList arrayList = (ArrayList) this.f25911e.get(mVar.f25886a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                j jVar = (j) arrayList.get(size);
                jVar.f25903a.add(mVar);
                jVar.f25904b += mVar.f25888c;
                jVar.a(this, 0L);
            }
        }
        j jVar2 = this.f25908b;
        jVar2.f25903a.add(mVar);
        jVar2.f25904b += mVar.f25888c;
        jVar2.a(this, 0L);
    }

    public final void a(g gVar, boolean z10) throws Throwable {
        h hVar = (h) this.f25910d.f25896a.get(gVar.f25886a);
        if (hVar == null || !hVar.f25894c.remove(gVar)) {
            return;
        }
        gVar.f25890e.delete();
        if (z10 && hVar.f25894c.isEmpty()) {
            i iVar = this.f25910d;
            h hVar2 = (h) iVar.f25896a.remove(hVar.f25893b);
            if (hVar2 != null) {
                if (hVar2.f25894c.isEmpty()) {
                    iVar.f25897b.remove(hVar2.f25892a);
                    iVar.f25901f = true;
                } else {
                    throw new IllegalStateException();
                }
            }
            this.f25910d.b();
        }
        ArrayList arrayList = (ArrayList) this.f25911e.get(gVar.f25886a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                j jVar = (j) arrayList.get(size);
                jVar.f25903a.remove(gVar);
                jVar.f25904b -= gVar.f25888c;
            }
        }
        j jVar2 = this.f25908b;
        jVar2.f25903a.remove(gVar);
        jVar2.f25904b -= gVar.f25888c;
    }

    public final void a() throws Throwable {
        LinkedList linkedList = new LinkedList();
        Iterator it = this.f25910d.f25896a.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((h) it.next()).f25894c.iterator();
            while (it2.hasNext()) {
                g gVar = (g) it2.next();
                if (gVar.f25890e.length() != gVar.f25888c) {
                    linkedList.add(gVar);
                }
            }
        }
        Iterator it3 = linkedList.iterator();
        while (it3.hasNext()) {
            a((g) it3.next(), false);
        }
        this.f25910d.a();
        this.f25910d.b();
    }

    public final synchronized long a(String str) {
        h hVar;
        hVar = (h) this.f25910d.f25896a.get(str);
        return hVar == null ? -1L : hVar.f25895d;
    }
}
