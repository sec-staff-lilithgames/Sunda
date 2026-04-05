package com.unity3d.services.core.misc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class Observable<T> {
    private final List<IObserver<T>> _observers = new ArrayList();

    public synchronized void notifyObservers(T t10) {
        Iterator<IObserver<T>> it = this._observers.iterator();
        while (it.hasNext()) {
            it.next().updated(t10);
        }
    }

    public synchronized void registerObserver(IObserver<T> iObserver) {
        if (this._observers.contains(iObserver)) {
            return;
        }
        this._observers.add(iObserver);
    }

    public synchronized void unregisterObserver(IObserver<T> iObserver) {
        if (this._observers.contains(iObserver)) {
            this._observers.remove(iObserver);
        }
    }
}
