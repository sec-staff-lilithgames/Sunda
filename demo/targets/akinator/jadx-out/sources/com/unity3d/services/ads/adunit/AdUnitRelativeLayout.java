package com.unity3d.services.ads.adunit;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class AdUnitRelativeLayout extends RelativeLayout {
    private InputEvent _lastInputEvent;
    private int _maxEvents;
    private final ArrayList<AdUnitMotionEvent> _motionEvents;
    private boolean _shouldCapture;

    public AdUnitRelativeLayout(Context context) {
        super(context);
        this._motionEvents = new ArrayList<>();
        this._maxEvents = 10000;
        this._shouldCapture = false;
    }

    public void clearCapture() {
        synchronized (this._motionEvents) {
            this._motionEvents.clear();
        }
    }

    public void endCapture() {
        this._shouldCapture = false;
    }

    public int getCurrentEventCount() {
        int size;
        synchronized (this._motionEvents) {
            size = this._motionEvents.size();
        }
        return size;
    }

    public SparseIntArray getEventCount(ArrayList<Integer> arrayList) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        synchronized (this._motionEvents) {
            try {
                Iterator<AdUnitMotionEvent> it = this._motionEvents.iterator();
                while (it.hasNext()) {
                    AdUnitMotionEvent next = it.next();
                    Iterator<Integer> it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Integer next2 = it2.next();
                            if (next.getAction() == next2.intValue()) {
                                sparseIntArray.put(next2.intValue(), sparseIntArray.get(next2.intValue(), 0) + 1);
                                break;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sparseIntArray;
    }

    public SparseArray<SparseArray<AdUnitMotionEvent>> getEvents(SparseArray<ArrayList<Integer>> sparseArray) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseArray<SparseArray<AdUnitMotionEvent>> sparseArray2 = new SparseArray<>();
        synchronized (this._motionEvents) {
            try {
                Iterator<AdUnitMotionEvent> it = this._motionEvents.iterator();
                while (it.hasNext()) {
                    AdUnitMotionEvent next = it.next();
                    ArrayList<Integer> arrayList = sparseArray.get(next.getAction());
                    if (arrayList != null) {
                        int iIntValue = arrayList.get(0).intValue();
                        if (sparseIntArray.get(next.getAction(), 0) == iIntValue) {
                            if (sparseArray2.get(next.getAction()) == null) {
                                sparseArray2.put(next.getAction(), new SparseArray<>());
                            }
                            sparseArray2.get(next.getAction()).put(iIntValue, next);
                            arrayList.remove(0);
                        }
                        sparseIntArray.put(next.getAction(), sparseIntArray.get(next.getAction()) + 1);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sparseArray2;
    }

    public InputEvent getLastInputEvent() {
        return this._lastInputEvent;
    }

    public int getMaxEventCount() {
        return this._maxEvents;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 6 || motionEvent.getActionMasked() == 5) {
            this._lastInputEvent = motionEvent;
        }
        if (this._shouldCapture && this._motionEvents.size() < this._maxEvents) {
            boolean z10 = (motionEvent.getFlags() & 1) != 0;
            synchronized (this._motionEvents) {
                this._motionEvents.add(new AdUnitMotionEvent(motionEvent.getActionMasked(), z10, motionEvent.getToolType(0), motionEvent.getSource(), motionEvent.getDeviceId(), motionEvent.getX(0), motionEvent.getY(0), motionEvent.getEventTime(), motionEvent.getPressure(0), motionEvent.getSize(0)));
            }
        }
        return false;
    }

    public void startCapture(int i10) {
        this._maxEvents = i10;
        this._shouldCapture = true;
    }
}
