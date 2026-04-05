package com.bumptech.glide.manager;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final Set f16653a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f16654b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public boolean f16655c;

    public boolean clearAndRemove(f9.e eVar) {
        boolean z10 = true;
        if (eVar == null) {
            return true;
        }
        boolean zRemove = this.f16653a.remove(eVar);
        if (!this.f16654b.remove(eVar) && !zRemove) {
            z10 = false;
        }
        if (z10) {
            eVar.clear();
        }
        return z10;
    }

    public void clearRequests() {
        Iterator it = j9.s.getSnapshot(this.f16653a).iterator();
        while (it.hasNext()) {
            clearAndRemove((f9.e) it.next());
        }
        this.f16654b.clear();
    }

    public boolean isPaused() {
        return this.f16655c;
    }

    public void pauseAllRequests() {
        this.f16655c = true;
        for (f9.e eVar : j9.s.getSnapshot(this.f16653a)) {
            if (eVar.isRunning() || eVar.isComplete()) {
                eVar.clear();
                this.f16654b.add(eVar);
            }
        }
    }

    public void pauseRequests() {
        this.f16655c = true;
        for (f9.e eVar : j9.s.getSnapshot(this.f16653a)) {
            if (eVar.isRunning()) {
                eVar.pause();
                this.f16654b.add(eVar);
            }
        }
    }

    public void restartRequests() {
        for (f9.e eVar : j9.s.getSnapshot(this.f16653a)) {
            if (!eVar.isComplete() && !eVar.isCleared()) {
                eVar.clear();
                if (this.f16655c) {
                    this.f16654b.add(eVar);
                } else {
                    eVar.begin();
                }
            }
        }
    }

    public void resumeRequests() {
        this.f16655c = false;
        for (f9.e eVar : j9.s.getSnapshot(this.f16653a)) {
            if (!eVar.isComplete() && !eVar.isRunning()) {
                eVar.begin();
            }
        }
        this.f16654b.clear();
    }

    public void runRequest(f9.e eVar) {
        this.f16653a.add(eVar);
        if (!this.f16655c) {
            eVar.begin();
            return;
        }
        eVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f16654b.add(eVar);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{numRequests=");
        sb2.append(this.f16653a.size());
        sb2.append(", isPaused=");
        return a.b.q(sb2, this.f16655c, "}");
    }
}
