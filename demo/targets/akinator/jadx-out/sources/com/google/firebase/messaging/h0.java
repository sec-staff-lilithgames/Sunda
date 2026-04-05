package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import io.odeeo.internal.h.vfsA.QCmNMSGd;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f29810a;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f29814e;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f29813d = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    public boolean f29815f = false;

    /* renamed from: b, reason: collision with root package name */
    public final String f29811b = "topic_operation_queue";

    /* renamed from: c, reason: collision with root package name */
    public final String f29812c = ",";

    public h0(SharedPreferences sharedPreferences, Executor executor) {
        this.f29810a = sharedPreferences;
        this.f29814e = executor;
    }

    public boolean add(String str) {
        boolean zAdd;
        if (TextUtils.isEmpty(str) || str.contains(this.f29812c)) {
            return false;
        }
        synchronized (this.f29813d) {
            zAdd = this.f29813d.add(str);
            if (zAdd && !this.f29815f) {
                this.f29814e.execute(new a2.s(this, 21));
            }
        }
        return zAdd;
    }

    public void beginTransaction() {
        this.f29815f = true;
    }

    public void clear() {
        synchronized (this.f29813d) {
            this.f29813d.clear();
            if (!this.f29815f) {
                this.f29814e.execute(new a2.s(this, 21));
            }
        }
    }

    public void commitTransaction() {
        this.f29815f = false;
        this.f29814e.execute(new a2.s(this, 21));
    }

    public String peek() {
        String str;
        synchronized (this.f29813d) {
            str = (String) this.f29813d.peek();
        }
        return str;
    }

    public boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f29813d) {
            zRemove = this.f29813d.remove(obj);
            if (zRemove && !this.f29815f) {
                this.f29814e.execute(new a2.s(this, 21));
            }
        }
        return zRemove;
    }

    public String serialize() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = this.f29813d.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            sb2.append(this.f29812c);
        }
        return sb2.toString();
    }

    public String serializeSync() {
        String strSerialize;
        synchronized (this.f29813d) {
            strSerialize = serialize();
        }
        return strSerialize;
    }

    public int size() {
        int size;
        synchronized (this.f29813d) {
            size = this.f29813d.size();
        }
        return size;
    }

    public List<String> toList() {
        ArrayList arrayList;
        synchronized (this.f29813d) {
            arrayList = new ArrayList(this.f29813d);
        }
        return arrayList;
    }

    public static h0 a(SharedPreferences sharedPreferences, Executor executor) {
        h0 h0Var = new h0(sharedPreferences, executor);
        synchronized (h0Var.f29813d) {
            try {
                h0Var.f29813d.clear();
                String string = h0Var.f29810a.getString(h0Var.f29811b, "");
                if (!TextUtils.isEmpty(string) && string.contains(h0Var.f29812c)) {
                    String[] strArrSplit = string.split(h0Var.f29812c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", QCmNMSGd.jppA);
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            h0Var.f29813d.add(str);
                        }
                    }
                    return h0Var;
                }
                return h0Var;
            } finally {
            }
        }
    }

    public String remove() {
        String str;
        synchronized (this.f29813d) {
            str = (String) this.f29813d.remove();
            if (str != null && !this.f29815f) {
                this.f29814e.execute(new a2.s(this, 21));
            }
        }
        return str;
    }
}
