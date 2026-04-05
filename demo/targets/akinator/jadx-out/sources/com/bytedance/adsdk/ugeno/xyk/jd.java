package com.bytedance.adsdk.ugeno.xyk;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class jd {

    /* renamed from: jd, reason: collision with root package name */
    private DataSetObserver f17966jd;
    private final DataSetObservable jpo = new DataSetObservable();

    public Parcelable jd() {
        return null;
    }

    public float jpo(int i10) {
        return 1.0f;
    }

    public abstract int jpo();

    public abstract boolean jpo(View view, Object obj);

    public void wqx() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.f17966jd;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.jpo.notifyChanged();
    }

    public int jpo(Object obj) {
        return -1;
    }

    public Object jpo(ViewGroup viewGroup, int i10) {
        return jpo((View) viewGroup, i10);
    }

    public void jpo(ViewGroup viewGroup, int i10, Object obj) {
        jpo((View) viewGroup, i10, obj);
    }

    @Deprecated
    public Object jpo(View view, int i10) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @Deprecated
    public void jpo(View view, int i10, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void jpo(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f17966jd = dataSetObserver;
        }
    }
}
