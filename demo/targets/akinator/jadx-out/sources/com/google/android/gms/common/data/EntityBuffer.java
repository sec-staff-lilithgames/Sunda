package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {
    private boolean zaa;
    private ArrayList zab;

    public EntityBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.zaa = false;
    }

    private final void zab() {
        synchronized (this) {
            try {
                if (!this.zaa) {
                    int count = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                    ArrayList arrayList = new ArrayList();
                    this.zab = arrayList;
                    if (count > 0) {
                        arrayList.add(0);
                        String primaryDataMarkerColumn = getPrimaryDataMarkerColumn();
                        String string = this.mDataHolder.getString(primaryDataMarkerColumn, 0, this.mDataHolder.getWindowIndex(0));
                        for (int i10 = 1; i10 < count; i10++) {
                            int windowIndex = this.mDataHolder.getWindowIndex(i10);
                            String string2 = this.mDataHolder.getString(primaryDataMarkerColumn, i10, windowIndex);
                            if (string2 == null) {
                                throw new NullPointerException("Missing value for markerColumn: " + primaryDataMarkerColumn + ", at row: " + i10 + ", for window: " + windowIndex);
                            }
                            if (!string2.equals(string)) {
                                this.zab.add(Integer.valueOf(i10));
                                string = string2;
                            }
                        }
                    }
                    this.zaa = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @ResultIgnorabilityUnspecified
    public final T get(int i10) {
        int iIntValue;
        int iIntValue2;
        zab();
        int iZaa = zaa(i10);
        int i11 = 0;
        if (i10 >= 0 && i10 != this.zab.size()) {
            if (i10 == this.zab.size() - 1) {
                iIntValue = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                iIntValue2 = ((Integer) this.zab.get(i10)).intValue();
            } else {
                iIntValue = ((Integer) this.zab.get(i10 + 1)).intValue();
                iIntValue2 = ((Integer) this.zab.get(i10)).intValue();
            }
            int i12 = iIntValue - iIntValue2;
            if (i12 == 1) {
                int iZaa2 = zaa(i10);
                int windowIndex = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getWindowIndex(iZaa2);
                String childDataMarkerColumn = getChildDataMarkerColumn();
                if (childDataMarkerColumn == null || this.mDataHolder.getString(childDataMarkerColumn, iZaa2, windowIndex) != null) {
                    i11 = 1;
                }
            } else {
                i11 = i12;
            }
        }
        return getEntry(iZaa, i11);
    }

    public String getChildDataMarkerColumn() {
        return null;
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public int getCount() {
        zab();
        return this.zab.size();
    }

    public abstract T getEntry(int i10, int i11);

    public abstract String getPrimaryDataMarkerColumn();

    public final int zaa(int i10) {
        if (i10 < 0 || i10 >= this.zab.size()) {
            throw new IllegalArgumentException(o2.k(i10, "Position ", " is out of bounds for this buffer"));
        }
        return ((Integer) this.zab.get(i10)).intValue();
    }
}
