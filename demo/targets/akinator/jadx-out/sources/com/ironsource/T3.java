package com.ironsource;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class T3 {

    /* renamed from: a, reason: collision with root package name */
    private a f35474a = a.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList f35475b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private String f35476c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum a {
        NOT_READY,
        READY
    }

    public T3(String str) {
        this.f35476c = str;
    }

    public synchronized void a(Runnable runnable) {
        if (this.f35474a != a.READY) {
            this.f35475b.add(runnable);
        } else {
            runnable.run();
        }
    }

    public synchronized void b() {
        this.f35474a = a.NOT_READY;
    }

    public synchronized void c() {
        this.f35474a = a.READY;
    }

    public synchronized void a() {
        try {
            Object[] array = this.f35475b.toArray();
            for (int i10 = 0; i10 < array.length; i10++) {
                ((Runnable) array[i10]).run();
                array[i10] = null;
            }
            this.f35475b.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
